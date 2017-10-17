package com.liuruichao.captain.http;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;

/**
 * HttpContent
 *
 * @author liuruichao
 * Created on 2017/10/17 14:03
 */
public interface HttpContent {
    Buffer getContentType();

    Buffer getLastModified();

    Buffer getBuffer();

    long getContentLength();

    InputStream getInputStream() throws IOException;

    void release();
}