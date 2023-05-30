package kr.co.acomp.hello.dao;

import kr.co.acomp.hello.vo.Article;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDAO {

    @Autowired
    private SqlSession sqlSession;

    public void insertArticle(Article article){
        sqlSession.insert("mappers.article-mapper.insertArticle", article);
        System.out.println(article);
    }

    public Article selectArticleById(String articleId) {

        return sqlSession.selectOne("mappers.article-mapper.selectArticleById", articleId);
    }
}
