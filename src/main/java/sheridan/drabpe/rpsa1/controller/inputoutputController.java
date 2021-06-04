package sheridan.drabpe.rpsa1.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;

public class inputoutputController {

    @GetMapping(value ={"/", "/Input"})
    public ModelAndView input(){

        return new ModelAndView("Input", "employee", new Choice());
    }

    @GetMapping("/Output")
    public String output(@Validated @ModelAttribute Choice employee,
                         BindingResult bindingResult,
                         Model model){

        if(bindingResult.hasErrors()){
            return "Input";
        }

        model.addAttribute("employee", employee);
        return "Output";
    }
}