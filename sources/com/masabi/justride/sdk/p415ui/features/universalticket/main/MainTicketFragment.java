package com.masabi.justride.sdk.p415ui.features.universalticket.main;

import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.C0801k;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1044w;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.assetpacks.C14333w2;
import com.masabi.justride.sdk.exception.MissingArgumentException;
import com.masabi.justride.sdk.exception.MissingSDKException;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import com.masabi.justride.sdk.p415ui.features.universalticket.components.C14670b;
import com.masabi.justride.sdk.p415ui.features.universalticket.components.FrostedScrollView;
import com.masabi.justride.sdk.p415ui.features.universalticket.components.UniversalTicketButtonFrame;
import com.masabi.justride.sdk.p415ui.features.universalticket.main.exceptions.UnknownLayoutPresetException;
import com.masabi.justride.sdk.p415ui.features.universalticket.main.visualvalidation.VisualValidationFragment;
import com.masabi.justride.sdk.platform.jobs.CallBackOn;
import java.util.Date;
import kotlin.C23812a;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;
import p389bl.C13641g;
import p494fp.C17049a;
import p494fp.C17050b;
import p494fp.C17051c;
import p494fp.C17053e;
import p565io.C17624a;
import p566ip.C17627a;
import p583jk.C17884p;
import p584jl.C17885a;
import p588jp.C17905a;
import p605ki.C18060n;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18066t;
import p605ki.C18067u;
import p611ko.C18110b;
import p701oj.C18771o;
import p752qn.C19143a;
import p871vo.C20178e;
import p871vo.C20189f;
import p871vo.C20190g;
import p871vo.C20193i;
import p891wk.C20362q;
import p891wk.C20364s;
import p893wm.C20374a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/masabi/justride/sdk/ui/features/universalticket/main/MainTicketFragment;", "Lio/a;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment */
public final class MainTicketFragment extends C17624a {

    /* renamed from: t */
    public static final /* synthetic */ int f37249t = 0;

    /* renamed from: c */
    public C18771o f37250c;

    /* renamed from: d */
    public C17053e f37251d;

    /* renamed from: e */
    public boolean f37252e;

    /* renamed from: f */
    public final C14670b f37253f = new C14670b(1000, new C14674b(this));

    /* renamed from: g */
    public C18110b f37254g;

    /* renamed from: h */
    public final C21049c f37255h = C23812a.m58432b(new MainTicketFragment$barcodeFragmentContainer$2(this));

    /* renamed from: i */
    public final C21049c f37256i = C23812a.m58432b(new MainTicketFragment$straplineTextView$2(this));

    /* renamed from: j */
    public final C21049c f37257j = C23812a.m58432b(new MainTicketFragment$visualValidationAndTicketFaceLinearLayout$2(this));

    /* renamed from: k */
    public final C21049c f37258k = C23812a.m58432b(new MainTicketFragment$visualValidationFragmentContainer$2(this));

    /* renamed from: l */
    public final C21049c f37259l = C23812a.m58432b(new MainTicketFragment$ticketFaceFragmentContainer$2(this));

    /* renamed from: m */
    public final C21049c f37260m = C23812a.m58432b(new MainTicketFragment$customTicketFaceViewContainer$2(this));

    /* renamed from: n */
    public final C21049c f37261n = C23812a.m58432b(new MainTicketFragment$useItOrLoseItTextView$2(this));

    /* renamed from: o */
    public final C21049c f37262o = C23812a.m58432b(new MainTicketFragment$recentActivationIndicatorTextView$2(this));

    /* renamed from: p */
    public final C21049c f37263p = C23812a.m58432b(new MainTicketFragment$finalizationReasonTextView$2(this));

    /* renamed from: q */
    public final C21049c f37264q = C23812a.m58432b(new MainTicketFragment$activationInstructionTextView$2(this));

    /* renamed from: r */
    public final C21049c f37265r = C23812a.m58432b(new MainTicketFragment$activationButtonContainer$2(this));

    /* renamed from: s */
    public final C21049c f37266s = C23812a.m58432b(new MainTicketFragment$importantActionButtonContainer$2(this));

    /* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment$a */
    public static final class C14673a<T> implements C1044w<C20364s> {

        /* renamed from: a */
        public final /* synthetic */ MainTicketFragment f37267a;

        public C14673a(MainTicketFragment mainTicketFragment) {
            this.f37267a = mainTicketFragment;
        }

