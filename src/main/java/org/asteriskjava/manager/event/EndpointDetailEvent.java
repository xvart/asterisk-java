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
 * EndpointDetailEvent, Provide details about an endpoint section.
 *
 * @author srt
 * @version $Id$
 * @since 0.2
 */
public class EndpointDetailEvent extends ManagerEvent {

    /**
     * Serializable version identifier.
     */
    private static final long serialVersionUID = 0L;
    
    private String ObjectType;
    private String ObjectName;
    private String Context;
    private String Disallow;
    private String Allow;
    private String DtmfMode;
    private String RtpIpv6;
    private String RtpSymmetric;
    private String IceSupport;
    private String UsePtime;
    private String ForceRport;
    private String RewriteContact;
    private String Transport;
    private String OutboundProxy;
    private String MohSuggest;
    // String 100rel ;
    private String Timers;
    private String TimersMinSe;
    private String TimersSessExpires;
    private String Auth;
    private String OutboundAuth;
    private String Aors;
    private String MediaAddress;
    private String IdentifyBy;
    private String DirectMedia;
    private String DirectMediaMethod;
    private String ConnectedLineMethod;
    private String DirectMediaGlareMitigation;
    private String DisableDirectMediaOnNat;
    private String Callerid;
    private String CalleridPrivacy;
    private String CalleridTag;
    private String TrustIdInbound;
    private String TrustIdOutbound;
    private String SendPai;
    private String SendRpid;
    private String SendDiversion;
    private String Mailboxes;
    private String AggregateMwi;
    private String MediaEncryption;
    private String MediaEncryptionOptimistic;
    private String UseAvpf;
    private String ForceAvp;
    private String MediaUseReceivedTransport;
    private String OneTouchRecording;
    private String InbandProgress;
    private String CallGroup;
    private String PickupGroup;
    private String NamedCallGroup;
    private String NamedPickupGroup;
    private String DeviceStateBusyAt;
    private String T38Udptl;
    private String T38UdptlEc;
    private String T38UdptlMaxdatagram;
    private String FaxDetect;
    private String T38UdptlNat;
    private String T38UdptlIpv6;
    private String ToneZone;
    private String Language;
    private String RecordOnFeature;
    private String RecordOffFeature;
    private String AllowTransfer;
    private String UserEqPhone;
    private String SdpOwner;
    private String SdpSession;
    private String TosAudio;
    private String TosVideo;
    private String CosAudio;
    private String CosVideo;
    private String AllowSubscribe;
    private String SubMinExpiry;
    private String FromUser;
    private String FromDomain;
    private String MwiFromUser;
    private String RtpEngine;
    private String DtlsVerify;
    private String DtlsRekey;
    private String DtlsCertFile;
    private String DtlsPrivateKey;
    private String DtlsCipher;
    private String DtlsCaFile;
    private String DtlsCaPath;
    private String DtlsSetup;
    private String SrtpTag32;
    private String RedirectMethod;
    private String SetVar;
    private String MessageContext;
    private String Accountcode;
    private String DeviceState;
    private String ActiveChannels;
    private String SubscribeContext;
    private String Allowoverlap;

    /**
     * Creates a new EndpointListEvent.
     *
     * @param source
     */
    public EndpointDetailEvent(Object source) {
        super(source);
    }

    public String getObjectType() {
        return ObjectType;
    }

    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    public String getObjectName() {
        return ObjectName;
    }

    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    public String getContext() {
        return Context;
    }

    public void setContext(String Context) {
        this.Context = Context;
    }

    public String getDisallow() {
        return Disallow;
    }

    public void setDisallow(String Disallow) {
        this.Disallow = Disallow;
    }

    public String getAllow() {
        return Allow;
    }

    public void setAllow(String Allow) {
        this.Allow = Allow;
    }

    public String getDtmfMode() {
        return DtmfMode;
    }

