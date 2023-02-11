package Collection_ty;

import java.util.PriorityQueue;

public class Queue_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		q.add(20);
		q.add(40);
		q.add(70);
		q.add(5);
		q.add(80);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		

	}

}
