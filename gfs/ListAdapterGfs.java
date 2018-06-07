package com.example.pawel.projekt_appmob.gfs;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pawel.projekt_appmob.R;

public class ListAdapterGfs extends RecyclerView.Adapter{

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.fragment_gfs, parent, false);
        return new ListAdapterGfs.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((ListAdapterGfs.ListViewHolder) holder).BindView(position);

    }

    @Override
    public int getItemCount() {
        return Gfs.titleGfs.length;

    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView mtitleText;
        private TextView mdescriptionText;


        public ListViewHolder (View itemView){
            super(itemView);
            mtitleText = (TextView) itemView.findViewById(R.id.titleText_gfs);
            mdescriptionText=(TextView) itemView.findViewById(R.id.descriptionText_gfs);
            itemView.setOnClickListener(this);
        }

        public void BindView(int position){
            mtitleText.setText(Gfs.titleGfs[position]);
            mdescriptionText.setText(Gfs.descriptionGfs[position]);


        }

        public void onClick (View view){

            Toast.makeText(view.getContext(),"Wybrano element",Toast.LENGTH_LONG).show();


        }
    }


}
