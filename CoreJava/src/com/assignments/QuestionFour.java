package com.assignments;

public class QuestionFour {
	public static void main(String[] args) {
		
	int[] numbers= {1,2,3,4,5};
	int [] modifiedNumbers = modifyArray(numbers);
	
	for(int num:numbers) {
	System.out.print(num+" ");
	
 /* Inside the modifyArray method, a loop iterates over each element of the array
  *  and multiplies it by 2 and this also modifies the original array elements.
  *   Here we are also returning the modified array and storing 
  *   it in another array object but this is not required and is only 
  *   used for confusing you in the problem.
  */
}}
public static int [] modifyArray(int[]arr){
	for(int i =0;i<arr.length;i++) {
	arr[i]*=2;
}
return arr;
}

}

