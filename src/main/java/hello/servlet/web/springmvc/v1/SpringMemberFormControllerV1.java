package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//스프링 빈으로 등록
//RequestMappingHandlerMapping 핸들러 맵핑이 인식
@Controller
public class SpringMemberFormControllerV1 {

    //URL 요청과 메서드를 매핑
    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
