package com.study.ssh.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.study.ssh.model.TmpEmp;
import com.study.ssh.service.TmpEmpService;

@Controller
public class TmpEmpAction extends ActionSupport implements RequestAware {

	@Autowired
	private TmpEmpService tmpEmpService;
	
	private Map<String, Object> request;
	
	private List<TmpEmp> tmpEmps = new ArrayList<TmpEmp>();

	public List<TmpEmp> getTmpEmps() {
		return tmpEmps;
	}

	public void setTmpEmps(List<TmpEmp> tmpEmps) {
		this.tmpEmps = tmpEmps;
	}

	public String viewTmpEmps() {
		tmpEmps = tmpEmpService.findAllTmpEmps();
		//request.put("tmpEmps1", tmpEmps);
		return SUCCESS;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;		
	}
}
