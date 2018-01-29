package hu.helixlab.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany
    private Set <Contact> contact = new HashSet<>();

    public Set<Contact> getContact() {
        return contact;
    }

    public void setContact(Set<Contact> contact) {
        this.contact = contact;
    }

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

    //hogy hozzá tudjunk adni egy db contactot is
    public void addContact(Contact contact) {
        this.contact.add(contact);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", note=" + note +
                ", contact=" + contact +
                '}';
    }

}
