package com.uberhub.events.tasks;


import java.util.List;
import java.util.Set;


/**
 * Created by zwilt on 3/14/15.
 * <p/>
 * TODO(zach)
 */
public class Task {
    private String name;
    private String uuid;

    // Among other things, we'll use tags to define urgency - e.g., just have an "Urgent" tag
    // that's understood by the UI, and the presence of the tag will affect how things are
    // displayed.
    private Set<TaskTag> tags;
    private List<String> updates;
    private Set<Task> blockingTasks;
    private long creationTimeMs;
    private long completionTimeMs;
    private TaskPriority priority;

    public Task(long completionTimeMs, String name, String uuid, Set<TaskTag> tags,
                List<String> updates, Set<Task> blockingTasks, long creationTimeMs,
                TaskPriority priority) {
        this.completionTimeMs = completionTimeMs;
        this.name = name;
        this.uuid = uuid;
        this.tags = tags;
        this.updates = updates;
        this.blockingTasks = blockingTasks;
        this.creationTimeMs = creationTimeMs;
        this.priority = priority;
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Set<TaskTag> getTags() {
        return tags;
    }

    public void setTags(Set<TaskTag> tags) {
        this.tags = tags;
    }

    public List<String> getUpdates() {
        return updates;
    }

    public void setUpdates(List<String> updates) {
        this.updates = updates;
    }

    public Set<Task> getBlockingTasks() {
        return blockingTasks;
    }

    public void setBlockingTasks(Set<Task> blockingTasks) {
        this.blockingTasks = blockingTasks;
    }

    public long getCreationTimeMs() {
        return creationTimeMs;
    }

    public void setCreationTimeMs(long creationTimeMs) {
        this.creationTimeMs = creationTimeMs;
    }

    public long getCompletionTimeMs() {
        return completionTimeMs;
    }

    public void setCompletionTimeMs(long completionTimeMs) {
        this.completionTimeMs = completionTimeMs;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }
}
