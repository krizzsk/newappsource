package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class Phonemetadata$PhoneMetadata implements Externalizable {
    private static final long serialVersionUID = 1;
    private Phonemetadata$PhoneNumberDesc carrierSpecific_ = null;
    private int countryCode_ = 0;
    private Phonemetadata$PhoneNumberDesc emergency_ = null;
    private Phonemetadata$PhoneNumberDesc fixedLine_ = null;
    private Phonemetadata$PhoneNumberDesc generalDesc_ = null;
    private boolean hasCarrierSpecific;
    private boolean hasCountryCode;
    private boolean hasEmergency;
    private boolean hasFixedLine;
    private boolean hasGeneralDesc;
    private boolean hasId;
    private boolean hasInternationalPrefix;
    private boolean hasLeadingDigits;
    private boolean hasLeadingZeroPossible;
    private boolean hasMainCountryForCode;
    private boolean hasMobile;
    private boolean hasMobileNumberPortableRegion;
    private boolean hasNationalPrefix;
    private boolean hasNationalPrefixForParsing;
    private boolean hasNationalPrefixTransformRule;
    private boolean hasNoInternationalDialling;
    private boolean hasPager;
    private boolean hasPersonalNumber;
    private boolean hasPreferredExtnPrefix;
    private boolean hasPreferredInternationalPrefix;
    private boolean hasPremiumRate;
    private boolean hasSameMobileAndFixedLinePattern;
    private boolean hasSharedCost;
    private boolean hasShortCode;
    private boolean hasSmsServices;
    private boolean hasStandardRate;
    private boolean hasTollFree;
    private boolean hasUan;
    private boolean hasVoicemail;
    private boolean hasVoip;
    private String id_ = "";
    private String internationalPrefix_ = "";
    private List<Phonemetadata$NumberFormat> intlNumberFormat_ = new ArrayList();
    private String leadingDigits_ = "";
    private boolean leadingZeroPossible_ = false;
    private boolean mainCountryForCode_ = false;
    private boolean mobileNumberPortableRegion_ = false;
    private Phonemetadata$PhoneNumberDesc mobile_ = null;
    private String nationalPrefixForParsing_ = "";
    private String nationalPrefixTransformRule_ = "";
    private String nationalPrefix_ = "";
    private Phonemetadata$PhoneNumberDesc noInternationalDialling_ = null;
    private List<Phonemetadata$NumberFormat> numberFormat_ = new ArrayList();
    private Phonemetadata$PhoneNumberDesc pager_ = null;
    private Phonemetadata$PhoneNumberDesc personalNumber_ = null;
    private String preferredExtnPrefix_ = "";
    private String preferredInternationalPrefix_ = "";
    private Phonemetadata$PhoneNumberDesc premiumRate_ = null;
    private boolean sameMobileAndFixedLinePattern_ = false;
    private Phonemetadata$PhoneNumberDesc sharedCost_ = null;
    private Phonemetadata$PhoneNumberDesc shortCode_ = null;
    private Phonemetadata$PhoneNumberDesc smsServices_ = null;
    private Phonemetadata$PhoneNumberDesc standardRate_ = null;
    private Phonemetadata$PhoneNumberDesc tollFree_ = null;
    private Phonemetadata$PhoneNumberDesc uan_ = null;
    private Phonemetadata$PhoneNumberDesc voicemail_ = null;
    private Phonemetadata$PhoneNumberDesc voip_ = null;

    public static final class Builder extends Phonemetadata$PhoneMetadata {
        /* renamed from: B */
        public final void mo43793B(String str) {
            Phonemetadata$PhoneMetadata.super.mo43793B(str);
        }

        /* renamed from: C */
        public final void mo43794C(String str) {
            Phonemetadata$PhoneMetadata.super.mo43794C(str);
        }

        /* renamed from: D */
        public final void mo43823D() {
            Phonemetadata$PhoneMetadata.super.mo43793B("<ignored>");
        }

        /* renamed from: E */
        public final void mo43824E() {
            Phonemetadata$PhoneMetadata.super.mo43794C("NA");
        }
    }

    /* renamed from: A */
    public final boolean mo43792A() {
        return this.hasPreferredInternationalPrefix;
    }

    /* renamed from: B */
    public void mo43793B(String str) {
        this.hasId = true;
        this.id_ = str;
    }

    /* renamed from: C */
    public void mo43794C(String str) {
        this.hasInternationalPrefix = true;
        this.internationalPrefix_ = str;
    }

    /* renamed from: a */
    public final int mo43795a() {
        return this.countryCode_;
    }

    /* renamed from: b */
    public final Phonemetadata$PhoneNumberDesc mo43796b() {
        return this.fixedLine_;
    }

    /* renamed from: c */
    public final Phonemetadata$PhoneNumberDesc mo43797c() {
        return this.generalDesc_;
    }

    /* renamed from: d */
    public final String mo43798d() {
        return this.internationalPrefix_;
    }

    /* renamed from: e */
    public final int mo43799e() {
        return this.intlNumberFormat_.size();
    }

    /* renamed from: f */
    public final List<Phonemetadata$NumberFormat> mo43800f() {
        return this.intlNumberFormat_;
    }

    /* renamed from: g */
    public final String mo43801g() {
        return this.leadingDigits_;
    }

    /* renamed from: h */
    public final Phonemetadata$PhoneNumberDesc mo43802h() {
        return this.mobile_;
    }

    /* renamed from: i */
    public final String mo43803i() {
        return this.nationalPrefix_;
    }

    /* renamed from: j */
    public final String mo43804j() {
        return this.nationalPrefixForParsing_;
    }

    /* renamed from: k */
    public final String mo43805k() {
        return this.nationalPrefixTransformRule_;
    }

    /* renamed from: l */
    public final List<Phonemetadata$NumberFormat> mo43806l() {
        return this.numberFormat_;
    }

    /* renamed from: m */
    public final Phonemetadata$PhoneNumberDesc mo43807m() {
        return this.pager_;
    }

    /* renamed from: n */
    public final Phonemetadata$PhoneNumberDesc mo43808n() {
        return this.personalNumber_;
    }

    /* renamed from: o */
    public final String mo43809o() {
        return this.preferredExtnPrefix_;
    }

    /* renamed from: p */
    public final String mo43810p() {
        return this.preferredInternationalPrefix_;
    }

    /* renamed from: q */
    public final Phonemetadata$PhoneNumberDesc mo43811q() {
        return this.premiumRate_;
    }

    /* renamed from: r */
    public final boolean mo43812r() {
        return this.sameMobileAndFixedLinePattern_;
    }

    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc.readExternal(objectInput);
            this.hasGeneralDesc = true;
            this.generalDesc_ = phonemetadata$PhoneNumberDesc;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc2 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc2.readExternal(objectInput);
            this.hasFixedLine = true;
            this.fixedLine_ = phonemetadata$PhoneNumberDesc2;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc3 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc3.readExternal(objectInput);
            this.hasMobile = true;
            this.mobile_ = phonemetadata$PhoneNumberDesc3;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc4 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc4.readExternal(objectInput);
            this.hasTollFree = true;
            this.tollFree_ = phonemetadata$PhoneNumberDesc4;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc5 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc5.readExternal(objectInput);
            this.hasPremiumRate = true;
            this.premiumRate_ = phonemetadata$PhoneNumberDesc5;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc6 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc6.readExternal(objectInput);
            this.hasSharedCost = true;
            this.sharedCost_ = phonemetadata$PhoneNumberDesc6;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc7 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc7.readExternal(objectInput);
            this.hasPersonalNumber = true;
            this.personalNumber_ = phonemetadata$PhoneNumberDesc7;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc8 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc8.readExternal(objectInput);
            this.hasVoip = true;
            this.voip_ = phonemetadata$PhoneNumberDesc8;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc9 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc9.readExternal(objectInput);
            this.hasPager = true;
            this.pager_ = phonemetadata$PhoneNumberDesc9;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc10 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc10.readExternal(objectInput);
            this.hasUan = true;
            this.uan_ = phonemetadata$PhoneNumberDesc10;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc11 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc11.readExternal(objectInput);
            this.hasEmergency = true;
            this.emergency_ = phonemetadata$PhoneNumberDesc11;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc12 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc12.readExternal(objectInput);
            this.hasVoicemail = true;
            this.voicemail_ = phonemetadata$PhoneNumberDesc12;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc13 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc13.readExternal(objectInput);
            this.hasShortCode = true;
            this.shortCode_ = phonemetadata$PhoneNumberDesc13;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc14 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc14.readExternal(objectInput);
            this.hasStandardRate = true;
            this.standardRate_ = phonemetadata$PhoneNumberDesc14;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc15 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc15.readExternal(objectInput);
            this.hasCarrierSpecific = true;
            this.carrierSpecific_ = phonemetadata$PhoneNumberDesc15;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc16 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc16.readExternal(objectInput);
            this.hasSmsServices = true;
            this.smsServices_ = phonemetadata$PhoneNumberDesc16;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc17 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc17.readExternal(objectInput);
            this.hasNoInternationalDialling = true;
            this.noInternationalDialling_ = phonemetadata$PhoneNumberDesc17;
        }
        mo43793B(objectInput.readUTF());
        int readInt = objectInput.readInt();
        this.hasCountryCode = true;
        this.countryCode_ = readInt;
        mo43794C(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.hasPreferredInternationalPrefix = true;
            this.preferredInternationalPrefix_ = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.hasNationalPrefix = true;
            this.nationalPrefix_ = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.hasPreferredExtnPrefix = true;
            this.preferredExtnPrefix_ = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.hasNationalPrefixForParsing = true;
            this.nationalPrefixForParsing_ = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.hasNationalPrefixTransformRule = true;
            this.nationalPrefixTransformRule_ = readUTF5;
        }
        boolean readBoolean = objectInput.readBoolean();
        this.hasSameMobileAndFixedLinePattern = true;
        this.sameMobileAndFixedLinePattern_ = readBoolean;
        int readInt2 = objectInput.readInt();
        for (int i = 0; i < readInt2; i++) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = new Phonemetadata$NumberFormat();
            phonemetadata$NumberFormat.readExternal(objectInput);
            this.numberFormat_.add(phonemetadata$NumberFormat);
        }
        int readInt3 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt3; i2++) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat2 = new Phonemetadata$NumberFormat();
            phonemetadata$NumberFormat2.readExternal(objectInput);
            this.intlNumberFormat_.add(phonemetadata$NumberFormat2);
        }
        boolean readBoolean2 = objectInput.readBoolean();
        this.hasMainCountryForCode = true;
        this.mainCountryForCode_ = readBoolean2;
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.hasLeadingDigits = true;
            this.leadingDigits_ = readUTF6;
        }
        boolean readBoolean3 = objectInput.readBoolean();
        this.hasLeadingZeroPossible = true;
        this.leadingZeroPossible_ = readBoolean3;
        boolean readBoolean4 = objectInput.readBoolean();
        this.hasMobileNumberPortableRegion = true;
        this.mobileNumberPortableRegion_ = readBoolean4;
    }

    /* renamed from: s */
    public final Phonemetadata$PhoneNumberDesc mo43814s() {
        return this.sharedCost_;
    }

    /* renamed from: t */
    public final Phonemetadata$PhoneNumberDesc mo43815t() {
        return this.tollFree_;
    }

    /* renamed from: u */
    public final Phonemetadata$PhoneNumberDesc mo43816u() {
        return this.uan_;
    }

    /* renamed from: v */
    public final Phonemetadata$PhoneNumberDesc mo43817v() {
        return this.voicemail_;
    }

    /* renamed from: w */
    public final Phonemetadata$PhoneNumberDesc mo43818w() {
        return this.voip_;
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.hasGeneralDesc);
        if (this.hasGeneralDesc) {
            this.generalDesc_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasFixedLine);
        if (this.hasFixedLine) {
            this.fixedLine_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasMobile);
        if (this.hasMobile) {
            this.mobile_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasTollFree);
        if (this.hasTollFree) {
            this.tollFree_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPremiumRate);
        if (this.hasPremiumRate) {
            this.premiumRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasSharedCost);
        if (this.hasSharedCost) {
            this.sharedCost_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPersonalNumber);
        if (this.hasPersonalNumber) {
            this.personalNumber_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoip);
        if (this.hasVoip) {
            this.voip_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPager);
        if (this.hasPager) {
            this.pager_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasUan);
        if (this.hasUan) {
            this.uan_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasEmergency);
        if (this.hasEmergency) {
            this.emergency_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoicemail);
        if (this.hasVoicemail) {
            this.voicemail_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasShortCode);
        if (this.hasShortCode) {
            this.shortCode_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasStandardRate);
        if (this.hasStandardRate) {
            this.standardRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasCarrierSpecific);
        if (this.hasCarrierSpecific) {
            this.carrierSpecific_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasSmsServices);
        if (this.hasSmsServices) {
            this.smsServices_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasNoInternationalDialling);
        if (this.hasNoInternationalDialling) {
            this.noInternationalDialling_.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.id_);
        objectOutput.writeInt(this.countryCode_);
        objectOutput.writeUTF(this.internationalPrefix_);
        objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
        if (this.hasPreferredInternationalPrefix) {
            objectOutput.writeUTF(this.preferredInternationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefix);
        if (this.hasNationalPrefix) {
            objectOutput.writeUTF(this.nationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
        if (this.hasPreferredExtnPrefix) {
            objectOutput.writeUTF(this.preferredExtnPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
        if (this.hasNationalPrefixForParsing) {
            objectOutput.writeUTF(this.nationalPrefixForParsing_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
        if (this.hasNationalPrefixTransformRule) {
            objectOutput.writeUTF(this.nationalPrefixTransformRule_);
        }
        objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
        int size = this.numberFormat_.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.numberFormat_.get(i).writeExternal(objectOutput);
        }
        int e = mo43799e();
        objectOutput.writeInt(e);
        for (int i2 = 0; i2 < e; i2++) {
            this.intlNumberFormat_.get(i2).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.mainCountryForCode_);
        objectOutput.writeBoolean(this.hasLeadingDigits);
        if (this.hasLeadingDigits) {
            objectOutput.writeUTF(this.leadingDigits_);
        }
        objectOutput.writeBoolean(this.leadingZeroPossible_);
        objectOutput.writeBoolean(this.mobileNumberPortableRegion_);
    }

    /* renamed from: x */
    public final boolean mo43820x() {
        return this.hasLeadingDigits;
    }

    /* renamed from: y */
    public final boolean mo43821y() {
        return this.hasNationalPrefixForParsing;
    }

    /* renamed from: z */
    public final boolean mo43822z() {
        return this.hasPreferredExtnPrefix;
    }
}
