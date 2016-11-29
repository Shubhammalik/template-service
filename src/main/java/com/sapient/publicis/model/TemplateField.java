package com.sapient.publicis.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class TemplateField implements Serializable {
    private final String fieldCode;
    private final String fieldName;
    private final TemplateFieldType fieldType;
    private final List<String> availableValues;
    private final boolean isMandatoryField;
    private final String additionalNotes;
    private final Integer orderNumber;


    public TemplateField(String fieldCode, String fieldName, TemplateFieldType fieldType, List<String> availableValues, boolean isMandatoryField, String additionalNotes, Integer orderNumber) {
        this.fieldCode = fieldCode;
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.availableValues = availableValues;
        this.isMandatoryField = isMandatoryField;
        this.additionalNotes = additionalNotes;
        this.orderNumber = orderNumber;
    }

    public String getFieldCode() {
        return fieldCode;
    }

    public String getFieldName() {
        return fieldName;
    }

    public TemplateFieldType getFieldType() {
        return fieldType;
    }

    public List<String> getAvailableValues() {
        return availableValues;
    }

    public boolean isMandatoryField() {
        return isMandatoryField;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemplateField that = (TemplateField) o;
        return isMandatoryField == that.isMandatoryField &&
                Objects.equals(fieldCode, that.fieldCode) &&
                Objects.equals(fieldName, that.fieldName) &&
                fieldType == that.fieldType &&
                Objects.equals(availableValues, that.availableValues) &&
                Objects.equals(additionalNotes, that.additionalNotes) &&
                Objects.equals(orderNumber, that.orderNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldCode, fieldName, fieldType, availableValues, isMandatoryField, additionalNotes, orderNumber);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TemplateField{");
        sb.append("fieldCode='").append(fieldCode).append('\'');
        sb.append(", fieldName='").append(fieldName).append('\'');
        sb.append(", fieldType=").append(fieldType);
        sb.append(", availableValues=").append(availableValues);
        sb.append(", isMandatoryField=").append(isMandatoryField);
        sb.append(", additionalNotes='").append(additionalNotes).append('\'');
        sb.append(", orderNumber=").append(orderNumber);
        sb.append('}');
        return sb.toString();
    }
}
