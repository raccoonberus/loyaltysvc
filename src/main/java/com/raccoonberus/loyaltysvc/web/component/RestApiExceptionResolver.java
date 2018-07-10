package com.raccoonberus.loyaltysvc.web.component;

import com.raccoonberus.loyaltysvc.web.exception.ApiException;
import com.raccoonberus.loyaltysvc.web.model.ErrorMessage;
import com.raccoonberus.loyaltysvc.web.model.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class RestApiExceptionResolver extends AbstractHandlerExceptionResolver {

    @Override
    protected ModelAndView doResolveException(
            HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse,
            Object o,
            Exception e
    ) {
        if (e instanceof ApiException) {
            ExceptionResponse response = new ExceptionResponse();
            response.getMessages().add(new ErrorMessage(e.getMessage()));

            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setStatus(HttpStatus.BAD_REQUEST);
            modelAndView.setView(new MappingJackson2JsonView());
            modelAndView.addObject("error", response);
            return modelAndView;
        }
        return null;
    }
}
