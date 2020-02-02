package com.example.fetchjson.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fetchjson.MainActivity;
import com.example.fetchjson.POJO.Detail;
import com.example.fetchjson.R;

import java.util.ArrayList;
import java.util.List;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewHolder> {
    Context context;
    List<Detail> _details;

    public DetailAdapter(MainActivity mainActivity, List<Detail> details) {
        this.context = mainActivity;
        this._details = details;
    }

    @NonNull
    @Override
    public DetailAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.set_data_layout_view, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailAdapter.ViewHolder viewHolder, int i) {

        viewHolder.textView2.setText(_details.get(i).getFirstName());
        viewHolder.textView.setText(_details.get(i).getAddress());


    }


    @Override
    public int getItemCount() {
        return _details.size();
    }

    public void filterList(ArrayList<Detail> filterdNames) {
        this._details=filterdNames;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView, textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }
}
