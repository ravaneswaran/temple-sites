package com.techsocialist.templesites.configuration;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;

@Controller
public class ErrorConfiguration implements ErrorController {
    @Override
    public String getErrorPath() {
        return null;
    }
}