    public void setDtmfMode(String DtmfMode) {
        this.DtmfMode = DtmfMode;
    }

    public String getRtpIpv6() {
        return RtpIpv6;
    }

    public void setRtpIpv6(String RtpIpv6) {
        this.RtpIpv6 = RtpIpv6;
    }

    public String getRtpSymmetric() {
        return RtpSymmetric;
    }

    public void setRtpSymmetric(String RtpSymmetric) {
        this.RtpSymmetric = RtpSymmetric;
    }

    public String getIceSupport() {
        return IceSupport;
    }

    public void setIceSupport(String IceSupport) {
        this.IceSupport = IceSupport;
    }

    public String getUsePtime() {
        return UsePtime;
    }

    public void setUsePtime(String UsePtime) {
        this.UsePtime = UsePtime;
    }

    public String getForceRport() {
        return ForceRport;
    }

    public void setForceRport(String ForceRport) {
        this.ForceRport = ForceRport;
    }

    public String getRewriteContact() {
        return RewriteContact;
    }

    public void setRewriteContact(String RewriteContact) {
        this.RewriteContact = RewriteContact;
    }

    public String getTransport() {
        return Transport;
    }

    public void setTransport(String Transport) {
        this.Transport = Transport;
    }

    public String getOutboundProxy() {
        return OutboundProxy;
    }

    public void setOutboundProxy(String OutboundProxy) {
        this.OutboundProxy = OutboundProxy;
    }

    public String getMohSuggest() {
        return MohSuggest;
    }

    public void setMohSuggest(String MohSuggest) {
        this.MohSuggest = MohSuggest;
    }

    public String getTimers() {
        return Timers;
    }

    public void setTimers(String Timers) {
        this.Timers = Timers;
    }

    public String getTimersMinSe() {
        return TimersMinSe;
    }

    public void setTimersMinSe(String TimersMinSe) {
        this.TimersMinSe = TimersMinSe;
    }

    public String getTimersSessExpires() {
        return TimersSessExpires;
    }

    public void setTimersSessExpires(String TimersSessExpires) {
        this.TimersSessExpires = TimersSessExpires;
    }

    public String getAuth() {
        return Auth;
    }

    public void setAuth(String Auth) {
        this.Auth = Auth;
    }

    public String getOutboundAuth() {
        return OutboundAuth;
    }

    public void setOutboundAuth(String OutboundAuth) {
        this.OutboundAuth = OutboundAuth;
    }

    public String getAors() {
        return Aors;
    }

    public void setAors(String Aors) {
        this.Aors = Aors;
    }

    public String getMediaAddress() {
        return MediaAddress;
    }

    public void setMediaAddress(String MediaAddress) {
        this.MediaAddress = MediaAddress;
    }

    public String getIdentifyBy() {
        return IdentifyBy;
    }

    public void setIdentifyBy(String IdentifyBy) {
        this.IdentifyBy = IdentifyBy;
    }

    public String getDirectMedia() {
        return DirectMedia;
    }

    public void setDirectMedia(String DirectMedia) {
        this.DirectMedia = DirectMedia;
    }

    public String getDirectMediaMethod() {
        return DirectMediaMethod;
    }

    public void setDirectMediaMethod(String DirectMediaMethod) {
        this.DirectMediaMethod = DirectMediaMethod;
    }

    public String getConnectedLineMethod() {
        return ConnectedLineMethod;
    }

    public void setConnectedLineMethod(String ConnectedLineMethod) {
        this.ConnectedLineMethod = ConnectedLineMethod;
    }

    public String getDirectMediaGlareMitigation() {
        return DirectMediaGlareMitigation;
    }

    public void setDirectMediaGlareMitigation(String DirectMediaGlareMitigation) {
        this.DirectMediaGlareMitigation = DirectMediaGlareMitigation;
    }

    public String getDisableDirectMediaOnNat() {
        return DisableDirectMediaOnNat;
    }

