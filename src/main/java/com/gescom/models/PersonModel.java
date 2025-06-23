package com.gescom.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonModel {
    private String name;
    private String email;
    private String address;
    private String telephone;
    private String birthday;
    private String code;
    private String raisonSocial;
    private String AccountBank;
}
