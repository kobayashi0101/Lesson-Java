package jp.co.aforce.sample;
public class practice41 {
    public static void main(String[] args) {
    	String[] names = {"A", "B", "C"};
        int[] scores = {80, 90, 70};

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        double avg = (double) sum / scores.length;

        System.out.println("平均点: " + avg);
    }
}
    	
    	
    
    
    
    	
    	
    