    public void setDisableDirectMediaOnNat(String DisableDirectMediaOnNat) {
        this.DisableDirectMediaOnNat = DisableDirectMediaOnNat;
    }

    public String getCallerid() {
        return Callerid;
    }

    public void setCallerid(String Callerid) {
        this.Callerid = Callerid;
    }

    public String getCalleridPrivacy() {
        return CalleridPrivacy;
    }

    public void setCalleridPrivacy(String CalleridPrivacy) {
        this.CalleridPrivacy = CalleridPrivacy;
    }

    public String getCalleridTag() {
        return CalleridTag;
    }

    public void setCalleridTag(String CalleridTag) {
        this.CalleridTag = CalleridTag;
    }

    public String getTrustIdInbound() {
        return TrustIdInbound;
    }

    public void setTrustIdInbound(String TrustIdInbound) {
        this.TrustIdInbound = TrustIdInbound;
    }

    public String getTrustIdOutbound() {
        return TrustIdOutbound;
    }

    public void setTrustIdOutbound(String TrustIdOutbound) {
        this.TrustIdOutbound = TrustIdOutbound;
    }

    public String getSendPai() {
        return SendPai;
    }

    public void setSendPai(String SendPai) {
        this.SendPai = SendPai;
    }

    public String getSendRpid() {
        return SendRpid;
    }

    public void setSendRpid(String SendRpid) {
        this.SendRpid = SendRpid;
    }

    public String getSendDiversion() {
        return SendDiversion;
    }

    public void setSendDiversion(String SendDiversion) {
        this.SendDiversion = SendDiversion;
    }

    public String getMailboxes() {
        return Mailboxes;
    }

    public void setMailboxes(String Mailboxes) {
        this.Mailboxes = Mailboxes;
    }

    public String getAggregateMwi() {
        return AggregateMwi;
    }

    public void setAggregateMwi(String AggregateMwi) {
        this.AggregateMwi = AggregateMwi;
    }

    public String getMediaEncryption() {
        return MediaEncryption;
    }

    public void setMediaEncryption(String MediaEncryption) {
        this.MediaEncryption = MediaEncryption;
    }

    public String getMediaEncryptionOptimistic() {
        return MediaEncryptionOptimistic;
    }

    public void setMediaEncryptionOptimistic(String MediaEncryptionOptimistic) {
        this.MediaEncryptionOptimistic = MediaEncryptionOptimistic;
    }

    public String getUseAvpf() {
        return UseAvpf;
    }

    public void setUseAvpf(String UseAvpf) {
        this.UseAvpf = UseAvpf;
    }

    public String getForceAvp() {
        return ForceAvp;
    }

    public void setForceAvp(String ForceAvp) {
        this.ForceAvp = ForceAvp;
    }

    public String getMediaUseReceivedTransport() {
        return MediaUseReceivedTransport;
    }

    public void setMediaUseReceivedTransport(String MediaUseReceivedTransport) {
        this.MediaUseReceivedTransport = MediaUseReceivedTransport;
    }

    public String getOneTouchRecording() {
        return OneTouchRecording;
    }

    public void setOneTouchRecording(String OneTouchRecording) {
        this.OneTouchRecording = OneTouchRecording;
    }

    public String getInbandProgress() {
        return InbandProgress;
    }

    public void setInbandProgress(String InbandProgress) {
        this.InbandProgress = InbandProgress;
    }

    public String getCallGroup() {
        return CallGroup;
    }

    public void setCallGroup(String CallGroup) {
        this.CallGroup = CallGroup;
    }

    public String getPickupGroup() {
        return PickupGroup;
    }

    public void setPickupGroup(String PickupGroup) {
        this.PickupGroup = PickupGroup;
    }

    public String getNamedCallGroup() {
        return NamedCallGroup;
    }

    public void setNamedCallGroup(String NamedCallGroup) {
        this.NamedCallGroup = NamedCallGroup;
    }

