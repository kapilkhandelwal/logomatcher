package com.example.logomatcher;

import android.widget.ImageView;

import com.example.logomatcher.Logo;

import org.json.JSONObject;

import java.util.ArrayList;

public class LogoMatcher {
    private ArrayList<Logo> logos;
    private final String jsonString = "FINAL.json";

    LogoMatcher() {
        logos = parseJSON();
    }

    private ArrayList<Logo> parseJSON() {
        ArrayList<Logo> arLogo = new ArrayList<Logo>();
        JSONObject jsonObj;
        return arLogo;
    }




}