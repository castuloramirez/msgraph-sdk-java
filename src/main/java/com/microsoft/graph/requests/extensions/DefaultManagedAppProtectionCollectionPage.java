// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DefaultManagedAppProtection;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionCollectionPage;
import com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Default Managed App Protection Collection Page.
 */
public class DefaultManagedAppProtectionCollectionPage extends BaseCollectionPage<DefaultManagedAppProtection, IDefaultManagedAppProtectionCollectionRequestBuilder> implements IDefaultManagedAppProtectionCollectionPage {

    /**
     * A collection page for DefaultManagedAppProtection
     *
     * @param response the serialized DefaultManagedAppProtectionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DefaultManagedAppProtectionCollectionPage(final DefaultManagedAppProtectionCollectionResponse response, final IDefaultManagedAppProtectionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
