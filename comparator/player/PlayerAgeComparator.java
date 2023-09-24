package comparator.player;

import java.util.Comparator;

public class PlayerAgeComparator implements Comparator<Player>{
    @Override
    public int compare(Player first, Player second){
        return Integer.compare(first.getAge(), second.getAge());
    }
}