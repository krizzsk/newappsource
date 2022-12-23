package com.veriff.sdk.internal;

import android.app.Activity;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Bundle;
import android.os.Vibrator;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.veriff.sdk.internal.C21952ld;
import com.veriff.sdk.internal.C22420rr;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020 \u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020#¢\u0006\u0004\b,\u0010-J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\"\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\b\u0010\u0011\u001a\u00020\bH\u0017R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010(\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001aR\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/AndroidNfcClient;", "Lcom/veriff/sdk/views/nfc/NfcClient;", "Landroid/nfc/tech/IsoDep;", "isodep", "Lcom/veriff/sdk/internal/nfc/MrzInfo;", "mrz", "Lcom/veriff/sdk/views/nfc/NfcClient$Listener;", "listener", "Lbf0/d;", "onTagConnected", "Landroid/nfc/Tag;", "tag", "onTagFound", "Landroid/app/Activity;", "activity", "showDeviceSettings", "startScanning", "stopScanning", "Landroid/app/Activity;", "Landroid/nfc/NfcAdapter;", "adapter", "Landroid/nfc/NfcAdapter;", "", "appHasNfcPermission", "Z", "getAppHasNfcPermission", "()Z", "deviceSupportsNfc", "getDeviceSupportsNfc", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "flags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/internal/Scheduler;", "ioScheduler", "Lcom/veriff/sdk/internal/Scheduler;", "Lkotlin/Function1;", "isoDepFactory", "Llf0/l;", "mainScheduler", "getNfcEnabled", "nfcEnabled", "Lcom/veriff/sdk/views/nfc/NfcClient$ScanState;", "state", "Lcom/veriff/sdk/views/nfc/NfcClient$ScanState;", "<init>", "(Landroid/app/Activity;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/data/FeatureFlags;Llf0/l;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.rn */
public final class C22394rn implements C22420rr {

    /* renamed from: b */
    private final boolean f56535b;

    /* renamed from: c */
    private final NfcAdapter f56536c;

    /* renamed from: d */
    private final boolean f56537d;

    /* renamed from: e */
    private C22420rr.C22423c f56538e;

    /* renamed from: f */
    private final Activity f56539f;

    /* renamed from: g */
    private final C21636fm f56540g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C21636fm f56541h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C21789ix f56542i;

    /* renamed from: j */
    private final C24236l<Tag, IsoDep> f56543j;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rn$a */
    public static final class C22396a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22420rr.C22422b f56545a;

        public C22396a(C22420rr.C22422b bVar) {
            this.f56545a = bVar;
        }

