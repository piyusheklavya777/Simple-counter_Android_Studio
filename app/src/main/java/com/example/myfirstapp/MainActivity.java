package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView count_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count_text = (TextView) findViewById(R.id.show_count);
    }

    public void onCount(View view) {

        this.mCount++;
        if (this.count_text != null)
            count_text.setText(Integer.toString(mCount));
           //count_text.setText(String.format(String.valueOf(mCount)));
    }

    public void onToast(View view) {
        Context context = getApplicationContext();
        Toast.makeText(context, "Toast", Toast.LENGTH_SHORT).show();
    }

    public void onReset(View view) {
        mCount = 0;
        count_text.setText(Integer.toString(mCount));
    }
}