import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

//        HashMap<String, Integer> mymap = new HashMap<>();
//        mymap.put("A", 10);
//        mymap.put("B", 22);
//        mymap.put("C", 9);
//        System.out.println(mymap.get("I"));
//        mymap.put("E", 15);
//        mymap.clear();
//        System.out.println(mymap);
// -------------------------------------------------------------------------------
//        HashMap<String, Integer> mymap = new HashMap<>();
//        mymap.put("A", 10);
//        mymap.put("B", 22);
//        HashMap<String, Integer> newmap = (HashMap<String, Integer>) mymap.clone();
//        newmap.put("C", 15);
//        System.out.println(mymap);
// -------------------------------------------------------------------------------

//        HashMap<String, Integer> mymap = new HashMap<>();
//        mymap.put("A", 10);
//        mymap.put("B", 22);
//        System.out.println(mymap.keySet());
//        System.out.println(mymap.values());
//        System.out.println(mymap.containsKey("A"));
//        System.out.println(mymap.containsValue(10));
//        System.out.println(mymap.values().contains(10));
//        System.out.println(mymap.isEmpty());
//        System.out.println(mymap.size());
//        mymap.remove("A");
//        System.out.println(mymap);
//        mymap.replace("A", 30);
//        System.out.println(mymap);
// -------------------------------------------------------------------------------


//        HashMap<String, Integer> mymap = new HashMap<>();
//        mymap.put("A", 10);
//        mymap.put("B", 22);
//        for(String i: mymap.keySet()){
//            System.out.println(i);
//        }
//        for(int i: mymap.values()){
//            System.out.println(i);
//        }
//        for(String i: mymap.keySet()){
//            System.out.println(i + " " + mymap.get(i));
//        }
// -------------------------------------------------------------------------------

//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("A", 10);
//        map.put("B", 20);
//        int sum = 0;
//        for(int i: map.values()){
//            sum += i;
//        }
//        System.out.println(sum);
// -------------------------------------------------------------------------------

//        HashMap<Character, String> morse = new HashMap<Character, String>();
//        morse.put('a', ".-");
//        morse.put('b', "-...");
//        morse.put('c',  "-.-");
//        morse.put('d',  "-..");
//        morse.put('e',    ".");
//        morse.put('f', "..-.");
//        morse.put('g',  "--.");
//        morse.put('h', "....");
//        morse.put('i',   "..");
//        morse.put('j', ".---");
//        morse.put('k',   "-.");
//        morse.put('l', ".-..");
//        morse.put('m',   "--");
//        morse.put('n',   "-.");
//        morse.put('o',  "---");
//        morse.put('p', ".--.");
//        morse.put('q', "--.-");
//        morse.put('r', ".-.");
//        morse.put('s',  "...");
//        morse.put('t',   "-");
//        morse.put('u',  "..-");
//        morse.put('v', "...-");
//        morse.put('w',  ".--");
//        morse.put('x', "-..-");
//        morse.put('y', "-.--");
//        morse.put('z', "--..");
//        morse.put('1', ".----");
//        morse.put('2',"..---");
//        morse.put('3', "...--");
//        morse.put('4', "....-");
//        morse.put('5', ".....");
//        morse.put('6', "-....");
//        morse.put('7', "--...");
//        morse.put('8', "---..");
//        morse.put('9', "----.");
//        morse.put('0', "-----");
//        System.out.print("Enter text: ");
//        String text = scan.nextLine();
//        for(int i = 0; i < text.length(); i ++){
//            char letter = Character.toLowerCase(text.charAt(i));
//            System.out.print(morse.get(letter));
//        }
// -------------------------------------------------------------------------------


//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "AEILNORSTU");
//        map.put(2, "DG");
//        map.put(3, "BCMP");
//        map.put(4, "FHVWY");
//        map.put(5, "K");
//        map.put(8, "JX");
//        map.put(10, "QZ");
//        System.out.print("Enter name: ");
//        String name = scan.nextLine();
//        int sum = 0;
//        for(int i = 0; i < name.length(); i ++){
//            for(int key: map.keySet()){
//                String letter = String.valueOf(Character.toUpperCase(name.charAt(i)));
//                if(map.get(key).contains(letter)){
//                    sum += key;
//                }
//            }
//        }
//        System.out.println(sum);
// -------------------------------------------------------------------------------

//        HashMap<Integer, String> phone = new HashMap<>();
//        phone.put(1, ".,?!:");
//        phone.put(2, "ABC");
//        phone.put(3, "DEF");
//        phone.put(4, "GHI");
//        phone.put(5, "JKL");
//        phone.put(6, "MNO");
//        phone.put(7, "PQRS");
//        phone.put(8, "TUV");
//        phone.put(9, "WXYZ");
//        phone.put(0, " ");
//        "HELLO"
//                4433555555666
// -------------------------------------------------------------------------------

