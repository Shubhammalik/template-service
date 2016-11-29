package com.sapient.publicis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.publicis.model.Template;
import com.sapient.publicis.service.TemplateService;

@RestController
public class TemplateController {
    private final TemplateService templateService;

    @Autowired
    public TemplateController(TemplateService templateService) {
        this.templateService = templateService;
    }

    @RequestMapping(value = "/getTemplate", method = RequestMethod.GET)
    public @ResponseBody
    Template getTemplate(@RequestParam String applicationName, @RequestParam String issueType) {
        return templateService.getTemplate(applicationName, issueType);
    }
}
