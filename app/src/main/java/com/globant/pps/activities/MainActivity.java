package com.globant.pps.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.globant.pps.R;
import com.globant.pps.mvp.presenters.MainPresenter;
import com.globant.pps.mvp.views.MainView;
import com.globant.pps.utils.BusProvider;

public class MainActivity extends AppCompatActivity {

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (presenter == null) {
            presenter = new MainPresenter(new MainView(this));
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        BusProvider.unregister(presenter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        BusProvider.register(presenter);
    }

}
