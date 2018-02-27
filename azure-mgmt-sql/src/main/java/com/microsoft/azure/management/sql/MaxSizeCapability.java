/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The maximum size capability.
 */
public class MaxSizeCapability {
    /**
     * The maximum size limit (see 'unit' for the units).
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer limit;

    /**
     * The units that the limit is expressed in. Possible values include:
     * 'Megabytes', 'Gigabytes', 'Terabytes', 'Petabytes'.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeUnits unit;

    /**
     * The status of the capability. Possible values include: 'Visible',
     * 'Available', 'Default', 'Disabled'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /**
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the limit value.
     *
     * @return the limit value
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public MaxSizeUnits unit() {
        return this.unit;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason value.
     *
     * @param reason the reason value to set
     * @return the MaxSizeCapability object itself.
     */
    public MaxSizeCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

}