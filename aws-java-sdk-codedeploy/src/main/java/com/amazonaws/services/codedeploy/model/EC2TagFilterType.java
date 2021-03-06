/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

/**
 * E C2 Tag Filter Type
 */
public enum EC2TagFilterType {
    
    KEY_ONLY("KEY_ONLY"),
    VALUE_ONLY("VALUE_ONLY"),
    KEY_AND_VALUE("KEY_AND_VALUE");

    private String value;

    private EC2TagFilterType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return EC2TagFilterType corresponding to the value
     */
    public static EC2TagFilterType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("KEY_ONLY".equals(value)) {
            return EC2TagFilterType.KEY_ONLY;
        } else if ("VALUE_ONLY".equals(value)) {
            return EC2TagFilterType.VALUE_ONLY;
        } else if ("KEY_AND_VALUE".equals(value)) {
            return EC2TagFilterType.KEY_AND_VALUE;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    