package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import tool.Page;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/servlet/contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		Page.header(out);
		try {

			String name = request.getParameter("name");
			String com = request.getParameter("com");
			String mail = request.getParameter("mail");
			String content = request.getParameter("content");

			String[] magazine = request.getParameterValues("magazine");

			String data = request.getParameter("data");

			Product product = new Product();
			product.setName(name);
			product.setCom(com);
			product.setMail(mail);
			product.setContent(content);
			product.setMagazine(magazine);
			product.setData(data);

			request.setAttribute("product", product);

			if (data.equals("yes")) {
				request.getRequestDispatcher("../jsp/yes.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("../jsp/no.jsp").forward(request, response);
				
			}
		} catch (Exception e) {
			out.println("再度入力してください。");
		}
		Page.footer(out);
	}
}
