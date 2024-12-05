package com.jmauito.builder.article;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Article {
    private long id;
    private List<Long> phones;
    private String reference;
    private String description;
    private BigDecimal retailPrice;
    private int stock;
    private List<String> tags;
    private BigDecimal wholesalePrice;

    public Article(long id) {
        this.id = id;
    }

    public static Builder builder(long id) {
        return new Builder(id);
    }

    public String toString() {
        return "{ id: " + this.id + ", description: " + this.description + ", reference: " + this.reference + ", retailPrice: " + this.retailPrice + ", stock: " + this.stock + ", wholesalePrice: " + this.wholesalePrice + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return stock == article.stock && Objects.equals(phones, article.phones) && Objects.equals(reference, article.reference) && Objects.equals(description, article.description) && Objects.equals(retailPrice, article.retailPrice) && Objects.equals(tags, article.tags) && Objects.equals(wholesalePrice, article.wholesalePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phones, reference, description, retailPrice, stock, tags, wholesalePrice);
    }

    public static class Builder {
        private Article article;

        private Builder(long id) {
            this.article = new Article(id);
        }

        public Builder phones(List<Long> phones) {
            this.article.phones = phones;
            return this;
        }

        public Builder reference(String reference) {
            this.article.reference = reference;
            return this;
        }

        public Builder description(String description) {
            this.article.description = description;
            return this;
        }

        public Builder retailPrice(BigDecimal retailPrice) {
            this.article.retailPrice = retailPrice;
            return this;
        }

        public Builder stock(int stock) {
            this.article.stock = stock;
            return this;
        }

        public Builder tags(List<String> tags) {
            this.article.tags = tags;
            return this;
        }

        public Builder wholesalePrice(BigDecimal wholesalePrice) {
            this.article.wholesalePrice = wholesalePrice;
            return this;
        }

        public Article build() {
            return this.article;
        }
    }
}
