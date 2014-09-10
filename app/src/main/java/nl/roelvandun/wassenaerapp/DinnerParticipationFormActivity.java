package nl.roelvandun.wassenaerapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DinnerParticipationFormActivity extends Activity {

    // views
    private TextView mWeekNumberTextView;
    private ListView mParticipationsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner_participation_form);

        getWeekNumberTextView().setText(getString(R.string.week) + ": 37");

        ListAdapter customAdapter = new ParticipationRowAdapter(this, R.layout.participation_row_radio_layout);
        getParticipationsListView().setAdapter(customAdapter);

        //TODO validate if all checkboxes are filled in

        //TODO submit button handler

        //TODO save to parse.com

        //TODO style radiobuttons

        //TODO disable days in the past

        //TODO notify the cook that you're not joining

        //TODO overview of the weekx
    }

    private TextView getWeekNumberTextView() {
        if (mWeekNumberTextView == null) {
            mWeekNumberTextView = (TextView) findViewById(R.id.tv_week_number);
        }
        return mWeekNumberTextView;
    }

    private ListView getParticipationsListView() {
        if (mParticipationsListView == null) {
            mParticipationsListView = (ListView) findViewById(R.id.lv_participations);
        }
        return mParticipationsListView;
    }

}
