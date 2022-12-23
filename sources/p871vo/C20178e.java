package p871vo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import bf0.C21050d;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.p415ui.features.universalticket.UniversalTicketActivity;
import com.masabi.justride.sdk.p415ui.features.universalticket.UniversalTicketScreenConfiguration;
import com.masabi.justride.sdk.p415ui.features.universalticket.main.MainTicketFragment;
import com.masabi.justride.sdk.platform.jobs.CallBackOn;
import java.util.ArrayList;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;
import p090g1.C4745d;
import p364al.C13483d;
import p364al.C13487h;
import p364al.C13488i;
import p470ep.C16848a;
import p565io.C17624a;
import p605ki.C18047b;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18066t;
import p725pj.C18926a;
import p870vn.C20162b;
import p870vn.C20163c;
import p870vn.C20165e;
import p870vn.C20167g;
import p870vn.C20168h;
import p870vn.C20170j;
import p870vn.C20171k;
import p870vn.C20172l;
import p891wk.C20364s;
import p919xo.C20547a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo59060d2 = {"Lvo/e;", "Lio/a;", "<init>", "()V", "a", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: vo.e */
public final class C20178e extends C17624a {

    /* renamed from: o */
    public static final /* synthetic */ int f51192o = 0;

    /* renamed from: c */
    public C20190g f51193c;

    /* renamed from: d */
    public C20193i f51194d;

    /* renamed from: e */
    public String f51195e;

    /* renamed from: f */
    public UniversalTicketScreenConfiguration f51196f;

    /* renamed from: g */
    public C4745d f51197g;

    /* renamed from: h */
    public C4745d f51198h;

    /* renamed from: i */
    public C4745d f51199i;

    /* renamed from: j */
    public C4745d f51200j;

    /* renamed from: k */
    public C4745d f51201k;

    /* renamed from: l */
    public C4745d f51202l;

    /* renamed from: m */
    public final C20180b f51203m = new C20180b(this);

    /* renamed from: n */
    public final C20188j f51204n = new C20188j(this);

    /* renamed from: vo.e$a */
    public static final class C20179a {
        /* renamed from: a */
        public static C20178e m47753a(C18047b bVar, String str, UniversalTicketScreenConfiguration universalTicketScreenConfiguration) {
            C24362h.m61211f(str, "ticketId");
            C24362h.m61211f(universalTicketScreenConfiguration, "ticketScreenConfiguration");
            C20178e eVar = new C20178e();
            Bundle H1 = C17624a.m43768H1(bVar);
            H1.putString("TICKET_ID_KEY", str);
            H1.putParcelable("TICKET_SCREEN_CONFIGURATION_KEY", universalTicketScreenConfiguration);
            C21050d dVar = C21050d.f52856a;
            eVar.setArguments(H1);
            return eVar;
        }
    }

    /* renamed from: vo.e$b */
    public static final class C20180b<S> implements C13488i<Void> {

        /* renamed from: a */
        public final /* synthetic */ C20178e f51205a;

        public C20180b(C20178e eVar) {
            this.f51205a = eVar;
        }

        /* renamed from: a */
        public final void mo40393a(C13487h<Void> hVar) {
            C24362h.m61211f(hVar, "it");
            C20178e eVar = this.f51205a;
            int i = C20178e.f51192o;
            Fragment z = eVar.getChildFragmentManager().mo3983z(C18061o.ticketFragmentContainer);
            if (!(z instanceof MainTicketFragment)) {
                z = null;
            }
            MainTicketFragment mainTicketFragment = (MainTicketFragment) z;
            if (mainTicketFragment != null) {
                mainTicketFragment.f37252e = false;
            }
            if (hVar.mo40399a()) {
                String string = eVar.getString(C18066t.com_masabi_justride_sdk_error);
                C24362h.m61210e(string, "getString(R.string.com_masabi_justride_sdk_error)");
                String string2 = eVar.getString(C18066t.com_masabi_justride_sdk_ticket_activation_error);
                C24362h.m61210e(string2, "getString(R.string.com_m…_ticket_activation_error)");
                new AlertDialog.Builder(eVar.requireContext()).setCancelable(true).setMessage(string2).setNeutralButton(C18066t.com_masabi_justride_sdk_dismiss, (DialogInterface.OnClickListener) null).setTitle(string).show();
                return;
            }
            FragmentActivity activity = eVar.getActivity();
            if (!(activity instanceof UniversalTicketActivity)) {
                activity = null;
            }
            UniversalTicketActivity universalTicketActivity = (UniversalTicketActivity) activity;
            if (universalTicketActivity != null) {
                String str = eVar.f51195e;
                if (str != null) {
                    C20176d dVar = universalTicketActivity.f37207A;
                    if (dVar != null) {
                        if (!dVar.f51184a.contains(str)) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(0, str);
                            arrayList.addAll(dVar.f51184a);
                            dVar.f51184a = arrayList;
                            dVar.mo52423a(str);
                        }
                        universalTicketActivity.mo44441f1();
                    } else {
                        C24362h.m61217l("presenter");
                        throw null;
                    }
                } else {
                    C24362h.m61217l("ticketId");
                    throw null;
                }
            }
            eVar.mo52424K1();
        }
    }

    /* renamed from: vo.e$c */
    public static final class C20181c<T extends C20163c> implements C20165e<C20171k> {

        /* renamed from: a */
        public final /* synthetic */ C20178e f51206a;

        public C20181c(C20178e eVar) {
            this.f51206a = eVar;
        }

        /* renamed from: a */
        public final void mo52411a(C20163c cVar) {
            C20171k kVar = (C20171k) cVar;
            this.f51206a.mo52424K1();
        }
    }

    /* renamed from: vo.e$d */
    public static final class C20182d<T extends C20163c> implements C20165e<C20167g> {

        /* renamed from: a */
        public final /* synthetic */ C20178e f51207a;

        public C20182d(C20178e eVar) {
            this.f51207a = eVar;
        }

        /* renamed from: a */
        public final void mo52411a(C20163c cVar) {
            C20167g gVar = (C20167g) cVar;
            this.f51207a.mo52424K1();
        }
    }

    /* renamed from: vo.e$e */
    public static final class C20183e<T extends C20163c> implements C20165e<C20168h> {

        /* renamed from: a */
        public final /* synthetic */ C20178e f51208a;

        public C20183e(C20178e eVar) {
            this.f51208a = eVar;
        }

        /* renamed from: a */
        public final void mo52411a(C20163c cVar) {
            C20168h hVar = (C20168h) cVar;
            this.f51208a.mo52425L1(6);
        }
    }

    /* renamed from: vo.e$f */
    public static final class C20184f<T extends C20163c> implements C20165e<C20162b> {

        /* renamed from: a */
        public final /* synthetic */ C20178e f51209a;

        public C20184f(C20178e eVar) {
            this.f51209a = eVar;
        }

        /* renamed from: a */
        public final void mo52411a(C20163c cVar) {
            C20162b bVar = (C20162b) cVar;
            this.f51209a.mo52425L1(7);
        }
    }

    /* renamed from: vo.e$g */
    public static final class C20185g<T extends C20163c> implements C20165e<C20170j> {

        /* renamed from: a */
        public final /* synthetic */ C20178e f51210a;

        public C20185g(C20178e eVar) {
            this.f51210a = eVar;
        }

        /* renamed from: a */
        public final void mo52411a(C20163c cVar) {
            C20170j jVar = (C20170j) cVar;
            this.f51210a.mo52425L1(8);
        }
    }

    /* renamed from: vo.e$h */
    public static final class C20186h<T extends C20163c> implements C20165e<C20172l> {

        /* renamed from: a */
        public final /* synthetic */ C20178e f51211a;

        public C20186h(C20178e eVar) {
            this.f51211a = eVar;
        }

        /* renamed from: a */
        public final void mo52411a(C20163c cVar) {
            C20172l lVar = (C20172l) cVar;
            this.f51211a.mo52424K1();
        }
    }

    /* renamed from: vo.e$i */
    public static final class C20187i<R> implements C13483d<C20364s> {

        /* renamed from: a */
        public final /* synthetic */ C20178e f51212a;

        public C20187i(C20178e eVar) {
            this.f51212a = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:150:0x040d  */
        /* renamed from: C */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p364al.C13487h<p891wk.C20364s> mo40394C() {
            /*
                r33 = this;
                r1 = r33
                vo.e r0 = r1.f51212a
                vo.g r2 = r0.f51193c
                r0 = 0
                if (r2 == 0) goto L_0x0411
                tm.i r3 = r2.f51216b
                java.lang.String r4 = r2.f51220f
                com.masabi.justride.sdk.ui.features.universalticket.UniversalTicketScreenConfiguration r5 = r2.f51219e
                java.lang.Integer r6 = r5.f37215b
                float r7 = r5.f37216c
                java.lang.Integer r8 = r5.f37217d
                java.lang.Integer r9 = r5.f37218e
                java.lang.Integer r10 = r5.f37219f
                java.lang.Boolean r5 = r5.f37220g
                vl.a r11 = r3.f50034a
                boolean r11 = r11.mo52404a()
                java.lang.String r12 = "all"
                if (r11 != 0) goto L_0x0039
                al.h r3 = new al.h
                ek.e r4 = new ek.e
                r5 = 100
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.String r6 = "This API requires the universal-ticket entitlement"
                r4.<init>(r0, r5, r6)
                r3.<init>(r0, r4)
                goto L_0x0113
            L_0x0039:
                tm.g$a r0 = r3.f50035b
                com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob r11 = r0.f50032a
                an.a$a r0 = r0.f50033b
                an.a r0 = r0.mo40405a(r4)
                al.h r13 = r11.mo44363a(r4)
                boolean r14 = r13.mo40399a()
                if (r14 == 0) goto L_0x004e
                goto L_0x0080
            L_0x004e:
                S r14 = r13.f33365a
                wk.q r14 = (p891wk.C20362q) r14
                com.masabi.justride.sdk.internal.models.ticket.TicketState r15 = r14.f51582D
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.LIVE
                if (r15 != r1) goto L_0x006d
                wk.a r1 = r14.f51608n
                boolean r14 = r1.f51508c
                if (r14 == 0) goto L_0x0068
                java.lang.Integer r1 = r1.f51510e
                int r1 = r1.intValue()
                if (r1 <= 0) goto L_0x0068
                r1 = 1
                goto L_0x0069
            L_0x0068:
                r1 = 0
            L_0x0069:
                if (r1 == 0) goto L_0x006d
                r1 = 1
                goto L_0x006e
            L_0x006d:
                r1 = 0
            L_0x006e:
                if (r1 != 0) goto L_0x0071
                goto L_0x0080
            L_0x0071:
                al.h r0 = r0.mo40404a()
                boolean r0 = r0.mo40399a()
                if (r0 == 0) goto L_0x007c
                goto L_0x0080
            L_0x007c:
                al.h r13 = r11.mo44363a(r4)
            L_0x0080:
                boolean r0 = r13.mo40399a()
                if (r0 == 0) goto L_0x008e
                pj.a r0 = r13.f33366b
                al.h r3 = p821tm.C19705i.m47170a(r0)
                goto L_0x0113
            L_0x008e:
                S r0 = r13.f33365a
                r1 = r0
                wk.q r1 = (p891wk.C20362q) r1
                com.masabi.justride.sdk.internal.models.ticket.TicketState r0 = r1.f51582D
                com.masabi.justride.sdk.internal.models.ticket.TicketState r4 = com.masabi.justride.sdk.internal.models.ticket.TicketState.UNKNOWN
                if (r0 != r4) goto L_0x00ad
                ek.e r0 = new ek.e
                r1 = 101(0x65, float:1.42E-43)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r3 = "Unknown state"
                r0.<init>(r1, r3)
                al.h r3 = new al.h
                r1 = 0
                r3.<init>(r1, r0)
                goto L_0x0113
            L_0x00ad:
                tm.p r0 = r3.f50036c
                al.h r0 = r0.mo52062a(r1)
                boolean r4 = r0.mo40399a()
                if (r4 == 0) goto L_0x00c0
                pj.a r0 = r0.f33366b
                al.h r3 = p821tm.C19705i.m47170a(r0)
                goto L_0x0113
            L_0x00c0:
                S r0 = r0.f33365a
                r14 = r0
                qn.h r14 = (p752qn.C19150h) r14
                g3.a r0 = r3.f50039f
                com.google.android.play.core.assetpacks.w2 r4 = new com.google.android.play.core.assetpacks.w2
                java.lang.Object r0 = r0.f16037a
                wm.a r0 = (p893wm.C20374a) r0
                r11 = 2
                r4.<init>(r11, r1, r0)
                g1.d r0 = r3.f50040g
                u2.a r11 = new u2.a
                java.lang.Object r0 = r0.f16031a
                ym.a r0 = (p940ym.C20745a) r0
                r11.<init>(r0, r1)
                com.masabi.justride.sdk.internal.models.ticket.TicketState r0 = r1.f51582D
                boolean r0 = r0.isActive()
                if (r0 == 0) goto L_0x011c
                ql.c r0 = r3.f50037d
                al.h r0 = r0.mo51575a(r1)
                boolean r13 = r0.mo40399a()
                if (r13 == 0) goto L_0x00f7
                pj.a r0 = r0.f33366b
                al.h r3 = p821tm.C19705i.m47170a(r0)
                goto L_0x0113
            L_0x00f7:
                S r0 = r0.f33365a
                com.masabi.justride.sdk.jobs.barcode.a r0 = (com.masabi.justride.sdk.jobs.barcode.C14654a) r0
                fn.a$a r13 = r3.f50038e
                fn.a r15 = new fn.a
                fn.d$a r13 = r13.f44181a
                r15.<init>(r1, r13)
                al.h r13 = r15.mo40394C()
                boolean r15 = r13.mo40399a()
                if (r15 == 0) goto L_0x0117
                r0 = 0
                al.h r3 = p821tm.C19705i.m47170a(r0)
            L_0x0113:
                r27 = r2
                goto L_0x0406
            L_0x0117:
                S r13 = r13.f33365a
                fn.c r13 = (p492fn.C17043c) r13
                goto L_0x011e
            L_0x011c:
                r0 = 0
                r13 = 0
            L_0x011e:
                r16 = r0
                r17 = r13
                xi.d r0 = r3.f50043j     // Catch:{ JSONException -> 0x03f6 }
                r0.getClass()     // Catch:{ JSONException -> 0x03f6 }
                java.lang.Class r13 = r14.getClass()     // Catch:{ JSONException -> 0x03f6 }
                xi.a r0 = r0.mo52734c(r13)     // Catch:{ JSONException -> 0x03f6 }
                org.json.JSONObject r0 = r0.mo40385f(r14)     // Catch:{ JSONException -> 0x03f6 }
                java.lang.String r20 = r0.toString()     // Catch:{ JSONException -> 0x03f6 }
                java.util.List<java.lang.String> r0 = r14.f48715h
                java.util.Iterator r0 = r0.iterator()
                java.lang.String r13 = "default"
                r21 = r13
            L_0x0141:
                boolean r13 = r0.hasNext()
                if (r13 == 0) goto L_0x016a
                java.lang.Object r13 = r0.next()
                java.lang.String r13 = (java.lang.String) r13
                java.lang.String r15 = "="
                java.lang.String[] r13 = r13.split(r15)
                int r15 = r13.length
                r18 = r0
                r0 = 2
                if (r15 != r0) goto L_0x0167
                r0 = 0
                r0 = r13[r0]
                java.lang.String r15 = "template"
                boolean r0 = r15.equals(r0)
                if (r0 == 0) goto L_0x0167
                r0 = 1
                r21 = r13[r0]
            L_0x0167:
                r0 = r18
                goto L_0x0141
            L_0x016a:
                tm.j r13 = r3.f50041h
                java.lang.String r15 = r1.f51594P
                r27 = r2
                java.lang.String r2 = r1.f51602h
                sl.f r0 = r13.f50046a
                r0.getClass()
                r19 = r11
                java.io.File r11 = new java.io.File
                r18 = r4
                java.lang.String r4 = r0.f49525c
                java.lang.String r22 = "templates/"
                r23 = r14
                java.lang.StringBuilder r14 = p379.C13555b.m33972k(r22)
                r22 = r1
                java.lang.String r1 = r0.f49526d
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r11.<init>(r4, r1)
                java.io.File r1 = new java.io.File
                r4 = 23
                byte[] r4 = new byte[r4]
                r4 = {116, 105, 99, 107, 101, 116, 45, 102, 97, 99, 101, 45, 99, 111, 110, 102, 105, 103, 46, 106, 115, 111, 110} // fill-array
                java.lang.String r4 = ce0.C21100e.m49304E(r4)
                r1.<init>(r11, r4)
                java.lang.String r1 = r1.getAbsolutePath()
                co.p r4 = r0.f49523a
                co.r r4 = r4.mo40800b(r1)
                boolean r11 = r4.mo40817a()
                if (r11 == 0) goto L_0x01c5
                pj.a r0 = r4.f34120b
                tj.a r1 = new tj.a
                java.lang.Integer r4 = p818tj.C19683a.f49964j
                r11 = 0
                r1.<init>(r0, r4, r11)
                al.h r0 = new al.h
                r0.<init>(r11, r1)
                goto L_0x0225
            L_0x01c5:
                r11 = 0
                S r4 = r4.f34119a
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L_0x01d6
                al.h r0 = new al.h
                r0.<init>(r11, r11)
                goto L_0x0225
            L_0x01d6:
                co.p r4 = r0.f49523a
                co.r r1 = r4.mo40799a(r1)
                boolean r4 = r1.mo40817a()
                if (r4 == 0) goto L_0x01f1
                pj.a r0 = r1.f34120b
                tj.a r1 = new tj.a
                java.lang.Integer r4 = p818tj.C19683a.f49964j
                r1.<init>(r0, r4, r11)
                al.h r0 = new al.h
                r0.<init>(r11, r1)
                goto L_0x0225
            L_0x01f1:
                java.lang.String r4 = new java.lang.String
                S r1 = r1.f34119a
                byte[] r1 = (byte[]) r1
                java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.UTF_8
                r4.<init>(r1, r11)
                xi.d r0 = r0.f49524b     // Catch:{ JSONException -> 0x020d }
                java.lang.Class<wk.z> r1 = p891wk.C20371z.class
                java.lang.Object r0 = r0.mo52732a(r1, r4)     // Catch:{ JSONException -> 0x020d }
                wk.z r0 = (p891wk.C20371z) r0     // Catch:{ JSONException -> 0x020d }
                al.h r1 = new al.h
                r4 = 0
                r1.<init>(r0, r4)
                goto L_0x0224
            L_0x020d:
                r0 = move-exception
                ik.a r1 = new ik.a
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                tj.a r0 = new tj.a
                java.lang.Integer r4 = p818tj.C19683a.f49964j
                r11 = 0
                r0.<init>(r1, r4, r11)
                al.h r1 = new al.h
                r1.<init>(r11, r0)
            L_0x0224:
                r0 = r1
            L_0x0225:
                boolean r1 = r0.mo40399a()
                java.lang.String r4 = "Failed getting Ticket Display Configuration"
                r11 = 102(0x66, float:1.43E-43)
                if (r1 == 0) goto L_0x0245
                pj.a r0 = r0.f33366b
                ek.e r1 = new ek.e
                java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
                r1.<init>(r0, r2, r4)
                al.h r0 = new al.h
                r2 = 0
                r0.<init>(r2, r1)
                r25 = r3
                r4 = r12
                goto L_0x039d
            L_0x0245:
                S r0 = r0.f33365a
                wk.z r0 = (p891wk.C20371z) r0
                com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration$a r1 = new com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration$a
                r1.<init>()
                if (r0 == 0) goto L_0x0303
                java.lang.String r11 = r0.f51663j
                java.lang.String r14 = r0.f51658e
                java.lang.Integer r14 = p821tm.C19706j.m47171a(r14)
                r24 = r11
                java.lang.String r11 = r0.f51659f
                java.lang.Integer r11 = p821tm.C19706j.m47171a(r11)
                r25 = r3
                java.lang.String r3 = r0.f51664k
                java.lang.Integer r3 = p821tm.C19706j.m47171a(r3)
                r26 = r4
                java.lang.Double r4 = r0.f51665l
                if (r4 != 0) goto L_0x0270
                r4 = 0
                goto L_0x0278
            L_0x0270:
                float r4 = r4.floatValue()
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
            L_0x0278:
                r28 = r2
                java.lang.String r2 = r0.f51666m
                java.lang.Integer r2 = p821tm.C19706j.m47171a(r2)
                r29 = r15
                java.lang.String r15 = r0.f51667n
                java.lang.Integer r15 = p821tm.C19706j.m47171a(r15)
                r30 = r5
                java.lang.String r5 = r0.f51668o
                java.lang.Integer r5 = p821tm.C19706j.m47171a(r5)
                r31 = r12
                java.lang.String r12 = r0.f51656c
                r32 = r13
                java.lang.String r13 = r0.f51657d
                if (r12 == 0) goto L_0x02a0
                if (r13 == 0) goto L_0x02a0
                r1.f37102c = r12
                r1.f37103d = r13
            L_0x02a0:
                java.util.Map<java.lang.String, java.lang.Integer> r12 = r0.f51654a
                r1.f37100a = r12
                r1.f37104e = r14
                r1.f37105f = r11
                java.lang.String r11 = r0.f51655b
                r1.f37101b = r11
                java.lang.Long r11 = r0.f51660g
                r1.f37106g = r11
                java.util.Map<java.lang.String, java.lang.String> r11 = r0.f51662i
                r1.f37107h = r11
                r1.f37109j = r3
                r1.f37110k = r4
                r1.f37111l = r2
                r1.f37112m = r15
                r1.f37113n = r5
                java.lang.Boolean r2 = r0.f51669p
                if (r2 == 0) goto L_0x02cd
                boolean r2 = r2.booleanValue()
                r2 = r2 ^ 1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                goto L_0x02ce
            L_0x02cd:
                r2 = 0
            L_0x02ce:
                r1.f37115p = r2
                wk.o r0 = r0.f51661h
                if (r0 == 0) goto L_0x0300
                java.lang.String r2 = r0.f51573a
                java.lang.Integer r2 = p821tm.C19706j.m47171a(r2)
                java.lang.Boolean r3 = r0.f51574b
                java.lang.Long r0 = r0.f51575c
                wk.p r4 = new wk.p
                if (r2 == 0) goto L_0x02e7
                int r2 = r2.intValue()
                goto L_0x02ea
            L_0x02e7:
                r2 = -546789(0xfffffffffff7a81b, float:NaN)
            L_0x02ea:
                if (r3 == 0) goto L_0x02f1
                boolean r3 = r3.booleanValue()
                goto L_0x02f2
            L_0x02f1:
                r3 = 0
            L_0x02f2:
                if (r0 == 0) goto L_0x02f9
                long r11 = r0.longValue()
                goto L_0x02fb
            L_0x02f9:
                r11 = 0
            L_0x02fb:
                r4.<init>(r11, r2, r3)
                r1.f37114o = r4
            L_0x0300:
                r11 = r24
                goto L_0x0312
            L_0x0303:
                r28 = r2
                r25 = r3
                r26 = r4
                r30 = r5
                r31 = r12
                r32 = r13
                r29 = r15
                r11 = 0
            L_0x0312:
                if (r6 == 0) goto L_0x0316
                r1.f37109j = r6
            L_0x0316:
                r0 = 0
                int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r0 < 0) goto L_0x0321
                java.lang.Float r0 = java.lang.Float.valueOf(r7)
                r1.f37110k = r0
            L_0x0321:
                if (r8 == 0) goto L_0x0325
                r1.f37111l = r8
            L_0x0325:
                if (r9 == 0) goto L_0x0329
                r1.f37112m = r9
            L_0x0329:
                if (r10 == 0) goto L_0x032d
                r1.f37113n = r10
            L_0x032d:
                r2 = r32
                vl.a r0 = r2.f50047b
                java.util.List<java.lang.String> r3 = r0.f51160a
                r4 = r31
                boolean r3 = r3.contains(r4)
                if (r3 != 0) goto L_0x0348
                java.util.List<java.lang.String> r0 = r0.f51160a
                java.lang.String r3 = "hide-ticket-price"
                boolean r0 = r0.contains(r3)
                if (r0 == 0) goto L_0x0346
                goto L_0x0348
            L_0x0346:
                r0 = 0
                goto L_0x0349
            L_0x0348:
                r0 = 1
            L_0x0349:
                if (r0 == 0) goto L_0x0359
                if (r30 == 0) goto L_0x0359
                boolean r0 = r30.booleanValue()
                r0 = r0 ^ 1
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1.f37115p = r0
            L_0x0359:
                java.lang.String r0 = p583jk.C17884p.m44352W(r29)
                if (r0 == 0) goto L_0x0360
                goto L_0x0370
            L_0x0360:
                java.lang.String r0 = p583jk.C17884p.m44352W(r28)
                if (r0 == 0) goto L_0x0367
                goto L_0x0370
            L_0x0367:
                java.lang.String r0 = p583jk.C17884p.m44352W(r11)
                if (r0 == 0) goto L_0x036e
                goto L_0x0370
            L_0x036e:
                java.lang.String r0 = "BARCODE_FIRST"
            L_0x0370:
                r1.f37108i = r0
                com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration r0 = r1.mo44337a()     // Catch:{ BuilderException -> 0x037e }
                al.h r1 = new al.h
                r2 = 0
                r1.<init>(r0, r2)
            L_0x037c:
                r0 = r1
                goto L_0x039d
            L_0x037e:
                r0 = move-exception
                r1 = r0
                r0 = 0
                jk.f r2 = r2.f50048c
                r2.getClass()
                pj.a r1 = p583jk.C17873f.m44275b(r1)
                ek.e r2 = new ek.e
                r3 = 102(0x66, float:1.43E-43)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = r26
                r2.<init>(r1, r3, r5)
                al.h r1 = new al.h
                r1.<init>(r0, r2)
                goto L_0x037c
            L_0x039d:
                boolean r1 = r0.mo40399a()
                if (r1 == 0) goto L_0x03aa
                pj.a r0 = r0.f33366b
                al.h r3 = p821tm.C19705i.m47170a(r0)
                goto L_0x0406
            L_0x03aa:
                S r0 = r0.f33365a
                com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration r0 = (com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration) r0
                r1 = r25
                wm.c$a r2 = r1.f50042i
                wk.p r3 = r0.f37099p
                wm.c r5 = new wm.c
                do.b r2 = r2.f51678a
                r6 = r22
                r5.<init>(r2, r3, r6)
                wk.s r2 = new wk.s
                com.masabi.justride.sdk.internal.models.ticket.TicketState r15 = r6.f51582D
                java.lang.String r3 = r1.f50044k
                java.lang.String r6 = r1.f50045l
                vl.a r1 = r1.f50034a
                java.util.List<java.lang.String> r7 = r1.f51160a
                boolean r4 = r7.contains(r4)
                if (r4 != 0) goto L_0x03de
                java.util.List<java.lang.String> r1 = r1.f51160a
                java.lang.String r4 = "custom-ticket-face"
                boolean r1 = r1.contains(r4)
                if (r1 == 0) goto L_0x03da
                goto L_0x03de
            L_0x03da:
                r1 = 0
                r26 = 0
                goto L_0x03e1
            L_0x03de:
                r1 = 1
                r26 = 1
            L_0x03e1:
                r13 = r2
                r14 = r23
                r22 = r0
                r23 = r5
                r24 = r3
                r25 = r6
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                al.h r3 = new al.h
                r0 = 0
                r3.<init>(r2, r0)
                goto L_0x0406
            L_0x03f6:
                r0 = move-exception
                r27 = r2
                ik.a r1 = new ik.a
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                al.h r3 = p821tm.C19705i.m47170a(r1)
            L_0x0406:
                boolean r0 = r3.mo40399a()
                if (r0 == 0) goto L_0x040d
                goto L_0x0410
            L_0x040d:
                r27.getClass()
            L_0x0410:
                return r3
            L_0x0411:
                java.lang.String r1 = "presenter"
                mf0.C24362h.m61217l(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p871vo.C20178e.C20187i.mo40394C():al.h");
        }
    }

    /* renamed from: vo.e$j */
    public static final class C20188j<S> implements C13488i<C20364s> {

        /* renamed from: a */
        public final /* synthetic */ C20178e f51213a;

        public C20188j(C20178e eVar) {
            this.f51213a = eVar;
        }

        /* renamed from: a */
        public final void mo40393a(C13487h<C20364s> hVar) {
            Integer num;
            boolean z;
            Integer num2;
            C24362h.m61211f(hVar, "it");
            C20178e eVar = this.f51213a;
            int i = C20178e.f51192o;
            eVar.getClass();
            if (hVar.mo40399a()) {
                C18926a aVar = hVar.f33366b;
                boolean z2 = false;
                if (aVar != null) {
                    if (!C24362h.m61206a(aVar.f48169a, "ticket.universal") || (num2 = aVar.f48170b) == null || num2.intValue() != 101) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        eVar.mo52425L1(2);
                        return;
                    }
                }
                C18926a aVar2 = hVar.f33366b;
                if (aVar2 == null || !C20178e.m47747J1(aVar2)) {
                    C18926a aVar3 = hVar.f33366b;
                    if (aVar3 != null) {
                        if (C24362h.m61206a(aVar3.f48169a, "ticket.universal") && (num = aVar3.f48170b) != null && num.intValue() == 103) {
                            z2 = true;
                        }
                        if (z2) {
                            eVar.mo52425L1(11);
                            return;
                        }
                    }
                    eVar.mo52425L1(1);
                    return;
                }
                eVar.mo52425L1(4);
                return;
            }
            C20193i iVar = eVar.f51194d;
            if (iVar != null) {
                iVar.f51229b.setValue(hVar.f33365a);
                if (eVar.getChildFragmentManager().mo3983z(C18061o.ticketFragmentContainer) instanceof C16848a) {
                    eVar.mo52427N1();
                    return;
                }
                return;
            }
            C24362h.m61217l("viewModel");
            throw null;
        }
    }

    /* renamed from: J1 */
    public static boolean m47747J1(C18926a aVar) {
        boolean z;
        Integer num;
        if (!C24362h.m61206a(aVar.f48169a, "ticket.access") || (num = aVar.f48170b) == null || num.intValue() != 110) {
            C18926a aVar2 = aVar.f48172d;
            if (aVar2 != null) {
                z = m47747J1(aVar2);
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: K1 */
    public final void mo52424K1() {
        C20190g gVar = this.f51193c;
        if (gVar != null) {
            gVar.f51217c.mo40390a(new C20187i(this), CallBackOn.MAIN_THREAD, this.f51204n);
        } else {
            C24362h.m61217l("presenter");
            throw null;
        }
    }

    /* renamed from: L1 */
    public final void mo52425L1(int i) {
        Integer num;
        C16848a aVar;
        TicketDisplayConfiguration ticketDisplayConfiguration;
        C20193i iVar = this.f51194d;
        if (iVar != null) {
            C20364s value = iVar.f51229b.getValue();
            if (value == null || (ticketDisplayConfiguration = value.f51631i) == null) {
                num = null;
            } else {
                num = Integer.valueOf(ticketDisplayConfiguration.f37096m);
            }
            if (num != null) {
                int intValue = num.intValue();
                aVar = new C16848a();
                Bundle bundle = new Bundle();
                bundle.putInt("KEY_ERROR_CODE", i);
                bundle.putInt("KEY_NAVIGATION_BUTTONS_TINT_COLOUR", intValue);
                C21050d dVar = C21050d.f52856a;
                aVar.setArguments(bundle);
            } else {
                aVar = new C16848a();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("KEY_ERROR_CODE", i);
                bundle2.putInt("KEY_NAVIGATION_BUTTONS_TINT_COLOUR", -16777216);
                C21050d dVar2 = C21050d.f52856a;
                aVar.setArguments(bundle2);
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
            K.mo4111f(C18061o.ticketFragmentContainer, aVar, (String) null);
            K.f3776f = 4099;
            K.mo4043i();
            return;
        }
        C24362h.m61217l("viewModel");
        throw null;
    }

    /* renamed from: M1 */
    public final void mo52426M1(Fragment fragment) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
        K.mo4111f(C18061o.ticketFragmentContainer, fragment, (String) null);
        K.f3776f = 4099;
        K.mo4040d();
    }

    /* renamed from: N1 */
    public final void mo52427N1() {
        C18047b bVar = this.f45307b;
        C24362h.m61210e(bVar, "justrideSDK");
        String str = this.f51195e;
        if (str != null) {
            C24362h.m61211f(str, "ticketId");
            MainTicketFragment mainTicketFragment = new MainTicketFragment();
            Bundle H1 = C17624a.m43768H1(bVar);
            H1.putString("TICKET_ID_KEY", str);
            C21050d dVar = C21050d.f52856a;
            mainTicketFragment.setArguments(H1);
            mo52426M1(mainTicketFragment);
            return;
        }
        C24362h.m61217l("ticketId");
        throw null;
    }

    /* renamed from: O1 */
    public final void mo52428O1() {
        String str = this.f51195e;
        if (str != null) {
            C24362h.m61211f(str, "ticketId");
            C20547a aVar = new C20547a();
            Bundle bundle = new Bundle();
            bundle.putString("TICKET_ID_KEY", str);
            aVar.setArguments(bundle);
            mo52426M1(aVar);
            return;
        }
        C24362h.m61217l("ticketId");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = "ViewModelProvider(requir…:class.java\n            )"
            java.lang.Class<vo.i> r2 = p871vo.C20193i.class
            java.lang.String r3 = "Cannot load ticket screen without ticket screen configuration"
            java.lang.String r4 = "TICKET_SCREEN_CONFIGURATION_KEY"
            java.lang.String r5 = "Cannot load ticket screen without ticket id"
            java.lang.String r6 = "TICKET_ID_KEY"
            java.lang.String r7 = "Cannot load ticket screen with null bundle."
            java.lang.String r8 = "ticketId"
            super.onCreate(r21)     // Catch:{ MissingSDKException -> 0x0128 }
            android.os.Bundle r10 = r20.getArguments()     // Catch:{ MissingSDKException -> 0x0128 }
            if (r10 == 0) goto L_0x0142
            java.lang.String r11 = r10.getString(r6)     // Catch:{ MissingSDKException -> 0x0128 }
            if (r11 == 0) goto L_0x013a
            r0.f51195e = r11     // Catch:{ MissingSDKException -> 0x0128 }
            android.os.Parcelable r10 = r10.getParcelable(r4)     // Catch:{ MissingSDKException -> 0x0128 }
            com.masabi.justride.sdk.ui.features.universalticket.UniversalTicketScreenConfiguration r10 = (com.masabi.justride.sdk.p415ui.features.universalticket.UniversalTicketScreenConfiguration) r10     // Catch:{ MissingSDKException -> 0x0128 }
            if (r10 == 0) goto L_0x0132
            r0.f51196f = r10     // Catch:{ MissingSDKException -> 0x0128 }
            ki.b r10 = r0.f45307b     // Catch:{ MissingSDKException -> 0x0128 }
            s6.c r10 = r10.f46180j     // Catch:{ MissingSDKException -> 0x0128 }
            java.lang.Class<vo.g$a> r11 = p871vo.C20190g.C20191a.class
            ho.b r10 = r10.mo22587a(r11)     // Catch:{ MissingSDKException -> 0x0128 }
            vo.g$a r10 = (p871vo.C20190g.C20191a) r10     // Catch:{ MissingSDKException -> 0x0128 }
            com.masabi.justride.sdk.ui.features.universalticket.UniversalTicketScreenConfiguration r15 = r0.f51196f     // Catch:{ MissingSDKException -> 0x0128 }
            java.lang.String r11 = "ticketScreenConfiguration"
            if (r15 == 0) goto L_0x012b
            java.lang.String r14 = r0.f51195e     // Catch:{ MissingSDKException -> 0x0128 }
            if (r14 == 0) goto L_0x0121
            vo.g r13 = new vo.g     // Catch:{ MissingSDKException -> 0x0128 }
            an.a$a r12 = r10.f51221a     // Catch:{ MissingSDKException -> 0x0128 }
            tm.i r11 = r10.f51222b     // Catch:{ MissingSDKException -> 0x0128 }
            al.a r9 = r10.f51223c     // Catch:{ MissingSDKException -> 0x0128 }
            r16 = r11
            om.g r11 = r10.f51224d     // Catch:{ MissingSDKException -> 0x0128 }
            go.c r11 = r11.f47832e     // Catch:{ MissingSDKException -> 0x0128 }
            r17 = r11
            mo.h r17 = (p658mo.C18414h) r17     // Catch:{ MissingSDKException -> 0x0128 }
            java.lang.String r10 = r10.f51225e     // Catch:{ MissingSDKException -> 0x0128 }
            r11 = r13
            r19 = r4
            r4 = r13
            r13 = r16
            r18 = r14
            r14 = r9
            r9 = r15
            r15 = r17
            r16 = r10
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ MissingSDKException -> 0x014a }
            r0.f51193c = r4     // Catch:{ MissingSDKException -> 0x014a }
            vo.h r9 = new vo.h     // Catch:{ MissingSDKException -> 0x014a }
            com.masabi.justride.sdk.ui.features.universalticket.UniversalTicketScreenConfiguration r10 = r4.f51219e     // Catch:{ MissingSDKException -> 0x014a }
            ki.b r11 = r0.f45307b     // Catch:{ MissingSDKException -> 0x014a }
            z2.f r11 = r11.f46179i     // Catch:{ MissingSDKException -> 0x014a }
            java.lang.String r4 = r4.f51218d     // Catch:{ MissingSDKException -> 0x014a }
            r9.<init>(r10, r11, r4)     // Catch:{ MissingSDKException -> 0x014a }
            androidx.lifecycle.n0 r4 = new androidx.lifecycle.n0     // Catch:{ MissingSDKException -> 0x014a }
            androidx.fragment.app.FragmentActivity r10 = r20.requireActivity()     // Catch:{ MissingSDKException -> 0x014a }
            r4.<init>((androidx.lifecycle.C1037q0) r10, (androidx.lifecycle.C1026n0.C1028b) r9)     // Catch:{ MissingSDKException -> 0x014a }
            java.lang.String r9 = r0.f51195e     // Catch:{ MissingSDKException -> 0x014a }
            if (r9 == 0) goto L_0x011c
            androidx.lifecycle.k0 r4 = r4.mo4314b(r2, r9)     // Catch:{ MissingSDKException -> 0x014a }
            mf0.C24362h.m61210e(r4, r1)     // Catch:{ MissingSDKException -> 0x014a }
            vo.i r4 = (p871vo.C20193i) r4     // Catch:{ MissingSDKException -> 0x014a }
            r0.f51194d = r4     // Catch:{ MissingSDKException -> 0x014a }
            z2.f r4 = r4.f51231d     // Catch:{ MissingSDKException -> 0x014a }
            java.lang.Class<vn.k> r9 = p870vn.C20171k.class
            vo.e$c r10 = new vo.e$c     // Catch:{ MissingSDKException -> 0x014a }
            r10.<init>(r0)     // Catch:{ MissingSDKException -> 0x014a }
            g1.d r4 = r4.mo23651b(r9, r10)     // Catch:{ MissingSDKException -> 0x014a }
            r0.f51197g = r4     // Catch:{ MissingSDKException -> 0x014a }
            vo.i r4 = r0.f51194d     // Catch:{ MissingSDKException -> 0x014a }
            java.lang.String r9 = "viewModel"
            if (r4 == 0) goto L_0x0117
            z2.f r4 = r4.f51231d     // Catch:{ MissingSDKException -> 0x014a }
            java.lang.Class<vn.g> r10 = p870vn.C20167g.class
            vo.e$d r11 = new vo.e$d     // Catch:{ MissingSDKException -> 0x014a }
            r11.<init>(r0)     // Catch:{ MissingSDKException -> 0x014a }
            g1.d r4 = r4.mo23651b(r10, r11)     // Catch:{ MissingSDKException -> 0x014a }
            r0.f51198h = r4     // Catch:{ MissingSDKException -> 0x014a }
            vo.i r4 = r0.f51194d     // Catch:{ MissingSDKException -> 0x014a }
            if (r4 == 0) goto L_0x0112
            z2.f r4 = r4.f51231d     // Catch:{ MissingSDKException -> 0x014a }
            java.lang.Class<vn.h> r10 = p870vn.C20168h.class
            vo.e$e r11 = new vo.e$e     // Catch:{ MissingSDKException -> 0x014a }
            r11.<init>(r0)     // Catch:{ MissingSDKException -> 0x014a }
            g1.d r4 = r4.mo23651b(r10, r11)     // Catch:{ MissingSDKException -> 0x014a }
            r0.f51199i = r4     // Catch:{ MissingSDKException -> 0x014a }
            vo.i r4 = r0.f51194d     // Catch:{ MissingSDKException -> 0x014a }
            if (r4 == 0) goto L_0x010d
            z2.f r4 = r4.f51231d     // Catch:{ MissingSDKException -> 0x014a }
            java.lang.Class<vn.b> r10 = p870vn.C20162b.class
            vo.e$f r11 = new vo.e$f     // Catch:{ MissingSDKException -> 0x014a }
            r11.<init>(r0)     // Catch:{ MissingSDKException -> 0x014a }
            g1.d r4 = r4.mo23651b(r10, r11)     // Catch:{ MissingSDKException -> 0x014a }
            r0.f51200j = r4     // Catch:{ MissingSDKException -> 0x014a }
            vo.i r4 = r0.f51194d     // Catch:{ MissingSDKException -> 0x014a }
            if (r4 == 0) goto L_0x0108
            z2.f r4 = r4.f51231d     // Catch:{ MissingSDKException -> 0x014a }
            java.lang.Class<vn.j> r10 = p870vn.C20170j.class
            vo.e$g r11 = new vo.e$g     // Catch:{ MissingSDKException -> 0x014a }
            r11.<init>(r0)     // Catch:{ MissingSDKException -> 0x014a }
            g1.d r4 = r4.mo23651b(r10, r11)     // Catch:{ MissingSDKException -> 0x014a }
            r0.f51201k = r4     // Catch:{ MissingSDKException -> 0x014a }
            vo.i r4 = r0.f51194d     // Catch:{ MissingSDKException -> 0x014a }
            if (r4 == 0) goto L_0x0103
            z2.f r4 = r4.f51231d     // Catch:{ MissingSDKException -> 0x014a }
            java.lang.Class<vn.l> r9 = p870vn.C20172l.class
            vo.e$h r10 = new vo.e$h     // Catch:{ MissingSDKException -> 0x014a }
            r10.<init>(r0)     // Catch:{ MissingSDKException -> 0x014a }
            g1.d r4 = r4.mo23651b(r9, r10)     // Catch:{ MissingSDKException -> 0x014a }
            r0.f51202l = r4     // Catch:{ MissingSDKException -> 0x014a }
            goto L_0x018e
        L_0x0103:
            mf0.C24362h.m61217l(r9)     // Catch:{ MissingSDKException -> 0x014a }
            r4 = 0
            throw r4     // Catch:{ MissingSDKException -> 0x014a }
        L_0x0108:
            mf0.C24362h.m61217l(r9)     // Catch:{ MissingSDKException -> 0x014a }
            r4 = 0
            throw r4     // Catch:{ MissingSDKException -> 0x014a }
        L_0x010d:
            mf0.C24362h.m61217l(r9)     // Catch:{ MissingSDKException -> 0x014a }
            r4 = 0
            throw r4     // Catch:{ MissingSDKException -> 0x014a }
        L_0x0112:
            mf0.C24362h.m61217l(r9)     // Catch:{ MissingSDKException -> 0x014a }
            r4 = 0
            throw r4     // Catch:{ MissingSDKException -> 0x014a }
        L_0x0117:
            mf0.C24362h.m61217l(r9)     // Catch:{ MissingSDKException -> 0x014a }
            r4 = 0
            throw r4     // Catch:{ MissingSDKException -> 0x014a }
        L_0x011c:
            mf0.C24362h.m61217l(r8)     // Catch:{ MissingSDKException -> 0x014a }
            r4 = 0
            throw r4     // Catch:{ MissingSDKException -> 0x014a }
        L_0x0121:
            r19 = r4
            mf0.C24362h.m61217l(r8)     // Catch:{ MissingSDKException -> 0x014a }
            r4 = 0
            throw r4     // Catch:{ MissingSDKException -> 0x014a }
        L_0x0128:
            r19 = r4
            goto L_0x014a
        L_0x012b:
            r19 = r4
            mf0.C24362h.m61217l(r11)     // Catch:{ MissingSDKException -> 0x014a }
            r4 = 0
            throw r4     // Catch:{ MissingSDKException -> 0x014a }
        L_0x0132:
            r19 = r4
            com.masabi.justride.sdk.exception.MissingArgumentException r4 = new com.masabi.justride.sdk.exception.MissingArgumentException     // Catch:{ MissingSDKException -> 0x014a }
            r4.<init>(r3)     // Catch:{ MissingSDKException -> 0x014a }
            throw r4     // Catch:{ MissingSDKException -> 0x014a }
        L_0x013a:
            r19 = r4
            com.masabi.justride.sdk.exception.MissingArgumentException r4 = new com.masabi.justride.sdk.exception.MissingArgumentException     // Catch:{ MissingSDKException -> 0x014a }
            r4.<init>(r5)     // Catch:{ MissingSDKException -> 0x014a }
            throw r4     // Catch:{ MissingSDKException -> 0x014a }
        L_0x0142:
            r19 = r4
            com.masabi.justride.sdk.exception.MissingArgumentException r4 = new com.masabi.justride.sdk.exception.MissingArgumentException     // Catch:{ MissingSDKException -> 0x014a }
            r4.<init>(r7)     // Catch:{ MissingSDKException -> 0x014a }
            throw r4     // Catch:{ MissingSDKException -> 0x014a }
        L_0x014a:
            android.os.Bundle r4 = r20.getArguments()
            if (r4 == 0) goto L_0x01a0
            java.lang.String r6 = r4.getString(r6)
            if (r6 == 0) goto L_0x019a
            r0.f51195e = r6
            r5 = r19
            android.os.Parcelable r4 = r4.getParcelable(r5)
            com.masabi.justride.sdk.ui.features.universalticket.UniversalTicketScreenConfiguration r4 = (com.masabi.justride.sdk.p415ui.features.universalticket.UniversalTicketScreenConfiguration) r4
            if (r4 == 0) goto L_0x0194
            r0.f51196f = r4
            vo.h r3 = new vo.h
            z2.f r5 = new z2.f
            vn.d r6 = new vn.d
            r6.<init>()
            r5.<init>((java.lang.Object) r6)
            java.lang.String r6 = ""
            r3.<init>(r4, r5, r6)
            androidx.lifecycle.n0 r4 = new androidx.lifecycle.n0
            androidx.fragment.app.FragmentActivity r5 = r20.requireActivity()
            r4.<init>((androidx.lifecycle.C1037q0) r5, (androidx.lifecycle.C1026n0.C1028b) r3)
            java.lang.String r3 = r0.f51195e
            if (r3 == 0) goto L_0x018f
            androidx.lifecycle.k0 r2 = r4.mo4314b(r2, r3)
            mf0.C24362h.m61210e(r2, r1)
            vo.i r2 = (p871vo.C20193i) r2
            r0.f51194d = r2
        L_0x018e:
            return
        L_0x018f:
            mf0.C24362h.m61217l(r8)
            r1 = 0
            throw r1
        L_0x0194:
            com.masabi.justride.sdk.exception.MissingArgumentException r1 = new com.masabi.justride.sdk.exception.MissingArgumentException
            r1.<init>(r3)
            throw r1
        L_0x019a:
            com.masabi.justride.sdk.exception.MissingArgumentException r1 = new com.masabi.justride.sdk.exception.MissingArgumentException
            r1.<init>(r5)
            throw r1
        L_0x01a0:
            com.masabi.justride.sdk.exception.MissingArgumentException r1 = new com.masabi.justride.sdk.exception.MissingArgumentException
            r1.<init>(r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p871vo.C20178e.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(C18063q.fragment_universal_ticket, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f51193c != null) {
            C4745d dVar = this.f51197g;
            if (dVar != null) {
                dVar.mo20255b();
                C4745d dVar2 = this.f51198h;
                if (dVar2 != null) {
                    dVar2.mo20255b();
                    C4745d dVar3 = this.f51199i;
                    if (dVar3 != null) {
                        dVar3.mo20255b();
                        C4745d dVar4 = this.f51200j;
                        if (dVar4 != null) {
                            dVar4.mo20255b();
                            C4745d dVar5 = this.f51201k;
                            if (dVar5 != null) {
                                dVar5.mo20255b();
                                C4745d dVar6 = this.f51202l;
                                if (dVar6 != null) {
                                    dVar6.mo20255b();
                                    C20190g gVar = this.f51193c;
                                    if (gVar != null) {
                                        gVar.f51217c.mo40392c(this.f51203m);
                                        C20190g gVar2 = this.f51193c;
                                        if (gVar2 != null) {
                                            gVar2.f51217c.mo40392c(this.f51204n);
                                        } else {
                                            C24362h.m61217l("presenter");
                                            throw null;
                                        }
                                    } else {
                                        C24362h.m61217l("presenter");
                                        throw null;
                                    }
                                } else {
                                    C24362h.m61217l("walletSyncEventSubscription");
                                    throw null;
                                }
                            } else {
                                C24362h.m61217l("sessionExpiredEventSubscription");
                                throw null;
                            }
                        } else {
                            C24362h.m61217l("deviceBlockedEventSubscription");
                            throw null;
                        }
                    } else {
                        C24362h.m61217l("logoutEventSubscription");
                        throw null;
                    }
                } else {
                    C24362h.m61217l("loginEventSubscription");
                    throw null;
                }
            } else {
                C24362h.m61217l("ticketFaceBundleUpdatedEventSubscription");
                throw null;
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        if (this.f51193c == null) {
            mo52425L1(9);
            return;
        }
        if (getChildFragmentManager().mo3983z(C18061o.ticketFragmentContainer) == null) {
            mo52427N1();
        }
        mo52424K1();
    }
}
