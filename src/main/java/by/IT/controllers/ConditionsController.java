package by.IT.controllers;

import by.IT.model.entity.dibi.User;
import by.IT.model.entity.dibi.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "conditionsController", urlPatterns = "/criteria")
public class ConditionsController extends HttpServlet {
    private UserService service;


    @Override
    public void init() throws ServletException {
        service = new UserService();
        super.init();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> params = req.getParameterMap();
        List<User> users = service.getUsersByCriteria(params);
        super.doPost(req, resp);

        if (!users.isEmpty()) {
            req.setAttribute("users", users);

        } else {
            req.setAttribute("message", "Users is not found");
        }
        RequestDispatcher rd = req.getRequestDispatcher("/jsp/users.jsp");
        rd.forward(req, resp);
    }
}

