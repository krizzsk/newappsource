package com.veriff.sdk.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import bf0.C21050d;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.views.VeriffTextView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.R$drawable;
import mobi.lab.veriff.layouts.VeriffButton;
import p242s1.C6333d0;
import p242s1.C6382p0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u001f B'\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR*\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006!"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/NfcScanView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lbf0/d;", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/veriff/sdk/views/nfc/NfcScanView$State;", "state", "setToState", "Landroid/animation/AnimatorSet;", "animator", "Landroid/animation/AnimatorSet;", "Lmobi/lab/veriff/databinding/VrffViewNfcScanningBinding;", "binding", "Lmobi/lab/veriff/databinding/VrffViewNfcScanningBinding;", "value", "Lcom/veriff/sdk/views/nfc/NfcScanView$State;", "getState", "()Lcom/veriff/sdk/views/nfc/NfcScanView$State;", "setState", "(Lcom/veriff/sdk/views/nfc/NfcScanView$State;)V", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/Strings;", "Landroid/content/Context;", "context", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "Lcom/veriff/sdk/views/nfc/NfcScanView$Listener;", "listener", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/Strings;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/views/nfc/NfcScanView$Listener;)V", "Listener", "State", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.rw */
public final class C22439rw extends ConstraintLayout {

    /* renamed from: a */
    private C22444e f56636a;

    /* renamed from: b */
    private final C22653wh f56637b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AnimatorSet f56638c;

    /* renamed from: d */
    private final C21616ex f56639d;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo59060d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "onClick", "(Landroid/view/View;)V", "com/veriff/sdk/views/nfc/NfcScanView$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rw$a */
    public static final class C22440a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C22443d f56640b;

        public C22440a(C22439rw rwVar, C22443d dVar) {
            this.f56640b = dVar;
        }

