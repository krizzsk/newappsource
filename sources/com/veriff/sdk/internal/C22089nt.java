package com.veriff.sdk.internal;

import android.net.Uri;
import bf0.C21049c;
import bf0.C21050d;
import com.veriff.sdk.internal.C21625ff;
import com.veriff.sdk.internal.C22682xf;
import com.veriff.sdk.internal.nw$a;
import com.veriff.sdk.internal.nw$c;
import ff0.C23349c;
import gf0.C23413c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C23812a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C24205a;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import lf0.C24225a;
import lf0.C24240p;
import mf0.C24361g;
import mf0.C24362h;
import p001a0.C0016g;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25235z;
import zh0.C25527h;
import zh0.C25528i;
import zh0.C25531l;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010P\u001a\u00020\r\u0012\u0006\u0010>\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bX\u0010YJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u0004H\u0002R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u00101\u001a\u0004\b2\u00103R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010$R\u0014\u00108\u001a\u0002078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0017\u0010>\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010C\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0017\u0010L\u001a\u00020K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010P\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bP\u0010?\u001a\u0004\bQ\u0010AR!\u0010W\u001a\b\u0012\u0004\u0012\u0002050R8VX\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\u0002\u0004\n\u0002\b\u0019¨\u0006Z"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressModel;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Model;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action;", "action", "Lbf0/d;", "doAction", "(Lcom/veriff/sdk/views/address/AddressScreenMvi$Action;Lff0/c;)Ljava/lang/Object;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction;", "doAddressCaptureAction", "(Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction;Lff0/c;)Ljava/lang/Object;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction;", "doAddressIntroAction", "(Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction;Lff0/c;)Ljava/lang/Object;", "", "getContextForFirstPhoto", "getContextForSecondPhoto", "getFilenameForFirstPhoto", "getFilenameForSecondPhoto", "", "Landroid/net/Uri;", "selectedUris", "Lmobi/lab/veriff/util/files/FileResolver;", "fileResolver", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/views/address/FileWithType;", "getFilesWithTypes", "logAddressIntroScreenShown", "Ljava/io/IOException;", "ex", "reportError", "waitAndCaptureSecondPhoto", "Lzh0/h;", "actions", "Lzh0/h;", "getActions", "()Lzh0/h;", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "getAnalytics", "()Lcom/veriff/sdk/internal/analytics/Analytics;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "getErrorReporter", "()Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "getFeatureFlags", "()Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lmobi/lab/veriff/util/files/FileResolver;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$ViewState;", "internalViewState", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "isCameraBusy", "Z", "isTakingPicture", "language", "Ljava/lang/String;", "getLanguage", "()Ljava/lang/String;", "Lwh0/z;", "scope", "Lwh0/z;", "getScope", "()Lwh0/z;", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "Lcom/veriff/sdk/internal/Scheduler;", "uiScheduler", "Lcom/veriff/sdk/internal/Scheduler;", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "uploadManager", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "getUploadManager", "()Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "verificationId", "getVerificationId", "Lzh0/l;", "viewStates$delegate", "Lbf0/c;", "getViewStates", "()Lzh0/l;", "viewStates", "<init>", "(Lwh0/z;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;Ljava/lang/String;Ljava/lang/String;Lmobi/lab/veriff/model/AuthenticationFlowSession;Lkotlinx/coroutines/CoroutineDispatcher;Lmobi/lab/veriff/util/files/FileResolver;Lcom/veriff/sdk/internal/Scheduler;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.nt */
public final class C22089nt implements nw$b {

    /* renamed from: a */
    private final C25527h<nw$a> f55727a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C25527h<nw$c> f55728b;

    /* renamed from: c */
    private final C21049c f55729c;

    /* renamed from: f */
    private final C25235z f55730f;

    /* renamed from: g */
    private final C21645fu f55731g;

    /* renamed from: h */
    private final C21910kf f55732h;

    /* renamed from: i */
    private final C21789ix f55733i;

    /* renamed from: j */
    private final C22064nk f55734j;

    /* renamed from: k */
    private final String f55735k;

    /* renamed from: l */
    private final String f55736l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C22661wm f55737m;

    /* renamed from: n */
    private final CoroutineDispatcher f55738n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C22682xf f55739o;

