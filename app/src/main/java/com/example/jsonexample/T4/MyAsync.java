package com.example.jsonexample.T4;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class MyAsync extends AsyncTask<String, String, String> {
    private final MyListener myListener;

    public MyAsync(MyListener myListener) {
        this.myListener=myListener;

    }

    @Override
    protected String doInBackground(String... strings) {

        StringBuilder stringBuilder = null;
        try {

            URL url = new URL("https://jsonplaceholder.typicode.com/todos/1/posts");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = new BufferedInputStream(httpURLConnection.getInputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Log.d("amitamit", line);
                stringBuilder.append(line);
            }

            httpURLConnection.disconnect();

        } catch (Exception e) {
            return  null;
        }

        return stringBuilder.toString();
    }

    @Override
    protected void onPostExecute(String s) {
        if(myListener!=null)
            myListener.send(s);

        super.onPostExecute(s);
    }
}
