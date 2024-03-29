package com.sg.booktracker;

import com.sg.booktracker.controller.BookController;
import com.sg.booktracker.dao.BookDao;
import com.sg.booktracker.dao.BookDaoMemoryImpl;
import com.sg.booktracker.service.BookService;
import com.sg.booktracker.ui.BookView;
import com.sg.booktracker.ui.UserIO;
import com.sg.booktracker.ui.UserIOConsoleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


/**
 *
 * @author Kyle David Rudy
 */

@Component
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.sg.booktracker");
        appContext.refresh();

        BookController controller = appContext.getBean("bookController", BookController.class);
        controller.run();
    }
}
