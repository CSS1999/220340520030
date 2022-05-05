import java.util.Scanner;

class sorting{
	
	public void insertionSort(int a1[]){
		int l = a1.length;
		for(int i = 1;i<l;i++){
			int k = a1[i];
			int j = i-1;
			
			while(j>=0 && a1[j]>k){
				a1[j+1] = a1[j];
				j = j - 1;
				display(a1);
				
			}
			a1[j+1] = k;
			
			
		}
		
	}
	
	public void display(int a1[]){
		int j = a1.length;
		System.out.println("");
		for(int i = 0; i<j;i++){
			
			System.out.print(a1[i]+" ");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int a1[] = new int [n];
		for(int i = 0; i<n;i++){
			System.out.print("Enter the Elements : ");
			a1[i] = sc.nextInt();
		}
		
		sorting s1 = new sorting();
		s1.insertionSort(a1);
		s1.display(a1);
	}
}