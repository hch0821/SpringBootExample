package kr.or.connect.roleapp.service;

import kr.or.connect.roleapp.dao.RoleDao;
import kr.or.connect.roleapp.dto.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    @Transactional(readOnly=true)
    public List<Role> getRoles()
    {
        return roleDao.selectAll();
    }
}
