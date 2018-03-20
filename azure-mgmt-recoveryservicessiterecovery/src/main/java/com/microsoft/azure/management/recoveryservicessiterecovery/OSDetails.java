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
 * Disk Details.
 */
public class OSDetails {
    /**
     * VM Disk details.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /**
     * Product type.
     */
    @JsonProperty(value = "productType")
    private String productType;

    /**
     * The OSEdition.
     */
    @JsonProperty(value = "osEdition")
    private String osEdition;

    /**
     * The OS Version.
     */
    @JsonProperty(value = "oSVersion")
    private String oSVersion;

    /**
     * The OS Major Version.
     */
    @JsonProperty(value = "oSMajorVersion")
    private String oSMajorVersion;

    /**
     * The OS Minor Version.
     */
    @JsonProperty(value = "oSMinorVersion")
    private String oSMinorVersion;

    /**
     * Get the osType value.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the osType value.
     *
     * @param osType the osType value to set
     * @return the OSDetails object itself.
     */
    public OSDetails withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the productType value.
     *
     * @return the productType value
     */
    public String productType() {
        return this.productType;
    }

    /**
     * Set the productType value.
     *
     * @param productType the productType value to set
     * @return the OSDetails object itself.
     */
    public OSDetails withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * Get the osEdition value.
     *
     * @return the osEdition value
     */
    public String osEdition() {
        return this.osEdition;
    }

    /**
     * Set the osEdition value.
     *
     * @param osEdition the osEdition value to set
     * @return the OSDetails object itself.
     */
    public OSDetails withOsEdition(String osEdition) {
        this.osEdition = osEdition;
        return this;
    }

    /**
     * Get the oSVersion value.
     *
     * @return the oSVersion value
     */
    public String oSVersion() {
        return this.oSVersion;
    }

    /**
     * Set the oSVersion value.
     *
     * @param oSVersion the oSVersion value to set
     * @return the OSDetails object itself.
     */
    public OSDetails withOSVersion(String oSVersion) {
        this.oSVersion = oSVersion;
        return this;
    }

    /**
     * Get the oSMajorVersion value.
     *
     * @return the oSMajorVersion value
     */
    public String oSMajorVersion() {
        return this.oSMajorVersion;
    }

    /**
     * Set the oSMajorVersion value.
     *
     * @param oSMajorVersion the oSMajorVersion value to set
     * @return the OSDetails object itself.
     */
    public OSDetails withOSMajorVersion(String oSMajorVersion) {
        this.oSMajorVersion = oSMajorVersion;
        return this;
    }

    /**
     * Get the oSMinorVersion value.
     *
     * @return the oSMinorVersion value
     */
    public String oSMinorVersion() {
        return this.oSMinorVersion;
    }

    /**
     * Set the oSMinorVersion value.
     *
     * @param oSMinorVersion the oSMinorVersion value to set
     * @return the OSDetails object itself.
     */
    public OSDetails withOSMinorVersion(String oSMinorVersion) {
        this.oSMinorVersion = oSMinorVersion;
        return this;
    }

}