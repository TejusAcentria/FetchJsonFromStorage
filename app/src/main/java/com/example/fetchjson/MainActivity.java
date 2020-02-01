package com.example.fetchjson;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.fetchjson.Adapter.DetailAdapter;
import com.example.fetchjson.POJO.Detail;
import com.example.fetchjson.POJO.DetailsListPojo;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    DetailsListPojo detailsListPojo;
    RecyclerView fetchJsonRecycler;
    LinearLayoutManager linearLayoutManager;
    DetailAdapter detailAdapter;
    String jsonStr = null;
    private List<Detail> dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetchJsonRecycler = findViewById(R.id.fetchJsonRecycler);

        linearLayoutManager = new LinearLayoutManager(this);
        fetchJsonRecycler.setLayoutManager(linearLayoutManager);


        getfileFromDownload();


    }

    private void getfileFromDownload() {

        File yourFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "datas.json");

        FileInputStream stream = null;
        try {
            stream = new FileInputStream(yourFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            FileChannel fc = stream.getChannel();
            MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
            jsonStr = Charset.defaultCharset().decode(bb).toString();
            detailsListPojo = new Gson().fromJson(parseJSONData(jsonStr), DetailsListPojo.class);
            detailAdapter = new DetailAdapter(this, detailsListPojo.getDetails());
            fetchJsonRecycler.setAdapter(detailAdapter);
            Log.d("checkingdatra", "" + detailsListPojo);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressLint("NewApi")
    public String parseJSONData(String jsonStr) {
        String JSONString = null;
        JSONObject JSONObject = null;
        try {
            InputStream inputStream = new ByteArrayInputStream(jsonStr.getBytes(StandardCharsets.UTF_8));

            int sizeOfJSONFile = inputStream.available();

            byte[] bytes = new byte[sizeOfJSONFile];

            inputStream.read(bytes);

            inputStream.close();

            JSONString = new String(bytes, "UTF-8");

        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return JSONString;
    }
}
