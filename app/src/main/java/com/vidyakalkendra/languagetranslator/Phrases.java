package com.vidyakalkendra.languagetranslator;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus", R.raw.app_src_main_res_raw_phrase_where_are_you_going));
        words.add(new Word("What is your name?", "tinnә oyaase'nә", R.raw.app_src_main_res_raw_phrase_what_is_your_name));
        words.add(new Word("My name is...", "oyaaset...", R.raw.app_src_main_res_raw_phrase_my_name_is));
        words.add(new Word("How are you feeling?", "michәksәs?", R.raw.app_src_main_res_raw_phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.", "kuchi achit", R.raw.app_src_main_res_raw_phrase_im_feeling_good));
        words.add(new Word("Are you coming?", "әәnәs'aa?", R.raw.app_src_main_res_raw_phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", R.raw.app_src_main_res_raw_phrase_yes_im_coming));
        words.add(new Word("I’m coming.", "әәnәm", R.raw.app_src_main_res_raw_phrase_im_coming));
        words.add(new Word("Let’s go.", "yoowutis", R.raw.app_src_main_res_raw_phrase_lets_go));
        words.add(new Word("Come here.", "әnni'nem", R.raw.app_src_main_res_raw_phrase_come_here));

        WordAdapter wordAdapter = new WordAdapter(this,words);

        ListView lv = findViewById(R.id.list);

        lv.setAdapter(wordAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);
                mediaPlayer = MediaPlayer.create(Phrases.this,word.getAudioResourceId());
                mediaPlayer.start();
            }
        });

    }
}
