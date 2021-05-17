package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String skillsHome() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills you need to learn!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/form' method = 'POST'>" +
                "Name:  " +
                "<br>" +
                "<input type = 'text' name = 'name'>" +
                "<br>" +
                "<br>" +
                "Primary Language:  " +
                "<br>" +
                "<select name = 'lang1'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<br>" +
                "Secondary Language:  " +
                "<br>" +
                "<select name = 'lang2'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<br>" +
                "Tertiary Language:  " +
                "<br>" +
                "<select name = 'lang3'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<br>" +
                "<input type = 'submit' value = 'Submit Form'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String formHandler(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3) {
        return "<html>" +
                "<body>" +
                "<h1>Hello " +
                name +
                ", you selected these three languages</h1>" +
                "<table>" +
                "<tr>" +
                "<th >Programming Language</th>" +
                "<th>Priority</th>" +
                "</tr>" +
                "<tr>" +
                "<td>" +
                lang1 +
                "</td>" +
                "<td>Primary</td>" +
                "</tr>" +
                "<tr>" +
                "<td>" +
                lang2 +
                "</td>" +
                "<td>Secondary</td>" +
                "</tr>" +
                "<tr>" +
                "<td>" +
                lang3 +
                "</td>" +
                "<td>Tertiary</td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";

    }
}
