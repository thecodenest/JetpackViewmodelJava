package com.rajendra.jetpackviewmodeljava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GetData getData;
    TextView count;
    Button getCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = findViewById(R.id.count);
        getCount = findViewById(R.id.get_count);

        //getData = new GetData();
        getData = ViewModelProviders.of(this).get(GetData.class);

        count.setText(String.valueOf(getData.getTotalCount()));

        getCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count.setText(String.valueOf(getData.getCount()));
            }
        });

    }
}