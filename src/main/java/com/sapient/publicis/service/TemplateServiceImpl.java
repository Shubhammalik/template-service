package com.sapient.publicis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.publicis.model.Template;
import com.sapient.publicis.repository.IssueTemplateRepository;
import com.sapient.publicis.repository.TemplateRepository;

@Service
public class TemplateServiceImpl implements TemplateService {
    private final IssueTemplateRepository issueTemplateRepository;
    private final TemplateRepository templateRepository;

    @Autowired
    public TemplateServiceImpl(IssueTemplateRepository issueTemplateRepository, TemplateRepository templateRepository) {
        this.issueTemplateRepository = issueTemplateRepository;
        this.templateRepository = templateRepository;
    }

    @Override
    public Template getTemplate(String applicationName, String issueType) {
        String templateCode = issueTemplateRepository.getTemplateCode(applicationName, issueType);
        return templateRepository.findByTemplateCode(templateCode);
    }
}
