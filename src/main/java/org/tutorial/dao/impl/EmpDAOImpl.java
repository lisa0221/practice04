package org.tutorial.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.tutorial.dao.EmpDAO;
import org.tutorial.model.entity.EmpDO;

@Repository
public class EmpDAOImpl implements EmpDAO {

    // 由 Spring 注入 EntityManager
    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public void insert(EmpDO empDO) {
        entityManager.persist(empDO);
    }

    @Override
    public void update(EmpDO empDO) {
        entityManager.merge(empDO);
    }

    @Override
    public void delete(Integer empno) {
        EmpDO empDO = entityManager.find(EmpDO.class, empno);
        entityManager.remove(empDO);
    }

    @Override
    public EmpDO findByPrimaryKey(Integer empno) {
        return entityManager.find(EmpDO.class, empno);
    }

    @Override
    public List<EmpDO> getAll() {
        //Name Query
        //如果返回單個實體就用類別去接收，如果是多個，就用集合去接收
        Query query = entityManager.createNamedQuery("emp.all");
        //JPQL Query
//        Query query = entityManager.createQuery("SELECT emp FROM EmpDO emp");
        //Native Query
//        Query query = entityManager.createNativeQuery("SELECT * FROM emp2", EmpDO.class);
        return query.getResultList();
    }

}
