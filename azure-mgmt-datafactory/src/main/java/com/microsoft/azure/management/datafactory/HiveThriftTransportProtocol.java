/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for HiveThriftTransportProtocol.
 */
public final class HiveThriftTransportProtocol extends ExpandableStringEnum<HiveThriftTransportProtocol> {
    /** Static value Binary for HiveThriftTransportProtocol. */
    public static final HiveThriftTransportProtocol BINARY = fromString("Binary");

    /** Static value SASL for HiveThriftTransportProtocol. */
    public static final HiveThriftTransportProtocol SASL = fromString("SASL");

    /** Static value HTTP  for HiveThriftTransportProtocol. */
    public static final HiveThriftTransportProtocol HTTP_ = fromString("HTTP ");

    /**
     * Creates or finds a HiveThriftTransportProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding HiveThriftTransportProtocol
     */
    @JsonCreator
    public static HiveThriftTransportProtocol fromString(String name) {
        return fromString(name, HiveThriftTransportProtocol.class);
    }

    /**
     * @return known HiveThriftTransportProtocol values
     */
    public static Collection<HiveThriftTransportProtocol> values() {
        return values(HiveThriftTransportProtocol.class);
    }
}
