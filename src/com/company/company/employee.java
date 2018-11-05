package com.company.company;

public class employee {
    private String fname;
    private String lname;
    private String UserName;
    private int Password;
    
     public employee(String fname, String lname, String UserName, int Password){
         this.fname=fname;
         this.lname=lname;
         this.UserName=UserName;
         this.Password=Password;
     }
    public String getUserName()
    {
        return UserName;
    }
    public void setUserName(String UserName)
    {
        this.UserName=UserName;
    }

    public int getPassword() {
        return Password;
    }
    public void setPassword(int password){
        this.Password=password;
    }
    public String getFname(){
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

}