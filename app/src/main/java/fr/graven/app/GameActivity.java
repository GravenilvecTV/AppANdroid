package fr.graven.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // liste de produits
        List<Produit> produits = Arrays.asList(
            new Produit("Chaussure", 50),
            new Produit("Table", 100),
            new Produit("Tabouret", 75),
            new Produit("Lit", 300)
        );
        // recuperer le recycler
        RecyclerView recyclerView = findViewById(R.id.myList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        // lui assigner son adapter
        recyclerView.setAdapter(new ProduitAdapter(produits));

    }
}