    public String getNamedPickupGroup() {
        return NamedPickupGroup;
    }

    public void setNamedPickupGroup(String NamedPickupGroup) {
        this.NamedPickupGroup = NamedPickupGroup;
    }

    public String getDeviceStateBusyAt() {
        return DeviceStateBusyAt;
    }

    public void setDeviceStateBusyAt(String DeviceStateBusyAt) {
        this.DeviceStateBusyAt = DeviceStateBusyAt;
    }

    public String getT38Udptl() {
        return T38Udptl;
    }

    public void setT38Udptl(String T38Udptl) {
        this.T38Udptl = T38Udptl;
    }

    public String getT38UdptlEc() {
        return T38UdptlEc;
    }

    public void setT38UdptlEc(String T38UdptlEc) {
        this.T38UdptlEc = T38UdptlEc;
    }

    public String getT38UdptlMaxdatagram() {
        return T38UdptlMaxdatagram;
    }

    public void setT38UdptlMaxdatagram(String T38UdptlMaxdatagram) {
        this.T38UdptlMaxdatagram = T38UdptlMaxdatagram;
    }

    public String getFaxDetect() {
        return FaxDetect;
    }

    public void setFaxDetect(String FaxDetect) {
        this.FaxDetect = FaxDetect;
    }

    public String getT38UdptlNat() {
        return T38UdptlNat;
    }

    public void setT38UdptlNat(String T38UdptlNat) {
        this.T38UdptlNat = T38UdptlNat;
    }

    public String getT38UdptlIpv6() {
        return T38UdptlIpv6;
    }

    public void setT38UdptlIpv6(String T38UdptlIpv6) {
        this.T38UdptlIpv6 = T38UdptlIpv6;
    }

    public String getToneZone() {
        return ToneZone;
    }

