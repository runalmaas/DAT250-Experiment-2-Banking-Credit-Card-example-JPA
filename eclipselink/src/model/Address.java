package model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String street;
    private int number;

    @ManyToMany
    private final List<Person> personList = new ArrayList<>();
}
