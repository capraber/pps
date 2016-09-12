package com.globant.pps.mvp.presenters;

import android.widget.Toast;

import com.globant.pps.mvp.views.MainView;
import com.globant.pps.mvp.views.MainView.DateSelectedButtonPressedEvent;
import com.squareup.otto.Subscribe;

public class MainPresenter {

    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    @Subscribe
    public void onDateSelected(DateSelectedButtonPressedEvent event) {

        Toast.makeText(view.getActivity(), "year " + event.year + " month " + event.month + " day " + event.day,
                Toast.LENGTH_LONG).show();
    }
}
