package com.example.screennavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class SchoolsList extends AppCompatActivity {


    String [] schoolsArray = {"IPRC KGL", "UR GIKONDO", "MOUNT KENYA", "UOK", "ULK", "IPRC HUYE","IPD NYANZA","UR HUYE", "UR RUSIZI", "UNILAC", "INTATEC", "UOK MUSANZE", "GS St Jo", "KHI", "KIST", "ULK GISENYI", "NOTRE DAME DE CITEAU"};
     String [] highschoolArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schools_list);
        setTitle("Shools");

        highschoolArray = getResources().getStringArray(R.array.secondaryschoollist);
        ListView listview = (ListView)findViewById(R.id.list);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                R.layout.list_item, R.id.textitem, schoolsArray );
//        listview.setAdapter(adapter);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_item, R.id.textitem, highschoolArray );
        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

String selected = ((TextView)view.findViewById(R.id.textitem)).getText().toString();
//                Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_LONG).show();
//                 if (selected.contains("IPRC")){
//                Toast.makeText(getApplicationContext(), "This is polytechnic school", Toast.LENGTH_LONG).show();
//                 }else if(selected.equals("UR GIKONDO")){
//                     // Go to Gikondo campus
//                }

                switch (position){
                    case 0:
            Intent rec  = new Intent(SchoolsList.this, RecyclerData.class);
            startActivity(rec);
       break;
        case 1:
            Intent sru  = new Intent(SchoolsList.this, Students.class);
            startActivity(sru);
        break;
        case 2:
        Toast.makeText(getApplicationContext(), selected +" is on position " +position, Toast.LENGTH_LONG).show();

        break;
        case 3:
            Toast.makeText(getApplicationContext(), selected +" is on position " +position, Toast.LENGTH_LONG).show();
    break;
    default:

                }
            }
            });
    }
}