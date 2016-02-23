package com.example.shobhit.moodle_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {

    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Call Login() when the button is clicked
    public void Login(View view) {
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        //textView2.setText("changed ");
        EditText userName = (EditText) findViewById(R.id.editText);
        String userNameText = userName.getText().toString();
        EditText password = (EditText) findViewById(R.id.editText2);
        String passwordText = password.getText().toString();
        String HOST = "192.168.0.105:8000";
        String urlLogin = HOST+"/default/login.json?userid="+userNameText+"&password="+passwordText;
        //textView2.setText(urlLogin);
        requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, urlLogin, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText("Response: " + response.toString());
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        TextView textView = (TextView) findViewById(R.id.textView);
                        Log.e();

                    }
                });
        requestQueue.add(jsObjRequest);
        /*
        Intent intent = new Intent(this, Homepage.class);
        intent.putExtra(Homepage.EXTRA_MESSAGE, messageText);
        startActivity(intent);
        */
    }

    //Call Clear() when the button is clicked
    public void Clear(View view) {
        EditText e1= (EditText) findViewById(R.id.editText);
        EditText e2= (EditText) findViewById(R.id.editText2);
        e1.setText("");
        e2.setText("");
    }
}
