package com.study.ssh.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.ssh.dao.TmpEmpDao;
import com.study.ssh.model.TmpEmp;

@Repository
public class TmpEmpDaoImpl implements TmpEmpDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<TmpEmp> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from TmpEmp").list();
	}

}
