package com.icg.smac.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.icg.smac.dao.LoginDao;
import com.icg.smac.entities.Technician;

@Service
public class LoginServicesimpl implements LoginServices {

	@Autowired
	private LoginDao logindao;

	@Override
	@Transactional
	public Map<String, Object> validLogin(String usertype, String userid, String password) {
		// TODO Auto-generated method stub
		List<Technician> sendListData = new ArrayList<Technician>();


		Technician sendData = new Technician();

		Object [] data =this.logindao.validLogin(usertype,userid,password);
		Map<String,Object> ar = (HashMap<String,Object>)data[0];

		System.out.println(ar.get("P_RESULT"));
		ResultSet re = (ResultSet)(ar.get("P_Out_Record"));
		//ResultSet msg = (ResultSet)(ar.get("P_RESULT"));
		try {
			while (re.next()) {

				// String lstname  = re.getString("LASTNAME");

				sendData.setFIRSTNAME(re.getString("FIRSTNAME"));
				sendData.setLASTNAME(re.getString("LASTNAME"));
				sendData.setGENDER(re.getString("GENDER"));
				//sendData.setMOBILE_NO(re.getInt("MOBILENUMBER"));
				sendData.setOFFICIAL_EMAIL(re.getString("OFFICIALEMAIL"));
				sendData.setPERSONAL_EMAIL(re.getString("PERSONALEMAIL"));
				sendData.setPAN_NO(re.getString("PANNO"));
				sendData.setDESIG(re.getString("DESIG"));
				//					sendData.setCITY(re.getString("CITY"));
				//					sendData.setSTATE(re.getString("STATE"));
				//					sendData.setPAN_NO(re.getString("PAN_NO"));
				sendData.setADHAAR_NO(re.getString("ADHAARNO"));
				//					sendData.setIS_ACTIVE(re.getInt("IS_ACTIVE"));
				//					sendData.setORG(re.getString("ORG"));

				System.out.println(sendData);
				sendListData.add(sendData);

			}
			sendData.setMessage((String) ar.get("P_RESULT"));


		} catch (SQLException e) {
			e.printStackTrace();
		}


		return ar ;
	}
}
