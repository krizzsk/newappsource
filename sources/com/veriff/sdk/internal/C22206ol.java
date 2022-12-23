package com.veriff.sdk.internal;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import bf0.C21050d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.veriff.sdk.detector.Face;
import com.veriff.sdk.detector.FaceDetector;
import com.veriff.sdk.detector.Point;
import com.veriff.sdk.detector.Rectangle;
import com.veriff.sdk.detector.Size;
import com.veriff.sdk.internal.C22201oj;
import ff0.C23349c;
import gf0.C23413c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C24179b;
import kotlinx.coroutines.CoroutineDispatcher;
import lf0.C24225a;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import p845um.C19958a;
import wh0.C25177g;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB/\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dB9\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000e\b\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001c\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/ReflectiveDetectorProvider;", "Lcom/veriff/sdk/views/autocapture/DetectorProvider;", "Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe;", "createFaceDetector", "getFaceDetector", "Lcom/veriff/sdk/detector/FaceDetector;", "detector", "", "retry", "Lbf0/d;", "probe", "startProbing", "Lkotlinx/coroutines/CoroutineDispatcher;", "computation", "Lkotlinx/coroutines/CoroutineDispatcher;", "faceDetectorProbe", "Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe;", "Lcom/veriff/sdk/internal/Instantiator;", "instantiator", "Lcom/veriff/sdk/internal/Instantiator;", "main", "Lwh0/z;", "scope", "Lwh0/z;", "Lkotlin/Function0;", "Landroid/graphics/Bitmap;", "testBitmapFactory", "Llf0/a;", "<init>", "(Lcom/veriff/sdk/internal/Instantiator;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lwh0/z;)V", "(Lcom/veriff/sdk/internal/Instantiator;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lwh0/z;Llf0/a;)V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ol */
public final class C22206ol implements C22199oh {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C22201oj f55974b;

    /* renamed from: c */
    private final C21629fg f55975c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final CoroutineDispatcher f55976d;

    /* renamed from: e */
    private final CoroutineDispatcher f55977e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C25235z f55978f;

