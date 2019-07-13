package com.example.gradlink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CreateProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

        Spinner spinnerYear = (Spinner) findViewById(R.id.spinnerYear);
        Spinner spinnerDegree = (Spinner) findViewById(R.id.spinnerDegree);
        Spinner spinnerMajor = (Spinner) findViewById(R.id.spinnerMajor);
//spinneryear
        ArrayAdapter <String> yearAdapter = new ArrayAdapter<String>(CreateProfileActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.years));
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerYear.setAdapter(yearAdapter);
//spinnerdegree
        ArrayAdapter <String> degreeAdapter = new ArrayAdapter<String>(CreateProfileActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.degree));
        degreeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerDegree.setAdapter(degreeAdapter);

//spinnermajor
        ArrayAdapter <String> majorAdapter = new ArrayAdapter<String>(CreateProfileActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.major));
        majorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerMajor.setAdapter(majorAdapter);

    }
}
