package xyz.purimon.javamon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import xyz.purimon.javamon.view.AbstractView;
import xyz.purimon.javamon.view.Footer;
import xyz.purimon.javamon.view.Header;

import java.util.function.Function;


public abstract class AbstractController<V extends AbstractView> {

    @Autowired
    protected Environment environ;

    protected final Header header = new Header();

    protected final Footer footer = new Footer();

    protected final V view = createView();

    protected Function<Model, String> redirectViewLogic = model -> {
        loadLayout(model);
        return view.name();
    };

    protected void loadLayout(Model model) {
        model.addAttribute("header", header);
        model.addAttribute("footer", footer);
        model.addAttribute("view", view);
    }

    protected abstract V createView();

}
