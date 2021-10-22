package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Classes;
import com.entity.Subject;
import com.entity.TeacherSubject;
import com.service.ClassesService;
import com.service.TeacherSubjectService;

/**
 * Servlet implementation class AssignTeachersController
 */
public class AssignTeachersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignTeachersController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Connection con;
		ResultSet rs;
		ResultSet rs1;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root@123");
			Statement statement = con.createStatement();
			String query="Select teachersubject.sid,teachersubject.stid,teacher.tname from teachersubject JOIN teacher on teachersubject.stid=teacher.tid";
			rs = statement.executeQuery(query);

			pw.println("<table><tr>");
			pw.println("<th>SId</th>");
			pw.println("<th>TId</th>");
			pw.println("<th>Teacher Name</th>");

			pw.println("</tr>");
			pw.println("</table>");
			while(rs.next())
			{
				String sid = rs.getString("sid");
				String stid = rs.getString("stid");
				String tname = rs.getString("tname");

				pw.println("<table><tr>");
				pw.println("<td style=\'text-align:center\'>"+sid+"</td>");
				pw.println("<td style=\'text-align:center\'>"+stid+"</td>");
				pw.println("<td style=\'text-align:center\'>"+tname+"</td>");
			}
			pw.println("</tr>");
			pw.println("</table>");

			
			String query1="Select teachersubject.sid,teachersubject.stid,subject.sname from teachersubject JOIN subject on teachersubject.sid=subject.sid";
			rs1 = statement.executeQuery(query1);
			
			pw.println("<br/><br/>");
			pw.println("<table><tr>");
			pw.println("<th>SId</th>");
			pw.println("<th>TId</th>");
			pw.println("<th>Subject Name</th>");
			pw.println("</tr>");
			pw.println("</table>");
			while(rs1.next())
			{
				String sid = rs1.getString("sid");
				String stid = rs1.getString("stid");
				String sname = rs1.getString("sname");

			pw.println("<table><tr>");
			pw.println("<td style=\'text-align:center\'>"+sid+"</td>");
			pw.println("<td style=\'text-align:center\'>"+stid+"</td>");
			pw.println("<td>"+sname+"</td>");

			pw.println("</tr>");
			pw.println("</table>");

			}
		try
		{
		con.close();
		}
		catch(Exception e)
		{
		pw.println(e);
		}
		}
		catch(SQLException sx)
		{
		pw.println(sx);
		}
		catch(ClassNotFoundException cx)
		{
		pw.println(cx);
		}
		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
       PrintWriter pw=response.getWriter();
		
		int stid=Integer.parseInt(request.getParameter("stid"));
		int sid=Integer.parseInt(request.getParameter("sid"));
		
		TeacherSubject ts=new TeacherSubject();
		ts.setSid(sid);
		ts.setStid(stid);
		TeacherSubjectService ser=new TeacherSubjectService();
		String result=ser.storeTeacherSubjectInfo(ts);
		
		doGet(request, response);
		pw.print(result);
		
		RequestDispatcher rd=request.getRequestDispatcher("homepage.jsp");
		rd.include(request, response);  //source+target page combine as one page
	}

}
