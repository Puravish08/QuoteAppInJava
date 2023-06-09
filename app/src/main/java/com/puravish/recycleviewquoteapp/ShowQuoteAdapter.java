package com.puravish.recycleviewquoteapp;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShowQuoteAdapter extends RecyclerView.Adapter<ShowQuoteAdapter.myViewHolder> {


    ShowQuoteActivity contextshowQuoteActivity;

    ArrayList<ShowQuoteModel> showCategori;



    ShayariInterface shayariInterface;



    public ShowQuoteAdapter(ShowQuoteActivity contextshowQuoteActivity, ArrayList<ShowQuoteModel> showCategori) {
        this.showCategori = showCategori;
        this.contextshowQuoteActivity = contextshowQuoteActivity;

    }


    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.showtext.setText(showCategori.get(position).showquotesName);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                shayariInterface.onClick(showCategori.get(position).showquotesName);

            }
        });


        holder.copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ClipboardManager clipboard = (ClipboardManager) contextshowQuoteActivity.getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("simple text", holder.showtext.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(contextshowQuoteActivity, "Copy Success", Toast.LENGTH_SHORT).show();


            }
        });

        holder.linebac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });


        holder.share.setOnClickListener(v -> {

            Intent p = new Intent(Intent.ACTION_SEND);
            p.setType("text/plain");

            String shyari_item = showCategori.get(position).showquotesName;
            p.putExtra(Intent.EXTRA_TEXT, shyari_item);
            Intent chooser = Intent.createChooser(p, "Share");
            chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            contextshowQuoteActivity.startActivity(chooser);
        });


    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        TextView showtext;

        LinearLayout copy, share,linebac;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            showtext = itemView.findViewById(R.id.txtshowquote);

            copy = itemView.findViewById(R.id.copy);
            share = itemView.findViewById(R.id.share);
            linebac = itemView.findViewById(R.id.linbackg);

        }
    }


    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(contextshowQuoteActivity).inflate(R.layout.show_quote_item_file, parent, false);
        myViewHolder myViewHolder = new myViewHolder(v);
        return myViewHolder;
    }


    @Override
    public int getItemCount() {
        return showCategori.size();
    }


}
