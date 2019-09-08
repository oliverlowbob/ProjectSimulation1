package com.company;

public class Phase {
    String name;
    int costOfIteration;
    double percent;


    public Phase() {
    }

    public Phase(String name, int costOfIteration) {
        this.name = name;
        this.costOfIteration = costOfIteration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostOfIteration() {
        return costOfIteration;
    }

    public void setCostOfIteration(int costOfIteration) {
        this.costOfIteration = costOfIteration;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
