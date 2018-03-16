// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Configuration State.
 */
public class BaseDeviceConfigurationState extends Entity implements IJsonBackedObject {


    /**
     * The Setting States.
     * Not yet documented
     */
    @SerializedName("settingStates")
    @Expose
    public java.util.List<DeviceConfigurationSettingState> settingStates;

    /**
     * The Display Name.
     * The name of the policy for this policyBase
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Version.
     * The version of the policy
     */
    @SerializedName("version")
    @Expose
    public Integer version;

    /**
     * The Platform Type.
     * Platform type that the policy applies to Possible values are: android, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, all.
     */
    @SerializedName("platformType")
    @Expose
    public PolicyPlatformType platformType;

    /**
     * The State.
     * The compliance state of the policy Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant, error, conflict.
     */
    @SerializedName("state")
    @Expose
    public ComplianceStatus state;

    /**
     * The Setting Count.
     * Count of how many setting a policy holds
     */
    @SerializedName("settingCount")
    @Expose
    public Integer settingCount;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}