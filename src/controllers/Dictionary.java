package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    @GetMapping("")
    public  String tran(){
        return "index";
    }
    @GetMapping("/translate")
    public String translate(@RequestParam String word, Model model){
        Map<String,String> dictionary=new HashMap<>();
        dictionary.put("Hello","xin chao");
        dictionary.put("Key","khoa");
        dictionary.put("Hi","xin chao");

        for (String key:dictionary.keySet()){
            if (key.equalsIgnoreCase(word.trim())){
                model.addAttribute("result",dictionary.get(key));
                break;
            }
        }
        return "index";
    }
}
