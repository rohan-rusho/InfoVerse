package com.knowultra2.infoversed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        AppCompatButton btnShare = findViewById(R.id.btnShareAnimals);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "Animals\n\n" +
                                "Definition:\n" +
                                "Animals are living beings that move, grow, and respond to their environment. They come in many shapes, sizes, and live in all parts of the world.\n\n" +
                                "Types of Animals:\n" +
                                "• Mammals (lions, humans)\n" +
                                "• Birds (eagles, parrots)\n" +
                                "• Fish (sharks, salmon)\n" +
                                "• Reptiles (snakes, turtles)\n" +
                                "• Amphibians (frogs, salamanders)\n" +
                                "• Insects (bees, butterflies)\n\n" +
                                "Why Animals Matter:\n" +
                                "Animals keep nature in balance, help pollinate plants, and are companions to humans. They are vital to the health of our planet.\n\n" +
                                "Fun Facts:\n" +
                                "• The blue whale is the largest animal ever.\n" +
                                "• Some birds can mimic human speech.\n" +
                                "• Bees communicate by dancing.\n" +
                                "• Frogs can breathe through their skin.\n\n" +
                                "Protect Our Animals\n" +
                                "Let’s learn about animals and help keep them safe for generations to come!";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}