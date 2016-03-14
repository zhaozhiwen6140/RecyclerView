package com.example.cnlive.recyclerview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

import java.util.List;
import java.util.Map;

/**
 * Created by CNLive on 2016/3/2.
 */
public class UserAdapter extends RecyclerView.Adapter<MyViewHolder>{
    private Context mContext;
    private List<String> data;
    private LayoutInflater inflater;
    public UserAdapter(Context context,List<String> list) {
        mContext=context;
        data=list;
        inflater=LayoutInflater.from(context);

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(data.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
   class MyViewHolder extends RecyclerView.ViewHolder{
       @Nullable
       @Bind(R.id.textView)
       TextView textView;

       public MyViewHolder(View itemView) {
           super(itemView);
           ButterKnife.bind(this,itemView);
       }
   }
