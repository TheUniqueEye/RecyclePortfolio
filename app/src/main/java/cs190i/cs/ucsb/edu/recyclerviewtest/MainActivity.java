package cs190i.cs.ucsb.edu.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Town> towns;


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

    }

    private void initData(){
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
