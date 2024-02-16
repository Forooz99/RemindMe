package remindme.remindme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Spring’s component scanning automatically discovers this
// (@Controller) and creates an instance of HomeController 
// as a bean in Spring application context
@Controller
public class HomeController {
    // if HTTP GET request is received for the root path /
    @GetMapping("/")
    public String home() {
        return "home";
    }
    
}
