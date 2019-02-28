package com.autonacao.dicionariodetermosinformticos.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.autonacao.dicionariodetermosinformticos.R;
import com.autonacao.dicionariodetermosinformticos.holders.Holder_Dictionary_Words;
import com.autonacao.dicionariodetermosinformticos.listerners.ItemClickListener;
import com.autonacao.dicionariodetermosinformticos.models.Model_Dictionary_Words;
import com.autonacao.dicionariodetermosinformticos.receive_data.Activity_Receive_Data_Dictionary_Words;

import java.util.ArrayList;

public class Adapter_Dictionary_Words extends RecyclerView.Adapter<Holder_Dictionary_Words>{

    Context c;
    ArrayList<Model_Dictionary_Words> model_dictionary_words;

    public Adapter_Dictionary_Words(Context c, ArrayList<Model_Dictionary_Words> model_dictionary_words) {
        this.c = c;
        this.model_dictionary_words = model_dictionary_words;
    }

    @NonNull
    @Override
    public Holder_Dictionary_Words onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.structure_dictionary_words, null);
        return new Holder_Dictionary_Words(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder_Dictionary_Words holder_dictionary_words, final int position) {
        holder_dictionary_words.holder_title.setText(model_dictionary_words.get(position).getTitle_words());
        holder_dictionary_words.holder_description.setText(model_dictionary_words.get(position).getDescription_words());

        Animation animation = AnimationUtils.loadAnimation(c, android.R.anim.slide_in_left);
        holder_dictionary_words.itemView.startAnimation(animation);

        holder_dictionary_words.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {

                String title_dictionary_words = model_dictionary_words.get(pos).getTitle_words();
                String description_dictionary_words = model_dictionary_words.get(pos).getDescription_words();

                Intent intent = new Intent(c, Activity_Receive_Data_Dictionary_Words.class);
                intent.putExtra("title", title_dictionary_words);
                intent.putExtra("description", description_dictionary_words);

                c.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return model_dictionary_words.size();
    }
}
