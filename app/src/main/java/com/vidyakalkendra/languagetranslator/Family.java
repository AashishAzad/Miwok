package com.vidyakalkendra.languagetranslator;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Family extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father", "әpә", R.drawable.family_father, R.raw.app_src_main_res_raw_family_father));
        words.add(new Word("mother", "әṭa", R.drawable.family_mother, R.raw.app_src_main_res_raw_family_mother));
        words.add(new Word("son", "angsi", R.drawable.family_son, R.raw.app_src_main_res_raw_family_son));
        words.add(new Word("daughter", "tune", R.drawable.family_daughter, R.raw.app_src_main_res_raw_family_daughter));
        words.add(new Word("older brother", "taachi", R.drawable.family_older_brother, R.raw.app_src_main_res_raw_family_older_brother));
        words.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.app_src_main_res_raw_family_younger_brother));
        words.add(new Word("older sister", "teṭe", R.drawable.family_older_sister, R.raw.app_src_main_res_raw_family_older_sister));
        words.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.app_src_main_res_raw_family_younger_sister));
        words.add(new Word("grandmother ", "ama", R.drawable.family_grandmother, R.raw.app_src_main_res_raw_family_grandmother));
        words.add(new Word("grandfather", "paapa", R.drawable.family_grandfather, R.raw.app_src_main_res_raw_family_grandfather));

        WordAdapter wordAdapter = new WordAdapter(this,words);

        ListView lv = findViewById(R.id.list);

        lv.setAdapter(wordAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);
                mediaPlayer = MediaPlayer.create(Family.this,word.getAudioResourceId());
                mediaPlayer.start();
            }
        });

    }
}
