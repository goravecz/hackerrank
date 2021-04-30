package java.datastructures.javamap;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/phone-book/problem
 */

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Integer> phoneBook = readPhoneBook();
        List<String> queries = readQueries();

        for (String query : queries) {
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }

    private static Map<String, Integer> readPhoneBook() {
        int count = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String name = scanner.nextLine();
            Integer number = scanner.nextInt();
            scanner.nextLine();
            phoneBook.put(name, number);
        }

        return phoneBook;
    }

    private static List<String> readQueries() {
        List<String> queries = new ArrayList<>();
        while(scanner.hasNext()) {
            queries.add(scanner.nextLine());
        }

        return queries;
    }
}




