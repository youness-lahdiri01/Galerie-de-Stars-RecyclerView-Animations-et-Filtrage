package com.example.starsgallery.adapter;

import android.content.Context;
import android.view.*;
import android.widget.*;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;
import com.bumptech.glide.Glide;
import com.example.starsgallery.R;
import com.example.starsgallery.beans.Star;
import java.util.List;

public class StarAdapter extends RecyclerView.Adapter<StarAdapter.StarViewHolder> {
    private List<Star> stars;
    private Context context;

    public StarAdapter(Context context, List<Star> stars) {
        this.context = context;
        this.stars = stars;
    }

    @Override
    public StarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.star_item, parent, false);
        return new StarViewHolder(v);
    }

    @Override
    public void onBindViewHolder(StarViewHolder holder, int position) {
        Star s = stars.get(position);
        holder.name.setText(s.getName());
        holder.rating.setRating(s.getRating());
        Glide.with(context).load(s.getImg()).into(holder.img);
    }

    @Override
    public int getItemCount() { return stars.size(); }

    static class StarViewHolder extends RecyclerView.ViewHolder {
        CircleImageView img;
        TextView name;
        RatingBar rating;

        StarViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgStar);
            name = itemView.findViewById(R.id.tvName);
            rating = itemView.findViewById(R.id.rating);
        }
    }
}