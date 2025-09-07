package com.knowultra2.infoversed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class SunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun);

        AppCompatButton btnShare = findViewById(R.id.btnShareSun);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "The Sun\n\n" +
                                "Definition:\n" +
                                "The Sun is a giant ball of hot, glowing gases at the center of our solar system. It provides light and heat to Earth.\n\n" +
                                "Key Facts:\n" +
                                "• The Sun is a star, not a planet.\n" +
                                "• It’s 109 times wider than Earth.\n" +
                                "• Its gravity holds the solar system together.\n" +
                                "• Made mostly of hydrogen and helium.\n\n" +
                                "Why the Sun Matters:\n" +
                                "The Sun gives us energy for life, weather, and climate. Without the Sun, Earth would be dark and cold.\n\n" +
                                "Fun Facts:\n" +
                                "• The Sun is about 4.6 billion years old.\n" +
                                "• It takes 8 minutes for sunlight to reach Earth.\n" +
                                "• The Sun’s core is 15 million °C.\n" +
                                "• Sunspots are cooler, dark areas on the Sun.\n\n" +
                                "Shine Bright!\n" +
                                "Thank the Sun for every sunny day and all the life on Earth!";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}