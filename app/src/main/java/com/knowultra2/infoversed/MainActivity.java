package com.knowultra2.infoversed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Card click listeners
        findViewById(R.id.cardSpace).setOnClickListener(v ->
                startActivity(new Intent(this, SpaceActivity.class))
        );
        findViewById(R.id.cardEarth).setOnClickListener(v ->
                startActivity(new Intent(this, EarthActivity.class))
        );
        findViewById(R.id.cardCountries).setOnClickListener(v ->
                startActivity(new Intent(this, CountriesFlagsActivity.class))
        );
        findViewById(R.id.cardInventions).setOnClickListener(v ->
                startActivity(new Intent(this, InventionsActivity.class))
        );
        findViewById(R.id.cardFamousPeople).setOnClickListener(v ->
                startActivity(new Intent(this, FamousPeopleActivity.class))
        );
        findViewById(R.id.cardAnimals).setOnClickListener(v ->
                startActivity(new Intent(this, AnimalsActivity.class))
        );
        findViewById(R.id.cardSports).setOnClickListener(v ->
                startActivity(new Intent(this, SportsActivity.class))
        );
        findViewById(R.id.cardPlanets).setOnClickListener(v ->
                startActivity(new Intent(this, PlanetActivity.class))
        );
        findViewById(R.id.cardSun).setOnClickListener(v ->
                startActivity(new Intent(this, SunActivity.class))
        );
        findViewById(R.id.cardGalaxy).setOnClickListener(v ->
                startActivity(new Intent(this, GalaxyActivity.class))
        );
    }
}