package kr.co.acomp.hello.dao;

import kr.co.acomp.hello.vo.Article;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDAO {

    public void insertArticle(Article article){
        System.out.println("insert ok ...");
    }

    public Article selectArticleById(String articleId) {
        Article article = new Article(10, "lee", "test", "테스트입니다.");
        return article;
    }
}
