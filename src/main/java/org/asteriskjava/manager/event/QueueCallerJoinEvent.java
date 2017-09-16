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
 * A JoinEvent is triggered when a channel joines a queue.<p>
 * It is implemented in <code>apps/app_queue.c</code>
 *
 * @author srt
 */
public class QueueCallerJoinEvent extends QueueEvent
{
    /**
     * Serializable version identifier.
     */
    static final long serialVersionUID = 0L;

    protected String callerIdName;
    protected String callerIdNum;
    private String channel;
    private Integer channelState;
    private String channelStateDesc;
    protected String connectedlinename;
    protected String connectedlinenum;
    private String context;
    private Integer count;
    private String event;
    private String exten;
    private String language;
    private String linkedid;
    protected Integer position;
    private Integer priority;
    private String privilege;
    private String queue;
    
    public QueueCallerJoinEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the Caller*ID number of the channel that joined the queue if set.
     * If the channel has no caller id set "unknown" is returned.
     *
     * @return the Caller*ID number of the channel that joined the queue
     * @deprecated since 1.0.0, use {@link #getCallerIdNum()} instead.
     */
    @Deprecated public String getCallerId()
    {
        return callerIdNum;
    }

    /**
     * Sets the Caller*ID number of the channel that joined the queue.
     *
     * @param callerId the Caller*ID number of the channel that joined the queue.
     */
    public void setCallerId(String callerId)
    {
        this.callerIdNum = callerId;
    }

    /**
     * Returns the Caller*ID number of the channel that joined the queue if set.
     * If the channel has no caller id set "unknown" is returned.
     *
     * @return the Caller*ID number of the channel that joined the queue
     * @since 1.0.0
     */
    public String getCallerIdNum()
    {
        return callerIdNum;
    }

    /**
     * Sets the Caller*ID number of the channel that joined the queue.
     *
     * @param callerIdNum the Caller*ID number of the channel that joined the queue.
     */
    public void setCallerIdNum(String callerIdNum)
    {
        this.callerIdNum = callerIdNum;
    }

    /**
     * Returns the Caller*ID name of the channel that joined the queue if set.
     * If the channel has no caller id set "unknown" is returned.
     *
     * @since 0.2
     */
    public String getCallerIdName()
    {
        return callerIdName;
    }

    /**
     * Sets the Caller*ID name of the channel that joined the queue.
     *
     * @since 0.2
     */
    public void setCallerIdName(String callerIdName)
    {
        this.callerIdName = callerIdName;
    }

    /**
     * Returns the position of the joined channel in the queue.
     */
    public Integer getPosition()
    {
        return position;
    }

    /**
     * Sets the position of the joined channel in the queue.
     */
    public void setPosition(Integer position)
    {
        this.position = position;
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

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getChannelState() {
        return channelState;
    }

    public void setChannelState(Integer channelState) {
        this.channelState = channelState;
    }

    public String getChannelStateDesc() {
        return channelStateDesc;
    }

    public void setChannelStateDesc(String channelStateDesc) {
        this.channelStateDesc = channelStateDesc;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLinkedid() {
        return linkedid;
    }

    public void setLinkedid(String linkedid) {
        this.linkedid = linkedid;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }
}
