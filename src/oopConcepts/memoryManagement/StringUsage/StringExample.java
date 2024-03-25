package oopConcepts.memoryManagement.StringUsage;

public class StringExample {
    public static void main(String[] args) {
        String resault = "";

        long startTime = System.currentTimeMillis();
        for(long i = 0; i<100000; i++){
            resault += "some text"; //her döngüde "some text" eklenecek
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time : " + (endTime-startTime));
    }

}
