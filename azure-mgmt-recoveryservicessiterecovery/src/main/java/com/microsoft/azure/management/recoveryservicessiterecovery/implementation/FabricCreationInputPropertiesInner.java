/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.implementation;

import com.microsoft.azure.management.recoveryservicessiterecovery.FabricSpecificCreationInput;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of site details provided during the time of site creation.
 */
public class FabricCreationInputPropertiesInner {
    /**
     * Fabric provider specific creation input.
     */
    @JsonProperty(value = "customDetails")
    private FabricSpecificCreationInput customDetails;

    /**
     * Get the customDetails value.
     *
     * @return the customDetails value
     */
    public FabricSpecificCreationInput customDetails() {
        return this.customDetails;
    }

    /**
     * Set the customDetails value.
     *
     * @param customDetails the customDetails value to set
     * @return the FabricCreationInputPropertiesInner object itself.
     */
    public FabricCreationInputPropertiesInner withCustomDetails(FabricSpecificCreationInput customDetails) {
        this.customDetails = customDetails;
        return this;
    }

}