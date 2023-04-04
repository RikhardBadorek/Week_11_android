package com.badorek.viikko_11_muisti_app;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    TextView information;
    Button delete;
    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        information = itemView.findViewById(R.id.textView);
        delete = itemView.findViewById(R.id.btnDelete);
    }
}
