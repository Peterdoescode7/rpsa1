package sheridan.drabpe.rpsa1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import sheridan.drabpe.rpsa1.domain.Choice;
import sheridan.drabpe.rpsa1.domain.Opponent;
import sheridan.drabpe.rpsa1.domain.Winner;

@Controller
public class inputoutputController {

    @GetMapping(value ={"/", "/Input"})
    public ModelAndView input(){

        return new ModelAndView("Input", "choice", new Choice());
    }

    @GetMapping("/Output")
    public String output(@ModelAttribute Choice choice, Opponent opponent, Winner winner, Model model){


        model.addAttribute("choice", choice);
        model.addAttribute("opponent", opponent);
        model.addAttribute("winner", winner);
        return "Output";
    }
}