        /* JADX WARNING: type inference failed for: r1v15, types: [androidx.fragment.app.Fragment] */
        /* JADX WARNING: type inference failed for: r15v122, types: [androidx.fragment.app.Fragment] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01de  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0276  */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onChanged(java.lang.Object r15) {
            /*
                r14 = this;
                r3 = r15
                wk.s r3 = (p891wk.C20364s) r3
                com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment r15 = r14.f37267a
                fp.e r15 = r15.f37251d
                r6 = 0
                if (r15 == 0) goto L_0x000f
                java.lang.String r15 = r15.mo49663d()
                goto L_0x0010
            L_0x000f:
                r15 = r6
            L_0x0010:
                com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment r7 = r14.f37267a
                ki.b r0 = r7.f45307b
                s6.c r0 = r0.f46180j
                java.lang.Class<fp.e$a> r1 = p494fp.C17053e.C17054a.class
                ho.b r0 = r0.mo22587a(r1)
                fp.e$a r0 = (p494fp.C17053e.C17054a) r0
                java.lang.String r8 = "it"
                mf0.C24362h.m61210e(r3, r8)
                com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment r1 = r14.f37267a
                ki.b r2 = r1.f45307b
                om.g r2 = r2.f46184n
                vl.a r2 = r2.f47833f
                r4 = r2
                mo.d r4 = (p658mo.C18410d) r4
                android.content.res.Resources r5 = r1.getResources()
                java.lang.String r1 = "resources"
                mf0.C24362h.m61210e(r5, r1)
                fp.e r9 = new fp.e
                wm.b r1 = r0.f44215a
                do.b r2 = r0.f44216b
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                r7.f37251d = r9
                com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment r0 = r14.f37267a
                fp.e r1 = r0.f37251d
                if (r1 == 0) goto L_0x04f9
                qn.h r2 = r1.mo49664e()
                wk.s r3 = r1.f44213f
                com.masabi.justride.sdk.internal.models.ticket.TicketState r3 = r3.f51624b
                java.lang.String r4 = "ticketDisplayBundle.ticketState"
                mf0.C24362h.m61210e(r3, r4)
                wk.s r5 = r1.f44213f
                com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration r5 = r5.f51631i
                java.lang.String r7 = "ticketDisplayBundle.ticketDisplayConfiguration"
                mf0.C24362h.m61210e(r5, r7)
                java.lang.String r1 = r1.mo49663d()
                int r7 = r5.f37088e
                boolean r15 = mf0.C24362h.m61206a(r1, r15)
                r9 = 1
                r15 = r15 ^ r9
                if (r15 == 0) goto L_0x0086
                r0.mo44479L1(r1)     // Catch:{ UnknownLayoutPresetException -> 0x0071 }
                goto L_0x0086
            L_0x0071:
                androidx.fragment.app.Fragment r15 = r0.getParentFragment()
                boolean r0 = r15 instanceof p871vo.C20178e
                if (r0 != 0) goto L_0x007a
                goto L_0x007b
            L_0x007a:
                r6 = r15
            L_0x007b:
                vo.e r6 = (p871vo.C20178e) r6
                if (r6 == 0) goto L_0x04f9
                r15 = 10
                r6.mo52425L1(r15)
                goto L_0x04f9
            L_0x0086:
                oj.o r15 = r0.f37250c
                mf0.C24362h.m61208c(r15)
                android.widget.TextView r15 = r15.f47776d
                java.lang.String r1 = "binding.productNameTextView"
                mf0.C24362h.m61210e(r15, r1)
                java.lang.String r1 = r2.f48720m
                r15.setText(r1)
                oj.o r15 = r0.f37250c
                mf0.C24362h.m61208c(r15)
                android.widget.TextView r15 = r15.f47776d
                r15.setBackgroundColor(r7)
                java.lang.String r15 = r2.f48714g
                r1 = 0
                if (r15 == 0) goto L_0x00af
                int r2 = r15.length()
                if (r2 != 0) goto L_0x00ad
                goto L_0x00af
            L_0x00ad:
                r2 = 0
                goto L_0x00b0
            L_0x00af:
                r2 = 1
            L_0x00b0:
                r7 = 8
                if (r2 == 0) goto L_0x00c0
                bf0.c r15 = r0.f37256i
                java.lang.Object r15 = r15.getValue()
                android.widget.TextView r15 = (android.widget.TextView) r15
                r15.setVisibility(r7)
                goto L_0x00d6
            L_0x00c0:
                bf0.c r2 = r0.f37256i
                java.lang.Object r2 = r2.getValue()
                android.widget.TextView r2 = (android.widget.TextView) r2
                r2.setText(r15)
                bf0.c r15 = r0.f37256i
                java.lang.Object r15 = r15.getValue()
                android.widget.TextView r15 = (android.widget.TextView) r15
                r15.setVisibility(r1)
            L_0x00d6:
                fp.e r15 = r0.f37251d
                java.lang.String r2 = "TICKET_ID_KEY"
                java.lang.String r10 = "justrideSDK"
                if (r15 == 0) goto L_0x00e8
                wk.s r11 = r15.f44213f
                boolean r11 = r11.f51635m
                if (r11 != 0) goto L_0x00e5
                goto L_0x00e8
            L_0x00e5:
                r15.getClass()
            L_0x00e8:
                androidx.fragment.app.FragmentManager r15 = r0.getChildFragmentManager()
                androidx.fragment.app.FragmentContainerView r11 = r0.mo44487T1()
                int r11 = r11.getId()
                androidx.fragment.app.Fragment r15 = r15.mo3983z(r11)
                jp.a r15 = (p588jp.C17905a) r15
                if (r15 != 0) goto L_0x0130
                ki.b r15 = r0.f45307b
                mf0.C24362h.m61210e(r15, r10)
                java.lang.String r11 = r0.mo44488U1()
                jp.a r12 = new jp.a
                r12.<init>()
                android.os.Bundle r15 = p565io.C17624a.m43768H1(r15)
                r15.putString(r2, r11)
                bf0.d r11 = bf0.C21050d.f52856a
                r12.setArguments(r15)
                androidx.fragment.app.FragmentManager r15 = r0.getChildFragmentManager()
                r15.getClass()
                androidx.fragment.app.a r11 = new androidx.fragment.app.a
                r11.<init>(r15)
                androidx.fragment.app.FragmentContainerView r15 = r0.mo44487T1()
                int r15 = r15.getId()
                r11.mo4111f(r15, r12, r6)
                r11.mo4040d()
            L_0x0130:
                android.widget.FrameLayout r15 = r0.mo44484Q1()
                r15.setVisibility(r7)
                androidx.fragment.app.FragmentContainerView r15 = r0.mo44487T1()
                r15.setVisibility(r1)
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r15 = r0.mo44486S1()
                r15.setVisibility(r7)
                fp.e r15 = r0.f37251d
                if (r15 == 0) goto L_0x0152
                qn.h r15 = r15.mo49664e()
                sn.a r15 = p389bl.C13641g.m34119g(r15)
                goto L_0x0153
            L_0x0152:
                r15 = r6
            L_0x0153:
                java.lang.String r11 = "binding.actionsButton"
                if (r15 == 0) goto L_0x01c7
                ki.b r12 = r0.f45307b
                om.g r12 = r12.f46184n
                lm.g r12 = r12.f47831d
                mo.g r12 = (p658mo.C18413g) r12
                if (r12 == 0) goto L_0x0165
                java.util.List r6 = r12.mo50865a()
            L_0x0165:
                if (r6 == 0) goto L_0x01c7
                int r12 = r6.size()
                if (r12 <= 0) goto L_0x01c7
                oj.o r12 = r0.f37250c
                mf0.C24362h.m61208c(r12)
                android.widget.Button r12 = r12.f47773a
                mf0.C24362h.m61210e(r12, r11)
                r12.setVisibility(r1)
                java.util.Iterator r6 = r6.iterator()
            L_0x017e:
                boolean r12 = r6.hasNext()
                if (r12 == 0) goto L_0x0193
                java.lang.Object r12 = r6.next()
                r13 = r12
                mo.f r13 = (p658mo.C18412f) r13
                mf0.C24362h.m61210e(r13, r8)
                boolean r13 = r13.f46963c
                if (r13 == 0) goto L_0x017e
                goto L_0x0194
            L_0x0193:
                r12 = 0
            L_0x0194:
                mo.f r12 = (p658mo.C18412f) r12
                if (r12 == 0) goto L_0x01d4
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r6 = r0.mo44486S1()
                java.lang.String r8 = r12.f46962b
                java.lang.String r13 = "title"
                mf0.C24362h.m61210e(r8, r13)
                r6.setButtonText(r8)
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r6 = r0.mo44486S1()
                int r8 = r12.f46961a
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r6.setLeftDrawable(r8)
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r6 = r0.mo44486S1()
                r6.setVisibility(r1)
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r6 = r0.mo44486S1()
                fp.d r8 = new fp.d
                r8.<init>(r12, r15)
                r6.setOnClickListener(r8)
                goto L_0x01d4
            L_0x01c7:
                oj.o r15 = r0.f37250c
                mf0.C24362h.m61208c(r15)
                android.widget.Button r15 = r15.f47773a
                mf0.C24362h.m61210e(r15, r11)
                r15.setVisibility(r7)
            L_0x01d4:
                boolean r15 = r3.isLive()
                r6 = 3
                r8 = 1065185444(0x3f7d70a4, float:0.99)
                if (r15 == 0) goto L_0x0276
                android.widget.TextView r15 = r0.mo44485R1()
                r15.setVisibility(r7)
                bf0.c r15 = r0.f37262o
                java.lang.Object r15 = r15.getValue()
                android.widget.TextView r15 = (android.widget.TextView) r15
                r15.setVisibility(r7)
                androidx.fragment.app.FragmentContainerView r15 = r0.mo44487T1()
                r15.setAlpha(r8)
                android.widget.FrameLayout r15 = r0.mo44484Q1()
                r15.setAlpha(r8)
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r15 = r0.mo44480M1()
                r15.setVisibility(r1)
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r15 = r0.mo44480M1()
                r15.setEnabled(r9)
                android.widget.TextView r15 = r0.mo44481N1()
                r15.setVisibility(r1)
                android.widget.TextView r15 = r0.mo44481N1()
                fp.e r2 = r0.f37251d
                if (r2 == 0) goto L_0x0220
                java.lang.String r2 = r2.mo49661b()
                goto L_0x0221
            L_0x0220:
                r2 = 0
            L_0x0221:
                r15.setText(r2)
                r0.mo44492Y1()
                r0.mo44493Z1()
                fp.e r15 = r0.f37251d     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                if (r15 == 0) goto L_0x049d
                java.lang.String r15 = r15.mo49665f()     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                if (r15 == 0) goto L_0x023c
                int r2 = r15.length()     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                if (r2 != 0) goto L_0x023b
                goto L_0x023c
            L_0x023b:
                r9 = 0
            L_0x023c:
                if (r9 == 0) goto L_0x024b
                bf0.c r15 = r0.f37261n     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                java.lang.Object r15 = r15.getValue()     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                android.widget.TextView r15 = (android.widget.TextView) r15     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                r15.setVisibility(r7)     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                goto L_0x049d
            L_0x024b:
                bf0.c r2 = r0.f37261n     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                java.lang.Object r2 = r2.getValue()     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                r2.setText(r15)     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                bf0.c r15 = r0.f37261n     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                java.lang.Object r15 = r15.getValue()     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                android.widget.TextView r15 = (android.widget.TextView) r15     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                r15.setVisibility(r1)     // Catch:{ UsagePeriodInfoException -> 0x0263 }
                goto L_0x049d
            L_0x0263:
                androidx.fragment.app.Fragment r15 = r0.getParentFragment()
                boolean r1 = r15 instanceof p871vo.C20178e
                if (r1 != 0) goto L_0x026d
                r15 = 0
            L_0x026d:
                vo.e r15 = (p871vo.C20178e) r15
                if (r15 == 0) goto L_0x049d
                r15.mo52425L1(r6)
                goto L_0x049d
            L_0x0276:
                boolean r15 = r3.isActive()
                if (r15 == 0) goto L_0x038b
                fp.e r15 = r0.f37251d
                if (r15 == 0) goto L_0x02b6
                java.lang.String r15 = r15.mo49663d()
                int r3 = r15.hashCode()
                r4 = -934234158(0xffffffffc850b7d2, float:-213727.28)
                if (r3 == r4) goto L_0x028e
                goto L_0x0299
            L_0x028e:
                java.lang.String r3 = "VISVAL_FIRST"
                boolean r15 = r15.equals(r3)
                if (r15 == 0) goto L_0x0299
                r15 = 1120403456(0x42c80000, float:100.0)
                goto L_0x029b
            L_0x0299:
                r15 = 1112014848(0x42480000, float:50.0)
            L_0x029b:
                androidx.fragment.app.FragmentContainerView r3 = r0.mo44491X1()
                android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
                r6 = -1
                android.util.DisplayMetrics r12 = p389bl.C13641g.m34124l(r0)
                java.lang.String r13 = "displayMetrics"
                mf0.C24362h.m61210e(r12, r13)
                float r15 = p584jl.C17885a.m44410L(r12, r15)
                int r15 = (int) r15
                r4.<init>(r6, r15)
                r3.setLayoutParams(r4)
            L_0x02b6:
                android.widget.TextView r15 = r0.mo44485R1()
                r15.setVisibility(r7)
                androidx.fragment.app.FragmentContainerView r15 = r0.mo44487T1()
                r15.setAlpha(r8)
                android.widget.FrameLayout r15 = r0.mo44484Q1()
                r15.setAlpha(r8)
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r15 = r0.mo44480M1()
                r15.setVisibility(r7)
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r15 = r0.mo44480M1()
                r15.setEnabled(r1)
                android.widget.TextView r15 = r0.mo44481N1()
                r15.setVisibility(r7)
                ip.a r15 = r0.mo44482O1()
                if (r15 != 0) goto L_0x031b
                ki.b r15 = r0.f45307b
                mf0.C24362h.m61210e(r15, r10)
                java.lang.String r3 = r0.mo44488U1()
                ip.a r4 = new ip.a
                r4.<init>()
                android.os.Bundle r15 = p565io.C17624a.m43768H1(r15)
                r15.putString(r2, r3)
                bf0.d r3 = bf0.C21050d.f52856a
                r4.setArguments(r15)
                androidx.fragment.app.FragmentManager r15 = r0.getChildFragmentManager()
                r15.getClass()
                androidx.fragment.app.a r3 = new androidx.fragment.app.a
                r3.<init>(r15)
                androidx.fragment.app.FragmentContainerView r15 = r0.mo44483P1()
                int r15 = r15.getId()
                r6 = 0
                r3.mo4111f(r15, r4, r6)
                r3.mo4040d()
            L_0x031b:
                androidx.fragment.app.FragmentContainerView r15 = r0.mo44483P1()
                r15.setVisibility(r1)
                com.masabi.justride.sdk.ui.features.universalticket.main.visualvalidation.VisualValidationFragment r15 = r0.mo44490W1()
                if (r15 != 0) goto L_0x035d
                ki.b r15 = r0.f45307b
                mf0.C24362h.m61210e(r15, r10)
                java.lang.String r3 = r0.mo44488U1()
                com.masabi.justride.sdk.ui.features.universalticket.main.visualvalidation.VisualValidationFragment r4 = new com.masabi.justride.sdk.ui.features.universalticket.main.visualvalidation.VisualValidationFragment
                r4.<init>()
                android.os.Bundle r15 = p565io.C17624a.m43768H1(r15)
                r15.putString(r2, r3)
                bf0.d r2 = bf0.C21050d.f52856a
                r4.setArguments(r15)
                androidx.fragment.app.FragmentManager r15 = r0.getChildFragmentManager()
                r15.getClass()
                androidx.fragment.app.a r2 = new androidx.fragment.app.a
                r2.<init>(r15)
                androidx.fragment.app.FragmentContainerView r15 = r0.mo44491X1()
                int r15 = r15.getId()
                r3 = 0
                r2.mo4111f(r15, r4, r3)
                r2.mo4040d()
            L_0x035d:
                androidx.fragment.app.FragmentContainerView r15 = r0.mo44491X1()
                r15.setVisibility(r1)
                bf0.c r15 = r0.f37261n
                java.lang.Object r15 = r15.getValue()
                android.widget.TextView r15 = (android.widget.TextView) r15
                r15.setVisibility(r7)
                fp.e r15 = r0.f37251d
                if (r15 == 0) goto L_0x037e
                boolean r15 = r15.mo49666g()
                if (r15 != r9) goto L_0x037e
                r0.mo44494a2()
                goto L_0x049d
            L_0x037e:
                bf0.c r15 = r0.f37262o
                java.lang.Object r15 = r15.getValue()
                android.widget.TextView r15 = (android.widget.TextView) r15
                r15.setVisibility(r7)
                goto L_0x049d
            L_0x038b:
                r15 = 0
                boolean r2 = r3.isLiveUnusable()
                if (r2 != 0) goto L_0x0448
                boolean r2 = r3.isBeforeValidityPeriod()
                if (r2 == 0) goto L_0x039a
                goto L_0x0448
            L_0x039a:
                boolean r2 = r3.isFinalized()
                r3 = 2
                if (r2 == 0) goto L_0x0436
                android.widget.TextView r2 = r0.mo44485R1()
                r2.setVisibility(r1)
                bf0.c r2 = r0.f37262o
                java.lang.Object r2 = r2.getValue()
                android.widget.TextView r2 = (android.widget.TextView) r2
                r2.setVisibility(r7)
                androidx.fragment.app.FragmentContainerView r2 = r0.mo44487T1()
                r8 = 1045220557(0x3e4ccccd, float:0.2)
                r2.setAlpha(r8)
                android.widget.FrameLayout r2 = r0.mo44484Q1()
                r2.setAlpha(r8)
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r2 = r0.mo44480M1()
                r2.setVisibility(r7)
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r2 = r0.mo44480M1()
                r2.setEnabled(r1)
                android.widget.TextView r2 = r0.mo44481N1()
                r2.setVisibility(r7)
                r0.mo44492Y1()
                r0.mo44493Z1()
                bf0.c r2 = r0.f37261n
                java.lang.Object r2 = r2.getValue()
                android.widget.TextView r2 = (android.widget.TextView) r2
                r2.setVisibility(r7)
                android.widget.TextView r2 = r0.mo44485R1()
                fp.e r7 = r0.f37251d
                if (r7 == 0) goto L_0x0432
                qn.h r8 = r7.mo49664e()
                java.util.Date r8 = r8.f48709b
                java.util.Date r8 = p584jl.C17885a.m44446k0(r8)
                if (r8 == 0) goto L_0x0432
                wk.s r10 = r7.f44213f
                com.masabi.justride.sdk.internal.models.ticket.TicketState r10 = r10.f51624b
                mf0.C24362h.m61210e(r10, r4)
                int[] r4 = p494fp.C17055f.f44217a
                int r10 = r10.ordinal()
                r4 = r4[r10]
                if (r4 == r9) goto L_0x0420
                if (r4 == r3) goto L_0x041d
                if (r4 == r6) goto L_0x041a
                r3 = 4
                if (r4 == r3) goto L_0x0417
                goto L_0x0432
            L_0x0417:
                int r15 = p605ki.C18066t.com_masabi_justride_sdk_wallet_ticket_status_used_on_xx
                goto L_0x0422
            L_0x041a:
                int r15 = p605ki.C18066t.com_masabi_justride_sdk_wallet_ticket_status_canceled_on_xx
                goto L_0x0422
            L_0x041d:
                int r15 = p605ki.C18066t.com_masabi_justride_sdk_wallet_ticket_status_expired_on_xx
                goto L_0x0422
            L_0x0420:
                int r15 = p605ki.C18066t.com_masabi_justride_sdk_wallet_ticket_status_refunded_on_xx
            L_0x0422:
                android.content.res.Resources r3 = r7.f44214g
                java.lang.Object[] r4 = new java.lang.Object[r9]
                java.text.DateFormat r6 = r7.f44209b
                java.lang.String r6 = r6.format(r8)
                r4[r1] = r6
                java.lang.String r15 = r3.getString(r15, r4)
            L_0x0432:
                r2.setText(r15)
                goto L_0x049d
            L_0x0436:
                androidx.fragment.app.Fragment r1 = r0.getParentFragment()
                boolean r2 = r1 instanceof p871vo.C20178e
                if (r2 != 0) goto L_0x043f
                goto L_0x0440
            L_0x043f:
                r15 = r1
            L_0x0440:
                vo.e r15 = (p871vo.C20178e) r15
                if (r15 == 0) goto L_0x049d
                r15.mo52425L1(r3)
                goto L_0x049d
            L_0x0448:
                android.widget.TextView r2 = r0.mo44485R1()
                r2.setVisibility(r7)
                bf0.c r2 = r0.f37262o
                java.lang.Object r2 = r2.getValue()
                android.widget.TextView r2 = (android.widget.TextView) r2
                r2.setVisibility(r7)
                androidx.fragment.app.FragmentContainerView r2 = r0.mo44487T1()
                r2.setAlpha(r8)
                android.widget.FrameLayout r2 = r0.mo44484Q1()
                r2.setAlpha(r8)
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r2 = r0.mo44480M1()
                r2.setVisibility(r1)
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r2 = r0.mo44480M1()
                r2.setEnabled(r1)
                android.widget.TextView r2 = r0.mo44481N1()
                r2.setVisibility(r1)
                android.widget.TextView r1 = r0.mo44481N1()
                fp.e r2 = r0.f37251d
                if (r2 == 0) goto L_0x0489
                java.lang.String r15 = r2.mo49661b()
            L_0x0489:
                r1.setText(r15)
                r0.mo44492Y1()
                r0.mo44493Z1()
                bf0.c r15 = r0.f37261n
                java.lang.Object r15 = r15.getValue()
                android.widget.TextView r15 = (android.widget.TextView) r15
                r15.setVisibility(r7)
            L_0x049d:
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r15 = r0.mo44480M1()
                int r1 = r5.f37093j
                float r2 = r5.f37094k
                r15.f37233g = r1
                r15.f37235i = r2
                r15.mo44457a()
                r15.mo44458b()
                com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r15 = r0.mo44486S1()
                int r1 = r5.f37096m
                float r2 = r5.f37094k
                r15.f37233g = r1
                r15.f37235i = r2
                r15.mo44457a()
                r15.mo44458b()
                oj.o r15 = r0.f37250c
                mf0.C24362h.m61208c(r15)
                android.widget.Button r15 = r15.f47773a
                int r1 = r5.f37096m
                r15.setTextColor(r1)
                oj.o r15 = r0.f37250c
                mf0.C24362h.m61208c(r15)
                android.widget.Button r15 = r15.f47773a
                mf0.C24362h.m61210e(r15, r11)
                int r1 = p605ki.C18060n.com_masabi_justride_sdk_icon_actions
                p583jk.C17884p.m44362d(r15, r1)
                oj.o r15 = r0.f37250c
                mf0.C24362h.m61208c(r15)
                android.widget.Button r15 = r15.f47774b
                int r1 = r5.f37096m
                r15.setTextColor(r1)
                oj.o r15 = r0.f37250c
                mf0.C24362h.m61208c(r15)
                android.widget.Button r15 = r15.f47774b
                java.lang.String r0 = "binding.detailsButton"
                mf0.C24362h.m61210e(r15, r0)
                int r0 = p605ki.C18060n.com_masabi_justride_sdk_icon_details
                p583jk.C17884p.m44362d(r15, r0)
            L_0x04f9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.masabi.justride.sdk.p415ui.features.universalticket.main.MainTicketFragment.C14673a.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment$b */
    public static final class C14674b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ MainTicketFragment f37268b;

        public C14674b(MainTicketFragment mainTicketFragment) {
            this.f37268b = mainTicketFragment;
        }

        public final void run() {
            boolean z;
            MainTicketFragment mainTicketFragment = this.f37268b;
            C17053e eVar = mainTicketFragment.f37251d;
            if (eVar != null) {
                TicketState ticketState = eVar.f44213f.f51624b;
                C24362h.m61210e(ticketState, "ticketDisplayBundle.ticketState");
                C14333w2 w2Var = eVar.f44213f.f51627e;
                if (ticketState != ((C20374a) w2Var.f36108d).mo52603a((C20362q) w2Var.f36107c)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Fragment parentFragment = mainTicketFragment.getParentFragment();
                    if (!(parentFragment instanceof C20178e)) {
                        parentFragment = null;
                    }
                    C20178e eVar2 = (C20178e) parentFragment;
                    if (eVar2 != null) {
                        eVar2.mo52424K1();
                        return;
                    }
                    return;
                }
                TicketState ticketState2 = eVar.f44213f.f51624b;
                C24362h.m61210e(ticketState2, "ticketDisplayBundle.ticketState");
                if (!ticketState2.isActive() || !eVar.mo49666g()) {
                    ((TextView) mainTicketFragment.f37262o.getValue()).setVisibility(8);
                } else {
                    mainTicketFragment.mo44494a2();
                }
            }
        }
    }

