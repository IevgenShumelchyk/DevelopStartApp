package jeka.androidtester.developstart.ui.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

        binding.btnShortLongClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Timber.d("Short Click");
                Toast.makeText(getApplicationContext(), "Short Click", Toast.LENGTH_SHORT).show();
            }
        });
        binding.btnShortLongClick.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Timber.d("Long Click");
                Toast.makeText(v.getContext(), "Long Click", Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }
}
