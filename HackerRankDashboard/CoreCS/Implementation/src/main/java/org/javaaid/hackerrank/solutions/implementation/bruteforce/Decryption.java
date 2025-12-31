
public class Decryption {

	 static String decryption(String s) {
	        StringBuilder s1 = new StringBuilder();
        String result ="";
        s1.append(s);
        s=s1.reverse().toString();
        char[] chars = s.toCharArray();
        s1.delete(0,chars.length);
        for(int i=0;i<chars.length;i++){
            if(Character.isDigit(chars[i]))
            {
                for(int j=0;j<(chars[i] -'0')-1;j++){
                    s1.append(chars[i-1]);
                }
            }
            else{
                s1.append(chars[i]);

            }

        }
     result=s1.toString();
			return result;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        String result = decryption(s);
	        System.out.println(result);
	        in.close();
	    }
	}
