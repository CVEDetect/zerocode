package org.jsmart.smarttester.core.runner;

import org.jsmart.smarttester.core.engine.assertion.AssertionReport;

import java.util.List;

public interface FlowStepStatusNotifier {
    Boolean notifyFlowStepAssertionFailed(String scenarioName,
                                          String stepName,
                                          List<AssertionReport> failureReportList);
    Boolean notifyFlowStepExecutionException(String scenarioName, String stepName, Exception ex);
    Boolean notifyFlowStepExecutionPassed(String scenarioName, String stepName);
}
