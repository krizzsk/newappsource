package com.google.i18n.phonenumbers;

import java.io.Serializable;

public class Phonenumber$PhoneNumber implements Serializable {
    private static final long serialVersionUID = 1;
    private CountryCodeSource countryCodeSource_ = CountryCodeSource.UNSPECIFIED;
    private int countryCode_ = 0;
    private String extension_ = "";
    private boolean hasCountryCode;
    private boolean hasCountryCodeSource;
    private boolean hasExtension;
    private boolean hasItalianLeadingZero;
    private boolean hasNationalNumber;
    private boolean hasNumberOfLeadingZeros;
    private boolean hasPreferredDomesticCarrierCode;
    private boolean hasRawInput;
    private boolean italianLeadingZero_ = false;
    private long nationalNumber_ = 0;
    private int numberOfLeadingZeros_ = 1;
    private String preferredDomesticCarrierCode_ = "";
    private String rawInput_ = "";

    public enum CountryCodeSource {
        FROM_NUMBER_WITH_PLUS_SIGN,
        FROM_NUMBER_WITH_IDD,
        FROM_NUMBER_WITHOUT_PLUS_SIGN,
        FROM_DEFAULT_COUNTRY,
        UNSPECIFIED
    }

    /* renamed from: a */
    public final void mo43837a() {
        this.hasCountryCodeSource = false;
        this.countryCodeSource_ = CountryCodeSource.UNSPECIFIED;
    }

    /* renamed from: b */
    public final int mo43838b() {
        return this.countryCode_;
    }

    /* renamed from: c */
    public final CountryCodeSource mo43839c() {
        return this.countryCodeSource_;
    }

    /* renamed from: d */
    public final String mo43840d() {
        return this.extension_;
    }

    /* renamed from: e */
    public final long mo43841e() {
        return this.nationalNumber_;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Phonenumber$PhoneNumber)) {
            return false;
        }
        Phonenumber$PhoneNumber phonenumber$PhoneNumber = (Phonenumber$PhoneNumber) obj;
        if (phonenumber$PhoneNumber != null && (this == phonenumber$PhoneNumber || (this.countryCode_ == phonenumber$PhoneNumber.countryCode_ && this.nationalNumber_ == phonenumber$PhoneNumber.nationalNumber_ && this.extension_.equals(phonenumber$PhoneNumber.extension_) && this.italianLeadingZero_ == phonenumber$PhoneNumber.italianLeadingZero_ && this.numberOfLeadingZeros_ == phonenumber$PhoneNumber.numberOfLeadingZeros_ && this.rawInput_.equals(phonenumber$PhoneNumber.rawInput_) && this.countryCodeSource_ == phonenumber$PhoneNumber.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(phonenumber$PhoneNumber.preferredDomesticCarrierCode_) && this.hasPreferredDomesticCarrierCode == phonenumber$PhoneNumber.hasPreferredDomesticCarrierCode))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo43843f() {
        return this.numberOfLeadingZeros_;
    }

    /* renamed from: g */
    public final String mo43844g() {
        return this.rawInput_;
    }

    /* renamed from: h */
    public final boolean mo43845h() {
        return this.hasCountryCodeSource;
    }

    public final int hashCode() {
        int i;
        int hashCode = Long.valueOf(this.nationalNumber_).hashCode();
        int d = C13715c.m34238d(this.extension_, (hashCode + ((this.countryCode_ + 2173) * 53)) * 53, 53);
        int i2 = 1231;
        if (this.italianLeadingZero_) {
            i = 1231;
        } else {
            i = 1237;
        }
        int d2 = C13715c.m34238d(this.rawInput_, (((d + i) * 53) + this.numberOfLeadingZeros_) * 53, 53);
        int d3 = C13715c.m34238d(this.preferredDomesticCarrierCode_, (this.countryCodeSource_.hashCode() + d2) * 53, 53);
        if (!this.hasPreferredDomesticCarrierCode) {
            i2 = 1237;
        }
        return d3 + i2;
    }

    /* renamed from: i */
    public final boolean mo43847i() {
        return this.hasExtension;
    }

    /* renamed from: j */
    public final boolean mo43848j() {
        return this.hasRawInput;
    }

    /* renamed from: k */
    public final boolean mo43849k() {
        return this.italianLeadingZero_;
    }

    /* renamed from: l */
    public final void mo43850l(int i) {
        this.hasCountryCode = true;
        this.countryCode_ = i;
    }

    /* renamed from: m */
    public final void mo43851m(CountryCodeSource countryCodeSource) {
        countryCodeSource.getClass();
        this.hasCountryCodeSource = true;
        this.countryCodeSource_ = countryCodeSource;
    }

    /* renamed from: n */
    public final void mo43852n(String str) {
        this.hasExtension = true;
        this.extension_ = str;
    }

    /* renamed from: o */
    public final void mo43853o() {
        this.hasItalianLeadingZero = true;
        this.italianLeadingZero_ = true;
    }

    /* renamed from: p */
    public final void mo43854p(long j) {
        this.hasNationalNumber = true;
        this.nationalNumber_ = j;
    }

    /* renamed from: q */
    public final void mo43855q(int i) {
        this.hasNumberOfLeadingZeros = true;
        this.numberOfLeadingZeros_ = i;
    }

    /* renamed from: r */
    public final void mo43856r(String str) {
        str.getClass();
        this.hasPreferredDomesticCarrierCode = true;
        this.preferredDomesticCarrierCode_ = str;
    }

    /* renamed from: s */
    public final void mo43857s(String str) {
        this.hasRawInput = true;
        this.rawInput_ = str;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Country Code: ");
        k.append(this.countryCode_);
        k.append(" National Number: ");
        k.append(this.nationalNumber_);
        if (this.hasItalianLeadingZero && this.italianLeadingZero_) {
            k.append(" Leading Zero(s): true");
        }
        if (this.hasNumberOfLeadingZeros) {
            k.append(" Number of leading zeros: ");
            k.append(this.numberOfLeadingZeros_);
        }
        if (this.hasExtension) {
            k.append(" Extension: ");
            k.append(this.extension_);
        }
        if (this.hasCountryCodeSource) {
            k.append(" Country Code Source: ");
            k.append(this.countryCodeSource_);
        }
        if (this.hasPreferredDomesticCarrierCode) {
            k.append(" Preferred Domestic Carrier Code: ");
            k.append(this.preferredDomesticCarrierCode_);
        }
        return k.toString();
    }
}
