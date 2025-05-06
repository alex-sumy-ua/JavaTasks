package org.assessment_preparation.cutting_sticks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CuttingSticks {
    // https://www.hackerrank.com/challenges/cut-the-sticks/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>(arr);

        while (!current.isEmpty()) {
            // Add the current count to the result
            result.add(current.size());

            // Find the minimum length in current list
            int min = current.stream().min(Integer::compare).get();

            // Process the sticks: break longer ones and keep the remaining parts
            List<Integer> next = new ArrayList<>();
            for (int stick : current) {
                if (stick > min) {
                    next.add(stick - min);
                }
            }

            // The next iteration will work on the broken pieces
            current = next;
        }

        return result;
    }

    public class Solution {
        public static void main(String[] args) throws IOException {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" ")).
                    map(Integer::parseInt)
                    .collect(toList());

            List<Integer> result = CuttingSticks.cutTheSticks(arr);

            bufferedWriter.write(
                    result.stream()
                            .map(Object::toString)
                            .collect(joining("\n"))
                    + "\n"
            );

            bufferedReader.close();
            bufferedWriter.close();

        }
    }

}
