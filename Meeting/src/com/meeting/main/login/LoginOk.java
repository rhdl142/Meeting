package com.meeting.main.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/main/loginok.do")
public class LoginOk extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String id =  req.getParameter("id");
		String pw = req.getParameter("password");
		
		LoginDTO dto = new LoginDTO();
		dto.setId(id);
		dto.setPw(pw);
		
		LoginDAO dao = new LoginDAO();
		dto = dao.login(dto); 
		
		resp.setCharacterEncoding("UTF-8");
		
		if(dto !=null) { // 로그인 성공
			
			session.setAttribute("id", dto.getId());
			session.setAttribute("name", dto.getName());
			session.setAttribute("grade", dto.getGrade());
			resp.sendRedirect("/MeetingSample/sample/template.do");
		} else { // 로그인 실패
			resp.getWriter().write("<script>alert('로그인 실패')</script>");
		}

	}

}