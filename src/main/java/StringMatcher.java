
import java.util.*;

public class StringMatcher {

    public int match(char[] subject, char[] pattern) {

        // Post: if pattern is not a substring of subject, return -1
        //       else return (zero-based) index where the pattern (first)
        //       starts in subject

        final int NOTFOUND = -1;
        int  iSub = 0, rtnIndex = NOTFOUND;
        boolean isPat  = false;
        int subjectLen = subject.length;
        int patternLen = pattern.length;

        while (isPat == false && iSub + patternLen - 1 < subjectLen) {
            if (subject [iSub] == pattern [0]) {
                rtnIndex = iSub; // Starting at zero
                isPat = true;
                for (int iPat = 1; iPat < patternLen; iPat ++) {
                    if (subject[iSub + iPat] != pattern[iPat]) {
                        rtnIndex = NOTFOUND;
                        isPat = false;
                        break;  // out of for loop
                    }
                }
            }
            iSub ++;
        }
        return rtnIndex;
    }

    public static void main(String[] argv) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Subject: ");
        String subjectStr = scanner.nextLine();

        System.out.print("Pattern: ");
        String patternStr = scanner.nextLine();

        char subject[] = subjectStr.toCharArray();
        char pattern[] = patternStr.toCharArray();
        StringMatcherInstrument matcher = new StringMatcherInstrument();
        int n = matcher.match(subject, pattern);

        if (n == -1) {
            System.out.println
                    ("Pattern string is NOT a substring of the subject string");

        }
        else {
            System.out.println
                    ("Pattern string begins at the character " + n);
        }
    }


}
