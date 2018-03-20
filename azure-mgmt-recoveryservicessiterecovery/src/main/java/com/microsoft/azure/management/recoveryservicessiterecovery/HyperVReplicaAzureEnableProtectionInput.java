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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure specific enable protection input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaAzure")
public class HyperVReplicaAzureEnableProtectionInput extends EnableProtectionProviderSpecificInput {
    /**
     * The Hyper-V host Vm Id.
     */
    @JsonProperty(value = "hvHostVmId")
    private String hvHostVmId;

    /**
     * The Vm Name.
     */
    @JsonProperty(value = "vmName")
    private String vmName;

    /**
     * The OS type associated with vm.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /**
     * The OS disk VHD id associated with vm.
     */
    @JsonProperty(value = "vhdId")
    private String vhdId;

    /**
     * The storage account name.
     */
    @JsonProperty(value = "targetStorageAccountId")
    private String targetStorageAccountId;

    /**
     * The selected target Azure network Id.
     */
    @JsonProperty(value = "targetAzureNetworkId")
    private String targetAzureNetworkId;

    /**
     * The selected target Azure subnet Id.
     */
    @JsonProperty(value = "targetAzureSubnetId")
    private String targetAzureSubnetId;

    /**
     * The selected option to enable RDP\SSH on target vm after failover.
     * String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     */
    @JsonProperty(value = "enableRdpOnTargetOption")
    private String enableRdpOnTargetOption;

    /**
     * The target azure Vm Name.
     */
    @JsonProperty(value = "targetAzureVmName")
    private String targetAzureVmName;

    /**
     * The storage account to be used for logging during replication.
     */
    @JsonProperty(value = "logStorageAccountId")
    private String logStorageAccountId;

    /**
     * The list of VHD IDs of disks to be protected.
     */
    @JsonProperty(value = "disksToInclude")
    private List<String> disksToInclude;

    /**
     * The Id of the target resource group (for classic deployment) in which
     * the failover VM is to be created.
     */
    @JsonProperty(value = "targetAzureV1ResourceGroupId")
    private String targetAzureV1ResourceGroupId;

    /**
     * The Id of the target resource group (for resource manager deployment) in
     * which the failover VM is to be created.
     */
    @JsonProperty(value = "targetAzureV2ResourceGroupId")
    private String targetAzureV2ResourceGroupId;

    /**
     * A value indicating whether managed disks should be used during failover.
     */
    @JsonProperty(value = "useManagedDisks")
    private String useManagedDisks;

    /**
     * Get the hvHostVmId value.
     *
     * @return the hvHostVmId value
     */
    public String hvHostVmId() {
        return this.hvHostVmId;
    }

    /**
     * Set the hvHostVmId value.
     *
     * @param hvHostVmId the hvHostVmId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withHvHostVmId(String hvHostVmId) {
        this.hvHostVmId = hvHostVmId;
        return this;
    }

    /**
     * Get the vmName value.
     *
     * @return the vmName value
     */
    public String vmName() {
        return this.vmName;
    }

    /**
     * Set the vmName value.
     *
     * @param vmName the vmName value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withVmName(String vmName) {
        this.vmName = vmName;
        return this;
    }

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
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withOsType(String osType) {
        this.osType = osType;
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
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withVhdId(String vhdId) {
        this.vhdId = vhdId;
        return this;
    }

    /**
     * Get the targetStorageAccountId value.
     *
     * @return the targetStorageAccountId value
     */
    public String targetStorageAccountId() {
        return this.targetStorageAccountId;
    }

    /**
     * Set the targetStorageAccountId value.
     *
     * @param targetStorageAccountId the targetStorageAccountId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withTargetStorageAccountId(String targetStorageAccountId) {
        this.targetStorageAccountId = targetStorageAccountId;
        return this;
    }

    /**
     * Get the targetAzureNetworkId value.
     *
     * @return the targetAzureNetworkId value
     */
    public String targetAzureNetworkId() {
        return this.targetAzureNetworkId;
    }

