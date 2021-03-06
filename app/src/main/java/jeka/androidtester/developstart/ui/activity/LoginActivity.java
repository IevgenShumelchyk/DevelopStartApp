package jeka.androidtester.developstart.ui.activity;

import android.content.ComponentName;
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

        binding.btnIntentExplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //view.animate();
                Timber.d("Show FragmentsActivity by Explicit Intent");
                // Открытие новой активити с помощью явного интента
                Intent intent = new Intent(LoginActivity.this, FragmentsActivity.class);  // view.getContext() or getApplicationContext()
                startActivity(intent);
            }
        });

        binding.btnIntentImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Timber.d("Show ImplicitIntentActivity by Implicit Intent");
                // Открытие новой активити с помощью неявного интента (с выбором)
                Intent intent = new Intent("Jeka.AndroidTester.ImplicitIntent");  // view.getContext() or getApplicationContext()
                // передаем параметр
                intent.putExtra("mess", "This Message from LoginActivity");
                startActivity(intent);
            }
        });

        binding.btnIntentContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Timber.d("Intent Call ContactsBook");
                // Открытие книги контактов
                Intent intent = new Intent();
                // вариант 2
                intent.setComponent(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsContactsEntryActivity"));  // intent.setClassName("com.android.contacts","com.android.contacts.DialtactsActivity");
                // вариант 2
                // intent.setAction(Intent.ACTION_VIEW);
                // intent.setData(Uri.parse("content://contacts/people/"));
                startActivity(intent);
            }
        });
    }
}
