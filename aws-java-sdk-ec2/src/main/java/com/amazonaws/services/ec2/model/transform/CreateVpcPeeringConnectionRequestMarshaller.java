/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Vpc Peering Connection Request Marshaller
 */
public class CreateVpcPeeringConnectionRequestMarshaller implements Marshaller<Request<CreateVpcPeeringConnectionRequest>, CreateVpcPeeringConnectionRequest> {

    public Request<CreateVpcPeeringConnectionRequest> marshall(CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest) {

        if (createVpcPeeringConnectionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVpcPeeringConnectionRequest> request = new DefaultRequest<CreateVpcPeeringConnectionRequest>(createVpcPeeringConnectionRequest, "AmazonEC2");
        request.addParameter("Action", "CreateVpcPeeringConnection");
        request.addParameter("Version", "2014-10-01");

        if (createVpcPeeringConnectionRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(createVpcPeeringConnectionRequest.getVpcId()));
        }
        if (createVpcPeeringConnectionRequest.getPeerVpcId() != null) {
            request.addParameter("PeerVpcId", StringUtils.fromString(createVpcPeeringConnectionRequest.getPeerVpcId()));
        }
        if (createVpcPeeringConnectionRequest.getPeerOwnerId() != null) {
            request.addParameter("PeerOwnerId", StringUtils.fromString(createVpcPeeringConnectionRequest.getPeerOwnerId()));
        }

        return request;
    }
}
