// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.ReferenceRequestBody;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Claims Mapping Policy Collection Reference Request.
 */
public class ClaimsMappingPolicyCollectionReferenceRequest extends BaseCollectionRequest<ClaimsMappingPolicyCollectionResponse, IClaimsMappingPolicyCollectionPage> implements IClaimsMappingPolicyCollectionReferenceRequest {

    /**
     * The request builder for this collection of ClaimsMappingPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ClaimsMappingPolicyCollectionReferenceRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ClaimsMappingPolicyCollectionResponse.class, IClaimsMappingPolicyCollectionPage.class);
    }

    public void post(final ClaimsMappingPolicy newClaimsMappingPolicy, final ICallback<ClaimsMappingPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/policies/claimsMappingPolicies/" + newClaimsMappingPolicy.id);
        new ClaimsMappingPolicyWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newClaimsMappingPolicy, body, callback);
    }

    public ClaimsMappingPolicy post(final ClaimsMappingPolicy newClaimsMappingPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/policies/claimsMappingPolicies/" + newClaimsMappingPolicy.id);
        return new ClaimsMappingPolicyWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newClaimsMappingPolicy, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IClaimsMappingPolicyCollectionReferenceRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ClaimsMappingPolicyCollectionReferenceRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IClaimsMappingPolicyCollectionReferenceRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ClaimsMappingPolicyCollectionReferenceRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IClaimsMappingPolicyCollectionReferenceRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ClaimsMappingPolicyCollectionReferenceRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IClaimsMappingPolicyCollectionReferenceRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ClaimsMappingPolicyCollectionReferenceRequest)this;
    }
}
