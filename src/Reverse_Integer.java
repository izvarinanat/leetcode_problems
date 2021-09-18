class Reverse_Integer {
    public static void main(String[] args) {
        int x = 35490853;
        boolean positive = true;
        String reversed;
        String output_string = " ";
        int output;
        if (x < 0){
            x *= -1;
            positive = false;
        }
        String str_input = Integer.toString(x);
        StringBuffer buffer = new StringBuffer(str_input).reverse();
        reversed = buffer.toString();
        if (!positive) {
            output_string = "-" + reversed;
            try {
                output = Integer.parseInt(output_string);
            }
            catch (NumberFormatException e) {
                output = 0;
            }
        } else
            try {
                output = Integer.parseInt(reversed);
            }
            catch (NumberFormatException e) {
                output = 0;
            }
        if (output < Integer.MIN_VALUE || output > Integer.MAX_VALUE)
            output = 0;
        System.out.println(output);
    }
}
