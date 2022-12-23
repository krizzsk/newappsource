package com.cubic.umo.auth.api.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/auth/api/model/OpenIdTokenJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/auth/api/model/OpenIdToken;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "auth_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class OpenIdTokenJsonAdapter extends C8011k<OpenIdToken> {

    /* renamed from: a */
    public final JsonReader.C7986a f7769a = JsonReader.C7986a.m18216a("access_token", "expires_in", "refresh_expires_in", "refresh_token", "token_type");

    /* renamed from: b */
    public final C8011k<String> f7770b;

    /* renamed from: c */
    public final C8011k<Integer> f7771c;

    public OpenIdTokenJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f7770b = oVar.mo25082c(String.class, emptySet, "accessToken");
        this.f7771c = oVar.mo25082c(Integer.TYPE, emptySet, "expiresIn");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            String str4 = str3;
            String str5 = str2;
            if (jsonReader.mo24999v()) {
                int O = jsonReader2.mo24989O(this.f7769a);
                Integer num3 = num;
                if (O == -1) {
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                } else if (O == 0) {
                    str = this.f7770b.mo11093a(jsonReader2);
                    if (str == null) {
                        throw C12977b.m32860m("accessToken", "access_token", jsonReader2);
                    }
                } else if (O == 1) {
                    num2 = this.f7771c.mo11093a(jsonReader2);
                    if (num2 == null) {
                        throw C12977b.m32860m("expiresIn", "expires_in", jsonReader2);
                    }
                } else if (O == 2) {
                    num = this.f7771c.mo11093a(jsonReader2);
                    if (num != null) {
                        str3 = str4;
                        str2 = str5;
                    } else {
                        throw C12977b.m32860m("refreshExpiresIn", "refresh_expires_in", jsonReader2);
                    }
                } else if (O == 3) {
                    String a = this.f7770b.mo11093a(jsonReader2);
                    if (a != null) {
                        str2 = a;
                        str3 = str4;
                        num = num3;
                    } else {
                        throw C12977b.m32860m("refreshToken", "refresh_token", jsonReader2);
                    }
                } else if (O == 4) {
                    str3 = this.f7770b.mo11093a(jsonReader2);
                    if (str3 == null) {
                        throw C12977b.m32860m("tokenType", "token_type", jsonReader2);
                    }
                    str2 = str5;
                    num = num3;
                }
                str3 = str4;
                str2 = str5;
                num = num3;
            } else {
                Integer num4 = num;
                jsonReader.mo24997r();
                if (str == null) {
                    throw C12977b.m32854g("accessToken", "access_token", jsonReader2);
                } else if (num2 != null) {
                    int intValue = num2.intValue();
                    if (num4 != null) {
                        int intValue2 = num4.intValue();
                        if (str5 == null) {
                            throw C12977b.m32854g("refreshToken", "refresh_token", jsonReader2);
                        } else if (str4 != null) {
                            return new OpenIdToken(str, intValue, intValue2, str5, str4);
                        } else {
                            throw C12977b.m32854g("tokenType", "token_type", jsonReader2);
                        }
                    } else {
                        throw C12977b.m32854g("refreshExpiresIn", "refresh_expires_in", jsonReader2);
                    }
                } else {
                    throw C12977b.m32854g("expiresIn", "expires_in", jsonReader2);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        OpenIdToken openIdToken = (OpenIdToken) obj;
        C24362h.m61211f(kVar, "writer");
        if (openIdToken != null) {
            kVar.mo25074i();
            kVar.mo25077w("access_token");
            this.f7770b.mo11094e(kVar, openIdToken.f7764a);
            kVar.mo25077w("expires_in");
            this.f7771c.mo11094e(kVar, Integer.valueOf(openIdToken.f7765b));
            kVar.mo25077w("refresh_expires_in");
            this.f7771c.mo11094e(kVar, Integer.valueOf(openIdToken.f7766c));
            kVar.mo25077w("refresh_token");
            this.f7770b.mo11094e(kVar, openIdToken.f7767d);
            kVar.mo25077w("token_type");
            this.f7770b.mo11094e(kVar, openIdToken.f7768e);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(OpenIdToken)";
    }
}