        public final void onClick(View view) {
            this.f56640b.mo56507b();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "onClick", "()V", "com/veriff/sdk/views/nfc/NfcScanView$2$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rw$b */
    public static final class C22441b implements VeriffButton.C24432a {

        /* renamed from: b */
        public final /* synthetic */ C22443d f56641b;

        public C22441b(C22439rw rwVar, C22443d dVar) {
            this.f56641b = dVar;
        }

        public final void onClick() {
            this.f56641b.mo56508c();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "onClick", "()V", "com/veriff/sdk/views/nfc/NfcScanView$3$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rw$c */
    public static final class C22442c implements VeriffButton.C24432a {

        /* renamed from: b */
        public final /* synthetic */ C22443d f56642b;

        public C22442c(C22439rw rwVar, C22443d dVar) {
            this.f56642b = dVar;
        }

        public final void onClick() {
            this.f56642b.mo56509d();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0006"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/NfcScanView$Listener;", "", "Lbf0/d;", "onCloseClicked", "onContinueClicked", "onSkipClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rw$d */
    public interface C22443d {
        /* renamed from: b */
        void mo56507b();

        /* renamed from: c */
        void mo56508c();

        /* renamed from: d */
        void mo56509d();
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b#\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0001\b\u0002\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b'\u0010(R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u001b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\rR\u0017\u0010!\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bj\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/NfcScanView$State;", "", "Lkotlin/Function1;", "Lcom/veriff/sdk/Strings;", "", "description", "Llf0/l;", "getDescription", "()Llf0/l;", "", "done", "Z", "getDone", "()Z", "", "icon", "Ljava/lang/Integer;", "getIcon", "()Ljava/lang/Integer;", "largeScanPassport", "getLargeScanPassport", "passport", "getPassport", "progress", "getProgress", "scanPhone", "getScanPhone", "scanRings", "getScanRings", "skippable", "getSkippable", "smallScanPassport", "getSmallScanPassport", "step", "I", "getStep", "()I", "title", "getTitle", "<init>", "(Ljava/lang/String;ILlf0/l;Llf0/l;IZZZZZZLjava/lang/Integer;ZZ)V", "LOOKING", "LOOKING_SKIPPABLE", "STILL_LOOKING", "STILL_LOOKING_SKIPPABLE", "CONNECTED", "PROCESSING", "CONNECTION_LOST", "DONE", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rw$e */
    public enum C22444e {
        LOOKING(C224451.f56664a, C224609.f56679a, 0, true, false, true, false, false, false, (boolean) null, false, false, 4052, (boolean) null),
        LOOKING_SKIPPABLE(C2244610.f56665a, C2244711.f56666a, 0, true, false, true, false, false, false, (boolean) null, true, false, 3028, (boolean) null),
        STILL_LOOKING(C2244812.f56667a, C2244913.f56668a, 0, true, true, false, true, false, false, (boolean) null, false, false, 4004, (boolean) null),
        STILL_LOOKING_SKIPPABLE(C2245014.f56669a, C2245115.f56670a, 0, true, true, false, true, false, false, (boolean) null, true, false, 2980, (boolean) null),
        CONNECTED(C2245216.f56671a, C224532.f56672a, 0, false, false, false, false, true, true, (boolean) null, false, false, 3708, (boolean) null),
        PROCESSING(C224543.f56673a, C224554.f56674a, 0, false, false, false, false, true, true, (boolean) null, false, false, 3708, (boolean) null),
        CONNECTION_LOST(C224565.f56675a, C224576.f56676a, 0, false, false, false, false, true, false, Integer.valueOf(R$drawable.vrff_ic_submission_not_ok), false, false, 3452, (boolean) null),
        DONE(C224587.f56677a, C224598.f56678a, 3, false, false, false, false, true, false, Integer.valueOf(R$drawable.vrff_ic_submission_ok), false, true, 1400, (boolean) null);
        

        /* renamed from: j */
        private final C24236l<C21616ex, CharSequence> f56652j;

        /* renamed from: k */
        private final C24236l<C21616ex, CharSequence> f56653k;

        /* renamed from: l */
        private final int f56654l;

        /* renamed from: m */
        private final boolean f56655m;

        /* renamed from: n */
        private final boolean f56656n;

        /* renamed from: o */
        private final boolean f56657o;

        /* renamed from: p */
        private final boolean f56658p;

        /* renamed from: q */
        private final boolean f56659q;

        /* renamed from: r */
        private final boolean f56660r;

        /* renamed from: s */
        private final Integer f56661s;

        /* renamed from: t */
        private final boolean f56662t;

        /* renamed from: u */
        private final boolean f56663u;

        private C22444e(C24236l<? super C21616ex, ? extends CharSequence> lVar, C24236l<? super C21616ex, ? extends CharSequence> lVar2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Integer num, boolean z7, boolean z8) {
            this.f56652j = lVar;
            this.f56653k = lVar2;
            this.f56654l = i;
            this.f56655m = z;
            this.f56656n = z2;
            this.f56657o = z3;
            this.f56658p = z4;
            this.f56659q = z5;
            this.f56660r = z6;
            this.f56661s = num;
            this.f56662t = z7;
            this.f56663u = z8;
        }

        /* renamed from: a */
        public final C24236l<C21616ex, CharSequence> mo56528a() {
            return this.f56652j;
        }

        /* renamed from: b */
        public final C24236l<C21616ex, CharSequence> mo56529b() {
            return this.f56653k;
        }

        /* renamed from: c */
        public final int mo56530c() {
            return this.f56654l;
        }

        /* renamed from: d */
        public final boolean mo56531d() {
            return this.f56655m;
        }

        /* renamed from: e */
        public final boolean mo56532e() {
            return this.f56656n;
        }

        /* renamed from: f */
        public final boolean mo56533f() {
            return this.f56657o;
        }

        /* renamed from: g */
        public final boolean mo56534g() {
            return this.f56658p;
        }

        /* renamed from: h */
        public final boolean mo56535h() {
            return this.f56659q;
        }

        /* renamed from: i */
        public final boolean mo56536i() {
            return this.f56660r;
        }

        /* renamed from: j */
        public final Integer mo56537j() {
            return this.f56661s;
        }

        /* renamed from: k */
        public final boolean mo56538k() {
            return this.f56662t;
        }

        /* renamed from: l */
        public final boolean mo56539l() {
            return this.f56663u;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJP\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, mo59060d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Lbf0/d;", "view", "L;", "left", "top", "kotlin/Int", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "onLayoutChange", "<init>", "(Llf0/l;)V", "core-ktx_release"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rw$f */
    public static final class C22461f implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C22439rw f56680a;

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b¸\u0006\u0000"}, mo59060d2 = {"com/veriff/sdk/views/nfc/NfcScanView$setToState$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "isReverse", "Lbf0/d;", "onAnimationEnd", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.rw$f$a */
        public static final class C22462a extends AnimatorListenerAdapter {
            public void onAnimationEnd(Animator animator, boolean z) {
                C24362h.m61211f(animator, "animation");
                animator.start();
            }
        }

        public C22461f(C22439rw rwVar) {
            this.f56680a = rwVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C24362h.m61212g(view, Promotion.ACTION_VIEW);
            view.removeOnLayoutChangeListener(this);
            C22439rw rwVar = this.f56680a;
            AnimatorSet animatorSet = new AnimatorSet();
            float f = -((float) view.getWidth());
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{f});
            ofFloat.setDuration(2000);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationX", new float[]{f * 0.6f});
            ofFloat2.setDuration(2000);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationY", new float[]{(-((float) view.getHeight())) * 0.45f});
            ofFloat3.setDuration(2000);
            animatorSet2.playTogether(new Animator[]{ofFloat2, ofFloat3});
            AnimatorSet animatorSet3 = new AnimatorSet();
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f});
            ofFloat4.setDuration(2000);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f});
            ofFloat5.setDuration(2000);
            animatorSet3.playTogether(new Animator[]{ofFloat4, ofFloat5});
            animatorSet.playSequentially(new Animator[]{ofFloat, animatorSet2, animatorSet3});
            animatorSet.start();
            animatorSet.addListener(new C22462a());
            C21050d dVar = C21050d.f52856a;
            rwVar.f56638c = animatorSet;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo59060d2 = {"com/veriff/sdk/views/nfc/NfcScanView$setToState$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "isReverse", "Lbf0/d;", "onAnimationEnd", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rw$g */
    public static final class C22463g extends AnimatorListenerAdapter {
        public void onAnimationEnd(Animator animator, boolean z) {
            C24362h.m61211f(animator, "animation");
            animator.start();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22439rw(Context context, C21616ex exVar, C22700xq xqVar, C22443d dVar) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f56639d = exVar;
        C22444e eVar = C22444e.LOOKING;
        this.f56636a = eVar;
        C22653wh a = C22653wh.m55218a(LayoutInflater.from(context), this);
        C24362h.m61210e(a, "VrffViewNfcScanningBindi…ater.from(context), this)");
        this.f56637b = a;
        setBackgroundColor(xqVar.mo57135v().mo57096k());
        ImageView imageView = a.f57268g;
        imageView.setContentDescription(exVar.mo54719bI());
        imageView.setOnClickListener(new C22440a(this, dVar));
        VeriffTextView veriffTextView = a.f57274m;
        C24362h.m61210e(veriffTextView, "binding.scanTitle");
        veriffTextView.setText(exVar.mo54849dj());
        ProgressBar progressBar = a.f57266e;
        C24362h.m61210e(progressBar, "binding.progress");
        progressBar.setIndeterminateDrawable(xqVar.mo57122i());
        VeriffButton veriffButton = a.f57264b;
        veriffButton.setText(exVar.mo54711bA());
        veriffButton.setOnClick(new C22441b(this, dVar));
        VeriffButton veriffButton2 = a.f57263a;
        veriffButton2.setText(exVar.mo54762bz());
        veriffButton2.setOnClick(new C22442c(this, dVar));
        setState(eVar);
    }

    private final void setToState(C22444e eVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        this.f56637b.f57276o.mo57004a(eVar.mo56530c(), 3);
        ImageView imageView = this.f56637b.f57267f;
        C24362h.m61210e(imageView, "binding.scanBackground");
        int i8 = 0;
        if (!eVar.mo56531d()) {
            i = 4;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        ImageView imageView2 = this.f56637b.f57270i;
        C24362h.m61210e(imageView2, "binding.scanPassportLarge");
        if (eVar.mo56533f()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView2.setVisibility(i2);
        ImageView imageView3 = this.f56637b.f57271j;
        C24362h.m61210e(imageView3, "binding.scanPassportSmall");
        if (eVar.mo56532e()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView3.setVisibility(i3);
        if (!eVar.mo56534g()) {
            AnimatorSet animatorSet = this.f56638c;
            if (animatorSet != null) {
                animatorSet.pause();
            }
            this.f56638c = null;
        } else if (this.f56638c == null) {
            ImageView imageView4 = this.f56637b.f57272k;
            C24362h.m61210e(imageView4, "binding.scanPhone");
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (!C6333d0.C6340g.m15076c(imageView4) || imageView4.isLayoutRequested()) {
                imageView4.addOnLayoutChangeListener(new C22461f(this));
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                float f = -((float) imageView4.getWidth());
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView4, "translationX", new float[]{f});
                ofFloat.setDuration(2000);
                AnimatorSet animatorSet3 = new AnimatorSet();
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView4, "translationX", new float[]{f * 0.6f});
                ofFloat2.setDuration(2000);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView4, "translationY", new float[]{(-((float) imageView4.getHeight())) * 0.45f});
                ofFloat3.setDuration(2000);
                animatorSet3.playTogether(new Animator[]{ofFloat2, ofFloat3});
                AnimatorSet animatorSet4 = new AnimatorSet();
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, "translationX", new float[]{0.0f});
                ofFloat4.setDuration(2000);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView4, "translationY", new float[]{0.0f});
                ofFloat5.setDuration(2000);
                animatorSet4.playTogether(new Animator[]{ofFloat4, ofFloat5});
                animatorSet2.playSequentially(new Animator[]{ofFloat, animatorSet3, animatorSet4});
                animatorSet2.start();
                animatorSet2.addListener(new C22463g());
                C21050d dVar = C21050d.f52856a;
                this.f56638c = animatorSet2;
            }
        }
        ImageView imageView5 = this.f56637b.f57272k;
        C24362h.m61210e(imageView5, "binding.scanPhone");
        if (eVar.mo56534g()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        imageView5.setVisibility(i4);
        ImageView imageView6 = this.f56637b.f57265d;
        C24362h.m61210e(imageView6, "binding.passport");
        if (eVar.mo56535h()) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        imageView6.setVisibility(i5);
        ProgressBar progressBar = this.f56637b.f57266e;
        C24362h.m61210e(progressBar, "binding.progress");
        if (eVar.mo56536i()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        progressBar.setVisibility(i6);
        if (eVar.mo56537j() != null) {
            this.f56637b.f57275n.setImageResource(eVar.mo56537j().intValue());
            ImageView imageView7 = this.f56637b.f57275n;
            C24362h.m61210e(imageView7, "binding.statusIcon");
            imageView7.setVisibility(0);
        } else {
            ImageView imageView8 = this.f56637b.f57275n;
            C24362h.m61210e(imageView8, "binding.statusIcon");
            imageView8.setVisibility(8);
        }
        VeriffTextView veriffTextView = this.f56637b.f57273l;
        C24362h.m61210e(veriffTextView, "binding.scanState");
        veriffTextView.setText(eVar.mo56528a().invoke(this.f56639d));
        VeriffTextView veriffTextView2 = this.f56637b.f57269h;
        C24362h.m61210e(veriffTextView2, "binding.scanHint");
        veriffTextView2.setText(eVar.mo56529b().invoke(this.f56639d));
        VeriffButton veriffButton = this.f56637b.f57264b;
        C24362h.m61210e(veriffButton, "binding.btnSkip");
        if (!eVar.mo56538k()) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        veriffButton.setVisibility(i7);
        VeriffButton veriffButton2 = this.f56637b.f57263a;
        C24362h.m61210e(veriffButton2, "binding.btnContinue");
        if (!eVar.mo56539l()) {
            i8 = 8;
        }
        veriffButton2.setVisibility(i8);
    }

    public final C22444e getState() {
        return this.f56636a;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f56638c;
        if (animatorSet != null) {
            animatorSet.resume();
        }
    }

    public void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.f56638c;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        super.onDetachedFromWindow();
    }

    public final void setState(C22444e eVar) {
        C24362h.m61211f(eVar, "value");
        this.f56636a = eVar;
        setToState(eVar);
    }
}
