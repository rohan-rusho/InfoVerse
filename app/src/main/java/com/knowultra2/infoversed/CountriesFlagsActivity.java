package com.knowultra2.infoversed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class CountriesFlagsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries_flags);

        AppCompatButton btnShare = findViewById(R.id.btnShareCountries);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "Countries & Flags\n\n" +
                                "Definition:\n" +
                                "Countries are distinct territories with their own governments, cultures, and identities. Flags are unique symbols that represent each country and its people.\n\n" +
                                "Why Do Flags Matter?\n" +
                                "Flags use colors, symbols, and patterns to showcase a country's history, values, and hopes. They unite people and are used in celebrations, sports, and diplomacy.\n\n" +
                                "How Many Countries?\n" +
                                "There are 195 countries recognized today, each with its own flag. Some flags are centuries old, while others are quite new.\n\n" +
                                "Fun Facts:\n" +
                                "• The oldest flag still in use is Denmark's, from 1219.\n" +
                                "• Nepal's flag is the only non-rectangular national flag.\n" +
                                "• Some countries have changed flags many times in their history.\n" +
                                "• The Olympic flag contains the colors of every nation's flag!\n\n" +
                                "Explore the World!\n" +
                                "Discover amazing countries, learn about their cultures, and recognize their flags. Every flag tells a unique story!";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}