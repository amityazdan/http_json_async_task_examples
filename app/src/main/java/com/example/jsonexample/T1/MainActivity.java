//package com.example.jsonexample.T1;
//
//import android.app.Activity;
//import android.os.AsyncTask;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.ListView;
//import android.widget.Toast;
//
//import com.example.jsonexample.R;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.ArrayList;
//
//import static com.example.jsonexample.T1.MainActivity.listerner;
//
//public class MainActivity extends AppCompatActivity {
//
//    public static MyAdapter myAdapter;
//
//    public static void callMethos(String json) {
//        Toast.makeText(act, json + "", Toast.LENGTH_SHORT).show();
//        Log.wtf("amitjson", json + "");
//    }
//
//    public static Activity act;
//
//    public static ArrayList<MyMovie> myMovies = new ArrayList<>();
//    public static Listerner listerner;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        act = this;
//
//        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new getData().execute();
//            }
//        });
//        ListView listView = (ListView) findViewById(R.id.movies_list);
//
//
////        myMovies.add();
//
//        ArrayList<MyMovie> myMovies=new ArrayList<>();
//        myMovies.add(new MyMovie("amit", "a", "ait"));
//
//        myAdapter = new MyAdapter(this, R.layout.my_movie,myMovies);
////        myAdapter.add(new MyMovie("amit", "a", "ait"));
//        listView.setAdapter(myAdapter);
//
//
//
//        listerner=new Listerner() {
//            @Override
//            public boolean msg(MyMovie myMovie) {
////                myAdapter.add(myMovie);
//                return false;
//            }
//        };
//    }
//}
//
//
//class getData extends AsyncTask<String, String, String> {
//
//    HttpURLConnection urlConnection;
//
//    @Override
//    protected String doInBackground(String... args) {
//
//        StringBuilder result = new StringBuilder();
//
//        try {
//            URL url = new URL("http://www.omdbapi.com/?t=batman&apikey=5288faf2");
//            urlConnection = (HttpURLConnection) url.openConnection();
//            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//
//            String line;
//            while ((line = reader.readLine()) != null) {
//                result.append(line);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            urlConnection.disconnect();
//        }
//        return result.toString();
//    }
//
//
//    @Override
//    protected void onPostExecute(String result) {
//        //Do something with the JSON string
//        try {
//            JSONObject jsonObject = new JSONObject(result);
//            String name = jsonObject.getString("Title");
//            String rating = jsonObject.getString("imdbRating");
//            String poster = jsonObject.getString("Poster");
//
//            MyMovie myMovie = new MyMovie(name, rating, poster);
//
//
//
//            if (listerner!=null)
//                listerner.msg(myMovie);
//
////            MainActivity.callMethos(result);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
////    interface MyListener{
////        void msg(boolean b);
////    }
//
//}
//
//
//
//
//
//
