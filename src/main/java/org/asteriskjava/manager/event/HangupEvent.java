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
 * A HangupEvent is triggered when a channel is hung up.<p>
 * It is implemented in <code>channel.c</code>
 *
 * @author srt
 * @version $Id$
 */
public class HangupEvent extends AbstractChannelEvent
{
    /**
     * Serializable version identifier.
     */
    static final long serialVersionUID = 0L;

    private Integer cause;
    private String causeTxt;
    private String connectedlinename;
    private String connectedlinenum;
    private String language;
    private String context;
    private Integer priority;
    private Integer channelstate;
    private String exten;
    private String channelstatedesc;
    

    public HangupEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the cause of the hangup.
     *
     * @return the hangup cause.
     * @see org.asteriskjava.live.HangupCause
     */
    public Integer getCause()
    {
        return cause;
    }

    /**
     * Sets the cause of the hangup.
     *
     * @param cause the hangup cause.
     */
    public void setCause(Integer cause)
    {
        this.cause = cause;
    }

    /**
     * Returns the textual representation of the hangup cause.
     *
     * @return the textual representation of the hangup cause.
     * @since 0.2
     */
    public String getCauseTxt()
    {
        return causeTxt;
    }

    /**
     * Sets the textual representation of the hangup cause.
     *
     * @param causeTxt the textual representation of the hangup cause.
     * @since 0.2
     */
    public void setCauseTxt(String causeTxt)
    {
        this.causeTxt = causeTxt;
    }

    /**
     * Returns the Caller*ID name of the channel connected if set.
     * If the channel has no caller id set "unknown" is returned.
     *
     * @since 1.0.0
     */
    public String getConnectedlinename()
    {
        return connectedlinename;
    }

    public void setConnectedlinename(String connectedlinename)
    {
        this.connectedlinename = connectedlinename;
    }

    /**
     * Returns the Caller*ID number of the channel connected if set.
     * If the channel has no caller id set "unknown" is returned.
     *
     * @since 1.0.0
     */
    public String getConnectedlinenum()
    {
        return connectedlinenum;
    }

    public void setConnectedlinenum(String connectedlinenum)
    {
        this.connectedlinenum = connectedlinenum;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getChannelstate() {
        return channelstate;
    }

    public void setChannelstate(Integer channelstate) {
        this.channelstate = channelstate;
    }

    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }

    public String getChannelstatedesc() {
        return channelstatedesc;
    }

    public void setChannelstatedesc(String channelstatedesc) {
        this.channelstatedesc = channelstatedesc;
    }
}
