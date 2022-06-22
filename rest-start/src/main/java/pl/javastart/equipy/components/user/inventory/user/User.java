package pl.javastart.equipy.components.user.inventory.user;

import pl.javastart.equipy.components.user.assignment.Assignment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "UserData")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String pesel;

    @OneToMany(mappedBy = "user")
    private List<Assignment> assignments = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User userDbo = (User) o;
        return Objects.equals(id, userDbo.id) &&
                Objects.equals(firstName, userDbo.firstName) &&
                Objects.equals(lastName, userDbo.lastName) &&
                Objects.equals(pesel, userDbo.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, pesel);
    }
}