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
 * The class for the Base Onenote Page.
 */
public class BaseOnenotePage extends OnenoteEntitySchemaObjectModel implements IJsonBackedObject {


    public BaseOnenotePage() {
        oDataType = "microsoft.graph.onenotePage";
    }

    /**
     * The Title.
     * The title of the page.
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Created By App Id.
     * The unique identifier of the application that created the page. Read-only.
     */
    @SerializedName("createdByAppId")
    @Expose
    public String createdByAppId;

    /**
     * The Links.
     * Links for opening the page. The oneNoteClientURL link opens the page in the OneNote native client if it 's installed. The oneNoteWebUrl link opens the page in OneNote Online. Read-only.
     */
    @SerializedName("links")
    @Expose
    public PageLinks links;

    /**
     * The Content Url.
     * The URL for the page's HTML content.  Read-only.
     */
    @SerializedName("contentUrl")
    @Expose
    public String contentUrl;

    /**
     * The Last Modified Date Time.
     * The date and time when the page was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Level.
     * The indentation level of the page. Read-only.
     */
    @SerializedName("level")
    @Expose
    public Integer level;

    /**
     * The Order.
     * The order of the page within its parent section. Read-only.
     */
    @SerializedName("order")
    @Expose
    public Integer order;

    /**
     * The User Tags.
     * 
     */
    @SerializedName("userTags")
    @Expose
    public java.util.List<String> userTags;

    /**
     * The Parent Section.
     * The section that contains the page. Read-only.
     */
    @SerializedName("parentSection")
    @Expose
    public OnenoteSection parentSection;

    /**
     * The Parent Notebook.
     * The notebook that contains the page.  Read-only.
     */
    @SerializedName("parentNotebook")
    @Expose
    public Notebook parentNotebook;


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

    }
}