package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TextView tv; //declaring a TextView  variable named  as tv
    Button button; //declaring a Button variable  named as btn

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);//using findViewbyId() method to get the id of TextView which is previously declared
        button=findViewById(R.id.button);//using findViewbyId() method to get the id of Button which is previously declared
        button.setOnClickListener(new View.OnClickListener() { //method to be performed when the user clicks on button
            @Override
            public void onClick(View v) {//method to view data on click
                tv.setText("You have clicked the button");//we are setting the wanted text in the text view when we clicked on button



            }
        });
    }
}


