package com.example.tdd_java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class IssueFactoryTest {
    @Test
    public void test_singleLine(){
        String result = IssueFactory
                .create("質問", "回答");
        String expectResult = "###Question\n> 質問\n\n###Answer\n回答";
        assertThat(result, is(expectResult));
    }

    @Test
    public void test_multiLine(){
        String result = IssueFactory
                .create("質問\n2行目", "回答");
        String expectResult = "###Question\n> 質問\n> 2行目\n\n###Answer\n回答";
        assertThat(result, is(expectResult));
    }

    @Test
    public void test_multiLine_answer(){
        String result = IssueFactory
                .create("質問\n2行目", "回答\n2行目");
        String expectResult = "###Question\n> 質問\n> 2行目\n\n###Answer\n回答\n2行目";
        assertThat(result, is(expectResult));
    }

    public static class FormatQuestionData {
        String question;
        String result;

        public FormatQuestionData(String question, String result){
            this.question = question;
            this.result = result;
        }
    }

    public static Stream<FormatQuestionData> formatQuestionData() {
        return Stream.of(
                new FormatQuestionData("質問", "###Question\n> 質問"),
                new FormatQuestionData("質問\n2行目", "###Question\n> 質問\n> 2行目"),
                new FormatQuestionData("質問\n2行目\n3行目", "###Question\n> 質問\n> 2行目\n> 3行目"),
                new FormatQuestionData("質問\n2行目\n@testアノテーションについて", "###Question\n> 質問\n> 2行目\n> `@test`アノテーションについて")
        );
    }

    @ParameterizedTest
    @MethodSource("formatQuestionData")
    public void test_formatQuestion(FormatQuestionData data){
        String result = IssueFactory
                .formatQuestion(data.question);
        String expectResult = data.result;
        assertThat(result, is(expectResult));
    }

    public static class FormatAnswerData {
        String answer;
        String result;

        public FormatAnswerData(String answer, String result){
            this.answer = answer;
            this.result = result;
        }
    }

    public static Stream<FormatAnswerData> formatAnswerData() {
        return Stream.of(
                new FormatAnswerData("回答", "###Answer\n回答"),
                new FormatAnswerData("回答\n2行目", "###Answer\n回答\n2行目"),
                new FormatAnswerData("回答\n@testアノテーションについて", "###Answer\n回答\n`@test`アノテーションについて")
        );
    }

    @ParameterizedTest
    @MethodSource("formatAnswerData")
    public void test_formatAnswer(FormatAnswerData data){
        String result = IssueFactory
                .formatAnswer(data.answer);
        String expectResult = data.result;
        assertThat(result, is(expectResult));
    }
}
