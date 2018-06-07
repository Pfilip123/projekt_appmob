package com.example.pawel.projekt_appmob.gfs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pawel.projekt_appmob.R;

import java.util.ArrayList;
import java.util.List;


public class GfsFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_gfs, container, false);
        View view  = inflater.inflate(R.layout.fragment_gfs, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.RecycleView_gfs);

        ListAdapterGfs listAdapterGfs = new ListAdapterGfs();
        recyclerView.setAdapter(listAdapterGfs);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);



        return view;
    }
}
