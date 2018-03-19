package org.chiwooplatform.samples.api.service;

import java.util.List;

import org.chiwooplatform.samples.api.entity.Article;

public interface IArticleService {
    List<Article> getAllArticles();

    Article getArticleById(long articleId);

    boolean addArticle(Article article);

    void updateArticle(Article article);

    void deleteArticle(int articleId);
}
