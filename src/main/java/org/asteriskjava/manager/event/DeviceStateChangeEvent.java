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
 * A ConnectEvent is triggered after successful login to the Asterisk server.<p>
 * It is a pseudo event not directly related to an Asterisk generated event.
 * 
 * @author srt
 * @version $Id$
 * @see org.asteriskjava.manager.event.DisconnectEvent
 */
public class DeviceStateChangeEvent extends ManagerEvent
{
    /**
     * Serializable version identifier.
     */
    private static final long serialVersionUID = 3257845467831284784L;

    /**
     * The version of the manager protocol.
     */
    private String privilege;
    private String device;
    private String state;

    /**
     * @param source
     */
    public DeviceStateChangeEvent(Object source)
    {
        super(source);
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    

}
