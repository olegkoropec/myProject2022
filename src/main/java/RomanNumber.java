import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
	public int romanToInt(String s) {
        String str = s;
        Character rom[] = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int arab[] = { 1, 5, 10, 50, 100, 500, 1000 };
        int rom1 = 0;

//        IV, IX, XL, XC, CD, CM


        Map<Character, Integer> romanNumber = new HashMap<>();


        for (int i = 0; i < rom.length; i++) {
            romanNumber.put(rom[i], arab[i]);
        }
//
        if(str.length() == 1){
            System.out.printf("%d" ,romanNumber.get(str.charAt(0)));
            return romanNumber.get(str.charAt(0));
        }

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'I'|| str.charAt(i) == 'X' || str.charAt(i) == 'C') && (i + 1) < str.length() ){

                if ((str.charAt(i) == 'I' && str.charAt(i+1) == 'V') || (str.charAt(i) == 'I' && str.charAt(i+1) == 'X') ||
                    (str.charAt(i) == 'X' && str.charAt(i+1) == 'L') || (str.charAt(i) == 'X' && str.charAt(i+1) == 'C') ||
                    (str.charAt(i) == 'C' && str.charAt(i+1) == 'D') || (str.charAt(i) == 'C' && str.charAt(i+1) == 'M')) {

                    rom1 += (romanNumber.get(str.charAt(i+1)) - romanNumber.get(str.charAt(i)));
                    i++;
                } else {
                    rom1 += romanNumber.get(str.charAt(i));
                }

            } else {
                rom1 += romanNumber.get(str.charAt(i));
            }

        }
        System.out.println(rom1);
        return rom1;       
        

    }
    public static void main(String[] args) {

    	RomanNumber solution = new RomanNumber();
//        solution.romanToInt("MMCMXCIX");
        solution.romanToInt("MMCMXCIX");
    }
}
