package com.jmauito.builder;

import com.jmauito.builder.article.Article;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class BuilderTest {

    @Test
    public void shouldCreateAnArticleOnlyWithDescription()
    {
        Article expectedArticle = Article.builder(1).description("Computer").build();
        Article article = Article.builder(2).description("Computer").build();
        Assertions.assertEquals(expectedArticle, article);
    }

    @Test
    public void shouldCreateAnArticleWithDescriptionAndRetailPrice()
    {
        Article expectedArticle = Article.builder(1).description("Computer").retailPrice(new BigDecimal(50.00)).build();
        Article article = Article.builder(2).description("Computer").retailPrice(new BigDecimal(50.00)).build();
        Assertions.assertEquals(expectedArticle, article);
    }
}