    /**
     * Set the targetAzureNetworkId value.
     *
     * @param targetAzureNetworkId the targetAzureNetworkId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withTargetAzureNetworkId(String targetAzureNetworkId) {
        this.targetAzureNetworkId = targetAzureNetworkId;
        return this;
    }

    /**
     * Get the targetAzureSubnetId value.
     *
     * @return the targetAzureSubnetId value
     */
    public String targetAzureSubnetId() {
        return this.targetAzureSubnetId;
    }

    /**
     * Set the targetAzureSubnetId value.
     *
     * @param targetAzureSubnetId the targetAzureSubnetId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withTargetAzureSubnetId(String targetAzureSubnetId) {
        this.targetAzureSubnetId = targetAzureSubnetId;
        return this;
    }

    /**
     * Get the enableRdpOnTargetOption value.
     *
     * @return the enableRdpOnTargetOption value
     */
    public String enableRdpOnTargetOption() {
        return this.enableRdpOnTargetOption;
    }

    /**
     * Set the enableRdpOnTargetOption value.
     *
     * @param enableRdpOnTargetOption the enableRdpOnTargetOption value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withEnableRdpOnTargetOption(String enableRdpOnTargetOption) {
        this.enableRdpOnTargetOption = enableRdpOnTargetOption;
        return this;
    }

    /**
     * Get the targetAzureVmName value.
     *
     * @return the targetAzureVmName value
     */
    public String targetAzureVmName() {
        return this.targetAzureVmName;
    }

    /**
     * Set the targetAzureVmName value.
     *
     * @param targetAzureVmName the targetAzureVmName value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withTargetAzureVmName(String targetAzureVmName) {
        this.targetAzureVmName = targetAzureVmName;
        return this;
    }

    /**
     * Get the logStorageAccountId value.
     *
     * @return the logStorageAccountId value
     */
    public String logStorageAccountId() {
        return this.logStorageAccountId;
    }

    /**
     * Set the logStorageAccountId value.
     *
     * @param logStorageAccountId the logStorageAccountId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withLogStorageAccountId(String logStorageAccountId) {
        this.logStorageAccountId = logStorageAccountId;
        return this;
    }

    /**
     * Get the disksToInclude value.
     *
     * @return the disksToInclude value
     */
    public List<String> disksToInclude() {
        return this.disksToInclude;
    }

    /**
     * Set the disksToInclude value.
     *
     * @param disksToInclude the disksToInclude value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withDisksToInclude(List<String> disksToInclude) {
        this.disksToInclude = disksToInclude;
        return this;
    }

    /**
     * Get the targetAzureV1ResourceGroupId value.
     *
     * @return the targetAzureV1ResourceGroupId value
     */
    public String targetAzureV1ResourceGroupId() {
        return this.targetAzureV1ResourceGroupId;
    }

    /**
     * Set the targetAzureV1ResourceGroupId value.
     *
     * @param targetAzureV1ResourceGroupId the targetAzureV1ResourceGroupId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withTargetAzureV1ResourceGroupId(String targetAzureV1ResourceGroupId) {
        this.targetAzureV1ResourceGroupId = targetAzureV1ResourceGroupId;
        return this;
    }

    /**
     * Get the targetAzureV2ResourceGroupId value.
     *
     * @return the targetAzureV2ResourceGroupId value
     */
    public String targetAzureV2ResourceGroupId() {
        return this.targetAzureV2ResourceGroupId;
    }

    /**
     * Set the targetAzureV2ResourceGroupId value.
     *
     * @param targetAzureV2ResourceGroupId the targetAzureV2ResourceGroupId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withTargetAzureV2ResourceGroupId(String targetAzureV2ResourceGroupId) {
        this.targetAzureV2ResourceGroupId = targetAzureV2ResourceGroupId;
        return this;
    }

    /**
     * Get the useManagedDisks value.
     *
     * @return the useManagedDisks value
     */
    public String useManagedDisks() {
        return this.useManagedDisks;
    }

    /**
     * Set the useManagedDisks value.
     *
     * @param useManagedDisks the useManagedDisks value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withUseManagedDisks(String useManagedDisks) {
        this.useManagedDisks = useManagedDisks;
        return this;
    }

}