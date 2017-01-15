package com.example.elaina.magic8weather;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class LocalData {

    SharedPreferences prefs;

    public LocalData(Context context){
        prefs = context.getSharedPreferences("PREF_NAME", Context.MODE_PRIVATE);
        //prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // default city
    String getCity(){
        return prefs.getString("city", "Richmond,US");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).apply();
    }

//    public void clear(){
//        prefs.edit().clear().commit();
//    }
}
