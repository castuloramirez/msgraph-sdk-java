// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Contact;
import com.microsoft.graph.requests.extensions.IContactCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ContactCollectionPage;
import com.microsoft.graph.requests.extensions.ContactCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact Collection Page.
 */
public class ContactCollectionPage extends BaseCollectionPage<Contact, IContactCollectionRequestBuilder> implements IContactCollectionPage {

    /**
     * A collection page for Contact
     *
     * @param response the serialized ContactCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ContactCollectionPage(final ContactCollectionResponse response, final IContactCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
