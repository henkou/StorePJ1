package study.store.StorePJ;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        System.out.println("start");
        return "hello";
    }
}
