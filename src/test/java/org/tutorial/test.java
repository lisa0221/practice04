package org.tutorial;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class test {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Autowired
    private DataSource dataSource;

    @Test
    public void testEntityManagerFactory() {
        assertNotNull("Entity Manager Factory should not be null", entityManagerFactory);
    }

    @Test
    public void testDataSource() {
        assertNotNull("Data Source should not be null", dataSource);
    }

//    EntityManagerFactory factory;
//
//    @Before
//    public void before() {
//        factory = Persistence.createEntityManagerFactory(null);
//    }
//
//    @Test
//    public void testDataSource() throws SQLException{
////        DataSource dataSource = ctx.getBean(DataSource.class);
////        System.out.println(dataSource.getConnection());
//    }
}
