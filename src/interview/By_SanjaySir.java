package interview;

public class By_SanjaySir {

	public static void main(String[] args) {

		String s = "hi hello welcome";
		// o/p --em oclew hellohi
		String[] w = s.split(" ");
		
		for (int i = w.length-1; i >= 0; i--) {
			String st = w[i];
			
			if(i==w.length-1) {
				for (int j = st.length()-1; j >= 0; j--) {
					char ch = st.charAt(j);
					
					if (ch=='m') {
						System.out.print(st.charAt(j)+" ");
					} 
					else {
						System.out.print(st.charAt(j));
					}
				}
				System.out.print(" ");
			}
			else {
				System.out.print(w[i]);
			}
		}
	}
}