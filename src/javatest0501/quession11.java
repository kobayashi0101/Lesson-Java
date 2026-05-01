package javatest0501;
	public class quession11 {
	    public static void main(String[] args) {

	        String[] titles = {
	            "Python入門",
	            "データ分析の基礎",
	            "AI技術最前線",
	            "Webデザイン講座",
	            "はじめての機械学習"
	        };

	        String[] authors = {
	            "山田太郎",
	            "鈴木花子",
	            "佐藤一郎",
	            "田中美咲",
	            "中村健一"
	        };

	        int[] sales = {1500, 1200, 800, 2000, 900};
	        int[] prices = {2500, 3000, 4000, 2000, 3500};

	        int totalAmount = 0;

	        for (int i = 0; i < titles.length; i++) {
	            totalAmount += sales[i] * prices[i];
	        }

	        System.out.println("全書籍の総売上額：" + totalAmount + "円");

	        System.out.println("販売数が1000冊を超える書籍：");
	        for (int i = 0; i < titles.length; i++) {
	            if (sales[i] > 1000) {
	                System.out.println(titles[i]);
	            }
	        }

	        System.out.println("販売効率：");
	        for (int i = 0; i < titles.length; i++) {
	            double efficiency = (double) sales[i] / prices[i];
	            System.out.println(titles[i] + "：" + efficiency);
	        }
	    }
	}

	

