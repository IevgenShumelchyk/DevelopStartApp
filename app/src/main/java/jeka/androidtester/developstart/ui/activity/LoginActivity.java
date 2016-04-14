package jeka.androidtester.developstart.ui.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jeka.androidtester.developstart.R;
import jeka.androidtester.developstart.databinding.LoginActivityBinding;
import timber.log.Timber;

public class LoginActivity extends AppCompatActivity {

    private LoginActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //view.animate();
                Timber.d("Show FragmentsActivity");
                Intent intent = new Intent(view.getContext(), FragmentsActivity.class);
                startActivity(intent);
            }
        });

    }
}
