package com.vidyakalkendra.languagetranslator;

public class Word {
    private String englishWord;
    private String miworkWord;
    private int imageResourceId;
    private int audioResourceId;

    public String getEnglishWord() {
        return englishWord;
    }

    public String getMiworkWord() {
        return miworkWord;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }

    Word(String englishWord, String miworkWord, int audioResourceId){
        this.englishWord = englishWord;
        this.miworkWord = miworkWord;
        this.audioResourceId = audioResourceId;
    }

    Word(String englishWord, String miworkWord, int imageResourceId, int audioResourceId){
        this.englishWord = englishWord;
        this.miworkWord = miworkWord;
        this.imageResourceId = imageResourceId;
        this.audioResourceId = audioResourceId;
    }
}
