package p542hp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0942l;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1044w;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.p415ui.features.universalticket.components.UniversalTicketButtonFrame;
import com.masabi.justride.sdk.p415ui.features.universalticket.main.MainTicketFragment;
import kotlin.Metadata;
import mf0.C24361g;
import mf0.C24362h;
import p583jk.C17884p;
import p605ki.C18060n;
import p605ki.C18067u;
import p701oj.C18759c;
import p891wk.C20364s;
import uh0.C25081h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lhp/a;", "Landroidx/fragment/app/l;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: hp.a */
public final class C17468a extends C0942l {

    /* renamed from: b */
    public C18759c f44976b;

    /* renamed from: c */
    public String f44977c;

    /* renamed from: d */
    public String f44978d;

    /* renamed from: e */
    public String f44979e;

    /* renamed from: f */
    public boolean f44980f;

    /* renamed from: hp.a$a */
    public static final class C17469a<T> implements C1044w<C20364s> {

        /* renamed from: a */
        public final /* synthetic */ C17468a f44981a;

        public C17469a(C17468a aVar) {
            this.f44981a = aVar;
        }

        public final void onChanged(Object obj) {
            C20364s sVar = (C20364s) obj;
            C17468a aVar = this.f44981a;
            C24362h.m61210e(sVar, "it");
            TicketDisplayConfiguration ticketDisplayConfiguration = sVar.f51631i;
            C24362h.m61210e(ticketDisplayConfiguration, "it.ticketDisplayConfiguration");
            C18759c cVar = aVar.f44976b;
            C24362h.m61208c(cVar);
            UniversalTicketButtonFrame universalTicketButtonFrame = cVar.f47732d;
            int i = ticketDisplayConfiguration.f37093j;
            float f = ticketDisplayConfiguration.f37094k;
            universalTicketButtonFrame.f37233g = i;
            universalTicketButtonFrame.f37235i = f;
            universalTicketButtonFrame.mo44457a();
            universalTicketButtonFrame.mo44458b();
            C18759c cVar2 = aVar.f44976b;
            C24362h.m61208c(cVar2);
            cVar2.f47731c.setTextColor(ticketDisplayConfiguration.f37096m);
            C18759c cVar3 = aVar.f44976b;
            C24362h.m61208c(cVar3);
            Button button = cVar3.f47731c;
            C24362h.m61210e(button, "binding.closeButton");
            C17884p.m44362d(button, C18060n.com_masabi_justride_sdk_icon_close_small);
        }
    }

    /* renamed from: hp.a$b */
    public static final class C17470b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C17468a f44982b;

        /* renamed from: hp.a$b$a */
        public static final class C17471a implements View.OnClickListener {

            /* renamed from: b */
            public final /* synthetic */ C17470b f44983b;

            public C17471a(C17470b bVar) {
                this.f44983b = bVar;
            }

            public final void onClick(View view) {
                this.f44983b.f44982b.dismiss();
            }
        }

        /* renamed from: hp.a$b$b */
        public static final class C17472b implements View.OnClickListener {

            /* renamed from: b */
            public final /* synthetic */ C17470b f44984b;

            public C17472b(C17470b bVar) {
                this.f44984b = bVar;
            }

            public final void onClick(View view) {
                C17468a aVar = this.f44984b.f44982b;
                if (!aVar.f44980f) {
                    aVar.f44980f = true;
                    Fragment parentFragment = aVar.getParentFragment();
                    if (parentFragment != null) {
                        ((MainTicketFragment) parentFragment).mo44478K1();
                        aVar.dismiss();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment");
                }
            }
        }

        public C17470b(C17468a aVar) {
            this.f44982b = aVar;
        }

        public final void run() {
            UniversalTicketButtonFrame universalTicketButtonFrame;
            Button button;
            C18759c cVar = this.f44982b.f44976b;
            if (!(cVar == null || (button = cVar.f47731c) == null)) {
                button.setOnClickListener(new C17471a(this));
            }
            C18759c cVar2 = this.f44982b.f44976b;
            if (cVar2 != null && (universalTicketButtonFrame = cVar2.f47732d) != null) {
                universalTicketButtonFrame.setOnClickListener(new C17472b(this));
            }
        }
    }

