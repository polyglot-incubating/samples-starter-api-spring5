package org.chiwooplatform.samples.api.service;

import java.util.ArrayList;
import java.util.List;

import org.chiwooplatform.samples.api.entity.Article;
import org.chiwooplatform.samples.api.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService implements IArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article getArticleById(long articleId) {
        Article obj = articleRepository.findById(articleId).get();
        return obj;
    }

    @Override
    public List<Article> getAllArticles() {
        List<Article> list = new ArrayList<>();
        articleRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public synchronized boolean addArticle(Article article) {
        List<Article> list = articleRepository.findByTitleAndCategory(article.getTitle(), article.getCategory());
        if (list.size() > 0) {
            return false;
        }
        else {
            articleRepository.save(article);
            return true;
        }
    }

    @Override
    public void updateArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void deleteArticle(int articleId) {
        articleRepository.delete(getArticleById(articleId));
    }
}
