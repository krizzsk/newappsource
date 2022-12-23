package com.fyber.inneractive.sdk.external;

public class ImpressionData {

    /* renamed from: a */
    public Pricing f9476a = new Pricing();

    /* renamed from: b */
    public Video f9477b;

    /* renamed from: c */
    public String f9478c;

    /* renamed from: d */
    public Long f9479d;

    /* renamed from: e */
    public String f9480e;

    /* renamed from: f */
    public String f9481f;

    /* renamed from: g */
    public String f9482g;

    /* renamed from: h */
    public String f9483h;

    /* renamed from: i */
    public String f9484i;

    public static class Pricing {

        /* renamed from: a */
        public double f9485a;

        /* renamed from: b */
        public String f9486b;

        public String getCurrency() {
            return this.f9486b;
        }

        public double getValue() {
            return this.f9485a;
        }

        public void setValue(double d) {
            this.f9485a = d;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Pricing{value=");
            k.append(this.f9485a);
            k.append(", currency='");
            k.append(this.f9486b);
            k.append('\'');
            k.append('}');
            return k.toString();
        }
    }

    public static class Video {

        /* renamed from: a */
        public boolean f9487a;

        /* renamed from: b */
        public long f9488b;

        public Video(boolean z, long j) {
            this.f9487a = z;
            this.f9488b = j;
        }

        public long getDuration() {
            return this.f9488b;
        }

        public boolean isSkippable() {
            return this.f9487a;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Video{skippable=");
            k.append(this.f9487a);
            k.append(", duration=");
            k.append(this.f9488b);
            k.append('}');
            return k.toString();
        }
    }

    public String getAdvertiserDomain() {
        return this.f9484i;
    }

    public String getCampaignId() {
        return this.f9483h;
    }

    public String getCountry() {
        return this.f9480e;
    }

    public String getCreativeId() {
        return this.f9482g;
    }

    public Long getDemandId() {
        return this.f9479d;
    }

    public String getDemandSource() {
        return this.f9478c;
    }

    public String getImpressionId() {
        return this.f9481f;
    }

    public Pricing getPricing() {
        return this.f9476a;
    }

    public Video getVideo() {
        return this.f9477b;
    }

    public void setAdvertiserDomain(String str) {
        this.f9484i = str;
    }

    public void setCampaignId(String str) {
        this.f9483h = str;
    }

    public void setCountry(String str) {
        this.f9480e = str;
    }

    public void setCpmValue(String str) {
        double d;
        try {
            d = Double.parseDouble(str);
        } catch (Exception unused) {
            d = 0.0d;
        }
        this.f9476a.f9485a = d;
    }

    public void setCreativeId(String str) {
        this.f9482g = str;
    }

    public void setCurrency(String str) {
        this.f9476a.f9486b = str;
    }

    public void setDemandId(Long l) {
        this.f9479d = l;
    }

    public void setDemandSource(String str) {
        this.f9478c = str;
    }

    public void setDuration(long j) {
        this.f9477b.f9488b = j;
    }

    public void setImpressionId(String str) {
        this.f9481f = str;
    }

    public void setPricing(Pricing pricing) {
        this.f9476a = pricing;
    }

    public void setVideo(Video video) {
        this.f9477b = video;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("ImpressionData{pricing=");
        k.append(this.f9476a);
        k.append(", video=");
        k.append(this.f9477b);
        k.append(", demandSource='");
        C25541a.m63890u(k, this.f9478c, '\'', ", country='");
        C25541a.m63890u(k, this.f9480e, '\'', ", impressionId='");
        C25541a.m63890u(k, this.f9481f, '\'', ", creativeId='");
        C25541a.m63890u(k, this.f9482g, '\'', ", campaignId='");
        C25541a.m63890u(k, this.f9483h, '\'', ", advertiserDomain='");
        k.append(this.f9484i);
        k.append('\'');
        k.append('}');
        return k.toString();
    }
}
