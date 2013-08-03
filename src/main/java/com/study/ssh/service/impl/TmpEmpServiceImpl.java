package com.study.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.ssh.dao.TmpEmpDao;
import com.study.ssh.model.TmpEmp;
import com.study.ssh.service.TmpEmpService;

@Service
public class TmpEmpServiceImpl implements TmpEmpService {

	@Autowired
	private TmpEmpDao tmpEmpDao;

	@Transactional
	public List<TmpEmp> findAllTmpEmps() {
		return tmpEmpDao.findAll();
	}
}
