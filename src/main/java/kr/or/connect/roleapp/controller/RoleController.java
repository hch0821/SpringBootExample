package kr.or.connect.roleapp.controller;

import kr.or.connect.roleapp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public String roles(ModelMap modelMap){
        modelMap.addAttribute("list", roleService.getRoles());
        return "roles"; // /resources/templates/roles.html
    }
}
