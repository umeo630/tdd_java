package com.example.tdd_java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IssueFactory {
    public static String create(String question, String answer){
        String template = "%s\n\n%s";
        String formattedQuestion = formatQuestion(question);
        String formattedAnswer = formatAnswer(answer);
        return String.format(template, formattedQuestion, formattedAnswer);
    }

    public static String formatQuestion(String question) {
        String replaced = question.replace("\n", "\n> ");

        return "###Question\n> " + encloseAtWord(replaced);
    }

    public static String formatAnswer(String answer) {
        return "###Answer\n" + encloseAtWord(answer);
    }

    public static String encloseAtWord(String input) {
        Pattern pattern = Pattern.compile("@\\w+");
        Matcher matcher = pattern.matcher(input);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(result, "`" + matcher.group() + "`");
        }
        matcher.appendTail(result);

        return result.toString();
    }

    public static void main(String[] args){
        System.out.println();
    }
}
