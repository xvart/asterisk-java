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
 * A BridgeEvent is triggered when a link between two voice channels is established ("Link") or
 * discontinued ("Unlink").<p>
 * As of Asterisk 1.6 the Bridge event is reported directly by Asterisk. Asterisk versions up to
 * 1.4 report individual events: {@link LinkEvent} and
 * {@link UnlinkEvent}.For maximum compatibily do not use the Link and Unlink
 * events in your code.
 * <br>
 * It is implemented in <code>channel.c</code>
 *
 * @author srt
 * @version $Id$
 */
public class LocalBridgeEvent extends ManagerEvent
{
    /**
     * Serializable version identifier.
     */
    static final long serialVersionUID = 0L;

    public static final String BRIDGE_STATE_LINK = "Link";
    public static final String BRIDGE_STATE_UNLINK = "Unlink";

    private String uniqueId1;
    private String uniqueId2;
    private String context;
    private String exten;
    private String localOptimization;
    private String channel1;
    private String channel2;

    public LocalBridgeEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the unique id of the first channel.
     *
     * @return the unique id of the first channel.
     */
    public String getUniqueId1()
    {
        return uniqueId1;
    }

    /**
     * Sets the unique id of the first channel.
     *
     * @param uniqueId1 the unique id of the first channel.
     */
    public void setUniqueId1(String uniqueId1)
    {
        this.uniqueId1 = uniqueId1;
    }

    /**
     * Returns the unique id of the second channel.
     *
     * @return the unique id of the second channel.
     */
    public String getUniqueId2()
    {
        return uniqueId2;
    }

    /**
     * Sets the unique id of the second channel.
     *
     * @param uniqueId2 the unique id of the second channel.
     */
    public void setUniqueId2(String uniqueId2)
    {
        this.uniqueId2 = uniqueId2;
    }

    /**
     * Returns the name of the first channel.
     *
     * @return the name of the first channel.
     */
    public String getChannel1()
    {
        return channel1;
    }

    /**
     * Sets the name of the first channel.
     *
     * @param channel1 the name of the first channel.
     */
    public void setChannel1(String channel1)
    {
        this.channel1 = channel1;
    }

    /**
     * Returns the name of the second channel.
     *
     * @return the name of the second channel.
     */
    public String getChannel2()
    {
        return channel2;
    }

    /**
     * Sets the name of the second channel.
     *
     * @param channel2 the name of the second channel.
     */
    public void setChannel2(String channel2)
    {
        this.channel2 = channel2;
    }

    /**
     *
     * @return
     */
    public String getContext() {
        return context;
    }

    /**
     *
     * @param context
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     *
     * @return
     */
    public String getExten() {
        return exten;
    }

    /**
     *
     * @param exten
     */
    public void setExten(String exten) {
        this.exten = exten;
    }

    /**
     *
     * @return
     */
    public String getLocalOptimization() {
        return localOptimization;
    }

    /**
     *
     * @param localOptimization
     */
    public void setLocalOptimization(String localOptimization) {
        this.localOptimization = localOptimization;
    }
}
