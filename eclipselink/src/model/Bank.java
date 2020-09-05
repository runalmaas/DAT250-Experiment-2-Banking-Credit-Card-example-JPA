package model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String name;

    @OneToMany
    private List<CreditCard> creditCards = new ArrayList<>();
}
