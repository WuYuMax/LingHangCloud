package com.linghangcloud.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//登录界面
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent=new Intent(LoginActivity.this,HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
