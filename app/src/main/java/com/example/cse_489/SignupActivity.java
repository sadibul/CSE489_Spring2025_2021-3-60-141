package com.example.cse_489;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {


    private EditText etname, etemail, etphone, etpassowrd, etconfirmpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button btnHaveAccount = findViewById(R.id.BtnHaveAccount);
        Button btnSignup = findViewById(R.id.BtnSignup);
        Button btnExit = findViewById(R.id.BtnExit);

        etname = findViewById(R.id.EtName);
        etemail = findViewById(R.id.EtEmail);
        etphone = findViewById(R.id.EtPhone);
        etpassowrd = findViewById(R.id.EtPassword);
        etconfirmpassword = findViewById(R.id.EtConfirmPassword);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("This is not implemented yet");
            }
        });


        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Sign Up Button Clicked");
                String name = etname.getText().toString();
                String email = etemail.getText().toString();
                String phone = etphone.getText().toString();
                String pass = etpassowrd.getText().toString();
                String confirmPass = etconfirmpassword.getText().toString();

                System.out.println("Name: "+name);
                System.out.println("Email: "+email);
                System.out.println("Phone: "+phone);
                System.out.println("Password: "+pass);
                System.out.println("ConfirmPassword: "+confirmPass);

            }
        });




    }
}