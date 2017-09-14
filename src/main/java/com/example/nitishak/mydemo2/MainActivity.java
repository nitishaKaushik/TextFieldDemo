package com.example.nitishak.mydemo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText pass_word;
    private Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerOnButton();
    }
    public void addListnerOnButton(){
        pass_word = (EditText)findViewById(R.id.editText);
        btn_submit = (Button)findViewById(R.id.button);
       btn_submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(
                       MainActivity.this,
                       pass_word.getText(), Toast.LENGTH_SHORT).show();

           }
       });
    }
}
