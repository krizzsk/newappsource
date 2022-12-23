package com.masabi.justride.sdk.p415ui.features.universalticket;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1044w;
import com.masabi.justride.sdk.exception.MissingArgumentException;
import com.masabi.justride.sdk.exception.MissingSDKException;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.p415ui.base.activities.BaseActivity;
import com.masabi.justride.sdk.platform.jobs.CallBackOn;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;
import p364al.C13487h;
import p364al.C13488i;
import p605ki.C18047b;
import p605ki.C18057k;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18066t;
import p701oj.C18757a;
import p871vo.C20173a;
import p871vo.C20174b;
import p871vo.C20175c;
import p871vo.C20176d;
import p871vo.C20178e;
import p871vo.C20193i;
import p891wk.C20364s;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/masabi/justride/sdk/ui/features/universalticket/UniversalTicketActivity;", "Lcom/masabi/justride/sdk/ui/base/activities/BaseActivity;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.UniversalTicketActivity */
public final class UniversalTicketActivity extends BaseActivity {

    /* renamed from: C */
    public static final /* synthetic */ int f37206C = 0;

    /* renamed from: A */
    public C20176d f37207A;

    /* renamed from: B */
    public final C14665a f37208B = new C14665a(this);

    /* renamed from: x */
    public C18757a f37209x;

    /* renamed from: y */
    public String f37210y;

    /* renamed from: z */
    public UniversalTicketScreenConfiguration f37211z;

    /* renamed from: com.masabi.justride.sdk.ui.features.universalticket.UniversalTicketActivity$a */
    public static final class C14665a<S> implements C13488i<Void> {

        /* renamed from: a */
        public final /* synthetic */ UniversalTicketActivity f37212a;

        public C14665a(UniversalTicketActivity universalTicketActivity) {
            this.f37212a = universalTicketActivity;
        }

        /* renamed from: a */
        public final void mo40393a(C13487h<Void> hVar) {
            C24362h.m61211f(hVar, "it");
            UniversalTicketActivity universalTicketActivity = this.f37212a;
            int i = UniversalTicketActivity.f37206C;
            universalTicketActivity.mo44441f1();
        }
    }

    /* renamed from: com.masabi.justride.sdk.ui.features.universalticket.UniversalTicketActivity$b */
    public static final class C14666b implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ UniversalTicketActivity f37213b;

        public C14666b(UniversalTicketActivity universalTicketActivity) {
            this.f37213b = universalTicketActivity;
        }

