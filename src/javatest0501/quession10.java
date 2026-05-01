package javatest0501;
import java.util.ArrayList;

public class quession10 {
	
	    public static void main(String[] args) {
	        ArrayList<String> tasks = new ArrayList<>();

	        tasks.add("TASK001");
	        tasks.add("TASK002");
	        tasks.add("TASK003");
	        tasks.add("TASK001");
	        tasks.add("TASK004");
	        tasks.add("TASK002");

	      System.out.println("処理済みのタスクID一覧：");
	        for (String task : tasks) {
	            System.out.println("- " + task);
	        }

	        String newTask1 = "TASK003";
	        String newTask2 = "TASK005";

	        if (tasks.contains(newTask1)) {
	            System.out.println("タスクID '" + newTask1 + "' は既に処理済みです。");
	        } else {
	            System.out.println("タスクID '" + newTask1 + "' は未処理です。");
	        }

	        if (tasks.contains(newTask2)) {
	            System.out.println("タスクID '" + newTask2 + "' は既に処理済みです。");
	        } else {
	            System.out.println("タスクID '" + newTask2 + "' は未処理です。");
	        }

	     System.out.println("処理済みのタスクの総数：" + tasks.size());
	    }
	}
	
	


