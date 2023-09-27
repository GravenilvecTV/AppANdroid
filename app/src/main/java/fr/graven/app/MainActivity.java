package fr.graven.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myText = findViewById(R.id.myText);
        myText.setTextSize(30);
        myText.setAllCaps(true);
        myText.setTextColor(getResources().getColor(R.color.purple_700));

        Button myButton = findViewById(R.id.myBtn);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myText.setText("Click ok");
            }
        });

        Button myButton2 = findViewById(R.id.myBtn2);
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GameActivity.class));

            }
        });

    }
}