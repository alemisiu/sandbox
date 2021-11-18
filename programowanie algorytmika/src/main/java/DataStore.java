public class DataStore {
    private static final int MAX_COMPUTERS = 100;
    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private int computersNumber;

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computersNumber];
        for (int i = 0; i < computersNumber; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    void add(Computer computer) {
        if (computersNumber < MAX_COMPUTERS && computer != null)
            computers[computersNumber] = computer;
        computersNumber++;
    }

    int checkAvailability(Computer find) {
        if (find == null)
            return 0;

        int count =0;
        for(int i=0; i<computersNumber;i++){
            if(find.equals(computers[i]))
                count++;
        }
        return count;
    }
}

