package com.example.ap1_dsw;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "RandomGameServlet", value = "/random-game-servlet")
public class RandomGameServlet extends HttpServlet {

    Random random = new Random();

    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        Integer numeroEnviado = Integer.valueOf(request.getParameter("numero"));
        Integer numeroAleatorio = random.nextInt(5) + 1;

        PrintWriter out = response.getWriter();
        out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bulma@0.9.4/css/bulma.min.css\">");
        out.println("<div class='hero is-fullheight is-flex is-flex-direction-column is-align-items-center is-justify-content-center'>");
        out.println("<div class='is-flex is-flex-direction-column is-align-items-center has-background-primary-dark p-5'>");
        out.println("<h1 class='title has-link-dark'>Resultado</h1>");
        if (numeroEnviado.equals(numeroAleatorio)) {
            out.println("<p class='title is-2 has-text-white'>Parabenss, voce acertoou!");
        } else {
            out.println("<p class='subtitle is-4 has-text-white'>Que azar! Voce errou!");
        }
        out.println("<p class='subtitle is-4 has-text-white'>Voce tentou o numero: " + numeroEnviado + "</p>");
        out.println("<p class='subtitle is-4 has-text-white'>O numero sorteado era: " + numeroAleatorio + "</p>");
        out.println("<div class='is-flex'>");
        out.println("<a href='index.html' class='button mr-1'>Voltar a tela inicial </a>");
        out.println("<a href='randomGame.html' class='button'>Tentar novamente </a>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");

    }

    @Override
    public void destroy() {

    }
}
