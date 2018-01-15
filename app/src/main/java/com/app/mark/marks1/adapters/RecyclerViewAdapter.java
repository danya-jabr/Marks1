package com.app.mark.marks1.adapters;

import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.app.mark.marks1.R;
import com.app.mark.marks1.fragments.StudentPageFragment;
import com.app.mark.marks1.fragments.StudentsFragment;
import com.app.mark.marks1.modules.Student;

import java.util.ArrayList;

/**
 * Created by najjar on 10/22/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private View view;
    private MyViewHolder holder;
    private Context context;
    private ArrayList<Student> item_members = new ArrayList<>();

    public RecyclerViewAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }
    public void setListContent(ArrayList<Student> item_members){
        this.item_members=item_members;
        notifyItemRangeChanged(0,item_members.size());

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view= inflater.inflate(R.layout.recycler_view,parent,false);
        holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Student list_items=item_members.get(position);
        holder.user_name.setText(list_items.getName());
        holder.content.setText(list_items.getTime());
        holder.time.getText();


    }


    @Override
    public int getItemCount() {
        return item_members.size();
    }


    // Add a list of items

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView user_name;
        private TextView time;
        private TextView content;

        public MyViewHolder(View itemView) {
            super(itemView);
            user_name = (TextView)itemView.findViewById(R.id.user_name);
            content =(TextView)itemView.findViewById(R.id.content);
            time = (TextView)itemView.findViewById(R.id.time);
            user_name.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {
            Log.d("danya","your view is clicked"+getPosition());
//            StudentPageFragment std = new StudentPageFragment();
//            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
//            // transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
//            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
//            transaction.replace(R.id.main, std);
//            transaction.commit();
        }
    }
    public void removeAt(int position) {
        item_members.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(0, item_members.size());
    }


}
