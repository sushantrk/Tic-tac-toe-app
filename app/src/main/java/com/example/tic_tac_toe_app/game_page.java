package com.example.tic_tac_toe_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class game_page extends AppCompatActivity {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    public int count=0;
    public int flag=0;
    String bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    private TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page);
        getSupportActionBar().hide();
//         View overlay=findViewById(R.id.mylayout);
//        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//        |View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
//                );

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);


    }

    public void click(View view) {
        Button btncurrent = (Button)view;//convert  view into button view //precondition: it should be view of function-button ;

        if (btncurrent.getText().toString().equals("")) {
            count++;
//        assigning the x n o to buttons
            if (flag == 0) {
                btncurrent.setText("X");
//                Toast.makeText(this, "player 0 turn ", Toast.LENGTH_SHORT).show();
                flag = 1;
            } else {
                btncurrent.setText("O");
                flag = 0;
//                Toast.makeText(this, "player X turn ", Toast.LENGTH_SHORT).show();

            }

            if (count > 4) {
                //saving text in the new string
                bt1 = b1.getText().toString();
                bt2 = b2.getText().toString();
                bt3 = b3.getText().toString();
                bt4 = b4.getText().toString();
                bt5 = b5.getText().toString();
                bt6 = b6.getText().toString();
                bt7 = b7.getText().toString();
                bt8 = b8.getText().toString();
                bt9 = b9.getText().toString();
                // conditions
                if (bt1.equals(bt2) && bt2.equals(bt3) && !bt1.equals("")) {
                    Toast.makeText(this, "The winner is : " + bt1, Toast.LENGTH_SHORT).show();

                    restart();
                } else if (bt4.equals(bt5) && bt5.equals(bt6) && !bt4.equals("")) {
                    Toast.makeText(this, "The winner is : " + bt4, Toast.LENGTH_SHORT).show();         //vertival(3)

                    restart();
                } else if (bt7.equals(bt8) && bt8.equals(bt9) && !bt7.equals("")) {
                    Toast.makeText(this, "The winner is : " + bt7, Toast.LENGTH_SHORT).show();

                    restart();
                } else if (bt1.equals(bt4) && bt4.equals(bt7) && !bt1.equals("")) {
                    Toast.makeText(this, "The winner is : " + bt1, Toast.LENGTH_SHORT).show();

                    restart();
                } else if (bt2.equals(bt5) && bt5.equals(bt8) && !bt2.equals("")) {
                    Toast.makeText(this, "The winner is : " + bt2, Toast.LENGTH_SHORT).show();         //horizontal(3)

                    restart();
                } else if (bt3.equals(bt6) && bt6.equals(bt9) && !bt3.equals("")) {
                    Toast.makeText(this, "The winner is : " + bt3, Toast.LENGTH_SHORT).show();

                    restart();
                } else if (bt1.equals(bt5) && bt5.equals(bt9) && !bt1.equals("")) {
                    Toast.makeText(this, "The winner is : " + bt1, Toast.LENGTH_SHORT).show();

                    restart();
                }                                                                                               //cross
                else if (bt3.equals(bt5) && bt5.equals(bt7) && !bt3.equals("")) {
                    Toast.makeText(this, "The winner is : " + bt3, Toast.LENGTH_SHORT).show();

                    restart();
                } else if (count == 9) {
                    Toast.makeText(this, "New game...Wait for few 5 sec : ", Toast.LENGTH_SHORT).show();

                    restart();
                }

            }
        }
    }
    public void restart(){
        //for new game
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        flag=0;
        count=0;
    }
}