package P11_SingleNumber;

import static P11_SingleNumber.SingleNumberMap.singleNumberMap;
import static P11_SingleNumber.SingleNumberXOR.singleNumberXOR;

public class SingelNumber {
    public static void main(String[] args) {

        System.out.println(singleNumberMap(new int[]{4,1,2,1,2})); // 4
        System.out.println(singleNumberMap(new int[]{2, 2, 1})); // 1
        System.out.println(singleNumberMap(new int[]{1})); // 1

        System.out.println(singleNumberXOR(new int[]{4,1,2,1,2})); // 4
        System.out.println(singleNumberXOR(new int[]{2, 2, 1})); // 1
        System.out.println(singleNumberXOR(new int[]{1})); // 1


    }
}
