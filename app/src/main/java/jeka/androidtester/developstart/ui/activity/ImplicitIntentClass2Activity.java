package jeka.androidtester.developstart.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import jeka.androidtester.developstart.R;

public class ImplicitIntentClass2Activity extends AppCompatActivity {

    TextView tvMessReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        tvMessReceiver = (TextView) findViewById(R.id.tvMessReceiver);
        tvMessReceiver.setText("Activity Class 2 Receive: " + getIntent().getStringExtra("mess"));

        // ПОЧЕМУ ТАК НЕ РАБОТАЕТ ?
        //(TextView) findViewById(R.id.tvMessReceiver).setText("Activity Receive: " + getIntent().getStringExtra("mess"));
    }
}
