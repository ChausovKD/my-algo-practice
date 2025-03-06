package easy.gotta_snatchEm_all;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

class GottaSnatchEmAll {

    public static void main(String[] args) {
        Set<String> myCollection1 = new HashSet<>(Set.of("Gyros", "Garilord"));
        Set<String> theirCollection1 = new HashSet<>(Set.of("Garilord", "Gyros"));
        System.out.println(GottaSnatchEmAll.canTrade(myCollection1, theirCollection1));

        Set<String> myCollection2 = new HashSet<>(Set.of("Gyros", "Garilord"));
        Set<String> theirCollection2 = new HashSet<>(Set.of("Garilord", "Veevee", "Gyros"));
        System.out.println(GottaSnatchEmAll.canTrade(myCollection2, theirCollection2));
    }


    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }


    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }


    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty()) {
            return false;
        }
        return !myCollection.containsAll(theirCollection);
    }


    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> cards = new HashSet<>(collections.get(0));
        for (Set<String> collection : collections) {
            cards.retainAll(collection);
        }
        return cards;
    }


    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> cards = new HashSet<>();
        for(Set<String> collection : collections) {
            cards.addAll(collection);
        }
        return cards;
    }
}
