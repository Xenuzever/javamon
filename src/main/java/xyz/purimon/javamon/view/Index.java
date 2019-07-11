package xyz.purimon.javamon.view;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Index extends VisibleView {

    public String lang(String key) {
        return super.lang(key);
    }

    @Override
    public @NotNull @NotEmpty String name() {
        return "index";
    }

    @Override
    public String path() {
        return "/";
    }

}
