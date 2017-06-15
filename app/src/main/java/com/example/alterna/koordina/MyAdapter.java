package com.example.alterna.koordina;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ismaelgarzon on 8/6/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<Persona> mDataset;
    Activity mActivity;

    //la clase anidada
    public class ViewHolder extends RecyclerView.ViewHolder {
   //declaro todas las views que quiero que lleve el cardview

        private TextView mTextViewName;
        private TextView mTextViewJob;
        private ImageView mImageView;

        //el constructor de la clase anidada
        public ViewHolder(View itemView) {
            super(itemView);
            mTextViewName = (TextView) itemView.findViewById(R.id.textview_name);
            mTextViewJob= (TextView) itemView.findViewById(R.id.textview_job);
            mImageView = (ImageView) itemView.findViewById(R.id.imageview);
        }
    }

    //constructor del adaptador que depende del origen de los datos
    public MyAdapter(ArrayList<Persona> myDataset,Activity activity) {
        mDataset = myDataset;
        mActivity = activity;


    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    //asocia cada elemento de la lista con cada view

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
                final Persona persona = mDataset.get(position);
                holder.mImageView.setImageResource(persona.getMimage());
                holder.mTextViewName.setText(persona.getMname());
                holder.mTextViewJob.setText(persona.getMjob());
        //listener
        holder.mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mActivity, persona.getMname(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mActivity, DetallePersona.class);
                intent.putExtra("nombre", persona.getMname());
                intent.putExtra("telefono",persona.getMphone());
                intent.putExtra("imagen",persona.getMimage());
                intent.putExtra("mail", persona.getMemail());
                mActivity.startActivity(intent);




            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }


}
