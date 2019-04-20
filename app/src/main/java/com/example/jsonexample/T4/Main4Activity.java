package com.example.jsonexample.T4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.jsonexample.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {


    public MyListener myListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final ArrayList<MyItem> arr = new ArrayList<>();
        final MyAdapter myAdapter = new MyAdapter(this, R.layout.item, arr);
        ListView listV = (ListView) findViewById(R.id.listV);

        listV.setAdapter(myAdapter);




        myListener= new MyListener() {
            @Override
            public void send(String data) {

                MyItem myItem = null;
                JSONArray jsonArray = null;
                try {
                    jsonArray = new JSONArray(data);
                    for (int i = 0; i <jsonArray.length() ; i++) {
                        JSONObject o = (JSONObject) jsonArray.get(i);
                        String user = o.getString("userId");
                        String title = o.getString("title");
                        String body = o.getString("body");
                        myItem=new MyItem(user,title,body);
                        arr.add(myItem);
                    }

                } catch (JSONException e) {
                    Log.e("amitamit", "onPostExecute: "+e );
                    e.printStackTrace();
                }


                arr.add(myItem);
                myAdapter.notifyDataSetChanged();
            }
        };

        new MyAsync(myListener).execute();

    }


    @Override
    protected void onPause() {
        Intent myService = new Intent(Main4Activity.this, BackMusicService.class);
        stopService(myService);
        super.onPause();
    }

    @Override
    protected void onStart() {
        Intent myService = new Intent(Main4Activity.this, BackMusicService.class);
        startService(myService);
        super.onStart();
    }
}
