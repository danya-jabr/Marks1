package com.app.mark.marks1.fragments;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.nfc.Tag;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.app.mark.marks1.R;
import com.app.mark.marks1.activites.MainActivity;
import com.app.mark.marks1.adapters.RecyclerViewAdapter;
import com.app.mark.marks1.modules.Student;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudentsFragment extends Fragment {


    private RecyclerViewAdapter adapter;
    private RecyclerView recyclerView;
    SharedPreferences preferences;
    private ArrayList<Student> listContentArr= new ArrayList<>();
    String name;
    public StudentsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_students, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new RecyclerViewAdapter(getActivity());
        preferences= PreferenceManager.getDefaultSharedPreferences(getContext());
        name = preferences.getString("Name", null);



        FloatingActionButton addStudent = (FloatingActionButton)view.findViewById(R.id.add);
        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();


            /*    AddStudent addStudent1 = new AddStudent();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
               // transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction.replace(R.id.main, addStudent1);
                transaction.commit();

*/
                AlertDialog.Builder builder1 = new AlertDialog.Builder(getContext());
                builder1.setTitle("طالبة جديدة");
                builder1.setMessage("الرجاء ادخال اسم الطالبة");
                final EditText input = new EditText(getActivity());
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,

                        LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                input.setTextSize(20);
                input.setGravity(Gravity.CENTER);
                input.setImeOptions(EditorInfo.IME_ACTION_DONE);
                builder1.setView(input);
                builder1.setCancelable(true);
                        builder1.setPositiveButton(
                        "أدخل",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Log.d("danya",input.getText().toString());
                                Student std = new Student();
                                std.setName(input.getText().toString());
                                Log.d("danya", std.getName());
                                std.setTime("Hello RecyclerView! item: ");
                                std.setTime("10:00");
                                listContentArr.add(std);
                                adapter.notifyDataSetChanged();
                                adapter.setListContent(listContentArr);
                                recyclerView.setAdapter(adapter);
                                dialog.cancel();
                            }
                        });

//                builder1.setNegativeButton(
//                        "No",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//                                dialog.cancel();
//                            }
//                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();


            }
        });

                return view;
    }





}
