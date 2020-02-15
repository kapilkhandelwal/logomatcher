package com.example.logomatcher;

import android.widget.ImageView;
import android.widget.TextView;

import com.example.logomatcher.Logo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class LogoMatcher {
    private int currentLogo = 0;
    ArrayList<TextView> textViewArray;
    ArrayList<TextView> answerTextViewArray;
    ImageView imageView;
    JSONArray jsonArray;

    LogoMatcher(ArrayList<TextView> textViewArray, ArrayList<TextView> answerTextViewArray, ImageView imageView) {
        this.textViewArray = textViewArray;
        this.answerTextViewArray = answerTextViewArray;
        this.imageView = imageView;
        try {
            jsonArray = new JSONArray("JSON STRING"); //TODO: Parse JSON file to string
        } catch(JSONException e) {

        }

        parseElementAndDisplayUI();
    }

    private void parseElementAndDisplayUI() {
        try {
            JSONObject jsonObject = jsonArray.getJSONObject(currentLogo);
             new Logo(imageView, jsonObject.getString("name"),
                     textViewArray, answerTextViewArray).execute(jsonObject.getString("imgUrl"));
        } catch (JSONException e) {
        }
        return ;
    }

    public void next() {
        currentLogo++;
        parseElementAndDisplayUI();

    }




}
