import java.util.HashMap;

public class BeautifulString {

    public static void main(String[] args) {
        System.out.println(new BeautifulString().isBeautifulString("bbc"));
    }

    boolean isBeautifulString(String inputString) {
        char[] chars = inputString.toCharArray();
        boolean isBeautiful = true;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int c : chars) {
            if(map.containsKey(new Integer(c))) {
                Integer count = map.get(new Integer(c));
                map.put(new Integer(c), ++count);
            } else {
                map.put(new Integer(c), 1);
            }
            //System.out.println(c);
        }
        for(int a= 98; a <=122; a++) {
            int thisCharValue = 0;
            if(map.get(new Integer(a)) != null) {
                thisCharValue = map.get(new Integer(a));
            }
            int thisPrevValue = 0;
            if(map.get(new Integer(a-1)) != null) {
                thisPrevValue = map.get(new Integer(a-1));
            }
            if(thisPrevValue < thisCharValue) {
                isBeautiful = false;
            }
        }
        return isBeautiful;
    }
}
