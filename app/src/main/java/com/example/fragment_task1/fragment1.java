package com.example.fragment_task1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class fragment1 extends Fragment {


    public fragment1()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_fragment1, container, false);

        String items[]={"Saudi Arabia","UAE","Australia","Pakistan","Canada","America", "Europe"};

        ListView listview=(ListView)view.findViewById(R.id.list);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>
                (
                        getActivity(),
                        android.R.layout.simple_list_item_1,
                        items
                );

        listview.setAdapter(arrayAdapter);

        // Inflate the layout for this fragment
        return view;
    }
}