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
 * A ContactStatusDetailEvent, Provide details about a contact's status.
 *
 * @author srt
 * @version $Id$
 * @since 0.2
 */
public class ContactStatusDetailEvent extends ResponseEvent {

    /**
     * Serial version identifier.
     */
    private static final long serialVersionUID = 0L;
    
    private String AOR;
    private String URI;
    private String Status;
    private String RoundtripUsec;
    private String EndpointName;
    private String UserAgent;
    private String RegExpire;
    private String ViaAddress;
    private String CallID;
    private String ID;
    private String AuthenticateQualify;
    private String OutboundProxy;
    private String Path;
    private String QualifyFrequency;
    private String QualifyTimeout;

    /**
     * Creates a new instance.
     *
     * @param source
     */
    public ContactStatusDetailEvent(Object source) {
        super(source);
    }

    public String getAOR() {
        return AOR;
    }

    public void setAOR(String AOR) {
        this.AOR = AOR;
    }

    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getRoundtripUsec() {
        return RoundtripUsec;
    }

    public void setRoundtripUsec(String RoundtripUsec) {
        this.RoundtripUsec = RoundtripUsec;
    }

    public String getEndpointName() {
        return EndpointName;
    }

    public void setEndpointName(String EndpointName) {
        this.EndpointName = EndpointName;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    public String getRegExpire() {
        return RegExpire;
    }

    public void setRegExpire(String RegExpire) {
        this.RegExpire = RegExpire;
    }

    public String getViaAddress() {
        return ViaAddress;
    }

    public void setViaAddress(String ViaAddress) {
        this.ViaAddress = ViaAddress;
    }

    public String getCallID() {
        return CallID;
    }

    public void setCallID(String CallID) {
        this.CallID = CallID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAuthenticateQualify() {
        return AuthenticateQualify;
    }

    public void setAuthenticateQualify(String AuthenticateQualify) {
        this.AuthenticateQualify = AuthenticateQualify;
    }

    public String getOutboundProxy() {
        return OutboundProxy;
    }

    public void setOutboundProxy(String OutboundProxy) {
        this.OutboundProxy = OutboundProxy;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }

    public String getQualifyFrequency() {
        return QualifyFrequency;
    }

    public void setQualifyFrequency(String QualifyFrequency) {
        this.QualifyFrequency = QualifyFrequency;
    }

    public String getQualifyTimeout() {
        return QualifyTimeout;
    }

    public void setQualifyTimeout(String QualifyTimeout) {
        this.QualifyTimeout = QualifyTimeout;
    }

}
