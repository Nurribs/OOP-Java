public class PalindromikKelime {

    static boolean isPolindrome(String kelime){
        int i=0;
        int j=kelime.length()-1;
        while (i<j){
            if (kelime.charAt(i)!= kelime.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean isPolindrome2(String kelime){
        String reverse = "";
        for (int i=kelime.length()-1; i>=0;i--){
            reverse += kelime.charAt(i);
        }
        return kelime.equals(reverse);
    }


    public static void main(String[] args) {
        System.out.println(isPolindrome("abba"));
        System.out.println(isPolindrome2("kaykay"));

    }
}
