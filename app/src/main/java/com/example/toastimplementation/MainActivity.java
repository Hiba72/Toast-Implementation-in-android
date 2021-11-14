package com.example.toastimplementation;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        Button btn1=findViewById(R.id.button2);
       // Toast toast=Toast.makeText(this,"Toast text",Toast.LENGTH_LONG);
       // toast.show();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              showToast();
            }
        });
btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Do you want to leave?");
        builder.setTitle("Alert!");
        builder.setCancelable(true);
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
});


    }
    public void showToast(){
        LayoutInflater layoutInflater= getLayoutInflater();
        View myLayout=layoutInflater.inflate(R.layout.my_layout,(ViewGroup)findViewById(R.id.dialog_container) );

        Toast myToast=new Toast(getApplicationContext());
        myToast.setDuration(Toast.LENGTH_LONG);
        myToast.setView(myLayout);
        myToast.show();
        // ImageView cameraImage=myLayout.findViewById(R.id.imageView);
        //  TextView myMessage=(TextView) myLayout.findViewById(R.id.textView);
        // myMessage.setText("My Custom Toast");
        //  myToast.setGravity(Gravity.CENTER,0,0);

    }

}