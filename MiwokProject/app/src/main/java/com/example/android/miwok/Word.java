package com.example.android.miwok;

/**
 * Created by janda_000 on 2/12/2017.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResouceId;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation  = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResouceId = imageResourceID;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResouceId() { return mImageResouceId; }

}