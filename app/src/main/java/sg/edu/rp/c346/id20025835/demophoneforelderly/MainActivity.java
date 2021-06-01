package sg.edu.rp.c346.id20025835.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonSon;
    Button buttonDaughter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSon = findViewById(R.id.buttonCallSon);
        buttonDaughter = findViewById(R.id.buttonCallDaughter);

        buttonSon.setOnClickListener((view) -> {
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 92240336));
            startActivity(intentCall);
        });

        buttonDaughter.setOnClickListener((view) -> {
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 89675543));
            startActivity(intentCall);
        });
    }
}