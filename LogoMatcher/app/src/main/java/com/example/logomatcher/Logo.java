package com.example.logomatcher;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Logo extends AsyncTask<String, Void, Bitmap>{

    String mActualName;
    ImageView bmImage;
    String shuffledName;
    String url;
    ArrayList<TextView> tvArray;
    ArrayList<TextView> answerTVArray;



    public Logo(ImageView bmImage, String actualName, ArrayList<TextView> tvArray, ArrayList<TextView> answerTVArray) {
        this.bmImage = bmImage;
        this.mActualName = actualName;
        shuffledName = shuffleString(actualName);
        this.tvArray = tvArray;
        this.answerTVArray = answerTVArray;
    }

    protected Bitmap doInBackground(String... urls) {
        String url = urls[0];
        Bitmap mIcon = null;
        try {
            InputStream in = new java.net.URL(url).openStream();
            mIcon = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
        }
        return mIcon;
    }

    protected void onPostExecute(Bitmap result) {
        bmImage.setImageBitmap(result);
    }

    public  String shuffleString(String string)
    {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        String shuffled = "";
        for (String letter : letters) {
            shuffled += letter;
        }
        return shuffled;
    }

    //TODO: Put shuffled string one-by-one to tvArray views and set Visilble
    //TODO: Put actualName string one by one to answerTVArray, keep invisible and make them visible on onClick of tcArray text views.
}