//        String text = "HELLO";
//        HashMap<Character, Integer> map = new HashMap<>();
//        for(int i = 0; i < text.length(); i ++){
//            map.put(text.charAt(i), 0);
//        }
//        System.out.println(map.size());
// -------------------------------------------------------------------------------

//        String text = "HELLO";
//        HashMap<Character, Integer> map = new HashMap<>();
//        for(int i = 0; i < text.length(); i ++){
//            if(map.containsKey(text.charAt(i))){
//                map.replace(text.charAt(i), map.get(text.charAt(i)) + 1);
//            }
//            else{
//                map.put(text.charAt(i), 1);
//            }
//        }
//        System.out.println(map);
// -------------------------------------------------------------------------------

//        HashMap<String, Integer> map1 = new HashMap<>();
//        map1.put("A", 1);
//        map1.put("B", 2);
//        map1.put("C", 3);
//        HashMap<Integer, String> map2 = new HashMap<>();
//        for(String i: map1.keySet()){
//            map2.put(map1.get(i), i);
//        }
//        System.out.println(map2);
// -------------------------------------------------------------------------------
//        HashMap<Integer, String> phone = new HashMap<>();
//        phone.put(1, ".,?!:");
//        phone.put(2, "ABC");
//        phone.put(3, "DEF");
//        phone.put(4, "GHI");
//        phone.put(5, "JKL");
//        phone.put(6, "MNO");
//        phone.put(7, "PQRS");
//        phone.put(8, "TUV");
//        phone.put(9, "WXYZ");
//        phone.put(0, " ");
//        System.out.print("Enter text: "); // HELLO
//        String text = scan.nextLine();
//        for(int i = 0; i < text.length(); i ++){
//            for(int j:phone.keySet()){
//                for(int k = 0; k < phone.get(j).length(); k ++){
//                    if(phone.get(j).charAt(k) == text.charAt(i)){
//                        if(phone.get(j).contains(String.valueOf(text.charAt(i)))) {
//                            for(int o = 0; o < k + 1; o ++){
//                                System.out.print(j);
//                            }
//                    }
//                }
//
//                }
//            }
//        }
        // -------------------------------------------------------------------------------
//        System.out.print("Enter text1: "); // hello
//        String text1 = scan.nextLine();
//        System.out.print("Enter text2: ");
//        String text2 = scan.nextLine();
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        HashMap<Character, Integer> map2 = new HashMap<>();
//        for(int i = 0 ; i < text1.length(); i ++){
//            if(map1.containsKey(text1.charAt(i))){
//                map1.replace(text1.charAt(i), map1.get(text1.charAt(i)) + 1);
//            }
//            else{
//                map1.put(text1.charAt(i), 1);
//            }
//        }
//        for(int i = 0 ; i < text2.length(); i ++){
//            if(map2.containsKey(text2.charAt(i))){
//                map2.replace(text2.charAt(i), map2.get(text2.charAt(i)) + 1);
//            }
//            else{
//                map2.put(text2.charAt(i), 1);
//            }
//        }
//        System.out.println(map1.equals(map2));
        // -------------------------------------------------------------------------------
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(2);
//        arr.add(0);
//        arr.add(3);
//        arr.add(0);
//        arr.add(0);
//        arr.add(0);
//        arr.add(6);
//        System.out.println(arr);
//        [2, 3, 6, 0, 0, 0, 0]
//        for(int i = arr.size() - 1; i >= 0; i --){
//            if(arr.get(i) == 0){
//                arr.add(arr.get(i));
//                arr.remove(arr.get(i));
//            }
//        }
//        System.out.println(arr);
        // -------------------------------------------------------------------------------
//        int year = scan.nextInt();
//        int month = scan.nextInt();
//        int day = scan.nextInt();
//        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        if(year % 4 == 0){
//            days[1] = 29;
//        }
//        int sum = 0;
//        for(int i = 0; i < month - 1; i ++){
//            sum += days[i];
//        }
//        sum += day;
//        System.out.println(sum);

//        2024  75
//        2024  3  15
        // -------------------------------------------------------------------------------
//        int year = scan.nextInt();
//        int day = scan.nextInt();
//        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        if(year % 4 == 0){
//            days[1] = 29;
//        }
//        int month = 0;
//        while(days[month] < day){
//            day -= days[month];
//            month ++;
//        }
//        month ++;
//        System.out.println(year + " : " + month + " : " + day);
        // -------------------------------------------------------------------------------

    }
}
