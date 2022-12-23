package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CreateAccountJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/CreateAccount;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class CreateAccountJsonAdapter extends C8011k<CreateAccount> {

    /* renamed from: a */
    public final JsonReader.C7986a f8028a = JsonReader.C7986a.m18216a("username", "password", "deviceId", "agencyPublicId", "birthdate", "cardNumber", "email", "firstName", "lastName", "nfcEnabled", "otherPhone", "primaryPhone");

    /* renamed from: b */
    public final C8011k<String> f8029b;

    /* renamed from: c */
    public final C8011k<Long> f8030c;

    /* renamed from: d */
    public final C8011k<String> f8031d;

    /* renamed from: e */
    public final C8011k<Boolean> f8032e;

    public CreateAccountJsonAdapter(C8017o oVar) {
        Class<String> cls = String.class;
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f8029b = oVar.mo25082c(cls, emptySet, "username");
        this.f8030c = oVar.mo25082c(Long.TYPE, emptySet, "deviceId");
        this.f8031d = oVar.mo25082c(cls, emptySet, "birthdate");
        this.f8032e = oVar.mo25082c(Boolean.TYPE, emptySet, "nfcEnabled");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        boolean z;
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Long l = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        String str10 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (true) {
            String str11 = str8;
            String str12 = str5;
            Boolean bool2 = bool;
            if (jsonReader.mo24999v()) {
                switch (jsonReader2.mo24989O(this.f8028a)) {
                    case -1:
                        jsonReader.mo24991S();
                        jsonReader.mo24992T();
                        break;
                    case 0:
                        String a = this.f8029b.mo11093a(jsonReader2);
                        if (a != null) {
                            str6 = a;
                            break;
                        } else {
                            throw C12977b.m32860m("username", "username", jsonReader2);
                        }
                    case 1:
                        String a2 = this.f8029b.mo11093a(jsonReader2);
                        if (a2 != null) {
                            str7 = a2;
                            break;
                        } else {
                            throw C12977b.m32860m("password", "password", jsonReader2);
                        }
                    case 2:
                        Long a3 = this.f8030c.mo11093a(jsonReader2);
                        if (a3 != null) {
                            l = a3;
                            break;
                        } else {
                            throw C12977b.m32860m("deviceId", "deviceId", jsonReader2);
                        }
                    case 3:
                        String a4 = this.f8029b.mo11093a(jsonReader2);
                        if (a4 != null) {
                            str10 = a4;
                            break;
                        } else {
                            throw C12977b.m32860m("agencyId", "agencyPublicId", jsonReader2);
                        }
                    case 4:
                        str4 = this.f8031d.mo11093a(jsonReader2);
                        str8 = str11;
                        str5 = str12;
                        bool = bool2;
                        z3 = true;
                        continue;
                    case 5:
                        str2 = this.f8031d.mo11093a(jsonReader2);
                        str8 = str11;
                        str5 = str12;
                        bool = bool2;
                        z4 = true;
                        continue;
                    case 6:
                        str3 = this.f8031d.mo11093a(jsonReader2);
                        str8 = str11;
                        str5 = str12;
                        bool = bool2;
                        z5 = true;
                        continue;
                    case 7:
                        str = this.f8031d.mo11093a(jsonReader2);
                        str8 = str11;
                        str5 = str12;
                        bool = bool2;
                        z6 = true;
                        continue;
                    case 8:
                        str9 = this.f8031d.mo11093a(jsonReader2);
                        str8 = str11;
                        str5 = str12;
                        bool = bool2;
                        z7 = true;
                        continue;
                    case 9:
                        Boolean a5 = this.f8032e.mo11093a(jsonReader2);
                        if (a5 != null) {
                            bool = a5;
                            break;
                        } else {
                            throw C12977b.m32860m("nfcEnabled", "nfcEnabled", jsonReader2);
                        }
                    case 10:
                        str5 = this.f8031d.mo11093a(jsonReader2);
                        str8 = str11;
                        bool = bool2;
                        z2 = true;
                        continue;
                    case 11:
                        str8 = this.f8031d.mo11093a(jsonReader2);
                        str5 = str12;
                        bool = bool2;
                        z8 = true;
                        continue;
                }
                bool = bool2;
                str8 = str11;
                str5 = str12;
            } else {
                jsonReader.mo24997r();
                if (str6 == null) {
                    throw C12977b.m32854g("username", "username", jsonReader2);
                } else if (str7 == null) {
                    throw C12977b.m32854g("password", "password", jsonReader2);
                } else if (l != null) {
                    long longValue = l.longValue();
                    if (str10 != null) {
                        CreateAccount createAccount = r8;
                        String str13 = str11;
                        CreateAccount createAccount2 = new CreateAccount(str6, str7, longValue, str10);
                        if (z3) {
                            createAccount.f8026k = str4;
                        }
                        if (z4) {
                            createAccount.f8023h = str2;
                        }
                        if (z5) {
                            createAccount.f8022g = str3;
                        }
                        if (z6) {
                            createAccount.f8020e = str;
                        }
                        if (z7) {
                            createAccount.f8021f = str9;
                        }
                        if (bool2 == null) {
                            z = createAccount.f8027l;
                        } else {
                            z = bool2.booleanValue();
                        }
                        createAccount.f8027l = z;
                        if (z2) {
                            createAccount.f8025j = str12;
                        }
                        if (z8) {
                            createAccount.f8024i = str13;
                        }
                        return createAccount;
                    }
                    throw C12977b.m32854g("agencyId", "agencyPublicId", jsonReader2);
                } else {
                    throw C12977b.m32854g("deviceId", "deviceId", jsonReader2);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        CreateAccount createAccount = (CreateAccount) obj;
        C24362h.m61211f(kVar, "writer");
        if (createAccount != null) {
            kVar.mo25074i();
            kVar.mo25077w("username");
            this.f8029b.mo11094e(kVar, createAccount.f8016a);
            kVar.mo25077w("password");
            this.f8029b.mo11094e(kVar, createAccount.f8017b);
            kVar.mo25077w("deviceId");
            this.f8030c.mo11094e(kVar, Long.valueOf(createAccount.f8018c));
            kVar.mo25077w("agencyPublicId");
            this.f8029b.mo11094e(kVar, createAccount.f8019d);
            kVar.mo25077w("birthdate");
            this.f8031d.mo11094e(kVar, createAccount.f8026k);
            kVar.mo25077w("cardNumber");
            this.f8031d.mo11094e(kVar, createAccount.f8023h);
            kVar.mo25077w("email");
            this.f8031d.mo11094e(kVar, createAccount.f8022g);
            kVar.mo25077w("firstName");
            this.f8031d.mo11094e(kVar, createAccount.f8020e);
            kVar.mo25077w("lastName");
            this.f8031d.mo11094e(kVar, createAccount.f8021f);
            kVar.mo25077w("nfcEnabled");
            C0017h.m63T(createAccount.f8027l, this.f8032e, kVar, "otherPhone");
            this.f8031d.mo11094e(kVar, createAccount.f8025j);
            kVar.mo25077w("primaryPhone");
            this.f8031d.mo11094e(kVar, createAccount.f8024i);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CreateAccount)";
    }
}
