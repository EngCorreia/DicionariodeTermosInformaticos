package com.autonacao.dicionariodetermosinformticos.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.autonacao.dicionariodetermosinformticos.R;
import com.autonacao.dicionariodetermosinformticos.listerners.ItemClickListener;

public class Holder_Dictionary_Words extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView holder_title;
    public TextView holder_description;

    ItemClickListener itemClickListener;

    public Holder_Dictionary_Words(@NonNull View itemView) {
        super(itemView);

        this.holder_title = itemView.findViewById(R.id.structure_title);
        this.holder_description = itemView.findViewById(R.id.structure_description);

        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }

}
