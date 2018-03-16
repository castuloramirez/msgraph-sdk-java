// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Configuration User Overview Request Builder.
 */
public class BaseDeviceConfigurationUserOverviewRequestBuilder extends BaseRequestBuilder implements IBaseDeviceConfigurationUserOverviewRequestBuilder {

    /**
     * The request builder for the DeviceConfigurationUserOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceConfigurationUserOverviewRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceConfigurationUserOverviewRequest instance
     */
    public IDeviceConfigurationUserOverviewRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceConfigurationUserOverviewRequest instance
     */
    public IDeviceConfigurationUserOverviewRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DeviceConfigurationUserOverviewRequest(getRequestUrl(), getClient(), requestOptions);
    }

}