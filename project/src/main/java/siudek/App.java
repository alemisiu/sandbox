package siudek;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        final int n = 100_000;
        var sortedInts = new int[n];

        var position = 0;

        var rand = new Random();
        System.out.println("Losowanko ...");
        
        var start = LocalDateTime.now();

        for (int i = 0; i < n; i++) {

            var candidate = rand.nextInt(Integer.MAX_VALUE);
            
            for (int j = position; j >=0; j--) {
                if (j == 0) {
                    sortedInts[j] = candidate;
                } else {
                    var left = sortedInts[j-1];
                    if (left > candidate) {
                        sortedInts[j] = left;
                    } else {
                        sortedInts[j] = candidate;
                        break;
                    }
                }
            }

            position++;


        }


        var end = LocalDateTime.now();
        var diff = Duration.between(start, end);

        System.out.println("... i po sortowanku, secs: " + diff.getSeconds());

        for (int i = 0; i < 100; i++) {
            System.out.println(sortedInts[i]);
        }

    }

}