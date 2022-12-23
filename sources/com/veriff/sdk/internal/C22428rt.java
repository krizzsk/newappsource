package com.veriff.sdk.internal;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21625ff;
import com.veriff.sdk.internal.C21952ld;
import com.veriff.sdk.internal.C22420rr;
import com.veriff.sdk.internal.C22439rw;
import com.veriff.sdk.views.C22932d;
import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24446b;
import mobi.lab.veriff.util.C24457h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001[Bw\u0012\u0006\u0010T\u001a\u00020S\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u00102\u001a\u00020#\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\bY\u0010ZJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010%R\u0014\u00104\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\u00020<8\u0016X\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010FR\u001a\u0010O\u001a\u00020N8\u0016X\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006\\"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/NfcScanProgressScreen;", "Lcom/veriff/sdk/views/Screen;", "Lcom/veriff/sdk/views/nfc/NfcScanView$Listener;", "Lcom/veriff/sdk/views/nfc/NfcClient$Listener;", "Lbf0/d;", "resume", "pause", "clearTimeout", "enableSkipping", "", "error", "handleError", "", "result", "handleSuccess", "Lcom/veriff/sdk/views/nfc/NfcClient$ScanState;", "state", "logProgress", "onCloseClicked", "onContinueClicked", "onProgress", "Lcom/veriff/sdk/internal/nfc/MrtdReader$Result;", "onResult", "onSkipClicked", "showLooking", "startTimeout", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "", "canSkip", "Z", "Lmobi/lab/veriff/util/Clock;", "clock", "Lmobi/lab/veriff/util/Clock;", "Lcom/veriff/sdk/internal/Scheduler;", "disk", "Lcom/veriff/sdk/internal/Scheduler;", "", "errorCount", "I", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/views/nfc/NfcScanProgressScreen$Listener;", "listener", "Lcom/veriff/sdk/views/nfc/NfcScanProgressScreen$Listener;", "main", "Lcom/veriff/sdk/internal/upload/MediaStorage;", "mediaStorage", "Lcom/veriff/sdk/internal/upload/MediaStorage;", "Lcom/veriff/sdk/internal/nfc/MrzInfo;", "mrz", "Lcom/veriff/sdk/internal/nfc/MrzInfo;", "Lcom/veriff/sdk/views/nfc/NfcClient;", "nfc", "Lcom/veriff/sdk/views/nfc/NfcClient;", "Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "", "stepStart", "Ljava/lang/Long;", "Lcom/veriff/sdk/internal/Idler$Handle;", "timeoutIdler", "Lcom/veriff/sdk/internal/Idler$Handle;", "Ljava/lang/Runnable;", "timeoutRunnable", "Ljava/lang/Runnable;", "totalStart", "Lcom/veriff/sdk/views/nfc/NfcScanView;", "view", "Lcom/veriff/sdk/views/nfc/NfcScanView;", "getView", "()Lcom/veriff/sdk/views/nfc/NfcScanView;", "Landroid/content/Context;", "context", "Lmobi/lab/veriff/util/LanguageUtil;", "languageUtil", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "<init>", "(Landroid/content/Context;Lmobi/lab/veriff/util/LanguageUtil;Lmobi/lab/veriff/util/Clock;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/data/FeatureFlags;Lmobi/lab/veriff/model/AuthenticationFlowSession;Lcom/veriff/sdk/internal/upload/MediaStorage;Lcom/veriff/sdk/views/nfc/NfcClient;Lcom/veriff/sdk/internal/nfc/MrzInfo;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/views/nfc/NfcScanProgressScreen$Listener;)V", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.rt */
public final class C22428rt implements C22420rr.C22422b, C22439rw.C22443d, C22932d {

    /* renamed from: a */
    private final C22439rw f56603a;

    /* renamed from: b */
    private final C21783is f56604b = C21783is.nfc;

    /* renamed from: c */
    private C21625ff.C21626a f56605c;

    /* renamed from: d */
    private final Runnable f56606d = new C22436f(this);

    /* renamed from: e */
    private Long f56607e;

    /* renamed from: f */
    private Long f56608f;

    /* renamed from: g */
    private int f56609g;

    /* renamed from: h */
    private boolean f56610h;

    /* renamed from: i */
    private final C24446b f56611i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C21645fu f56612j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C21910kf f56613k;

    /* renamed from: l */
    private final C21636fm f56614l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C21636fm f56615m;

    /* renamed from: n */
    private final C21789ix f56616n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C22661wm f56617o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C22047nb f56618p;

    /* renamed from: q */
    private final C22420rr f56619q;

    /* renamed from: r */
    private final C21960lf f56620r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C22429a f56621s;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&¨\u0006\u000b"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/NfcScanProgressScreen$Listener;", "", "Lbf0/d;", "onCloseClicked", "onContinueClicked", "onNfcAuthFailed", "Ljava/io/File;", "data", "onNfcScanSuccess", "onSkipClicked", "onStoreFileFailed", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rt$a */
    public interface C22429a {
        /* renamed from: a */
        void mo56510a();

        /* renamed from: a */
        void mo56511a(File file);

        /* renamed from: b */
        void mo56512b();

        /* renamed from: c */
        void mo56513c();

        /* renamed from: d */
        void mo56514d();

        /* renamed from: e */
        void mo56515e();
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rt$b */
    public static final class C22430b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22428rt f56622a;

        /* renamed from: b */
        public final /* synthetic */ C21625ff.C21626a f56623b;

        public C22430b(C22428rt rtVar, C21625ff.C21626a aVar) {
            this.f56622a = rtVar;
            this.f56623b = aVar;
        }

        public final void run() {
            if (this.f56622a.getView().getState() == C22439rw.C22444e.CONNECTION_LOST) {
                this.f56622a.m54704e();
            }
            this.f56623b.mo54900a();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rt$c */
    public static final class C22431c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22428rt f56624a;

        /* renamed from: b */
        public final /* synthetic */ byte[] f56625b;

        /* renamed from: c */
        public final /* synthetic */ C21625ff.C21626a f56626c;

        public C22431c(C22428rt rtVar, byte[] bArr, C21625ff.C21626a aVar) {
            this.f56624a = rtVar;
            this.f56625b = bArr;
            this.f56626c = aVar;
        }

        public final void run() {
            try {
                String i = this.f56624a.f56617o.mo57025i();
                C22047nb c = this.f56624a.f56618p;
                byte[] bArr = this.f56625b;
                C24362h.m61210e(i, "fileName");
                final File a = c.mo55864a(bArr, i);
                this.f56624a.f56615m.mo54894a(new Runnable(this) {

                    /* renamed from: a */
                    public final /* synthetic */ C22431c f56627a;

                    {
                        this.f56627a = r1;
                    }

                    public final void run() {
                        this.f56627a.f56624a.f56621s.mo56511a(a);
                    }
                });
            } catch (IOException e) {
                this.f56624a.f56613k.mo55691b(e, "NfcScan", C21720gj.nfc);
                this.f56624a.f56615m.mo54894a(new Runnable(this) {

                    /* renamed from: a */
                    public final /* synthetic */ C22431c f56629a;

                    {
                        this.f56629a = r1;
                    }

                    public final void run() {
                        this.f56629a.f56624a.f56621s.mo56513c();
                    }
                });
            } catch (Throwable th) {
                this.f56626c.mo54900a();
                throw th;
            }
            this.f56626c.mo54900a();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rt$d */
    public static final class C22434d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22428rt f56630a;

        public C22434d(C22428rt rtVar) {
            this.f56630a = rtVar;
        }

        public final void run() {
            if (this.f56630a.getView().getState() == C22439rw.C22444e.CONNECTED) {
                this.f56630a.getView().setState(C22439rw.C22444e.PROCESSING);
            }
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rt$e */
    public static final class C22435e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22428rt f56631a;

        public C22435e(C22428rt rtVar) {
            this.f56631a = rtVar;
        }

        public final void run() {
            if (this.f56631a.getView().getState() == C22439rw.C22444e.LOOKING) {
                this.f56631a.getView().setState(C22439rw.C22444e.STILL_LOOKING);
            } else if (this.f56631a.getView().getState() == C22439rw.C22444e.LOOKING_SKIPPABLE) {
                this.f56631a.getView().setState(C22439rw.C22444e.STILL_LOOKING_SKIPPABLE);
            }
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rt$f */
    public static final class C22436f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22428rt f56632a;

        public C22436f(C22428rt rtVar) {
            this.f56632a = rtVar;
        }

        public final void run() {
            C21645fu g = this.f56632a.f56612j;
            C21667gf Y = C21716gg.m52877Y();
            C24362h.m61210e(Y, "EventFactory.nfcScanTimeout()");
            g.mo54921a(Y);
            this.f56632a.m54710i();
            this.f56632a.m54707g();
        }
    }

    public C22428rt(Context context, C24457h hVar, C24446b bVar, C21645fu fuVar, C21910kf kfVar, C21636fm fmVar, C21636fm fmVar2, C21789ix ixVar, C22661wm wmVar, C22047nb nbVar, C22420rr rrVar, C21960lf lfVar, C22700xq xqVar, C22429a aVar) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(hVar, "languageUtil");
        C24362h.m61211f(bVar, "clock");
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(fmVar, "disk");
        C24362h.m61211f(fmVar2, "main");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(wmVar, "session");
        C24362h.m61211f(nbVar, "mediaStorage");
        C24362h.m61211f(rrVar, "nfc");
        C24362h.m61211f(lfVar, "mrz");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f56611i = bVar;
        this.f56612j = fuVar;
        this.f56613k = kfVar;
        this.f56614l = fmVar;
        this.f56615m = fmVar2;
        this.f56616n = ixVar;
        this.f56617o = wmVar;
        this.f56618p = nbVar;
        this.f56619q = rrVar;
        this.f56620r = lfVar;
        this.f56621s = aVar;
        this.f56603a = new C22439rw(context, hVar.mo60691a(), xqVar, this);
    }

    public void create() {
        C22932d.C22933a.m56592b(this);
    }

    public void destroy() {
        C22932d.C22933a.m56597g(this);
    }

    public C21783is getPage() {
        return this.f56604b;
    }

    public Integer getStatusBarColor() {
        return C22932d.C22933a.m56591a(this);
    }

    public void pause() {
        this.f56619q.mo56468e();
        m54710i();
    }

    public void resume() {
        this.f56619q.mo56464a(this.f56620r, this);
    }

    public void start() {
        C22932d.C22933a.m56593c(this);
    }

    public void stop() {
        C22932d.C22933a.m56596f(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m54704e() {
        getView().setState(this.f56610h ? C22439rw.C22444e.LOOKING_SKIPPABLE : C22439rw.C22444e.LOOKING);
        getView().postDelayed(new C22435e(this), this.f56616n.mo55425B());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m54707g() {
        this.f56610h = true;
        if (getView().getState() == C22439rw.C22444e.LOOKING) {
            getView().setState(C22439rw.C22444e.LOOKING_SKIPPABLE);
        } else if (getView().getState() == C22439rw.C22444e.STILL_LOOKING) {
            getView().setState(C22439rw.C22444e.STILL_LOOKING_SKIPPABLE);
        }
    }

    /* renamed from: h */
    private final void m54708h() {
        if (!this.f56610h) {
            C21625ff.C21626a aVar = this.f56605c;
            if (aVar != null) {
                aVar.mo54900a();
            }
            this.f56605c = C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null);
            this.f56615m.mo54893a(this.f56616n.mo55424A(), this.f56606d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m54710i() {
        C21625ff.C21626a aVar = this.f56605c;
        if (aVar != null) {
            aVar.mo54900a();
        }
        this.f56605c = null;
        this.f56615m.mo54895b(this.f56606d);
    }

    /* renamed from: a */
    public C22439rw getView() {
        return this.f56603a;
    }

    /* renamed from: b */
    public void mo56507b() {
        this.f56621s.mo56510a();
    }

    /* renamed from: c */
    public void mo56508c() {
        this.f56621s.mo56514d();
    }

    /* renamed from: d */
    public void mo56509d() {
        this.f56621s.mo56515e();
    }

    /* renamed from: f */
    public boolean mo56147f() {
        return C22932d.C22933a.m56598h(this);
    }

    /* renamed from: b */
    private final void m54700b(C22420rr.C22423c cVar) {
        long a = this.f56611i.mo60661a();
        Long l = this.f56607e;
        Long l2 = this.f56608f;
        if (cVar == C22420rr.C22423c.LOOKING_FOR_MRTD_TAG) {
            C21645fu fuVar = this.f56612j;
            C21667gf X = C21716gg.m52876X();
            C24362h.m61210e(X, "EventFactory.nfcScanStarted()");
            fuVar.mo54921a(X);
            this.f56607e = Long.valueOf(a);
        } else if (l == null || l2 == null) {
            C21910kf kfVar = this.f56613k;
            kfVar.mo55690a(new IllegalStateException("Unexpected state " + cVar + " with total=" + l + " step=" + l2), "nfc#logProgress", C21720gj.nfc);
            return;
        } else {
            int i = C22437ru.f56634b[cVar.ordinal()];
            if (i == 1) {
                C21645fu fuVar2 = this.f56612j;
                C21667gf c = C21716gg.m52928c(a - l.longValue(), a - l2.longValue());
                C24362h.m61210e(c, "EventFactory.nfcTagConne…(now - total, now - step)");
                fuVar2.mo54921a(c);
            } else if (i == 2) {
                C21645fu fuVar3 = this.f56612j;
                C21667gf d = C21716gg.m52938d(a - l.longValue(), a - l2.longValue());
                C24362h.m61210e(d, "EventFactory.nfcPhotoDow…(now - total, now - step)");
                fuVar3.mo54921a(d);
            } else if (i == 3) {
                C21645fu fuVar4 = this.f56612j;
                C21667gf e = C21716gg.m52945e(a - l.longValue(), a - l2.longValue());
                C24362h.m61210e(e, "EventFactory.nfcDataDown…(now - total, now - step)");
                fuVar4.mo54921a(e);
            }
        }
        this.f56608f = Long.valueOf(a);
    }

    /* renamed from: a */
    public void mo56500a(C22420rr.C22423c cVar) {
        C24362h.m61211f(cVar, "state");
        m54700b(cVar);
        m54710i();
        int i = C22437ru.f56633a[cVar.ordinal()];
        if (i == 1) {
            m54708h();
            m54704e();
        } else if (i == 2 || i == 3) {
            C22439rw.C22444e eVar = C22439rw.C22444e.CONNECTED;
            if (!EnumSet.of(eVar, C22439rw.C22444e.PROCESSING).contains(getView().getState())) {
                getView().setState(eVar);
                getView().postDelayed(new C22434d(this), this.f56616n.mo55425B());
            }
        } else if (i == 4) {
            getView().setState(C22439rw.C22444e.DONE);
        }
    }

    /* renamed from: a */
    public void mo56499a(C21952ld.C21955c cVar) {
        C24362h.m61211f(cVar, "result");
        if (cVar instanceof C21952ld.C21955c.C21957b) {
            m54698a(((C21952ld.C21955c.C21957b) cVar).mo55778a());
        } else if (cVar instanceof C21952ld.C21955c.C21956a) {
            m54697a(((C21952ld.C21955c.C21956a) cVar).mo55774a());
        }
    }

    /* renamed from: a */
    private final void m54697a(Throwable th) {
        if (th instanceof C21965lh) {
            this.f56621s.mo56512b();
            return;
        }
        C22438rv.f56635a.mo60712w("Nfc failed", th);
        if (th instanceof C21967lj) {
            this.f56613k.mo55690a(th, "nfc", C21720gj.nfc);
        } else {
            this.f56613k.mo55691b(th, "nfc", C21720gj.nfc);
        }
        int i = this.f56609g + 1;
        this.f56609g = i;
        if (i > this.f56616n.mo55476z()) {
            m54707g();
        }
        C21625ff.C21626a a = C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null);
        getView().setState(C22439rw.C22444e.CONNECTION_LOST);
        getView().postDelayed(new C22430b(this, a), this.f56616n.mo55426C());
    }

    /* renamed from: a */
    private final void m54698a(byte[] bArr) {
        this.f56614l.mo54894a(new C22431c(this, bArr, C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null)));
    }
}
