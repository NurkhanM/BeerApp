package com.md.nurkhan.util;

import android.util.Log;

public class Logger {
    private static String TAG = "dada";
    public void d(String massage){
        Log.d(TAG, massage);

    }
    public void e(Exception exseption){
        Log.e(TAG, exseption.getMessage(), exseption);
    }
}
