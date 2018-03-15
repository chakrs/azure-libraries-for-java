/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.implementation.LinkedServiceInner;

/**
 * Dynamics linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Dynamics")
@JsonFlatten
public class DynamicsLinkedService extends LinkedServiceInner {
    /**
     * The deployment type of the Dynamics instance. 'Online' for Dynamics
     * Online and 'OnPremisesWithIfd' for Dynamics on-premises with Ifd. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.deploymentType", required = true)
    private Object deploymentType;

    /**
     * The host name of the on-premises Dynamics server. The property is
     * required for on-prem and not allowed for online. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.hostName")
    private Object hostName;

    /**
     * The port of on-premises Dynamics server. The property is required for
     * on-prem and not allowed for online. Default is 443. Type: integer (or
     * Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /**
     * The URL to the Microsoft Dynamics server. The property is required for
     * on-line and not allowed for on-prem. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.serviceUri")
    private Object serviceUri;

    /**
     * The organization name of the Dynamics instance. The property is required
     * for on-prem and required for online when there are more than one
     * Dynamics instances associated with the user. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.organizationName")
    private Object organizationName;

    /**
     * The authentication type to connect to Dynamics server. 'Office365' for
     * online scenario, 'Ifd' for on-premises with Ifd scenario. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private Object authenticationType;

    /**
     * User name to access the Dynamics instance. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.username", required = true)
    private Object username;

    /**
     * Password to access the Dynamics instance.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the deploymentType value.
     *
     * @return the deploymentType value
     */
    public Object deploymentType() {
        return this.deploymentType;
    }

    /**
     * Set the deploymentType value.
     *
     * @param deploymentType the deploymentType value to set
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withDeploymentType(Object deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * Get the hostName value.
     *
     * @return the hostName value
     */
    public Object hostName() {
        return this.hostName;
    }

    /**
     * Set the hostName value.
     *
     * @param hostName the hostName value to set
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withHostName(Object hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port value.
     *
     * @param port the port value to set
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the serviceUri value.
     *
     * @return the serviceUri value
     */
    public Object serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri value.
     *
     * @param serviceUri the serviceUri value to set
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withServiceUri(Object serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the organizationName value.
     *
     * @return the organizationName value
     */
    public Object organizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName value.
     *
     * @param organizationName the organizationName value to set
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withOrganizationName(Object organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the authenticationType value.
     *
     * @return the authenticationType value
     */
    public Object authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType value.
     *
     * @param authenticationType the authenticationType value to set
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username value.
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username value.
     *
     * @param username the username value to set
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential value.
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential value.
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
