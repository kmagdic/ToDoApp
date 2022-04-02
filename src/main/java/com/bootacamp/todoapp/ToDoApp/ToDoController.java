package com.bootacamp.todoapp.ToDoApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.*;

@Controller
public class ToDoController {



    @GetMapping("/sumtest")
    void sumTest(@RequestParam int a, @RequestParam int b, ServletResponse response) throws IOException {
        int r = a + b;

        response.getWriter().println("Rezultat: " + r);
    }

    @GetMapping("/calculator")
    String calculator(Model model) {
        model.addAttribute("result", 0);
        return "calculator";
    }


    @GetMapping("/sumtest2")
    String sumTest2(@RequestParam int a, @RequestParam int b, Model model) {
        int r = a + b;


        List<String> testList = new ArrayList<>();
        testList.add("Karlo");
        testList.add("Ivan");
        testList.add("Mona");
        model.addAttribute("testList", testList);

        model.addAttribute("result", r);

        return "calculator";
    }

}
