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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CredentialJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/Credential;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class CredentialJsonAdapter extends C8011k<Credential> {

    /* renamed from: a */
    public final JsonReader.C7986a f8039a = JsonReader.C7986a.m18216a("email", "password", "deviceId", "nfcEnabled", "latitude", "longitude");

    /* renamed from: b */
    public final C8011k<String> f8040b;

    /* renamed from: c */
    public final C8011k<Long> f8041c;

    /* renamed from: d */
    public final C8011k<Boolean> f8042d;

    /* renamed from: e */
    public final C8011k<Double> f8043e;

    public CredentialJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f8040b = oVar.mo25082c(String.class, emptySet, "email");
        this.f8041c = oVar.mo25082c(Long.TYPE, emptySet, "deviceId");
        this.f8042d = oVar.mo25082c(Boolean.TYPE, emptySet, "nfcEnabled");
        this.f8043e = oVar.mo25082c(Double.TYPE, emptySet, "latitude");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
        Long l = null;
        Boolean bool = null;
        String str = null;
        Double d = null;
        Double d2 = null;
        String str2 = null;
        while (jsonReader.mo24999v()) {
            switch (jsonReader2.mo24989O(this.f8039a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    str = this.f8040b.mo11093a(jsonReader2);
                    if (str != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("email", "email", jsonReader2);
                    }
                case 1:
                    str2 = this.f8040b.mo11093a(jsonReader2);
                    if (str2 != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("password", "password", jsonReader2);
                    }
                case 2:
                    l = this.f8041c.mo11093a(jsonReader2);
                    if (l != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("deviceId", "deviceId", jsonReader2);
                    }
                case 3:
                    bool = this.f8042d.mo11093a(jsonReader2);
                    if (bool != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("nfcEnabled", "nfcEnabled", jsonReader2);
                    }
                case 4:
                    d = this.f8043e.mo11093a(jsonReader2);
                    if (d != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("latitude", "latitude", jsonReader2);
                    }
                case 5:
                    d2 = this.f8043e.mo11093a(jsonReader2);
                    if (d2 != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("longitude", "longitude", jsonReader2);
                    }
            }
        }
        jsonReader.mo24997r();
        if (str == null) {
            throw C12977b.m32854g("email", "email", jsonReader2);
        } else if (str2 == null) {
            throw C12977b.m32854g("password", "password", jsonReader2);
        } else if (l != null) {
            long longValue = l.longValue();
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (d != null) {
                    double doubleValue = d.doubleValue();
                    if (d2 != null) {
                        return new Credential(str, str2, longValue, booleanValue, doubleValue, d2.doubleValue());
                    }
                    throw C12977b.m32854g("longitude", "longitude", jsonReader2);
                }
                throw C12977b.m32854g("latitude", "latitude", jsonReader2);
            }
            throw C12977b.m32854g("nfcEnabled", "nfcEnabled", jsonReader2);
        } else {
            throw C12977b.m32854g("deviceId", "deviceId", jsonReader2);
        }
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        Credential credential = (Credential) obj;
        C24362h.m61211f(kVar, "writer");
        if (credential != null) {
            kVar.mo25074i();
            kVar.mo25077w("email");
            this.f8040b.mo11094e(kVar, credential.f8033a);
            kVar.mo25077w("password");
            this.f8040b.mo11094e(kVar, credential.f8034b);
            kVar.mo25077w("deviceId");
            this.f8041c.mo11094e(kVar, Long.valueOf(credential.f8035c));
            kVar.mo25077w("nfcEnabled");
            C0017h.m63T(credential.f8036d, this.f8042d, kVar, "latitude");
            this.f8043e.mo11094e(kVar, Double.valueOf(credential.f8037e));
            kVar.mo25077w("longitude");
            this.f8043e.mo11094e(kVar, Double.valueOf(credential.f8038f));
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Credential)";
    }
}
