package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bf0.C21050d;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.qn$b;
import com.veriff.views.VeriffTextView;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.R$drawable;
import mobi.lab.veriff.layouts.CornerFrame;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.layouts.VeriffToolbar;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25235z;
import yh0.C25325q;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006%"}, mo59060d2 = {"Lcom/veriff/sdk/views/inflow/InflowAtEndView;", "Landroid/widget/LinearLayout;", "Lbf0/d;", "hideLoading", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState$Summary;", "summary", "setState", "setStateLoading", "showLoading", "", "baseUrl", "Ljava/lang/String;", "Lmobi/lab/veriff/databinding/VrffViewInflowAtEndBinding;", "binding", "Lmobi/lab/veriff/databinding/VrffViewInflowAtEndBinding;", "Lyh0/q;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$Action;", "inputs", "Lyh0/q;", "Lkotlinx/coroutines/CoroutineDispatcher;", "main", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/squareup/picasso/Picasso;", "picasso", "Lcom/squareup/picasso/Picasso;", "Lwh0/z;", "scope", "Lwh0/z;", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/Strings;", "Landroid/content/Context;", "context", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "<init>", "(Landroid/content/Context;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lwh0/z;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/veriff/sdk/Strings;Lcom/squareup/picasso/Picasso;Ljava/lang/String;Lyh0/q;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.qp */
public final class C22339qp extends LinearLayout {

    /* renamed from: a */
    private C22648wc f56354a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C25235z f56355b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final CoroutineDispatcher f56356c;

    /* renamed from: d */
    private final C21616ex f56357d;

    /* renamed from: e */
    private final C21512ci f56358e;

