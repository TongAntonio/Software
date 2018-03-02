/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author Tong
 */
public class Application {

    static Path p = new Path();  // INSTRUMENT

    public static void main (String []argv) {

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
            System.out.println ("Path is " + p);  // INSTRUMENT

        }
        else {
            System.out.println
                    ("Pattern string begins at the character " + n);
            System.out.println ("Path is " + p);  // INSTRUMENT
        }
    }

    public int match(char[] subject, char[] pattern) {

        // Post: if pattern is not a substring of subject, return -1
        //       else return (zero-based) index where the pattern (first)
        //       starts in subject

        final int NOTFOUND = -1;
        int  iSub = 0, rtnIndex = NOTFOUND;
        boolean isPat  = false;
        int subjectLen = subject.length;
        int patternLen = pattern.length;

        p.addNode(1);    // INSTRUMENT
        p.addNode(2);    // INSTRUMENT

        while (isPat == false && iSub + patternLen - 1 < subjectLen) {

            p.addNode(3);    // INSTRUMENT
            p.addNode(4);    // INSTRUMENT
            if (subject [iSub] == pattern [0]) {

                p.addNode(5);    // INSTRUMENT
                p.addNode(6);    // INSTRUMENT
                rtnIndex = iSub; // Starting at zero
                isPat = true;
                for (int iPat = 1; iPat < patternLen; iPat ++,
                        p.addNode(6)// INSTRUMENT
                        ) {

                    p.addNode(7);    // INSTRUMENT

                    if (subject[iSub + iPat] != pattern[iPat]) {
                        rtnIndex = NOTFOUND;
                        isPat = false;
                        p.addNode(8);    // INSTRUMENT
                        break;  // out of for loop
                    }
                    p.addNode(9);    // INSTRUMENT
                }
            }
            p.addNode(10);    // INSTRUMENT
            iSub ++;
        }
        p.addNode(3);    // INSTRUMENT
        p.addNode(11);    // INSTRUMENT
        return rtnIndex;
    }
    static class Path {
        Vector p;
        public Path () {
            p = new Vector();
        }
        public void addNode(int i) {
            p.add(i);
        }
        public String toString() {
            return p.toString();
        }
    }
}
