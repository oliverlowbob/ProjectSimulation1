package com.company;

import java.util.List;

public class Project {

    String projectName;
    List<Phase> phases;

    public Project(String projectName, List<Phase> phases) {
        this.projectName = projectName;
        this.phases = phases;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Phase> getPhases() {
        return phases;
    }

    public void setPhases(List<Phase> phases) {
        this.phases = phases;
    }
}
