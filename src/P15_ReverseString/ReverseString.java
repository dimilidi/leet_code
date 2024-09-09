package P15_ReverseString;

import static P15_ReverseString.ReverseString_Pointers.reverseStringPointers;
import static P15_ReverseString.ReverseString_SB.reverseStringSB;

public class ReverseString {
    public static void main(String[] args) {

        char [] s = {'h','e','l','l','o'};
        char [] s2 ={'H','a','n','n','a', 'h'};
        char [] s3 = {'h','e','l','l','o'};
        char [] s4 ={'H','a','n','n','a', 'h'};

        reverseStringPointers(s);
        reverseStringPointers(s2);

        reverseStringSB(s3);
        reverseStringSB(s4);
    }
}
