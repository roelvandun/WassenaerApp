package nl.roelvandun.wassenaerapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class DinnerParticipationFormActivity extends Activity {

    private int mWeekNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner_participation_form);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, new String[]{"fwda34d", "fwdafwd", "fwtawft"});

        ListAdapter customAdapter = new ParticipationRowAdapter(this, R.layout.participation_row_layout);

        ListView participationsListView = (ListView) findViewById(R.id.lv_participations);

        participationsListView.setAdapter(customAdapter);

    }

}
