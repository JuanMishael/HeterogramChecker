public class main{
    public static boolean calculate(String sent){              
	    for (int i = 0; i < sent.length(); i ++) {                  //this is the main algorithm
            if (i != sent.lastIndexOf(sent.charAt(i))) return true;
        }
        return false;
    }
    public static void main(String[] args){
        String sentence = "the big brown fox jumps over the lazy dog";
        System.out.println(calculate(sentence));
        //if true, which means theres a repeated letter 
    }
}