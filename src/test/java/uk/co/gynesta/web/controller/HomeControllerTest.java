package uk.co.gynesta.web.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class HomeControllerTest {


    @InjectMocks
    private HomeController homeController;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }

    @Test
    public void showHomePage() {
        System.out.println("In Unit Test Jim");
        ModelAndView modelAndView = homeController.showHomePage();
        assertEquals("home", modelAndView.getViewName());
    }
}
