package com.mycompany.compoex5;

import java.util.ArrayList;
import java.util.List;

public class ScoreSource {
    private List<ScoreListener> listeners = new ArrayList<>();

    public void addListener(ScoreListener listener) {
        listeners.add(listener);
    }

    public void removeListener(ScoreListener listener) {
        listeners.remove(listener);
    }

    public void setScoreLine(String scoreLine) {
        ScoreEvent event = new ScoreEvent(scoreLine);
        for (ScoreListener listener : listeners) {
            listener.scoreChange(event);
        }
    }
}

