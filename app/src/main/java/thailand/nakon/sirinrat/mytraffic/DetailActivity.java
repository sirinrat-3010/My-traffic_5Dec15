package thailand.nakon.sirinrat.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, DetailTextView;
    private ImageView trafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Bind widget
        bindwidgit();

        //show view
        showView();

    }//Main Method

    private void showView() {
     //Receive Value From Intent
     String strTitle = getIntent().getStringExtra("Title");
     int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
     int index  = getIntent().getIntExtra("Index",0 );

     titleTextView.setText(strTitle);
     trafficImageView.setImageResource(intIcon);

        String[] strDetail = getResources().getStringArray(R.array.detail_long);
        DetailTextView.setText(strDetail[index]);

    }

    private void bindwidgit() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        DetailTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);


    }

}//Main Class
