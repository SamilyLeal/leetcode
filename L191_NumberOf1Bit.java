public class L191_NumberOf1Bit {
    public int hammingWeight(int n) {
        int t = 0;

        while(n != 0){
            n &= (n-1);
            ++t;
        }

        return t;
    }
}
