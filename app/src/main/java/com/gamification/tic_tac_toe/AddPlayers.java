package com.gamification.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        final EditText playerOneName = findViewById(R.id.playerOneName);
        final EditText playerTwoName = findViewById(R.id.playerTwoName);
        final Button btnStart = findViewById(R.id.btnStart);


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String getPlayerOneName = playerOneName.getText().toString();
                final String getPlayerTwoName = playerTwoName.getText().toString();
                
                if(getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()){
                    Toast.makeText(AddPlayers.this, "Please enter players name", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(AddPlayers.this, MainActivity.class);
                    intent.putExtra("playerOne", getPlayerOneName);
                    intent.putExtra("playerTwo", getPlayerTwoName);
                    startActivity(intent);
                    finish();
                }
                
            }
        });
    }
}