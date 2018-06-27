package _java.datastructures.javalist;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-list/problem
 */

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> list = readList();
        List<List<String>> queries = readQueries();

        list = modifyList(list, queries);

        for (String element : list) {
            System.out.print(element + " ");
        }
    }

    private static List<String> readList() {
        int lineCount = scanner.nextInt();
        List<String> list = new LinkedList<>();
        for (int i = 0; i < lineCount; i++) {
            list.add(scanner.next());
        }

        return list;
    }

    private static List<List<String>> readQueries() {
        int queryCount = scanner.nextInt();
        List<List<String>> queries = new ArrayList<>();
        for (int i = 0; i < queryCount; i++) {
            List<String> queryData = new ArrayList<>();
            queryData.add(scanner.next());
            if (queryData.get(0).equals("Insert")) {
                for (int j = 0; j < 2; j++) {
                    queryData.add(scanner.next());
                }
            } else if (queryData.get(0).equals("Delete")) {
                queryData.add(scanner.next());
            }
            queries.add(queryData);
        }

        return queries;
    }

    private static List<String> modifyList(List<String> list, List<List<String>> queries) {
        for (List<String> entry : queries) {
            int index = Integer.parseInt(entry.get(1));
            if (entry.get(0).equals("Insert")) {
                list.add(index, entry.get(2));
            } else if (entry.get(0).equals("Delete")) {
                list.remove(index);
            }
        }

        return list;
    }
}
