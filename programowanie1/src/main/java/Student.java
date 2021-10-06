class Student {
    private static int studentsNumber = 0;

    private String firstName;
    private String lastName;
    private int index;

    Student(String firstName, String lastName, int index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
        // przy każdym wywołaniu konstruktora zwiększamy liczbę studentów
        studentsNumber++;
    }

    public static int getStudentsNumber() {
        return studentsNumber;
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
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
}