package com.knowultra2.infoversed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class FamousPeopleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_people);

        AppCompatButton btnShare = findViewById(R.id.btnShareFamousPeople);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "Famous People\n\n" +
                                "Definition:\n" +
                                "Famous people are individuals who have made significant contributions to society, culture, science, or history and are recognized around the world.\n\n" +
                                "Examples:\n" +
                                "• Albert Einstein (Science)\n" +
                                "• Marie Curie (Science)\n" +
                                "• Nelson Mandela (Leadership)\n" +
                                "• Malala Yousafzai (Activism)\n" +
                                "• Leonardo da Vinci (Art)\n" +
                                "• Martin Luther King Jr. (Activism)\n\n" +
                                "Why They Matter:\n" +
                                "Famous people inspire us, break barriers, and show what is possible with courage, creativity, and determination.\n\n" +
                                "Fun Facts:\n" +
                                "• Einstein didn’t speak until he was four.\n" +
                                "• Marie Curie was the first person to win two Nobel Prizes.\n" +
                                "• Da Vinci invented designs for airplanes and tanks.\n\n" +
                                "Be Inspired!\n" +
                                "You can make a difference too. Dream big and work hard!";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}