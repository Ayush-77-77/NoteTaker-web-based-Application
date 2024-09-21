package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

import com.entities.Note;
import com.google.protobuf.Empty;

/**
 * Servlet implementation class SaveNoteServlet
 */
public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SaveNoteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		String title=	request.getParameter("title");
		String content = request.getParameter("content");
		
		
		Note note = new Note(title,content, new Date());
		System.out.println(note.getId() +" : "+note.getTitle());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
