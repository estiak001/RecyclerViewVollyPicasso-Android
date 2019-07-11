package com.test.recyclerviewvollypicasso;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyviewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView descText;
    TextView headText;

    public MyviewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.imageid);
        headText = (TextView) itemView.findViewById(R.id.headId);
        descText = (TextView) itemView.findViewById(R.id.descriptionId);

    }
}
