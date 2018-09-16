package com.abedsako.smoothrecyclerview_example;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class Recyclerview_Adapter extends Adapter<MyViewHolder> {
    private Context context;
    private LayoutInflater inflater;
    public ArrayList<List_Data> list = new ArrayList();

    public Recyclerview_Adapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(this.inflater.inflate(R.layout.cards_layout_row, parent, false));
    }

    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(this.context).load(((List_Data) this.list.get(position)).getImage()).into(holder.image);
        holder.title.setText(((List_Data) this.list.get(holder.getAdapterPosition())).getName());
    }

    public int getItemCount() {
        return this.list.size();
    }
}
