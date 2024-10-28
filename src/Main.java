import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] inputFiles = {"src/task1-input.txt", "src/task2-input.txt", "src/task3-input.txt"};
        String outputFilePath = "src/results.txt";

        try (FileWriter writer = new FileWriter(outputFilePath)) {
            for (String inputFilePath : inputFiles) {
                SPT scheduler = new SPT();
                JobFileReader jobFileReader = new JobFileReader();
                jobFileReader.readJobsFromFile(inputFilePath, scheduler);
                String results = "Results for " + inputFilePath + ":\n" + scheduler.executeJobs() + "\n";
                writer.write(results);
                writer.write("\n--------------------------------\n");
            }
            System.out.println("Results saved to " + outputFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }
    }
}
