package com.veriff.sdk.internal;

import bf0.C21050d;
import com.appboy.support.AppboyFileUtils;
import com.appsflyer.ServerParameters;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.veriff.sdk.internal.C21625ff;
import ff0.C23349c;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.data.C24422b;
import mobi.lab.veriff.util.C24446b;
import wh0.C25177g;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BG\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u00103\u001a\u00020\u001e¢\u0006\u0004\b7\u00108J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010+R\u0014\u00101\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u0010 R\u0014\u00105\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, mo59060d2 = {"Lcom/veriff/sdk/views/barcode/BarcodePresenter;", "Lcom/veriff/sdk/views/barcode/BarcodeMVP$Presenter;", "Lmobi/lab/veriff/data/AuthenticationFlowStep;", "step", "Lbf0/d;", "onAuthStepStarted", "Ljava/io/File;", "file", "onBarcodePicture", "", "error", "onBarcodeScanFailed", "onBarcodeScanStarted", "", "data", "", "jpegPicture", "", "processingTime", "onBarcodeScanned", "onCloseClicked", "onPause", "onResume", "onTryAgainClicked", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lmobi/lab/veriff/util/Clock;", "clock", "Lmobi/lab/veriff/util/Clock;", "Lcom/veriff/sdk/internal/Scheduler;", "diskScheduler", "Lcom/veriff/sdk/internal/Scheduler;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/views/barcode/BarcodeMVP$Model;", "model", "Lcom/veriff/sdk/views/barcode/BarcodeMVP$Model;", "", "scanAttempts", "I", "scanStartTime", "J", "Lwh0/z;", "scope", "Lwh0/z;", "screenShownTime", "Ljava/lang/Runnable;", "timeoutRunnable", "Ljava/lang/Runnable;", "uiScheduler", "Lcom/veriff/sdk/views/barcode/BarcodeMVP$View;", "view", "Lcom/veriff/sdk/views/barcode/BarcodeMVP$View;", "<init>", "(Lcom/veriff/sdk/views/barcode/BarcodeMVP$View;Lcom/veriff/sdk/views/barcode/BarcodeMVP$Model;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lmobi/lab/veriff/util/Clock;Lwh0/z;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.oq */
public final class C22222oq implements oo$b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f56027a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f56028b;

    /* renamed from: c */
    private long f56029c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Runnable f56030d = new C22230c(this);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final oo$c f56031e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final oo$a f56032f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C21645fu f56033g;

    /* renamed from: h */
    private final C21910kf f56034h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C24446b f56035i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C25235z f56036j;

    /* renamed from: k */
    private final C21636fm f56037k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C21636fm f56038l;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "pictureOk", "Lbf0/d;", "invoke", "(Z)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.oq$a */
    public static final class C22223a extends Lambda implements C24236l<Boolean, C21050d> {

        /* renamed from: a */
        public final /* synthetic */ C22222oq f56039a;

        /* renamed from: b */
        public final /* synthetic */ File f56040b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22223a(C22222oq oqVar, File file) {
            super(1);
            this.f56039a = oqVar;
            this.f56040b = file;
        }

        /* renamed from: a */
        public final void mo56140a(boolean z) {
            this.f56039a.f56038l.mo54895b(this.f56039a.f56030d);
            if (z) {
                C21645fu d = this.f56039a.f56033g;
                C21667gf a = C21716gg.m52881a(this.f56039a.f56027a, this.f56039a.f56035i.mo60662a(this.f56039a.f56028b));
                C24362h.m61210e(a, "EventFactory.barcodeAcce…meSince(screenShownTime))");
                d.mo54921a(a);
                this.f56039a.f56031e.mo56132h();
                C25177g.m63218b(this.f56039a.f56036j, (CoroutineContext) null, new C24240p<C25235z, C23349c<? super C21050d>, Object>(this, (C23349c) null) {

                    /* renamed from: a */
                    public int f56041a;

                    /* renamed from: b */
                    public final /* synthetic */ C22223a f56042b;

                    {
                        this.f56042b = r1;
                    }

                    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                        C24362h.m61211f(cVar, "completion");
                        return 

                        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
                        /* renamed from: com.veriff.sdk.internal.oq$b */
                        public static final class C22227b implements Runnable {

                            /* renamed from: a */
                            public final /* synthetic */ C22222oq f56047a;

                            /* renamed from: b */
                            public final /* synthetic */ byte[] f56048b;

                            /* renamed from: c */
                            public final /* synthetic */ C21625ff.C21626a f56049c;

                            public C22227b(C22222oq oqVar, byte[] bArr, C21625ff.C21626a aVar) {
                                this.f56047a = oqVar;
                                this.f56048b = bArr;
                                this.f56049c = aVar;
                            }

                            public final void run() {
                                try {
                                    this.f56047a.f56032f.mo56118a(this.f56048b, (C24236l<? super File, C21050d>) new C24236l<File, C21050d>(this) {

                                        /* renamed from: a */
                                        public final /* synthetic */ C22227b f56050a;

                                        {
                                            this.f56050a = r1;
                                        }

                                        /* renamed from: a */
                                        public final void mo56143a(File file) {
                                            C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
                                            this.f56050a.f56047a.m54072a(file);
                                            this.f56050a.f56049c.mo54900a();
                                        }

                                        public /* synthetic */ Object invoke(Object obj) {
                                            mo56143a((File) obj);
                                            return C21050d.f52856a;
                                        }
                                    });
                                } catch (IOException e) {
                                    this.f56047a.f56038l.mo54894a(new Runnable(this) {

                                        /* renamed from: a */
                                        public final /* synthetic */ C22227b f56051a;

                                        {
                                            this.f56051a = r1;
                                        }

                                        public final void run() {
                                            this.f56051a.f56047a.mo55830a((Throwable) e);
                                            this.f56051a.f56049c.mo54900a();
                                        }
                                    });
                                }
                            }
                        }

                        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
                        /* renamed from: com.veriff.sdk.internal.oq$c */
                        public static final class C22230c implements Runnable {

                            /* renamed from: a */
                            public final /* synthetic */ C22222oq f56053a;

                            public C22230c(C22222oq oqVar) {
                                this.f56053a = oqVar;
                            }

                            public final void run() {
                                C21645fu d = this.f56053a.f56033g;
                                C21667gf O = C21716gg.m52867O();
                                C24362h.m61210e(O, "EventFactory.barcodeScanFailedWithTimeout()");
                                d.mo54921a(O);
                                this.f56053a.f56031e.mo56129d_();
                            }
                        }

                        public C22222oq(oo$c oo_c, oo$a oo_a, C21645fu fuVar, C21910kf kfVar, C24446b bVar, C25235z zVar, C21636fm fmVar, C21636fm fmVar2) {
                            C24362h.m61211f(oo_c, Promotion.ACTION_VIEW);
                            C24362h.m61211f(oo_a, ServerParameters.MODEL);
                            C24362h.m61211f(fuVar, "analytics");
                            C24362h.m61211f(kfVar, "errorReporter");
                            C24362h.m61211f(bVar, "clock");
                            C24362h.m61211f(zVar, "scope");
                            C24362h.m61211f(fmVar, "diskScheduler");
                            C24362h.m61211f(fmVar2, "uiScheduler");
                            this.f56031e = oo_c;
                            this.f56032f = oo_a;
                            this.f56033g = fuVar;
                            this.f56034h = kfVar;
                            this.f56035i = bVar;
                            this.f56036j = zVar;
                            this.f56037k = fmVar;
                            this.f56038l = fmVar2;
                        }

                        /* renamed from: b */
                        public void mo56123b() {
                            this.f56038l.mo54893a(this.f56032f.mo56115a(), this.f56030d);
                        }

                        /* renamed from: c */
                        public void mo56124c() {
                            this.f56038l.mo54895b(this.f56030d);
                        }

                        /* renamed from: d */
                        public void mo56125d() {
                            C21716gg.m52869Q();
                            oo$c oo_c = this.f56031e;
                            C24422b e = this.f56032f.mo56121d().mo57021e();
                            C24362h.m61210e(e, "model.getSession().activeStep");
                            C21791iy a = e.mo60569a();
                            C24362h.m61210e(a, "model.getSession().activeStep.flowStep");
                            oo_c.mo56127a(a, C21719gi.CLOSE_BUTTON);
                        }

                        /* renamed from: e */
                        public void mo56126e() {
                            this.f56031e.mo56136l();
                            this.f56031e.mo56130e_();
                            this.f56038l.mo54893a(this.f56032f.mo56115a(), this.f56030d);
                        }

                        /* renamed from: a */
                        public void mo55828a() {
                            this.f56029c = this.f56035i.mo60661a();
                            C21645fu fuVar = this.f56033g;
                            C21667gf a = C21716gg.m52883a(this.f56035i.mo60662a(this.f56028b));
                            C24362h.m61210e(a, "EventFactory.barcodeScan…meSince(screenShownTime))");
                            fuVar.mo54921a(a);
                        }

                        /* renamed from: a */
                        public void mo55829a(String str, byte[] bArr, long j) {
                            C24362h.m61211f(str, "data");
                            C24362h.m61211f(bArr, "jpegPicture");
                            C21645fu fuVar = this.f56033g;
                            C21667gf b = C21716gg.m52916b(this.f56035i.mo60662a(this.f56029c), j);
                            C24362h.m61210e(b, "EventFactory.barcodeScan…artTime), processingTime)");
                            fuVar.mo54921a(b);
                            this.f56031e.mo56131g();
                            this.f56037k.mo54894a(new C22227b(this, bArr, C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null)));
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public final void m54072a(File file) {
                            this.f56032f.mo56117a(file, (C24236l<? super Boolean, C21050d>) new C22223a(this, file));
                        }

                        /* renamed from: a */
                        public void mo56122a(C24422b bVar) {
                            C24362h.m61211f(bVar, "step");
                            this.f56028b = this.f56035i.mo60661a();
                            C21645fu fuVar = this.f56033g;
                            C21667gf N = C21716gg.m52866N();
                            C24362h.m61210e(N, "EventFactory.barcodeScanScreenShown()");
                            fuVar.mo54921a(N);
                        }

                        /* renamed from: a */
                        public void mo55830a(Throwable th) {
                            C24362h.m61211f(th, "error");
                            C22231or.f56054a.mo60712w("Barcode scan failed", th);
                            C21645fu fuVar = this.f56033g;
                            C21667gf P = C21716gg.m52868P();
                            C24362h.m61210e(P, "EventFactory.barcodeScanFailedWithError()");
                            fuVar.mo54921a(P);
                            this.f56034h.mo55690a(th, "onBarcodeScanFailed", C21720gj.barcode);
                            this.f56031e.mo56129d_();
                        }
                    }
