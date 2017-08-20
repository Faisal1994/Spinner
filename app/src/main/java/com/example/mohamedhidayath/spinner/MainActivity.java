package com.example.mohamedhidayath.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private Spinner spinnerMobileOS;
    private List<String> mobileOsList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerMobileOS = (Spinner) findViewById(R.id.spinnerMobileOs);
        mobileOsList = new ArrayList<String>();
        mobileOsList.add("select OS");
        mobileOsList.add("Android");
        mobileOsList.add("IOS");
        mobileOsList.add("Windows");
        mobileOsList.add("Symbian");
        mobileOsList.add("BlackBerry");

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.row_spinner, mobileOsList);
        spinnerMobileOS.setAdapter(adapter);

        spinnerMobileOS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
            if(position!=0){
                Toast.makeText(getApplicationContext(), spinnerMobileOS.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}