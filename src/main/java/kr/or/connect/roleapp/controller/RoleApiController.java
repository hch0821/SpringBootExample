package kr.or.connect.roleapp.controller;

import kr.or.connect.roleapp.dto.Role;
import kr.or.connect.roleapp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleApiController {
    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> roles() throws Exception
    {
        return roleService.getRoles();
    }
}
