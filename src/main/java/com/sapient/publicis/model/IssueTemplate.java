package com.sapient.publicis.model;

import java.io.Serializable;
import java.util.Objects;

public class IssueTemplate implements Serializable {
    private final String applicationName;
    private final String issueType;

    public IssueTemplate(String applicationName, String issueType) {
        this.applicationName = applicationName;
        this.issueType = issueType;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getIssueType() {
        return issueType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IssueTemplate that = (IssueTemplate) o;
        return Objects.equals(applicationName, that.applicationName) &&
                Objects.equals(issueType, that.issueType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationName, issueType);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IssueTemplate{");
        sb.append("applicationName='").append(applicationName).append('\'');
        sb.append(", issueType='").append(issueType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
