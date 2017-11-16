// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
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
 * The class for the Base Device.
 */
public class BaseDevice extends DirectoryObject implements IJsonBackedObject {


    public BaseDevice() {
        oDataType = "microsoft.graph.device";
    }

    /**
     * The Account Enabled.
     * true if the account is enabled; otherwise, false. Required.
     */
    @SerializedName("accountEnabled")
    @Expose
    public Boolean accountEnabled;

    /**
     * The Alternative Security Ids.
     * The any operator is required for filter expressions on multi-valued properties. Not nullable. Required.
     */
    @SerializedName("alternativeSecurityIds")
    @Expose
    public java.util.List<AlternativeSecurityId> alternativeSecurityIds;

    /**
     * The Approximate Last Sign In Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("approximateLastSignInDateTime")
    @Expose
    public java.util.Calendar approximateLastSignInDateTime;

    /**
     * The Device Id.
     * Unique client specified GUID to represent the device. Required.
     */
    @SerializedName("deviceId")
    @Expose
    public String deviceId;

    /**
     * The Device Metadata.
     * 
     */
    @SerializedName("deviceMetadata")
    @Expose
    public String deviceMetadata;

    /**
     * The Device Version.
     * 
     */
    @SerializedName("deviceVersion")
    @Expose
    public Integer deviceVersion;

    /**
     * The Display Name.
     * The display name for the device. Required.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Is Compliant.
     * true if the device complies with Mobile Device Management (MDM) policies; otherwise, false.
     */
    @SerializedName("isCompliant")
    @Expose
    public Boolean isCompliant;

    /**
     * The Is Managed.
     * true if the device is managed by a Mobile Device Management (MDM) app such as Intune; otherwise, false.
     */
    @SerializedName("isManaged")
    @Expose
    public Boolean isManaged;

    /**
     * The On Premises Last Sync Date Time.
     * The last time at which the object was synced with the on-premises directory.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("onPremisesLastSyncDateTime")
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Sync Enabled.
     * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default).
     */
    @SerializedName("onPremisesSyncEnabled")
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The Operating System.
     * The type of operating system on the device. Required.
     */
    @SerializedName("operatingSystem")
    @Expose
    public String operatingSystem;

    /**
     * The Operating System Version.
     * The version of the operating system on the device. Required.
     */
    @SerializedName("operatingSystemVersion")
    @Expose
    public String operatingSystemVersion;

    /**
     * The Physical Ids.
     * Not nullable.
     */
    @SerializedName("physicalIds")
    @Expose
    public java.util.List<String> physicalIds;

    /**
     * The Trust Type.
     * 
     */
    @SerializedName("trustType")
    @Expose
    public String trustType;

    /**
     * The Registered Owners.
     * Users that are registered owners of the device. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage registeredOwners;

    /**
     * The Registered Users.
     * Users that are registered users of the device. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage registeredUsers;

    /**
     * The Extensions.
     * The collection of open extensions defined for the device. Read-only. Nullable.
     */
    public ExtensionCollectionPage extensions;


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
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("registeredOwners")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("registeredOwners@odata.nextLink")) {
                response.nextLink = json.get("registeredOwners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("registeredOwners").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            registeredOwners = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("registeredUsers")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("registeredUsers@odata.nextLink")) {
                response.nextLink = json.get("registeredUsers@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("registeredUsers").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            registeredUsers = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("extensions")) {
            final BaseExtensionCollectionResponse response = new BaseExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }
    }
}