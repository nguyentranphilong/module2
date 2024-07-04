package ss4_oop;

public class StopWatch {
    private long startTime;
    private long endTime;

    public  StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public  long getStartTime() {
        return startTime;
    }
    public  long getEndTime() {
        return endTime;
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
        System.out.println("đồng hồ đã reset");
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
        System.out.println("đồng hồ đã dừng");
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        // Giả lập một công việc mất thời gian
        try {
            Thread.sleep(2000);  // Ngủ trong 2 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Dừng đồng hồ bấm giờ
        stopWatch.stop();

        // Hiển thị thời gian đã trôi qua
        System.out.println("Start Time: " + stopWatch.getStartTime());
        System.out.println("End Time: " + stopWatch.getEndTime());
        System.out.println("Elapsed Time in milliseconds: " + stopWatch.getElapsedTime());
    }
}
