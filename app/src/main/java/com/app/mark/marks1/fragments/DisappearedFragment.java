package com.app.mark.marks1.fragments;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.mark.marks1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DisappearedFragment extends Fragment {


    public DisappearedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_disappeared, container, false);
    }

}
