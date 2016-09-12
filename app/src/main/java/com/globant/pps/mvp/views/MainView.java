package com.globant.pps.mvp.views;

import com.globant.pps.R;
import com.globant.pps.activities.MainActivity;
import com.globant.pps.dialogs.DatePickerDialogFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainView extends ActivityView {

    public MainView(MainActivity activity) {
        super(activity);
        ButterKnife.bind(this, activity);
    }

    @OnClick(R.id.date_button)
    public void submit() {
        DatePickerDialogFragment newFragment = new DatePickerDialogFragment();
        newFragment.show(getFragmentManager(), "datePicker");
    }
}
