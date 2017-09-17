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
package org.asteriskjava.manager.action;

/**
 * Redirects a given channel (and an optional additional channel) to a new
 * extension.<p>
 * The additional channel is usually used when redirecting two bridged channel
 * for example to a MeetMe room.<p>
 * Note that BRIstuffed versions of Asterisk behave slightly different:
 * While the standard version only allows redirecting the two channels to the same
 * context, extension, priority the BRIstuffed version uses context, extension, 
 * priority only for the first channel and extraContext, extraExtension, 
 * extraPriority for the second channel. The standard version ignores the 
 * extraContext, extraExtension, extraPriority properties.  
 * 
 * @author srt
 * @version $Id$
 */
public class BlindTransferAction extends AbstractManagerAction
{
    /**
     * Serializable version identifier
     */
    static final long serialVersionUID = 1869279324159418150L;

    private String channel;
    private String exten;
    private String context;

    /**
     * Creates a new empty BlindTransferAction.
     */
    public BlindTransferAction()
    {

    }

    /**
     * Creates a new BlindTransferAction that redirects the given channel to the
     * given context, extension, priority triple.
     * 
     * @param channel the name of the channel to redirect
     * @param context the destination context
     * @param exten the destination extension
     * @since 0.2
     */
    public BlindTransferAction(String channel, String context, String exten)
    {
        this.channel = channel;
        this.context = context;
        this.exten = exten;
    }

    /**
     * Returns the name of this action, i.e. "BlindTransfer".
     */
    @Override
   public String getAction()
    {
        return "BlindTransfer";
    }

    /**
     * Returns name of the channel to redirect.
     * 
     * @return the name of the channel to redirect
     */
    public String getChannel()
    {
        return channel;
    }

    /**
     * Sets the name of the channel to redirect.
     * 
     * @param channel the name of the channel to redirect
     */
    public void setChannel(String channel)
    {
        this.channel = channel;
    }

    /**
     * Returns the destination context.
     * 
     * @return the destination context
     */
    public String getContext()
    {
        return context;
    }

    /**
     * Sets the destination context.
     * 
     * @param context the destination context
     */
    public void setContext(String context)
    {
        this.context = context;
    }

    /**
     * Returns the destination extension.
     * 
     * @return the destination extension
     */
    public String getExten()
    {
        return exten;
    }

    /**
     * Sets the destination extension.
     * 
     * @param exten the destination extension
     */
    public void setExten(String exten)
    {
        this.exten = exten;
    }
}
