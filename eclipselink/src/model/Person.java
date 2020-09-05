package model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Person{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String name;

    @ManyToMany
    private final List<Address> addresses = new ArrayList<>();

    @OneToMany(mappedBy = "person")
    private final List<CreditCard> creditCards = new ArrayList<>();

}