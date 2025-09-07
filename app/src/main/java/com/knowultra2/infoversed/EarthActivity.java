package com.knowultra2.infoversed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class EarthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth);

        AppCompatButton btnShare = findViewById(R.id.btnShareEarth);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "What is Earth?\n\n" +
                                "Definition:\n" +
                                "Earth is our home planet, the third planet from the Sun. It is the only known world to support life, with diverse ecosystems, vast oceans, and a protective atmosphere.\n\n" +
                                "Unique Features:\n" +
                                "• 71% surface covered by water\n" +
                                "• Rich diversity of plants and animals\n" +
                                "• Atmosphere with oxygen\n" +
                                "• Plate tectonics shape continents\n" +
                                "• Only planet with liquid water at the surface\n\n" +
                                "Why Is Earth Special?\n" +
                                "Earth's unique conditions—right temperature, water, atmosphere, and magnetic field—make it perfect for life to exist and thrive.\n\n" +
                                "Fun Facts:\n" +
                                "• Earth is about 4.5 billion years old\n" +
                                "• The highest point is Mount Everest (8,848 m)\n" +
                                "• The deepest ocean trench is the Mariana Trench (~11,000 m)\n" +
                                "• Earth travels around the Sun at 107,000 km/h\n\n" +
                                "Why We Love Earth:\n" +
                                "Earth is our only home—let’s learn about it, enjoy its beauty, and protect it for future generations!";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}