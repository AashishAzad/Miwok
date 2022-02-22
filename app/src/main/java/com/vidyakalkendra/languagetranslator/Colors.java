package com.vidyakalkendra.languagetranslator;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.app_src_main_res_raw_color_red));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.app_src_main_res_raw_color_mustard_yellow));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.app_src_main_res_raw_color_dusty_yellow));
        words.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.app_src_main_res_raw_color_green));
        words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.app_src_main_res_raw_color_brown));
        words.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.app_src_main_res_raw_color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black, R.raw.app_src_main_res_raw_color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.app_src_main_res_raw_color_white));

        WordAdapter wordAdapter = new WordAdapter(this,words);

        ListView lv = findViewById(R.id.list);

        lv.setAdapter(wordAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);
                mediaPlayer = MediaPlayer.create(Colors.this,word.getAudioResourceId());
                mediaPlayer.start();
            }
        });

    }
}
