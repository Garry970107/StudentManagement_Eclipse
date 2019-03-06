package Servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Domain.Student;
import Service.StudentService;
import Service.impl.StudentServiceImpl;

/**用于添加的servlet
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

			//1. 获取客户端提交上来的数据
			String sname = request.getParameter("sname"); 
			String gender = request.getParameter("gender");
			String phone = request.getParameter("phone");
			String birthday = request.getParameter("birthday");
			String info = request.getParameter("info");
			
			String [] h  = request.getParameterValues("hobby");
			String hobby = Arrays.toString(h);
			hobby = hobby.substring(1, hobby.length()-1);
			
			//2. 添加到数据库
			//string -> date
			Date date= new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
			
			Student student = new Student(sname, gender, phone, hobby, info, date);
			StudentService service = new StudentServiceImpl();
			service.insert(student);
			
			//3. 跳转到列表页
			//request.getRequestDispatcher("list.jsp").forward(request, response);  --页面不会有信息
			request.getRequestDispatcher("StudentListServlet").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