    /* renamed from: J1 */
    public static final TextView m36836J1(MainTicketFragment mainTicketFragment) {
        mainTicketFragment.getClass();
        TextView textView = new TextView(mainTicketFragment.requireContext());
        C0801k.m2424f(textView, C18067u.JustRideSDKUniversalMainTextAppearance);
        textView.setGravity(17);
        textView.setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.4f);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        DisplayMetrics l = C13641g.m34124l(mainTicketFragment);
        C24362h.m61210e(l, "displayMetrics");
        int L = (int) C17885a.m44410L(l, 5.0f);
        textView.setPadding(L, L, L, L);
        textView.setFocusable(true);
        return textView;
    }

    /* renamed from: K1 */
    public final void mo44478K1() {
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof C20178e)) {
            parentFragment = null;
        }
        C20178e eVar = (C20178e) parentFragment;
        if (eVar != null) {
            C20190g gVar = eVar.f51193c;
            if (gVar != null) {
                gVar.f51217c.mo40390a(new C20189f(eVar), CallBackOn.MAIN_THREAD, eVar.f51203m);
            } else {
                C24362h.m61217l("presenter");
                throw null;
            }
        }
    }

    /* renamed from: L1 */
    public final void mo44479L1(String str) throws UnknownLayoutPresetException {
        C18771o oVar = this.f37250c;
        C24362h.m61208c(oVar);
        View scrollSubview = oVar.f47775c.getScrollSubview();
        if (scrollSubview != null) {
            ViewGroup viewGroup = (ViewGroup) scrollSubview;
            viewGroup.removeAllViews();
            int hashCode = str.hashCode();
            if (hashCode != -934234158) {
                if (hashCode == 1399974385 && str.equals("BARCODE_FIRST")) {
                    viewGroup.addView(mo44483P1());
                    viewGroup.addView((TextView) this.f37256i.getValue());
                    viewGroup.addView(mo44489V1());
                    viewGroup.addView(mo44481N1());
                    viewGroup.addView(mo44480M1());
                    viewGroup.addView(mo44486S1());
                    return;
                }
            } else if (str.equals("VISVAL_FIRST")) {
                viewGroup.addView(mo44489V1());
                viewGroup.addView(mo44481N1());
                viewGroup.addView(mo44480M1());
                viewGroup.addView(mo44486S1());
                viewGroup.addView((TextView) this.f37256i.getValue());
                viewGroup.addView(mo44483P1());
                return;
            }
            throw new UnknownLayoutPresetException(C25541a.m63881k("Unknown universal ticket layout preset - ", str));
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: M1 */
    public final UniversalTicketButtonFrame mo44480M1() {
        return (UniversalTicketButtonFrame) this.f37265r.getValue();
    }

    /* renamed from: N1 */
    public final TextView mo44481N1() {
        return (TextView) this.f37264q.getValue();
    }

    /* renamed from: O1 */
    public final C17627a mo44482O1() {
        return (C17627a) getChildFragmentManager().mo3983z(mo44483P1().getId());
    }

    /* renamed from: P1 */
    public final FragmentContainerView mo44483P1() {
        return (FragmentContainerView) this.f37255h.getValue();
    }

    /* renamed from: Q1 */
    public final FrameLayout mo44484Q1() {
        return (FrameLayout) this.f37260m.getValue();
    }

    /* renamed from: R1 */
    public final TextView mo44485R1() {
        return (TextView) this.f37263p.getValue();
    }

    /* renamed from: S1 */
    public final UniversalTicketButtonFrame mo44486S1() {
        return (UniversalTicketButtonFrame) this.f37266s.getValue();
    }

    /* renamed from: T1 */
    public final FragmentContainerView mo44487T1() {
        return (FragmentContainerView) this.f37259l.getValue();
    }

    /* renamed from: U1 */
    public final String mo44488U1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("TICKET_ID_KEY");
            if (string != null) {
                return string;
            }
            throw new MissingArgumentException("Cannot load fragment without ticket id.");
        }
        throw new MissingArgumentException("Cannot load fragment with null bundle.");
    }

    /* renamed from: V1 */
    public final LinearLayout mo44489V1() {
        return (LinearLayout) this.f37257j.getValue();
    }

    /* renamed from: W1 */
    public final VisualValidationFragment mo44490W1() {
        return (VisualValidationFragment) getChildFragmentManager().mo3983z(mo44491X1().getId());
    }

    /* renamed from: X1 */
    public final FragmentContainerView mo44491X1() {
        return (FragmentContainerView) this.f37258k.getValue();
    }

    /* renamed from: Y1 */
    public final void mo44492Y1() {
        C17627a O1 = mo44482O1();
        if (O1 != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C0909a aVar = new C0909a(childFragmentManager);
            aVar.mo4050p(O1);
            aVar.mo4040d();
        }
        mo44483P1().setVisibility(8);
    }

    /* renamed from: Z1 */
    public final void mo44493Z1() {
        VisualValidationFragment W1 = mo44490W1();
        if (W1 != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C0909a aVar = new C0909a(childFragmentManager);
            aVar.mo4050p(W1);
            aVar.mo4040d();
        }
        mo44491X1().setVisibility(8);
    }

    /* renamed from: a2 */
    public final void mo44494a2() {
        String str;
        ((TextView) this.f37262o.getValue()).setVisibility(0);
        C17053e eVar = this.f37251d;
        if (eVar != null) {
            TicketDisplayConfiguration ticketDisplayConfiguration = eVar.f44213f.f51631i;
            C24362h.m61210e(ticketDisplayConfiguration, "ticketDisplayBundle.ticketDisplayConfiguration");
            ((TextView) this.f37262o.getValue()).setBackgroundColor(ticketDisplayConfiguration.f37089f);
            TextView textView = (TextView) this.f37262o.getValue();
            C19143a aVar = eVar.mo49664e().f48722o;
            C24362h.m61210e(aVar, "ticketDetails.activationSummary");
            Date date = aVar.f48674e;
            if (date != null) {
                str = eVar.f44214g.getString(C18066t.f46225xee8048d9, new Object[]{eVar.f44210c.format(date)});
                C24362h.m61210e(str, "resources.getString(\n   …nStartDate)\n            )");
            } else {
                str = "";
            }
            textView.setText(str);
        }
    }

    public final void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
        } catch (MissingSDKException unused) {
        }
        if (bundle != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
            C17627a O1 = mo44482O1();
            if (O1 != null) {
                K.mo4050p(O1);
            }
            C17905a aVar = (C17905a) getChildFragmentManager().mo3983z(mo44487T1().getId());
            if (aVar != null) {
                K.mo4050p(aVar);
            }
            VisualValidationFragment W1 = mo44490W1();
            if (W1 != null) {
                K.mo4050p(W1);
            }
            K.mo4040d();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_universal_ticket_main, viewGroup, false);
        int i = C18061o.actionsButton;
        Button button = (Button) inflate.findViewById(i);
        if (button != null) {
            i = C18061o.detailsButton;
            Button button2 = (Button) inflate.findViewById(i);
            if (button2 != null) {
                i = C18061o.dottedLine;
                if (((ImageView) inflate.findViewById(i)) != null) {
                    i = C18061o.frostedScrollView;
                    FrostedScrollView frostedScrollView = (FrostedScrollView) inflate.findViewById(i);
                    if (frostedScrollView != null) {
                        i = C18061o.navigationLayout;
                        if (((RelativeLayout) inflate.findViewById(i)) != null) {
                            i = C18061o.productNameTextView;
                            TextView textView = (TextView) inflate.findViewById(i);
                            if (textView != null) {
                                LinearLayout linearLayout = (LinearLayout) inflate;
                                this.f37250c = new C18771o(linearLayout, button, button2, frostedScrollView, textView);
                                return linearLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f37250c = null;
    }

    public final void onPause() {
        super.onPause();
        C14670b bVar = this.f37253f;
        bVar.f37238b = false;
        ((Handler) bVar.f37237a.getValue()).removeMessages(0);
    }

    public final void onResume() {
        super.onResume();
        C14670b bVar = this.f37253f;
        if (!bVar.f37238b) {
            bVar.f37238b = true;
            ((Handler) bVar.f37237a.getValue()).sendEmptyMessage(0);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        DisplayMetrics l = C13641g.m34124l(this);
        C24362h.m61210e(l, "displayMetrics");
        this.f37254g = new C18110b(l);
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setId(C18061o.scrollSubview);
        C18771o oVar = this.f37250c;
        C24362h.m61208c(oVar);
        oVar.f47775c.mo44452a(linearLayout);
        mo44489V1().addView(mo44491X1());
        mo44489V1().addView(mo44487T1());
        mo44489V1().addView(mo44484Q1());
        mo44489V1().addView((TextView) this.f37261n.getValue());
        mo44489V1().addView((TextView) this.f37262o.getValue());
        mo44489V1().addView(mo44485R1());
        C18771o oVar2 = this.f37250c;
        C24362h.m61208c(oVar2);
        oVar2.f47776d.setBackgroundColor(-1776412);
        C18771o oVar3 = this.f37250c;
        C24362h.m61208c(oVar3);
        TextView textView = oVar3.f47776d;
        C24362h.m61210e(textView, "binding.productNameTextView");
        textView.setSelected(true);
        mo44480M1().setOnClickListener(new C17049a(this));
        C18771o oVar4 = this.f37250c;
        C24362h.m61208c(oVar4);
        Button button = oVar4.f47773a;
        C24362h.m61210e(button, "binding.actionsButton");
        C17884p.m44362d(button, C18060n.com_masabi_justride_sdk_icon_actions);
        C18771o oVar5 = this.f37250c;
        C24362h.m61208c(oVar5);
        oVar5.f47773a.setOnClickListener(new C17050b(this));
        C18771o oVar6 = this.f37250c;
        C24362h.m61208c(oVar6);
        Button button2 = oVar6.f47774b;
        C24362h.m61210e(button2, "binding.detailsButton");
        C17884p.m44362d(button2, C18060n.com_masabi_justride_sdk_icon_details);
        C18771o oVar7 = this.f37250c;
        C24362h.m61208c(oVar7);
        oVar7.f47774b.setOnClickListener(new C17051c(this));
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        Bundle arguments = getArguments();
        FragmentActivity requireActivity = requireActivity();
        C24362h.m61210e(requireActivity, "requireActivity()");
        if (arguments != null) {
            String string = arguments.getString("TICKET_ID_KEY");
            if (string != null) {
                C1019k0 b = new C1026n0(requireActivity).mo4314b(C20193i.class, string);
                C24362h.m61210e(b, "ViewModelProvider(owner)…ketViewModel::class.java)");
                ((C20193i) b).f51229b.observe(getViewLifecycleOwner(), new C14673a(this));
                return;
            }
            throw new MissingArgumentException("Cannot load fragment without ticket id.");
        }
        throw new MissingArgumentException("Cannot load fragment with null bundle.");
    }
}
