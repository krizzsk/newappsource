package com.veriff.sdk.internal;

import bf0.C21050d;
import cf0.C21136j;
import com.appsflyer.ServerParameters;
import com.appsflyer.internal.referrer.Payload;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C22048nc;
import com.veriff.sdk.internal.C22064nk;
import ff0.C23349c;
import gf0.C23413c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;
import lf0.C24236l;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.util.C24452e;
import mobi.lab.veriff.util.C24465j;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25210r;
import wh0.C25211r0;
import wh0.C25213s;
import wh0.C25232y0;
import wh0.C25235z;
import yh0.C25308c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\b\b\u0001\u0010:\u001a\u000209\u0012\b\b\u0001\u0010E\u001a\u00020<\u0012\b\b\u0001\u0010=\u001a\u00020<\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010V\u001a\u00020U¢\u0006\u0004\bW\u0010XJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0017J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0017J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000bH\u0017J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J \u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001fH\u0002J\u001e\u0010$\u001a\u00020\u00042\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\"0!H\u0002J!\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0014\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\b\u0010)\u001a\u00020\u0004H\u0017J\b\u0010*\u001a\u00020\u0004H\u0017J\u001b\u0010+\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b+\u0010(RP\u0010.\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 -*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e0\u000e -*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 -*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e0\u000e\u0018\u00010,0,8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020?8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010C\u001a\n -*\u0004\u0018\u00010B0B8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010>R\u0014\u0010G\u001a\u00020F8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000e0I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00110O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010T\u001a\u00020\"*\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S\u0002\u0004\n\u0002\b\u0019¨\u0006Y"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/uploadmanager/VeriffUploadManager;", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager$UploadStatusListener;", "uploadStatusListener", "Lbf0/d;", "addUploadStatusListener", "clearAllMedia", "", "context", "clearNonInflowMediaForContext", "", "Lcom/veriff/sdk/internal/upload/Media;", "toDelete", "deleteMediaFiles", "", "getErrorUploads", "getFailedUploads", "Lcom/veriff/sdk/internal/upload/MediaWithStatus;", "getInflowUploads", "getMediaForContext", "media", "queueMedia", "removeUploadStatusListener", "resetFailedUploads", "restoreState", "runSaveStateLoop", "Lcom/veriff/sdk/internal/upload/SessionUploadStatus;", "status", "sendStatus", "Lcom/veriff/sdk/internal/upload/UploadKey;", "key", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus;", "setStatus", "Lkotlin/Function1;", "", "predicate", "uploadItems", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "uploadMediaFileForInflow", "(Lcom/veriff/sdk/internal/upload/Media;Lff0/c;)Ljava/lang/Object;", "uploadQueuedInflowMedia", "uploadQueuedItems", "waitForUploadToFinish", "Lcom/squareup/moshi/k;", "kotlin.jvm.PlatformType", "adapter", "Lcom/squareup/moshi/k;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "getEverythingUploaded", "()Z", "everythingUploaded", "Lwh0/z;", "globalScope", "Lwh0/z;", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "listeners", "Ljava/util/Set;", "Lmobi/lab/veriff/util/Log;", "log", "Lmobi/lab/veriff/util/Log;", "mainDispatcher", "Lcom/veriff/sdk/internal/upload/MediaUploader;", "mediaUploader", "Lcom/veriff/sdk/internal/upload/MediaUploader;", "Lyh0/c;", "saveChannel", "Lyh0/c;", "Lcom/veriff/sdk/internal/io/Store;", "store", "Lcom/veriff/sdk/internal/io/Store;", "", "uploads", "Ljava/util/Map;", "getShouldUpload", "(Lcom/veriff/sdk/internal/upload/Media;)Z", "shouldUpload", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lwh0/z;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/veriff/sdk/internal/io/Store;Lcom/veriff/sdk/internal/upload/MediaUploader;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.nl */
public final class C22067nl implements C22064nk {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C24465j f55659a = C24465j.m61538a("VeriffUploadManager");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Set<C22064nk.C22065a> f55660b = new CopyOnWriteArraySet();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<C22063nj, C22060ng> f55661c = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C21420av<List<C22060ng>> f55662d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C25308c<List<C22060ng>> f55663e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AtomicBoolean f55664f;

    /* renamed from: g */
    private final C25235z f55665g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final CoroutineDispatcher f55666h;

    /* renamed from: i */
    private final CoroutineDispatcher f55667i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C21919kj f55668j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C22054nd f55669k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C21910kf f55670l;

