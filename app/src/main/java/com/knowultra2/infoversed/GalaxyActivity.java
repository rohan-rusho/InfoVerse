package com.knowultra2.infoversed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class GalaxyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galaxy);

        AppCompatButton btnShare = findViewById(R.id.btnShareGalaxy);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "Galaxies\n\n" +
                                "Definition:\n" +
                                "A galaxy is a massive system of stars, planets, gas, and dust held together by gravity. The Milky Way is our galaxy.\n\n" +
                                "Types of Galaxies:\n" +
                                "• Spiral (like the Milky Way)\n• Elliptical\n• Irregular\n• Lenticular\n\n" +
                                "Why Galaxies Matter:\n" +
                                "Galaxies are the building blocks of the universe. Studying them helps us understand the cosmos and our place in it.\n\n" +
                                "Fun Facts:\n" +
                                "• The Milky Way has over 100 billion stars.\n" +
                                "• Some galaxies are 100 times bigger than ours.\n" +
                                "• The closest galaxy is Andromeda.\n" +
                                "• Galaxies can collide and merge.\n\n" +
                                "Explore the Universe\n" +
                                "Look up at the night sky and imagine the billions of galaxies out there!";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}