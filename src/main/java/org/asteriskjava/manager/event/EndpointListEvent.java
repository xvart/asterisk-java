/*
 *  Copyright 2004-2006 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.asteriskjava.manager.event;

/**
 * EndpointListEvent, Provide details about a contact's status.
 *
 * @author srt
 * @version $Id$
 * @since 0.2
 */
public class EndpointListEvent extends ManagerEvent
{
    /**
     * Serializable version identifier.
     */
    private static final long serialVersionUID = 0L;
    
    private String objectType;
    private String objectName;
    private String transport;
    private String aor;
    private String auths;
    private String outboundAuths;
    private String deviceState;
    private String activeChannels;

    /**
     * Creates a new EndpointListEvent.
     *
     * @param source
     */
    public EndpointListEvent(Object source)
    {
        super(source);
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getAor() {
        return aor;
    }

    public void setAor(String aor) {
        this.aor = aor;
    }

    public String getAuths() {
        return auths;
    }

    public void setAuths(String auths) {
        this.auths = auths;
    }

    public String getOutboundAuths() {
        return outboundAuths;
    }

    public void setOutboundAuths(String outboundAuths) {
        this.outboundAuths = outboundAuths;
    }

    public String getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(String deviceState) {
        this.deviceState = deviceState;
    }

    public String getActiveChannels() {
        return activeChannels;
    }

    public void setActiveChannels(String activeChannels) {
        this.activeChannels = activeChannels;
    }

}
