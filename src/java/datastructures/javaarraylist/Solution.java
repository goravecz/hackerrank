package java.datastructures.javaarraylist;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-arraylist/problem
 */

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<List<Integer>> rows = readData();
        List<List<Integer>> queries = readQueries();

        for(List<Integer> query : queries) {
            Integer row = query.get(0) - 1;
            Integer element = query.get(1) - 1;

            try {
                System.out.println(rows.get(row).get(element));
            } catch(IndexOutOfBoundsException ex) {
                System.out.println("ERROR!");
            }
        }
    }

    private static List<List<Integer>> readData() {
        int rowCount = scanner.nextInt();
        List<List<Integer>> rows = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            int elementCount = scanner.nextInt();
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < elementCount; j++) {
                row.add(scanner.nextInt());
            }
            rows.add(row);
        }

        return rows;
    }

    private static List<List<Integer>> readQueries() {
        List<List<Integer>> queries = new ArrayList<>();
        int queryCount = scanner.nextInt();
        for (int i = 0; i < queryCount; i++) {
            Integer row = scanner.nextInt();
            Integer element = scanner.nextInt();
            List<Integer> query = new ArrayList<>();
            query.add(row);
            query.add(element);
            queries.add(query);
        }

        return queries;
    }
}
