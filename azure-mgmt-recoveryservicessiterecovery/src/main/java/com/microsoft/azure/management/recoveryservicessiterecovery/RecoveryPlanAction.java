/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Recovery plan action details.
 */
public class RecoveryPlanAction {
    /**
     * The action name.
     */
    @JsonProperty(value = "actionName", required = true)
    private String actionName;

    /**
     * The list of failover types.
     */
    @JsonProperty(value = "failoverTypes", required = true)
    private List<ReplicationProtectedItemOperation> failoverTypes;

    /**
     * The list of failover directions.
     */
    @JsonProperty(value = "failoverDirections", required = true)
    private List<PossibleOperationsDirections> failoverDirections;

    /**
     * The custom details.
     */
    @JsonProperty(value = "customDetails", required = true)
    private RecoveryPlanActionDetails customDetails;

    /**
     * Get the actionName value.
     *
     * @return the actionName value
     */
    public String actionName() {
        return this.actionName;
    }

    /**
     * Set the actionName value.
     *
     * @param actionName the actionName value to set
     * @return the RecoveryPlanAction object itself.
     */
    public RecoveryPlanAction withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * Get the failoverTypes value.
     *
     * @return the failoverTypes value
     */
    public List<ReplicationProtectedItemOperation> failoverTypes() {
        return this.failoverTypes;
    }

    /**
     * Set the failoverTypes value.
     *
     * @param failoverTypes the failoverTypes value to set
     * @return the RecoveryPlanAction object itself.
     */
    public RecoveryPlanAction withFailoverTypes(List<ReplicationProtectedItemOperation> failoverTypes) {
        this.failoverTypes = failoverTypes;
        return this;
    }

    /**
     * Get the failoverDirections value.
     *
     * @return the failoverDirections value
     */
    public List<PossibleOperationsDirections> failoverDirections() {
        return this.failoverDirections;
    }

    /**
     * Set the failoverDirections value.
     *
     * @param failoverDirections the failoverDirections value to set
     * @return the RecoveryPlanAction object itself.
     */
    public RecoveryPlanAction withFailoverDirections(List<PossibleOperationsDirections> failoverDirections) {
        this.failoverDirections = failoverDirections;
        return this;
    }

    /**
     * Get the customDetails value.
     *
     * @return the customDetails value
     */
    public RecoveryPlanActionDetails customDetails() {
        return this.customDetails;
    }

    /**
     * Set the customDetails value.
     *
     * @param customDetails the customDetails value to set
     * @return the RecoveryPlanAction object itself.
     */
    public RecoveryPlanAction withCustomDetails(RecoveryPlanActionDetails customDetails) {
        this.customDetails = customDetails;
        return this;
    }

}