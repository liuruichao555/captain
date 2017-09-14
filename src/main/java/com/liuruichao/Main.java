package com.liuruichao;

/**
 * Main
 *
 * @author liuruichao
 * Created on 2017/9/14 13:03
 */
public class Main {
    public static void main(String[] args) {
        HttpServer httpServer = new HttpServer();
        httpServer.start(8888);
    }
}
