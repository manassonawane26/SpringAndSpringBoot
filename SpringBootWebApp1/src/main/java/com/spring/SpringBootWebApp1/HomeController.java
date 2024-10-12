package com.spring.SpringBootWebApp1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }
//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1= Integer.parseInt(req.getParameter("num1"));
//        int num2= Integer.parseInt(req.getParameter("num2"));
//        session.setAttribute("result", num1+num2);
//        return "result.jsp";
//    }
//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){
//        model.addAttribute("result", num1+num2);
//        return "result";
//    }

//    @RequestMapping("add")
//    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
//        mv.addObject("result", num1+num2);
//        mv.setViewName("result");
//        return mv;
//    }

//    @RequestMapping("addAlien")
//    public ModelAndView add(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv){
//        Alien alien= new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("result", alien);
//        mv.setViewName("result");
//        return mv;
//    }
    @RequestMapping("addAlien")
    public String add(@ModelAttribute("alien1") Alien alien){
        return ("result");
    }

}