    /* renamed from: g */
    private final C24225a<Bitmap> f55979g;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/ReflectiveDetectorProvider$Companion;", "", "()V", "overrideFacedetector", "Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe;", "getOverrideFacedetector", "()Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe;", "setOverrideFacedetector", "(Lcom/veriff/sdk/views/autocapture/FaceDetectorProbe;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ol$a */
    public static final class C22208a {
        private C22208a() {
        }

        public /* synthetic */ C22208a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.autocapture.ReflectiveDetectorProvider$probe$1", mo58555f = "DetectorProvider.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ol$b */
    public static final class C22209b extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55981a;

        /* renamed from: b */
        public final /* synthetic */ C22206ol f55982b;

        /* renamed from: c */
        public final /* synthetic */ FaceDetector f55983c;

        /* renamed from: d */
        public final /* synthetic */ Bitmap f55984d;

        /* renamed from: e */
        public final /* synthetic */ Rectangle f55985e;

        /* renamed from: f */
        public final /* synthetic */ Size f55986f;

        /* renamed from: g */
        public final /* synthetic */ boolean f55987g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22209b(C22206ol olVar, FaceDetector faceDetector, Bitmap bitmap, Rectangle rectangle, Size size, boolean z, C23349c cVar) {
            super(2, cVar);
            this.f55982b = olVar;
            this.f55983c = faceDetector;
            this.f55984d = bitmap;
            this.f55985e = rectangle;
            this.f55986f = size;
            this.f55987g = z;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22209b(this.f55982b, this.f55983c, this.f55984d, this.f55985e, this.f55986f, this.f55987g, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22209b) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f55981a == 0) {
                C17885a.m44475z0(obj);
                this.f55983c.detect(this.f55984d, this.f55985e, this.f55986f, (FaceDetector.Callback) new FaceDetector.Callback(this) {

                    /* renamed from: a */
                    public final /* synthetic */ C22209b f55988a;

                    @C23413c(mo58554c = "com.veriff.sdk.views.autocapture.ReflectiveDetectorProvider$probe$1$1$onDetectFailed$1", mo58555f = "DetectorProvider.kt", mo58556l = {85}, mo58557m = "invokeSuspend")
                    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
                    /* renamed from: com.veriff.sdk.internal.ol$b$1$a */
                    public static final class C22211a extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

                        /* renamed from: a */
                        public int f55989a;

                        /* renamed from: b */
                        public final /* synthetic */ C222101 f55990b;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public C22211a(C222101 r1, C23349c cVar) {
                            super(2, cVar);
                            this.f55990b = r1;
                        }

                        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                            C24362h.m61211f(cVar, "completion");
                            return new C22211a(this.f55990b, cVar);
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            return ((C22211a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.f55989a;
                            if (i == 0) {
                                C17885a.m44475z0(obj);
                                this.f55989a = 1;
                                if (C19958a.m47431e(30000, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i == 1) {
                                C17885a.m44475z0(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C22209b bVar = this.f55990b.f55988a;
                            bVar.f55982b.m54023a(bVar.f55983c, false);
                            return C21050d.f52856a;
                        }
                    }

                    @C23413c(mo58554c = "com.veriff.sdk.views.autocapture.ReflectiveDetectorProvider$probe$1$1$onDetectFailed$2", mo58555f = "DetectorProvider.kt", mo58556l = {}, mo58557m = "invokeSuspend")
                    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
                    /* renamed from: com.veriff.sdk.internal.ol$b$1$b */
                    public static final class C22212b extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

                        /* renamed from: a */
                        public int f55991a;

                        /* renamed from: b */
                        public final /* synthetic */ C222101 f55992b;

                        /* renamed from: c */
                        public final /* synthetic */ C22201oj.C22202a.C22203a f55993c;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public C22212b(C222101 r1, C22201oj.C22202a.C22203a aVar, C23349c cVar) {
                            super(2, cVar);
                            this.f55992b = r1;
                            this.f55993c = aVar;
                        }

                        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                            C24362h.m61211f(cVar, "completion");
                            return new C22212b(this.f55992b, this.f55993c, cVar);
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            return ((C22212b) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (this.f55991a == 0) {
                                C17885a.m44475z0(obj);
                                this.f55992b.f55988a.f55982b.f55974b = new C22201oj.C22202a(this.f55993c);
                                return C21050d.f52856a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @C23413c(mo58554c = "com.veriff.sdk.views.autocapture.ReflectiveDetectorProvider$probe$1$1$onDetectResult$1", mo58555f = "DetectorProvider.kt", mo58556l = {}, mo58557m = "invokeSuspend")
                    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
                    /* renamed from: com.veriff.sdk.internal.ol$b$1$c */
                    public static final class C22213c extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

                        /* renamed from: a */
                        public int f55994a;

                        /* renamed from: b */
                        public final /* synthetic */ C222101 f55995b;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public C22213c(C222101 r1, C23349c cVar) {
                            super(2, cVar);
                            this.f55995b = r1;
                        }

                        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                            C24362h.m61211f(cVar, "completion");
                            return new C22213c(this.f55995b, cVar);
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            return ((C22213c) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (this.f55994a == 0) {
                                C17885a.m44475z0(obj);
                                C22209b bVar = this.f55995b.f55988a;
                                bVar.f55982b.f55974b = new C22201oj.C22204b(bVar.f55983c);
                                return C21050d.f52856a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    {
                        this.f55988a = r1;
                    }

                    public void onDetectFailed(Throwable th) {
                        C22201oj.C22202a.C22203a aVar;
                        C24362h.m61211f(th, "error");
                        C22209b bVar = this.f55988a;
                        if (bVar.f55987g) {
                            C25177g.m63218b(bVar.f55982b.f55978f, this.f55988a.f55982b.f55976d, new C22211a(this, (C23349c) null), 2);
                            return;
                        }
                        String message = th.getMessage();
                        if (message == null || !C24179b.m60559G(message, "downloading", true)) {
                            aVar = C22201oj.C22202a.C22203a.PROBE_FAILED;
                        } else {
                            aVar = C22201oj.C22202a.C22203a.MODEL_UNAVAILABLE;
                        }
                        C25177g.m63218b(this.f55988a.f55982b.f55978f, this.f55988a.f55982b.f55976d, new C22212b(this, aVar, (C23349c) null), 2);
                    }

                    public void onDetectResult(List<Face> list, float f) {
                        C24362h.m61211f(list, "faces");
                        C25177g.m63218b(this.f55988a.f55982b.f55978f, this.f55988a.f55982b.f55976d, new C22213c(this, (C23349c) null), 2);
                    }
                });
                return C21050d.f52856a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        new C22208a((DefaultConstructorMarker) null);
    }

    public C22206ol(C21629fg fgVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, C25235z zVar, C24225a<Bitmap> aVar) {
        C24362h.m61211f(fgVar, "instantiator");
        C24362h.m61211f(coroutineDispatcher, "main");
        C24362h.m61211f(coroutineDispatcher2, "computation");
        C24362h.m61211f(zVar, "scope");
        C24362h.m61211f(aVar, "testBitmapFactory");
        this.f55975c = fgVar;
        this.f55976d = coroutineDispatcher;
        this.f55977e = coroutineDispatcher2;
        this.f55978f = zVar;
        this.f55979g = aVar;
        this.f55974b = new C22201oj.C22202a(C22201oj.C22202a.C22203a.PROBE_INCOMPLETE);
    }

    /* renamed from: c */
    private final C22201oj m54028c() {
        FaceDetector faceDetector = (FaceDetector) this.f55975c.mo54905a("com.veriff.sdk.internal.mlkit.MlkitFaceDetector", FaceDetector.class);
        if (faceDetector != null) {
            return new C22201oj.C22204b(faceDetector);
        }
        return new C22201oj.C22202a(C22201oj.C22202a.C22203a.APP_UNSUPPORTED);
    }

    /* renamed from: b */
    public C22201oj mo56109b() {
        return this.f55974b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C22206ol(C21629fg fgVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, C25235z zVar) {
        this(fgVar, coroutineDispatcher, coroutineDispatcher2, zVar, C222071.f55980a);
        C24362h.m61211f(fgVar, "instantiator");
        C24362h.m61211f(coroutineDispatcher, "main");
        C24362h.m61211f(coroutineDispatcher2, "computation");
        C24362h.m61211f(zVar, "scope");
    }

    /* renamed from: a */
    public void mo56108a() {
        C22201oj c = m54028c();
        if (c instanceof C22201oj.C22202a) {
            this.f55974b = c;
        } else if (c instanceof C22201oj.C22204b) {
            m54025a(this, ((C22201oj.C22204b) c).mo56112a(), false, 2, (Object) null);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m54025a(C22206ol olVar, FaceDetector faceDetector, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        olVar.m54023a(faceDetector, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m54023a(FaceDetector faceDetector, boolean z) {
        Point point = new Point(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        float f = (float) RecyclerView.C1119a0.FLAG_IGNORE;
        Rectangle rectangle = new Rectangle(point, new Point(f, f));
        Size size = new Size(f, f);
        C25177g.m63218b(this.f55978f, this.f55977e, new C22209b(this, faceDetector, this.f55979g.invoke(), rectangle, size, z, (C23349c) null), 2);
    }
}
