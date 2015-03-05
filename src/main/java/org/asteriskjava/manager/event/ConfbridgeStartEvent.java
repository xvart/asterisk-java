package org.asteriskjava.manager.event;

/**
 * This event is sent when the first user requests a conference and it is instantiated.
 *
 * @since 1.0.0
 */
public class ConfbridgeStartEvent extends ManagerEvent
{
    /**
     * Serializable version identifier
     */
    private static final long serialVersionUID = 1L;

    private String conference;
    private String bridgecreator;
    private String bridgename;	
    private String bridgetechnology;
    private String bridgetype;
    private Integer bridgenumchannels;
    private String bridgeuniqueid;

    
    

    public ConfbridgeStartEvent(Object source)
    {
        super(source);
    }

    /**
     * Sets the id of the conference started.
     *
     * @param conference the id of the conference started.
     */
    public void setConference(String conference)
    {
        this.conference = conference;
    }

    /**
     * Returns the id of the conference started.
     *
     * @return the id of the conference started.
     */
    public String getConference()
    {
        return conference;
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

    public Integer getBridgenumchannels() {
        return bridgenumchannels;
    }

    public void setBridgenumchannels(Integer bridgenumchannels) {
        this.bridgenumchannels = bridgenumchannels;
    }

    public String getBridgeuniqueid() {
        return bridgeuniqueid;
    }

    public void setBridgeuniqueid(String bridgeuniqueid) {
        this.bridgeuniqueid = bridgeuniqueid;
    }
}
