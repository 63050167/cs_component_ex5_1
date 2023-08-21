package com.mycompany.compoex5;

import java.util.Scanner;

public class FootballScoreReporter {
    public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();
        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");

        scoreSource.addListener(subscriber1);
        scoreSource.addListener(subscriber2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Score: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            
            scoreSource.setScoreLine("live result: " + input);
        }

        scanner.close();
    }
}

