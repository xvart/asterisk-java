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
 * A ContactStatusEvent 
 * 
 *
 * @author srt
 * @version $Id$
 * @since 0.2
 */
public class ContactStatusEvent extends ManagerEvent
{

    /**
     * Serial version identifier.
     */
    private static final long serialVersionUID = 0L;

    private String aor;
    private String uri;
    private String contactStatus;
    private String endpointName;
    private String privilege;
    private String roundTripUsec;
    

    /**
     * Creates a new instance.
     *
     * @param source
     */
    public ContactStatusEvent(Object source)
    {
        super(source);
    }

    public String getAor() {
        return aor;
    }

    public void setAor(String aor) {
        this.aor = aor;
    }

    public String getContactStatus() {
        return contactStatus;
    }

    public void setContactStatus(String contactStatus) {
        this.contactStatus = contactStatus;
    }

    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public String getRoundTripUsec() {
        return roundTripUsec;
    }

    public void setRoundTripUsec(String roundTripUsec) {
        this.roundTripUsec = roundTripUsec;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }


}
