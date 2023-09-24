package compareTo.player;

public class Player implements Comparable<Player>{
    private int age;
    private int ranking;
    private String name;

    public Player(String name, int ranking, int age){
        this.name = name;
        this.ranking = ranking;
        this.age = age;
    }

    // THE COMPARETO METHOD 
    @Override
    public int compareTo(Player o) {
        return Integer.compare(this.age, o.age);
    }

    // Used for display, not mandatory.
    public String toString(){
        return name + ", " + age;
    }

    public int getAge(){
        return this.age;
    }

    public int getRanking(){
        return this.ranking;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setRanking(int ranking){
        this.ranking = ranking;
    }

    public void setName(String name){
        this.name = name;
    }

}
