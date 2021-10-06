public class University {
    public static void main(String[] args) {
        System.out.println("liczba studentow przed zapisami: " + Student.getStudentsNumber());
        Student s1 = new Student("Jan", "kowalski", 179304);
        Student s2 = new Student("Marek", "jarosz", 176532);
        System.out.println("Liczba studentów po zapisach: " + Student.getStudentsNumber());
    }
}

