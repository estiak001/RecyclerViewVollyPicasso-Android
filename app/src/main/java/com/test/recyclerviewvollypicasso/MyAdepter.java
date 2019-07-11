package com.test.recyclerviewvollypicasso;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdepter extends RecyclerView.Adapter<MyviewHolder> {

    private List<MyItem> mylist;
    private Context context;

    public MyAdepter(List<MyItem> mylist, Context context) {
        this.mylist = mylist;
        this.context = context;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout,parent,false);
        MyviewHolder VH = new MyviewHolder(v);

        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int i) {

        final MyItem myItemposition= mylist.get(i);
        holder.headText.setText(myItemposition.getHead());
        holder.descText.setText(myItemposition.getDesc());
        Picasso.get().load(myItemposition.getImageurl()).into(holder.imageView);

        holder.headText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,myItemposition.getHead(),Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }
}
