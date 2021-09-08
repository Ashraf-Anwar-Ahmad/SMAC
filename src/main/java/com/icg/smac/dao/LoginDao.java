package com.icg.smac.dao;

import java.io.Serializable;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.icg.smac.entities.Technician;

@Repository
public interface LoginDao  extends CrudRepository<Technician, Serializable>{

	//Object[] validLogin(TechnicianBean bean);

	@Procedure(name = "Login")
	Object[] validLogin(@Param("USERTYPE") String usertype,@Param("USERID") String userid,@Param("PASSWORD") String paasword);

}
