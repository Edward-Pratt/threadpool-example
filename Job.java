public class Job implements Runnable {
  private int jobNumber;

  // Constructor to initialize the job number
  Job(int jobNumber) {
    this.jobNumber = jobNumber;
  }

  // The run method contains the code that constitutes the task
  public void run() {
    // Print the start of the job processing
    System.out.println("Job:" + jobNumber + " is being processed by thread : " + Thread.currentThread().getName());

    try {
      // Simulate job processing time
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // Handle the interrupted exception
    }

    // Print the end of the job processing
    System.out.println("Job: " + jobNumber + " is ending in thread : " + Thread.currentThread().getName());
  }
}