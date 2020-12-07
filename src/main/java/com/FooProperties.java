package com;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.HashMap;
import java.util.Map;

@ConfigurationProperties("server.worker")
public class FooProperties {
    private int workerCount;
    private int subWorkerCount;
    private int limit;
    @NestedConfigurationProperty
    private Map<String, BooProperties> group = new HashMap<>();

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }

    public int getSubWorkerCount() {
        return subWorkerCount;
    }

    public void setSubWorkerCount(int subWorkerCount) {
        this.subWorkerCount = subWorkerCount;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public Map<String, BooProperties> getGroup() {
        return group;
    }

    public void setGroup(Map<String, BooProperties> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "FooProperties{" +
                "workerCount=" + workerCount +
                ", subWorkerCount=" + subWorkerCount +
                ", limit=" + limit +
                ", group=" + group +
                '}';
    }
}
