/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.registration.microservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sitewhere.registration.spi.microservice.IDeviceRegistrationMicroservice;

/**
 * Spring bean configuration for microservice.
 * 
 * @author Derek
 */
@Configuration
public class DeviceRegistrationMicroserviceConfiguration {

    @Bean
    public IDeviceRegistrationMicroservice deviceRegistrationMicroservice() {
	return new DeviceRegistrationMicroservice();
    }
}
