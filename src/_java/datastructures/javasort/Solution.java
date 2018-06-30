package _java.datastructures.javasort;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-sort/problem
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result;
                if (o1.getCgpa() == o2.getCgpa()) {
                    if (o1.getFname().equals(o2.getFname())) {
                        result = o1.getId() - o2.getId();
                    } else {
                        result = o1.getFname().compareTo(o2.getFname());
                    }
                } else {
                    double comparison = o2.getCgpa() - o1.getCgpa();
                    if (comparison == 0) {
                        result = 0;
                    } else {
                        result = comparison < 0 ? -1 : 1;
                    }
                }

                return result;
            }
        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}


