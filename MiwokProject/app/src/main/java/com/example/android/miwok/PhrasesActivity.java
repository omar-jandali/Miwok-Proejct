package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnE oyaase'nE"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michEksEs?"));
        words.add(new Word("I'm feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "EEnEs'aa?"));
        words.add(new Word("Yes, I'm coming.", "hEEE'EEnEm"));
        words.add(new Word("I'm coming.", "EEnEm"));
        words.add(new Word("Let's go.", "yoowutis"));
        words.add(new Word("Come here.", "anni'nem"));

        WordAdapter numberAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(numberAdapter);

    }
}
