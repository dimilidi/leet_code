package P25_NumberOf1Bits;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int num = 11;
        int num2 = 128;
        int num3 = 2147483645;

        System.out.println(hammingWeight(num));
        System.out.println(hammingWeight(num2));
        System.out.println(hammingWeight(num3));

        System.out.println(hammingWeightMost(num));
        System.out.println(hammingWeightBinaryString(num));

    }

    public static int hammingWeightBinaryString(int n) {
        String binary = Integer.toBinaryString(n);
        int setBits = 0;

        for(int i = 0; i < binary.length(); i++) {
            char digit = binary.charAt(i);
            if(digit == '1') setBits++;
        }
        return setBits;
    }

    // TC - O(1) -> const number of bits; SC- O(1) - variables
    public static int hammingWeight(int n) {
        int setBits = 0;

        while(n != 0) {
            // Add the least significant bit (LSB) to setBits
            // or  setBits += n % 2;
            setBits += n & 1;
            // Shift the bits of n one position to the right
            n = n >> 1;
        }
        return setBits;
    }

    public static int hammingWeightMost(int n) {
        int setBits = 0;

        // Loop runs until all bits in n are cleared (n becomes 0)
        while(n != 0) {
            // This operation clears the least significant set bit (1) in n
            n = n & (n - 1);
            // Increment the setBits counter for each cleared bit
            setBits +=  1;

        }
        return setBits;
    }
}
