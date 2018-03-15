/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * This activity executes inner activities until the specified boolean
 * expression results to true or timeout is reached, whichever is earlier.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Until")
@JsonFlatten
public class UntilActivity extends ControlActivity {
    /**
     * An expression that would evaluate to Boolean. The loop will continue
     * until this expression evaluates to true.
     */
    @JsonProperty(value = "typeProperties.expression", required = true)
    private Expression expression;

    /**
     * Specifies the timeout for the activity to run. If there is no value
     * specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as
     * default. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])). Type: string (or
     * Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "typeProperties.timeout")
    private Object timeout;

    /**
     * List of activities to execute.
     */
    @JsonProperty(value = "typeProperties.activities", required = true)
    private List<Activity> activities;

    /**
     * Get the expression value.
     *
     * @return the expression value
     */
    public Expression expression() {
        return this.expression;
    }

    /**
     * Set the expression value.
     *
     * @param expression the expression value to set
     * @return the UntilActivity object itself.
     */
    public UntilActivity withExpression(Expression expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Get the timeout value.
     *
     * @return the timeout value
     */
    public Object timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout value.
     *
     * @param timeout the timeout value to set
     * @return the UntilActivity object itself.
     */
    public UntilActivity withTimeout(Object timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the activities value.
     *
     * @return the activities value
     */
    public List<Activity> activities() {
        return this.activities;
    }

    /**
     * Set the activities value.
     *
     * @param activities the activities value to set
     * @return the UntilActivity object itself.
     */
    public UntilActivity withActivities(List<Activity> activities) {
        this.activities = activities;
        return this;
    }

}
