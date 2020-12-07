package com;

public class BooProperties {
    private int workerCount;

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }

    @Override
    public String toString() {
        return "BooProperties{" +
                "workerCount=" + workerCount +
                '}';
    }
}
