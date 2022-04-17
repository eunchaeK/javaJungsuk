package ch06.exercise;

public class ReferenceParamEx3 {
 public static void main(String[] args) {
	int[] arr = new int[] {2,4,6,3,8,6};
	printArr(arr);
	sortArr(arr);
	printArr(arr);
	System.out.println("sum="+sumArr(arr));
 }
 
 static void printArr(int[] arr) {
	 System.out.print("[");
	 
	 for(int i : arr)
		 System.out.print(i+",");
	 System.out.println("]");
 }
 
 static int sumArr(int[] arr) {
	 int sum = 0;
	 
	 for(int i : arr)
		 sum += i;
	 return sum;
 }
 
 static void sortArr(int[] arr) {// 오름차순 정렬 
	 for (int i = 0 ; i < arr.length-1 ; i++) {
		for (int j = 0; j < arr.length-1-i; j++) {
			if(arr[j]>arr[j+1]) {
				int tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
			}
		}
	}
 }// end sortArr
 
 
}// end class
