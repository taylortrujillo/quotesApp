package com.example.truji.exampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class homepage extends AppCompatActivity {


    public List<Quote> quotes = new ArrayList<>();
    Integer marker = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        quotes.add(new Quote("\"Knowing yourself is the beginning of all wisdom.\"", "- Aristotle"));
        quotes.add(new Quote("\"It is better to change an opinion than to persist in a wrong one.\"", "- Socrates"));
        quotes.add(new Quote("\"Give me 6 hours to cut down a tree and I will spend the first 5 sharpening the axe.\"", "- Abraham Lincoln"));
        quotes.add(new Quote("\"Whenever you find yourself on the side of the majority, it's time to pause and reflect.\"", "- Mark Twain"));
        quotes.add(new Quote("\"The only person you are destined to become, is the person you decide to be.\"", "- Ralph Waldo Emerson"));
        quotes.add(new Quote("\"A man cannot be comfortable without his own approval\"", "- Mark Twain"));
        quotes.add(new Quote("\"We grow fearless when we do the things we fear.\"", "- Robin Sharma"));

        setContentView(R.layout.activity_homepage);
        Quote quote = quotes.get(marker);
        ((TextView)findViewById(R.id.quote)).setText(quote.getQuote());
        ((TextView)findViewById(R.id.author)).setText(quote.getAuthor());
        marker = (marker + 1) % quotes.size();
    }

    public void nextPage(View view){
        Quote quote = quotes.get(marker);
        ((TextView)findViewById(R.id.quote)).setText(quote.getQuote());
        ((TextView)findViewById(R.id.author)).setText(quote.getAuthor());
        marker = (marker + 1) % quotes.size();

    }
}
