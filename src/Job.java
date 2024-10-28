public class Job {
    private int jobId;
    private int processingTime;
    private int priority;
    private int arrivalTime;

    public Job(int jobId, int processingTime, int priority, int arrivalTime) {
        this.jobId = jobId;
        this.processingTime = processingTime;
        this.priority = priority;
        this.arrivalTime = arrivalTime;
    }

    public int getJobId() {
        return jobId;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    @Override
    public String toString() {
        return "Job ID: " + jobId + ", Processing Time: " + processingTime +
                ", Priority: " + priority + ", Arrival Time: " + arrivalTime;
    }
}
