package com.veriff.sdk.views.language;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.Locale;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24454g;
import mobi.lab.veriff.util.C24465j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo59060d2 = {"Lcom/veriff/sdk/views/language/LanguagePresenter;", "Lcom/veriff/sdk/views/language/LanguageMVP$Presenter;", "Lbf0/d;", "onCloseClicked", "onLanguageChanged", "onLanguageNotChanged", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "languageCountryLocale", "onLanguageSelected", "Lcom/veriff/sdk/views/language/LanguageMVP$View;", "view", "Lcom/veriff/sdk/views/language/LanguageMVP$View;", "<init>", "(Lcom/veriff/sdk/views/language/LanguageMVP$View;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.language.b */
public final class C22946b implements a$a {

    /* renamed from: a */
    private final a$b f58259a;

    public C22946b(a$b a_b) {
        C24362h.m61211f(a_b, Promotion.ACTION_VIEW);
        this.f58259a = a_b;
    }

    /* renamed from: a */
    public void mo57858a(C24454g gVar) {
        C24362h.m61211f(gVar, "languageCountryLocale");
        C24465j a = C22947c.f58260a;
        a.mo60705d("onLanguageSelected(" + gVar + "), changing language");
        this.f58259a.mo57854a(gVar);
    }

    /* renamed from: b */
    public void mo57859b() {
        C24465j a = C22947c.f58260a;
        StringBuilder k = C13555b.m33972k("onLanguageChanged() to ");
        k.append(Locale.getDefault());
        k.append(", closing view");
        a.mo60705d(k.toString());
        this.f58259a.mo57855a(true);
    }

    /* renamed from: c */
    public void mo57860c() {
        C22947c.f58260a.mo60705d("onLanguageNotChanged(), closing view");
        this.f58259a.mo57855a(false);
    }

    /* renamed from: a */
    public void mo57857a() {
        C22947c.f58260a.mo60705d("onCloseClicked(), closing with RESULT_CANCEL");
        this.f58259a.mo57855a(false);
    }
}
