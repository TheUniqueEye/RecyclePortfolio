package cs190i.cs.ucsb.edu.recyclerviewtest;

import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import pl.droidsonroids.gif.GifImageView;

/**
 * Created by EYE on 06/05/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    public List<Town> towns;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public GifImageView imageView;
        public TextView textView;
        public CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text);
            imageView = (GifImageView) itemView.findViewById(R.id.image);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
        }
    }

    Adapter(List<Town> towns){
        this.towns = towns;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        holder.imageView.setImageResource(towns.get(position).imageID);
        holder.textView.setText(towns.get(position).name);
    }

    @Override
    public int getItemCount() {
        //Log.i("number of towns"," "+towns.size());
        return towns.size();
    }


}

