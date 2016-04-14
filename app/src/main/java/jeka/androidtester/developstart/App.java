package jeka.androidtester.developstart;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by Шумельчик on 13.04.2016.
 */

// Корневой клас приложения - с него начинается запуск
public class App extends Application {

    @Override
    public void onCreate() {      // Метод вызывается после того как приложение создано
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
