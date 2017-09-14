package com.liuruichao;

import lombok.extern.log4j.Log4j2;

/**
 * HttpServer
 *
 * @author liuruichao
 * Created on 2017/9/14 13:27
 */
@Log4j2
public class HttpServer {
    public void start(int port) {
        log.info("start server, port: {}.", port);
    }
}