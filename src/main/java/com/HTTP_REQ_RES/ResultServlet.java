 /*
 * Question 10(b):
 * Build an application to get Rollno, Student Name, Sub1–Sub5 through JSP (index.jsp)
 * with client-side validation and submit to ResultServlet. Perform server-side validation,
 * calculate average and result (Pass if all subjects > 40), and display in result.jsp.
 */
package com.HTTP_REQ_RES;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/processResult")
public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rollno = request.getParameter("rollno");
        String name = request.getParameter("name");

        int s1 = Integer.parseInt(request.getParameter("sub1"));
        int s2 = Integer.parseInt(request.getParameter("sub2"));
        int s3 = Integer.parseInt(request.getParameter("sub3"));
        int s4 = Integer.parseInt(request.getParameter("sub4"));
        int s5 = Integer.parseInt(request.getParameter("sub5"));

        String result;
        double avg = (s1 + s2 + s3 + s4 + s5) / 5.0;

        if (s1 > 40 && s2 > 40 && s3 > 40 && s4 > 40 && s5 > 40) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        request.setAttribute("rollno", rollno);
        request.setAttribute("name", name);
        request.setAttribute("avg", avg);
        request.setAttribute("result", result);

        request.setAttribute("sub1", s1);
        request.setAttribute("sub2", s2);
        request.setAttribute("sub3", s3);
        request.setAttribute("sub4", s4);
        request.setAttribute("sub5", s5);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}