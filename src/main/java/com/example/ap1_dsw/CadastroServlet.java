package com.example.ap1_dsw;

import com.example.ap1_dsw.Model.BancoDeDados;
import com.example.ap1_dsw.Model.Hobbie;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadastroServlet", value = "/cadastro-servlet")
public class CadastroServlet extends HttpServlet {
    BancoDeDados bancoDeDados = new BancoDeDados();
    @Override
    public void init() {
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String nome = request.getParameter("nome");
        String horario = request.getParameter("horario");

        Hobbie hobbie = new Hobbie(nome, horario);

        bancoDeDados.addListaDeHobbies(hobbie);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bulma@0.9.4/css/bulma.min.css\">");
        out.println("<div class='hero is-flex is-flex-direction-column is-align-items-center is-justify-content-center'><h1 class='title has-text-link-dark'>Hobbies Cadastrados</h1>");
        out.println("<a href='cadastro.html' class='button is-primary'>Voltar</a>");
        out.print("<table class='table is-striped is-hoverable is-fullwidth'>");
        out.print("<tr>");
        out.print("<th>Hobbie</th>");
        out.print("<th>Data</th>");
        out.print("</tr>");

        for (Hobbie hn : bancoDeDados.getListaDeHobbies()) {
            out.print("<tr>");
            out.print("<td>" + hn.getHobbie() + "</td>");
            out.print("<td>" + hn.getHorario() + "</td>");
            out.print("</tr>");
        }
        out.print("</table>");
        out.print("</div>");
    }

    @Override
    public void destroy() {
    }
}