    /* renamed from: H1 */
    public final void mo49926H1(TextView textView, String str) {
        boolean z;
        int i = 0;
        if (str == null || C25081h.m62831B(str)) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = true ^ z;
        if (!z2) {
            i = 8;
        }
        textView.setVisibility(i);
        if (z2) {
            C24362h.m61208c(str);
            textView.setText(C24361g.m61186s0(str));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f44977c = arguments.getString("TITLE");
            this.f44978d = arguments.getString("BODY");
            this.f44979e = arguments.getString("USAGE_PERIOD_WARNING");
            return;
        }
        throw new JustRideSdkException("Cannot load activation disclaimer fragment with null arguments.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r10 = p605ki.C18061o.horizontalDividerView;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            java.lang.String r11 = "inflater"
            mf0.C24362h.m61211f(r9, r11)
            int r11 = p605ki.C18063q.fragment_activation_disclaimer
            r0 = 0
            android.view.View r9 = r9.inflate(r11, r10, r0)
            int r10 = p605ki.C18061o.bodyScrollView
            android.view.View r11 = r9.findViewById(r10)
            r2 = r11
            com.masabi.justride.sdk.ui.features.universalticket.components.FrostedScrollView r2 = (com.masabi.justride.sdk.p415ui.features.universalticket.components.FrostedScrollView) r2
            if (r2 == 0) goto L_0x0057
            int r10 = p605ki.C18061o.closeButton
            android.view.View r11 = r9.findViewById(r10)
            r3 = r11
            android.widget.Button r3 = (android.widget.Button) r3
            if (r3 == 0) goto L_0x0057
            int r10 = p605ki.C18061o.disclaimerActivationButtonContainer
            android.view.View r11 = r9.findViewById(r10)
            r4 = r11
            com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r4 = (com.masabi.justride.sdk.p415ui.features.universalticket.components.UniversalTicketButtonFrame) r4
            if (r4 == 0) goto L_0x0057
            int r10 = p605ki.C18061o.horizontalDividerView
            android.view.View r5 = r9.findViewById(r10)
            if (r5 == 0) goto L_0x0057
            int r10 = p605ki.C18061o.titleTextView
            android.view.View r11 = r9.findViewById(r10)
            r6 = r11
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0057
            int r10 = p605ki.C18061o.usagePeriodWarningTextView
            android.view.View r11 = r9.findViewById(r10)
            r7 = r11
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0057
            oj.c r10 = new oj.c
            com.masabi.justride.sdk.ui.base.views.MaxHeightFrameLayout r9 = (com.masabi.justride.sdk.p415ui.base.views.MaxHeightFrameLayout) r9
            r0 = r10
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f44976b = r10
            return r9
        L_0x0057:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r10)
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "Missing required view with ID: "
            java.lang.String r9 = r11.concat(r9)
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p542hp.C17468a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f44976b = null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C24362h.m61211f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof MainTicketFragment)) {
            parentFragment = null;
        }
        MainTicketFragment mainTicketFragment = (MainTicketFragment) parentFragment;
        if (mainTicketFragment != null) {
            mainTicketFragment.f37252e = false;
        }
    }

    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.addFlags(2);
            window.setDimAmount(0.6f);
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setWindowAnimations(C18067u.DialogAnimationSlideInAndOutFromBottom);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0128, code lost:
        if ((!r2) != false) goto L_0x012c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            mf0.C24362h.m61211f(r5, r0)
            super.onViewCreated(r5, r6)
            android.os.Bundle r6 = r4.getArguments()
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            java.lang.String r1 = "requireActivity()"
            mf0.C24362h.m61210e(r0, r1)
            if (r6 == 0) goto L_0x0182
            java.lang.String r1 = "TICKET_ID_KEY"
            java.lang.String r6 = r6.getString(r1)
            if (r6 == 0) goto L_0x017a
            androidx.lifecycle.n0 r1 = new androidx.lifecycle.n0
            r1.<init>(r0)
            java.lang.Class<vo.i> r0 = p871vo.C20193i.class
            androidx.lifecycle.k0 r6 = r1.mo4314b(r0, r6)
            java.lang.String r0 = "ViewModelProvider(owner)…ketViewModel::class.java)"
            mf0.C24362h.m61210e(r6, r0)
            vo.i r6 = (p871vo.C20193i) r6
            androidx.lifecycle.v<wk.s> r6 = r6.f51229b
            androidx.lifecycle.p r0 = r4.getViewLifecycleOwner()
            hp.a$a r1 = new hp.a$a
            r1.<init>(r4)
            r6.observe(r0, r1)
            oj.c r6 = r4.f44976b
            mf0.C24362h.m61208c(r6)
            com.masabi.justride.sdk.ui.base.views.MaxHeightFrameLayout r6 = r6.f47729a
            android.util.DisplayMetrics r0 = p389bl.C13641g.m34124l(r4)
            int r0 = r0.heightPixels
            double r0 = (double) r0
            r2 = 4606011482896901079(0x3febd70a3d70a3d7, double:0.87)
            double r0 = r0 * r2
            int r0 = (int) r0
            r6.setMaxHeight$Android_release(r0)
            int r6 = p605ki.C18066t.com_masabi_justride_sdk_activation_disclaimer_default_title
            java.lang.String r6 = r4.getString(r6)
            java.lang.String r0 = "getString(R.string.com_m…disclaimer_default_title)"
            mf0.C24362h.m61210e(r6, r0)
            oj.c r0 = r4.f44976b
            mf0.C24362h.m61208c(r0)
            android.widget.TextView r0 = r0.f47734f
            java.lang.String r1 = "binding.titleTextView"
            mf0.C24362h.m61210e(r0, r1)
            int r2 = p605ki.C18067u.JustRideSDKUniversalMainTextAppearance
            androidx.core.widget.C0801k.m2424f(r0, r2)
            r2 = 17
            r0.setGravity(r2)
            r2 = 0
            r3 = 1068708659(0x3fb33333, float:1.4)
            r0.setLineSpacing(r2, r3)
            oj.c r0 = r4.f44976b
            mf0.C24362h.m61208c(r0)
            android.widget.TextView r0 = r0.f47735g
            java.lang.String r2 = "binding.usagePeriodWarningTextView"
            mf0.C24362h.m61210e(r0, r2)
            p584jl.C17885a.m44471x0(r0)
            oj.c r0 = r4.f44976b
            mf0.C24362h.m61208c(r0)
            android.widget.TextView r0 = r0.f47734f
            mf0.C24362h.m61210e(r0, r1)
            java.lang.String r1 = r4.f44977c
            if (r1 == 0) goto L_0x009e
            r6 = r1
        L_0x009e:
            r4.mo49926H1(r0, r6)
            oj.c r6 = r4.f44976b
            mf0.C24362h.m61208c(r6)
            android.widget.TextView r6 = r6.f47735g
            mf0.C24362h.m61210e(r6, r2)
            java.lang.String r0 = r4.f44979e
            r4.mo49926H1(r6, r0)
            java.lang.String r6 = r4.f44978d
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x00bf
            boolean r6 = uh0.C25081h.m62831B(r6)
            if (r6 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r6 = 0
            goto L_0x00c0
        L_0x00bf:
            r6 = 1
        L_0x00c0:
            java.lang.String r2 = "binding.bodyScrollView"
            r3 = 8
            if (r6 == 0) goto L_0x00d4
            oj.c r6 = r4.f44976b
            mf0.C24362h.m61208c(r6)
            com.masabi.justride.sdk.ui.features.universalticket.components.FrostedScrollView r6 = r6.f47730b
            mf0.C24362h.m61210e(r6, r2)
            r6.setVisibility(r3)
            goto L_0x00fc
        L_0x00d4:
            oj.c r6 = r4.f44976b
            mf0.C24362h.m61208c(r6)
            com.masabi.justride.sdk.ui.features.universalticket.components.FrostedScrollView r6 = r6.f47730b
            mf0.C24362h.m61210e(r6, r2)
            r6.setVisibility(r0)
            android.widget.TextView r6 = new android.widget.TextView
            android.content.Context r2 = r4.getContext()
            r6.<init>(r2)
            p584jl.C17885a.m44471x0(r6)
            java.lang.String r2 = r4.f44978d
            r4.mo49926H1(r6, r2)
            oj.c r2 = r4.f44976b
            mf0.C24362h.m61208c(r2)
            com.masabi.justride.sdk.ui.features.universalticket.components.FrostedScrollView r2 = r2.f47730b
            r2.mo44452a(r6)
        L_0x00fc:
            oj.c r6 = r4.f44976b
            mf0.C24362h.m61208c(r6)
            android.view.View r6 = r6.f47733e
            java.lang.String r2 = "binding.horizontalDividerView"
            mf0.C24362h.m61210e(r6, r2)
            java.lang.String r2 = r4.f44978d
            if (r2 == 0) goto L_0x0115
            boolean r2 = uh0.C25081h.m62831B(r2)
            if (r2 == 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            r2 = 0
            goto L_0x0116
        L_0x0115:
            r2 = 1
        L_0x0116:
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x012b
            java.lang.String r2 = r4.f44979e
            if (r2 == 0) goto L_0x0126
            boolean r2 = uh0.C25081h.m62831B(r2)
            if (r2 == 0) goto L_0x0124
            goto L_0x0126
        L_0x0124:
            r2 = 0
            goto L_0x0127
        L_0x0126:
            r2 = 1
        L_0x0127:
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            r1 = 0
        L_0x012c:
            if (r1 == 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r0 = 8
        L_0x0131:
            r6.setVisibility(r0)
            oj.c r6 = r4.f44976b
            mf0.C24362h.m61208c(r6)
            com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r6 = r6.f47732d
            int r0 = p605ki.C18061o.disclaimerActivationButton
            r6.setButtonId(r0)
            oj.c r6 = r4.f44976b
            mf0.C24362h.m61208c(r6)
            com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame r6 = r6.f47732d
            int r0 = p605ki.C18066t.com_masabi_justride_sdk_ticket_activate_button
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r1 = "getString(R.string.com_m…k_ticket_activate_button)"
            mf0.C24362h.m61210e(r0, r1)
            r6.setButtonText(r0)
            oj.c r6 = r4.f44976b
            mf0.C24362h.m61208c(r6)
            android.widget.Button r6 = r6.f47731c
            java.lang.String r0 = "binding.closeButton"
            mf0.C24362h.m61210e(r6, r0)
            int r0 = p605ki.C18060n.com_masabi_justride_sdk_icon_close_small
            p583jk.C17884p.m44362d(r6, r0)
            hp.a$b r6 = new hp.a$b
            r6.<init>(r4)
            android.content.res.Resources r0 = r4.getResources()
            int r1 = p605ki.C18062p.com_masabi_justride_sdk_ui_default_animation_duration
            int r0 = r0.getInteger(r1)
            long r0 = (long) r0
            r5.postDelayed(r6, r0)
            return
        L_0x017a:
            com.masabi.justride.sdk.exception.MissingArgumentException r5 = new com.masabi.justride.sdk.exception.MissingArgumentException
            java.lang.String r6 = "Cannot load fragment without ticket id."
            r5.<init>(r6)
            throw r5
        L_0x0182:
            com.masabi.justride.sdk.exception.MissingArgumentException r5 = new com.masabi.justride.sdk.exception.MissingArgumentException
            java.lang.String r6 = "Cannot load fragment with null bundle."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p542hp.C17468a.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
