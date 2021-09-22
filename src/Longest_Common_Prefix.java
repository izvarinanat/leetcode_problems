public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        String init_word = strs[0];
        int min_length = Integer.MAX_VALUE;
        if (strs.length == 1)
            System.out.println(strs[0]);
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min_length)
                min_length = strs[i].length();
        }
        int last_sim_ind = -1;
        outterLoop:
        for (int k = 0; k < min_length; k++) {
            last_sim_ind = k;
            for (int j = 1; j < strs.length; j++) {
                if (init_word.charAt(k) != strs[j].charAt(k)){
                    last_sim_ind--;
                    break outterLoop;
                }
                }
            }
        System.out.println(last_sim_ind);
        switch (last_sim_ind) {
            case -1:
                System.out.println("");
                break;
            case 0:
                System.out.println(init_word.substring(0, 1));
                break;
            default:
                System.out.println(init_word.substring(0, last_sim_ind+1));
                break;
        }
    }
}