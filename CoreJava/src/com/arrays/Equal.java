package com.arrays;

	public class Equal {

		public static void main(String[] args) {
			int a[]= {10,40,90,80};
			int b[]= {90,40,60,80};
			
				for(int i=0;i<a.length;i++) {
					if(a[i]==b[i])
					System.out.println("equal");
					else
						System.out.println("not equal");		
		}
				for (int i=0;i<a.length;i++) {
					int count=0;
					for (int j=0;j<b.length;j++) {
						if(a[i]==b[j])//10==10
						count++;
					}
					System.out.println(a[i]+"...."+count+"times");
			
				}
		}
}