        public final void onClick(View view) {
            this.f37213b.finish();
        }
    }

    /* renamed from: com.masabi.justride.sdk.ui.features.universalticket.UniversalTicketActivity$c */
    public static final class C14667c<T> implements C1044w<C20364s> {

        /* renamed from: a */
        public final /* synthetic */ UniversalTicketActivity f37214a;

        public C14667c(UniversalTicketActivity universalTicketActivity) {
            this.f37214a = universalTicketActivity;
        }

        public final void onChanged(Object obj) {
            C20364s sVar = (C20364s) obj;
            UniversalTicketActivity universalTicketActivity = this.f37214a;
            C24362h.m61210e(sVar, "it");
            TicketDisplayConfiguration ticketDisplayConfiguration = sVar.f51631i;
            C24362h.m61210e(ticketDisplayConfiguration, "it.ticketDisplayConfiguration");
            C18757a aVar = universalTicketActivity.f37209x;
            if (aVar != null) {
                aVar.f47725f.setBackgroundColor(ticketDisplayConfiguration.f37095l);
                C18757a aVar2 = universalTicketActivity.f37209x;
                if (aVar2 != null) {
                    aVar2.f47720a.setTextColor(ticketDisplayConfiguration.f37097n);
                } else {
                    C24362h.m61217l("binding");
                    throw null;
                }
            } else {
                C24362h.m61217l("binding");
                throw null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m36827d1(com.masabi.justride.sdk.p415ui.features.universalticket.UniversalTicketActivity r3, int r4) {
        /*
            vo.d r0 = r3.f37207A
            r1 = 0
            if (r0 == 0) goto L_0x0043
            java.lang.Integer r2 = r0.f51185b
            if (r2 == 0) goto L_0x0029
            int r2 = r2.intValue()
            int r2 = r2 + r4
            if (r2 >= 0) goto L_0x0018
            java.util.List<java.lang.String> r4 = r0.f51184a
            int r4 = r4.size()
            int r2 = r4 + -1
        L_0x0018:
            java.util.List<java.lang.String> r4 = r0.f51184a
            int r4 = r4.size()
            int r4 = r4 + -1
            if (r2 <= r4) goto L_0x0023
            r2 = 0
        L_0x0023:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r0.f51185b = r4
        L_0x0029:
            java.lang.Integer r4 = r0.f51185b
            if (r4 == 0) goto L_0x003a
            int r4 = r4.intValue()
            java.util.List<java.lang.String> r0 = r0.f51184a
            java.lang.Object r4 = kotlin.collections.C23825c.m58516m0(r4, r0)
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
        L_0x003a:
            if (r1 == 0) goto L_0x0042
            r3.mo44443i1(r1)
            r3.mo44440e1()
        L_0x0042:
            return
        L_0x0043:
            java.lang.String r3 = "presenter"
            mf0.C24362h.m61217l(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.masabi.justride.sdk.p415ui.features.universalticket.UniversalTicketActivity.m36827d1(com.masabi.justride.sdk.ui.features.universalticket.UniversalTicketActivity, int):void");
    }

    /* renamed from: e1 */
    public final void mo44440e1() {
        C20176d dVar = this.f37207A;
        if (dVar != null) {
            Integer num = dVar.f51185b;
            if (num != null) {
                int intValue = num.intValue();
                C18757a aVar = this.f37209x;
                if (aVar != null) {
                    TextView textView = aVar.f47722c;
                    C24362h.m61210e(textView, "binding.multiRiderTextView");
                    textView.setText(getResources().getString(C18066t.com_masabi_justride_sdk_universal_ticket_multi_rider_info_text, new Object[]{Integer.valueOf(intValue + 1), Integer.valueOf(dVar.f51184a.size())}));
                    return;
                }
                C24362h.m61217l("binding");
                throw null;
            }
            return;
        }
        C24362h.m61217l("presenter");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r0 != false) goto L_0x001a;
     */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44441f1() {
        /*
            r5 = this;
            vo.d r0 = r5.f37207A
            r1 = 0
            if (r0 == 0) goto L_0x0039
            java.util.List<java.lang.String> r2 = r0.f51184a
            int r2 = r2.size()
            r3 = 1
            r4 = 0
            if (r2 <= r3) goto L_0x0019
            java.lang.Integer r0 = r0.f51185b
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            oj.a r0 = r5.f37209x
            if (r0 == 0) goto L_0x0033
            android.widget.LinearLayout r0 = r0.f47723d
            java.lang.String r1 = "binding.multiRiderViewGroup"
            mf0.C24362h.m61210e(r0, r1)
            if (r3 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r4 = 8
        L_0x002a:
            r0.setVisibility(r4)
            if (r3 == 0) goto L_0x0032
            r5.mo44440e1()
        L_0x0032:
            return
        L_0x0033:
            java.lang.String r0 = "binding"
            mf0.C24362h.m61217l(r0)
            throw r1
        L_0x0039:
            java.lang.String r0 = "presenter"
            mf0.C24362h.m61217l(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.masabi.justride.sdk.p415ui.features.universalticket.UniversalTicketActivity.mo44441f1():void");
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(C18057k.animate_sub_navigation_static, C18057k.animate_sub_navigation_enter_out);
    }

    /* renamed from: i1 */
    public final void mo44443i1(String str) {
        int i = C20178e.f51192o;
        C18047b b1 = mo44385b1();
        UniversalTicketScreenConfiguration universalTicketScreenConfiguration = this.f37211z;
        if (universalTicketScreenConfiguration != null) {
            C20178e a = C20178e.C20179a.m47753a(b1, str, universalTicketScreenConfiguration);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
            K.mo4112g(C18057k.animate_fade_in, C18057k.animate_fade_out, 0, 0);
            K.mo4111f(C18061o.universalTicketFragmentContainer, a, (String) null);
            K.mo4040d();
            return;
        }
        C24362h.m61217l("ticketScreenConfiguration");
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(C18063q.activity_universal_ticket, (ViewGroup) null, false);
        int i = C18061o.closeButton;
        Button button = (Button) inflate.findViewById(i);
        if (button != null) {
            i = C18061o.leftMultiRiderButton;
            ImageView imageView = (ImageView) inflate.findViewById(i);
            if (imageView != null) {
                i = C18061o.multiRiderTextView;
                TextView textView = (TextView) inflate.findViewById(i);
                if (textView != null) {
                    i = C18061o.multiRiderViewGroup;
                    LinearLayout linearLayout = (LinearLayout) inflate.findViewById(i);
                    if (linearLayout != null) {
                        i = C18061o.rightMultiRiderButton;
                        ImageView imageView2 = (ImageView) inflate.findViewById(i);
                        if (imageView2 != null) {
                            LinearLayout linearLayout2 = (LinearLayout) inflate;
                            int i2 = C18061o.universalTicketFragmentContainer;
                            FragmentContainerView fragmentContainerView = (FragmentContainerView) inflate.findViewById(i2);
                            if (fragmentContainerView != null) {
                                this.f37209x = new C18757a(linearLayout2, button, imageView, textView, linearLayout, imageView2, linearLayout2, fragmentContainerView);
                                setContentView((View) linearLayout2);
                                Intent intent = getIntent();
                                C24362h.m61210e(intent, "intent");
                                Bundle extras = intent.getExtras();
                                if (extras != null) {
                                    String string = extras.getString("KEY_TICKET_ID");
                                    if (string != null) {
                                        this.f37210y = string;
                                        UniversalTicketScreenConfiguration universalTicketScreenConfiguration = (UniversalTicketScreenConfiguration) extras.getParcelable("KEY_UNIVERSAL_TICKET_SCREEN_CONFIGURATION");
                                        if (universalTicketScreenConfiguration != null) {
                                            this.f37211z = universalTicketScreenConfiguration;
                                            try {
                                                C20176d.C20177a aVar = (C20176d.C20177a) mo44385b1().f46180j.mo22587a(C20176d.C20177a.class);
                                                this.f37207A = new C20176d(aVar.f51189a, aVar.f51190b, aVar.f51191c);
                                            } catch (MissingSDKException unused) {
                                            }
                                            C18757a aVar2 = this.f37209x;
                                            if (aVar2 != null) {
                                                Button button2 = aVar2.f47720a;
                                                C24362h.m61210e(button2, "binding.closeButton");
                                                button2.setBackground((Drawable) null);
                                                C18757a aVar3 = this.f37209x;
                                                if (aVar3 != null) {
                                                    aVar3.f47720a.setOnClickListener(new C14666b(this));
                                                    C18757a aVar4 = this.f37209x;
                                                    if (aVar4 != null) {
                                                        LinearLayout linearLayout3 = aVar4.f47723d;
                                                        C24362h.m61210e(linearLayout3, "binding.multiRiderViewGroup");
                                                        linearLayout3.setVisibility(8);
                                                        overridePendingTransition(C18057k.animate_sub_navigation_enter_in, C18057k.animate_sub_navigation_static);
                                                        Fragment z = getSupportFragmentManager().mo3983z(C18061o.universalTicketFragmentContainer);
                                                        if (!(z instanceof C20178e)) {
                                                            z = null;
                                                        }
                                                        if (((C20178e) z) == null) {
                                                            String str = this.f37210y;
                                                            if (str != null) {
                                                                mo44443i1(str);
                                                            } else {
                                                                C24362h.m61217l("ticketId");
                                                                throw null;
                                                            }
                                                        }
                                                        C18757a aVar5 = this.f37209x;
                                                        if (aVar5 != null) {
                                                            FragmentContainerView fragmentContainerView2 = aVar5.f47726g;
                                                            C24362h.m61210e(fragmentContainerView2, "binding.universalTicketFragmentContainer");
                                                            fragmentContainerView2.setClipToOutline(true);
                                                            C20176d dVar = this.f37207A;
                                                            if (dVar != null) {
                                                                String str2 = this.f37210y;
                                                                if (str2 != null) {
                                                                    dVar.f51186c.mo40390a(new C20175c(dVar, str2), CallBackOn.MAIN_THREAD, this.f37208B);
                                                                    C18757a aVar6 = this.f37209x;
                                                                    if (aVar6 != null) {
                                                                        aVar6.f47721b.setOnClickListener(new C20173a(this));
                                                                        C18757a aVar7 = this.f37209x;
                                                                        if (aVar7 != null) {
                                                                            aVar7.f47724e.setOnClickListener(new C20174b(this));
                                                                            return;
                                                                        } else {
                                                                            C24362h.m61217l("binding");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        C24362h.m61217l("binding");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    C24362h.m61217l("ticketId");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                return;
                                                            }
                                                        } else {
                                                            C24362h.m61217l("binding");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C24362h.m61217l("binding");
                                                        throw null;
                                                    }
                                                } else {
                                                    C24362h.m61217l("binding");
                                                    throw null;
                                                }
                                            } else {
                                                C24362h.m61217l("binding");
                                                throw null;
                                            }
                                        } else {
                                            throw new MissingArgumentException("Cannot load ticket screen with null ticket screen configuration");
                                        }
                                    } else {
                                        throw new MissingArgumentException("Cannot load ticket screen with null ticket id");
                                    }
                                } else {
                                    throw new MissingArgumentException("Cannot load ticket screen with null arguments");
                                }
                            } else {
                                i = i2;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroy() {
        super.onDestroy();
        C20176d dVar = this.f37207A;
        if (dVar != null) {
            dVar.f51186c.mo40392c(this.f37208B);
        }
    }

    public final void onStart() {
        super.onStart();
        C1026n0 n0Var = new C1026n0(this);
        String str = this.f37210y;
        if (str != null) {
            C1019k0 b = n0Var.mo4314b(C20193i.class, str);
            C24362h.m61210e(b, "ViewModelProvider(this).…ketViewModel::class.java)");
            ((C20193i) b).f51229b.observe(this, new C14667c(this));
            return;
        }
        C24362h.m61217l("ticketId");
        throw null;
    }
}
