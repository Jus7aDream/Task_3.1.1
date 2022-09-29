package com.artour.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * @ In the name of Allah, most gracious and most merciful 12.09.2022
 */
@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 255, message = "Name should be between 2 and 255 characters")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "Nickname should not be empty")
    @Size(min = 2, max = 255, message = "Name should be between 2 and 255 characters")
    @Column(name = "nickname")
    private String nickname;

    @Min(value = 0, message = "Age should be greater than 0")
    @Column(name = "age")
    private int age;

    @NotEmpty(message = "Email should be not empty")
    @Email(message = "Email should be valid")
    @Column(name = "email")
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}