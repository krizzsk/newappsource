package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/UserDTOJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/UserDTO;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class UserDTOJsonAdapter extends C8011k<UserDTO> {

    /* renamed from: a */
    public final JsonReader.C7986a f8285a = JsonReader.C7986a.m18216a("id", "prefix", "firstName", "lastName", "suffix", "phone1", "phone1State", "smsOptIn", "phone2", "primaryEmail", "emailState", "username", "shippingAddress", "billingAddress", "keycloakId", "userAlertPreferences", "userToken", "language");

    /* renamed from: b */
    public final C8011k<Integer> f8286b;

    /* renamed from: c */
    public final C8011k<String> f8287c;

    /* renamed from: d */
    public final C8011k<PhoneState> f8288d;

    /* renamed from: e */
    public final C8011k<Boolean> f8289e;

    /* renamed from: f */
    public final C8011k<EmailState> f8290f;

    /* renamed from: g */
    public final C8011k<AddressDTO> f8291g;

    /* renamed from: h */
    public final C8011k<UserAlertPreferencesDTO> f8292h;

    public UserDTOJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        C24362h.m61211f(oVar2, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f60175b;
        this.f8286b = oVar2.mo25082c(cls, emptySet, "id");
        this.f8287c = oVar2.mo25082c(String.class, emptySet, "prefix");
        this.f8288d = oVar2.mo25082c(PhoneState.class, emptySet, "phone1State");
        this.f8289e = oVar2.mo25082c(Boolean.class, emptySet, "smsOptIn");
        this.f8290f = oVar2.mo25082c(EmailState.class, emptySet, "emailState");
        this.f8291g = oVar2.mo25082c(AddressDTO.class, emptySet, "shippingAddress");
        this.f8292h = oVar2.mo25082c(UserAlertPreferencesDTO.class, emptySet, "userAlertPreferences");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        PhoneState phoneState = null;
        Boolean bool = null;
        String str6 = null;
        String str7 = null;
        EmailState emailState = null;
        String str8 = null;
        AddressDTO addressDTO = null;
        AddressDTO addressDTO2 = null;
        String str9 = null;
        UserAlertPreferencesDTO userAlertPreferencesDTO = null;
        String str10 = null;
        String str11 = null;
        while (true) {
            String str12 = str8;
            if (jsonReader.mo24999v()) {
                switch (jsonReader2.mo24989O(this.f8285a)) {
                    case -1:
                        jsonReader.mo24991S();
                        jsonReader.mo24992T();
                        break;
                    case 0:
                        num = this.f8286b.mo11093a(jsonReader2);
                        if (num == null) {
                            throw C12977b.m32860m("id", "id", jsonReader2);
                        }
                        break;
                    case 1:
                        str = this.f8287c.mo11093a(jsonReader2);
                        break;
                    case 2:
                        str2 = this.f8287c.mo11093a(jsonReader2);
                        break;
                    case 3:
                        str3 = this.f8287c.mo11093a(jsonReader2);
                        break;
                    case 4:
                        str4 = this.f8287c.mo11093a(jsonReader2);
                        break;
                    case 5:
                        str5 = this.f8287c.mo11093a(jsonReader2);
                        break;
                    case 6:
                        phoneState = this.f8288d.mo11093a(jsonReader2);
                        break;
                    case 7:
                        bool = this.f8289e.mo11093a(jsonReader2);
                        break;
                    case 8:
                        str6 = this.f8287c.mo11093a(jsonReader2);
                        break;
                    case 9:
                        str7 = this.f8287c.mo11093a(jsonReader2);
                        break;
                    case 10:
                        emailState = this.f8290f.mo11093a(jsonReader2);
                        break;
                    case 11:
                        str8 = this.f8287c.mo11093a(jsonReader2);
                        continue;
                    case 12:
                        addressDTO = this.f8291g.mo11093a(jsonReader2);
                        break;
                    case 13:
                        addressDTO2 = this.f8291g.mo11093a(jsonReader2);
                        break;
                    case 14:
                        str9 = this.f8287c.mo11093a(jsonReader2);
                        break;
                    case 15:
                        UserAlertPreferencesDTO a = this.f8292h.mo11093a(jsonReader2);
                        if (a != null) {
                            userAlertPreferencesDTO = a;
                            break;
                        } else {
                            throw C12977b.m32860m("userAlertPreferences", "userAlertPreferences", jsonReader2);
                        }
                    case 16:
                        str10 = this.f8287c.mo11093a(jsonReader2);
                        break;
                    case 17:
                        str11 = this.f8287c.mo11093a(jsonReader2);
                        break;
                }
                str8 = str12;
            } else {
                jsonReader.mo24997r();
                if (num != null) {
                    int intValue = num.intValue();
                    if (userAlertPreferencesDTO != null) {
                        return new UserDTO(intValue, str, str2, str3, str4, str5, phoneState, bool, str6, str7, emailState, str12, addressDTO, addressDTO2, str9, userAlertPreferencesDTO, str10, str11);
                    }
                    throw C12977b.m32854g("userAlertPreferences", "userAlertPreferences", jsonReader2);
                }
                throw C12977b.m32854g("id", "id", jsonReader2);
            }
        }
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        UserDTO userDTO = (UserDTO) obj;
        C24362h.m61211f(kVar, "writer");
        if (userDTO != null) {
            kVar.mo25074i();
            kVar.mo25077w("id");
            this.f8286b.mo11094e(kVar, Integer.valueOf(userDTO.f8267a));
            kVar.mo25077w("prefix");
            this.f8287c.mo11094e(kVar, userDTO.f8268b);
            kVar.mo25077w("firstName");
            this.f8287c.mo11094e(kVar, userDTO.f8269c);
            kVar.mo25077w("lastName");
            this.f8287c.mo11094e(kVar, userDTO.f8270d);
            kVar.mo25077w("suffix");
            this.f8287c.mo11094e(kVar, userDTO.f8271e);
            kVar.mo25077w("phone1");
            this.f8287c.mo11094e(kVar, userDTO.f8272f);
            kVar.mo25077w("phone1State");
            this.f8288d.mo11094e(kVar, userDTO.f8273g);
            kVar.mo25077w("smsOptIn");
            this.f8289e.mo11094e(kVar, userDTO.f8274h);
            kVar.mo25077w("phone2");
            this.f8287c.mo11094e(kVar, userDTO.f8275i);
            kVar.mo25077w("primaryEmail");
            this.f8287c.mo11094e(kVar, userDTO.f8276j);
            kVar.mo25077w("emailState");
            this.f8290f.mo11094e(kVar, userDTO.f8277k);
            kVar.mo25077w("username");
            this.f8287c.mo11094e(kVar, userDTO.f8278l);
            kVar.mo25077w("shippingAddress");
            this.f8291g.mo11094e(kVar, userDTO.f8279m);
            kVar.mo25077w("billingAddress");
            this.f8291g.mo11094e(kVar, userDTO.f8280n);
            kVar.mo25077w("keycloakId");
            this.f8287c.mo11094e(kVar, userDTO.f8281o);
            kVar.mo25077w("userAlertPreferences");
            this.f8292h.mo11094e(kVar, userDTO.f8282p);
            kVar.mo25077w("userToken");
            this.f8287c.mo11094e(kVar, userDTO.f8283q);
            kVar.mo25077w("language");
            this.f8287c.mo11094e(kVar, userDTO.f8284r);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UserDTO)";
    }
}
