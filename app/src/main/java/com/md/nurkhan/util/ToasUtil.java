package com.md.nurkhan.util;

import android.content.Context;
import android.widget.Toast;

public class ToasUtil {
    public static void showShort(Context context, String massage) {
        Toast.makeText(context, massage, Toast.LENGTH_SHORT).show();
    }
    public static void showLong(Context context, String massage) {
        Toast.makeText(context, massage, Toast.LENGTH_LONG).show();
    }
}
