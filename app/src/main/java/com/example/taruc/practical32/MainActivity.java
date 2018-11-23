package com.example.taruc.practical32;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewMessage = findViewById(R.id.textView2);
    }

    public void showMessage(View view)
    {
        textViewMessage.setText(getString(R.string.message));
    }
}
