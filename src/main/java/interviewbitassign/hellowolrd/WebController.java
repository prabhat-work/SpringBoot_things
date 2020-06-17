package interviewbitassign.hellowolrd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/hello")
    public String sayHello(Model model){
       // model.addAttribute(attributeName: "message" , attributeValue "Greetings , Here we are with thymetic theme");
        System.out.println("System is giving boot thing");
        return "hello";
    }
}
