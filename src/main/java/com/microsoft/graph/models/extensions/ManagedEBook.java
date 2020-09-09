// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MimeContent;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;
import com.microsoft.graph.models.extensions.DeviceInstallState;
import com.microsoft.graph.models.extensions.EBookInstallSummary;
import com.microsoft.graph.models.extensions.UserInstallStateSummary;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceInstallStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceInstallStateCollectionPage;
import com.microsoft.graph.requests.extensions.UserInstallStateSummaryCollectionResponse;
import com.microsoft.graph.requests.extensions.UserInstallStateSummaryCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook.
 */
public class ManagedEBook extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The date and time when the eBook file was created.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * Description.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * Name of the eBook.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Information Url.
     * The more information Url.
     */
    @SerializedName("informationUrl")
    @Expose
    public String informationUrl;

    /**
     * The Large Cover.
     * Book cover.
     */
    @SerializedName("largeCover")
    @Expose
    public MimeContent largeCover;

    /**
     * The Last Modified Date Time.
     * The date and time when the eBook was last modified.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Privacy Information Url.
     * The privacy statement Url.
     */
    @SerializedName("privacyInformationUrl")
    @Expose
    public String privacyInformationUrl;

    /**
     * The Published Date Time.
     * The date and time when the eBook was published.
     */
    @SerializedName("publishedDateTime")
    @Expose
    public java.util.Calendar publishedDateTime;

    /**
     * The Publisher.
     * Publisher.
     */
    @SerializedName("publisher")
    @Expose
    public String publisher;

    /**
     * The Assignments.
     * The list of assignments for this eBook.
     */
    @SerializedName("assignments")
    @Expose
    public ManagedEBookAssignmentCollectionPage assignments;

    /**
     * The Device States.
     * The list of installation states for this eBook.
     */
    @SerializedName("deviceStates")
    @Expose
    public DeviceInstallStateCollectionPage deviceStates;

    /**
     * The Install Summary.
     * Mobile App Install Summary.
     */
    @SerializedName("installSummary")
    @Expose
    public EBookInstallSummary installSummary;

    /**
     * The User State Summary.
     * The list of installation states for this eBook.
     */
    @SerializedName("userStateSummary")
    @Expose
    public UserInstallStateSummaryCollectionPage userStateSummary;


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


        if (json.has("assignments")) {
            final ManagedEBookAssignmentCollectionResponse response = new ManagedEBookAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final ManagedEBookAssignment[] array = new ManagedEBookAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedEBookAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new ManagedEBookAssignmentCollectionPage(response, null);
        }

        if (json.has("deviceStates")) {
            final DeviceInstallStateCollectionResponse response = new DeviceInstallStateCollectionResponse();
            if (json.has("deviceStates@odata.nextLink")) {
                response.nextLink = json.get("deviceStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceStates").toString(), JsonObject[].class);
            final DeviceInstallState[] array = new DeviceInstallState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceInstallState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceStates = new DeviceInstallStateCollectionPage(response, null);
        }

        if (json.has("userStateSummary")) {
            final UserInstallStateSummaryCollectionResponse response = new UserInstallStateSummaryCollectionResponse();
            if (json.has("userStateSummary@odata.nextLink")) {
                response.nextLink = json.get("userStateSummary@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userStateSummary").toString(), JsonObject[].class);
            final UserInstallStateSummary[] array = new UserInstallStateSummary[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserInstallStateSummary.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userStateSummary = new UserInstallStateSummaryCollectionPage(response, null);
        }
    }
}