    @C23413c(mo58554c = "com.veriff.sdk.internal.upload.uploadmanager.VeriffUploadManager$clearAllMedia$2", mo58555f = "VeriffUploadManager.kt", mo58556l = {206}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nl$a */
    public static final class C22068a extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55671a;

        /* renamed from: b */
        public final /* synthetic */ C22067nl f55672b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22068a(C22067nl nlVar, C23349c cVar) {
            super(2, cVar);
            this.f55672b = nlVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22068a(this.f55672b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22068a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55671a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                if (this.f55672b.f55664f.compareAndSet(false, true)) {
                    C25308c b = this.f55672b.f55663e;
                    List K0 = C23825c.m58499K0(this.f55672b.f55661c.values());
                    this.f55671a = 1;
                    if (b.mo60341A(K0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C21050d.f52856a;
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f55672b.f55663e.mo60342E((Throwable) null);
            return C21050d.f52856a;
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.internal.upload.uploadmanager.VeriffUploadManager$clearNonInflowMediaForContext$2", mo58555f = "VeriffUploadManager.kt", mo58556l = {193}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nl$b */
    public static final class C22069b extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55673a;

        /* renamed from: b */
        public final /* synthetic */ C22067nl f55674b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22069b(C22067nl nlVar, C23349c cVar) {
            super(2, cVar);
            this.f55674b = nlVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22069b(this.f55674b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22069b) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55673a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25308c b = this.f55674b.f55663e;
                List K0 = C23825c.m58499K0(this.f55674b.f55661c.values());
                this.f55673a = 1;
                if (b.mo60341A(K0, this) == coroutineSingletons) {
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

    @C23413c(mo58554c = "com.veriff.sdk.internal.upload.uploadmanager.VeriffUploadManager$deleteMediaFiles$1", mo58555f = "VeriffUploadManager.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nl$c */
    public static final class C22070c extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55675a;

        /* renamed from: b */
        public final /* synthetic */ Collection f55676b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22070c(Collection collection, C23349c cVar) {
            super(2, cVar);
            this.f55676b = collection;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22070c(this.f55676b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22070c) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f55675a == 0) {
                C17885a.m44475z0(obj);
                for (C22046na c : this.f55676b) {
                    C24452e.m61504a(c.mo55888c());
                }
                return C21050d.f52856a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.internal.upload.uploadmanager.VeriffUploadManager$restoreState$1", mo58555f = "VeriffUploadManager.kt", mo58556l = {290, 298}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nl$d */
    public static final class C22071d extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55677a;

        /* renamed from: b */
        public final /* synthetic */ C22067nl f55678b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22071d(C22067nl nlVar, C23349c cVar) {
            super(2, cVar);
            this.f55678b = nlVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22071d(this.f55678b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22071d) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.f55677a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x001c
                if (r1 == r3) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                p584jl.C17885a.m44475z0(r8)
                goto L_0x0071
            L_0x0010:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0018:
                p584jl.C17885a.m44475z0(r8)
                goto L_0x0030
            L_0x001c:
                p584jl.C17885a.m44475z0(r8)
                com.veriff.sdk.internal.nl r8 = r7.f55678b
                com.veriff.sdk.internal.kj r8 = r8.f55668j
                r7.f55677a = r3
                java.lang.String r1 = "uploads"
                java.lang.Object r8 = r8.mo55698a(r1, r7)
                if (r8 != r0) goto L_0x0030
                return r0
            L_0x0030:
                byte[] r8 = (byte[]) r8
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                r3 = 0
                if (r8 == 0) goto L_0x005a
                com.veriff.sdk.internal.nl r4 = r7.f55678b     // Catch:{ all -> 0x004e }
                com.veriff.sdk.internal.av r4 = r4.f55662d     // Catch:{ all -> 0x004e }
                java.nio.charset.Charset r5 = uh0.C25072a.f63272a     // Catch:{ all -> 0x004e }
                java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x004e }
                r6.<init>(r8, r5)     // Catch:{ all -> 0x004e }
                java.lang.Object r8 = r4.mo54223a((java.lang.String) r6)     // Catch:{ all -> 0x004e }
                java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x004e }
                goto L_0x005b
            L_0x004e:
                r8 = move-exception
                com.veriff.sdk.internal.nl r4 = r7.f55678b
                mobi.lab.veriff.util.j r4 = r4.f55659a
                java.lang.String r5 = "Failed to restore upload state"
                r4.mo60712w(r5, r8)
            L_0x005a:
                r8 = r3
            L_0x005b:
                r1.element = r8
                com.veriff.sdk.internal.nl r8 = r7.f55678b
                kotlinx.coroutines.CoroutineDispatcher r8 = r8.f55666h
                com.veriff.sdk.internal.nl$d$1 r4 = new com.veriff.sdk.internal.nl$d$1
                r4.<init>(r7, r1, r3)
                r7.f55677a = r2
                java.lang.Object r8 = wh0.C25177g.m63221e(r8, r4, r7)
                if (r8 != r0) goto L_0x0071
                return r0
            L_0x0071:
                bf0.d r8 = bf0.C21050d.f52856a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22067nl.C22071d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.internal.upload.uploadmanager.VeriffUploadManager$runSaveStateLoop$1", mo58555f = "VeriffUploadManager.kt", mo58556l = {309, 311, 314}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nl$e */
    public static final class C22073e extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public Object f55682a;

        /* renamed from: b */
        public int f55683b;

        /* renamed from: c */
        public final /* synthetic */ C22067nl f55684c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22073e(C22067nl nlVar, C23349c cVar) {
            super(2, cVar);
            this.f55684c = nlVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22073e(this.f55684c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22073e) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r9.f55683b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r4) goto L_0x0021
                if (r1 == r3) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                goto L_0x0018
            L_0x0010:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0018:
                java.lang.Object r1 = r9.f55682a
                yh0.e r1 = (yh0.C25311e) r1
                p584jl.C17885a.m44475z0(r10)
                r5 = r9
                goto L_0x006e
            L_0x0021:
                java.lang.Object r1 = r9.f55682a
                yh0.e r1 = (yh0.C25311e) r1
                p584jl.C17885a.m44475z0(r10)
                r5 = r9
                goto L_0x0047
            L_0x002a:
                p584jl.C17885a.m44475z0(r10)
                com.veriff.sdk.internal.nl r10 = r9.f55684c
                yh0.c r10 = r10.f55663e
                yh0.e r10 = r10.iterator()
                r1 = r9
            L_0x0038:
                r1.f55682a = r10
                r1.f55683b = r4
                java.lang.Object r5 = r10.mo60332a(r1)
                if (r5 != r0) goto L_0x0043
                return r0
            L_0x0043:
                r8 = r1
                r1 = r10
                r10 = r5
                r5 = r8
            L_0x0047:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L_0x009c
                java.lang.Object r10 = r1.next()
                java.util.List r10 = (java.util.List) r10
                boolean r6 = r10.isEmpty()
                java.lang.String r7 = "uploads"
                if (r6 == 0) goto L_0x0071
                com.veriff.sdk.internal.nl r10 = r5.f55684c
                com.veriff.sdk.internal.kj r10 = r10.f55668j
                r5.f55682a = r1
                r5.f55683b = r3
                java.lang.Object r10 = r10.mo55700b(r7, r5)
                if (r10 != r0) goto L_0x006e
                return r0
            L_0x006e:
                r10 = r1
                r1 = r5
                goto L_0x0038
            L_0x0071:
                com.veriff.sdk.internal.nl r6 = r5.f55684c
                com.veriff.sdk.internal.av r6 = r6.f55662d
                java.lang.String r10 = r6.mo54224a(r10)
                java.lang.String r6 = "adapter.toJson(state)"
                mf0.C24362h.m61210e(r10, r6)
                java.nio.charset.Charset r6 = uh0.C25072a.f63272a
                byte[] r10 = r10.getBytes(r6)
                java.lang.String r6 = "(this as java.lang.String).getBytes(charset)"
                mf0.C24362h.m61210e(r10, r6)
                com.veriff.sdk.internal.nl r6 = r5.f55684c
                com.veriff.sdk.internal.kj r6 = r6.f55668j
                r5.f55682a = r1
                r5.f55683b = r2
                java.lang.Object r10 = r6.mo55699a(r7, r10, r5)
                if (r10 != r0) goto L_0x006e
                return r0
            L_0x009c:
                bf0.d r10 = bf0.C21050d.f52856a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22067nl.C22073e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.internal.upload.uploadmanager.VeriffUploadManager$setStatus$1", mo58555f = "VeriffUploadManager.kt", mo58556l = {282}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nl$f */
    public static final class C22074f extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55685a;

        /* renamed from: b */
        public final /* synthetic */ C22067nl f55686b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22074f(C22067nl nlVar, C23349c cVar) {
            super(2, cVar);
            this.f55686b = nlVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22074f(this.f55686b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22074f) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55685a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                if (!this.f55686b.f55664f.get()) {
                    C25308c b = this.f55686b.f55663e;
                    List K0 = C23825c.m58499K0(this.f55686b.f55661c.values());
                    this.f55685a = 1;
                    if (b.mo60341A(K0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/Media;", "", "invoke", "(Lcom/veriff/sdk/internal/upload/Media;)Z", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nl$g */
    public static final class C22075g extends Lambda implements C24236l<C22046na, Boolean> {

        /* renamed from: a */
        public static final C22075g f55687a = new C22075g();

        public C22075g() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo55964a(C22046na naVar) {
            C24362h.m61211f(naVar, "$receiver");
            return true;
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo55964a((C22046na) obj));
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.internal.upload.uploadmanager.VeriffUploadManager$uploadItems$2", mo58555f = "VeriffUploadManager.kt", mo58556l = {244}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nl$h */
    public static final class C22076h extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public Object f55688a;

        /* renamed from: b */
        public Object f55689b;

        /* renamed from: c */
        public Object f55690c;

        /* renamed from: d */
        public int f55691d;

        /* renamed from: e */
        public final /* synthetic */ C22067nl f55692e;

        /* renamed from: f */
        public final /* synthetic */ List f55693f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22076h(C22067nl nlVar, List list, C23349c cVar) {
            super(2, cVar);
            this.f55692e = nlVar;
            this.f55693f = list;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22076h(this.f55692e, this.f55693f, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22076h) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x00aa A[LOOP:0: B:14:0x00a4->B:16:0x00aa, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00df  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0039  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r10.f55691d
                r2 = 1
                if (r1 == 0) goto L_0x0028
                if (r1 != r2) goto L_0x0020
                java.lang.Object r1 = r10.f55690c
                com.veriff.sdk.internal.na r1 = (com.veriff.sdk.internal.C22046na) r1
                java.lang.Object r3 = r10.f55689b
                com.veriff.sdk.internal.nj r3 = (com.veriff.sdk.internal.C22063nj) r3
                java.lang.Object r4 = r10.f55688a
                java.util.Iterator r4 = (java.util.Iterator) r4
                p584jl.C17885a.m44475z0(r11)
                r2 = r1
                r5 = r4
                r1 = r0
                r4 = r3
                r3 = 1
                r0 = r10
                goto L_0x008d
            L_0x0020:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0028:
                p584jl.C17885a.m44475z0(r11)
                java.util.List r11 = r10.f55693f
                java.util.Iterator r11 = r11.iterator()
                r4 = r11
                r11 = r10
            L_0x0033:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x014e
                java.lang.Object r1 = r4.next()
                kotlin.Pair r1 = (kotlin.Pair) r1
                java.lang.Object r3 = r1.mo59066a()
                com.veriff.sdk.internal.nj r3 = (com.veriff.sdk.internal.C22063nj) r3
                java.lang.Object r1 = r1.mo59067b()
                com.veriff.sdk.internal.na r1 = (com.veriff.sdk.internal.C22046na) r1
                com.veriff.sdk.internal.nl r5 = r11.f55692e
                mobi.lab.veriff.util.j r5 = r5.f55659a
                java.lang.String r6 = "Uploading "
                java.lang.StringBuilder r6 = p379.C13555b.m33972k(r6)
                java.lang.String r7 = r1.mo55889d()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r5.mo60705d(r6)
                com.veriff.sdk.internal.nl r5 = r11.f55692e
                com.veriff.sdk.internal.nc$e r6 = new com.veriff.sdk.internal.nc$e
                r7 = 0
                r6.<init>(r7, r2, r7)
                r5.m53823a(r3, r1, r6)
                com.veriff.sdk.internal.nl r5 = r11.f55692e
                com.veriff.sdk.internal.nd r5 = r5.f55669k
                r11.f55688a = r4
                r11.f55689b = r3
                r11.f55690c = r1
                r11.f55691d = r2
                java.lang.Object r5 = r5.mo55924a(r1, r11)
                if (r5 != r0) goto L_0x0085
                return r0
            L_0x0085:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r9
            L_0x008d:
                com.veriff.sdk.internal.kn r11 = (com.veriff.sdk.internal.C21924kn) r11
                com.veriff.sdk.internal.nc$a r6 = com.veriff.sdk.internal.C22048nc.f55620a
                com.veriff.sdk.internal.nc r6 = r6.mo55901a(r11)
                com.veriff.sdk.internal.nl r7 = r0.f55692e
                r7.m53823a(r4, r2, r6)
                com.veriff.sdk.internal.nl r4 = r0.f55692e
                java.util.Set r4 = r4.f55660b
                java.util.Iterator r4 = r4.iterator()
            L_0x00a4:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L_0x00b8
                java.lang.Object r7 = r4.next()
                com.veriff.sdk.internal.nk$a r7 = (com.veriff.sdk.internal.C22064nk.C22065a) r7
                com.veriff.sdk.internal.ng r8 = r2.mo55885a(r6)
                r7.mo55961a((com.veriff.sdk.internal.C22060ng) r8)
                goto L_0x00a4
            L_0x00b8:
                boolean r4 = r11 instanceof com.veriff.sdk.internal.C21924kn.C21927c
                if (r4 == 0) goto L_0x00df
                com.veriff.sdk.internal.nl r4 = r0.f55692e
                mobi.lab.veriff.util.j r4 = r4.f55659a
                java.lang.String r6 = "onSuccess "
                java.lang.StringBuilder r6 = p379.C13555b.m33972k(r6)
                java.lang.String r2 = r2.mo55889d()
                r6.append(r2)
                java.lang.String r2 = " result="
                r6.append(r2)
                r6.append(r11)
                java.lang.String r11 = r6.toString()
                r4.mo60705d(r11)
                goto L_0x0148
            L_0x00df:
                boolean r2 = r11 instanceof com.veriff.sdk.internal.C21924kn.C21926b
                java.lang.String r4 = "doUpload()"
                if (r2 == 0) goto L_0x011d
                java.io.IOException r2 = new java.io.IOException
                java.lang.String r6 = "Upload failed with server error code "
                java.lang.StringBuilder r6 = p379.C13555b.m33972k(r6)
                com.veriff.sdk.internal.kn$b r11 = (com.veriff.sdk.internal.C21924kn.C21926b) r11
                int r7 = r11.mo55709a()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r2.<init>(r6)
                int r11 = r11.mo55709a()
                r6 = 500(0x1f4, float:7.0E-43)
                if (r11 < r6) goto L_0x0111
                com.veriff.sdk.internal.nl r11 = r0.f55692e
                com.veriff.sdk.internal.kf r11 = r11.f55670l
                com.veriff.sdk.internal.gj r6 = com.veriff.sdk.internal.C21720gj.upload
                r11.mo55691b(r2, r4, r6)
                goto L_0x0148
            L_0x0111:
                com.veriff.sdk.internal.nl r11 = r0.f55692e
                com.veriff.sdk.internal.kf r11 = r11.f55670l
                com.veriff.sdk.internal.gj r6 = com.veriff.sdk.internal.C21720gj.upload
                r11.mo55690a(r2, r4, r6)
                goto L_0x0148
            L_0x011d:
                boolean r2 = r11 instanceof com.veriff.sdk.internal.C21924kn.C21925a
                if (r2 == 0) goto L_0x0133
                com.veriff.sdk.internal.nl r2 = r0.f55692e
                com.veriff.sdk.internal.kf r2 = r2.f55670l
                com.veriff.sdk.internal.kn$a r11 = (com.veriff.sdk.internal.C21924kn.C21925a) r11
                java.io.IOException r11 = r11.mo55705a()
                com.veriff.sdk.internal.gj r6 = com.veriff.sdk.internal.C21720gj.upload
                r2.mo55691b(r11, r4, r6)
                goto L_0x0148
            L_0x0133:
                boolean r2 = r11 instanceof com.veriff.sdk.internal.C21924kn.C21928d
                if (r2 == 0) goto L_0x0148
                com.veriff.sdk.internal.nl r2 = r0.f55692e
                com.veriff.sdk.internal.kf r2 = r2.f55670l
                com.veriff.sdk.internal.kn$d r11 = (com.veriff.sdk.internal.C21924kn.C21928d) r11
                java.lang.Throwable r11 = r11.mo55719a()
                com.veriff.sdk.internal.gj r6 = com.veriff.sdk.internal.C21720gj.upload
                r2.mo55690a(r11, r4, r6)
            L_0x0148:
                r11 = r0
                r0 = r1
                r2 = r3
                r4 = r5
                goto L_0x0033
            L_0x014e:
                com.veriff.sdk.internal.nl r11 = r11.f55692e
                com.veriff.sdk.internal.ni r0 = com.veriff.sdk.internal.C22062ni.DONE
                r11.mo55963a((com.veriff.sdk.internal.C22062ni) r0)
                bf0.d r11 = bf0.C21050d.f52856a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22067nl.C22076h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.internal.upload.uploadmanager.VeriffUploadManager", mo58555f = "VeriffUploadManager.kt", mo58556l = {85, 91}, mo58557m = "uploadMediaFileForInflow")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H@"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/Media;", "media", "Lff0/c;", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "continuation", "", "uploadMediaFileForInflow"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nl$i */
    public static final class C22077i extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f55694a;

        /* renamed from: b */
        public int f55695b;

        /* renamed from: c */
        public final /* synthetic */ C22067nl f55696c;

        /* renamed from: d */
        public Object f55697d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22077i(C22067nl nlVar, C23349c cVar) {
            super(cVar);
            this.f55696c = nlVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f55694a = obj;
            this.f55695b |= Integer.MIN_VALUE;
            return this.f55696c.mo55947a((C22046na) null, this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.internal.upload.uploadmanager.VeriffUploadManager$uploadMediaFileForInflow$2", mo58555f = "VeriffUploadManager.kt", mo58556l = {86}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lwh0/z;", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nl$j */
    public static final class C22078j extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21924kn<C22561tq>>, Object> {

        /* renamed from: a */
        public int f55698a;

        /* renamed from: b */
        public final /* synthetic */ C22067nl f55699b;

        /* renamed from: c */
        public final /* synthetic */ C22046na f55700c;

        /* renamed from: d */
        public final /* synthetic */ C22063nj f55701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22078j(C22067nl nlVar, C22046na naVar, C22063nj njVar, C23349c cVar) {
            super(2, cVar);
            this.f55699b = nlVar;
            this.f55700c = naVar;
            this.f55701d = njVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22078j(this.f55699b, this.f55700c, this.f55701d, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22078j) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55698a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C22054nd a = this.f55699b.f55669k;
                C22046na naVar = this.f55700c;
                this.f55698a = 1;
                obj = a.mo55924a(naVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f55699b.m53823a(this.f55701d, this.f55700c, C22048nc.f55620a.mo55901a((C21924kn) obj));
            return obj;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/Media;", "", "invoke", "(Lcom/veriff/sdk/internal/upload/Media;)Z", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nl$k */
    public static final class C22079k extends Lambda implements C24236l<C22046na, Boolean> {

        /* renamed from: a */
        public static final C22079k f55702a = new C22079k();

        public C22079k() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo55965a(C22046na naVar) {
            C24362h.m61211f(naVar, "$receiver");
            return naVar.mo55892f();
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo55965a((C22046na) obj));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo59060d2 = {"com/veriff/sdk/internal/upload/uploadmanager/VeriffUploadManager$waitForUploadToFinish$2", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager$UploadStatusListener;", "Lcom/veriff/sdk/internal/upload/MediaWithStatus;", "upload", "Lbf0/d;", "onMediaUploadFinished", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nl$l */
    public static final class C22080l implements C22064nk.C22065a {

        /* renamed from: a */
        public final /* synthetic */ C22067nl f55703a;

        /* renamed from: b */
        public final /* synthetic */ C22046na f55704b;

        /* renamed from: c */
        public final /* synthetic */ C25210r f55705c;

        public C22080l(C22067nl nlVar, C22046na naVar, C25210r rVar) {
            this.f55703a = nlVar;
            this.f55704b = naVar;
            this.f55705c = rVar;
        }

        /* renamed from: a */
        public void mo55962a(C22062ni niVar) {
            C24362h.m61211f(niVar, ServerParameters.STATUS);
            C22064nk.C22065a.C22066a.m53821a((C22064nk.C22065a) this, niVar);
        }

        /* renamed from: a */
        public void mo55961a(C22060ng ngVar) {
            C24362h.m61211f(ngVar, "upload");
            if (C24362h.m61206a(ngVar.mo55934a(), this.f55704b)) {
                this.f55705c.complete(ngVar);
                this.f55703a.mo55953b((C22064nk.C22065a) this);
            }
        }
    }

    public C22067nl(C25235z zVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, C21919kj kjVar, C22054nd ndVar, C21910kf kfVar, C21450bi biVar) {
        C24362h.m61211f(zVar, "globalScope");
        C24362h.m61211f(coroutineDispatcher, "mainDispatcher");
        C24362h.m61211f(coroutineDispatcher2, "ioDispatcher");
        C24362h.m61211f(kjVar, Payload.TYPE_STORE);
        C24362h.m61211f(ndVar, "mediaUploader");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(biVar, "moshi");
        this.f55665g = zVar;
        this.f55666h = coroutineDispatcher;
        this.f55667i = coroutineDispatcher2;
        this.f55668j = kjVar;
        this.f55669k = ndVar;
        this.f55670l = kfVar;
        this.f55662d = biVar.mo54335a((Type) C22081nm.f55706a);
        this.f55663e = C17885a.m44433d(0, (BufferOverflow) null, 7);
        this.f55664f = new AtomicBoolean(false);
        m53837i();
        m53839j();
    }

    /* renamed from: i */
    private final void m53837i() {
        C25177g.m63218b(this.f55665g, (CoroutineContext) null, new C22071d(this, (C23349c) null), 3);
    }

    /* renamed from: j */
    private final void m53839j() {
        C25177g.m63218b(this.f55665g, (CoroutineContext) null, new C22073e(this, (C23349c) null), 3);
    }

    /* renamed from: b */
    public Object mo55951b(C22046na naVar, C23349c<? super C22060ng> cVar) {
        C21641fr.m52540a();
        C22060ng ngVar = this.f55661c.get(naVar.mo55886a());
        if (ngVar != null && !(ngVar.mo55935b() instanceof C22048nc.C22052d) && !(ngVar.mo55935b() instanceof C22048nc.C22053e)) {
            return ngVar;
        }
        C25213s sVar = new C25213s((C25232y0) null);
        mo55949a((C22064nk.C22065a) new C22080l(this, naVar, sVar));
        return sVar.mo61764h(cVar);
    }

    /* renamed from: c */
    public void mo55955c() {
        m53827a((C24236l<? super C22046na, Boolean>) C22079k.f55702a);
    }

    /* renamed from: d */
    public void mo55956d() {
        C21641fr.m52540a();
        Collection<C22060ng> values = this.f55661c.values();
        ArrayList<C22046na> arrayList = new ArrayList<>(C21136j.m49436X(values, 10));
        for (C22060ng a : values) {
            arrayList.add(a.mo55934a());
        }
        for (C22046na a2 : arrayList) {
            mo55948a(a2);
        }
    }

    /* renamed from: e */
    public List<C22060ng> mo55957e() {
        C21641fr.m52540a();
        Collection<C22060ng> values = this.f55661c.values();
        ArrayList arrayList = new ArrayList();
        for (T next : values) {
            if (((C22060ng) next).mo55934a().mo55892f()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public List<C22046na> mo55958f() {
        C21641fr.m52540a();
        Collection<C22060ng> values = this.f55661c.values();
        ArrayList<C22060ng> arrayList = new ArrayList<>();
        for (T next : values) {
            C22060ng ngVar = (C22060ng) next;
            if ((ngVar.mo55935b() instanceof C22048nc.C22051c) && ((C22048nc.C22051c) ngVar.mo55935b()).mo55909a()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
        for (C22060ng a : arrayList) {
            arrayList2.add(a.mo55934a());
        }
        return arrayList2;
    }

    /* renamed from: g */
    public List<C22046na> mo55959g() {
        C21641fr.m52540a();
        Collection<C22060ng> values = this.f55661c.values();
        ArrayList<C22060ng> arrayList = new ArrayList<>();
        for (T next : values) {
            C22060ng ngVar = (C22060ng) next;
            if ((ngVar.mo55935b() instanceof C22048nc.C22051c) && !((C22048nc.C22051c) ngVar.mo55935b()).mo55909a()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
        for (C22060ng a : arrayList) {
            arrayList2.add(a.mo55934a());
        }
        return arrayList2;
    }

    /* renamed from: h */
    public void mo55960h() {
        Collection<C22060ng> values = this.f55661c.values();
        ArrayList arrayList = new ArrayList(C21136j.m49436X(values, 10));
        for (C22060ng a : values) {
            arrayList.add(a.mo55934a());
        }
        m53826a((Collection<C22046na>) arrayList);
        this.f55661c.clear();
        C25177g.m63218b(this.f55665g, this.f55666h, new C22068a(this, (C23349c) null), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo55947a(com.veriff.sdk.internal.C22046na r8, ff0.C23349c<? super com.veriff.sdk.internal.C21924kn<com.veriff.sdk.internal.C22561tq>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.veriff.sdk.internal.C22067nl.C22077i
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.veriff.sdk.internal.nl$i r0 = (com.veriff.sdk.internal.C22067nl.C22077i) r0
            int r1 = r0.f55695b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f55695b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.nl$i r0 = new com.veriff.sdk.internal.nl$i
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f55694a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f55695b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r8 = r0.f55697d
            p584jl.C17885a.m44475z0(r9)
            goto L_0x0067
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            p584jl.C17885a.m44475z0(r9)
            goto L_0x0058
        L_0x0038:
            p584jl.C17885a.m44475z0(r9)
            com.veriff.sdk.internal.nj r9 = r8.mo55886a()
            com.veriff.sdk.internal.nc$e r2 = new com.veriff.sdk.internal.nc$e
            r5 = 0
            r2.<init>(r5, r4, r5)
            r7.m53823a(r9, r8, r2)
            wh0.i1 r2 = wh0.C25185i1.f63461c
            com.veriff.sdk.internal.nl$j r6 = new com.veriff.sdk.internal.nl$j
            r6.<init>(r7, r8, r9, r5)
            r0.f55695b = r4
            java.lang.Object r9 = wh0.C25177g.m63221e(r2, r6, r0)
            if (r9 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r8 = r9
            com.veriff.sdk.internal.kn r8 = (com.veriff.sdk.internal.C21924kn) r8
            r0.f55697d = r9
            r0.f55695b = r3
            java.lang.Object r8 = p389bl.C13637c.m34059N(r0)
            if (r8 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r8 = r9
        L_0x0067:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22067nl.mo55947a(com.veriff.sdk.internal.na, ff0.c):java.lang.Object");
    }

    /* renamed from: b */
    public void mo55953b(C22064nk.C22065a aVar) {
        C24362h.m61211f(aVar, "uploadStatusListener");
        this.f55660b.remove(aVar);
    }

    /* renamed from: b */
    public void mo55954b(String str) {
        C24362h.m61211f(str, AppActionRequest.KEY_CONTEXT);
        C24465j jVar = this.f55659a;
        jVar.mo60705d("Clearing non-inflow media for " + str);
        C21641fr.m52540a();
        Set<Map.Entry<C22063nj, C22060ng>> entrySet = this.f55661c.entrySet();
        ArrayList arrayList = new ArrayList();
        for (T next : entrySet) {
            if (C24362h.m61206a(((C22060ng) ((Map.Entry) next).getValue()).mo55935b(), new C22048nc.C22052d((String) null, 1, (DefaultConstructorMarker) null))) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList2.add(new Pair(entry.getKey(), ((C22060ng) entry.getValue()).mo55934a()));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            C22046na naVar = (C22046na) ((Pair) next2).mo59067b();
            if (C24362h.m61206a(naVar.mo55889d(), str) && !naVar.mo55892f()) {
                arrayList3.add(next2);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C22063nj njVar = (C22063nj) ((Pair) it3.next()).mo59066a();
            C24465j jVar2 = this.f55659a;
            jVar2.mo60705d("Deleting media " + njVar);
            this.f55661c.remove(njVar);
        }
        C25177g.m63218b(this.f55665g, this.f55666h, new C22069b(this, (C23349c) null), 2);
        ArrayList arrayList4 = new ArrayList(C21136j.m49436X(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add((C22046na) ((Pair) it4.next()).mo59069d());
        }
        m53826a((Collection<C22046na>) arrayList4);
    }

    /* renamed from: a */
    public boolean mo55950a() {
        boolean z;
        Collection<C22060ng> values = this.f55661c.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            for (C22060ng d : values) {
                C22048nc d2 = d.mo55937d();
                if ((d2 instanceof C22048nc.C22050b) || ((d2 instanceof C22048nc.C22051c) && !((C22048nc.C22051c) d2).mo55909a())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo55948a(C22046na naVar) {
        C24362h.m61211f(naVar, "media");
        C24465j jVar = this.f55659a;
        jVar.mo60705d("Queueing " + naVar + " for upload");
        C22063nj a = naVar.mo55886a();
        C21641fr.m52540a();
        if (m53829b(naVar)) {
            m53823a(a, naVar, new C22048nc.C22052d((String) null, 1, (DefaultConstructorMarker) null));
            return;
        }
        C24465j jVar2 = this.f55659a;
        StringBuilder k = C13555b.m33972k("Skipped uploading media, already queued: ");
        k.append(this.f55661c.get(a));
        jVar2.mo60705d(k.toString());
    }

    /* renamed from: a */
    public final void mo55963a(C22062ni niVar) {
        C24362h.m61211f(niVar, ServerParameters.STATUS);
        C24465j jVar = this.f55659a;
        jVar.mo60705d("setStatus " + niVar);
        for (C22064nk.C22065a a : this.f55660b) {
            a.mo55962a(niVar);
        }
    }

    /* renamed from: a */
    public void mo55949a(C22064nk.C22065a aVar) {
        C24362h.m61211f(aVar, "uploadStatusListener");
        this.f55660b.add(aVar);
    }

    /* renamed from: a */
    public C22046na mo55946a(String str) {
        C24362h.m61211f(str, AppActionRequest.KEY_CONTEXT);
        C21641fr.m52540a();
        Map<C22063nj, C22060ng> map = this.f55661c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (C24362h.m61206a(((C22063nj) next.getKey()).mo55942a(), str)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Collection<C22060ng> values = linkedHashMap.values();
        ArrayList arrayList = new ArrayList(C21136j.m49436X(values, 10));
        for (C22060ng c : values) {
            arrayList.add(c.mo55936c());
        }
        return (C22046na) C23825c.m58523t0(arrayList);
    }

    /* renamed from: b */
    public void mo55952b() {
        m53825a(this, (C24236l) null, 1, (Object) null);
    }

    /* renamed from: b */
    private final boolean m53829b(C22046na naVar) {
        C22060ng ngVar = this.f55661c.get(naVar.mo55886a());
        if (ngVar == null) {
            return true;
        }
        C22048nc b = ngVar.mo55935b();
        if (b instanceof C22048nc.C22052d) {
            return true;
        }
        if ((b instanceof C22048nc.C22053e) || (b instanceof C22048nc.C22050b)) {
            return false;
        }
        if (b instanceof C22048nc.C22051c) {
            return ((C22048nc.C22051c) ngVar.mo55935b()).mo55909a();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public static /* synthetic */ void m53825a(C22067nl nlVar, C24236l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = C22075g.f55687a;
        }
        nlVar.m53827a((C24236l<? super C22046na, Boolean>) lVar);
    }

    /* renamed from: a */
    private final void m53827a(C24236l<? super C22046na, Boolean> lVar) {
        mo55963a(C22062ni.IN_PROGRESS);
        Set<Map.Entry<C22063nj, C22060ng>> entrySet = this.f55661c.entrySet();
        ArrayList arrayList = new ArrayList();
        for (T next : entrySet) {
            if (((C22060ng) ((Map.Entry) next).getValue()).mo55935b() instanceof C22048nc.C22052d) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (lVar.invoke(((C22060ng) ((Map.Entry) next2).getValue()).mo55934a()).booleanValue()) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C21136j.m49436X(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            arrayList3.add(new Pair(entry.getKey(), ((C22060ng) entry.getValue()).mo55934a()));
        }
        if (arrayList3.isEmpty()) {
            mo55963a(C22062ni.DONE);
        } else {
            C25177g.m63218b(this.f55665g, this.f55666h, new C22076h(this, arrayList3, (C23349c) null), 2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m53823a(C22063nj njVar, C22046na naVar, C22048nc ncVar) {
        C21641fr.m52540a();
        C24465j jVar = this.f55659a;
        jVar.mo60705d("Set " + njVar + " upload status to " + ncVar);
        this.f55661c.put(njVar, naVar.mo55885a(ncVar));
        C25177g.m63218b(this.f55665g, this.f55666h, new C22074f(this, (C23349c) null), 2);
    }

    /* renamed from: a */
    private final void m53826a(Collection<C22046na> collection) {
        C25177g.m63218b(C25211r0.f63482b, this.f55667i, new C22070c(collection, (C23349c) null), 2);
    }
}
