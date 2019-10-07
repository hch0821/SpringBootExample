package kr.or.connect.roleapp;

import kr.or.connect.roleapp.dao.RoleDao;
import kr.or.connect.roleapp.dto.Role;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleDaoTest {

    @Autowired
    private RoleDao roleDao;

    @Test
    public void selectAll() throws Exception{
        List<Role> roles = roleDao.selectAll();
        for(Role role : roles){
            System.out.println(role);
        }
        Assert.assertEquals(roles.size(), 3);
    }
}
