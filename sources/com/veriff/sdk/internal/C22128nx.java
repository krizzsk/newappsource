package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C1020l;
import androidx.lifecycle.C1033p;
import bf0.C21050d;
import com.appboy.support.AppboyFileUtils;
import com.appsflyer.ServerParameters;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21625ff;
import com.veriff.sdk.internal.nw$a;
import com.veriff.sdk.internal.nw$c;
import com.veriff.sdk.views.camera.C22863d;
import com.veriff.sdk.views.camera.C22875j;
import com.veriff.views.VeriffTextView;
import ff0.C23349c;
import gf0.C23413c;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C24205a;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.data.C24422b;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.layouts.VeriffToolbar;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25235z;
import zh0.C25527h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001GBW\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\bE\u0010FJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0014\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001e\u001a\u00020\u0004H\u0002J \u0010$\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006H"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressView;", "Landroid/widget/LinearLayout;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$View;", "Lcom/veriff/sdk/views/camera/Camera$Listener;", "Lbf0/d;", "bindAddressCapture", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "bindAddressIntro", "", "Landroid/net/Uri;", "selectedUris", "filesSelected", "noCameraDeviceFound", "onCameraBusy", "onCameraReady", "Lmobi/lab/veriff/fragment/PhotoConf;", "photoConf", "photoCaptureFailed", "photoCaptureSuccess", "Ljava/io/File;", "file", "photoFileReady", "Lcom/veriff/sdk/views/address/AddressScreenMvi$ViewState;", "viewState", "render", "resetPhotoCapturing", "Lmobi/lab/veriff/data/AuthenticationFlowStep;", "step", "startAuthenticationFlowStep", "takeFirstPhoto", "", "flashEnabled", "", "pictureContext", "fileName", "takeSecondPhoto", "Lmobi/lab/veriff/databinding/VrffViewAddressBinding;", "binding", "Lmobi/lab/veriff/databinding/VrffViewAddressBinding;", "Lcom/veriff/sdk/views/camera/Camera;", "camera", "Lcom/veriff/sdk/views/camera/Camera;", "Lcom/veriff/sdk/internal/Idler$Handle;", "handle", "Lcom/veriff/sdk/internal/Idler$Handle;", "Lcom/veriff/sdk/views/address/AddressView$Listener;", "listener", "Lcom/veriff/sdk/views/address/AddressView$Listener;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Model;", "model", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Model;", "Lcom/veriff/sdk/internal/upload/PictureStorage;", "pictureStorage", "Lcom/veriff/sdk/internal/upload/PictureStorage;", "Landroidx/lifecycle/l;", "scope", "Landroidx/lifecycle/l;", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/Strings;", "Landroid/content/Context;", "context", "Lcom/veriff/sdk/views/camera/CameraProvider;", "cameraProvider", "Landroidx/lifecycle/p;", "lifecycleOwner", "Lcom/veriff/sdk/views/camera/Camera$VideoListener;", "videoListener", "<init>", "(Landroid/content/Context;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Landroidx/lifecycle/l;Lcom/veriff/sdk/Strings;Lcom/veriff/sdk/views/address/AddressScreenMvi$Model;Lcom/veriff/sdk/internal/upload/PictureStorage;Lcom/veriff/sdk/views/camera/CameraProvider;Landroidx/lifecycle/p;Lcom/veriff/sdk/views/camera/Camera$VideoListener;Lcom/veriff/sdk/views/address/AddressView$Listener;)V", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.nx */
public final class C22128nx extends LinearLayout implements C22863d.C22865b {

    /* renamed from: a */
    private C21625ff.C21626a f55796a;

    /* renamed from: b */
    private C22634vp f55797b;

    /* renamed from: c */
    private final C22863d f55798c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1020l f55799d;

    /* renamed from: e */
    private final C21616ex f55800e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final nw$b f55801f;

    /* renamed from: g */
    private final C22061nh f55802g;

    /* renamed from: h */
    private final C22130a f55803h;

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$1", mo58555f = "AddressView.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$ViewState;", "it", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$1 */
    public static final class C221291 extends SuspendLambda implements C24240p<nw$c, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55804a;

        /* renamed from: b */
        public final /* synthetic */ C22128nx f55805b;

        /* renamed from: c */
        private /* synthetic */ Object f55806c;

