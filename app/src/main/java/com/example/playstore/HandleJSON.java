package com.example.playstore;

import android.content.Context;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class HandleJSON {

    private Context context;

    public HandleJSON(Context context) {
        this.context = context;
    }


    public ArrayList<Apps_item> getAppItem() {
        ArrayList<Apps_item> items = new ArrayList<>();
        String JSON = getJSONfile1("app");
        try {


            JSONObject raw = new JSONObject(JSON);
            JSONArray array = raw.getJSONArray("app_item");

            for (int i = 0; i < array.length(); i++) {
                JSONObject app_detail = array.getJSONObject(i);

                items.add(new Apps_item(R.drawable.tom1, app_detail.getString("name"), app_detail.getInt("size")));
            }
        } catch (JSONException e) {
            Log.d("Json", e.toString());
        }
        return items;
    }

    public ArrayList<Apps_item> getGameSuggestedItem() {
        ArrayList<Apps_item> items = new ArrayList<>();
        String JSON = getJSONfile1("game_suggested");
        try {


            JSONObject raw = new JSONObject(JSON);
            JSONArray array = raw.getJSONArray("app_item");

            for (int i = 0; i < array.length(); i++) {
                JSONObject app_detail = array.getJSONObject(i);

                items.add(new Apps_item(R.drawable.tom1, app_detail.getString("name"), app_detail.getInt("size")));
            }
        } catch (JSONException e) {
            Log.d("Json", e.toString());
        }
        return items;
    }

    public ArrayList<Apps_item> getGameNonStopItem() {
        ArrayList<Apps_item> items = new ArrayList<>();
        String JSON = getJSONfile1("game_non_stop");
        try {


            JSONObject raw = new JSONObject(JSON);
            JSONArray array = raw.getJSONArray("app_item");

            for (int i = 0; i < array.length(); i++) {
                JSONObject app_detail = array.getJSONObject(i);

                items.add(new Apps_item(R.drawable.tom, app_detail.getString("name"), app_detail.getInt("size")));
            }
        } catch (JSONException e) {
            Log.d("Json", e.toString());
        }
        return items;
    }

    public ArrayList<Apps_item> getGameSpotLightItem() {
        ArrayList<Apps_item> items = new ArrayList<>();
        String JSON = getJSONfile1("game_spot_light");
        try {


            JSONObject raw = new JSONObject(JSON);
            JSONArray array = raw.getJSONArray("app_item");

            for (int i = 0; i < array.length(); i++) {
                JSONObject app_detail = array.getJSONObject(i);

                items.add(new Apps_item(R.drawable.tom2, app_detail.getString("name"), app_detail.getInt("size")));
            }
        } catch (JSONException e) {
            Log.d("Json", e.toString());
        }
        return items;
    }

    public ArrayList<Apps_item> getGameForYou2Item() {
        ArrayList<Apps_item> items = new ArrayList<>();
        String JSON = getJSONfile1("for_you_2");
        try {


            JSONObject raw = new JSONObject(JSON);
            JSONArray array = raw.getJSONArray("app_item");

            for (int i = 0; i < array.length(); i++) {
                JSONObject app_detail = array.getJSONObject(i);

                items.add(new Apps_item(R.drawable.tom1, app_detail.getString("name"), app_detail.getInt("size")));
            }
        } catch (JSONException e) {
            Log.d("Json", e.toString());
        }
        return items;
    }

    public ArrayList<Apps_item> getGameForYou3Item() {
        ArrayList<Apps_item> items = new ArrayList<>();
        String JSON = getJSONfile1("for_you_3");
        try {


            JSONObject raw = new JSONObject(JSON);
            JSONArray array = raw.getJSONArray("app_item");

            for (int i = 0; i < array.length(); i++) {
                JSONObject app_detail = array.getJSONObject(i);

                items.add(new Apps_item(R.drawable.tom2, app_detail.getString("name"), app_detail.getInt("size")));
            }
        } catch (JSONException e) {
            Log.d("Json", e.toString());
        }
        return items;
    }

    public ArrayList<Apps_item> getAppTopFreeItem() {
        ArrayList<Apps_item> items = new ArrayList<>();
        String JSON = getJSONfile1("top_free");
        try {


            JSONObject raw = new JSONObject(JSON);
            JSONArray array = raw.getJSONArray("app_item");

            for (int i = 0; i < array.length(); i++) {
                JSONObject app_detail = array.getJSONObject(i);

                items.add(new Apps_item(R.drawable.tom, app_detail.getString("name"), app_detail.getInt("size")));
            }
        } catch (JSONException e) {
            Log.d("Json", e.toString());
        }
        return items;
    }

    public ArrayList<Apps_item> getAppSuggestedItem() {
        ArrayList<Apps_item> items = new ArrayList<>();
        String JSON = getJSONfile1("app_suggested");
        try {


            JSONObject raw = new JSONObject(JSON);
            JSONArray array = raw.getJSONArray("app_item");

            for (int i = 0; i < array.length(); i++) {
                JSONObject app_detail = array.getJSONObject(i);

                items.add(new Apps_item(R.drawable.tom1, app_detail.getString("name"), app_detail.getInt("size")));
            }
        } catch (JSONException e) {
            Log.d("Json", e.toString());
        }
        return items;
    }

    public ArrayList<Apps_item> getAppItem2() {
        ArrayList<Apps_item> items = new ArrayList<>();
        String JSON = getJSONfile1("app");
        try {


            JSONObject raw = new JSONObject(JSON);
            JSONArray array = raw.getJSONArray("app_item");

            for (int i = 0; i < array.length(); i++) {
                JSONObject app_detail = array.getJSONObject(i);

                items.add(new Apps_item(R.drawable.tom2, app_detail.getString("name"), app_detail.getInt("size")));
            }
        } catch (JSONException e) {
            Log.d("Json", e.toString());
        }
        return items;
    }

    public ArrayList<Today_item> getTodayItem() {
        ArrayList<Today_item> items = new ArrayList<>();
        String JSON = getJSONfile1("today");
        try {


            JSONObject raw = new JSONObject(JSON);
            JSONArray array = raw.getJSONArray("today");

            for (int i = 0; i < array.length(); i++) {
                JSONObject app_detail = array.getJSONObject(i);

                items.add(new Today_item(R.drawable.tom3, app_detail.getString("name"), app_detail.getString("short")
                        , app_detail.getString("discription")));
            }
        } catch (JSONException e) {
            Log.d("Json", e.toString());
        }
        return items;
    }

    public ArrayList<Today_item> getGameForYou1Item() {
        ArrayList<Today_item> items = new ArrayList<>();
        String JSON = getJSONfile1("for_you_1");
        try {


            JSONObject raw = new JSONObject(JSON);
            JSONArray array = raw.getJSONArray("today");

            for (int i = 0; i < array.length(); i++) {
                JSONObject app_detail = array.getJSONObject(i);

                items.add(new Today_item(R.drawable.tom3, app_detail.getString("type"), app_detail.getString("name")
                        , app_detail.getString("discription")));
            }
        } catch (JSONException e) {
            Log.d("Json", e.toString());
        }
        return items;
    }


    public String getJSONfile1(String s) {
        String Json = null;
        s = s + ".json";
        try {
            InputStream is = context.getAssets().open(s);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            Json = new String(buffer, "UTF-8");
        } catch (IOException e) {
            Log.e("json", e.toString());
        }
        return Json;

    }

}


