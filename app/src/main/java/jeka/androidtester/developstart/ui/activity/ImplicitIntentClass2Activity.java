package jeka.androidtester.developstart.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import jeka.androidtester.developstart.R;

public class ImplicitIntentClass2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        ( (TextView) findViewById(R.id.tvMessReceiver)).setText("Activity Class 2 Receive +: " + getIntent().getStringExtra("mess"));
    }
}