        public final void run() {
            this.f56545a.mo56500a(C22420rr.C22423c.READING_PHOTO);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rn$b */
    public static final class C22397b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22394rn f56546a;

        /* renamed from: b */
        public final /* synthetic */ IsoDep f56547b;

        /* renamed from: c */
        public final /* synthetic */ C22420rr.C22422b f56548c;

        /* renamed from: d */
        public final /* synthetic */ C21960lf f56549d;

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006¸\u0006\u0000"}, mo59060d2 = {"com/veriff/sdk/views/nfc/AndroidNfcClient$onTagConnected$2$1$progressListener$1", "Lcom/veriff/sdk/internal/nfc/MrtdReader$ProgressListener;", "Lcom/veriff/sdk/internal/nfc/MrtdFileId;", "id", "Lbf0/d;", "onFileRead", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.rn$b$a */
        public static final class C22398a implements C21952ld.C21954b {

            /* renamed from: a */
            public final /* synthetic */ C22397b f56550a;

            public C22398a(C22397b bVar) {
                this.f56550a = bVar;
            }

            /* renamed from: a */
            public void mo55773a(C21951lc lcVar) {
                C24362h.m61211f(lcVar, "id");
                if (lcVar == C21951lc.DG2) {
                    this.f56550a.f56546a.f56541h.mo54894a(new Runnable(this) {

                        /* renamed from: a */
                        public final /* synthetic */ C22398a f56551a;

                        {
                            this.f56551a = r1;
                        }

                        public final void run() {
                            this.f56551a.f56550a.f56548c.mo56500a(C22420rr.C22423c.READING_DATA);
                        }
                    });
                }
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "com/veriff/sdk/views/nfc/AndroidNfcClient$onTagConnected$2$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.rn$b$b */
        public static final class C22400b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C21952ld.C21955c f56552a;

            /* renamed from: b */
            public final /* synthetic */ C22397b f56553b;

            public C22400b(C21952ld.C21955c cVar, C22397b bVar) {
                this.f56552a = cVar;
                this.f56553b = bVar;
            }

            public final void run() {
                if (this.f56552a instanceof C21952ld.C21955c.C21957b) {
                    this.f56553b.f56548c.mo56500a(C22420rr.C22423c.DONE);
                } else {
                    this.f56553b.f56548c.mo56500a(C22420rr.C22423c.LOOKING_FOR_MRTD_TAG);
                }
                this.f56553b.f56548c.mo56499a(this.f56552a);
            }
        }

        public C22397b(C22394rn rnVar, IsoDep isoDep, C22420rr.C22422b bVar, C21960lf lfVar) {
            this.f56546a = rnVar;
            this.f56547b = isoDep;
            this.f56548c = bVar;
            this.f56549d = lfVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0057, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0058, code lost:
            p584jl.C17885a.m44462t(r0, r1);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                android.nfc.tech.IsoDep r0 = r6.f56547b
                com.veriff.sdk.internal.lo r1 = new com.veriff.sdk.internal.lo     // Catch:{ all -> 0x0055 }
                com.veriff.sdk.internal.ko r2 = new com.veriff.sdk.internal.ko     // Catch:{ all -> 0x0055 }
                r2.<init>(r0)     // Catch:{ all -> 0x0055 }
                r1.<init>(r2)     // Catch:{ all -> 0x0055 }
                mobi.lab.veriff.util.j r2 = com.veriff.sdk.internal.C22403ro.f56559a     // Catch:{ all -> 0x0055 }
                java.lang.String r3 = "chip created"
                r2.mo60705d(r3)     // Catch:{ all -> 0x0055 }
                com.veriff.sdk.internal.kt r2 = new com.veriff.sdk.internal.kt     // Catch:{ all -> 0x0055 }
                com.veriff.sdk.internal.lt r3 = com.veriff.sdk.internal.C21978lt.f55491a     // Catch:{ all -> 0x0055 }
                r2.<init>(r3)     // Catch:{ all -> 0x0055 }
                com.veriff.sdk.internal.kv r3 = new com.veriff.sdk.internal.kv     // Catch:{ all -> 0x0055 }
                r3.<init>()     // Catch:{ all -> 0x0055 }
                com.veriff.sdk.internal.ld r4 = new com.veriff.sdk.internal.ld     // Catch:{ all -> 0x0055 }
                com.veriff.sdk.internal.rn r5 = r6.f56546a     // Catch:{ all -> 0x0055 }
                com.veriff.sdk.internal.ix r5 = r5.f56542i     // Catch:{ all -> 0x0055 }
                r4.<init>(r1, r2, r3, r5)     // Catch:{ all -> 0x0055 }
                mobi.lab.veriff.util.j r1 = com.veriff.sdk.internal.C22403ro.f56559a     // Catch:{ all -> 0x0055 }
                java.lang.String r2 = "Reading info from chip"
                r1.mo60705d(r2)     // Catch:{ all -> 0x0055 }
                com.veriff.sdk.internal.rn$b$a r1 = new com.veriff.sdk.internal.rn$b$a     // Catch:{ all -> 0x0055 }
                r1.<init>(r6)     // Catch:{ all -> 0x0055 }
                com.veriff.sdk.internal.lf r2 = r6.f56549d     // Catch:{ all -> 0x0055 }
                com.veriff.sdk.internal.ld$c r1 = r4.mo55771a(r2, r1)     // Catch:{ all -> 0x0055 }
                com.veriff.sdk.internal.rn r2 = r6.f56546a     // Catch:{ all -> 0x0055 }
                com.veriff.sdk.internal.fm r2 = r2.f56541h     // Catch:{ all -> 0x0055 }
                com.veriff.sdk.internal.rn$b$b r3 = new com.veriff.sdk.internal.rn$b$b     // Catch:{ all -> 0x0055 }
                r3.<init>(r1, r6)     // Catch:{ all -> 0x0055 }
                r2.mo54894a(r3)     // Catch:{ all -> 0x0055 }
                bf0.d r1 = bf0.C21050d.f52856a     // Catch:{ all -> 0x0055 }
                r1 = 0
                p584jl.C17885a.m44462t(r0, r1)
                return
            L_0x0055:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0057 }
            L_0x0057:
                r2 = move-exception
                p584jl.C17885a.m44462t(r0, r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22394rn.C22397b.run():void");
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rn$c */
    public static final class C22401c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22420rr.C22422b f56554a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f56555b;

        public C22401c(C22420rr.C22422b bVar, Throwable th) {
            this.f56554a = bVar;
            this.f56555b = th;
        }

        public final void run() {
            this.f56554a.mo56499a((C21952ld.C21955c) new C21952ld.C21955c.C21956a(this.f56555b));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Landroid/nfc/Tag;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "onTagDiscovered", "(Landroid/nfc/Tag;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rn$d */
    public static final class C22402d implements NfcAdapter.ReaderCallback {

        /* renamed from: a */
        public final /* synthetic */ C22394rn f56556a;

        /* renamed from: b */
        public final /* synthetic */ C21960lf f56557b;

        /* renamed from: c */
        public final /* synthetic */ C22420rr.C22422b f56558c;

        public C22402d(C22394rn rnVar, C21960lf lfVar, C22420rr.C22422b bVar) {
            this.f56556a = rnVar;
            this.f56557b = lfVar;
            this.f56558c = bVar;
        }

        public final void onTagDiscovered(Tag tag) {
            this.f56556a.m54646a(tag, this.f56557b, this.f56558c);
        }
    }

    public C22394rn(Activity activity, C21636fm fmVar, C21636fm fmVar2, C21789ix ixVar, C24236l<? super Tag, IsoDep> lVar) {
        C24362h.m61211f(activity, "activity");
        C24362h.m61211f(fmVar, "ioScheduler");
        C24362h.m61211f(fmVar2, "mainScheduler");
        C24362h.m61211f(ixVar, "flags");
        C24362h.m61211f(lVar, "isoDepFactory");
        this.f56539f = activity;
        this.f56540g = fmVar;
        this.f56541h = fmVar2;
        this.f56542i = ixVar;
        this.f56543j = lVar;
        this.f56535b = C22403ro.m54662b(activity, "android.permission.NFC");
        NfcAdapter a = C22403ro.m54661b(activity);
        this.f56536c = a;
        this.f56537d = a != null;
        this.f56538e = C22420rr.C22423c.LOOKING_FOR_MRTD_TAG;
    }

    /* renamed from: c */
    public boolean mo56467c() {
        NfcAdapter nfcAdapter = this.f56536c;
        if (nfcAdapter != null) {
            return nfcAdapter.isEnabled();
        }
        return false;
    }

    /* renamed from: e */
    public void mo56468e() {
        NfcAdapter nfcAdapter = this.f56536c;
        if (nfcAdapter != null) {
            nfcAdapter.disableReaderMode(this.f56539f);
        }
    }

    /* renamed from: b */
    public boolean mo56466b() {
        return this.f56537d;
    }

    /* renamed from: a */
    public boolean mo56465a() {
        return this.f56535b;
    }

    /* renamed from: a */
    public void mo56464a(C21960lf lfVar, C22420rr.C22422b bVar) {
        C24362h.m61211f(lfVar, "mrz");
        C24362h.m61211f(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (!mo56465a()) {
            bVar.mo56499a((C21952ld.C21955c) new C21952ld.C21955c.C21956a(new IllegalStateException("app doesn't have the NFC permission")));
        } else if (!mo56466b()) {
            bVar.mo56499a((C21952ld.C21955c) new C21952ld.C21955c.C21956a(new IllegalStateException("Device has no NFC adapter")));
        } else if (!mo56467c()) {
            bVar.mo56499a((C21952ld.C21955c) new C21952ld.C21955c.C21956a(new IllegalStateException("NFC is disabled")));
        } else if (this.f56536c == null) {
            bVar.mo56499a((C21952ld.C21955c) new C21952ld.C21955c.C21956a(new IllegalStateException("Adapter is null")));
        } else {
            C22403ro.f56559a.mo60705d("Starting MRTD scan");
            bVar.mo56500a(C22420rr.C22423c.LOOKING_FOR_MRTD_TAG);
            this.f56536c.enableReaderMode(this.f56539f, new C22402d(this, lfVar, bVar), 387, (Bundle) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22394rn(Activity activity, C21636fm fmVar, C21636fm fmVar2, C21789ix ixVar, C24236l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, fmVar, fmVar2, ixVar, (i & 16) != 0 ? C223951.f56544a : lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m54646a(Tag tag, C21960lf lfVar, C22420rr.C22422b bVar) {
        C22403ro.f56559a.mo60705d("Tag found");
        if (tag == null) {
            C22403ro.f56559a.mo60705d("Ignoring null tag");
        } else if (this.f56538e.compareTo(C22420rr.C22423c.LOOKING_FOR_MRTD_TAG) > 0) {
            C22403ro.f56559a.mo60705d("Already reading, ignoring tag");
        } else {
            String[] techList = tag.getTechList();
            C24362h.m61210e(techList, "tag.techList");
            if (!C23816b.m58437S0(techList, "android.nfc.tech.IsoDep")) {
                C22403ro.f56559a.mo60705d("TECH_ISO_DEP not present, ignoring tag");
                return;
            }
            IsoDep invoke = this.f56543j.invoke(tag);
            if (invoke == null) {
                C22403ro.f56559a.mo60705d("ISODEP get failed, ignoring tag");
                return;
            }
            try {
                invoke.connect();
                m54647a(invoke, lfVar, bVar);
            } catch (Throwable th) {
                this.f56541h.mo54894a(new C22401c(bVar, th));
            }
        }
    }

    /* renamed from: a */
    private final void m54647a(IsoDep isoDep, C21960lf lfVar, C22420rr.C22422b bVar) {
        if (C22403ro.m54662b(this.f56539f, "android.permission.VIBRATE")) {
            Object systemService = this.f56539f.getSystemService("vibrator");
            if (systemService != null) {
                ((Vibrator) systemService).vibrate(200);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
            }
        }
        this.f56541h.mo54894a(new C22396a(bVar));
        this.f56540g.mo54894a(new C22397b(this, isoDep, bVar, lfVar));
    }

    /* renamed from: a */
    public void mo56463a(Activity activity) {
        C24362h.m61211f(activity, "activity");
        activity.startActivity(new Intent("android.settings.NFC_SETTINGS"));
    }
}
