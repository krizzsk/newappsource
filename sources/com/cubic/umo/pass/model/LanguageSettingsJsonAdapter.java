package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/LanguageSettingsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/LanguageSettings;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class LanguageSettingsJsonAdapter extends C8011k<LanguageSettings> {

    /* renamed from: a */
    public final JsonReader.C7986a f8117a = JsonReader.C7986a.m18216a("strings", "defaultLanguage");

    /* renamed from: b */
    public final C8011k<LanguageStrings> f8118b;

    /* renamed from: c */
    public final C8011k<String> f8119c;

    public LanguageSettingsJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f8118b = oVar.mo25082c(LanguageStrings.class, emptySet, "strings");
        this.f8119c = oVar.mo25082c(String.class, emptySet, "defaultLanguage");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        LanguageStrings languageStrings = null;
        String str = null;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f8117a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                languageStrings = this.f8118b.mo11093a(jsonReader);
                if (languageStrings == null) {
                    throw C12977b.m32860m("strings", "strings", jsonReader);
                }
            } else if (O == 1) {
                str = this.f8119c.mo11093a(jsonReader);
            }
        }
        jsonReader.mo24997r();
        if (languageStrings != null) {
            return new LanguageSettings(languageStrings, str);
        }
        throw C12977b.m32854g("strings", "strings", jsonReader);
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        LanguageSettings languageSettings = (LanguageSettings) obj;
        C24362h.m61211f(kVar, "writer");
        if (languageSettings != null) {
            kVar.mo25074i();
            kVar.mo25077w("strings");
            this.f8118b.mo11094e(kVar, languageSettings.f8115b);
            kVar.mo25077w("defaultLanguage");
            this.f8119c.mo11094e(kVar, languageSettings.f8116c);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(LanguageSettings)";
    }
}
