package com.medical.waste.bean;

import java.io.Serializable;

public class LoginData implements Serializable {
    public User user;
    public HospitalInfo hospitalInfo;
    public String token;
}
