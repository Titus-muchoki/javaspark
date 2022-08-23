package mySpark;


import java.util.HashMap;
import java.util.Map;


import spark.ModelAndView;

import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;


public class Main {

    public static void main(String[] args) {


        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hello.hbs");



        }, new HandlebarsTemplateEngine());

        get("/favorite_photos", (request, response) -> {
            Map<String, Object>  model = new HashMap<>();
            return new ModelAndView(model, "images.hbs");


        }, new HandlebarsTemplateEngine());
    }
}