    /* renamed from: f */
    private final String f56359f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C25325q<qn$a> f56360g;

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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: INVOKE  
          (wrap: wh0.z : 0x0002: INVOKE  (r0v1 wh0.z) = 
          (wrap: com.veriff.sdk.internal.qp : 0x0000: IGET  (r0v0 com.veriff.sdk.internal.qp) = (r4v0 'this' com.veriff.sdk.internal.qp$a A[THIS]) com.veriff.sdk.internal.qp.a.a com.veriff.sdk.internal.qp)
         com.veriff.sdk.internal.qp.a(com.veriff.sdk.internal.qp):wh0.z type: STATIC)
          (wrap: kotlinx.coroutines.CoroutineDispatcher : 0x0008: INVOKE  (r1v1 kotlinx.coroutines.CoroutineDispatcher) = 
          (wrap: com.veriff.sdk.internal.qp : 0x0006: IGET  (r1v0 com.veriff.sdk.internal.qp) = (r4v0 'this' com.veriff.sdk.internal.qp$a A[THIS]) com.veriff.sdk.internal.qp.a.a com.veriff.sdk.internal.qp)
         com.veriff.sdk.internal.qp.b(com.veriff.sdk.internal.qp):kotlinx.coroutines.CoroutineDispatcher type: STATIC)
          (wrap: com.veriff.sdk.internal.qp$a$1 : 0x000f: CONSTRUCTOR  (r2v0 com.veriff.sdk.internal.qp$a$1) = 
          (r4v0 'this' com.veriff.sdk.internal.qp$a A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.qp.a.1.<init>(com.veriff.sdk.internal.qp$a, ff0.c):void type: CONSTRUCTOR)
          (2 int)
         wh0.g.b(wh0.z, kotlin.coroutines.CoroutineContext, lf0.p, int):wh0.o1 type: STATIC in method: com.veriff.sdk.internal.qp.a.onClick():void, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: CONSTRUCTOR  (r2v0 com.veriff.sdk.internal.qp$a$1) = 
          (r4v0 'this' com.veriff.sdk.internal.qp$a A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.qp.a.1.<init>(com.veriff.sdk.internal.qp$a, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.qp.a.onClick():void, dex: classes4.dex
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
          (wrap: com.veriff.sdk.internal.qp$a$1 : 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.qp$a$1) = 
          (wrap: com.veriff.sdk.internal.qp$a : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.qp$a) = (r1v0 'this' com.veriff.sdk.internal.qp$a$1 A[THIS]) com.veriff.sdk.internal.qp.a.1.b com.veriff.sdk.internal.qp$a)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.qp.a.1.<init>(com.veriff.sdk.internal.qp$a, ff0.c):void type: CONSTRUCTOR)
         in method: com.veriff.sdk.internal.qp.a.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.qp$a$1) = 
          (wrap: com.veriff.sdk.internal.qp$a : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.qp$a) = (r1v0 'this' com.veriff.sdk.internal.qp$a$1 A[THIS]) com.veriff.sdk.internal.qp.a.1.b com.veriff.sdk.internal.qp$a)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.qp.a.1.<init>(com.veriff.sdk.internal.qp$a, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.qp.a.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	... 76 more
        Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: com.veriff.sdk.internal.qp.a.1
        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
        	... 80 more
        */
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "onClick", "()V", "com/veriff/sdk/views/inflow/InflowAtEndView$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qp$a */
    public static final class C22342a implements VeriffButton.C24432a {

        /* renamed from: a */
        public final /* synthetic */ C22339qp f56364a;

        @C23413c(mo58554c = "com.veriff.sdk.views.inflow.InflowAtEndView$1$1$1", mo58555f = "InflowAtEndView.kt", mo58556l = {56}, mo58557m = "invokeSuspend")
        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/veriff/sdk/views/inflow/InflowAtEndView$1$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.qp$a$1 */
        public static final class C223431 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

            /* renamed from: a */
            public int f56365a;

            /* renamed from: b */
            public final /* synthetic */ C22342a f56366b;

            {
                this.f56366b = r1;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                C24362h.m61211f(cVar, "completion");
                return new C223431(this.f56366b, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C223431) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f56365a;
                if (i == 0) {
                    C17885a.m44475z0(obj);
                    C25325q c = this.f56366b.f56364a.f56360g;
                    qn$a qn_a = qn$a.TRY_AGAIN_CLICK;
                    this.f56365a = 1;
                    if (c.mo60341A(qn_a, this) == coroutineSingletons) {
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

        public C22342a(C22339qp qpVar) {
            this.f56364a = qpVar;
        }

        public final void onClick() {
            C25177g.m63218b(this.f56364a.f56355b, this.f56364a.f56356c, new C223431(this, (C23349c) null), 2);
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: INVOKE  
          (wrap: wh0.z : 0x0002: INVOKE  (r0v1 wh0.z) = 
          (wrap: com.veriff.sdk.internal.qp : 0x0000: IGET  (r0v0 com.veriff.sdk.internal.qp) = (r4v0 'this' com.veriff.sdk.internal.qp$b A[THIS]) com.veriff.sdk.internal.qp.b.a com.veriff.sdk.internal.qp)
         com.veriff.sdk.internal.qp.a(com.veriff.sdk.internal.qp):wh0.z type: STATIC)
          (wrap: kotlinx.coroutines.CoroutineDispatcher : 0x0008: INVOKE  (r1v1 kotlinx.coroutines.CoroutineDispatcher) = 
          (wrap: com.veriff.sdk.internal.qp : 0x0006: IGET  (r1v0 com.veriff.sdk.internal.qp) = (r4v0 'this' com.veriff.sdk.internal.qp$b A[THIS]) com.veriff.sdk.internal.qp.b.a com.veriff.sdk.internal.qp)
         com.veriff.sdk.internal.qp.b(com.veriff.sdk.internal.qp):kotlinx.coroutines.CoroutineDispatcher type: STATIC)
          (wrap: com.veriff.sdk.internal.qp$b$1 : 0x000f: CONSTRUCTOR  (r2v0 com.veriff.sdk.internal.qp$b$1) = 
          (r4v0 'this' com.veriff.sdk.internal.qp$b A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.qp.b.1.<init>(com.veriff.sdk.internal.qp$b, ff0.c):void type: CONSTRUCTOR)
          (2 int)
         wh0.g.b(wh0.z, kotlin.coroutines.CoroutineContext, lf0.p, int):wh0.o1 type: STATIC in method: com.veriff.sdk.internal.qp.b.onClick():void, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: CONSTRUCTOR  (r2v0 com.veriff.sdk.internal.qp$b$1) = 
          (r4v0 'this' com.veriff.sdk.internal.qp$b A[THIS])
          (null ff0.c)
         call: com.veriff.sdk.internal.qp.b.1.<init>(com.veriff.sdk.internal.qp$b, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.qp.b.onClick():void, dex: classes4.dex
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
          (wrap: com.veriff.sdk.internal.qp$b$1 : 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.qp$b$1) = 
          (wrap: com.veriff.sdk.internal.qp$b : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.qp$b) = (r1v0 'this' com.veriff.sdk.internal.qp$b$1 A[THIS]) com.veriff.sdk.internal.qp.b.1.b com.veriff.sdk.internal.qp$b)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.qp.b.1.<init>(com.veriff.sdk.internal.qp$b, ff0.c):void type: CONSTRUCTOR)
         in method: com.veriff.sdk.internal.qp.b.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
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
        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r2v2 com.veriff.sdk.internal.qp$b$1) = 
          (wrap: com.veriff.sdk.internal.qp$b : 0x0007: IGET  (r0v0 com.veriff.sdk.internal.qp$b) = (r1v0 'this' com.veriff.sdk.internal.qp$b$1 A[THIS]) com.veriff.sdk.internal.qp.b.1.b com.veriff.sdk.internal.qp$b)
          (r3v0 'cVar' ff0.c<?>)
         call: com.veriff.sdk.internal.qp.b.1.<init>(com.veriff.sdk.internal.qp$b, ff0.c):void type: CONSTRUCTOR in method: com.veriff.sdk.internal.qp.b.1.create(java.lang.Object, ff0.c):ff0.c<bf0.d>, dex: classes4.dex
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	... 76 more
        Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: com.veriff.sdk.internal.qp.b.1
        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
        	... 80 more
        */
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "onClick", "()V", "com/veriff/sdk/views/inflow/InflowAtEndView$2$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qp$b */
    public static final class C22344b implements VeriffButton.C24432a {

        /* renamed from: a */
        public final /* synthetic */ C22339qp f56367a;

        @C23413c(mo58554c = "com.veriff.sdk.views.inflow.InflowAtEndView$2$1$1", mo58555f = "InflowAtEndView.kt", mo58556l = {65}, mo58557m = "invokeSuspend")
        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/veriff/sdk/views/inflow/InflowAtEndView$2$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.qp$b$1 */
        public static final class C223451 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

            /* renamed from: a */
            public int f56368a;

            /* renamed from: b */
            public final /* synthetic */ C22344b f56369b;

            {
                this.f56369b = r1;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                C24362h.m61211f(cVar, "completion");
                return new C223451(this.f56369b, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C223451) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f56368a;
                if (i == 0) {
                    C17885a.m44475z0(obj);
                    C25325q c = this.f56369b.f56367a.f56360g;
                    qn$a qn_a = qn$a.CONTINUE_CLICK;
                    this.f56368a = 1;
                    if (c.mo60341A(qn_a, this) == coroutineSingletons) {
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

        public C22344b(C22339qp qpVar) {
            this.f56367a = qpVar;
        }

        public final void onClick() {
            C25177g.m63218b(this.f56367a.f56355b, this.f56367a.f56356c, new C223451(this, (C23349c) null), 2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22339qp(Context context, C22700xq xqVar, C25235z zVar, CoroutineDispatcher coroutineDispatcher, C21616ex exVar, C21512ci ciVar, String str, C25325q<? super qn$a> qVar) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(zVar, "scope");
        C24362h.m61211f(coroutineDispatcher, "main");
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(ciVar, "picasso");
        C24362h.m61211f(str, "baseUrl");
        C24362h.m61211f(qVar, "inputs");
        this.f56355b = zVar;
        this.f56356c = coroutineDispatcher;
        this.f56357d = exVar;
        this.f56358e = ciVar;
        this.f56359f = str;
        this.f56360g = qVar;
        C22648wc a = C22648wc.m55208a(LayoutInflater.from(context), this, true);
        C24362h.m61210e(a, "VrffViewInflowAtEndBindi…rom(context), this, true)");
        this.f56354a = a;
        ProgressBar progressBar = a.f57222b.f57088b;
        C24362h.m61210e(progressBar, "binding.inflowEndUploadi…nflowEndUploadingProgress");
        progressBar.setIndeterminateDrawable(xqVar.mo57124k());
        this.f56354a.mo56992a().setBackgroundColor(xqVar.mo57135v().mo57096k());
        VeriffTextView veriffTextView = this.f56354a.f57221a.f57231k;
        C24362h.m61210e(veriffTextView, "binding.inflowEndSummary.inflowEndTitle");
        veriffTextView.setText(exVar.mo54723bM());
        this.f56354a.f57221a.f57234o.addView(new CornerFrame(context, xqVar.mo57135v().mo57096k()));
        VeriffTextView veriffTextView2 = this.f56354a.f57222b.f57090d;
        C24362h.m61210e(veriffTextView2, "binding.inflowEndUploading.inflowEndUploadingTitle");
        veriffTextView2.setText(exVar.mo54788cX());
        VeriffTextView veriffTextView3 = this.f56354a.f57222b.f57089c;
        C24362h.m61210e(veriffTextView3, "binding.inflowEndUploading.inflowEndUploadingText");
        veriffTextView3.setText(exVar.mo54699aq());
        VeriffButton veriffButton = this.f56354a.f57221a.f57228h;
        veriffButton.setText(exVar.mo54715bE());
        veriffButton.setOnClick(new C22342a(this));
        VeriffButton veriffButton2 = this.f56354a.f57221a.f57227g;
        veriffButton2.setText(exVar.mo54762bz());
        veriffButton2.setOnClick(new C22344b(this));
        this.f56354a.f57221a.f57232l.mo60641a((VeriffToolbar.C24438b) new VeriffToolbar.C24438b(this) {

            /* renamed from: a */
            public final /* synthetic */ C22339qp f56361a;

            @C23413c(mo58554c = "com.veriff.sdk.views.inflow.InflowAtEndView$3$1", mo58555f = "InflowAtEndView.kt", mo58556l = {72}, mo58557m = "invokeSuspend")
            @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
            /* renamed from: com.veriff.sdk.internal.qp$1$1 */
            public static final class C223411 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

                /* renamed from: a */
                public int f56362a;

                /* renamed from: b */
                public final /* synthetic */ C223401 f56363b;

                {
                    this.f56363b = r1;
                }

                public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                    C24362h.m61211f(cVar, "completion");
                    return new C223411(this.f56363b, cVar);
                }

                public final Object invoke(Object obj, Object obj2) {
                    return ((C223411) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f56362a;
                    if (i == 0) {
                        C17885a.m44475z0(obj);
                        C25325q c = this.f56363b.f56361a.f56360g;
                        qn$a qn_a = qn$a.CLOSE;
                        this.f56362a = 1;
                        if (c.mo60341A(qn_a, this) == coroutineSingletons) {
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

            {
                this.f56361a = r1;
            }

            /* renamed from: a */
            public final void mo55837a() {
                C25177g.m63218b(this.f56361a.f56355b, this.f56361a.f56356c, new C223411(this, (C23349c) null), 2);
            }
        });
    }

    public final void setState(qn$b.C22335e eVar) {
        C24362h.m61211f(eVar, "summary");
        m54429c();
        this.f56358e.mo54487a(C22034mp.m53717a(eVar.mo56345a())).mo54527a(this.f56354a.f57221a.f57229i);
        TextView textView = this.f56354a.f57221a.f57233m;
        C24362h.m61210e(textView, "binding.inflowEndSummary.inflowFeedbackLabel");
        CharSequence a = eVar.mo56348d().mo56771a();
        if (a == null) {
            a = eVar.mo56346b().mo55488g().mo55567a().invoke(this.f56357d);
        }
        textView.setText(a);
        VeriffTextView veriffTextView = this.f56354a.f57221a.f57230j;
        C24362h.m61210e(veriffTextView, "binding.inflowEndSummary.inflowEndText");
        veriffTextView.setText(eVar.mo56348d().mo56773c());
        C22560tp a2 = C22573tr.m54981a(eVar.mo56348d(), this.f56359f);
        if (a2 != null) {
            ImageView imageView = this.f56354a.f57221a.f57236q;
            C24362h.m61210e(imageView, "binding.inflowEndSummary.visualFeedbackOk");
            imageView.setVisibility(0);
            C21528cm a3 = this.f56358e.mo54487a(a2.mo56757b());
            int i = R$drawable.vrff_feedback_placeholder;
            a3.mo54525a(i).mo54527a(this.f56354a.f57221a.f57236q);
            ImageView imageView2 = this.f56354a.f57221a.f57226f;
            C24362h.m61210e(imageView2, "binding.inflowEndSummary.iconOk");
            imageView2.setVisibility(0);
            ImageView imageView3 = this.f56354a.f57221a.f57235p;
            C24362h.m61210e(imageView3, "binding.inflowEndSummary.visualFeedbackNotOk");
            imageView3.setVisibility(0);
            this.f56358e.mo54487a(a2.mo56756a()).mo54525a(i).mo54527a(this.f56354a.f57221a.f57235p);
            ImageView imageView4 = this.f56354a.f57221a.f57225e;
            C24362h.m61210e(imageView4, "binding.inflowEndSummary.iconNotOk");
            imageView4.setVisibility(0);
        } else {
            ImageView imageView5 = this.f56354a.f57221a.f57236q;
            C24362h.m61210e(imageView5, "binding.inflowEndSummary.visualFeedbackOk");
            imageView5.setVisibility(8);
            ImageView imageView6 = this.f56354a.f57221a.f57235p;
            C24362h.m61210e(imageView6, "binding.inflowEndSummary.visualFeedbackNotOk");
            imageView6.setVisibility(8);
            ImageView imageView7 = this.f56354a.f57221a.f57226f;
            C24362h.m61210e(imageView7, "binding.inflowEndSummary.iconOk");
            imageView7.setVisibility(8);
            ImageView imageView8 = this.f56354a.f57221a.f57225e;
            C24362h.m61210e(imageView8, "binding.inflowEndSummary.iconNotOk");
            imageView8.setVisibility(8);
        }
        VeriffTextView veriffTextView2 = this.f56354a.f57221a.f57230j;
        C24362h.m61210e(veriffTextView2, "binding.inflowEndSummary.inflowEndText");
        veriffTextView2.setText(eVar.mo56348d().mo56773c());
        VeriffButton veriffButton = this.f56354a.f57221a.f57228h;
        C24362h.m61210e(veriffButton, "binding.inflowEndSummary.inflowEndBtnTryAgain");
        veriffButton.setVisibility(0);
        if (eVar.mo56347c()) {
            VeriffButton veriffButton2 = this.f56354a.f57221a.f57227g;
            C24362h.m61210e(veriffButton2, "binding.inflowEndSummary.inflowEndBtnContinue");
            veriffButton2.setVisibility(8);
            return;
        }
        VeriffButton veriffButton3 = this.f56354a.f57221a.f57227g;
        C24362h.m61210e(veriffButton3, "binding.inflowEndSummary.inflowEndBtnContinue");
        veriffButton3.setVisibility(0);
    }

    /* renamed from: b */
    private final void m54427b() {
        RelativeLayout relativeLayout = this.f56354a.f57222b.f57087a;
        C24362h.m61210e(relativeLayout, "binding.inflowEndUploading.container");
        relativeLayout.setVisibility(0);
        ConstraintLayout constraintLayout = this.f56354a.f57221a.f57224c;
        C24362h.m61210e(constraintLayout, "binding.inflowEndSummary.container");
        constraintLayout.setVisibility(8);
    }

    /* renamed from: c */
    private final void m54429c() {
        RelativeLayout relativeLayout = this.f56354a.f57222b.f57087a;
        C24362h.m61210e(relativeLayout, "binding.inflowEndUploading.container");
        relativeLayout.setVisibility(8);
        ConstraintLayout constraintLayout = this.f56354a.f57221a.f57224c;
        C24362h.m61210e(constraintLayout, "binding.inflowEndSummary.container");
        constraintLayout.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo56354a() {
        m54427b();
    }
}
