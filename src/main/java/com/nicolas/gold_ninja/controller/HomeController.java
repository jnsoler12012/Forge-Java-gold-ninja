package com.nicolas.gold_ninja.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpSession session) {
        session.setAttribute("gold", 200);
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String gold(HttpSession httpSession, @RequestParam String value) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        String dateString = formatter.format(date).toString();
        Random random = new Random();

        String first = "You entered a ";
        String place = "";
        String second = " and earned ";
        int gold = Integer.parseInt(httpSession.getAttribute("gold").toString());

        System.out.println(gold);

        
        switch (value) {
            case "farm":
                place = "farm";
                gold = gold + random.nextInt(20 - 10 + 1) + 10;
                break;
            case "cave":
                place = "cave";
                gold = gold +  random.nextInt(10 - 5 + 1) + 5;
                break;
            case "house":
                place = "house";
                gold = gold +  random.nextInt(5 - 2 + 1) + 2;
                break;
            case "casino":
                place = "casino";
                int randomChoise = random.nextInt(2 - 1 + 1) + 1;
                if (randomChoise == 1) {
                    gold = gold +  random.nextInt(50 - 0 + 1) + 0;
                } else {
                    gold = gold -  random.nextInt(50 - 0 + 1) + 0;
                }
                break;
            default:
                break;
        }
        String finalString = httpSession.getAttribute("logger_info") + first + place + second + gold + " (" + dateString
                + ")\n";

        httpSession.setAttribute("logger_info", finalString);
        httpSession.setAttribute("gold", gold);

        System.out.println(finalString);

        return "index";
    }
}
