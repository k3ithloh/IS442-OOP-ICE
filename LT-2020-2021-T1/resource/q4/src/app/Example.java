package app;

import java.util.*;

import entity.Product;

import java.io.*;

import lib.thymeleaf.*;
import lib.thymeleaf.context.*;
import lib.thymeleaf.templateresolver.*;

public class Example {
    public static void main(String[] args) {
        FileTemplateResolver resolver = new FileTemplateResolver();
        resolver.setPrefix("templates/");
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(resolver);

        Context ctx = new Context();
        ctx.setVariable("prods", List.of(new Product("apple", 3.1, true), new Product("orange", 2.1, false),
                new Product("pear", 4.1, false)));
        System.out.println(templateEngine.process("template.html", ctx));
        // System.out.println(out);
    }
}