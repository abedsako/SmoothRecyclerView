package com.abedsako.smoothrecyclerview_example;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyViewHolder extends ViewHolder {
    public ImageView image;
    private RelativeLayout main_layout;
    public TextView title;

    public MyViewHolder(View itemView) {
        super(itemView);

        this.main_layout = (RelativeLayout) itemView.findViewById(R.id.card_main_layout);
        this.title = (TextView) itemView.findViewById(R.id.card_title);
        this.image = (ImageView) itemView.findViewById(R.id.card_image);
        this.main_layout.animate().setDuration(0).alpha(0.6f).start();
    }
}
