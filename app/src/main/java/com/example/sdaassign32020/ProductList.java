package com.example.sdaassign32020;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/*
 * A simple {@link Fragment} subclass.
 * @author Chris Coughlan 2019
 */
public class ProductList extends Fragment {

    private static final String TAG = "RecyclerViewActivity";
    private ArrayList<FlavorAdapter> mFlavor = new ArrayList<>();

    public ProductList() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_product_list, container, false);
        // Create an ArrayList of objects - storing product images and descriptions including price
        mFlavor.add(new FlavorAdapter("Men's Brown T-Shirt", "€10", R.drawable.m_tshirt1));
        mFlavor.add(new FlavorAdapter("Women's Yellow T-Shirt", "€11", R.drawable.w_tshirt1));
        mFlavor.add(new FlavorAdapter("Men's White T-Shirt", "€13", R.drawable.m_tshirt2));
        mFlavor.add(new FlavorAdapter("Women's Yellow T-Shirt", "€10", R.drawable.w_tshirt2));
        mFlavor.add(new FlavorAdapter("Men's Navy T-Shirt", "€12", R.drawable.m_tshirt3));
        mFlavor.add(new FlavorAdapter("Women's White T-Shirt", "€15", R.drawable.w_tshirt3));
        mFlavor.add(new FlavorAdapter("Men's White T -Shirt", "€9", R.drawable.m_tshirt4));
        mFlavor.add(new FlavorAdapter("Women's White T-Shirt", "€12", R.drawable.w_tshirt4));
        mFlavor.add(new FlavorAdapter("Men's Grey T-Shirt", "€11", R.drawable.m_tshirt5));
        mFlavor.add(new FlavorAdapter("Women's Yellow T-Shirt", "€10", R.drawable.w_tshirt5));

        //start it with the view - supports the display of a collection of data - allows different layout managers for positioning items.
        Log.d(TAG, "Starting recycler view");
        RecyclerView recyclerView = root.findViewById(R.id.recyclerView_view);
        FlavorViewAdapter recyclerViewAdapter = new FlavorViewAdapter(getContext(), mFlavor);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return root;
    }
}
