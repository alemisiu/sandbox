public class Hospital {
    private final int maxPatientsNumber = 10;
    private Patient[] patients = new Patient[maxPatientsNumber];
    private int regPatients = 0;

    public void addPatient(Patient patient) {
        if (regPatients < maxPatientsNumber) {
            patients[regPatients] = patient;
            regPatients++;
        } else {
            System.out.println("zapisano maxymalna liczbe pacjentow");
        }
    }

    public void printPatients() {
        for (int i = 0; i < regPatients; i++) {
            System.out.println(patients[i].getFirstName() + ""
                    + patients[i].getLastName() + "" + ""
                    + patients[i].getPesel());
        }
    }
}
