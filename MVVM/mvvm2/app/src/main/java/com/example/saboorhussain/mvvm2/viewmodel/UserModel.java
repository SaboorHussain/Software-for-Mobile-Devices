package com.example.saboorhussain.mvvm2.viewmodel;
import android.databinding.BaseObservable;

import com.example.saboorhussain.mvvm2.R;
import com.example.saboorhussain.mvvm2.model.User;

public class UserModel extends BaseObservable{

    private String email;
    private String password;
    private String emailhint;
    private String passwordhint;

    public UserModel(User user) {
        this.emailhint = user.emailhint;
        this.passwordhint = user.passwordhint;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(R.id.etemailid);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.etpasswordid);
    }

    public String getEmailhint() {
        return emailhint;
    }

    public void setEmailhint(String emailhint) {
        this.emailhint = emailhint;
    }

    public String getPasswordhint() {
        return passwordhint;
    }

    public void setPasswordhint(String passwordhint) {
        this.passwordhint = passwordhint;
    }
}
