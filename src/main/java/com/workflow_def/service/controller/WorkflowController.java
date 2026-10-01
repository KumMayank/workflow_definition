package com.workflow_def.service.controller;

import com.workflow_def.service.dto.AppResponseDTO;
import com.workflow_def.service.dto.WorkflowDTO;
import com.workflow_def.service.service.WorkflowService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class WorkflowController {

    private final WorkflowService workflowService;



    /*
    @PostMapping(value = "/activate/{wfCode}/{wfId}")
    public AppResponseDTO activate(@RequestHeader("X-Tenant-Id") String tenantId,
                                   @PathVariable("wfCode") String wfCode,
                                   @PathVariable("wfId") String wfId) {
        return workflowService.processActivate(tenantId, wfCode, wfId);
    }

     */

    @PostMapping(value = "/activate/{wfCode}/{wfId}")
    public @ResponseBody AppResponseDTO activate(@PathVariable("wfCode") String wfCode, @PathVariable("wfId") String wfId) {
        return workflowService.processActivate(wfCode, wfId, wfId);
    }

    @PostMapping(value = "/update")
    public @ResponseBody AppResponseDTO update(@RequestBody WorkflowDTO wfDTO) {
        return workflowService.processUpdateData(wfDTO);
    }

}