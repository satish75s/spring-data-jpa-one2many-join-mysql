package com.onetomany.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String gender;
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
    private List<Product> products;
}
