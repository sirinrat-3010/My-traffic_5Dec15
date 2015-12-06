package thailand.nakon.sirinrat.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static thailand.nakon.sirinrat.mytraffic.R.id.textView2;
import static thailand.nakon.sirinrat.mytraffic.R.id.title;

/**
 * Created by SIRINRAT on 6/12/2558.
 */
public class MyAdapter extends BaseAdapter{

    //Explict
    private Context objContext;
    private String[] titleStrings, detailStrings;
    private int[] iconInts;

    public MyAdapter(Context objContext, String[] titleStrings, String[] detailStrings, int[] iconInts) {
        this.objContext = objContext;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
        this.iconInts = iconInts;
    }//Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Open Service
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = objLayoutInflater.inflate(R.layout.my_listview,parent,false);

        //SetUp TextView
        TextView titleTextView = (TextView) view.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[position]);

        TextView detilTextView = (TextView) view.findViewById(R.id.textView3);
        detilTextView.setText(detailStrings[position]);

        //Setup Image
        ImageView iconImageView = (ImageView) view.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[position]);




        return view;
    }
}// Main Class
