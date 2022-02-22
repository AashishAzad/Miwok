package com.vidyakalkendra.languagetranslator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    ArrayList<Word> arrayList;

    public WordAdapter(Context context, ArrayList<Word> arrayList) {
        super(context, 0, arrayList);
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_data, parent, false);
        }

            TextView englishWord = listItemView.findViewById(R.id.englishWord);
            TextView miwokWord = listItemView.findViewById(R.id.miwokWord);
            ImageView imageView = listItemView.findViewById(R.id.imageBox);

        Word currentWord = getItem(position);

        englishWord.setText(currentWord.getEnglishWord());
        miwokWord.setText(currentWord.getMiworkWord());
        imageView.setImageResource(currentWord.getImageResourceId());

        return listItemView;
    }
}
