import java.util.HashMap;

public class Roman_to_Integer {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        HashMap<String, Integer> romans = new HashMap<>() {{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000); }};
        char[] date_char = s.toCharArray();
        int sum = 0;
        for (int i=date_char.length-1; i>=0; --i){
            System.out.println(sum);
            if (i != 0){
                if ((date_char[i] == 'V' && date_char[i-1] == 'I'))
                    sum += romans.get(String.valueOf(date_char[i])) - 7;
                if ((date_char[i] == 'X' && date_char[i-1] == 'I'))
                    sum += romans.get(String.valueOf(date_char[i])) - 12;

                if (date_char[i] == 'L' && date_char[i-1] == 'X')
                    sum += romans.get(String.valueOf(date_char[i])) - 70;
                if (date_char[i] == 'C' && date_char[i-1] == 'X')
                    sum += romans.get(String.valueOf(date_char[i])) - 120;

                if (date_char[i] == 'D' && date_char[i-1] == 'C')
                    sum += romans.get(String.valueOf(date_char[i])) - 700;
                if (date_char[i] == 'M' && date_char[i-1] == 'C')
                    sum += romans.get(String.valueOf(date_char[i])) - 1200;
            }
            sum += romans.get(String.valueOf(date_char[i]));
        }
        System.out.println(sum);


    }
}
