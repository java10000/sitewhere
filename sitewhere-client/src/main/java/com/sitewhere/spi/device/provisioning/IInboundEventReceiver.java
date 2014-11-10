/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.device.provisioning;

import java.util.concurrent.BlockingQueue;

import com.sitewhere.spi.ISiteWhereLifecycle;
import com.sitewhere.spi.SiteWhereException;

/**
 * Handles receipt of device event information from an underlying transport.
 * 
 * @author Derek
 */
public interface IInboundEventReceiver<T> extends ISiteWhereLifecycle {

	/**
	 * Gets access to a queue of (still encoded) messages becoming available from the
	 * underlying transport.
	 * 
	 * @return
	 * @throws SiteWhereException
	 */
	public BlockingQueue<T> getEncodedMessages() throws SiteWhereException;
}