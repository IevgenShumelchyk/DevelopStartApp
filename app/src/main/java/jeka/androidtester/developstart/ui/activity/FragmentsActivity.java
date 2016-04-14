package jeka.androidtester.developstart.ui.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import jeka.androidtester.developstart.R;
import jeka.androidtester.developstart.databinding.FragmentsActivityBinding;
import timber.log.Timber;

public class FragmentsActivity extends AppCompatActivity {

    private FragmentsActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_fragments);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fragments);
        binding.btnActTwo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Timber.d("Long Click");
                return false;
            }
        });
    }
}