        {
            this.f55805b = r1;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            C221291 r0 = new C221291(this.f55805b, cVar);
            r0.f55806c = obj;
            return r0;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C221291) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f55804a == 0) {
                C17885a.m44475z0(obj);
                this.f55805b.mo56055a((nw$c) this.f55806c);
                return C21050d.f52856a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\f\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nH&J\u0014\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressView$Listener;", "", "Lbf0/d;", "noCameraDeviceFound", "onAddressFileSelectionDone", "onAddressPhotoCaptureDone", "onCameraError", "", "source", "onClose", "", "supportedFileTypes", "onShowFileSelection", "Lmobi/lab/veriff/fragment/PhotoConf;", "photoConf", "onSystemError", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$a */
    public interface C22130a {

        @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nx$a$a */
        public static final class C22131a {
            /* renamed from: a */
            public static /* synthetic */ void m53952a(C22130a aVar, C22660wl wlVar, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        wlVar = null;
                    }
                    aVar.mo56016a(wlVar);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSystemError");
            }
        }

        /* renamed from: a */
        void mo56015a();

        /* renamed from: a */
        void mo56016a(C22660wl wlVar);

        /* renamed from: a */
        void mo56017a(String str);

        /* renamed from: a */
        void mo56018a(List<String> list);

        /* renamed from: b */
        void mo56019b();

        /* renamed from: c */
        void mo56020c();
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
          (wrap: androidx.lifecycle.l : 0x0002: INVOKE  (r4v2 androidx.lifecycle.l) = 
          (wrap: com.veriff.sdk.internal.nx : 0x0000: IGET  (r4v1 com.veriff.sdk.internal.nx) = (r3v0 'this' com.veriff.sdk.internal.nx$b A[THIS]) com.veriff.sdk.internal.nx.b.a com.veriff.sdk.internal.nx)
         com.veriff.sdk.internal.nx.a(com.veriff.sdk.internal.nx):androidx.lifecycle.l type: STATIC)
          (null kotlin.coroutines.CoroutineContext)
          (wrap: com.veriff.sdk.internal.nx$b$1 : 0x0009: CONSTRUCTOR  (r0v0 com.veriff.sdk.internal.nx$b$1) = 
          (r3v0 'this' com.veriff.sdk.internal.nx$b A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.nx.b.1.<init>(com.veriff.sdk.internal.nx$b, ff0.c):void type: CONSTRUCTOR)
          (3 int)
         wh0.g.b(wh0.z, kotlin.coroutines.CoroutineContext, lf0.p, int):wh0.o1 type: STATIC in method: com.veriff.sdk.internal.nx.b.onClick(android.view.View):void, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r0v0 com.veriff.sdk.internal.nx$b$1) = 
          (r3v0 'this' com.veriff.sdk.internal.nx$b A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.nx.b.1.<init>(com.veriff.sdk.internal.nx$b, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.nx.b.onClick(android.view.View):void, dex: classes4.dex
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
          (wrap: com.veriff.sdk.internal.nx$b$1 : 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.nx$b$1) = 
          (wrap: com.veriff.sdk.internal.nx$b : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.nx$b) = (r1v0 'this' com.veriff.sdk.internal.nx$b$1 A[THIS]) com.veriff.sdk.internal.nx.b.1.b com.veriff.sdk.internal.nx$b)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.nx.b.1.<init>(com.veriff.sdk.internal.nx$b, ff0.c):void type: CONSTRUCTOR)
         in method: com.veriff.sdk.internal.nx.b.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.nx$b$1) = 
          (wrap: com.veriff.sdk.internal.nx$b : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.nx$b) = (r1v0 'this' com.veriff.sdk.internal.nx$b$1 A[THIS]) com.veriff.sdk.internal.nx.b.1.b com.veriff.sdk.internal.nx$b)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.nx.b.1.<init>(com.veriff.sdk.internal.nx$b, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.nx.b.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	... 76 more
        Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: com.veriff.sdk.internal.nx.b.1
        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
        	... 80 more
        */
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo59060d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "onClick", "(Landroid/view/View;)V", "com/veriff/sdk/views/address/AddressView$bindAddressCapture$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$b */
    public static final class C22132b implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C22128nx f55807a;

        @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$bindAddressCapture$1$1$1", mo58555f = "AddressView.kt", mo58556l = {84}, mo58557m = "invokeSuspend")
        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/veriff/sdk/views/address/AddressView$bindAddressCapture$1$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nx$b$1 */
        public static final class C221331 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

            /* renamed from: a */
            public int f55808a;

            /* renamed from: b */
            public final /* synthetic */ C22132b f55809b;

            {
                this.f55809b = r1;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                C24362h.m61211f(cVar, "completion");
                return new C221331(this.f55809b, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C221331) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f55808a;
                if (i == 0) {
                    C17885a.m44475z0(obj);
                    C25527h<nw$a> a = this.f55809b.f55807a.f55801f.mo55994a();
                    nw$a.C22103a.C22106c cVar = nw$a.C22103a.C22106c.f55775a;
                    this.f55808a = 1;
                    if (a.emit(cVar, this) == coroutineSingletons) {
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

        public C22132b(C22128nx nxVar) {
            this.f55807a = nxVar;
        }

        public final void onClick(View view) {
            C25177g.m63218b(this.f55807a.f55799d, (CoroutineContext) null, new C221331(this, (C23349c) null), 3);
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
          (wrap: androidx.lifecycle.l : 0x0002: INVOKE  (r4v2 androidx.lifecycle.l) = 
          (wrap: com.veriff.sdk.internal.nx : 0x0000: IGET  (r4v1 com.veriff.sdk.internal.nx) = (r3v0 'this' com.veriff.sdk.internal.nx$c A[THIS]) com.veriff.sdk.internal.nx.c.a com.veriff.sdk.internal.nx)
         com.veriff.sdk.internal.nx.a(com.veriff.sdk.internal.nx):androidx.lifecycle.l type: STATIC)
          (null kotlin.coroutines.CoroutineContext)
          (wrap: com.veriff.sdk.internal.nx$c$1 : 0x0009: CONSTRUCTOR  (r0v0 com.veriff.sdk.internal.nx$c$1) = 
          (r3v0 'this' com.veriff.sdk.internal.nx$c A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.nx.c.1.<init>(com.veriff.sdk.internal.nx$c, ff0.c):void type: CONSTRUCTOR)
          (3 int)
         wh0.g.b(wh0.z, kotlin.coroutines.CoroutineContext, lf0.p, int):wh0.o1 type: STATIC in method: com.veriff.sdk.internal.nx.c.onClick(android.view.View):void, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r0v0 com.veriff.sdk.internal.nx$c$1) = 
          (r3v0 'this' com.veriff.sdk.internal.nx$c A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.nx.c.1.<init>(com.veriff.sdk.internal.nx$c, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.nx.c.onClick(android.view.View):void, dex: classes4.dex
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
          (wrap: com.veriff.sdk.internal.nx$c$1 : 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.nx$c$1) = 
          (wrap: com.veriff.sdk.internal.nx$c : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.nx$c) = (r1v0 'this' com.veriff.sdk.internal.nx$c$1 A[THIS]) com.veriff.sdk.internal.nx.c.1.b com.veriff.sdk.internal.nx$c)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.nx.c.1.<init>(com.veriff.sdk.internal.nx$c, ff0.c):void type: CONSTRUCTOR)
         in method: com.veriff.sdk.internal.nx.c.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.nx$c$1) = 
          (wrap: com.veriff.sdk.internal.nx$c : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.nx$c) = (r1v0 'this' com.veriff.sdk.internal.nx$c$1 A[THIS]) com.veriff.sdk.internal.nx.c.1.b com.veriff.sdk.internal.nx$c)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.nx.c.1.<init>(com.veriff.sdk.internal.nx$c, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.nx.c.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	... 76 more
        Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: com.veriff.sdk.internal.nx.c.1
        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
        	... 80 more
        */
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$c */
    public static final class C22134c implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C22128nx f55810a;

        @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$bindAddressCapture$2$1", mo58555f = "AddressView.kt", mo58556l = {87}, mo58557m = "invokeSuspend")
        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nx$c$1 */
        public static final class C221351 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

            /* renamed from: a */
            public int f55811a;

            /* renamed from: b */
            public final /* synthetic */ C22134c f55812b;

            {
                this.f55812b = r1;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                C24362h.m61211f(cVar, "completion");
                return new C221351(this.f55812b, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C221351) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f55811a;
                if (i == 0) {
                    C17885a.m44475z0(obj);
                    C25527h<nw$a> a = this.f55812b.f55810a.f55801f.mo55994a();
                    nw$a.C22111b.C22112a aVar = nw$a.C22111b.C22112a.f55781a;
                    this.f55811a = 1;
                    if (a.emit(aVar, this) == coroutineSingletons) {
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

        public C22134c(C22128nx nxVar) {
            this.f55810a = nxVar;
        }

        public final void onClick(View view) {
            C25177g.m63218b(this.f55810a.f55799d, (CoroutineContext) null, new C221351(this, (C23349c) null), 3);
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
          (wrap: androidx.lifecycle.l : 0x0002: INVOKE  (r0v1 androidx.lifecycle.l) = 
          (wrap: com.veriff.sdk.internal.nx : 0x0000: IGET  (r0v0 com.veriff.sdk.internal.nx) = (r4v0 'this' com.veriff.sdk.internal.nx$d A[THIS]) com.veriff.sdk.internal.nx.d.a com.veriff.sdk.internal.nx)
         com.veriff.sdk.internal.nx.a(com.veriff.sdk.internal.nx):androidx.lifecycle.l type: STATIC)
          (null kotlin.coroutines.CoroutineContext)
          (wrap: com.veriff.sdk.internal.nx$d$1 : 0x0009: CONSTRUCTOR  (r1v0 com.veriff.sdk.internal.nx$d$1) = 
          (r4v0 'this' com.veriff.sdk.internal.nx$d A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.nx.d.1.<init>(com.veriff.sdk.internal.nx$d, ff0.c):void type: CONSTRUCTOR)
          (3 int)
         wh0.g.b(wh0.z, kotlin.coroutines.CoroutineContext, lf0.p, int):wh0.o1 type: STATIC in method: com.veriff.sdk.internal.nx.d.onClick():void, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r1v0 com.veriff.sdk.internal.nx$d$1) = 
          (r4v0 'this' com.veriff.sdk.internal.nx$d A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.nx.d.1.<init>(com.veriff.sdk.internal.nx$d, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.nx.d.onClick():void, dex: classes4.dex
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
          (wrap: com.veriff.sdk.internal.nx$d$1 : 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.nx$d$1) = 
          (wrap: com.veriff.sdk.internal.nx$d : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.nx$d) = (r1v0 'this' com.veriff.sdk.internal.nx$d$1 A[THIS]) com.veriff.sdk.internal.nx.d.1.b com.veriff.sdk.internal.nx$d)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.nx.d.1.<init>(com.veriff.sdk.internal.nx$d, ff0.c):void type: CONSTRUCTOR)
         in method: com.veriff.sdk.internal.nx.d.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.nx$d$1) = 
          (wrap: com.veriff.sdk.internal.nx$d : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.nx$d) = (r1v0 'this' com.veriff.sdk.internal.nx$d$1 A[THIS]) com.veriff.sdk.internal.nx.d.1.b com.veriff.sdk.internal.nx$d)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.nx.d.1.<init>(com.veriff.sdk.internal.nx$d, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.nx.d.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	... 76 more
        Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: com.veriff.sdk.internal.nx.d.1
        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
        	... 80 more
        */
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "onClick", "()V", "com/veriff/sdk/views/address/AddressView$bindAddressIntro$2$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$d */
    public static final class C22136d implements VeriffButton.C24432a {

        /* renamed from: a */
        public final /* synthetic */ C22128nx f55813a;

        @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$bindAddressIntro$2$1$1", mo58555f = "AddressView.kt", mo58556l = {105}, mo58557m = "invokeSuspend")
        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/veriff/sdk/views/address/AddressView$bindAddressIntro$2$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nx$d$1 */
        public static final class C221371 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

            /* renamed from: a */
            public int f55814a;

            /* renamed from: b */
            public final /* synthetic */ C22136d f55815b;

            {
                this.f55815b = r1;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                C24362h.m61211f(cVar, "completion");
                return new C221371(this.f55815b, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C221371) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f55814a;
                if (i == 0) {
                    C17885a.m44475z0(obj);
                    C25527h<nw$a> a = this.f55815b.f55813a.f55801f.mo55994a();
                    nw$a.C22111b.C22116e eVar = nw$a.C22111b.C22116e.f55785a;
                    this.f55814a = 1;
                    if (a.emit(eVar, this) == coroutineSingletons) {
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

        public C22136d(C22128nx nxVar) {
            this.f55813a = nxVar;
        }

        public final void onClick() {
            C25177g.m63218b(this.f55813a.f55799d, (CoroutineContext) null, new C221371(this, (C23349c) null), 3);
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
          (wrap: androidx.lifecycle.l : 0x0002: INVOKE  (r0v1 androidx.lifecycle.l) = 
          (wrap: com.veriff.sdk.internal.nx : 0x0000: IGET  (r0v0 com.veriff.sdk.internal.nx) = (r4v0 'this' com.veriff.sdk.internal.nx$e A[THIS]) com.veriff.sdk.internal.nx.e.a com.veriff.sdk.internal.nx)
         com.veriff.sdk.internal.nx.a(com.veriff.sdk.internal.nx):androidx.lifecycle.l type: STATIC)
          (null kotlin.coroutines.CoroutineContext)
          (wrap: com.veriff.sdk.internal.nx$e$1 : 0x0009: CONSTRUCTOR  (r1v0 com.veriff.sdk.internal.nx$e$1) = 
          (r4v0 'this' com.veriff.sdk.internal.nx$e A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.nx.e.1.<init>(com.veriff.sdk.internal.nx$e, ff0.c):void type: CONSTRUCTOR)
          (3 int)
         wh0.g.b(wh0.z, kotlin.coroutines.CoroutineContext, lf0.p, int):wh0.o1 type: STATIC in method: com.veriff.sdk.internal.nx.e.onClick():void, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r1v0 com.veriff.sdk.internal.nx$e$1) = 
          (r4v0 'this' com.veriff.sdk.internal.nx$e A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.nx.e.1.<init>(com.veriff.sdk.internal.nx$e, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.nx.e.onClick():void, dex: classes4.dex
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
          (wrap: com.veriff.sdk.internal.nx$e$1 : 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.nx$e$1) = 
          (wrap: com.veriff.sdk.internal.nx$e : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.nx$e) = (r1v0 'this' com.veriff.sdk.internal.nx$e$1 A[THIS]) com.veriff.sdk.internal.nx.e.1.b com.veriff.sdk.internal.nx$e)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.nx.e.1.<init>(com.veriff.sdk.internal.nx$e, ff0.c):void type: CONSTRUCTOR)
         in method: com.veriff.sdk.internal.nx.e.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.nx$e$1) = 
          (wrap: com.veriff.sdk.internal.nx$e : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.nx$e) = (r1v0 'this' com.veriff.sdk.internal.nx$e$1 A[THIS]) com.veriff.sdk.internal.nx.e.1.b com.veriff.sdk.internal.nx$e)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.nx.e.1.<init>(com.veriff.sdk.internal.nx$e, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.nx.e.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	... 76 more
        Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: com.veriff.sdk.internal.nx.e.1
        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
        	... 80 more
        */
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "onClick", "()V", "com/veriff/sdk/views/address/AddressView$bindAddressIntro$3$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$e */
    public static final class C22138e implements VeriffButton.C24432a {

        /* renamed from: a */
        public final /* synthetic */ C22128nx f55816a;

        @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$bindAddressIntro$3$1$1", mo58555f = "AddressView.kt", mo58556l = {110}, mo58557m = "invokeSuspend")
        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/veriff/sdk/views/address/AddressView$bindAddressIntro$3$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nx$e$1 */
        public static final class C221391 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

            /* renamed from: a */
            public int f55817a;

            /* renamed from: b */
            public final /* synthetic */ C22138e f55818b;

            {
                this.f55818b = r1;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                C24362h.m61211f(cVar, "completion");
                return new C221391(this.f55818b, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C221391) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f55817a;
                if (i == 0) {
                    C17885a.m44475z0(obj);
                    C25527h<nw$a> a = this.f55818b.f55816a.f55801f.mo55994a();
                    nw$a.C22111b.C22115d dVar = nw$a.C22111b.C22115d.f55784a;
                    this.f55817a = 1;
                    if (a.emit(dVar, this) == coroutineSingletons) {
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

        public C22138e(C22128nx nxVar) {
            this.f55816a = nxVar;
        }

        public final void onClick() {
            C25177g.m63218b(this.f55816a.f55799d, (CoroutineContext) null, new C221391(this, (C23349c) null), 3);
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
          (wrap: androidx.lifecycle.l : 0x0002: INVOKE  (r0v1 androidx.lifecycle.l) = 
          (wrap: com.veriff.sdk.internal.nx : 0x0000: IGET  (r0v0 com.veriff.sdk.internal.nx) = (r4v0 'this' com.veriff.sdk.internal.nx$f A[THIS]) com.veriff.sdk.internal.nx.f.a com.veriff.sdk.internal.nx)
         com.veriff.sdk.internal.nx.a(com.veriff.sdk.internal.nx):androidx.lifecycle.l type: STATIC)
          (null kotlin.coroutines.CoroutineContext)
          (wrap: com.veriff.sdk.internal.nx$f$1 : 0x0009: CONSTRUCTOR  (r1v0 com.veriff.sdk.internal.nx$f$1) = 
          (r4v0 'this' com.veriff.sdk.internal.nx$f A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.nx.f.1.<init>(com.veriff.sdk.internal.nx$f, ff0.c):void type: CONSTRUCTOR)
          (3 int)
         wh0.g.b(wh0.z, kotlin.coroutines.CoroutineContext, lf0.p, int):wh0.o1 type: STATIC in method: com.veriff.sdk.internal.nx.f.a():void, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r1v0 com.veriff.sdk.internal.nx$f$1) = 
          (r4v0 'this' com.veriff.sdk.internal.nx$f A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.nx.f.1.<init>(com.veriff.sdk.internal.nx$f, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.nx.f.a():void, dex: classes4.dex
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
          (wrap: com.veriff.sdk.internal.nx$f$1 : 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.nx$f$1) = 
          (wrap: com.veriff.sdk.internal.nx$f : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.nx$f) = (r1v0 'this' com.veriff.sdk.internal.nx$f$1 A[THIS]) com.veriff.sdk.internal.nx.f.1.b com.veriff.sdk.internal.nx$f)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.nx.f.1.<init>(com.veriff.sdk.internal.nx$f, ff0.c):void type: CONSTRUCTOR)
         in method: com.veriff.sdk.internal.nx.f.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.nx$f$1) = 
          (wrap: com.veriff.sdk.internal.nx$f : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.nx$f) = (r1v0 'this' com.veriff.sdk.internal.nx$f$1 A[THIS]) com.veriff.sdk.internal.nx.f.1.b com.veriff.sdk.internal.nx$f)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.nx.f.1.<init>(com.veriff.sdk.internal.nx$f, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.nx.f.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	... 76 more
        Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: com.veriff.sdk.internal.nx.f.1
        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
        	... 80 more
        */
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "onCloseButtonClicked", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$f */
    public static final class C22140f implements VeriffToolbar.C24438b {

        /* renamed from: a */
        public final /* synthetic */ C22128nx f55819a;

        @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$bindAddressIntro$1$1", mo58555f = "AddressView.kt", mo58556l = {93}, mo58557m = "invokeSuspend")
        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nx$f$1 */
        public static final class C221411 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

            /* renamed from: a */
            public int f55820a;

            /* renamed from: b */
            public final /* synthetic */ C22140f f55821b;

            {
                this.f55821b = r1;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                C24362h.m61211f(cVar, "completion");
                return new C221411(this.f55821b, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C221411) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f55820a;
                if (i == 0) {
                    C17885a.m44475z0(obj);
                    C25527h<nw$a> a = this.f55821b.f55819a.f55801f.mo55994a();
                    nw$a.C22111b.C22112a aVar = nw$a.C22111b.C22112a.f55781a;
                    this.f55820a = 1;
                    if (a.emit(aVar, this) == coroutineSingletons) {
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

        public C22140f(C22128nx nxVar) {
            this.f55819a = nxVar;
        }

        /* renamed from: a */
        public final void mo55837a() {
            C25177g.m63218b(this.f55819a.f55799d, (CoroutineContext) null, new C221411(this, (C23349c) null), 3);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$filesSelected$1", mo58555f = "AddressView.kt", mo58556l = {177}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$g */
    public static final class C22142g extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55822a;

        /* renamed from: b */
        public final /* synthetic */ C22128nx f55823b;

        /* renamed from: c */
        public final /* synthetic */ List f55824c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22142g(C22128nx nxVar, List list, C23349c cVar) {
            super(2, cVar);
            this.f55823b = nxVar;
            this.f55824c = list;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22142g(this.f55823b, this.f55824c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22142g) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55822a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25527h<nw$a> a = this.f55823b.f55801f.mo55994a();
                nw$a.C22111b.C22114c cVar = new nw$a.C22111b.C22114c(this.f55824c);
                this.f55822a = 1;
                if (a.emit(cVar, this) == coroutineSingletons) {
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

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$onCameraBusy$1", mo58555f = "AddressView.kt", mo58556l = {168}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$h */
    public static final class C22143h extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55825a;

        /* renamed from: b */
        public final /* synthetic */ C22128nx f55826b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22143h(C22128nx nxVar, C23349c cVar) {
            super(2, cVar);
            this.f55826b = nxVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22143h(this.f55826b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22143h) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55825a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25527h<nw$a> a = this.f55826b.f55801f.mo55994a();
                nw$a.C22103a.C22104a aVar = nw$a.C22103a.C22104a.f55773a;
                this.f55825a = 1;
                if (a.emit(aVar, this) == coroutineSingletons) {
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

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$onCameraReady$1", mo58555f = "AddressView.kt", mo58556l = {172}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$i */
    public static final class C22144i extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55827a;

        /* renamed from: b */
        public final /* synthetic */ C22128nx f55828b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22144i(C22128nx nxVar, C23349c cVar) {
            super(2, cVar);
            this.f55828b = nxVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22144i(this.f55828b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22144i) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55827a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25527h<nw$a> a = this.f55828b.f55801f.mo55994a();
                nw$a.C22103a.C22105b bVar = nw$a.C22103a.C22105b.f55774a;
                this.f55827a = 1;
                if (a.emit(bVar, this) == coroutineSingletons) {
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

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$photoCaptureFailed$1", mo58555f = "AddressView.kt", mo58556l = {160}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$j */
    public static final class C22145j extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55829a;

        /* renamed from: b */
        public final /* synthetic */ C22128nx f55830b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22145j(C22128nx nxVar, C23349c cVar) {
            super(2, cVar);
            this.f55830b = nxVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22145j(this.f55830b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22145j) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55829a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25527h<nw$a> a = this.f55830b.f55801f.mo55994a();
                nw$a.C22103a.C22110g gVar = nw$a.C22103a.C22110g.f55780a;
                this.f55829a = 1;
                if (a.emit(gVar, this) == coroutineSingletons) {
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

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$photoCaptureSuccess$1", mo58555f = "AddressView.kt", mo58556l = {149}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$k */
    public static final class C22146k extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55831a;

        /* renamed from: b */
        public final /* synthetic */ C22128nx f55832b;

        /* renamed from: c */
        public final /* synthetic */ C22660wl f55833c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22146k(C22128nx nxVar, C22660wl wlVar, C23349c cVar) {
            super(2, cVar);
            this.f55832b = nxVar;
            this.f55833c = wlVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22146k(this.f55832b, this.f55833c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22146k) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55831a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25527h<nw$a> a = this.f55832b.f55801f.mo55994a();
                nw$a.C22103a.C22108e eVar = new nw$a.C22103a.C22108e(this.f55833c);
                this.f55831a = 1;
                if (a.emit(eVar, this) == coroutineSingletons) {
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

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$photoFileReady$1", mo58555f = "AddressView.kt", mo58556l = {154}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$l */
    public static final class C22147l extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55834a;

        /* renamed from: b */
        public final /* synthetic */ C22128nx f55835b;

        /* renamed from: c */
        public final /* synthetic */ C22660wl f55836c;

        /* renamed from: d */
        public final /* synthetic */ File f55837d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22147l(C22128nx nxVar, C22660wl wlVar, File file, C23349c cVar) {
            super(2, cVar);
            this.f55835b = nxVar;
            this.f55836c = wlVar;
            this.f55837d = file;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22147l(this.f55835b, this.f55836c, this.f55837d, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22147l) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55834a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25527h<nw$a> a = this.f55835b.f55801f.mo55994a();
                nw$a.C22103a.C22109f fVar = new nw$a.C22103a.C22109f(this.f55836c, this.f55837d);
                this.f55834a = 1;
                if (a.emit(fVar, this) == coroutineSingletons) {
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

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$resetPhotoCapturing$1", mo58555f = "AddressView.kt", mo58556l = {193}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$m */
    public static final class C22148m extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55838a;

        /* renamed from: b */
        public final /* synthetic */ C22128nx f55839b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22148m(C22128nx nxVar, C23349c cVar) {
            super(2, cVar);
            this.f55839b = nxVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22148m(this.f55839b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22148m) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55838a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25527h<nw$a> a = this.f55839b.f55801f.mo55994a();
                nw$a.C22103a.C22110g gVar = nw$a.C22103a.C22110g.f55780a;
                this.f55838a = 1;
                if (a.emit(gVar, this) == coroutineSingletons) {
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

    @C23413c(mo58554c = "com.veriff.sdk.views.address.AddressView$startAuthenticationFlowStep$1", mo58555f = "AddressView.kt", mo58556l = {182}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nx$n */
    public static final class C22149n extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55840a;

        /* renamed from: b */
        public final /* synthetic */ C22128nx f55841b;

        /* renamed from: c */
        public final /* synthetic */ C24422b f55842c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22149n(C22128nx nxVar, C24422b bVar, C23349c cVar) {
            super(2, cVar);
            this.f55841b = nxVar;
            this.f55842c = bVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22149n(this.f55841b, this.f55842c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22149n) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55840a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25527h<nw$a> a = this.f55841b.f55801f.mo55994a();
                nw$a.C22111b.C22113b bVar = new nw$a.C22111b.C22113b(this.f55842c);
                this.f55840a = 1;
                if (a.emit(bVar, this) == coroutineSingletons) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22128nx(Context context, C22700xq xqVar, C1020l lVar, C21616ex exVar, nw$b nw_b, C22061nh nhVar, C22875j jVar, C1033p pVar, C22863d.C22867d dVar, C22130a aVar) {
        super(context);
        C22700xq xqVar2 = xqVar;
        C1020l lVar2 = lVar;
        C21616ex exVar2 = exVar;
        nw$b nw_b2 = nw_b;
        C22061nh nhVar2 = nhVar;
        C22130a aVar2 = aVar;
        Context context2 = context;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(lVar2, "scope");
        C24362h.m61211f(exVar2, "strings");
        C24362h.m61211f(nw_b2, ServerParameters.MODEL);
        C24362h.m61211f(nhVar2, "pictureStorage");
        C24362h.m61211f(jVar, "cameraProvider");
        C24362h.m61211f(pVar, "lifecycleOwner");
        C24362h.m61211f(dVar, "videoListener");
        C24362h.m61211f(aVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f55799d = lVar2;
        this.f55800e = exVar2;
        this.f55801f = nw_b2;
        this.f55802g = nhVar2;
        this.f55803h = aVar2;
        C22634vp a = C22634vp.m55179a(LayoutInflater.from(context), this, true);
        C24362h.m61210e(a, "VrffViewAddressBinding.i…rom(context), this, true)");
        this.f55797b = a;
        FrameLayout frameLayout = a.f57107a.f57110d;
        C24362h.m61210e(frameLayout, "binding.addressCapture.addressCaptureContainer");
        this.f55798c = jVar.createCamera(frameLayout, pVar, this, dVar, (C22863d.C22864a) null);
        C24205a.m60672a(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(nw_b.mo55995b(), new C221291(this, (C23349c) null)), lVar2);
        m53931a(xqVar);
        m53934e();
    }

    /* renamed from: e */
    private final void m53934e() {
        TextView textView = this.f55797b.f57107a.f57113h;
        C24362h.m61210e(textView, "binding.addressCapture.addressCaptureTitle");
        textView.setText(this.f55800e.mo54835dQ());
        TextView textView2 = this.f55797b.f57107a.f57111e;
        C24362h.m61210e(textView2, "binding.addressCapture.addressCaptureDescription");
        textView2.setText(this.f55800e.mo54836dR());
        this.f55797b.f57107a.f57114i.setOnClickListener(new C22132b(this));
        this.f55797b.f57107a.f57109c.setOnClickListener(new C22134c(this));
    }

    /* renamed from: f */
    private final void m53935f() {
        this.f55798c.takePhoto(new C22660wl(false, true, this.f55801f.mo55996c()), this.f55802g, this.f55801f.mo55997d());
    }

    /* renamed from: a_ */
    public void mo56060a_() {
        C25177g.m63218b(this.f55799d, (CoroutineContext) null, new C22144i(this, (C23349c) null), 3);
    }

    /* renamed from: d */
    public final void mo56063d() {
        C25177g.m63218b(this.f55799d, (CoroutineContext) null, new C22148m(this, (C23349c) null), 3);
    }

    /* renamed from: a */
    private final void m53931a(C22700xq xqVar) {
        this.f55797b.f57108b.f57120e.mo60641a((VeriffToolbar.C24438b) new C22140f(this));
        VeriffTextView veriffTextView = this.f55797b.f57108b.f57121f;
        C24362h.m61210e(veriffTextView, "binding.addressIntro.addressTitle");
        veriffTextView.setText(this.f55800e.mo54831dM());
        VeriffTextView veriffTextView2 = this.f55797b.f57108b.f57116a;
        C24362h.m61210e(veriffTextView2, "binding.addressIntro.addressDescription");
        veriffTextView2.setText(this.f55800e.mo54832dN());
        VeriffTextView veriffTextView3 = this.f55797b.f57108b.f57118c;
        C24362h.m61210e(veriffTextView3, "binding.addressIntro.addressInfoTitle");
        veriffTextView3.setText(this.f55800e.mo54833dO());
        VeriffTextView veriffTextView4 = this.f55797b.f57108b.f57117b;
        C24362h.m61210e(veriffTextView4, "binding.addressIntro.addressInfoDescription");
        veriffTextView4.setText(this.f55800e.mo54834dP());
        C22636vr vrVar = this.f55797b.f57108b;
        C24362h.m61210e(vrVar, "binding.addressIntro");
        vrVar.mo56990a().setBackgroundColor(xqVar.mo57135v().mo57096k());
        this.f55797b.f57108b.f57124k.setBackgroundColor(xqVar.mo57135v().mo57092h());
        VeriffButton veriffButton = this.f55797b.f57108b.f57123h;
        veriffButton.setText(this.f55800e.mo54722bL());
        veriffButton.setOnClick(new C22136d(this));
        VeriffButton veriffButton2 = this.f55797b.f57108b.f57122g;
        veriffButton2.setText(this.f55800e.mo54721bK());
        veriffButton2.setOnClick(new C22138e(this));
    }

    /* renamed from: b */
    public void mo56062b(C22660wl wlVar) {
        C24362h.m61211f(wlVar, "photoConf");
        this.f55803h.mo56016a(wlVar);
        C25177g.m63218b(this.f55799d, (CoroutineContext) null, new C22145j(this, (C23349c) null), 3);
    }

    /* renamed from: b */
    public void mo56061b() {
        C25177g.m63218b(this.f55799d, (CoroutineContext) null, new C22143h(this, (C23349c) null), 3);
    }

    /* renamed from: a */
    public void mo56055a(nw$c nw_c) {
        C24362h.m61211f(nw_c, "viewState");
        boolean z = false;
        if (C24362h.m61206a(nw_c, nw$c.C22126i.f55794a)) {
            ConstraintLayout constraintLayout = this.f55797b.f57107a.f57112f;
            C24362h.m61210e(constraintLayout, "binding.addressCapture.addressCaptureLayout");
            constraintLayout.setVisibility(8);
            ConstraintLayout constraintLayout2 = this.f55797b.f57108b.f57119d;
            C24362h.m61210e(constraintLayout2, "binding.addressIntro.addressIntroLayout");
            constraintLayout2.setVisibility(0);
            this.f55801f.mo56000g();
        } else if (C24362h.m61206a(nw_c, nw$c.C22125h.f55793a)) {
            ConstraintLayout constraintLayout3 = this.f55797b.f57108b.f57119d;
            C24362h.m61210e(constraintLayout3, "binding.addressIntro.addressIntroLayout");
            constraintLayout3.setVisibility(8);
            ConstraintLayout constraintLayout4 = this.f55797b.f57107a.f57112f;
            C24362h.m61210e(constraintLayout4, "binding.addressCapture.addressCaptureLayout");
            constraintLayout4.setVisibility(0);
        } else if (nw_c instanceof nw$c.C22124g) {
            this.f55803h.mo56017a(((nw$c.C22124g) nw_c).mo56046a());
        } else if (C24362h.m61206a(nw_c, nw$c.C22122e.f55790a)) {
            m53935f();
        } else if (nw_c instanceof nw$c.C22123f) {
            if (((nw$c.C22123f) nw_c).mo56042a() && this.f55798c.hasCurrentCameraFlashCapability()) {
                z = true;
            }
            m53932a(z, this.f55801f.mo55998e(), this.f55801f.mo55999f());
            C21625ff.C21626a aVar = this.f55796a;
            if (aVar != null) {
                aVar.mo54900a();
            }
        } else if (nw_c instanceof nw$c.C22127j) {
            this.f55803h.mo56018a(((nw$c.C22127j) nw_c).mo56050a());
        } else if (C24362h.m61206a(nw_c, nw$c.C22118a.f55787a)) {
            this.f55803h.mo56015a();
        } else if (C24362h.m61206a(nw_c, nw$c.C22120c.f55789a)) {
            this.f55803h.mo56019b();
        } else if (nw_c instanceof nw$c.C22121d) {
            FrameLayout frameLayout = this.f55797b.f57107a.f57114i;
            C24362h.m61210e(frameLayout, "binding.addressCapture.cameraCaptureContainer");
            frameLayout.setEnabled(((nw$c.C22121d) nw_c).mo56038a());
        } else if (C24362h.m61206a(nw_c, nw$c.C22119b.f55788a)) {
            C22130a.C22131a.m53952a(this.f55803h, (C22660wl) null, 1, (Object) null);
        }
    }

    /* renamed from: a */
    public void mo56056a(C22660wl wlVar) {
        C24362h.m61211f(wlVar, "photoConf");
        if (wlVar.mo57007b()) {
            this.f55796a = C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null);
        }
        C25177g.m63218b(this.f55799d, (CoroutineContext) null, new C22146k(this, wlVar, (C23349c) null), 3);
    }

    /* renamed from: a */
    public void mo56057a(C22660wl wlVar, File file) {
        C24362h.m61211f(wlVar, "photoConf");
        C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
        C25177g.m63218b(this.f55799d, (CoroutineContext) null, new C22147l(this, wlVar, file, (C23349c) null), 3);
    }

    /* renamed from: a */
    public void mo56054a() {
        this.f55803h.mo56020c();
    }

    /* renamed from: a */
    public final void mo56058a(List<? extends Uri> list) {
        C24362h.m61211f(list, "selectedUris");
        C25177g.m63218b(this.f55799d, (CoroutineContext) null, new C22142g(this, list, (C23349c) null), 3);
    }

    /* renamed from: a */
    public final void mo56059a(C24422b bVar) {
        C24362h.m61211f(bVar, "step");
        this.f55798c.selectCamera(C22863d.C22866c.BACK);
        C25177g.m63218b(this.f55799d, (CoroutineContext) null, new C22149n(this, bVar, (C23349c) null), 3);
    }

    /* renamed from: a */
    private final void m53932a(boolean z, String str, String str2) {
        this.f55798c.takePhoto(new C22660wl(z, false, str), this.f55802g, str2);
    }
}
