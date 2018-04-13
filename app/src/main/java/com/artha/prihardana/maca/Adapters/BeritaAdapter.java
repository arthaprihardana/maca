package com.artha.prihardana.maca.Adapters;

import android.content.Context;
import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by redbuzz on 14/03/18.
 */

public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.MyViewHolder> {

    private static final String TAG = BeritaAdapter.class.getSimpleName();

    private Context context;
    private List<Berita> beritaList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView author, title, description, url, source;
        public ImageView urlToImage;

        public MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            author = view.findViewById(R.id.author);
            description = view.findViewById(R.id.description);
            source = view.findViewById(R.id.source);
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
        holder.author.setText(berita.getAuthor() != null ? berita.getAuthor() : "Author" );
        holder.title.setText(berita.getTitle());
        holder.description.setText(berita.getDescription());
        holder.source.setText(berita.getSource().get("name").getAsString());

        Glide.with(context)
                .load(berita.getUrlToImage())
                .error(R.drawable.default_placeholder)
                .into(holder.urlToImage);
    }

    @Override
    public int getItemCount() {
        return beritaList.size();
    }

}
