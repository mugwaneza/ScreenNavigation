package com.example.screennavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Students extends AppCompatActivity {

    String[] ListviewNames = new String[]{
            "JOHN","BRENDAH","BRUCE"
    };
    // images
    int[] ListviewImages = new int[]{
    R.drawable.ic_baseline_person_pin_24,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_person_pin_24
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

List<HashMap<String,String>> aList = new ArrayList<HashMap<String, String>>();
        for (int x = 0; x < 3; x++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("ListTitle",ListviewNames[x]);
            hm.put("ListImages",Integer.toString(ListviewImages[x]));
            aList.add(hm);
        }

        String[] from = {
                "ListImages","ListTitle"
        };
        int[] to = {
                R.id.imageView2,R.id.textView11
        };

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(),aList, R.layout.text_imagelayout,from,to);
        ListView simpleListview = (ListView)findViewById(R.id.liststudent);
        simpleListview.setAdapter(simpleAdapter);
    }
}