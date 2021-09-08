package com.icg.smac.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.icg.smac.bean.TechnicianBean;
import com.icg.smac.entities.Technician;
import com.icg.smac.services.LoginServices;

@Controller
public class LoginController {

	@Autowired
	private LoginServices loginservic;
//	@Autowired
//	private Environment env;

	@RequestMapping( value="/" ,method = RequestMethod.GET )
	public String init(Model model,HttpServletRequest request)
	{
		HttpSession session =request.getSession(false);
		if(session != null && session.getAttribute("userObj") != null)
		{
			return "login";
		}
		
		model.addAttribute("init", new TechnicianBean());
	
		System.out.println(model);
		return "login";
	}
	@PostMapping("/Sign Up")
	public String validLogin(@ModelAttribute TechnicianBean bean ,HttpServletRequest request,final RedirectAttributes attributes)
	{
		//if(bean.getUSERTYPE()!= null  && bean.getUSERID()!=null && bean.getPASSWORD()!=null)
		//{
			Map<String, Object> data = loginservic.validLogin(bean.getUSERTYPE(),bean.getUSERID(),bean.getPASSWORD());
			if(!data.isEmpty()&& data.get("status").toString().equalsIgnoreCase("success"))
			{
				
				HttpSession httpSession=request.getSession(true);
				httpSession.setMaxInactiveInterval(30*60);
				Technician users=(Technician)data.get("user");
				httpSession.setAttribute("userObj",users);
			}
			attributes.addFlashAttribute("msg", "Bad Credentials");
			return "redirect:/";

	}

}
