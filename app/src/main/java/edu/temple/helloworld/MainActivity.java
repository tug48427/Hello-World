package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.MyButton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView newTextView =  findViewById(R.id.textView);
                newTextView.setText(R.string.newMessage);
            }
        });
    }



}
