package plants.corporation.shop.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "WORKER")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String lastName;

    @Column(name = "PATRONYMIC")
    private String patronymic;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "POST")
    private String post;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "SALARY")
    private Double salary;

    @Column(name = "PASSWORD")
    private String pass;

    @Column(name = "LOGIN")
    private String login;
}
