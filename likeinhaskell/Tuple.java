package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
public class Tuple <F,S> {
    F first;
    S second;

    Tuple(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F fst() {
        return first;
    }

    public S snd() {
        return second;
    }

    public static void main(String[] args) {
        Tuple<String, Integer> myTuple = new Tuple<>("HEj", 1);
    }
}