    /* renamed from: p */
    private final C21636fm f55740p;

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressModel$1", mo58555f = "AddressModel.kt", mo58556l = {96}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action;", "it", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nt$1 */
    public static final class C220901 extends SuspendLambda implements C24240p<nw$a, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55741a;

        /* renamed from: b */
        public final /* synthetic */ C22089nt f55742b;

        /* renamed from: c */
        private /* synthetic */ Object f55743c;

        {
            this.f55742b = r1;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            C220901 r0 = new C220901(this.f55742b, cVar);
            r0.f55743c = obj;
            return r0;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C220901) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55741a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C22089nt ntVar = this.f55742b;
                this.f55741a = 1;
                if (ntVar.mo55993a((nw$a) this.f55743c, (C23349c<? super C21050d>) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C21050d.f52856a;
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressModel", mo58555f = "AddressModel.kt", mo58556l = {104, 105}, mo58557m = "doAction")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action;", "action", "Lff0/c;", "Lbf0/d;", "continuation", "", "doAction"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nt$a */
    public static final class C22091a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f55744a;

        /* renamed from: b */
        public int f55745b;

        /* renamed from: c */
        public final /* synthetic */ C22089nt f55746c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22091a(C22089nt ntVar, C23349c cVar) {
            super(cVar);
            this.f55746c = ntVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f55744a = obj;
            this.f55745b |= Integer.MIN_VALUE;
            return this.f55746c.mo55993a((nw$a) null, (C23349c<? super C21050d>) this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressModel", mo58555f = "AddressModel.kt", mo58556l = {160, 162, 166, 190}, mo58557m = "doAddressCaptureAction")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction;", "action", "Lff0/c;", "Lbf0/d;", "continuation", "", "doAddressCaptureAction"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nt$b */
    public static final class C22092b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f55747a;

        /* renamed from: b */
        public int f55748b;

        /* renamed from: c */
        public final /* synthetic */ C22089nt f55749c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22092b(C22089nt ntVar, C23349c cVar) {
            super(cVar);
            this.f55749c = ntVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f55747a = obj;
            this.f55748b |= Integer.MIN_VALUE;
            return this.f55749c.mo55991a((nw$a.C22103a) null, (C23349c<? super C21050d>) this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressModel$doAddressCaptureAction$2", mo58555f = "AddressModel.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nt$c */
    public static final class C22093c extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55750a;

        /* renamed from: b */
        public final /* synthetic */ C22089nt f55751b;

        /* renamed from: c */
        public final /* synthetic */ C22046na f55752c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22093c(C22089nt ntVar, C22046na naVar, C23349c cVar) {
            super(2, cVar);
            this.f55751b = ntVar;
            this.f55752c = naVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22093c(this.f55751b, this.f55752c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22093c) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f55750a == 0) {
                C17885a.m44475z0(obj);
                this.f55751b.mo56003j().mo55948a(this.f55752c);
                return C21050d.f52856a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressModel", mo58555f = "AddressModel.kt", mo58556l = {115, 118, 121}, mo58557m = "doAddressIntroAction")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction;", "action", "Lff0/c;", "Lbf0/d;", "continuation", "", "doAddressIntroAction"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nt$d */
    public static final class C22094d extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f55753a;

        /* renamed from: b */
        public int f55754b;

        /* renamed from: c */
        public final /* synthetic */ C22089nt f55755c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22094d(C22089nt ntVar, C23349c cVar) {
            super(cVar);
            this.f55755c = ntVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f55753a = obj;
            this.f55754b |= Integer.MIN_VALUE;
            return this.f55755c.mo55992a((nw$a.C22111b) null, (C23349c<? super C21050d>) this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressModel$doAddressIntroAction$2", mo58555f = "AddressModel.kt", mo58556l = {145, 147}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nt$e */
    public static final class C22095e extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55756a;

        /* renamed from: b */
        public final /* synthetic */ C22089nt f55757b;

        /* renamed from: c */
        public final /* synthetic */ nw$a.C22111b f55758c;

        /* renamed from: d */
        public final /* synthetic */ C21625ff.C21626a f55759d;

        @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressModel$doAddressIntroAction$2$1$1", mo58555f = "AddressModel.kt", mo58556l = {}, mo58557m = "invokeSuspend")
        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/veriff/sdk/views/address/AddressModel$doAddressIntroAction$2$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nt$e$a */
        public static final class C22096a extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

            /* renamed from: a */
            public int f55760a;

            /* renamed from: b */
            public final /* synthetic */ C22046na f55761b;

            /* renamed from: c */
            public final /* synthetic */ C22095e f55762c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22096a(C22046na naVar, C23349c cVar, C22095e eVar) {
                super(2, cVar);
                this.f55761b = naVar;
                this.f55762c = eVar;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                C24362h.m61211f(cVar, "completion");
                return new C22096a(this.f55761b, cVar, this.f55762c);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C22096a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.f55760a == 0) {
                    C17885a.m44475z0(obj);
                    this.f55762c.f55757b.mo56003j().mo55948a(this.f55761b);
                    return C21050d.f52856a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22095e(C22089nt ntVar, nw$a.C22111b bVar, C21625ff.C21626a aVar, C23349c cVar) {
            super(2, cVar);
            this.f55757b = ntVar;
            this.f55758c = bVar;
            this.f55759d = aVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22095e(this.f55757b, this.f55758c, this.f55759d, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22095e) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55756a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                List<C22150ny> a = this.f55757b.m53880a(((nw$a.C22111b.C22114c) this.f55758c).mo56034a(), this.f55757b.f55739o, this.f55757b.f55737m, this.f55757b.mo56002i());
                if (!a.isEmpty()) {
                    for (C22150ny nyVar : a) {
                        String k = this.f55757b.mo56004k();
                        File a2 = nyVar.mo56066a();
                        String h = this.f55757b.f55737m.mo57024h();
                        C24362h.m61210e(h, "session.contextForActiveStepSecondPhoto");
                        String l = this.f55757b.mo56005l();
                        String h2 = this.f55757b.f55737m.mo57024h();
                        C24362h.m61210e(h2, "session.contextForActiveStepSecondPhoto");
                        C22543tb tbVar = new C22543tb(new C22544tc(h2));
                        String b = nyVar.mo56067b();
                        C22046na naVar = naVar2;
                        C22046na naVar2 = new C22046na(k, a2, h, true, false, false, (String) null, l, tbVar, true, b);
                        C25177g.m63218b(this.f55757b.mo56001h(), (CoroutineContext) null, new C22096a(naVar, (C23349c) null, this), 3);
                    }
                    C25527h c = this.f55757b.f55728b;
                    nw$c.C22118a aVar = nw$c.C22118a.f55787a;
                    this.f55756a = 1;
                    if (c.emit(aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    C25527h c2 = this.f55757b.f55728b;
                    nw$c.C22119b bVar = nw$c.C22119b.f55788a;
                    this.f55756a = 2;
                    if (c2.emit(bVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i == 1 || i == 2) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f55759d.mo54900a();
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lzh0/l;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$ViewState;", "invoke", "()Lzh0/l;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nt$f */
    public static final class C22097f extends Lambda implements C24225a<C25531l<? extends nw$c>> {

        /* renamed from: a */
        public final /* synthetic */ C22089nt f55763a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22097f(C22089nt ntVar) {
            super(0);
            this.f55763a = ntVar;
        }

        /* renamed from: a */
        public final C25531l<nw$c> invoke() {
            return new C25528i(this.f55763a.f55728b);
        }
    }

    /*  JADX ERROR: Inner class code generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:274)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: INVOKE  
          (wrap: wh0.z : 0x0002: INVOKE  (r0v1 wh0.z) = 
          (wrap: com.veriff.sdk.internal.nt : 0x0000: IGET  (r0v0 com.veriff.sdk.internal.nt) = (r4v0 'this' com.veriff.sdk.internal.nt$g A[THIS]) com.veriff.sdk.internal.nt.g.a com.veriff.sdk.internal.nt)
         com.veriff.sdk.internal.nt.h():wh0.z type: VIRTUAL)
          (null kotlin.coroutines.CoroutineContext)
          (wrap: com.veriff.sdk.internal.nt$g$1 : 0x0009: CONSTRUCTOR  (r1v0 com.veriff.sdk.internal.nt$g$1) = 
          (r4v0 'this' com.veriff.sdk.internal.nt$g A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.nt.g.1.<init>(com.veriff.sdk.internal.nt$g, ff0.c):void type: CONSTRUCTOR)
          (3 int)
         wh0.g.b(wh0.z, kotlin.coroutines.CoroutineContext, lf0.p, int):wh0.o1 type: STATIC in method: com.veriff.sdk.internal.nt.g.run():void, dex: classes4.dex
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	... 35 more
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r1v0 com.veriff.sdk.internal.nt$g$1) = 
          (r4v0 'this' com.veriff.sdk.internal.nt$g A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.nt.g.1.<init>(com.veriff.sdk.internal.nt$g, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.nt.g.run():void, dex: classes4.dex
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	... 44 more
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:274)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
        	... 50 more
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000c: RETURN  
          (wrap: com.veriff.sdk.internal.nt$g$1 : 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.nt$g$1) = 
          (wrap: com.veriff.sdk.internal.nt$g : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.nt$g) = (r1v0 'this' com.veriff.sdk.internal.nt$g$1 A[THIS]) com.veriff.sdk.internal.nt.g.1.b com.veriff.sdk.internal.nt$g)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.nt.g.1.<init>(com.veriff.sdk.internal.nt$g, ff0.c):void type: CONSTRUCTOR)
         in method: com.veriff.sdk.internal.nt.g.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	... 67 more
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.nt$g$1) = 
          (wrap: com.veriff.sdk.internal.nt$g : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.nt$g) = (r1v0 'this' com.veriff.sdk.internal.nt$g$1 A[THIS]) com.veriff.sdk.internal.nt.g.1.b com.veriff.sdk.internal.nt$g)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.nt.g.1.<init>(com.veriff.sdk.internal.nt$g, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.nt.g.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	... 76 more
        Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: com.veriff.sdk.internal.nt.g.1
        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
        	... 80 more
        */
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nt$g */
    public static final class C22098g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22089nt f55764a;

        @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressModel$waitAndCaptureSecondPhoto$1$1", mo58555f = "AddressModel.kt", mo58556l = {229}, mo58557m = "invokeSuspend")
        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nt$g$1 */
        public static final class C220991 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

            /* renamed from: a */
            public int f55765a;

            /* renamed from: b */
            public final /* synthetic */ C22098g f55766b;

            {
                this.f55766b = r1;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                C24362h.m61211f(cVar, "completion");
                return new C220991(this.f55766b, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C220991) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f55765a;
                if (i == 0) {
                    C17885a.m44475z0(obj);
                    C25527h c = this.f55766b.f55764a.f55728b;
                    nw$c.C22123f fVar = new nw$c.C22123f(this.f55766b.f55764a.mo56002i().mo55442S());
                    this.f55765a = 1;
                    if (c.emit(fVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i == 1) {
                    C17885a.m44475z0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C21050d.f52856a;
            }
        }

        public C22098g(C22089nt ntVar) {
            this.f55764a = ntVar;
        }

        public final void run() {
            C25177g.m63218b(this.f55764a.mo56001h(), (CoroutineContext) null, new C220991(this, (C23349c) null), 3);
        }
    }

    public C22089nt(C25235z zVar, C21645fu fuVar, C21910kf kfVar, C21789ix ixVar, C22064nk nkVar, String str, String str2, C22661wm wmVar, CoroutineDispatcher coroutineDispatcher, C22682xf xfVar, C21636fm fmVar) {
        C24362h.m61211f(zVar, "scope");
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(nkVar, "uploadManager");
        C24362h.m61211f(str, "verificationId");
        C24362h.m61211f(str2, "language");
        C24362h.m61211f(wmVar, "session");
        C24362h.m61211f(coroutineDispatcher, "ioDispatcher");
        C24362h.m61211f(xfVar, "fileResolver");
        C24362h.m61211f(fmVar, "uiScheduler");
        this.f55730f = zVar;
        this.f55731g = fuVar;
        this.f55732h = kfVar;
        this.f55733i = ixVar;
        this.f55734j = nkVar;
        this.f55735k = str;
        this.f55736l = str2;
        this.f55737m = wmVar;
        this.f55738n = coroutineDispatcher;
        this.f55739o = xfVar;
        this.f55740p = fmVar;
        Object obj = nw$a.C22117c.f55786a;
        this.f55727a = new StateFlowImpl(obj == null ? C24361g.f61673b : obj);
        Object obj2 = nw$c.C22126i.f55794a;
        this.f55728b = new StateFlowImpl(obj2 == null ? C24361g.f61673b : obj2);
        this.f55729c = C23812a.m58432b(new C22097f(this));
        C24205a.m60672a(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C25528i(mo55994a()), new C220901(this, (C23349c) null)), zVar);
    }

    /* renamed from: m */
    private final void m53884m() {
        this.f55740p.mo54893a(500, new C22098g(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo55991a(com.veriff.sdk.internal.nw$a.C22103a r22, ff0.C23349c<? super bf0.C21050d> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof com.veriff.sdk.internal.C22089nt.C22092b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.veriff.sdk.internal.nt$b r3 = (com.veriff.sdk.internal.C22089nt.C22092b) r3
            int r4 = r3.f55748b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f55748b = r4
            goto L_0x001e
        L_0x0019:
            com.veriff.sdk.internal.nt$b r3 = new com.veriff.sdk.internal.nt$b
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f55747a
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.f55748b
            r6 = 2
            r7 = 1
            r8 = 3
            r9 = 4
            if (r5 == 0) goto L_0x0040
            if (r5 == r7) goto L_0x003b
            if (r5 == r6) goto L_0x003b
            if (r5 == r8) goto L_0x003b
            if (r5 != r9) goto L_0x0033
            goto L_0x003b
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            p584jl.C17885a.m44475z0(r2)
            goto L_0x0124
        L_0x0040:
            p584jl.C17885a.m44475z0(r2)
            com.veriff.sdk.internal.nw$a$a$c r2 = com.veriff.sdk.internal.nw$a.C22103a.C22106c.f55775a
            boolean r2 = mf0.C24362h.m61206a(r1, r2)
            r5 = 0
            if (r2 == 0) goto L_0x0071
            com.veriff.sdk.internal.ix r1 = r0.f55733i
            boolean r1 = r1.mo55442S()
            if (r1 == 0) goto L_0x0061
            zh0.h<com.veriff.sdk.internal.nw$c> r1 = r0.f55728b
            com.veriff.sdk.internal.nw$c$e r2 = com.veriff.sdk.internal.nw$c.C22122e.f55790a
            r3.f55748b = r7
            java.lang.Object r1 = r1.emit(r2, r3)
            if (r1 != r4) goto L_0x0124
            return r4
        L_0x0061:
            zh0.h<com.veriff.sdk.internal.nw$c> r1 = r0.f55728b
            com.veriff.sdk.internal.nw$c$f r2 = new com.veriff.sdk.internal.nw$c$f
            r2.<init>(r5)
            r3.f55748b = r6
            java.lang.Object r1 = r1.emit(r2, r3)
            if (r1 != r4) goto L_0x0124
            return r4
        L_0x0071:
            com.veriff.sdk.internal.nw$a$a$g r2 = com.veriff.sdk.internal.nw$a.C22103a.C22110g.f55780a
            boolean r2 = mf0.C24362h.m61206a(r1, r2)
            if (r2 == 0) goto L_0x007b
            goto L_0x0124
        L_0x007b:
            com.veriff.sdk.internal.nw$a$a$d r2 = com.veriff.sdk.internal.nw$a.C22103a.C22107d.f55776a
            boolean r2 = mf0.C24362h.m61206a(r1, r2)
            if (r2 == 0) goto L_0x0095
            zh0.h<com.veriff.sdk.internal.nw$c> r1 = r0.f55728b
            com.veriff.sdk.internal.nw$c$g r2 = new com.veriff.sdk.internal.nw$c$g
            java.lang.String r5 = "capture"
            r2.<init>(r5)
            r3.f55748b = r8
            java.lang.Object r1 = r1.emit(r2, r3)
            if (r1 != r4) goto L_0x0124
            return r4
        L_0x0095:
            com.veriff.sdk.internal.nw$a$a$a r2 = com.veriff.sdk.internal.nw$a.C22103a.C22104a.f55773a
            boolean r2 = mf0.C24362h.m61206a(r1, r2)
            if (r2 == 0) goto L_0x009f
            goto L_0x0124
        L_0x009f:
            com.veriff.sdk.internal.nw$a$a$b r2 = com.veriff.sdk.internal.nw$a.C22103a.C22105b.f55774a
            boolean r2 = mf0.C24362h.m61206a(r1, r2)
            if (r2 == 0) goto L_0x00a9
            goto L_0x0124
        L_0x00a9:
            boolean r2 = r1 instanceof com.veriff.sdk.internal.nw$a.C22103a.C22108e
            if (r2 == 0) goto L_0x00bd
            com.veriff.sdk.internal.nw$a$a$e r1 = (com.veriff.sdk.internal.nw$a.C22103a.C22108e) r1
            com.veriff.sdk.internal.wl r1 = r1.mo56021a()
            boolean r1 = r1.mo57007b()
            if (r1 == 0) goto L_0x0124
            r21.m53884m()
            goto L_0x0124
        L_0x00bd:
            boolean r2 = r1 instanceof com.veriff.sdk.internal.nw$a.C22103a.C22109f
            if (r2 == 0) goto L_0x0124
            com.veriff.sdk.internal.na r2 = new com.veriff.sdk.internal.na
            java.lang.String r10 = r0.f55735k
            com.veriff.sdk.internal.nw$a$a$f r1 = (com.veriff.sdk.internal.nw$a.C22103a.C22109f) r1
            java.io.File r11 = r1.mo56026b()
            com.veriff.sdk.internal.wl r5 = r1.mo56025a()
            java.lang.String r12 = r5.mo57008c()
            java.lang.String r5 = "action.photoConf.pictureContext"
            mf0.C24362h.m61210e(r12, r5)
            r13 = 1
            r14 = 0
            r15 = 0
            java.lang.String r6 = r0.f55736l
            com.veriff.sdk.internal.tb r7 = new com.veriff.sdk.internal.tb
            com.veriff.sdk.internal.tc r9 = new com.veriff.sdk.internal.tc
            com.veriff.sdk.internal.wl r16 = r1.mo56025a()
            java.lang.String r8 = r16.mo57008c()
            mf0.C24362h.m61210e(r8, r5)
            r9.<init>(r8)
            r7.<init>(r9)
            r19 = 1
            r16 = 0
            java.lang.String r20 = "image/png"
            r9 = r2
            r17 = r6
            r18 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            wh0.z r5 = r0.f55730f
            com.veriff.sdk.internal.nt$c r6 = new com.veriff.sdk.internal.nt$c
            r7 = 0
            r6.<init>(r0, r2, r7)
            r2 = 3
            wh0.C25177g.m63218b(r5, r7, r6, r2)
            com.veriff.sdk.internal.wl r1 = r1.mo56025a()
            boolean r1 = r1.mo57007b()
            if (r1 != 0) goto L_0x0124
            zh0.h<com.veriff.sdk.internal.nw$c> r1 = r0.f55728b
            com.veriff.sdk.internal.nw$c$c r2 = com.veriff.sdk.internal.nw$c.C22120c.f55789a
            r5 = 4
            r3.f55748b = r5
            java.lang.Object r1 = r1.emit(r2, r3)
            if (r1 != r4) goto L_0x0124
            return r4
        L_0x0124:
            bf0.d r1 = bf0.C21050d.f52856a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22089nt.mo55991a(com.veriff.sdk.internal.nw$a$a, ff0.c):java.lang.Object");
    }

    /* renamed from: b */
    public C25531l<nw$c> mo55995b() {
        return (C25531l) this.f55729c.getValue();
    }

    /* renamed from: d */
    public String mo55997d() {
        String g = this.f55737m.mo57023g();
        C24362h.m61210e(g, "session.generateFilenameForActiveStepFirstPhoto()");
        return g;
    }

    /* renamed from: e */
    public String mo55998e() {
        String h = this.f55737m.mo57024h();
        C24362h.m61210e(h, "session.contextForActiveStepSecondPhoto");
        return h;
    }

    /* renamed from: f */
    public String mo55999f() {
        String i = this.f55737m.mo57025i();
        C24362h.m61210e(i, "session.generateFilenameForActiveStepSecondPhoto()");
        return i;
    }

    /* renamed from: g */
    public void mo56000g() {
    }

    /* renamed from: h */
    public final C25235z mo56001h() {
        return this.f55730f;
    }

    /* renamed from: i */
    public final C21789ix mo56002i() {
        return this.f55733i;
    }

    /* renamed from: j */
    public final C22064nk mo56003j() {
        return this.f55734j;
    }

    /* renamed from: k */
    public final String mo56004k() {
        return this.f55735k;
    }

    /* renamed from: l */
    public final String mo56005l() {
        return this.f55736l;
    }

    /* renamed from: c */
    public String mo55996c() {
        String f = this.f55737m.mo57022f();
        C24362h.m61210e(f, "session.contextForActiveStepFirstPhoto");
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo55992a(com.veriff.sdk.internal.nw$a.C22111b r7, ff0.C23349c<? super bf0.C21050d> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.veriff.sdk.internal.C22089nt.C22094d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.veriff.sdk.internal.nt$d r0 = (com.veriff.sdk.internal.C22089nt.C22094d) r0
            int r1 = r0.f55754b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f55754b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.nt$d r0 = new com.veriff.sdk.internal.nt$d
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f55753a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f55754b
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x0037
            if (r2 == r4) goto L_0x0032
            if (r2 == r5) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            p584jl.C17885a.m44475z0(r8)
            goto L_0x00b9
        L_0x0037:
            p584jl.C17885a.m44475z0(r8)
            boolean r8 = r7 instanceof com.veriff.sdk.internal.nw$a.C22111b.C22113b
            if (r8 == 0) goto L_0x0057
            com.veriff.sdk.internal.fu r8 = r6.f55731g
            com.veriff.sdk.internal.nw$a$b$b r7 = (com.veriff.sdk.internal.nw$a.C22111b.C22113b) r7
            mobi.lab.veriff.data.b r7 = r7.mo56030a()
            com.veriff.sdk.internal.iy r7 = r7.mo60569a()
            com.veriff.sdk.internal.gf r7 = com.veriff.sdk.internal.C21716gg.m52920b((com.veriff.sdk.internal.C21791iy) r7)
            java.lang.String r0 = "stepCameraScreenShownEvent(action.step.flowStep)"
            mf0.C24362h.m61210e(r7, r0)
            r8.mo54921a((com.veriff.sdk.internal.C21667gf) r7)
            goto L_0x00b9
        L_0x0057:
            com.veriff.sdk.internal.nw$a$b$d r8 = com.veriff.sdk.internal.nw$a.C22111b.C22115d.f55784a
            boolean r8 = mf0.C24362h.m61206a(r7, r8)
            if (r8 == 0) goto L_0x006c
            zh0.h<com.veriff.sdk.internal.nw$c> r7 = r6.f55728b
            com.veriff.sdk.internal.nw$c$h r8 = com.veriff.sdk.internal.nw$c.C22125h.f55793a
            r0.f55754b = r4
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L_0x00b9
            return r1
        L_0x006c:
            com.veriff.sdk.internal.nw$a$b$e r8 = com.veriff.sdk.internal.nw$a.C22111b.C22116e.f55785a
            boolean r8 = mf0.C24362h.m61206a(r7, r8)
            if (r8 == 0) goto L_0x0088
            zh0.h<com.veriff.sdk.internal.nw$c> r7 = r6.f55728b
            com.veriff.sdk.internal.nw$c$j r8 = new com.veriff.sdk.internal.nw$c$j
            java.util.List r2 = com.veriff.sdk.internal.C22100nu.f55767a
            r8.<init>(r2)
            r0.f55754b = r5
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L_0x00b9
            return r1
        L_0x0088:
            com.veriff.sdk.internal.nw$a$b$a r8 = com.veriff.sdk.internal.nw$a.C22111b.C22112a.f55781a
            boolean r8 = mf0.C24362h.m61206a(r7, r8)
            if (r8 == 0) goto L_0x00a2
            zh0.h<com.veriff.sdk.internal.nw$c> r7 = r6.f55728b
            com.veriff.sdk.internal.nw$c$g r8 = new com.veriff.sdk.internal.nw$c$g
            java.lang.String r2 = "intro"
            r8.<init>(r2)
            r0.f55754b = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L_0x00b9
            return r1
        L_0x00a2:
            boolean r8 = r7 instanceof com.veriff.sdk.internal.nw$a.C22111b.C22114c
            if (r8 == 0) goto L_0x00b9
            com.veriff.sdk.internal.ff r8 = com.veriff.sdk.internal.C21625ff.f54627a
            r0 = 0
            com.veriff.sdk.internal.ff$a r8 = com.veriff.sdk.internal.C21625ff.m52501a(r8, r0, r4, r0)
            wh0.z r1 = r6.f55730f
            kotlinx.coroutines.CoroutineDispatcher r2 = r6.f55738n
            com.veriff.sdk.internal.nt$e r3 = new com.veriff.sdk.internal.nt$e
            r3.<init>(r6, r7, r8, r0)
            wh0.C25177g.m63218b(r1, r2, r3, r5)
        L_0x00b9:
            bf0.d r7 = bf0.C21050d.f52856a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22089nt.mo55992a(com.veriff.sdk.internal.nw$a$b, ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo55993a(com.veriff.sdk.internal.nw$a r6, ff0.C23349c<? super bf0.C21050d> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.veriff.sdk.internal.C22089nt.C22091a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.veriff.sdk.internal.nt$a r0 = (com.veriff.sdk.internal.C22089nt.C22091a) r0
            int r1 = r0.f55745b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f55745b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.nt$a r0 = new com.veriff.sdk.internal.nt$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f55744a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f55745b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 == r4) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            p584jl.C17885a.m44475z0(r7)
            goto L_0x005d
        L_0x0033:
            p584jl.C17885a.m44475z0(r7)
            com.veriff.sdk.internal.nw$a$c r7 = com.veriff.sdk.internal.nw$a.C22117c.f55786a
            boolean r7 = mf0.C24362h.m61206a(r6, r7)
            if (r7 == 0) goto L_0x003f
            goto L_0x005d
        L_0x003f:
            boolean r7 = r6 instanceof com.veriff.sdk.internal.nw$a.C22111b
            if (r7 == 0) goto L_0x004e
            com.veriff.sdk.internal.nw$a$b r6 = (com.veriff.sdk.internal.nw$a.C22111b) r6
            r0.f55745b = r4
            java.lang.Object r6 = r5.mo55992a((com.veriff.sdk.internal.nw$a.C22111b) r6, (ff0.C23349c<? super bf0.C21050d>) r0)
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x004e:
            boolean r7 = r6 instanceof com.veriff.sdk.internal.nw$a.C22103a
            if (r7 == 0) goto L_0x005d
            com.veriff.sdk.internal.nw$a$a r6 = (com.veriff.sdk.internal.nw$a.C22103a) r6
            r0.f55745b = r3
            java.lang.Object r6 = r5.mo55991a((com.veriff.sdk.internal.nw$a.C22103a) r6, (ff0.C23349c<? super bf0.C21050d>) r0)
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x005d:
            bf0.d r6 = bf0.C21050d.f52856a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22089nt.mo55993a(com.veriff.sdk.internal.nw$a, ff0.c):java.lang.Object");
    }

    /* renamed from: a */
    public C25527h<nw$a> mo55994a() {
        return this.f55727a;
    }

    /* renamed from: a */
    private final void m53881a(IOException iOException) {
        if (iOException instanceof C22682xf.C22683a) {
            C21910kf kfVar = this.f55732h;
            StringBuilder t = C0016g.m36t("AddressScreen#filesSelected file exceeded ", "size ");
            t.append(this.f55733i.mo55444U());
            t.append(" MB");
            kfVar.mo55690a(iOException, t.toString(), C21720gj.address);
            return;
        }
        C21910kf kfVar2 = this.f55732h;
        StringBuilder k = C13555b.m33972k("Failed to parse document message: ");
        k.append(iOException.getMessage());
        kfVar2.mo55690a(new IOException(k.toString()), "AddressScreen#filesSelected", C21720gj.address);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C22150ny> m53880a(List<? extends Uri> list, C22682xf xfVar, C22661wm wmVar, C21789ix ixVar) {
        ArrayList arrayList = new ArrayList();
        for (Uri uri : list) {
            String a = this.f55739o.mo57067a(uri);
            if (a == null) {
                m53881a(new IOException("File type cannot be null"));
            } else {
                List a2 = C22100nu.f55767a;
                boolean z = false;
                if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                    Iterator it = a2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C24362h.m61206a((String) it.next(), a)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z) {
                    try {
                        String k = wmVar.mo57027k();
                        C24362h.m61210e(k, "session.generateFilenameForAddress()");
                        File a3 = xfVar.mo57066a(uri, k, ixVar.mo55444U());
                        if (a3 == null) {
                            m53881a(new IOException("Saved file is null"));
                        } else {
                            arrayList.add(new C22150ny(a3, a));
                        }
                    } catch (IOException e) {
                        m53881a(e);
                    }
                } else {
                    m53881a(new IOException("Invalid file type"));
                }
            }
        }
        return arrayList;
    }
}
