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

/**
 * A copy activity Azure Data Lake Store sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataLakeStoreSink")
public class AzureDataLakeStoreSink extends CopySink {
    /**
     * The type of copy behavior for copy sink. Possible values include:
     * 'PreserveHierarchy', 'FlattenHierarchy', 'MergeFiles'.
     */
    @JsonProperty(value = "copyBehavior")
    private CopyBehaviorType copyBehavior;

    /**
     * Get the copyBehavior value.
     *
     * @return the copyBehavior value
     */
    public CopyBehaviorType copyBehavior() {
        return this.copyBehavior;
    }

    /**
     * Set the copyBehavior value.
     *
     * @param copyBehavior the copyBehavior value to set
     * @return the AzureDataLakeStoreSink object itself.
     */
    public AzureDataLakeStoreSink withCopyBehavior(CopyBehaviorType copyBehavior) {
        this.copyBehavior = copyBehavior;
        return this;
    }

}
