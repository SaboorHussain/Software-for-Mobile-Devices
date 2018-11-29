package com.example.saboorhussain.mvvm2;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.saboorhussain.mvvm2.databinding.ActivityMainBinding;
import com.example.saboorhussain.mvvm2.interfaces.userlogin;
import com.example.saboorhussain.mvvm2.model.User;
import com.example.saboorhussain.mvvm2.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserModel userModel = new UserModel(new User("Enter Email Here","Enter Password Here"));

        activityMainBinding.setLogin(userModel);

        activityMainBinding.setUserloginevent(new userlogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this, ""+activityMainBinding.getLogin().getEmail(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
