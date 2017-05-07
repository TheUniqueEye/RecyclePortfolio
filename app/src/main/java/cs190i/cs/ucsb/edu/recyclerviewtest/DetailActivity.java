package cs190i.cs.ucsb.edu.recyclerviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by EYE on 07/05/2017.
 */

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_image);

        Intent intent = getIntent();
        int imageID = intent.getIntExtra(MainActivity.EXTRA_IMAGEID,0);
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        //Log.d("image",""+imageID);

        ImageView detailImage = (ImageView) findViewById(R.id.image_detail);
        detailImage.setImageResource(imageID);

        TextView detailText = (TextView)findViewById(R.id.text_detail);
        detailText.setText(text);

    }

}
