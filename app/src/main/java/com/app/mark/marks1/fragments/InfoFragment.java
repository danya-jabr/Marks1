package com.app.mark.marks1.fragments;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.app.mark.marks1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    private SharedPreferences preferences;

    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_info, container, false);
        EditText teacher  = (EditText)view.findViewById(R.id.teacher);
        EditText helper  = (EditText)view.findViewById(R.id.helper);
        EditText manager  = (EditText)view.findViewById(R.id.manager);
        EditText center  = (EditText)view.findViewById(R.id.center);
        EditText generation  = (EditText)view.findViewById(R.id.generation);
        EditText section  = (EditText)view.findViewById(R.id.section);
        EditText location  = (EditText)view.findViewById(R.id.location);
        Button enter =(Button)view.findViewById(R.id.enter);

        preferences  = PreferenceManager.getDefaultSharedPreferences(getContext());
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("teacherName",teacher.getText().toString());
        editor.putString("helperName",helper.getText().toString());
        editor.putString("managerName",manager.getText().toString());
        editor.putString("centerName",center.getText().toString());
        editor.putString("generationName",generation.getText().toString());
        editor.putString("sectionNumber",section.getText().toString());
        editor.putString("locationName",location.getText().toString());
        editor.apply();

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StudentsFragment info  = new StudentsFragment();
             //   getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_info,info).commit();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
               // transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction.replace(R.id.main, info);
                transaction.commit();


            }
        });

        return view;

    }



}
