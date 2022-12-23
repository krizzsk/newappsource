package com.cubic.umo.pass.model;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/UserAlertPreferencesDTO;", "", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class UserAlertPreferencesDTO {

    /* renamed from: a */
    public final Alerts f8249a;

    /* renamed from: b */
    public final Alerts f8250b;

    /* renamed from: c */
    public final Alerts f8251c;

    /* renamed from: d */
    public final Integer f8252d;

    /* renamed from: e */
    public final Alerts f8253e;

    /* renamed from: f */
    public final Alerts f8254f;

    /* renamed from: g */
    public final Alerts f8255g;

    /* renamed from: h */
    public final Alerts f8256h;

    /* renamed from: i */
    public final Alerts f8257i;

    /* renamed from: j */
    public final Alerts f8258j;

    /* renamed from: k */
    public final Alerts f8259k;

    /* renamed from: l */
    public final Alerts f8260l;

    /* renamed from: m */
    public final Alerts f8261m;

    /* renamed from: n */
    public final Alerts f8262n;

    /* renamed from: o */
    public final Alerts f8263o;

    public UserAlertPreferencesDTO(Alerts alerts, Alerts alerts2, Alerts alerts3, Integer num, Alerts alerts4, Alerts alerts5, Alerts alerts6, Alerts alerts7, Alerts alerts8, Alerts alerts9, Alerts alerts10, Alerts alerts11, Alerts alerts12, Alerts alerts13, Alerts alerts14) {
        this.f8249a = alerts;
        this.f8250b = alerts2;
        this.f8251c = alerts3;
        this.f8252d = num;
        this.f8253e = alerts4;
        this.f8254f = alerts5;
        this.f8255g = alerts6;
        this.f8256h = alerts7;
        this.f8257i = alerts8;
        this.f8258j = alerts9;
        this.f8259k = alerts10;
        this.f8260l = alerts11;
        this.f8261m = alerts12;
        this.f8262n = alerts13;
        this.f8263o = alerts14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAlertPreferencesDTO)) {
            return false;
        }
        UserAlertPreferencesDTO userAlertPreferencesDTO = (UserAlertPreferencesDTO) obj;
        return this.f8249a == userAlertPreferencesDTO.f8249a && this.f8250b == userAlertPreferencesDTO.f8250b && this.f8251c == userAlertPreferencesDTO.f8251c && C24362h.m61206a(this.f8252d, userAlertPreferencesDTO.f8252d) && this.f8253e == userAlertPreferencesDTO.f8253e && this.f8254f == userAlertPreferencesDTO.f8254f && this.f8255g == userAlertPreferencesDTO.f8255g && this.f8256h == userAlertPreferencesDTO.f8256h && this.f8257i == userAlertPreferencesDTO.f8257i && this.f8258j == userAlertPreferencesDTO.f8258j && this.f8259k == userAlertPreferencesDTO.f8259k && this.f8260l == userAlertPreferencesDTO.f8260l && this.f8261m == userAlertPreferencesDTO.f8261m && this.f8262n == userAlertPreferencesDTO.f8262n && this.f8263o == userAlertPreferencesDTO.f8263o;
    }

    public final int hashCode() {
        Alerts alerts = this.f8249a;
        int i = 0;
        int hashCode = (alerts == null ? 0 : alerts.hashCode()) * 31;
        Alerts alerts2 = this.f8250b;
        int hashCode2 = (hashCode + (alerts2 == null ? 0 : alerts2.hashCode())) * 31;
        Alerts alerts3 = this.f8251c;
        int hashCode3 = (hashCode2 + (alerts3 == null ? 0 : alerts3.hashCode())) * 31;
        Integer num = this.f8252d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Alerts alerts4 = this.f8253e;
        int hashCode5 = (hashCode4 + (alerts4 == null ? 0 : alerts4.hashCode())) * 31;
        Alerts alerts5 = this.f8254f;
        int hashCode6 = (hashCode5 + (alerts5 == null ? 0 : alerts5.hashCode())) * 31;
        Alerts alerts6 = this.f8255g;
        int hashCode7 = (hashCode6 + (alerts6 == null ? 0 : alerts6.hashCode())) * 31;
        Alerts alerts7 = this.f8256h;
        int hashCode8 = (hashCode7 + (alerts7 == null ? 0 : alerts7.hashCode())) * 31;
        Alerts alerts8 = this.f8257i;
        int hashCode9 = (hashCode8 + (alerts8 == null ? 0 : alerts8.hashCode())) * 31;
        Alerts alerts9 = this.f8258j;
        int hashCode10 = (hashCode9 + (alerts9 == null ? 0 : alerts9.hashCode())) * 31;
        Alerts alerts10 = this.f8259k;
        int hashCode11 = (hashCode10 + (alerts10 == null ? 0 : alerts10.hashCode())) * 31;
        Alerts alerts11 = this.f8260l;
        int hashCode12 = (hashCode11 + (alerts11 == null ? 0 : alerts11.hashCode())) * 31;
        Alerts alerts12 = this.f8261m;
        int hashCode13 = (hashCode12 + (alerts12 == null ? 0 : alerts12.hashCode())) * 31;
        Alerts alerts13 = this.f8262n;
        int hashCode14 = (hashCode13 + (alerts13 == null ? 0 : alerts13.hashCode())) * 31;
        Alerts alerts14 = this.f8263o;
        if (alerts14 != null) {
            i = alerts14.hashCode();
        }
        return hashCode14 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("UserAlertPreferencesDTO(alertLowBalance=");
        k.append(this.f8249a);
        k.append(", alertAutoload=");
        k.append(this.f8250b);
        k.append(", alertPassExpiring=");
        k.append(this.f8251c);
        k.append(", passExpiringDays=");
        k.append(this.f8252d);
        k.append(", alertPaymentExpiring=");
        k.append(this.f8253e);
        k.append(", alertAutoloadCancelled=");
        k.append(this.f8254f);
        k.append(", alertDemographicsChanged=");
        k.append(this.f8255g);
        k.append(", alertStoredValueChanged=");
        k.append(this.f8256h);
        k.append(", alertOkFareTransaction=");
        k.append(this.f8257i);
        k.append(", alertDeniedFareTransaction=");
        k.append(this.f8258j);
        k.append(", alertHouseCardChanged=");
        k.append(this.f8259k);
        k.append(", alertHouseCardExpiring=");
        k.append(this.f8260l);
        k.append(", alertPaymentExpired=");
        k.append(this.f8261m);
        k.append(", alertNoFareProducts=");
        k.append(this.f8262n);
        k.append(", alertAutoloadFailed=");
        k.append(this.f8263o);
        k.append(')');
        return k.toString();
    }
}
