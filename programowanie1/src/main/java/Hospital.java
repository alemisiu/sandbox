public class Hospital {
    private final int maxPatientsNumber =10;
private Patient[] patients = new Patient[maxPatientsNumber];
private int regPatiens = 0;

public void addPatient(Patient patient){
    if(regPatiens < maxPatientsNumber){
        patients[regPatiens] = patient;
        regPatients++;
    }else{
        System.out.println("zapisano maxymalna liczbe pacjentow");
    }
}
public void printPatients(){
    for(int i=0; i<regPatiens;i++){
        System.out.println(patients[i].getFirstName() +""
         +patients[i].getLastName() +"" + ""
        +patients[i].getPesel());
    }
}
}
