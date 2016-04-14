package jeka.androidtester.developstart.ui.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jeka.androidtester.developstart.R;
import timber.log.Timber;

/**
 * Created by Шумельчик on 14.04.2016.
 */
public class Fragment2 extends Fragment {

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Timber.d("Fragment2 onAttach");
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.d("Fragment2 onCreate");
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Timber.d("Fragment2 onCreateView");
        return inflater.inflate(R.layout.fragment_2, null);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Timber.d("Fragment2 onActivityCreated");
    }

    public void onStart() {
        super.onStart();
        Timber.d("Fragment2 onStart");
    }

    public void onResume() {
        super.onResume();
        Timber.d("Fragment2 onResume");
    }

    public void onPause() {
        super.onPause();
        Timber.d("Fragment2 onPause");
    }

    public void onStop() {
        super.onStop();
        Timber.d("Fragment2 onStop");
    }

    public void onDestroyView() {
        super.onDestroyView();
        Timber.d("Fragment2 onDestroyView");
    }

    public void onDestroy() {
        super.onDestroy();
        Timber.d("Fragment2 onDestroy");
    }

    public void onDetach() {
        super.onDetach();
        Timber.d("Fragment2 onDetach");
    }
}
