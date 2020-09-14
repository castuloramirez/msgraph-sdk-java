// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartSeries;
import com.microsoft.graph.models.extensions.WorkbookChartPoint;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookChartPointCollectionResponse;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartPointCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Point Collection Request.
 */
public class WorkbookChartPointCollectionRequest extends BaseCollectionRequest<WorkbookChartPointCollectionResponse, IWorkbookChartPointCollectionPage> implements IWorkbookChartPointCollectionRequest {

    /**
     * The request builder for this collection of WorkbookChartPoint
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartPointCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartPointCollectionResponse.class, IWorkbookChartPointCollectionPage.class);
    }

    public void get(final ICallback<IWorkbookChartPointCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IWorkbookChartPointCollectionPage get() throws ClientException {
        final WorkbookChartPointCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkbookChartPoint newWorkbookChartPoint, final ICallback<WorkbookChartPoint> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookChartPointRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkbookChartPoint, callback);
    }

    public WorkbookChartPoint post(final WorkbookChartPoint newWorkbookChartPoint) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookChartPointRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkbookChartPoint);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookChartPointCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookChartPointCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IWorkbookChartPointCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (WorkbookChartPointCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookChartPointCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookChartPointCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkbookChartPointCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WorkbookChartPointCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IWorkbookChartPointCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (WorkbookChartPointCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IWorkbookChartPointCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IWorkbookChartPointCollectionRequest)this;
    }
    public IWorkbookChartPointCollectionPage buildFromResponse(final WorkbookChartPointCollectionResponse response) {
        final IWorkbookChartPointCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkbookChartPointCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkbookChartPointCollectionPage page = new WorkbookChartPointCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
