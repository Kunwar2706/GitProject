package Collection_ty;

import java.util.Iterator;

public class Arrayaddition {

	public static void main(String[] args) {
int a[]= {12,22,21};
int b[]= {4,2,4};
int c[]=new int[b.length]; //2
int i=0;
int k = a.length; //0
while(k>0) {
	c[i]=a[i]+b[i];
	i++;
	k--;
	
}
for (int j = 0; j < c.length; j++) {
	System.out.println(c[j]);
}
	}

}
