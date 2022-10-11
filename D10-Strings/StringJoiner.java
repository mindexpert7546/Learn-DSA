/**
 * Java added a new final class StringJoiner in java.util package. It is used to construct a sequence of characters separated by a delimiter. Now, you can create string by passing delimiters like comma(,), hyphen(-) etc. You can also pass prefix and suffix to the char sequence.
 *
 * Output like that :
 * A,B,C
 * P:Q:R
 * X-Y-Z
 *
 *
 */
/**
 * Java added a new final class StringJoiner in java.util package. It is used to construct a sequence of characters separated by a delimiter. Now, you can create string by passing delimiters like comma(,), hyphen(-) etc. You can also pass prefix and suffix to the char sequence.
 *
 * Output like that :
 * [A,B,C]
 * P:Q:R
 * X-Y-Z
 *[A,B,C,D,P:Q:R]
 *
 */

import java.util.StringJoiner;

public class JavaCommaColon {
    public static void main(String[] args) {
        StringJoiner str1 = new StringJoiner("," ,"[" ,"]");
        str1.add("A").add("B").add("C").add("D");
        StringJoiner str2 = new StringJoiner(":");
        str2.add("P").add("Q").add("R");
        StringJoiner str3 = new StringJoiner("-");
        str3.add("X").add("Y").add("Z");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        str1.merge(str2);
        System.err.println(str1);
    }
}
