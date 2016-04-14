package jeka.androidtester.developstart.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import jeka.androidtester.developstart.R;

public class ImplicitIntentClass1Activity extends AppCompatActivity {

    TextView tvMessReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        tvMessReceiver = (TextView) findViewById(R.id.tvMessReceiver);
        Intent intent = getIntent();
        String mess = intent.getStringExtra("mess");
        tvMessReceiver.setText("Activity Class 1 Receive: " + mess);
    }
}
