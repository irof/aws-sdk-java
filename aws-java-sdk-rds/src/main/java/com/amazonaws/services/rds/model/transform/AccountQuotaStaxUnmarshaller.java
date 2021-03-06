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

package com.amazonaws.services.rds.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Account Quota StAX Unmarshaller
 */
public class AccountQuotaStaxUnmarshaller implements Unmarshaller<AccountQuota, StaxUnmarshallerContext> {

    public AccountQuota unmarshall(StaxUnmarshallerContext context) throws Exception {
        AccountQuota accountQuota = new AccountQuota();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 2;

        if (context.isStartOfDocument()) targetDepth++;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return accountQuota;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("AccountQuotaName", targetDepth)) {
                    accountQuota.setAccountQuotaName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Used", targetDepth)) {
                    accountQuota.setUsed(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Max", targetDepth)) {
                    accountQuota.setMax(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return accountQuota;
                }
            }
        }
    }

    private static AccountQuotaStaxUnmarshaller instance;
    public static AccountQuotaStaxUnmarshaller getInstance() {
        if (instance == null) instance = new AccountQuotaStaxUnmarshaller();
        return instance;
    }
}
    