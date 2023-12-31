package template.server.api.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "/index";
    }

    @GetMapping("/layout")
    public String layout() {
        return "/test_layout";
    }
}
