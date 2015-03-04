package org.asteriskjava.manager.event;

/**
 * This event is sent when a user joins a conference - either one already in progress or as the first user to
 * join a newly instantiated bridge.
 *
 * @since 1.0.0
 */
public class ConfbridgeJoinEvent extends AbstractChannelEvent
{
    /**
     * Serializable version identifier
     */
    private static final long serialVersionUID = 1L;
    private String conference;
    private String language;
    private String context;
    private String bridgetechnology;
    private String connectedlinenum;
    private String bridgetype;
    private String connectedlinename;
    private Integer priority;
    private Integer channelstate;
    private String bridgeuniqueid;
    private String admin;
    private String exten;
    private String channelstatedesc;
    private Integer bridgenumchannels;
    private String bridgecreator;
    private String bridgename;
    

    public ConfbridgeJoinEvent(Object source)
    {
        super(source);
    }

    /**
     * Sets the id of the conference the participant joined.
     *
     * @param conference id of the conference the participant joined.
     */
    public void setConference(String conference)
    {
        this.conference = conference;
    }

    /**
     * Returns the id of the conference the participant joined.
     *
     * @return id of the conference the participant joined.
     */
    public String getConference()
    {
        return conference;
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

    public String getBridgetechnology() {
        return bridgetechnology;
    }

    public void setBridgetechnology(String bridgetechnology) {
        this.bridgetechnology = bridgetechnology;
    }

    public String getConnectedlinenum() {
        return connectedlinenum;
    }

    public void setConnectedlinenum(String connectedlinenum) {
        this.connectedlinenum = connectedlinenum;
    }

    public String getBridgetype() {
        return bridgetype;
    }

    public void setBridgetype(String bridgetype) {
        this.bridgetype = bridgetype;
    }

    public String getConnectedlinename() {
        return connectedlinename;
    }

    public void setConnectedlinename(String connectedlinename) {
        this.connectedlinename = connectedlinename;
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

    public String getBridgeuniqueid() {
        return bridgeuniqueid;
    }

    public void setBridgeuniqueid(String bridgeuniqueid) {
        this.bridgeuniqueid = bridgeuniqueid;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
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

    public Integer getBridgenumchannels() {
        return bridgenumchannels;
    }

    public void setBridgenumchannels(Integer bridgenumchannels) {
        this.bridgenumchannels = bridgenumchannels;
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
}
