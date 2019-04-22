package com.example.demo.controller;

import com.example.demo.dto.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shuaihu2
 * @Date: 2019/4/22
 * @Interface: IndexController
 * @Description:
 */
@Controller
@RequestMapping
public class IndexController {

    @RequestMapping("/")
    public String demo(Model model){

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("hushuai",18,"1"));
        students.add(new Student("xiongyang",19,"2"));
        students.add(new Student("peili",20,"5"));
        model.addAttribute("isManager",true);
        model.addAttribute("studentList",students);
        model.addAttribute("companyName","胡帅有限公司");
        model.addAttribute("htmlDiv","<h4>我就是爱java</h4>");
        return "/demo.html";
    }
}
