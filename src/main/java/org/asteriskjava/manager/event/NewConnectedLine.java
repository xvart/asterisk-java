/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.asteriskjava.manager.event;

/**
 *
 * @author marian
 */
public class NewConnectedLine extends AbstractChannelEvent {

    /**
     * Serializable version identifier.
     */
    private static final long serialVersionID = 1;

    /**
     * Variables
     */
    private String calleridname;
    private String channel;
    private String language;
    private String calleridnum;
    private String context;
    private String connectedlinenum;
    private String connectedlinename;
    private String privilege;
    private String exten;
    private String event;
    private String uniqueid;
    private String channelstatedesc;
    
    
    private Integer priority;
    private Integer channelstate;

    /**
     *
     * @param source
     */
    public NewConnectedLine(Object source) {
        super(source);
    }

    public String getCalleridname() {
        return calleridname;
    }

    public void setCalleridname(String calleridname) {
        this.calleridname = calleridname;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCalleridnum() {
        return calleridnum;
    }

    public void setCalleridnum(String calleridnum) {
        this.calleridnum = calleridnum;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getConnectedlinenum() {
        return connectedlinenum;
    }

    public void setConnectedlinenum(String connectedlinenum) {
        this.connectedlinenum = connectedlinenum;
    }

    public String getConnectedlinename() {
        return connectedlinename;
    }

    public void setConnectedlinename(String connectedlinename) {
        this.connectedlinename = connectedlinename;
    }

    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
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

}
