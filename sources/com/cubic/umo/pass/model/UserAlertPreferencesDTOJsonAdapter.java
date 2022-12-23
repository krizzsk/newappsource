package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/UserAlertPreferencesDTOJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/UserAlertPreferencesDTO;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class UserAlertPreferencesDTOJsonAdapter extends C8011k<UserAlertPreferencesDTO> {

    /* renamed from: a */
    public final JsonReader.C7986a f8264a = JsonReader.C7986a.m18216a("alertLowBalance", "alertAutoload", "alertPassExpiring", "passExpiringDays", "alertPaymentExpiring", "alertAutoloadCancelled", "alertDemographicsChanged", "alertStoredValueChanged", "alertOkFareTransaction", "alertDeniedFareTransaction", "alertHouseCardChanged", "alertHouseCardExpiring", "alertPaymentExpired", "alertNoFareProducts", "alertAutoloadFailed");

    /* renamed from: b */
    public final C8011k<Alerts> f8265b;

    /* renamed from: c */
    public final C8011k<Integer> f8266c;

    public UserAlertPreferencesDTOJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        C24362h.m61211f(oVar2, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f8265b = oVar2.mo25082c(Alerts.class, emptySet, "alertLowBalance");
        this.f8266c = oVar2.mo25082c(Integer.class, emptySet, "passExpiringDays");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
        Alerts alerts = null;
        Alerts alerts2 = null;
        Alerts alerts3 = null;
        Integer num = null;
        Alerts alerts4 = null;
        Alerts alerts5 = null;
        Alerts alerts6 = null;
        Alerts alerts7 = null;
        Alerts alerts8 = null;
        Alerts alerts9 = null;
        Alerts alerts10 = null;
        Alerts alerts11 = null;
        Alerts alerts12 = null;
        Alerts alerts13 = null;
        Alerts alerts14 = null;
        while (jsonReader.mo24999v()) {
            switch (jsonReader2.mo24989O(this.f8264a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    alerts = this.f8265b.mo11093a(jsonReader2);
                    break;
                case 1:
                    alerts2 = this.f8265b.mo11093a(jsonReader2);
                    break;
                case 2:
                    alerts3 = this.f8265b.mo11093a(jsonReader2);
                    break;
                case 3:
                    num = this.f8266c.mo11093a(jsonReader2);
                    break;
                case 4:
                    alerts4 = this.f8265b.mo11093a(jsonReader2);
                    break;
                case 5:
                    alerts5 = this.f8265b.mo11093a(jsonReader2);
                    break;
                case 6:
                    alerts6 = this.f8265b.mo11093a(jsonReader2);
                    break;
                case 7:
                    alerts7 = this.f8265b.mo11093a(jsonReader2);
                    break;
                case 8:
                    alerts8 = this.f8265b.mo11093a(jsonReader2);
                    break;
                case 9:
                    alerts9 = this.f8265b.mo11093a(jsonReader2);
                    break;
                case 10:
                    alerts10 = this.f8265b.mo11093a(jsonReader2);
                    break;
                case 11:
                    alerts11 = this.f8265b.mo11093a(jsonReader2);
                    break;
                case 12:
                    alerts12 = this.f8265b.mo11093a(jsonReader2);
                    break;
                case 13:
                    alerts13 = this.f8265b.mo11093a(jsonReader2);
                    break;
                case 14:
                    alerts14 = this.f8265b.mo11093a(jsonReader2);
                    break;
            }
        }
        jsonReader.mo24997r();
        return new UserAlertPreferencesDTO(alerts, alerts2, alerts3, num, alerts4, alerts5, alerts6, alerts7, alerts8, alerts9, alerts10, alerts11, alerts12, alerts13, alerts14);
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        UserAlertPreferencesDTO userAlertPreferencesDTO = (UserAlertPreferencesDTO) obj;
        C24362h.m61211f(kVar, "writer");
        if (userAlertPreferencesDTO != null) {
            kVar.mo25074i();
            kVar.mo25077w("alertLowBalance");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8249a);
            kVar.mo25077w("alertAutoload");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8250b);
            kVar.mo25077w("alertPassExpiring");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8251c);
            kVar.mo25077w("passExpiringDays");
            this.f8266c.mo11094e(kVar, userAlertPreferencesDTO.f8252d);
            kVar.mo25077w("alertPaymentExpiring");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8253e);
            kVar.mo25077w("alertAutoloadCancelled");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8254f);
            kVar.mo25077w("alertDemographicsChanged");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8255g);
            kVar.mo25077w("alertStoredValueChanged");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8256h);
            kVar.mo25077w("alertOkFareTransaction");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8257i);
            kVar.mo25077w("alertDeniedFareTransaction");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8258j);
            kVar.mo25077w("alertHouseCardChanged");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8259k);
            kVar.mo25077w("alertHouseCardExpiring");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8260l);
            kVar.mo25077w("alertPaymentExpired");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8261m);
            kVar.mo25077w("alertNoFareProducts");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8262n);
            kVar.mo25077w("alertAutoloadFailed");
            this.f8265b.mo11094e(kVar, userAlertPreferencesDTO.f8263o);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UserAlertPreferencesDTO)";
    }
}
