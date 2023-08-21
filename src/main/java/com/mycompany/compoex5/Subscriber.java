package com.mycompany.compoex5;

public class Subscriber implements ScoreListener {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void scoreChange(ScoreEvent event) {
        System.out.println(name + " received: " + event.getScoreLine());
    }
}

