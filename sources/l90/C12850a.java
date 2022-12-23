package l90;

import android.os.Bundle;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.util.ParcelableMemRef;
import j90.C12789b;

/* renamed from: l90.a */
public final class C12850a extends C12789b {

    /* renamed from: b */
    public final String f31772b;

    /* renamed from: c */
    public final long f31773c;

    /* renamed from: d */
    public final String f31774d;

    public C12850a(ServerId serverId, String str, long j, String str2) {
        super(serverId);
        C21100e.m49373x(str, LinksConfiguration.KEY_KEY);
        this.f31772b = str;
        this.f31773c = j;
        C21100e.m49373x(str2, "cardNumber");
        this.f31774d = str2;
    }

    /* renamed from: a */
    public final C12852c mo39635a() {
        C12852c cVar = new C12852c();
        Bundle bundle = new Bundle();
        bundle.putParcelable("providerId", this.f31612a);
        bundle.putParcelable("validationInfo", new ParcelableMemRef(this));
        cVar.setArguments(bundle);
        return cVar;
    }
}
