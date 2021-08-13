class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.firstName = "Jan";
        emp1.lastName = "Kowalski";
        emp1.birthYear = 1987;
        emp1.seniority = 4;

        Employee emp2 = new Employee();
        emp2.firstName = "Maria";
        emp2.lastName = "Doniewska";
        emp2.birthYear = 1992;
        emp2.seniority = 2;

        Employee emp3 = new Employee();
        emp3.firstName = "Marek";
        emp3.lastName = "Kownacki";
        emp3.birthYear = 1990;
        emp3.seniority = 3;

        System.out.println("Pracownicy w firmie: ");
        System.out.println(emp1.firstName + " " + emp1.lastName + ", ur. " + emp1.birthYear + ", staż: "
                + emp1.seniority + " lata");
        System.out.println(emp2.firstName + " " + emp2.lastName + ", ur. " + emp2.birthYear + ", staż: "
                + emp2.seniority + " lata");
        System.out.println(emp3.firstName + " " + emp3.lastName + ", ur. " + emp3.birthYear + ", staż: "
                + emp3.seniority + " lata");
    }
}