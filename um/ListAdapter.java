package com.example.pawel.projekt_appmob.um;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pawel.projekt_appmob.R;

import static android.support.v4.content.ContextCompat.startActivity;
import static com.example.pawel.projekt_appmob.um.Um.Link;
import static com.example.pawel.projekt_appmob.um.Um.getLink;

public class ListAdapter extends RecyclerView.Adapter{

    private static Context context;
    private String[] title;
    private String[] description;
    public   String[] link;

    ListAdapter() {
        this.context = context;
        this.title = title;
        this.description = description;
        this.link = link;
    }




    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.fragment_um, parent, false);
    return new ListViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((ListViewHolder) holder).BindView(position);


    }


    @Override
    public int getItemCount() {
        return Um.Title.length;

    }

    private static class ListViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener{

       private TextView mtitleText;
        private TextView mdescriptionText;
        private TextView mLink;


        public ListViewHolder (View itemView){
            super(itemView);
            mtitleText = (TextView) itemView.findViewById(R.id.titleText_um);
            mdescriptionText=(TextView) itemView.findViewById(R.id.descriptionText_um);

            itemView.setOnClickListener(this);



        }

        public void BindView(int position){
            mtitleText.setText(Um.Title[position]);
            mdescriptionText.setText(Um.Description[position]);



        }

        public void onClick (View view){

            Toast.makeText(view.getContext(), "Wybrano element", Toast.LENGTH_LONG).show();
                /*
                To jest ten fragment co uruchomi przeglądarkę po wybraniu elementu
                Nie funkcjonuje poprawnie, z tablicy "Link" nic nie wybiera (NULL)

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(Link[getAdapterPosition()]));
                context.startActivity(intent);*/
            }

        }

    }

