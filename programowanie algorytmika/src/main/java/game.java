class GameCharacter {
    private String name;
    private int energy;
    private int attack;
    private int defense;

    public GameCharacter(String name, int energy, int attack, int defense) {
        this.name = name;
        this.energy = energy;
        this.attack = attack;
        this.defense = defense;
    }

    double totalAttack() {
        return attack;
    }

    double totalDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
class AttackCharacter extends GameCharacter {
    private double extraAttack;

    public AttackCharacter(String name, int energy, int attack, int defense, double extraAttack) {
        super(name, energy, attack, defense);
        this.extraAttack = extraAttack;
    }

    @Override
    double totalAttack() {
        return getAttack() + extraAttack * getAttack();
    }

    public double getExtraAttack() {
        return extraAttack;
    }

    public void setExtraAttack(double extraAttack) {
        this.extraAttack = extraAttack;
    }
}
class DefenseCharacter extends GameCharacter{
    private double extraDefense;

    public DefenseCharacter(String name, int energy, int attack, int defense, double extraDefense) {
        super(name, energy, attack, defense);
        this.extraDefense = extraDefense;
}
@Override
double totalDefense(){
    return getDefense() + getDefense() * extraDefense;
    }
  public double getExtraDefense(){
        return extraDefense;
  }
  public void setExtraDefense(double extraDefense){
        this.extraDefense = extraDefense;
  }
}
class Team {
    private String name;
    private GameCharacter[] characters = new GameCharacter[3];

    public Team(String name, GameCharacter character2, GameCharacter character3, GameCharacter character1) {
        this.name = name;
        this.characters[0] = character1;
        this.characters[1] = character2;
        this.characters[2] = character3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameCharacter[] getCharacters() {
        return characters;
    }

    public void setCharacters(GameCharacter[] characters) {
        this.characters = characters;
    }

    double attack() {
        double attack = 0;
        for (GameCharacter character : characters) {
            attack += character.totalAttack();
        }
        return attack;
    }

    double defense() {
        double defense = 0;
        for (GameCharacter character : characters) {
            defense += character.totalDefense();
        }
        return defense;
    }

    double energy() {
        double energy = 0;
        for (GameCharacter character : characters) {
            energy += character.getEnergy();
        }
        return energy;
    }
}

class BattleSimulator {
    static void fight(Team team1, Team team2) {
        double team2Energy = attack(team1, team2);
        double team1Energy = attack(team2, team1);
        double energyDiff = team1Energy - team2Energy;
        if (energyDiff > 0) {
            System.out.println("Wygrywa drużyna " + team1.getName() + " z przewagą " + energyDiff + " energii");
        } else if (energyDiff < 0) {
            System.out.println("Wygrywa drużyna " + team2.getName() + " z przewagą " + (-energyDiff) + " energii");
        } else {
            System.out.println("Remis, obie drużyny zachowały " + team1Energy + " energii");
        }
    }

    private static double attack(Team attacker, Team defender) {
        double attack = attacker.attack();
        double defense = defender.defense();
        double attackPower = attack - defense;
        double energy = defender.energy();
        if (attackPower > 0) {
            return energy - attackPower;
        } else {
            return energy;
        }
    }
}
class GameSimulator{
    public static void main(String[] args) {
        AttackCharacter character1 = new AttackCharacter("joe",100,100,0.2);
        AttackCharacter character2 = new AttackCharacter("Martha", 100, 100, 100, 0.2);
        DefenseCharacter character3 = new DefenseCharacter("Kris", 100, 100, 100, 0.2);
        AttackCharacter character4 = new AttackCharacter("Matt", 100, 100, 100, 0.2);
        AttackCharacter character5 = new AttackCharacter("Martha", 100, 100, 100, 0.2);
        DefenseCharacter character6 = new DefenseCharacter("Belly", 100, 100, 100, 0.2);

        Team team1 = new Team("TeamOne", character2, character3, character1);
        Team team2 = new Team ("TeamTwo",character5,character6,character4);
        BattleSimulator.fight(team1,team2);
    }
}