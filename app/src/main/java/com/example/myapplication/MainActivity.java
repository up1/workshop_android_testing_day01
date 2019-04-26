package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements LoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void doLogin(){
    }

    public void onSignIn(View view) {
        EditText username = findViewById(R.id.et_username);
        EditText password = findViewById(R.id.et_passsword);
        // TODO
        LoginPresenter loginPresenter = new LoginPresenter();
        loginPresenter.setLoginView(this);
        loginPresenter.login(username.getText().toString(),
                password.getText().toString());
    }

    @Override
    public void success() {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("RESULT", "Success!!!");
        startActivity(intent);
    }

    @Override
    public void failure() {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("RESULT", "Failure");
        startActivity(intent);
    }

}
