package com.rana.plugin;

import android.util.Log;

public class MyCustomPlugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
