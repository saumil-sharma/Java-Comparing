# Comparing
Comparing in Java is doable using the basic comparing methods, such as using
an if condition to compare two strings:

```java
String a = "Hello";
String b = "Hello";

System.out.println(a.equals(b));
// Prints out "true" to the command output.
```

We get an issue if we want to compare two classes though,
comparing them using the standard ">" and "<" operators 
wont work.

# Comparing using compareTo
The first method to comparing two instances is using the `compareTo()` method
that's given to us from the Comparable<E> interface.

Here's an example:
```java
public class Player implements Comparable<Player>{
    .. Relevant variables (name, rank, etc.)

    .. Getters and setters.

    @Override
    public int compareTo(Player other){
        return Integer.compare(this.getRank(), other.getRank());
    }
}
```

If we have this, we can run the following code and it'll return based upon the `rank` variable.

```java
System.out.println(playerA > playerB);
// Returns true if A's rank is greater than B's, and vice.
```

# Comparing using Comparators

Instead of comparing within a class, we can create a whole another class in order to
compare different objects.

We would go something like this:
```java
public class PlayerRankComparator implements Comparator<Player>{
    @Override
    public int compare(Player firstPlayer, Player secondPlayer) {
       return Integer.compare(firstPlayer.getRanking(), secondPlayer.getRanking());
    }
}
```

We can now use this to use as somewhat of a rule when sorting for example:
```java
Collections.sort(players, new PlayerRankComparator());
// Assume players is an array of Player[]
```

This will sort the array based upon the `PlayerRankComparator.compare()` method,
which will sort the list based upon the rankings of the players.

We can use use both of them to solve many comparing-related problems.

There are examples in the `comparator` and `compareTo` folders for each type respectively.