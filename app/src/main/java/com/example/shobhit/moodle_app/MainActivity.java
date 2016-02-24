package com.example.shobhit.moodle_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

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
