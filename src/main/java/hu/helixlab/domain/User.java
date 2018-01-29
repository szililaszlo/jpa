package hu.helixlab.domain;

import javax.persistence.*;
import java.io.Serializable;
//Entity maga az user
@Entity
@Table(name = "user_jpa",schema = "public")

@NamedQueries(
        @NamedQuery( query = "select u from User u", name = "getAllUser")

)

public class User implements Serializable{
    @Id //ő lesz a primary key
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String email;

    @OneToOne
    private Note note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", note=" + note +
                '}';
    }

}
