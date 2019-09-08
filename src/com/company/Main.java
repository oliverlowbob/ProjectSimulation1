package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Phase p1 = new Phase("Communication", 1);
        Phase p2 = new Phase("Planning", 2);
        Phase p3 = new Phase("Modelling", 2);

        List<Phase> phases = new ArrayList<Phase>();
        phases.add(p1);
        phases.add(p2);
        phases.add(p3);

        Project project = new Project("Project", phases);



    }
}
