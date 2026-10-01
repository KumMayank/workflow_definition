package com.workflow_def.service.dto;

import lombok.Data;

@Data
public class WorkflowDTO {

    private String tenantId;
    private String workflowCode;
    private String workflowDescription;
    private String workflowTypeCode;
    private String entityName;
    private int uniqueField;
    private String bpmnXML;

}