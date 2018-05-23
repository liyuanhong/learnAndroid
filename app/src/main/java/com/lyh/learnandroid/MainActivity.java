package com.lyh.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview = (ListView)findViewById(R.id.main_list);
        String data[] = {"标题1","标题2","标题3","标题4","标题2","标题3","标题4","标题2","标题3","标题4","标题2","标题3","标题4"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this, android.R.layout.simple_list_item_1, data);

        listview.setAdapter(adapter);
    }
}
