package oopConcepts.memoryManagement.StringUsage;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for(long i= 0; i<1000000; i++){
            builder.append("some text");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time : " + (endTime-startTime) + " ms");
    }
}
