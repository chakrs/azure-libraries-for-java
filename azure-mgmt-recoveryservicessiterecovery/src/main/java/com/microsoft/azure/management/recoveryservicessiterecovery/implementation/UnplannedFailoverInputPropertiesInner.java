/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.implementation;

import com.microsoft.azure.management.recoveryservicessiterecovery.ProviderSpecificFailoverInput;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input definition for planned failover input properties.
 */
public class UnplannedFailoverInputPropertiesInner {
    /**
     * Failover direction.
     */
    @JsonProperty(value = "failoverDirection")
    private String failoverDirection;

    /**
     * Source site operations status.
     */
    @JsonProperty(value = "sourceSiteOperations")
    private String sourceSiteOperations;

    /**
     * Provider specific settings.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private ProviderSpecificFailoverInput providerSpecificDetails;

    /**
     * Get the failoverDirection value.
     *
     * @return the failoverDirection value
     */
    public String failoverDirection() {
        return this.failoverDirection;
    }

    /**
     * Set the failoverDirection value.
     *
     * @param failoverDirection the failoverDirection value to set
     * @return the UnplannedFailoverInputPropertiesInner object itself.
     */
    public UnplannedFailoverInputPropertiesInner withFailoverDirection(String failoverDirection) {
        this.failoverDirection = failoverDirection;
        return this;
    }

    /**
     * Get the sourceSiteOperations value.
     *
     * @return the sourceSiteOperations value
     */
    public String sourceSiteOperations() {
        return this.sourceSiteOperations;
    }

    /**
     * Set the sourceSiteOperations value.
     *
     * @param sourceSiteOperations the sourceSiteOperations value to set
     * @return the UnplannedFailoverInputPropertiesInner object itself.
     */
    public UnplannedFailoverInputPropertiesInner withSourceSiteOperations(String sourceSiteOperations) {
        this.sourceSiteOperations = sourceSiteOperations;
        return this;
    }

    /**
     * Get the providerSpecificDetails value.
     *
     * @return the providerSpecificDetails value
     */
    public ProviderSpecificFailoverInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails value.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set
     * @return the UnplannedFailoverInputPropertiesInner object itself.
     */
    public UnplannedFailoverInputPropertiesInner withProviderSpecificDetails(ProviderSpecificFailoverInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

}