package com.prime.OpenClosedPrinciple;

/**
 * Created by Golam Rahman Tushar on 7/31/2018.
 */
public class Server implements AbstractServer {
    @Override
    public void getConnection() {
        System.out.println("inside getConnection");
    }

    @Override
    public void connect() {
        System.out.println("inside connect");
    }

    @Override
    public void query() {
        System.out.println("inside query");
    }
}
