package com.vidyakalkendra.languagetranslator;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbers = new ArrayList<>();
        numbers.add(new Word("one","lutti", R.drawable.number_one, R.raw.app_src_main_res_raw_number_one));
        numbers.add(new Word("two","otiiko", R.drawable.number_two, R.raw.app_src_main_res_raw_number_two));
        numbers.add(new Word("three","tolookosu", R.drawable.number_three, R.raw.app_src_main_res_raw_number_three));
        numbers.add(new Word("four","oyyisa", R.drawable.number_four, R.raw.app_src_main_res_raw_number_four));
        numbers.add(new Word("five","massokka", R.drawable.number_five, R.raw.app_src_main_res_raw_number_five));
        numbers.add(new Word("six","temmokka", R.drawable.number_six, R.raw.app_src_main_res_raw_number_six));
        numbers.add(new Word("seven","kenekaku", R.drawable.number_seven, R.raw.app_src_main_res_raw_number_seven));
        numbers.add(new Word("eight","kawinta", R.drawable.number_eight, R.raw.app_src_main_res_raw_number_eight));
        numbers.add(new Word("nine","wo’e", R.drawable.number_nine, R.raw.app_src_main_res_raw_number_nine));
        numbers.add(new Word("ten","na’aacha", R.drawable.number_ten, R.raw.app_src_main_res_raw_number_ten));

        WordAdapter wordAdapter = new WordAdapter(this,numbers);

        ListView lv = findViewById(R.id.list);

        lv.setAdapter(wordAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = numbers.get(position);
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(Numbers.this, word.getAudioResourceId());
                mediaPlayer.start();
            }
        });

    }


    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        if (mediaPlayer != null) {

            mediaPlayer.release();

            mediaPlayer = null;
        }
    }
}
