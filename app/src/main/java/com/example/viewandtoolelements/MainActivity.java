package com.example.viewandtoolelements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showButton(View view) {
        LayoutInflater myLayoutInflater=getLayoutInflater();
        View view1=myLayoutInflater.inflate(R.layout.showlayout,null);
        TextView editText=view1.findViewById(R.id.textView);
        editText.setText("Welcome");
        Toast toast=new Toast(getApplicationContext());
        toast.setView(view1);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

    }
}