public class Number_of_1Bits {
    public int hammingWeight(int n) {
		int setBitCount = 0;
        
		while (n != 0) {
            n &= (n - 1);
            ++setBitCount;
        }
		
        return setBitCount;
    }
}
