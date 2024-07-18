package com.CustomerApiApplication.CustomerApiApplication;

import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cus_id;

    @Column(length = 20,nullable = false)
    private String cus_fist_name;

    @Column(length = 20,nullable = false)
    private String cus_last_name;

    @Column(length = 20,unique = true,nullable = false)
    private String cus_phonenumber;

    public int getCus_id(){
        return cus_id;
    }
    public void setCus_id(int cus_id){
        this.cus_id=cus_id;
    }
    public String getCus_fist_name(){
        return cus_fist_name;
    }
    public void setCus_fist_name(String cus_fist_name){
        this.cus_fist_name=cus_fist_name;
    }
    public String getCus_last_name(){
        return cus_last_name;
    }
    public void setCus_last_name(String cus_last_name){
        this.cus_last_name=cus_last_name;
    }
    public String getCus_phonenumber(){
        return cus_phonenumber;
    }

    public void setCus_phonenumber(String cus_phonenumber){
        this.cus_phonenumber=cus_phonenumber;
    }
}

