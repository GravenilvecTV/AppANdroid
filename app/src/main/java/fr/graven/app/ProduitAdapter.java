package fr.graven.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProduitAdapter extends RecyclerView.Adapter<ProduitAdapter.ViewHolder> {

    private List<Produit> produits;

    public ProduitAdapter(List<Produit> produits) {
        this.produits = produits;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView nomProduitView;
        private final TextView prixProduitView;

        public ViewHolder(View itemView) {
            super(itemView);

            nomProduitView = itemView.findViewById(R.id.nomProduit);
            prixProduitView = itemView.findViewById(R.id.prixProduit);

        }

        public TextView getNomProduit() {
            return nomProduitView;
        }

        public TextView getPrixProduit() {
            return prixProduitView;
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_produit_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Produit produit = produits.get(position);

        holder.nomProduitView.setText(produit.getName());
        holder.prixProduitView.setText(produit.getPrice() + "€");
    }

    @Override
    public int getItemCount() {
        return produits.size();
    }
}
