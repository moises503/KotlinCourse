package com.museodelasculturasdeoaxaca.kotlinjava;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by moises on 18/03/18.
 */

public class RvListAdapter extends RecyclerView.Adapter<RvListAdapter.RvViewHolder>{
    private List<BasicPojo> list;

    public RvListAdapter(List<BasicPojo> list) {
        this.list = list;
    }

    @Override
    public RvViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RvViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false));
    }

    @Override
    public void onBindViewHolder(RvViewHolder holder, int position) {
        BasicPojo basicPojo = list.get(position);
        holder.textTitle.setText(basicPojo.getTitle());
        holder.textDescription.setText(basicPojo.getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class RvViewHolder extends RecyclerView.ViewHolder{
        TextView textTitle;
        TextView textDescription;

        public RvViewHolder(View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textItemTitle);
            textDescription = itemView.findViewById(R.id.textItemDesc);

        }
    }
}
