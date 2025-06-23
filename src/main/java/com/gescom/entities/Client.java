package com.gescom.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("2")
@EqualsAndHashCode(callSuper = false)
public class Client extends Person implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    private String birthday;
}
