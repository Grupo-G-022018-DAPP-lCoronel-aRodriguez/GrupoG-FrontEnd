package ar.edu.unq.desapp.grupoG.controllers;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Secured(value="IS_AUTHENTICATED_FULLY")
    @RequestMapping(value="/userHome", method = RequestMethod.GET)
    public @ResponseBody Object getUserProfile() {


        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}