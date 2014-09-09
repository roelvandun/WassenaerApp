package nl.roelvandun.wassenaerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dunr on 09/09/14.
 */
public class ParticipationRowAdapter extends ArrayAdapter<String> {

    private Context mContext;
    private List<String> mWeekdayDateMap;
    private List<String> mDatesOfTheWeek;

    public ParticipationRowAdapter(Context context, int resource) {
        super(context, resource);

        mContext = context;

        //TODO get from arrays.xml
        mWeekdayDateMap = new ArrayList<String>(7);
        mWeekdayDateMap.add("maandag");//, "08/09/2014");
        mWeekdayDateMap.add("dinsdag");//, "09/09/2014");
        mWeekdayDateMap.add("woensdag");//, "10/09/2014");
        mWeekdayDateMap.add("donderdag");//, "11/09/2014");
        mWeekdayDateMap.add("vrijdag");//, "12/09/2014");
        mWeekdayDateMap.add("zaterdag");//, "13/09/2014");
        mWeekdayDateMap.add("zondag");//, "14/09/2014");

        mDatesOfTheWeek = new ArrayList<String>(7);
        mDatesOfTheWeek.add("08/09/2014");
        mDatesOfTheWeek.add("09/09/2014");
        mDatesOfTheWeek.add("10/09/2014");
        mDatesOfTheWeek.add("11/09/2014");
        mDatesOfTheWeek.add("12/09/2014");
        mDatesOfTheWeek.add("13/09/2014");
        mDatesOfTheWeek.add("14/09/2014");
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.participation_row_layout, parent, false);

        TextView weekdayTextView = (TextView) rowView.findViewById(R.id.tv_weekday);
        TextView dateTextView = (TextView) rowView.findViewById(R.id.tv_date);

        Button yesButton = (Button) rowView.findViewById(R.id.btn_yes);
        Button laterButton = (Button) rowView.findViewById(R.id.btn_later);
        Button noButton = (Button) rowView.findViewById(R.id.btn_no);

        weekdayTextView.setText(mWeekdayDateMap.get(position));
        dateTextView.setText(mDatesOfTheWeek.get(position));

        return rowView;
    }

    @Override
    public int getCount() {
        return mDatesOfTheWeek.size();
    }
}
