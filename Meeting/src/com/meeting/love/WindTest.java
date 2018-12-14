package com.meeting.love;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.meeting.love.model.LoveDAO;
import com.meeting.love.model.TestDTO;

@WebServlet("/love/windtest.do")
public class WindTest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		LoveDAO dao = new LoveDAO();
		
		ArrayList<TestDTO> list = dao.question();
		
		req.setAttribute("list", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/love/windtest.jsp");
		dispatcher.forward(req, resp);
	}
}