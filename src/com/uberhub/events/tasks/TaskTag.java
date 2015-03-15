package com.uberhub.events.tasks;

/**
 * Created by zwilt on 3/14/15.
 * <p/>
 * TODO(zach)
 */
public class TaskTag {
    private String name;

    public TaskTag(String name) {
        this.name = name;
    }

    /*
     * Getters and setters for persistence below here.
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
