package com.veriff.sdk.internal;

import bf0.C21050d;
import com.veriff.sdk.internal.C21625ff;
import com.veriff.sdk.internal.C21924kn;
import ff0.C23349c;
import gf0.C23413c;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lf0.C24236l;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.util.C24457h;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016J\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J$\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\"8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, mo59060d2 = {"Lcom/veriff/sdk/views/barcode/BarcodeModel;", "Lcom/veriff/sdk/views/barcode/BarcodeMVP$Model;", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "getSession", "", "jpegPicture", "Lkotlin/Function1;", "Ljava/io/File;", "Lbf0/d;", "onDone", "savePictureToDisk", "picture", "Lkotlin/Function0;", "tryPictureForDocBack", "", "callback", "validateBarcodePicture", "Lwh0/z;", "coroutineScope", "Lwh0/z;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lmobi/lab/veriff/util/LanguageUtil;", "languageutil", "Lmobi/lab/veriff/util/LanguageUtil;", "", "maxScanAttempts", "I", "getMaxScanAttempts", "()I", "Lcom/veriff/sdk/internal/upload/PictureStorage;", "pictureStorage", "Lcom/veriff/sdk/internal/upload/PictureStorage;", "", "resultDelayMs", "J", "getResultDelayMs", "()J", "scanTimeoutMs", "getScanTimeoutMs", "session", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "Lcom/veriff/sdk/internal/Scheduler;", "uiScheduler", "Lcom/veriff/sdk/internal/Scheduler;", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "uploadManager", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "<init>", "(Lwh0/z;Lmobi/lab/veriff/model/AuthenticationFlowSession;Lcom/veriff/sdk/internal/upload/PictureStorage;Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;Lmobi/lab/veriff/util/LanguageUtil;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/Scheduler;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.op */
public final class C22216op implements oo$a {

    /* renamed from: a */
    private final long f56001a;

    /* renamed from: b */
    private final int f56002b;

    /* renamed from: c */
    private final long f56003c;

    /* renamed from: d */
    private final C25235z f56004d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C22661wm f56005e;

    /* renamed from: f */
    private final C22061nh f56006f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C22064nk f56007g;

    /* renamed from: h */
    private final C24457h f56008h;

    /* renamed from: i */
    private final C21789ix f56009i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C21636fm f56010j;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.op$a */
    public static final class C22217a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C24236l f56011a;

        /* renamed from: b */
        public final /* synthetic */ File f56012b;

        public C22217a(C24236l lVar, File file) {
            this.f56011a = lVar;
            this.f56012b = file;
        }

        public final void run() {
            this.f56011a.invoke(this.f56012b);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.barcode.BarcodeModel$tryPictureForDocBack$1", mo58555f = "BarcodeModel.kt", mo58556l = {96}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.op$b */
    public static final class C22218b extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f56013a;

        /* renamed from: b */
        public final /* synthetic */ C22216op f56014b;

        /* renamed from: c */
        public final /* synthetic */ C22046na f56015c;

        /* renamed from: d */
        public final /* synthetic */ Runnable f56016d;

        /* renamed from: e */
        public final /* synthetic */ C24236l f56017e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22218b(C22216op opVar, C22046na naVar, Runnable runnable, C24236l lVar, C23349c cVar) {
            super(2, cVar);
            this.f56014b = opVar;
            this.f56015c = naVar;
            this.f56016d = runnable;
            this.f56017e = lVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22218b(this.f56014b, this.f56015c, this.f56016d, this.f56017e, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22218b) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f56013a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C22064nk a = this.f56014b.f56007g;
                C22046na naVar = this.f56015c;
                this.f56013a = 1;
                obj = a.mo55947a(naVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C21924kn knVar = (C21924kn) obj;
            this.f56014b.f56010j.mo54895b(this.f56016d);
            if (knVar instanceof C21924kn.C21927c) {
                this.f56017e.invoke(Boolean.valueOf(((C22561tq) ((C21924kn.C21927c) knVar).mo55715a()).mo56763b()));
            } else if ((knVar instanceof C21924kn.C21926b) || (knVar instanceof C21924kn.C21925a) || (knVar instanceof C21924kn.C21928d)) {
                this.f56017e.invoke(Boolean.FALSE);
            }
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "success", "Lbf0/d;", "invoke", "(Z)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.op$c */
    public static final class C22219c extends Lambda implements C24236l<Boolean, C21050d> {

        /* renamed from: a */
        public final /* synthetic */ C22216op f56018a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f56019b;

        /* renamed from: c */
        public final /* synthetic */ C24225a f56020c;

        /* renamed from: d */
        public final /* synthetic */ C21625ff.C21626a f56021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22219c(C22216op opVar, AtomicBoolean atomicBoolean, C24225a aVar, C21625ff.C21626a aVar2) {
            super(1);
            this.f56018a = opVar;
            this.f56019b = atomicBoolean;
            this.f56020c = aVar;
            this.f56021d = aVar2;
        }

        /* renamed from: a */
        public final void mo56138a(boolean z) {
            if (this.f56019b.compareAndSet(false, true)) {
                if (z) {
                    this.f56018a.f56005e.mo57017b("DRIVERS_LICENSE");
                }
                this.f56020c.invoke();
                this.f56021d.mo54900a();
            }
        }

        public /* synthetic */ Object invoke(Object obj) {
            mo56138a(((Boolean) obj).booleanValue());
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.op$d */
    public static final class C22220d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C24236l f56022a;

        public C22220d(C24236l lVar) {
            this.f56022a = lVar;
        }

        public final void run() {
            this.f56022a.invoke(Boolean.FALSE);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.barcode.BarcodeModel$validateBarcodePicture$1", mo58555f = "BarcodeModel.kt", mo58556l = {60}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.op$e */
    public static final class C22221e extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f56023a;

        /* renamed from: b */
        public final /* synthetic */ C22216op f56024b;

        /* renamed from: c */
        public final /* synthetic */ C22046na f56025c;

        /* renamed from: d */
        public final /* synthetic */ C24236l f56026d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22221e(C22216op opVar, C22046na naVar, C24236l lVar, C23349c cVar) {
            super(2, cVar);
            this.f56024b = opVar;
            this.f56025c = naVar;
            this.f56026d = lVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22221e(this.f56024b, this.f56025c, this.f56026d, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22221e) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f56023a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C22064nk a = this.f56024b.f56007g;
                C22046na naVar = this.f56025c;
                this.f56023a = 1;
                obj = a.mo55947a(naVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C21924kn knVar = (C21924kn) obj;
            if (knVar instanceof C21924kn.C21927c) {
                this.f56026d.invoke(Boolean.valueOf(((C22561tq) ((C21924kn.C21927c) knVar).mo55715a()).mo56763b()));
            } else if ((knVar instanceof C21924kn.C21926b) || (knVar instanceof C21924kn.C21925a) || (knVar instanceof C21924kn.C21928d)) {
                this.f56026d.invoke(Boolean.FALSE);
            }
            return C21050d.f52856a;
        }
    }

    public C22216op(C25235z zVar, C22661wm wmVar, C22061nh nhVar, C22064nk nkVar, C24457h hVar, C21789ix ixVar, C21636fm fmVar) {
        C24362h.m61211f(zVar, "coroutineScope");
        C24362h.m61211f(wmVar, "session");
        C24362h.m61211f(nhVar, "pictureStorage");
        C24362h.m61211f(nkVar, "uploadManager");
        C24362h.m61211f(hVar, "languageutil");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(fmVar, "uiScheduler");
        this.f56004d = zVar;
        this.f56005e = wmVar;
        this.f56006f = nhVar;
        this.f56007g = nkVar;
        this.f56008h = hVar;
        this.f56009i = ixVar;
        this.f56010j = fmVar;
        this.f56001a = ixVar.mo55430G();
        this.f56002b = ixVar.mo55431H();
        this.f56003c = ixVar.mo55432I();
    }

    /* renamed from: d */
    public C22661wm mo56121d() {
        return this.f56005e;
    }

    /* renamed from: a */
    public long mo56115a() {
        return this.f56001a;
    }

    /* renamed from: b */
    public int mo56119b() {
        return this.f56002b;
    }

    /* renamed from: c */
    public long mo56120c() {
        return this.f56003c;
    }

    /* renamed from: a */
    public void mo56118a(byte[] bArr, C24236l<? super File, C21050d> lVar) throws IOException {
        C24362h.m61211f(bArr, "jpegPicture");
        C24362h.m61211f(lVar, "onDone");
        String i = this.f56005e.mo57025i();
        C22061nh nhVar = this.f56006f;
        C24362h.m61210e(i, "fileName");
        this.f56010j.mo54894a(new C22217a(lVar, nhVar.mo55941a(bArr, i, false, 90)));
    }

    /* renamed from: a */
    public void mo56117a(File file, C24236l<? super Boolean, C21050d> lVar) {
        C24236l<? super Boolean, C21050d> lVar2 = lVar;
        File file2 = file;
        C24362h.m61211f(file2, "picture");
        C24362h.m61211f(lVar2, WidgetMessageParser.KEY_CALLBACK);
        String a = this.f56005e.mo57012a();
        C24362h.m61210e(a, "session.idvVerificationId");
        C25177g.m63218b(this.f56004d, (CoroutineContext) null, new C22221e(this, new C22046na(a, file2, C21882jp.DOCUMENT_BACK_BARCODE.mo55596b(), true, true, false, "DRIVERS_LICENSE", this.f56008h.mo60697c(), (C22547te) null, false, (String) null, 1792, (DefaultConstructorMarker) null), lVar2, (C23349c) null), 3);
    }

    /* renamed from: a */
    public void mo56116a(File file, C24225a<C21050d> aVar) {
        C24225a<C21050d> aVar2 = aVar;
        C24362h.m61211f(file, "picture");
        C24362h.m61211f(aVar2, "onDone");
        C22219c cVar = new C22219c(this, new AtomicBoolean(false), aVar2, C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null));
        C22220d dVar = new C22220d(cVar);
        this.f56010j.mo54893a(this.f56009i.mo55472w(), dVar);
        String a = this.f56005e.mo57012a();
        C24362h.m61210e(a, "session.idvVerificationId");
        C25177g.m63218b(this.f56004d, (CoroutineContext) null, new C22218b(this, new C22046na(a, file, C21882jp.DOCUMENT_BACK.mo55595a(), true, true, false, "DRIVERS_LICENSE", this.f56008h.mo60697c(), (C22547te) null, false, (String) null, 1792, (DefaultConstructorMarker) null), dVar, cVar, (C23349c) null), 3);
    }
}
