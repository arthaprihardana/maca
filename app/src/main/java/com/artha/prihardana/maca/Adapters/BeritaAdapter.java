package com.artha.prihardana.maca.Adapters;

import android.content.Context;
import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.artha.prihardana.maca.Models.Berita;
import com.artha.prihardana.maca.R;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by redbuzz on 14/03/18.
 */

public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.MyViewHolder> {

    private Context context;
    private List<Berita> beritaList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView author, title, description, url;
        public ImageView urlToImage;

        public MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            author = view.findViewById(R.id.author);
            description = view.findViewById(R.id.description);
            urlToImage = view.findViewById(R.id.urlToImage);
        }
    }

    public BeritaAdapter(Context context, List<Berita> beritaList) {
        this.context = context;
        this.beritaList =  beritaList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.berita_utama_list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Berita berita = beritaList.get(position);
        holder.author.setText(berita.getAuthor());
        holder.title.setText(berita.getTitle());
        holder.description.setText(berita.getDescription());
        holder.url.setText(berita.getUrl());

        Glide.with(context)
                .load(berita.getUrlToImage())
                .into(holder.urlToImage);
    }

    @Override
    public int getItemCount() {
        return beritaList.size();
    }

}
