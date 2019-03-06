package Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Domain.Student;
import Service.StudentService;
import Service.impl.StudentServiceImpl;

/**
 * 查询所有的学生信息。 然后呈现到list.jsp页面上。
 * Servlet implementation class EditServlet
 * 
 * @author garry970107
 */
@WebServlet("/StudentListServlet")
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			//1. 查询出来所有的学生
			StudentService service = new StudentServiceImpl();
			List<Student> list = service.findAll();
			
			//2. 先把数据存储到作用域中
			request.setAttribute("list", list);
			//3.跳转页面
			request.getRequestDispatcher("list.jsp").forward(request, response);
			
		} catch (SQLException e) {
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
