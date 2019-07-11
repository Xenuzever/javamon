package xyz.purimon.javamon.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

public abstract class AbstractView {

    @Autowired
    protected static Environment environ;

    private static ResourceBundle langBundle;

    private static Map<String, String> langMap;

    static {
        langBundle = getLangBundle();
    }

    private static ResourceBundle getLangBundle() {
        return getBundle("language", Locale.getDefault());
    }

    private static ResourceBundle getLangBundle(Locale locale) {
        return getBundle("language", locale);
    }

    private static ResourceBundle getBundle(String name, Locale locale) {
        return ResourceBundle.getBundle(name, locale);
    }

    public void setLanguage(Locale locale) {
        langBundle = getLangBundle(locale);
    }

    @NotEmpty
    protected String lang(String key) {
        return langBundle.getString(key);
    }

    @NotNull
    @NotEmpty
    public abstract String name();

}
