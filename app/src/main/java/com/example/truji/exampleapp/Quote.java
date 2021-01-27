package com.example.truji.exampleapp;

/**
 * Created by truji on 1/27/2021.
 */

public class Quote {
    String author;
    String quote;

    Quote(String quote, String author){
        this.quote = quote;
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getQuote(){
        return this.quote;
    }

}
