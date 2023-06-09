package com.puravish.recycleviewquoteapp;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ShayariAdapter extends RecyclerView.Adapter<ShayariAdapter.myViewHolde> {


    MainActivity mainActivity;
    ArrayList<shayariModel> categori;
    ShayariInterface shayariInterface;

    public ShayariAdapter(MainActivity mainActivity, ArrayList<shayariModel> categori, ShayariInterface shayariInterface) {

        this.mainActivity = mainActivity;
        this.categori = categori;
        this.shayariInterface = shayariInterface;

    }

    @NonNull
    @Override
    public ShayariAdapter.myViewHolde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from( mainActivity).inflate( R.layout.item_categori,parent,false);
        myViewHolde myViewHolde = new myViewHolde(v );
        return myViewHolde;
    }

    @Override
    public void onBindViewHolder(@NonNull ShayariAdapter.myViewHolde holder, @SuppressLint("RecyclerView") int position) {

        int p=position;
        holder.catName.setText(categori.get( position ).shayariname);
        holder.catImage.setImageResource(categori.get( position ).emoji);

        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                shayariInterface.onClick(categori.get( position ).shayariname);

            }
        } );

    }

    @Override
    public int getItemCount() {
        return categori.size();
    }

    public class myViewHolde extends RecyclerView.ViewHolder {
        TextView catName;
        CircleImageView catImage;



        public myViewHolde(@NonNull View itemView) {
            super( itemView );


            catName = itemView.findViewById( R.id.txtangari );
            catImage = itemView.findViewById( R.id.imgcat );
        }
    }
}
