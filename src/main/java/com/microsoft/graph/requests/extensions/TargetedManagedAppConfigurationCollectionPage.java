// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TargetedManagedAppConfiguration;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Configuration Collection Page.
 */
public class TargetedManagedAppConfigurationCollectionPage extends BaseCollectionPage<TargetedManagedAppConfiguration, ITargetedManagedAppConfigurationCollectionRequestBuilder> implements ITargetedManagedAppConfigurationCollectionPage {

    /**
     * A collection page for TargetedManagedAppConfiguration
     *
     * @param response the serialized TargetedManagedAppConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TargetedManagedAppConfigurationCollectionPage(final TargetedManagedAppConfigurationCollectionResponse response, final ITargetedManagedAppConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
