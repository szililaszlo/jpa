package hu.helixlab.domain;

import javax.persistence.*;
import java.io.Serializable;
//Entity maga az user
@Entity
@Table(name = "user_jpa",schema = "public")
public class User implements Serializable{
    @Id //ő lesz a primary key
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
