package cs190i.cs.ucsb.edu.recyclerviewtest;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public List<Town> towns;
    public static final String EXTRA_IMAGEID = "MESSAGE_DETAIL_IMAGE";
    public static final String EXTRA_TEXT = "MESSAGE_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);

        initData();

        Adapter mAdapter = new Adapter(towns);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), mRecyclerView, new RecyclerItemClickListener.OnItemClickListener() {

                    @Override
                    public void onItemClick(View view, int position) {
                        //Log.i("addOnItemTouchListener", "onItemClick position =" + position);
                        Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                        intent.putExtra(EXTRA_IMAGEID, towns.get(position).imageID);
                        intent.putExtra(EXTRA_TEXT,towns.get(position).name);
                        startActivity(intent);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                    }
                })
        );
    }


    private void initData() {
        towns = new ArrayList<>();
        towns.add(new Town("Town 1", R.drawable.img1));
        towns.add(new Town("Town 2", R.drawable.img2));
        towns.add(new Town("Town 3", R.drawable.img3));
        towns.add(new Town("Town 4", R.drawable.img4));
        towns.add(new Town("Town 5", R.drawable.img5));
        towns.add(new Town("Town 6", R.drawable.img6));
        towns.add(new Town("Town 7", R.drawable.img1));
        towns.add(new Town("Town 8", R.drawable.img2));


    }


}




