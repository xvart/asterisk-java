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

import java.net.InetAddress;

/**
 * An RTCPReceivedEvent is triggered when Asterisk receives an RTCP message.<p>
 * Available since Asterisk 1.6<p>
 * It is implemented in <code>main/rtp.c</code>
 *
 * @author srt
 * @version $Id$
 * @since 1.0.0
 */
public class RtcpReceivedEvent extends AbstractRtcpEvent
{
    private static final long serialVersionUID = 1L;

    /**
     * Payload identifier for a sender report.
     */
    public static final int PT_SENDER_REPORT = 200;

    /**
     * Payload identifier for a receiver report.
     */
    public static final int PT_RECEIVER_REPORT = 201;
    public static final int PT_H261_FUR = 192;

    private InetAddress fromAddress;
    private Integer fromPort;
    private Long pt;
    private Long receptionReports;
    private Long senderSsrc;
    private Long packetsLost;
    private Long highestSequence;
    private Long sequenceNumberCycles;
    private Double lastSr;
    private Double rtt;
    private String report0sourcessrc;
    private Double report0dlsr;
    private String sentntp;
    private Integer sentpackets;
    private String uniqueid;
    private String channelstatedesc;
    private Integer reportcount;
    private Integer report0cumulativelost;
    private Integer report0highestsequence;
    private Integer report0fractionlost;
    private Integer report0iajitter;
    private String to;
    private String report0lsr;
    private String sentrtp;
    private Integer channelstate;
    private Integer sentoctets;
    private Integer priority;
    private String connectedlinename;
    private String ssrc;
    private Integer report0sequencenumbercycles;
    private String connectedlinenum;
    private String context;
    private String calleridnum;
    private String language;
    private String channel;
    private String calleridname;

    public RtcpReceivedEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the IP address the RTCP message has been received from.
     *
     * @return the IP address the RTCP message has been received from.
     */
    public InetAddress getFromAddress()
    {
        return fromAddress;
    }

    /**
     * Returns the port of the RTCP message has been received from.
     *
     * @return the port of the RTCP message has been received from.
     */
    public Integer getFromPort()
    {
        return fromPort;
    }

    public void setFrom(String from)
    {
        // Format is "%s:%d"
        this.fromAddress = stringToAddress(from);
        this.fromPort = stringToPort(from);
    }

    /**
     * Indicates the format of the payload, typical values are 200 for sender reports and
     * 201 for receiver reports.
     *
     * @return the format of the payload.
     * @see #PT_SENDER_REPORT
     * @see #PT_RECEIVER_REPORT
     */
    public Long getPt()
    {
        return pt;
    }

    public void setPt(String ptString)
    {
        // Format is "PT: %d(%s)"
        if (ptString == null || ptString.length() == 0)
        {
            this.pt = null;
            return;
        }

        if (ptString.indexOf('(') > 0)
        {
            this.pt = Long.parseLong(ptString.substring(0, ptString.indexOf('(')));
        }
        else
        {
            this.pt = Long.parseLong(ptString);
        }
    }

    public Long getReceptionReports()
    {
        return receptionReports;
    }

    public void setReceptionReports(Long receptionReports)
    {
        this.receptionReports = receptionReports;
    }

    /**
     * Returns the synchronization source identifier of the sender.
     *
     * @return the synchronization source identifier of the sender.
     */
    public Long getSenderSsrc()
    {
        return senderSsrc;
    }

    public void setSenderSsrc(Long senderSsrc)
    {
        this.senderSsrc = senderSsrc;
    }

    /**
     * Returns the number of packets lost so far.
     *
     * @return the number of packets lost.
     */
    public Long getPacketsLost()
    {
        return packetsLost;
    }

    public void setPacketsLost(Long packetsLost)
    {
        this.packetsLost = packetsLost;
    }

    public Long getHighestSequence()
    {
        return highestSequence;
    }

    public void setHighestSequence(Long highestSequence)
    {
        this.highestSequence = highestSequence;
    }

    public Long getSequenceNumberCycles()
    {
        return sequenceNumberCycles;
    }

