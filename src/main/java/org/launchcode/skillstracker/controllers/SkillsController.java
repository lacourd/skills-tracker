package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping()
    @ResponseBody
    public String homePage(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form action='submit' method='post'>" +
                "<label for='username'>Name:</label><br>" +
                "<input type='text' name='name'><br>" +
                "<label for='language1-select'>My favorite language:</label><br>" +
                "<select name='language1' id='language1-select'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='Javascript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='language2-select'>My second favorite language:</label><br>" +
                "<select name='language2' id='language2-select'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='language3-select'>My third favorite language:</label><br>" +
                "<select name='language3' id='language2-select'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @PostMapping("submit")
    @ResponseBody
    public String userForm(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<ol>" +
                "<li>"+ language1 + "</li>" +
                "<li>"+ language2 + "</li>" +
                "<li>"+ language3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
