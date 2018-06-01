package com.liuruichao.handler;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import lombok.extern.log4j.Log4j2;

/**
 * DefaultHandler
 *
 * @author liuruichao
 * Created on 2017/10/17 14:14
 */
@Log4j2
public class DefaultHandler extends SimpleChannelInboundHandler<FullHttpRequest> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, FullHttpRequest fullHttpRequest) throws Exception {
        if (!fullHttpRequest.getDecoderResult().isSuccess()) {
            log.debug("fullHttpRequest decoder error");
            sendError(channelHandlerContext, HttpResponseStatus.BAD_REQUEST);
            return;
        }
        final String uri = fullHttpRequest.uri();
    }

    private void sendError(ChannelHandlerContext ctx, HttpResponseStatus status) {
        FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, status);
        response.headers().set("Content-Type", "text/html; charset=utf-8");
        ByteBuf buffer = Unpooled.copiedBuffer(("<body>Failure: " + status.toString() + "</body>").getBytes());
        response.content().writeBytes(buffer);
        buffer.release();
        ctx.writeAndFlush(response).addListener(ChannelFutureListener.CLOSE);
    }
}
