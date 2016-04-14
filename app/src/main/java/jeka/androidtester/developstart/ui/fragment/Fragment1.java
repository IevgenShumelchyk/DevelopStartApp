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
public class Fragment1 extends Fragment {

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Timber.d("Fragment1 onAttach");
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.d("Fragment1 onCreate");
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Timber.d("Fragment1 onCreateView");
        return inflater.inflate(R.layout.fragment_1, null);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Timber.d("Fragment1 onActivityCreated");
    }

    public void onStart() {
        super.onStart();
        Timber.d("Fragment1 onStart");
    }

    public void onResume() {
        super.onResume();
        Timber.d("Fragment1 onResume");
    }

    public void onPause() {
        super.onPause();
        Timber.d("Fragment1 onPause");
    }

    public void onStop() {
        super.onStop();
        Timber.d("Fragment1 onStop");
    }

    public void onDestroyView() {
        super.onDestroyView();
        Timber.d("Fragment1 onDestroyView");
    }

    public void onDestroy() {
        super.onDestroy();
        Timber.d("Fragment1 onDestroy");
    }

    public void onDetach() {
        super.onDetach();
        Timber.d("Fragment1 onDetach");
    }
}
