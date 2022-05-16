package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.repository.RoleRepository;
import ru.kata.spring.boot_security.demo.repository.RoleRepositoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class RoleService {

    private RoleRepositoryImpl roleRepositoryImpl;
    @Autowired
    public void setRoleRepository(RoleRepositoryImpl roleRepositoryImpl) {
        this.roleRepositoryImpl = roleRepositoryImpl;
    }

    @PersistenceContext
    private EntityManager entityManager;

    public List<Role> getAllRoles() {
        return roleRepositoryImpl.getAllRoles();
//        return entityManager.createQuery("select r from Role r ", Role.class).getResultList();
    }
}
