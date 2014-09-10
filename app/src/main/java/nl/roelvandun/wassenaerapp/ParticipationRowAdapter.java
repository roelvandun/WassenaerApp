package nl.roelvandun.wassenaerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dunr on 09/09/14.
 */
public class ParticipationRowAdapter extends ArrayAdapter<String> {

    private Context mContext;
    private int mResourceId;

    private List<String> mWeekdayDateMap;
    private List<String> mDatesOfTheWeek;

    public ParticipationRowAdapter(Context context, int resource) {
        super(context, resource);

        mContext = context;
        mResourceId = resource;

        //TODO get from arrays.xml
        mWeekdayDateMap = new ArrayList<String>(7);
        mWeekdayDateMap.add("maandag");
        mWeekdayDateMap.add("dinsdag");
        mWeekdayDateMap.add("woensdag");
        mWeekdayDateMap.add("donderdag");
        mWeekdayDateMap.add("vrijdag");
        mWeekdayDateMap.add("zaterdag");
        mWeekdayDateMap.add("zondag");

        //TODO calculate from weeknumber
        //TODO want dates or strings?
        //TODO calculate the dates here in the adapter or pass them from the activity?
        mDatesOfTheWeek = new ArrayList<String>(7);
        mDatesOfTheWeek.add("08/09/2014");
        mDatesOfTheWeek.add("09/09/2014");
        mDatesOfTheWeek.add("10/09/2014");
        mDatesOfTheWeek.add("11/09/2014");
        mDatesOfTheWeek.add("12/09/2014");
        mDatesOfTheWeek.add("13/09/2014");
        mDatesOfTheWeek.add("14/09/2014");

        //TODO don't loose state of top/bottom checkbox when scrolling:
        // http://stackoverflow.com/questions/23214189/checkbox-looses-state-on-listview-scrolling
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(mResourceId, parent, false);

        TextView weekdayTextView = (TextView) rowView.findViewById(R.id.tv_weekday);
        TextView dateTextView = (TextView) rowView.findViewById(R.id.tv_date);

        weekdayTextView.setText(mWeekdayDateMap.get(position));
        dateTextView.setText(mDatesOfTheWeek.get(position));

        return rowView;
    }

    @Override
    public int getCount() {
        return mDatesOfTheWeek.size();
    }

}
