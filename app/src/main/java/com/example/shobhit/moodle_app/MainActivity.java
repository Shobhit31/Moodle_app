package com.example.shobhit.moodle_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Call Login() when the button is clicked
    public void Login(View view) {
        EditText messageView = (EditText) findViewById(R.id.editText);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this, Homepage.class);
        intent.putExtra(Homepage.EXTRA_MESSAGE, messageText);
        startActivity(intent);
    }

    //Call Clear() when the button is clicked
    public void Clear(View view) {
        EditText e1= (EditText) findViewById(R.id.editText);
        EditText e2= (EditText) findViewById(R.id.editText2);
        e1.setText("");
        e2.setText("");
    }
}
