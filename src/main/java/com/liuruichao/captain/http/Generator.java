package com.liuruichao.captain.http;

import java.io.IOException;
import java.nio.Buffer;

/**
 * Generator
 *
 * @author liuruichao
 * Created on 2017/10/17 14:08
 */
public interface Generator {
    boolean LAST = true;

    boolean MORE = false;

    void addContent(Buffer content, boolean last) throws IOException;

    boolean addContent(byte b) throws IOException;

    void complete() throws IOException;
}
