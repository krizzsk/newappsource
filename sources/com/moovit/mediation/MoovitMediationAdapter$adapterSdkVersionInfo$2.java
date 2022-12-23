package com.moovit.mediation;

import com.google.android.gms.ads.mediation.VersionInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

@Metadata(mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Lcom/google/android/gms/ads/mediation/VersionInfo;", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class MoovitMediationAdapter$adapterSdkVersionInfo$2 extends Lambda implements C24225a<VersionInfo> {
    public final /* synthetic */ MoovitMediationAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoovitMediationAdapter$adapterSdkVersionInfo$2(MoovitMediationAdapter moovitMediationAdapter) {
        super(0);
        this.this$0 = moovitMediationAdapter;
    }

    public final Object invoke() {
        return this.this$0.parseVersionInfo(false);
    }
}
