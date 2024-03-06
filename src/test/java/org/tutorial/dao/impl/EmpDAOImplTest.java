package org.tutorial.dao.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.tutorial.dao.EmpDAO;
import org.tutorial.model.entity.EmpDO;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
//@ContextConfiguration(classes = SpringDataJPAConfig.class)
public class EmpDAOImplTest {

    // Field Injection
    @Autowired
    private EmpDAO dao;

//    @Test
//    public void findByPrimaryKey() {
//        EmpDO empDO = dao.findByPrimaryKey(1);
//        assertEquals(Integer.valueOf(1), empDO.getEmpno());
//        assertEquals("king", empDO.getEname());
//        assertEquals("president", empDO.getJob());
//    }

    @Test
    public void getAll() {
        List<EmpDO> list = dao.getAll();
        for (EmpDO empDO : list) {
            System.out.print(empDO.getEmpno() + ",");
            System.out.print(empDO.getEname() + ",");
            System.out.print(empDO.getJob() + ",");
            System.out.print(empDO.getHiredate() + ",");
            System.out.print(empDO.getSal() + ",");
            System.out.print(empDO.getComm() + ",");
            System.out.print(empDO.getDeptDO().getDeptno());
            System.out.println();
        }
    }



    // @Test
    // public void insert() {
    // EmpDO empDO = new EmpDO();
    // empDO.setEname("王小明2");
    // empDO.setJob("manager");
    // empDO.setHiredate(LocalDate.parse("2020-04-01"));
    // empDO.setSal(50000.0);
    // empDO.setComm(500.0);
    // empDO.setDeptDO(10);
    // dao.insert(empDO);
    // assertTrue(true);
    // }
    //
    // @Test
    // public void update() {
    // EmpDO empDO = new EmpDO();
    // empDO.setEmpno(2);
    // empDO.setEname("王小明2");
    // empDO.setJob("manager2");
    // empDO.setHiredate(LocalDate.parse(("2020-04-01")));
    // empDO.setSal(20000.0);
    // empDO.setComm(200.0);
    // empDO.setDeptno(20);
    // dao.update(empDO);
    // assertTrue(true);
    // }
    //
    // @Test
    // public void delete() {
    // dao.delete(4);
    // assertTrue(true);
    // }

    // @Test
    // public void findByPrimaryKey() {
    // EmpDO empDO = dao.findByPrimaryKey(1);
    // assertEquals(Integer.valueOf(1), empDO.getEmpno());
    // assertEquals("king", empDO.getEname());
    // assertEquals("president", empDO.getJob());
    // }
    //
    // @Test
    // public void getAll() {
    // List<EmpDO> list = dao.getAll();
    // for (EmpDO empDO : list) {
    // System.out.print(empDO.getEmpno() + ",");
    // System.out.print(empDO.getEname() + ",");
    // System.out.print(empDO.getJob() + ",");
    // System.out.print(empDO.getHiredate() + ",");
    // System.out.print(empDO.getSal() + ",");
    // System.out.print(empDO.getComm() + ",");
    // System.out.print(empDO.getDeptno());
    // System.out.println();
    // }
    // }

}