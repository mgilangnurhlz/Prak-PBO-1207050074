package id.ac.uin.latihan1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class IndexController {
    @GetMapping
    public String hello(){
        return "Selamat datang di pembelajaran Spring Boot";
    }
}
