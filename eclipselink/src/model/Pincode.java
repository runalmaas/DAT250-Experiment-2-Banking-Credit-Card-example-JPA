package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String pincode;
    private int count;

    @OneToOne
    private CreditCard creditCard;
}
