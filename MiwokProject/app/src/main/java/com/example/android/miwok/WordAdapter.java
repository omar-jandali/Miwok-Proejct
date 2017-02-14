package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by janda_000 on 2/13/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View listedView, ViewGroup parent){
        View listItemView = listedView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_words);
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_words);
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.item_icon);

        miwokTextView.setText(currentWord.getMiwokTranslation());
        englishTextView.setText(currentWord.getDefaultTranslation());
        iconView.setImageResource(currentWord.getImageResouceId());

        return listItemView;

    }
}
