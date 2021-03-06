/*
* Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
*
*/
package org.wso2.am.integration.test.utils.bean;

/**
 * Bean class used to represent Endpoint
 */
public class EndpointBean {
    //production_endpoints field is compose with "_" since it should be include in JSON message as a attribute
    private ProductionEndpointBean production_endpoints;

    public ProductionEndpointBean getProduction_endpoints() {
        return production_endpoints;
    }

    public void setProduction_endpoints(ProductionEndpointBean production_endpoints) {
        this.production_endpoints = production_endpoints;
    }

}
