package String_ty;
class ReverseSentences {
    public static String rev(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        String s=" ram is good boy";
    String[] st=s.split(" ");
    
    
    for(int i=0;i<st.length;i++)
    {
        System.out.print(rev(st[i])+" ");
           }
    
           
    }
    
}