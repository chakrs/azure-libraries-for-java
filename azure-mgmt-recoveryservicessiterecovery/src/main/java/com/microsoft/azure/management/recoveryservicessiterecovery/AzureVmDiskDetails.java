/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Disk details for E2A provider.
 */
public class AzureVmDiskDetails {
    /**
     * VHD type.
     */
    @JsonProperty(value = "vhdType")
    private String vhdType;

    /**
     * The VHD id.
     */
    @JsonProperty(value = "vhdId")
    private String vhdId;

    /**
     * VHD name.
     */
    @JsonProperty(value = "vhdName")
    private String vhdName;

    /**
     * Max side in MB.
     */
    @JsonProperty(value = "maxSizeMB")
    private String maxSizeMB;

    /**
     * Blob uri of the Azure disk.
     */
    @JsonProperty(value = "targetDiskLocation")
    private String targetDiskLocation;

    /**
     * The target Azure disk name.
     */
    @JsonProperty(value = "targetDiskName")
    private String targetDiskName;

    /**
     * Ordinal\LunId of the disk for the Azure VM.
     */
    @JsonProperty(value = "lunId")
    private String lunId;

    /**
     * Get the vhdType value.
     *
     * @return the vhdType value
     */
    public String vhdType() {
        return this.vhdType;
    }

    /**
     * Set the vhdType value.
     *
     * @param vhdType the vhdType value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withVhdType(String vhdType) {
        this.vhdType = vhdType;
        return this;
    }

    /**
     * Get the vhdId value.
     *
     * @return the vhdId value
     */
    public String vhdId() {
        return this.vhdId;
    }

    /**
     * Set the vhdId value.
     *
     * @param vhdId the vhdId value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withVhdId(String vhdId) {
        this.vhdId = vhdId;
        return this;
    }

    /**
     * Get the vhdName value.
     *
     * @return the vhdName value
     */
    public String vhdName() {
        return this.vhdName;
    }

    /**
     * Set the vhdName value.
     *
     * @param vhdName the vhdName value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withVhdName(String vhdName) {
        this.vhdName = vhdName;
        return this;
    }

    /**
     * Get the maxSizeMB value.
     *
     * @return the maxSizeMB value
     */
    public String maxSizeMB() {
        return this.maxSizeMB;
    }

    /**
     * Set the maxSizeMB value.
     *
     * @param maxSizeMB the maxSizeMB value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withMaxSizeMB(String maxSizeMB) {
        this.maxSizeMB = maxSizeMB;
        return this;
    }

    /**
     * Get the targetDiskLocation value.
     *
     * @return the targetDiskLocation value
     */
    public String targetDiskLocation() {
        return this.targetDiskLocation;
    }

    /**
     * Set the targetDiskLocation value.
     *
     * @param targetDiskLocation the targetDiskLocation value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withTargetDiskLocation(String targetDiskLocation) {
        this.targetDiskLocation = targetDiskLocation;
        return this;
    }

    /**
     * Get the targetDiskName value.
     *
     * @return the targetDiskName value
     */
    public String targetDiskName() {
        return this.targetDiskName;
    }

    /**
     * Set the targetDiskName value.
     *
     * @param targetDiskName the targetDiskName value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withTargetDiskName(String targetDiskName) {
        this.targetDiskName = targetDiskName;
        return this;
    }

    /**
     * Get the lunId value.
     *
     * @return the lunId value
     */
    public String lunId() {
        return this.lunId;
    }

    /**
     * Set the lunId value.
     *
     * @param lunId the lunId value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withLunId(String lunId) {
        this.lunId = lunId;
        return this;
    }

}