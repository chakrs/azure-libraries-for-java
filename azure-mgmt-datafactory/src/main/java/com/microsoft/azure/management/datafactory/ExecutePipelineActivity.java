/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Execute pipeline activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ExecutePipeline")
@JsonFlatten
public class ExecutePipelineActivity extends ControlActivity {
    /**
     * Pipeline reference.
     */
    @JsonProperty(value = "typeProperties.pipeline", required = true)
    private PipelineReference pipeline;

    /**
     * Pipeline parameters.
     */
    @JsonProperty(value = "typeProperties.parameters")
    private Map<String, Object> parameters;

    /**
     * Defines whether activity execution will wait for the dependent pipeline
     * execution to finish. Default is false.
     */
    @JsonProperty(value = "typeProperties.waitOnCompletion")
    private Boolean waitOnCompletion;

    /**
     * Get the pipeline value.
     *
     * @return the pipeline value
     */
    public PipelineReference pipeline() {
        return this.pipeline;
    }

    /**
     * Set the pipeline value.
     *
     * @param pipeline the pipeline value to set
     * @return the ExecutePipelineActivity object itself.
     */
    public ExecutePipelineActivity withPipeline(PipelineReference pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Get the parameters value.
     *
     * @return the parameters value
     */
    public Map<String, Object> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters value.
     *
     * @param parameters the parameters value to set
     * @return the ExecutePipelineActivity object itself.
     */
    public ExecutePipelineActivity withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the waitOnCompletion value.
     *
     * @return the waitOnCompletion value
     */
    public Boolean waitOnCompletion() {
        return this.waitOnCompletion;
    }

    /**
     * Set the waitOnCompletion value.
     *
     * @param waitOnCompletion the waitOnCompletion value to set
     * @return the ExecutePipelineActivity object itself.
     */
    public ExecutePipelineActivity withWaitOnCompletion(Boolean waitOnCompletion) {
        this.waitOnCompletion = waitOnCompletion;
        return this;
    }

}
