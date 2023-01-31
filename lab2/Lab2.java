package lab2;

public class Lab2 {
    public static void main(String[] args) {
        task1(10);
        task2(5, 3);
    }

    public static void task1(int n) {
		for (int i = 1; i < n+1; i++) {
			for (int j = 0; j < (n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	public static void task2(int n, int m) {
		int value = 1;
		int[][] array = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j] = value;
				value += 3;
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
    
}