    public void setSequenceNumberCycles(Long sequenceNumberCycles)
    {
        this.sequenceNumberCycles = sequenceNumberCycles;
    }

    public Double getLastSr()
    {
        return lastSr;
    }

    public void setLastSr(Double lastSr)
    {
        this.lastSr = lastSr;
    }

    /**
     * Returns the round trip time.
     *
     * @return the round trip time in seconds, may be <code>null</code>.
     */
    public Double getRtt()
    {
        return rtt;
    }

    public void setRtt(String rttString)
    {
        this.rtt = secStringToDouble(rttString);
    }

    public String getReport0sourcessrc() {
        return report0sourcessrc;
    }

    public void setReport0sourcessrc(String report0sourcessrc) {
        this.report0sourcessrc = report0sourcessrc;
    }

    public Double getReport0dlsr() {
        return report0dlsr;
    }

    public void setReport0dlsr(Double report0dlsr) {
        this.report0dlsr = report0dlsr;
    }

    public String getSentntp() {
        return sentntp;
    }

    public void setSentntp(String sentntp) {
        this.sentntp = sentntp;
    }

    public Integer getSentpackets() {
        return sentpackets;
    }

    public void setSentpackets(Integer sentpackets) {
        this.sentpackets = sentpackets;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    public String getChannelstatedesc() {
        return channelstatedesc;
    }

    public void setChannelstatedesc(String channelstatedesc) {
        this.channelstatedesc = channelstatedesc;
    }

    public Integer getReportcount() {
        return reportcount;
    }

    public void setReportcount(Integer reportcount) {
        this.reportcount = reportcount;
    }

    public Integer getReport0cumulativelost() {
        return report0cumulativelost;
    }

    public void setReport0cumulativelost(Integer report0cumulativelost) {
        this.report0cumulativelost = report0cumulativelost;
    }

    public Integer getReport0highestsequence() {
        return report0highestsequence;
    }

    public void setReport0highestsequence(Integer report0highestsequence) {
        this.report0highestsequence = report0highestsequence;
    }

    public Integer getReport0fractionlost() {
        return report0fractionlost;
    }

    public void setReport0fractionlost(Integer report0fractionlost) {
        this.report0fractionlost = report0fractionlost;
    }

    public Integer getReport0iajitter() {
        return report0iajitter;
    }

    public void setReport0iajitter(Integer report0iajitter) {
        this.report0iajitter = report0iajitter;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getReport0lsr() {
        return report0lsr;
    }

    public void setReport0lsr(String report0lsr) {
        this.report0lsr = report0lsr;
    }

    public String getSentrtp() {
        return sentrtp;
    }

    public void setSentrtp(String sentrtp) {
        this.sentrtp = sentrtp;
    }

    public Integer getChannelstate() {
        return channelstate;
    }

    public void setChannelstate(Integer channelstate) {
        this.channelstate = channelstate;
    }

    public Integer getSentoctets() {
        return sentoctets;
    }

    public void setSentoctets(Integer sentoctets) {
        this.sentoctets = sentoctets;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getConnectedlinename() {
        return connectedlinename;
    }

    public void setConnectedlinename(String connectedlinename) {
        this.connectedlinename = connectedlinename;
    }

    public String getSsrc() {
        return ssrc;
    }

    public void setSsrc(String ssrc) {
        this.ssrc = ssrc;
    }

    public Integer getReport0sequencenumbercycles() {
        return report0sequencenumbercycles;
    }

    public void setReport0sequencenumbercycles(Integer report0sequencenumbercycles) {
        this.report0sequencenumbercycles = report0sequencenumbercycles;
    }

    public String getConnectedlinenum() {
        return connectedlinenum;
    }

    public void setConnectedlinenum(String connectedlinenum) {
        this.connectedlinenum = connectedlinenum;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getCalleridnum() {
        return calleridnum;
    }

    public void setCalleridnum(String calleridnum) {
        this.calleridnum = calleridnum;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCalleridname() {
        return calleridname;
    }

    public void setCalleridname(String calleridname) {
        this.calleridname = calleridname;
    }
}
