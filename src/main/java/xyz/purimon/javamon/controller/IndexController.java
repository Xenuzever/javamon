package xyz.purimon.javamon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.purimon.javamon.view.Index;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController extends VariousLanguageController<Index> {

    @RequestMapping(value = "/")
    public String index(Model model) {
        return redirectViewLogic.apply(model);
    }

    @RequestMapping(value = "/en")
    public String langEn(HttpServletRequest req) {
        setEnglish();
        return redirectReferer(req);
    }

    @RequestMapping(value = "/ja")
    public String langJa(HttpServletRequest req) {
        setJapanese();
        return redirectReferer(req);
    }

    @Override
    protected Index createView() {
        return new Index();
    }

}
