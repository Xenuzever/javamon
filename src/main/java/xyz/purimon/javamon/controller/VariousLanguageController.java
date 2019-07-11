package xyz.purimon.javamon.controller;

import org.springframework.ui.Model;
import xyz.purimon.javamon.view.VisibleView;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

public abstract class VariousLanguageController<V extends VisibleView> extends AbstractController<V> {

    private static Locale currentLocale = Locale.getDefault();

    protected void setEnglish() {
        currentLocale = Locale.ENGLISH;
    }

    protected void setJapanese() {
        currentLocale = Locale.JAPANESE;
    }

    public String redirectReferer(HttpServletRequest req) {
        return String.format("redirect:%s", req.getHeader("REFERER"));
    }

    @Override
    protected void loadLayout(Model model) {
        header.setLanguage(currentLocale);
        footer.setLanguage(currentLocale);
        view.setLanguage(currentLocale);
        super.loadLayout(model);
    }

}
