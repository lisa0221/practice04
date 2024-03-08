package org.tutorial.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Table(name = "dept2")
@Entity //標示此類別為永續類別
@NamedQuery(name = "dept.all", query = "SELECT dept FROM DeptDO dept")
public class DeptDO implements Serializable {

    @Id //主鍵
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPTNO", nullable = false, columnDefinition = "NUMBER(3)")
    private Integer deptno;

    @Column(name = "DNAME", columnDefinition = "VARCHAR2(14 CHAR)")
    private String dname;

    @Column(name = "LOC", columnDefinition = "VARCHAR2(13 CHAR)")
    private String loc;

    @OneToMany(mappedBy = "deptDO", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<EmpDO> empDOs;
}