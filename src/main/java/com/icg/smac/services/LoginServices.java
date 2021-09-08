package com.icg.smac.services;

import java.util.List;
import java.util.Map;

import com.icg.smac.bean.TechnicianBean;
import com.icg.smac.entities.Technician;

public interface LoginServices {

	//List<Technician> validLogin(TechnicianBean bean);

	Map<String, Object> validLogin(String usertype, String userid, String password);

}
