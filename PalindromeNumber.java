public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int a = 0, b = str.length() - 1;

        while(a <= b){
            if(str.charAt(a) != str.charAt(b)){
                return false;
            }
            a++;
            b--;
        }

        return true;
    }
}
