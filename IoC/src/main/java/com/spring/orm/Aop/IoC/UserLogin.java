package com.spring.orm.Aop.IoC;

public class UserLogin {
    private User user;
    public UserLogin(){}
    public UserLogin(User user) {
        this.user = user;
    }
    public boolean UserLogin(User user){
        if(user.getAccount().equals("admin")&&user.getPassword().equals("111")){
            return true;
        }else{
            return false;
        }
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
