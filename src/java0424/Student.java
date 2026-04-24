package java0424;

public class Student {
	String name;
	int[] scores;
	
	public void setStudent(String n, int[] s) {
		name = n;
		scores =s;
	}
	public void showAverage() {
		int sum =0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avg = (double) sum / scores.length;
		System.out.println(name + "の平均点:" + avg);
	}

}
