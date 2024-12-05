package com.jmauito.builder.app;

import com.jmauito.builder.article.Article;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Article a1 = Article.builder(1L).description("Only description").build();
        System.out.println("a1: " + a1.toString());
        Article a2 = Article.builder(1L).stock(1).retailPrice(new BigDecimal(10.23)).description("With stock and retailPrice").build();
        System.out.println("a2: " + a2.toString());
    }
}
