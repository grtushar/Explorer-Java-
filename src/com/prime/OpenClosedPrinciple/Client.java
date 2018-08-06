package com.prime.OpenClosedPrinciple;

/**
 * Created by Golam Rahman Tushar on 7/31/2018.
 */
public class Client {
    public static void main(String[] args) {
        AbstractServer server = new Server();

        server.getConnection();
        server.connect();
        server.query();
    }
}
