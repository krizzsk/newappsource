package com.veriff.sdk.internal;

import android.app.Activity;
import com.veriff.sdk.internal.C21952ld;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\u0004H&R\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/NfcClient;", "", "Landroid/app/Activity;", "activity", "Lbf0/d;", "showDeviceSettings", "Lcom/veriff/sdk/internal/nfc/MrzInfo;", "mrz", "Lcom/veriff/sdk/views/nfc/NfcClient$Listener;", "listener", "startScanning", "stopScanning", "", "getAppHasNfcPermission", "()Z", "appHasNfcPermission", "getDeviceSupportsNfc", "deviceSupportsNfc", "getNfcEnabled", "nfcEnabled", "Companion", "Listener", "ScanState", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.rr */
public interface C22420rr {

    /* renamed from: a */
    public static final C22421a f56591a = C22421a.f56592a;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/NfcClient$Companion;", "", "()V", "override", "Lcom/veriff/sdk/views/nfc/NfcClient;", "getOverride", "()Lcom/veriff/sdk/views/nfc/NfcClient;", "setOverride", "(Lcom/veriff/sdk/views/nfc/NfcClient;)V", "get", "activity", "Landroid/app/Activity;", "flags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rr$a */
    public static final class C22421a {

        /* renamed from: a */
        public static final /* synthetic */ C22421a f56592a = new C22421a();

        private C22421a() {
        }

        /* renamed from: a */
        public final C22420rr mo56498a(Activity activity, C21789ix ixVar) {
            C24362h.m61211f(activity, "activity");
            C24362h.m61211f(ixVar, "flags");
            C21636fm a = C21637fn.m52520a();
            C24362h.m61210e(a, "Schedulers.diskIO()");
            C21636fm c = C21637fn.m52523c();
            C24362h.m61210e(c, "Schedulers.main()");
            return new C22394rn(activity, a, c, ixVar, (C24236l) null, 16, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/NfcClient$Listener;", "", "Lcom/veriff/sdk/views/nfc/NfcClient$ScanState;", "state", "Lbf0/d;", "onProgress", "Lcom/veriff/sdk/internal/nfc/MrtdReader$Result;", "result", "onResult", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rr$b */
    public interface C22422b {
        /* renamed from: a */
        void mo56499a(C21952ld.C21955c cVar);

        /* renamed from: a */
        void mo56500a(C22423c cVar);
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/NfcClient$ScanState;", "", "(Ljava/lang/String;I)V", "LOOKING_FOR_MRTD_TAG", "READING_PHOTO", "READING_DATA", "DONE", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rr$c */
    public enum C22423c {
        LOOKING_FOR_MRTD_TAG,
        READING_PHOTO,
        READING_DATA,
        DONE
    }

    /* renamed from: a */
    void mo56463a(Activity activity);

    /* renamed from: a */
    void mo56464a(C21960lf lfVar, C22422b bVar);

    /* renamed from: a */
    boolean mo56465a();

    /* renamed from: b */
    boolean mo56466b();

    /* renamed from: c */
    boolean mo56467c();

    /* renamed from: e */
    void mo56468e();
}
