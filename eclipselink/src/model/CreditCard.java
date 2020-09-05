package model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int number;
    private int limit;
    private int balance;

    @OneToOne
    private Bank bank;

    @ManyToOne
    private Person person;

    @OneToOne
    private Pincode pincode;

}
