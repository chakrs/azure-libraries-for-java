/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RCM based Azure migration specific policy details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("RcmAzureMigration")
public class RcmAzureMigrationPolicyDetails extends PolicyProviderSpecificDetails {
    /**
     * The recovery point threshold in minutes.
     */
    @JsonProperty(value = "recoveryPointThresholdInMinutes")
    private Integer recoveryPointThresholdInMinutes;

    /**
     * The duration in minutes until which the recovery points need to be
     * stored.
     */
    @JsonProperty(value = "recoveryPointHistory")
    private Integer recoveryPointHistory;

    /**
     * The app consistent snapshot frequency in minutes.
     */
    @JsonProperty(value = "appConsistentFrequencyInMinutes")
    private Integer appConsistentFrequencyInMinutes;

    /**
     * A value indicating whether multi-VM sync has to be enabled. Possible
     * values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "multiVmSyncStatus")
    private MultiVmSyncStatus multiVmSyncStatus;

    /**
     * The crash consistent snapshot frequency in minutes.
     */
    @JsonProperty(value = "crashConsistentFrequencyInMinutes")
    private Integer crashConsistentFrequencyInMinutes;

    /**
     * Get the recoveryPointThresholdInMinutes value.
     *
     * @return the recoveryPointThresholdInMinutes value
     */
    public Integer recoveryPointThresholdInMinutes() {
        return this.recoveryPointThresholdInMinutes;
    }

    /**
     * Set the recoveryPointThresholdInMinutes value.
     *
     * @param recoveryPointThresholdInMinutes the recoveryPointThresholdInMinutes value to set
     * @return the RcmAzureMigrationPolicyDetails object itself.
     */
    public RcmAzureMigrationPolicyDetails withRecoveryPointThresholdInMinutes(Integer recoveryPointThresholdInMinutes) {
        this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
        return this;
    }

    /**
     * Get the recoveryPointHistory value.
     *
     * @return the recoveryPointHistory value
     */
    public Integer recoveryPointHistory() {
        return this.recoveryPointHistory;
    }

    /**
     * Set the recoveryPointHistory value.
     *
     * @param recoveryPointHistory the recoveryPointHistory value to set
     * @return the RcmAzureMigrationPolicyDetails object itself.
     */
    public RcmAzureMigrationPolicyDetails withRecoveryPointHistory(Integer recoveryPointHistory) {
        this.recoveryPointHistory = recoveryPointHistory;
        return this;
    }

    /**
     * Get the appConsistentFrequencyInMinutes value.
     *
     * @return the appConsistentFrequencyInMinutes value
     */
    public Integer appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes;
    }

    /**
     * Set the appConsistentFrequencyInMinutes value.
     *
     * @param appConsistentFrequencyInMinutes the appConsistentFrequencyInMinutes value to set
     * @return the RcmAzureMigrationPolicyDetails object itself.
     */
    public RcmAzureMigrationPolicyDetails withAppConsistentFrequencyInMinutes(Integer appConsistentFrequencyInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the multiVmSyncStatus value.
     *
     * @return the multiVmSyncStatus value
     */
    public MultiVmSyncStatus multiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * Set the multiVmSyncStatus value.
     *
     * @param multiVmSyncStatus the multiVmSyncStatus value to set
     * @return the RcmAzureMigrationPolicyDetails object itself.
     */
    public RcmAzureMigrationPolicyDetails withMultiVmSyncStatus(MultiVmSyncStatus multiVmSyncStatus) {
        this.multiVmSyncStatus = multiVmSyncStatus;
        return this;
    }

    /**
     * Get the crashConsistentFrequencyInMinutes value.
     *
     * @return the crashConsistentFrequencyInMinutes value
     */
    public Integer crashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes;
    }

    /**
     * Set the crashConsistentFrequencyInMinutes value.
     *
     * @param crashConsistentFrequencyInMinutes the crashConsistentFrequencyInMinutes value to set
     * @return the RcmAzureMigrationPolicyDetails object itself.
     */
    public RcmAzureMigrationPolicyDetails withCrashConsistentFrequencyInMinutes(Integer crashConsistentFrequencyInMinutes) {
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        return this;
    }

}