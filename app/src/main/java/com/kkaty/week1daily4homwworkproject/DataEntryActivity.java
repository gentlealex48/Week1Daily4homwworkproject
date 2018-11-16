package com.kkaty.week1daily4homwworkproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DataEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onButtonClick(View view) {

        EditText etFirstName;
        etFirstName = findViewById(R.id.etFirstName);
        String rFirstName = etFirstName.getText().toString();

        Intent returnIntent = new Intent();
        returnIntent.putExtra("rFirstName",rFirstName);

        setResult(RESULT_OK,returnIntent);
        finish();
    }
}




