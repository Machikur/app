package com.example;

import static spark.Spark.*;

public class Spark {

    public static void main(String[] args) {
        port(8080);
        get("/", ((request, response) -> "Get Path"));
        get("/aaa", ((request, response) -> "Get 2 Path"));
    }
}
