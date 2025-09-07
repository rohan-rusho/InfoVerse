package com.knowultra2.infoversed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class SpaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space);

        AppCompatButton btnShare = findViewById(R.id.btnShareSpace);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "What is Space?\n\n" +
                                "Definition:\n" +
                                "Space is the vast, seemingly infinite expanse that exists beyond the Earth and its atmosphere. It contains all celestial bodies—stars, planets, moons, asteroids, comets—as well as the vacuum between them.\n\n" +
                                "How Big is Space?\n" +
                                "Space has no known boundaries. The observable universe stretches about 93 billion light-years in diameter, but it may be much larger—or even infinite.\n\n" +
                                "Key Features:\n" +
                                "• Microgravity (almost no gravity)\n" +
                                "• Extremely cold (except near stars)\n" +
                                "• No air, so no sound\n" +
                                "• Filled with cosmic radiation\n" +
                                "• Home to galaxies, stars, planets, and more\n\n" +
                                "What Can We Do in Space?\n" +
                                "• Explore other planets and moons\n" +
                                "• Study stars, galaxies, and black holes\n" +
                                "• Launch satellites for communication and GPS\n" +
                                "• Conduct scientific experiments in microgravity\n" +
                                "• Search for life beyond Earth\n\n" +
                                "Fun Facts:\n" +
                                "• Space is completely silent—sound can't travel in a vacuum\n" +
                                "• The hottest planet is Venus, not Mercury\n" +
                                "• Neutron stars can spin 600+ times per second\n" +
                                "• There are more stars in the universe than grains of sand on Earth\n\n" +
                                "How Space Inspires This App:\n" +
                                "InfoVerse takes you on a journey across the universe! Explore facts about space, planets, and galaxies to satisfy your cosmic curiosity.";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}