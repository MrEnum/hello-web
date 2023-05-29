package kr.co.acomp.hello.controller;

import kr.co.acomp.hello.service.BbsService;
import kr.co.acomp.hello.vo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bbs")
public class BbsController {

    @Autowired
    private BbsService bbsService;

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("/{articleId}")
    @ResponseBody//객체를 그대로 리턴
    public Article viewDetail(@PathVariable String articleId) {
        Article article = this.bbsService.viewArticleDetail(articleId);
        return article;
    }

//    @GetMapping("/{articleId}")
//    public String viewDetail(@PathVariable String articleId) {
//    	System.out.println("글번호: " + articleId);
//    	return "write_ok";
//    }

    @PostMapping(value = "/write")
    @ResponseBody
    public Article write(@RequestBody Article article) {
        Article a = article;
        return a;
    }

//    @PostMapping(value="/write")
//    public ModelAndView doWrite(Article article) {
//        bbsService.registArticle(article);
//        System.out.println("post request ...");
//        ModelAndView model = new ModelAndView("write_ok").addObject("article", article);
//        return model;
//    }

    @GetMapping("/write")
    public String write() {
        bbsService.registArticle(new Article());
        System.out.println("get request");

        return "write_ok";
    }
}
