import java.sql.*;
importjava.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class insert {

    static final String USER = "root";
    static final String PASS = "root";
    static final String URL = "jdbc:mysql://localhost/demo";
            
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
try (PrintWriter out = response.getWriter())
{
out.println("<body>");
out.println("<p> You have succefullyregstered!</p>");
out.println("<p> Login using your User id and password</p>");
RequestDispatcher rd=request.getRequestDispatcher("index.html");
rd.include(request, response);
out.println("</body>");
}
 }
 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

  String uname=request.getParameter("name");
  String state=request.getParameter("state");
  String salary=request.getParameter("salary");
  String grade=request.getParameter("grade");
  String room=request.getParameter("room");
  String telnum=request.getParameter("telnum");
  String picture=request.getParameter("picture");
  String leywords=request.getParameter("keywords");
}


    query =  "insert into people(Name, State, Salary, Grade, Room, Telnum, Picture, Keywords )VALUES ('?', '?', '?', '?', '?', '?',' ?' ,'?')"; 
    st.executeUpdate(query);
    }    
}
    
