package xyz.purimon.javamon.view;

import xyz.purimon.javamon.view.AbstractView;
import xyz.purimon.javamon.view.VisibleView;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Footer extends AbstractView {

    public String lang(String key) {
        return super.lang(key);
    }

    @Override
    public @NotNull @NotEmpty String name() {
        return "footer";
    }

}
