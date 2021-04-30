package java.datastructures.javacomparator;

import java.util.Comparator;

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getScore() == o2.getScore()) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        } else {
            return o2.getScore() - o1.getScore();
        }
    }
}
