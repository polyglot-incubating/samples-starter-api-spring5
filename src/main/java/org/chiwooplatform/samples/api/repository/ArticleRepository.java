package org.chiwooplatform.samples.api.repository;

import java.util.List;

import org.chiwooplatform.samples.api.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    List<Article> findByTitle(String title);

    List<Article> findDistinctByCategory(String category);

    List<Article> findByTitleAndCategory(String title, String category);
}
