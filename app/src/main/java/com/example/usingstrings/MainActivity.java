package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Lifecycle", "OnCreate() invoked(Oncreate calling) ");

        TextView textView2 = findViewById(R.id.TvMsg2);
        textView2.setText(R.string.Msg1);

        TextView textView = findViewById(R.id.TvMsg1);
        textView2.setText(R.string.Msg2);


    }

    @Override
    public void onStart()
    {
        super.onStart();
        Log.i("Lifecycle", "OnStart() invoked ");
    }

    @Override
    public void onRestart()
    {
        super.onRestart();
        Log.i("Lifecycle", " OnRestart() invoked");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.i("Lifecycle", "  OnPause() invoked");
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.i("Lifecycle", "  onResume() invoked");
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.i("Lifecycle", "  onResume() invoked");
    }
}