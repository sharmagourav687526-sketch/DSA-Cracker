package Leetcode;

public class SumGame1927 {
    public boolean sumGame(String num) {
        int len = num.length();
        int leftKnownSum = 0;
        int rightKnownSum = 0;

        int leftQuestionMarkSum = 0;
        int rightQuestionMarkSum = 0;

        for (int i = 0; i < len; i++) {
            if (num.charAt(i) == '?') {
                if (i < len / 2) {
                    leftQuestionMarkSum++;
                } else {
                    rightQuestionMarkSum++;
                }
            } else {
                if (i < len / 2) {
                    leftKnownSum += num.charAt(i) - '0';
                } else {
                    rightKnownSum += num.charAt(i) - '0';
                }
            }
        }

        int totalQuestionMarkSum = leftQuestionMarkSum + rightQuestionMarkSum;

        if (totalQuestionMarkSum % 2 == 1) {
            // Alice will always win
            return true;
        }

        int LEFT = 2 * leftKnownSum + 9 * leftQuestionMarkSum;
        int RIGHT = 2 * rightKnownSum + 9 * rightQuestionMarkSum;

        if (LEFT == RIGHT) {
            // Bob Wins
            return false;
        } else {
            // Alice wins
            return true;
        }

    }
}
