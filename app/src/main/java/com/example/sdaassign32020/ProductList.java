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
        // Create an ArrayList of AndroidFlavor objects
        mFlavor.add(new FlavorAdapter("White T-Shirt", "€10", R.drawable.m_tshirt1));
        mFlavor.add(new FlavorAdapter("Black T-Shirt", "€11", R.drawable.w_tshirt1));
        mFlavor.add(new FlavorAdapter("Blue T-Shirt", "€13", R.drawable.m_tshirt2));
        mFlavor.add(new FlavorAdapter("Grey T-Shirt", "€10", R.drawable.w_tshirt2));
        mFlavor.add(new FlavorAdapter("White T-Shirt", "€12", R.drawable.m_tshirt3));
        mFlavor.add(new FlavorAdapter("White-Shirt", "€15", R.drawable.w_tshirt3));
        mFlavor.add(new FlavorAdapter("White -Shirt", "€9", R.drawable.m_tshirt4));
        mFlavor.add(new FlavorAdapter("WhiteT-Shirt", "€12", R.drawable.w_tshirt4));
        mFlavor.add(new FlavorAdapter("White T-Shirt", "€11", R.drawable.m_tshirt5));
        mFlavor.add(new FlavorAdapter("Black T-Shirt", "€10", R.drawable.w_tshirt5));

        //start it with the view
        Log.d(TAG, "Starting recycler view");
        RecyclerView recyclerView = root.findViewById(R.id.recyclerView_view);
        FlavorViewAdapter recyclerViewAdapter = new FlavorViewAdapter(getContext(), mFlavor);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return root;
    }
}
