package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hilal on 25.08.2016.
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "HI FROM SPRING BOOT HELLO WORD APPLICATION";
    }
}
