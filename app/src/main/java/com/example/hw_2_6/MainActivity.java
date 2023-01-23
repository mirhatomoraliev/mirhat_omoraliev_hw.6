package com.example.hw_2_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast1 = Toast.makeText(getApplicationContext(), "Вы успешно зарегистрировались", Toast.LENGTH_SHORT);
        Toast toast0 = Toast.makeText(getApplicationContext(), "Неправильный логин или пароль", Toast.LENGTH_SHORT);
        TextView enter= findViewById(R.id.tv_enter);
        LinearLayout login = findViewById(R.id.et_login);
        TextView welcome = findViewById(R.id.second);
        EditText gmail = findViewById(R.id.gmail);
        EditText password = findViewById(R.id.password);
        Button button = findViewById(R.id.btn);
        LinearLayout end = findViewById(R.id.end);

        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (gmail.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (password.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gmail.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    enter.setVisibility(View.GONE);
                    login.setVisibility(View.GONE);
                    welcome.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);
                    toast1.show();
                } else {
                    toast0.show();
                }
            }
        });
    }
}