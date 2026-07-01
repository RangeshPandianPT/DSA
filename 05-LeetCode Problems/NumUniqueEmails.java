package CodingQuestions;

import java.util.HashSet;

public class NumUniqueEmails {

    public static void main(String[] args) {

        String[] emails = {
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        };

        System.out.println("Number of Unique Emails: " + numUniqueEmails(emails));
    }

    static int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<>();

        for (String email : emails) {

            int atPos = email.indexOf('@');

            String local = email.substring(0, atPos);
            String domain = email.substring(atPos);

            // Remove all dots
            local = local.replace(".", "");

            // Ignore everything after '+'
            if (local.contains("+")) {
                int plusPos = local.indexOf('+');
                local = local.substring(0, plusPos);
            }

            String newEmail = local + domain;

            // Add normalized email to HashSet
            set.add(newEmail);
        }

        return set.size();
    }
}