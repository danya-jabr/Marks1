package com.app.mark.marks1.fragments;


import android.content.Context;
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
import android.widget.Toast;

import com.app.mark.marks1.R;
import com.app.mark.marks1.modules.Student;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddStudent extends Fragment {


    private EditText studentName;
    private Button addStudent;
    SharedPreferences preferences;
    private Button back;

    public AddStudent() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add_student, container, false);
        studentName = (EditText)view.findViewById(R.id.studentname);
        addStudent = (Button)view.findViewById(R.id.enterstudent);
        back = (Button)view.findViewById(R.id.back);


        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                preferences  = PreferenceManager.getDefaultSharedPreferences(getContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("Name",studentName.getText().toString());
                editor.apply();
                Context context = getActivity().getApplicationContext();
                CharSequence text = " لقد قمت بإدخال طالب بنجاح";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StudentsFragment std = new StudentsFragment();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
               // transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction.replace(R.id.main, std);
                transaction.commit();
            }
        });

        return view;
    }

}
