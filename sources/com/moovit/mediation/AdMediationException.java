package com.moovit.mediation;

import bf0.C21049c;
import com.google.android.gms.ads.AdError;
import kotlin.C23812a;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, mo59060d2 = {"Lcom/moovit/mediation/AdMediationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/moovit/mediation/AdMediationError;", "error", "Lcom/moovit/mediation/AdMediationError;", "b", "()Lcom/moovit/mediation/AdMediationError;", "Lcom/google/android/gms/ads/AdError;", "adError$delegate", "Lbf0/c;", "a", "()Lcom/google/android/gms/ads/AdError;", "adError", "AdsMediation_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class AdMediationException extends RuntimeException {
    private final C21049c adError$delegate;
    private final AdMediationError error;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdMediationException(AdMediationError adMediationError, Throwable th) {
        super(adMediationError.getDescription(), th);
        C24362h.m61211f(adMediationError, "error");
        this.error = adMediationError;
        this.adError$delegate = C23812a.m58432b(new AdMediationException$adError$2(this, th));
    }

    /* renamed from: a */
    public final AdError mo19365a() {
        return (AdError) this.adError$delegate.getValue();
    }

    /* renamed from: b */
    public final AdMediationError mo19366b() {
        return this.error;
    }
}
