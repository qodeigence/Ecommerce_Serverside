package com.qodeigence.prakash.ecommerce_server_app.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.qodeigence.prakash.ecommerce_server_app.Common.Common;
import com.qodeigence.prakash.ecommerce_server_app.R;

public class BannerViewHolder extends RecyclerView.ViewHolder implements
          View.OnCreateContextMenuListener

{

    public TextView banner_name;
    public ImageView banner_image;

    public BannerViewHolder(View itemView) {
        super(itemView);
        banner_name = itemView.findViewById(R.id.banner_name);
        banner_image = itemView.findViewById(R.id.banner_image);

        itemView.setOnCreateContextMenuListener(this);

    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle("Select the action");

        contextMenu.add(0,0,getAdapterPosition(), Common.UPDATE);
        contextMenu.add(0,1,getAdapterPosition(), Common.DELETE);
    }
}
