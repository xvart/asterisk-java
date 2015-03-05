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
public class BridgeEnterEvent  extends ManagerEvent{
    /**
     * Serializable version identifier.
     */
    static final long serialVersionUID = 0L;
    
    private String bridgecreator;
    private String bridgename;
    private String bridgenumchannels;
    private String bridgetechnology;
    private String bridgetype;
    private String bridgeuniqueid;
    private String calleridname;
    private String calleridnum;
    private String channel;
    private String channelstate;
    private String channelstatedesc;
    private String connectedlinename;
    private String connectedlinenum;
    private String context;
    private String exten;
    private String language;
    private String priority;
    private String uniqueid;

    public BridgeEnterEvent(Object source) {
        super(source);
    }

    public String getBridgecreator() {
        return bridgecreator;
    }

    public void setBridgecreator(String bridgecreator) {
        this.bridgecreator = bridgecreator;
    }

    public String getBridgename() {
        return bridgename;
    }

    public void setBridgename(String bridgename) {
        this.bridgename = bridgename;
    }

    public String getBridgenumchannels() {
        return bridgenumchannels;
    }

    public void setBridgenumchannels(String bridgenumchannels) {
        this.bridgenumchannels = bridgenumchannels;
    }

    public String getBridgetechnology() {
        return bridgetechnology;
    }

    public void setBridgetechnology(String bridgetechnology) {
        this.bridgetechnology = bridgetechnology;
    }

    public String getBridgetype() {
        return bridgetype;
    }

    public void setBridgetype(String bridgetype) {
        this.bridgetype = bridgetype;
    }

    public String getBridgeuniqueid() {
        return bridgeuniqueid;
    }

    public void setBridgeuniqueid(String bridgeuniqueid) {
        this.bridgeuniqueid = bridgeuniqueid;
    }

    public String getCalleridname() {
        return calleridname;
    }

    public void setCalleridname(String calleridname) {
        this.calleridname = calleridname;
    }

    public String getCalleridnum() {
        return calleridnum;
    }

    public void setCalleridnum(String calleridnum) {
        this.calleridnum = calleridnum;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannelstate() {
        return channelstate;
    }

    public void setChannelstate(String channelstate) {
        this.channelstate = channelstate;
    }

    public String getChannelstatedesc() {
        return channelstatedesc;
    }

    public void setChannelstatedesc(String channelstatedesc) {
        this.channelstatedesc = channelstatedesc;
    }

    public String getConnectedlinename() {
        return connectedlinename;
    }

    public void setConnectedlinename(String connectedlinename) {
        this.connectedlinename = connectedlinename;
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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }
    
}
