// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

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

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Windows Information Protection Assign Request Builder.
 */
public class WindowsInformationProtectionAssignRequestBuilder extends BaseWindowsInformationProtectionAssignRequestBuilder implements IWindowsInformationProtectionAssignRequestBuilder {

    /**
     * The request builder for this WindowsInformationProtectionAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param assignments the assignments
     */
    public WindowsInformationProtectionAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<TargetedManagedAppPolicyAssignment> assignments) {
        super(requestUrl, client, requestOptions, assignments);
    }
}