    public void setToneZone(String ToneZone) {
        this.ToneZone = ToneZone;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public String getRecordOnFeature() {
        return RecordOnFeature;
    }

    public void setRecordOnFeature(String RecordOnFeature) {
        this.RecordOnFeature = RecordOnFeature;
    }

    public String getRecordOffFeature() {
        return RecordOffFeature;
    }

    public void setRecordOffFeature(String RecordOffFeature) {
        this.RecordOffFeature = RecordOffFeature;
    }

    public String getAllowTransfer() {
        return AllowTransfer;
    }

    public void setAllowTransfer(String AllowTransfer) {
        this.AllowTransfer = AllowTransfer;
    }

    public String getUserEqPhone() {
        return UserEqPhone;
    }

    public void setUserEqPhone(String UserEqPhone) {
        this.UserEqPhone = UserEqPhone;
    }

    public String getSdpOwner() {
        return SdpOwner;
    }

    public void setSdpOwner(String SdpOwner) {
        this.SdpOwner = SdpOwner;
    }

    public String getSdpSession() {
        return SdpSession;
    }

    public void setSdpSession(String SdpSession) {
        this.SdpSession = SdpSession;
    }

    public String getTosAudio() {
        return TosAudio;
    }

    public void setTosAudio(String TosAudio) {
        this.TosAudio = TosAudio;
    }

    public String getTosVideo() {
        return TosVideo;
    }

    public void setTosVideo(String TosVideo) {
        this.TosVideo = TosVideo;
    }

    public String getCosAudio() {
        return CosAudio;
    }

    public void setCosAudio(String CosAudio) {
        this.CosAudio = CosAudio;
    }

    public String getCosVideo() {
        return CosVideo;
    }

    public void setCosVideo(String CosVideo) {
        this.CosVideo = CosVideo;
    }

    public String getAllowSubscribe() {
        return AllowSubscribe;
    }

    public void setAllowSubscribe(String AllowSubscribe) {
        this.AllowSubscribe = AllowSubscribe;
    }

    public String getSubMinExpiry() {
        return SubMinExpiry;
    }

    public void setSubMinExpiry(String SubMinExpiry) {
        this.SubMinExpiry = SubMinExpiry;
    }

    public String getFromUser() {
        return FromUser;
    }

    public void setFromUser(String FromUser) {
        this.FromUser = FromUser;
    }

    public String getFromDomain() {
        return FromDomain;
    }

    public void setFromDomain(String FromDomain) {
        this.FromDomain = FromDomain;
    }

    public String getMwiFromUser() {
        return MwiFromUser;
    }

    public void setMwiFromUser(String MwiFromUser) {
        this.MwiFromUser = MwiFromUser;
    }

    public String getRtpEngine() {
        return RtpEngine;
    }

    public void setRtpEngine(String RtpEngine) {
        this.RtpEngine = RtpEngine;
    }

    public String getDtlsVerify() {
        return DtlsVerify;
    }

    public void setDtlsVerify(String DtlsVerify) {
        this.DtlsVerify = DtlsVerify;
    }

    public String getDtlsRekey() {
        return DtlsRekey;
    }

    public void setDtlsRekey(String DtlsRekey) {
        this.DtlsRekey = DtlsRekey;
    }

    public String getDtlsCertFile() {
        return DtlsCertFile;
    }

    public void setDtlsCertFile(String DtlsCertFile) {
        this.DtlsCertFile = DtlsCertFile;
    }

    public String getDtlsPrivateKey() {
        return DtlsPrivateKey;
    }

    public void setDtlsPrivateKey(String DtlsPrivateKey) {
        this.DtlsPrivateKey = DtlsPrivateKey;
    }

    public String getDtlsCipher() {
        return DtlsCipher;
    }

    public void setDtlsCipher(String DtlsCipher) {
        this.DtlsCipher = DtlsCipher;
    }

    public String getDtlsCaFile() {
        return DtlsCaFile;
    }

    public void setDtlsCaFile(String DtlsCaFile) {
        this.DtlsCaFile = DtlsCaFile;
    }

    public String getDtlsCaPath() {
        return DtlsCaPath;
    }

    public void setDtlsCaPath(String DtlsCaPath) {
        this.DtlsCaPath = DtlsCaPath;
    }

    public String getDtlsSetup() {
        return DtlsSetup;
    }

    public void setDtlsSetup(String DtlsSetup) {
        this.DtlsSetup = DtlsSetup;
    }

    public String getSrtpTag32() {
        return SrtpTag32;
    }

    public void setSrtpTag32(String SrtpTag32) {
        this.SrtpTag32 = SrtpTag32;
    }

    public String getRedirectMethod() {
        return RedirectMethod;
    }

    public void setRedirectMethod(String RedirectMethod) {
        this.RedirectMethod = RedirectMethod;
    }

    public String getSetVar() {
        return SetVar;
    }

    public void setSetVar(String SetVar) {
        this.SetVar = SetVar;
    }

    public String getMessageContext() {
        return MessageContext;
    }

    public void setMessageContext(String MessageContext) {
        this.MessageContext = MessageContext;
    }

    public String getAccountcode() {
        return Accountcode;
    }

    public void setAccountcode(String Accountcode) {
        this.Accountcode = Accountcode;
    }

    public String getDeviceState() {
        return DeviceState;
    }

    public void setDeviceState(String DeviceState) {
        this.DeviceState = DeviceState;
    }

    public String getActiveChannels() {
        return ActiveChannels;
    }

    public void setActiveChannels(String ActiveChannels) {
        this.ActiveChannels = ActiveChannels;
    }

    public String getSubscribeContext() {
        return SubscribeContext;
    }

    public void setSubscribeContext(String SubscribeContext) {
        this.SubscribeContext = SubscribeContext;
    }

    public String getAllowoverlap() {
        return Allowoverlap;
    }

    public void setAllowoverlap(String Allowoverlap) {
        this.Allowoverlap = Allowoverlap;
    }

}
