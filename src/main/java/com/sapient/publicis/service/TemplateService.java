package com.sapient.publicis.service;

import com.sapient.publicis.model.Template;

public interface TemplateService {
    Template getTemplate(String applicationName, String issueType);
}
