package com.sapient.publicis.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Template implements Serializable {
    private final String templateCode;
    private final String templateName;
    private final List<TemplateField> fields;

    public Template(String templateCode, String templateName, List<TemplateField> fields) {
        this.templateCode = templateCode;
        this.templateName = templateName;
        this.fields = fields;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public String getTemplateName() {
        return templateName;
    }

    public List<TemplateField> getFields() {
        return fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Template template = (Template) o;
        return Objects.equals(templateCode, template.templateCode) &&
                Objects.equals(templateName, template.templateName) &&
                Objects.equals(fields, template.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateCode, templateName, fields);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Template{");
        sb.append("templateCode='").append(templateCode).append('\'');
        sb.append(", templateName='").append(templateName).append('\'');
        sb.append(", fields=").append(fields);
        sb.append('}');
        return sb.toString();
    }
}
