package com.example.demo3;
// 21.6
import java.util.*;

public class week11 {
        public static void main(String[] args) {

            Set<String> set1 = new LinkedHashSet<>(Arrays.asList(
                    "George", "Jim", "John", "Blake", "Kevin", "Michael"));
            Set<String> set2 = new LinkedHashSet<>(Arrays.asList(
                    "George", "Katie", "Kevin", "Michelle", "Ryan"));


            Set<String> unionSet1andSet2 = new LinkedHashSet<>(set1);
            unionSet1andSet2.addAll(set2);
            System.out.println(unionSet1andSet2);


            Set<String> differenceSet1andSet2 = new LinkedHashSet<>(set1);
            differenceSet1andSet2.removeAll(set2);
            System.out.println(differenceSet1andSet2);



            Set<String> intersection = new LinkedHashSet<>();
            for (String e: set2) {

                if (set1.contains(e))
                    intersection.add(e);
            }
            System.out.println(intersection);
        }
    }
