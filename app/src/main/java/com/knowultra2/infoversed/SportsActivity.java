package com.knowultra2.infoversed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class SportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        AppCompatButton btnShare = findViewById(R.id.btnShareSports);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "Sports\n\n" +
                                "Definition:\n" +
                                "Sports are physical games and activities played individually or in teams for fun, fitness, and competition.\n\n" +
                                "Popular Sports:\n" +
                                "• Soccer (Football)\n• Basketball\n• Cricket\n• Tennis\n• Swimming\n• Athletics\n• Baseball\n\n" +
                                "Why Sports Matter:\n" +
                                "Sports keep us healthy, teach teamwork and discipline, and bring people together from around the world.\n\n" +
                                "Fun Facts:\n" +
                                "• Soccer is the most popular sport globally.\n" +
                                "• The Olympic Games date back to ancient Greece.\n" +
                                "• Cricket matches can last up to 5 days!\n" +
                                "• Basketball was invented in 1891.\n\n" +
                                "Get Moving!\n" +
                                "Try a new sport, play with friends, and have fun while staying healthy!";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}