package pl.javastart;

public class Client {
    private String firstName;
    private String lastName;
    private boolean premium;
    private int age;

    public Client(String firstName, String lastName, boolean premium, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.premium = premium;
        this.age = age;
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

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public int getAge() {
        return age;
    }
}