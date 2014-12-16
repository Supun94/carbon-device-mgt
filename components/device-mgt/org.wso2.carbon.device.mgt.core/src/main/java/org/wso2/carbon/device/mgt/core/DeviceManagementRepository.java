/**
 *  Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wso2.carbon.device.mgt.core;

import org.wso2.carbon.device.mgt.common.spi.DeviceManagerService;

import java.util.HashMap;
import java.util.Map;

public class DeviceManagementRepository {

    private Map<String, DeviceManagerService> providers;

    public DeviceManagementRepository() {
        providers = new HashMap<String, DeviceManagerService>();
    }

    public void addDeviceManagementProvider(DeviceManagerService provider) {
        providers.put(provider.getProviderType(), provider);
    }

    public DeviceManagerService getDeviceManagementProvider(String type) {
        return providers.get(type);
    }

    public Map<String, DeviceManagerService> getProviders() {
        return providers;
    }

}