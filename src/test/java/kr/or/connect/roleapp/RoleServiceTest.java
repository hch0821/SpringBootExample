package kr.or.connect.roleapp;


import kr.or.connect.roleapp.service.RoleService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceTest {

    @Autowired
    private RoleService roleService;

    @Test
    public void roleServiceTest(){
        Assert.assertEquals(roleService.getRoles().size(), 3);
    }
}
