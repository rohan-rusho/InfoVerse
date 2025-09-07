package com.knowultra2.infoversed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class InventionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventions);

        AppCompatButton btnShare = findViewById(R.id.btnShareInventions);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "Inventions\n\n" +
                                "Definition:\n" +
                                "Inventions are creative ideas turned into devices, machines, or processes that solve problems and make life easier.\n\n" +
                                "Famous Inventions:\n" +
                                "• The wheel\n• The printing press\n• The light bulb\n• The telephone\n• The airplane\n• The computer\n• The Internet\n\n" +
                                "Why Inventions Matter:\n" +
                                "Inventions drive progress. They make our lives safer, more comfortable, and open up new possibilities for the future.\n\n" +
                                "Fun Facts:\n" +
                                "• The first wheel was invented around 3500 BC.\n" +
                                "• The printing press revolutionized knowledge sharing.\n" +
                                "• The Internet is one of the fastest spreading inventions ever.\n\n" +
                                "Imagine, Create, Invent!\n" +
                                "What will you invent next? Your ideas could change the world!";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}