package com.elmernissi.myrestufinder.MyAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.elmernissi.myrestufinder.R;
import com.elmernissi.myrestufinder.model.Magasin;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MagasinViewHolder>{
    private List<Magasin> magasins;
    public MyAdapter(List<Magasin> magasins) {
        this.magasins = magasins;
    }
    public static class MagasinViewHolder extends RecyclerView.ViewHolder {
        TextView nomTextView, adresseTextView, telephoneTextView;
        public MagasinViewHolder(@NonNull View itemView) {
            super(itemView);
            nomTextView = itemView.findViewById(R.id.nomTextView);
            adresseTextView = itemView.findViewById(R.id.adresseTextView);
            telephoneTextView = itemView.findViewById(R.id.telephoneTextView);
        }
    }

    @NonNull
    @Override
    public MagasinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_magasin_item, parent, false);
        return new MagasinViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MagasinViewHolder holder, int position) {
        Magasin magasin = magasins.get(position);
        holder.nomTextView.setText(magasin.getNom());
        holder.adresseTextView.setText(magasin.getAdresse());
        holder.telephoneTextView.setText(magasin.getTelephone());
    }


    @Override
    public int getItemCount() {
        return magasins.size();
    }
}