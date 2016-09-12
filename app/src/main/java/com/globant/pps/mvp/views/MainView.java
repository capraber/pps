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

    public static class DateSelectedButtonPressedEvent {
        public int year;
        public int month;
        public int day;

        public DateSelectedButtonPressedEvent(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }
}
