package com.example.ahmed.thermonitor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView list;
    String[] devices = {"Android" , "iPhone", "Windows", "Blackberry", "Linux"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        list = (ListView)findViewById(R.id.lst);
        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        startActivity(new Intent(ListActivity.this, DeviceDetailActivity.class));


    }
}
