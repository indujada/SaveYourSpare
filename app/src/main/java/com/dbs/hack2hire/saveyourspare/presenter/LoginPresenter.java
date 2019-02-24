package com.dbs.hack2hire.saveyourspare.presenter;

import com.dbs.hack2hire.saveyourspare.model.LoginResponse;
import com.dbs.hack2hire.saveyourspare.model.User;
import com.dbs.hack2hire.saveyourspare.rest.ApiClient;
import com.dbs.hack2hire.saveyourspare.rest.LoginApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class LoginPresenter {
    private User user;
    private View view;
    private LoginResponse loginResponse;

    public LoginPresenter(View view) {
        this.user = new User();
        this.view = view;
        this.loginResponse = new LoginResponse();
    }

    public void updateUserName(String userName){
        user.setUserName(userName);
        view.getUserNameFromLogin(userName);
    }

    public void updatePassword(String passWord){
        user.setPassWord(passWord);
        view.getPasswordFromLogin(passWord);
    }

    public void verifyLogin(){
        System.out.println("verifyLogin :: "+user.getUserName()+"..."+user.getPassWord());
        if(user.getUserName().equals("Test") && user.getPassWord().equals("1234")){
            loginResponse.setResult("Success");
            view.login("Success");
        }else{
            loginResponse.setResult("Fail");
            view.login("Fail");
        }
        /*LoginApiInterface apiInterface = ApiClient.getClient().create(LoginApiInterface.class);
        Call<LoginResponse> call = apiInterface.checkLogin(user.getUserName(),user.getPassWord());
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                String result = response.body().getResult();
                view.login(result);
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                view.login("");
            }
        });*/
    }

    public interface View{
        void login(String success);
        void getUserNameFromLogin(String userName);
        void getPasswordFromLogin(String password);
    }
}