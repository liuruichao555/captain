package com.liuruichao.captain.http;

/**
 * HttpTokens
 *
 * @author liuruichao
 * Created on 2017/10/17 14:06
 */
public interface HttpTokens {
    byte COLON = (byte) ':';

    byte SPACE = 0x20;

    byte CARRIAGE_RETURN = 0x0D;

    byte LINE_FEED = 0x0A;

    byte[] CRLF = {CARRIAGE_RETURN, LINE_FEED};

    byte SEMI_COLON = (byte) ';';

    byte TAB = 0x09;

    int SELF_DEFINING_CONTENT = -4;

    int UNKNOWN_CONTENT = -3;

    int CHUNKED_CONTENT = -2;

    int EOF_CONTENT = -1;

    int NO_CONTENT = 0;
}