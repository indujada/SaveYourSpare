package com.dbs.hack2hire.saveyourspare.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.dbs.hack2hire.saveyourspare.R;
import com.dbs.hack2hire.saveyourspare.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginPresenter.View {

    private LoginPresenter presenter;
    private EditText edt_userName;
    private EditText edt_passWord;
    private Button login_button;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        presenter = new LoginPresenter(this);

        edt_userName = findViewById(R.id.txt_username);
        edt_passWord = findViewById(R.id.txt_password);
        login_button = findViewById(R.id.btn_login);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.updateUserName(edt_userName.getText().toString());
                presenter.updatePassword(edt_passWord.getText().toString());
                presenter.verifyLogin();
            }
        });

    }

    @Override
    public void login(String result) {
        System.out.println("Result :: "+result);
        if(result.equals("Fail")){
            Toast.makeText(this,"Failed...", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Success...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, DashboardActivity.class);
            intent.putExtra("LOGIN_USERNAME",edt_userName.getText().toString());
            startActivity(intent);
        }
    }

    @Override
    public void getUserNameFromLogin(String userName) {
        if(userName.equals("")){
            edt_userName.setError("User Name cannot be empty");
        }
    }

    @Override
    public void getPasswordFromLogin(String password) {
        if(password.equals("")){
            edt_passWord.setError("Password cannot be empty");
        }
    }
}
