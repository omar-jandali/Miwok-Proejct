package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "wetitti", R.drawable.color_red));
        words.add(new Word("green", "chololli", R.drawable.color_green));
        words.add(new Word("brown", "takaakki", R.drawable.color_brown));
        words.add(new Word("gray", "topoppi", R.drawable.color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white));
        words.add(new Word("dusty yellow", "topiisE", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow", "chiwiitE", R.drawable.color_mustard_yellow));

        WordAdapter numberAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(numberAdapter);

    }
}