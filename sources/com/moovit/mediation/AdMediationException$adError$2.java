package com.moovit.mediation;

import com.google.android.gms.ads.AdError;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

@Metadata(mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Lcom/google/android/gms/ads/AdError;", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class AdMediationException$adError$2 extends Lambda implements C24225a<AdError> {
    public final /* synthetic */ Throwable $cause;
    public final /* synthetic */ AdMediationException this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdMediationException$adError$2(AdMediationException adMediationException, Throwable th) {
        super(0);
        this.this$0 = adMediationException;
        this.$cause = th;
    }

    public final Object invoke() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.this$0.mo19366b().getDescription());
        sb.append(", cause=");
        Throwable th = this.$cause;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        sb.append(str);
        return new AdError(this.this$0.mo19366b().getCode(), sb.toString(), "com.moovit.mediation");
    }
}
