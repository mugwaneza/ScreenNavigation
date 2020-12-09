package com.example.screennavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class RecyclerData extends AppCompatActivity {

    ArrayList <Item> itemList = new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_data);
        RecyclerView recy = (RecyclerView) findViewById(R.id.recid);

        ArrayList <Item> itemList = new ArrayList<Item>();

        ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(R.layout.list_item, itemList);
        recy.setLayoutManager(new LinearLayoutManager(this));
        recy.setItemAnimator(new DefaultItemAnimator());
        recy.setAdapter(itemArrayAdapter);

        itemList.add(new Item("Jimy "));
        itemList.add(new Item("Charles "));
        itemList.add(new Item("Morra "));

    }
}