public class Decoded_String_at_Index {
    public static void main(String[] args) {
        String s = "czjkk9elaqwiz7s6kgvl4gjixan3ky7jfdg3kyop3husw3fm289thisef8blt7a7zr5v5lhxqpntenvxnmlq7l34ay3jaayikjps";
        int k = 768077956;
//        int digit;
//        String decoded_string = "";
//        String repeated = "";
//        int size;
//        for(int i = 0; i<s.length(); i++){
//            if (Character.isDigit(s.charAt(i))){
//                System.out.println(s.charAt(i));
//                System.out.println(s.charAt(i)-'0');
//                digit = Integer.parseInt(String.valueOf(s.charAt(i)));
//                size = decoded_string.length();
//                if (k<size + size * (digit-1)){
//                    k %= size;
//                    if (k == 0)
//                        k = size;
//                    break;
//                }
//                else{
//                    repeated = decoded_string;
//                    for (int j = 0; j<digit-1; j++)
//                        decoded_string = decoded_string + repeated;
//                    repeated = "";
//                }
//            }
//            else {
//                decoded_string = decoded_string + s.charAt(i);
//            }
//        }
//        System.out.println(Character.toString(decoded_string.charAt(k-1)));
//        System.out.println('a'- '0');
        long len = 0;
        int digit;
        int symbol;
        for(int i = 0; i<s.length(); i++){
            if (Character.isDigit(s.charAt(i))){
                digit = Integer.parseInt(String.valueOf(s.charAt(i)));
                len += len*(digit-1);
            }
            else {
                len ++;
            }
        }

        System.out.println(len);
        for (int i = s.length()-1; i>=0; --i){
            symbol = s.charAt(i);
            k %= len;
            if (k == 0)
                System.out.println(Character.toString(symbol));
            else{
                if (Character.isDigit(symbol)){
                    len = len/Integer.parseInt((Character.toString(symbol)));

                } else{
                    len--;
                }
            }
        }
    }
}
