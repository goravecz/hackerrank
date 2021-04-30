package java.datastructures.javadequeue;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-dequeue/problem
 */

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        long maxCount = 0;

        for (int i = 0; i < n; i++) {
            Integer next = in.nextInt();
            deque.add(next);
            set.add(next);

            if (deque.size() == m) {
                maxCount = Math.max(set.size(), maxCount);
                Integer first = deque.remove();
                if (!deque.contains(first)) {
                    set.remove(first);
                }
            }
        }

        System.out.println(maxCount);
    }
}