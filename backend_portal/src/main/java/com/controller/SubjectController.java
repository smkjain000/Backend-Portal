package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Subject;
import com.entity.Teacher;
import com.service.SubjectService;
import com.service.TeacherService;

/**
 * Servlet implementation class SubjectController
 */
public class SubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		SubjectService ser=new SubjectService();
		List<Subject> listOfSubject=ser.getAllSubject();
		request.setAttribute("obj", listOfSubject);
		RequestDispatcher rd=request.getRequestDispatcher("displaySubject.jsp");
		rd.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
PrintWriter pw=response.getWriter();
		
		int sid=Integer.parseInt(request.getParameter("sid"));
		String sname=request.getParameter("sname");
		
		Subject ss=new Subject();
		ss.setSid(sid);
		ss.setSname(sname);
		SubjectService ser=new SubjectService();
		String result=ser.storeSubjectInfo(ss);
		
		doGet(request, response);
		pw.print(result);
		
		RequestDispatcher rd=request.getRequestDispatcher("homepage.jsp");
		rd.include(request, response);  //source+target page combine as one page
	}
	}


