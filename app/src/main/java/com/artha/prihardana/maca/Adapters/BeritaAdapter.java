package com.artha.prihardana.maca.Adapters;

import android.content.Context;
import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
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

    private Context mContext;
    private List<Berita> beritaList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
        }
    }

    public BeritaAdapter(Context mContext, List<Berita> beritaList) {
        this.mContext = mContext;
        this.beritaList = beritaList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.berita_card, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Berita berita = beritaList.get(position);
        holder.title.setText(berita.getTitle());
    }

    @Override
    public int getItemCount() {
        return beritaList.size();
    }
}
