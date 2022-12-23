package p775ro;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.format.DateUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import com.masabi.justride.sdk.jobs.ticket.get.TicketSummaryBuilderException;
import com.masabi.justride.sdk.p415ui.features.ticket.ValidationMode;
import com.masabi.justride.sdk.p415ui.features.ticket.VisualValidationView;
import com.masabi.justride.sdk.platform.jobs.CallBackOn;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p304x.C7082o;
import p364al.C13480a;
import p364al.C13487h;
import p366an.C13493a;
import p445do.C16690b;
import p492fn.C17040a;
import p492fn.C17043c;
import p565io.C17626c;
import p583jk.C17880m;
import p587jo.C17903b;
import p605ki.C18066t;
import p611ko.C18109a;
import p611ko.C18110b;
import p611ko.C18111c;
import p658mo.C18411e;
import p702ok.C18777c;
import p704om.C18791g;
import p750ql.C19139e;
import p752qn.C19148f;
import p752qn.C19151i;
import p775ro.C19297d;
import p821tm.C19702g;
import p821tm.C19714r;
import p891wk.C20344a;
import p891wk.C20345a0;
import p891wk.C20346b;
import p891wk.C20359n;
import p891wk.C20362q;
import p893wm.C20374a;
import p893wm.C20375b;
import p940ym.C20745a;

/* renamed from: ro.j */
public final class C19305j extends C17903b<C19297d> {

    /* renamed from: A */
    public boolean f49103A;

    /* renamed from: B */
    public SimpleDateFormat f49104B;

    /* renamed from: C */
    public SimpleDateFormat f49105C;

    /* renamed from: D */
    public boolean f49106D;

    /* renamed from: E */
    public boolean f49107E;

    /* renamed from: F */
    public boolean f49108F;

    /* renamed from: G */
    public boolean f49109G;

    /* renamed from: H */
    public long f49110H;

    /* renamed from: b */
    public final C18791g f49111b;

    /* renamed from: c */
    public final C18111c f49112c;

    /* renamed from: d */
    public final C18110b f49113d;

    /* renamed from: e */
    public final C13480a f49114e;

    /* renamed from: f */
    public final C19702g.C19703a f49115f;

    /* renamed from: g */
    public final C20374a f49116g;

    /* renamed from: h */
    public final C20375b f49117h;

    /* renamed from: i */
    public final C13493a.C13494a f49118i;

    /* renamed from: j */
    public final C17040a.C17041a f49119j;

    /* renamed from: k */
    public final C16690b f49120k;

    /* renamed from: l */
    public final C19139e.C19140a f49121l;

    /* renamed from: m */
    public final C19294a f49122m;

    /* renamed from: n */
    public final C20745a f49123n;

    /* renamed from: o */
    public final C18109a f49124o;

    /* renamed from: p */
    public final DateFormat f49125p = DateFormat.getDateTimeInstance(3, 3);

    /* renamed from: q */
    public final DateFormat f49126q = DateFormat.getTimeInstance(3);

    /* renamed from: r */
    public final DateFormat f49127r = DateFormat.getDateInstance(2);

    /* renamed from: s */
    public final C19307b f49128s = new C19307b(this);

    /* renamed from: t */
    public final C19301f f49129t = new C19301f(this);

    /* renamed from: u */
    public final C19302g f49130u = new C19302g(this);

    /* renamed from: v */
    public final C19303h f49131v = new C19303h(this);

    /* renamed from: w */
    public String f49132w;

    /* renamed from: x */
    public C20362q f49133x;

    /* renamed from: y */
    public C17043c f49134y;

    /* renamed from: z */
    public ValidationMode f49135z;

    /* renamed from: ro.j$a */
    public static class C19306a extends C17903b.C17904a<C19297d, C19305j> {

        /* renamed from: a */
        public final C18791g f49136a;

        /* renamed from: b */
        public final C18111c f49137b;

        /* renamed from: c */
        public final C18110b f49138c;

        /* renamed from: d */
        public final C13480a f49139d;

        /* renamed from: e */
        public final C19702g.C19703a f49140e;

        /* renamed from: f */
        public final C20745a f49141f;

        /* renamed from: g */
        public final C20374a f49142g;

        /* renamed from: h */
        public final C20375b f49143h;

        /* renamed from: i */
        public final C13493a.C13494a f49144i;

        /* renamed from: j */
        public final C17040a.C17041a f49145j;

        /* renamed from: k */
        public final C16690b f49146k;

        /* renamed from: l */
        public final C19139e.C19140a f49147l;

        /* renamed from: m */
        public final C19294a f49148m;

        /* renamed from: n */
        public final C18109a f49149n;

        /* renamed from: o */
        public final C19714r f49150o;

        public C19306a(C18791g gVar, C18111c cVar, C18110b bVar, C13480a aVar, C19702g.C19703a aVar2, C20745a aVar3, C20374a aVar4, C20375b bVar2, C13493a.C13494a aVar5, C17040a.C17041a aVar6, C16690b bVar3, C19139e.C19140a aVar7, C19294a aVar8, C18109a aVar9, C19714r rVar) {
            this.f49136a = gVar;
            this.f49137b = cVar;
            this.f49138c = bVar;
            this.f49139d = aVar;
            this.f49140e = aVar2;
            this.f49141f = aVar3;
            this.f49142g = aVar4;
            this.f49143h = bVar2;
            this.f49144i = aVar5;
            this.f49145j = aVar6;
            this.f49146k = bVar3;
            this.f49147l = aVar7;
            this.f49148m = aVar8;
            this.f49149n = aVar9;
            this.f49150o = rVar;
        }

        /* renamed from: a */
        public final C17903b mo50459a(C17626c cVar) {
            return new C19305j((C19297d) cVar, this.f49136a, this.f49137b, this.f49138c, this.f49139d, this.f49140e, this.f49142g, this.f49143h, this.f49144i, this.f49145j, this.f49146k, this.f49147l, this.f49148m, this.f49141f, this.f49149n, this.f49150o);
        }
    }

    /* renamed from: ro.j$b */
    public static class C19307b extends Handler {

        /* renamed from: a */
        public final WeakReference<C19305j> f49151a;

        public C19307b(C19305j jVar) {
            super(Looper.getMainLooper());
            this.f49151a = new WeakReference<>(jVar);
        }

        public final void handleMessage(Message message) {
            String str;
            C19305j jVar = this.f49151a.get();
            if (jVar != null && ((C19297d) jVar.f45943a).isAdded()) {
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2 && jVar.f49109G) {
                            TicketState a = jVar.f49116g.mo52603a(jVar.f49133x);
                            boolean i2 = jVar.mo51729i();
                            if (!a.equals(jVar.f49133x.f51582D)) {
                                C13480a aVar = jVar.f49114e;
                                C19702g.C19703a aVar2 = jVar.f49115f;
                                String str2 = jVar.f49132w;
                                aVar.mo40390a(new C19702g(aVar2.f50032a, aVar2.f50033b.mo40405a(str2), str2), CallBackOn.MAIN_THREAD, jVar.f49129t);
                            } else if (i2 != jVar.f49103A) {
                                C20362q qVar = jVar.f49133x;
                                qVar.f51582D = a;
                                jVar.mo51731k(qVar);
                            } else {
                                C19297d dVar = (C19297d) jVar.f45943a;
                                TextView textView = dVar.f49068I;
                                C19305j jVar2 = (C19305j) dVar.f45311c;
                                C19151i f = jVar2.mo51726f();
                                if (f == null || !f.f48739f) {
                                    str = "";
                                } else {
                                    str = jVar2.mo51727g(f);
                                }
                                textView.setText(str);
                            }
                            jVar.f49103A = i2;
                            sendEmptyMessageDelayed(2, 1000);
                        }
                    } else if (jVar.f49107E) {
                        jVar.mo51733m();
                        sendEmptyMessageDelayed(1, jVar.f49110H);
                    }
                } else if (jVar.f49108F) {
                    jVar.mo51734n();
                    sendEmptyMessageDelayed(0, 1000);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19305j(C19297d dVar, C18791g gVar, C18111c cVar, C18110b bVar, C13480a aVar, C19702g.C19703a aVar2, C20374a aVar3, C20375b bVar2, C13493a.C13494a aVar4, C17040a.C17041a aVar5, C16690b bVar3, C19139e.C19140a aVar6, C19294a aVar7, C20745a aVar8, C18109a aVar9, C19714r rVar) {
        super(dVar);
        this.f49111b = gVar;
        this.f49112c = cVar;
        this.f49113d = bVar;
        this.f49114e = aVar;
        this.f49115f = aVar2;
        this.f49116g = aVar3;
        this.f49117h = bVar2;
        this.f49118i = aVar4;
        this.f49119j = aVar5;
        this.f49120k = bVar3;
        this.f49121l = aVar6;
        this.f49122m = aVar7;
        this.f49123n = aVar8;
        this.f49124o = aVar9;
    }

    /* renamed from: a */
    public final void mo50455a(Bundle bundle) {
        if (bundle == null) {
            bundle = ((C19297d) this.f45943a).getArguments();
        }
        if (bundle == null) {
            throw new JustRideSdkException("Cannot load Ticket screen with null bundle.");
        } else if (bundle.containsKey("KEY_TICKET_ID")) {
            this.f49132w = bundle.getString("KEY_TICKET_ID");
            if (bundle.containsKey("KEY_VALIDATION_MODE")) {
                this.f49135z = ValidationMode.valueOf(bundle.getString("KEY_VALIDATION_MODE"));
                if (bundle.containsKey("KEY_VISIBLE")) {
                    this.f49106D = bundle.getBoolean("KEY_VISIBLE");
                    return;
                }
                throw new JustRideSdkException("Cannot load Ticket screen without \"visible\" value.");
            }
            throw new JustRideSdkException("Cannot load Ticket screen without \"validation mode\" value.");
        } else {
            throw new JustRideSdkException("Cannot load Ticket screen without \"ticket ID\" value.");
        }
    }

    /* renamed from: b */
    public final void mo50456b() {
        Window window = ((C19297d) this.f45943a).getActivity().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = -1.0f;
            window.setAttributes(attributes);
        }
        this.f49114e.mo40392c(this.f49130u);
        this.f49114e.mo40392c(this.f49131v);
        this.f49114e.mo40392c(this.f49129t);
        this.f49109G = false;
        this.f49128s.removeMessages(2);
        this.f49107E = false;
        this.f49128s.removeMessages(1);
        this.f49108F = false;
        VisualValidationView visualValidationView = ((C19297d) this.f45943a).f49087s;
        ObjectAnimator objectAnimator = visualValidationView.f37202e;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
        ObjectAnimator objectAnimator2 = visualValidationView.f37203f;
        if (objectAnimator2 != null) {
            objectAnimator2.pause();
        }
        this.f49128s.removeMessages(0);
    }

    /* renamed from: c */
    public final void mo50457c() {
        Window window = ((C19297d) this.f45943a).getActivity().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = 1.0f;
            window.setAttributes(attributes);
        }
        mo51730j();
    }

    /* renamed from: d */
    public final void mo50458d(Bundle bundle) {
        bundle.putString("KEY_TICKET_ID", this.f49132w);
        bundle.putString("KEY_VALIDATION_MODE", this.f49135z.name());
        bundle.putBoolean("KEY_VISIBLE", this.f49106D);
    }

    /* renamed from: e */
    public final C18411e mo51725e() {
        return (C18411e) this.f49111b.f47829b;
    }

    /* renamed from: f */
    public final C19151i mo51726f() {
        C13487h<C19151i> a = this.f49123n.mo52890a(this.f49133x);
        if (a.mo40399a()) {
            return null;
        }
        return (C19151i) a.f33365a;
    }

    /* renamed from: g */
    public final String mo51727g(C19151i iVar) {
        if (DateUtils.isToday(iVar.f48737d.getTime())) {
            return ((C19297d) this.f45943a).getString(C18066t.f46201xd6941ad2, this.f49126q.format(iVar.f48737d));
        }
        return ((C19297d) this.f45943a).getString(C18066t.f46200x9502077b, this.f49127r.format(iVar.f48737d));
    }

    /* renamed from: h */
    public final boolean mo51728h() {
        boolean z;
        C20344a aVar = this.f49133x.f51608n;
        if (aVar != null && aVar.f51506a != null) {
            return true;
        }
        C19151i f = mo51726f();
        if (f == null || (!f.f48738e && !f.f48739f)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo51729i() {
        Long l;
        Long l2 = mo51725e().f46935F;
        C20375b bVar = this.f49117h;
        C20344a aVar = this.f49133x.f51608n;
        long longValue = l2.longValue();
        bVar.getClass();
        Long l3 = aVar.f51509d;
        if (l3 == null || (l = aVar.f51511f) == null) {
            return false;
        }
        return bVar.mo52604a(longValue, l3, aVar.f51508c, l);
    }

    /* renamed from: j */
    public final void mo51730j() {
        if (this.f49132w == null) {
            C19297d dVar = (C19297d) this.f45943a;
            dVar.f49065F.setVisibility(8);
            dVar.f49074f.setVisibility(8);
            dVar.f49077i.setVisibility(0);
            dVar.f49080l.setVisibility(8);
            return;
        }
        C19297d dVar2 = (C19297d) this.f45943a;
        dVar2.f49065F.setVisibility(8);
        dVar2.f49074f.setVisibility(0);
        dVar2.f49077i.setVisibility(8);
        dVar2.f49080l.setVisibility(8);
        C13480a aVar = this.f49114e;
        C19702g.C19703a aVar2 = this.f49115f;
        String str = this.f49132w;
        aVar.mo40390a(new C19702g(aVar2.f50032a, aVar2.f50033b.mo40405a(str), str), CallBackOn.MAIN_THREAD, this.f49129t);
    }

    /* renamed from: k */
    public final void mo51731k(C20362q qVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        boolean z;
        String str15;
        Integer num;
        Long l;
        Long l2;
        this.f49133x = qVar;
        C13487h<C17043c> C = new C17040a(qVar, this.f49119j.f44181a).mo40394C();
        if (C.mo40399a()) {
            this.f49134y = null;
        } else {
            this.f49134y = (C17043c) C.f33365a;
        }
        ValidationMode validationMode = this.f49135z;
        if (validationMode == null || validationMode == ValidationMode.UNDEFINED) {
            if ("BARCODE".equals(this.f49133x.f51602h)) {
                this.f49135z = ValidationMode.BARCODE;
            } else {
                this.f49135z = ValidationMode.VISUAL_VALIDATOR;
            }
        }
        String str16 = (String) mo51725e().f46954t.f5106c;
        C20362q qVar2 = this.f49133x;
        String str17 = (String) mo51725e().f46954t.f5105b;
        C19294a aVar = this.f49122m;
        DateFormat dateFormat = this.f49125p;
        C17880m mVar = aVar.f49054a;
        HashMap hashMap = new HashMap();
        String str18 = qVar2.f51613s;
        String str19 = "";
        if (str18 == null) {
            str18 = str19;
        }
        hashMap.put("{{fareType}}", str18);
        String str20 = qVar2.f51612r;
        if (str20 == null) {
            str20 = str19;
        }
        hashMap.put("{{productName}}", str20);
        String str21 = qVar2.f51581C;
        if (str21 == null) {
            str21 = str19;
        }
        hashMap.put("{{eTicketNumber}}", str21);
        C20345a0 a0Var = qVar2.f51606l;
        if (a0Var == null || (l2 = a0Var.f51514a) == null) {
            str = str19;
        } else {
            str = dateFormat.format(new Date(l2.longValue()));
        }
        hashMap.put("{{validFrom}}", str);
        C20345a0 a0Var2 = qVar2.f51606l;
        if (a0Var2 == null || (l = a0Var2.f51515b) == null) {
            str2 = str19;
        } else {
            str2 = dateFormat.format(new Date(l.longValue()));
        }
        hashMap.put("{{validTo}}", str2);
        C19148f fVar = qVar2.f51611q;
        mVar.getClass();
        hashMap.put("{{price}}", C17880m.m44327a(fVar));
        C20346b bVar = qVar2.f51596b;
        if (bVar == null || (str3 = bVar.f51517b) == null) {
            str3 = str19;
        }
        hashMap.put("{{compositeFareType}}", str3);
        C20344a aVar2 = qVar2.f51608n;
        if (aVar2 == null || (num = aVar2.f51512g) == null) {
            str4 = str19;
        } else {
            str4 = num.toString();
        }
        hashMap.put("{{maxActivations}}", str4);
        C20359n nVar = qVar2.f51607m;
        if (nVar != null) {
            C18777c cVar = nVar.f51569c;
            str10 = cVar.f47793b;
            str9 = cVar.f47794c;
            str11 = cVar.f47796e;
            C18777c cVar2 = nVar.f51570d;
            str7 = cVar2.f47793b;
            str6 = cVar2.f47794c;
            str8 = cVar2.f47796e;
            List<C18777c> list = nVar.f51572f;
            if (list == null || list.size() < 1) {
                str5 = str19;
                str12 = str5;
            } else {
                C18777c cVar3 = qVar2.f51607m.f51572f.get(0);
                str12 = cVar3.f47793b;
                str5 = cVar3.f47794c;
            }
        } else {
            str5 = str19;
            str12 = str5;
            str11 = str12;
            str10 = str11;
            str9 = str10;
            str8 = str9;
            str7 = str8;
            str6 = str7;
        }
        hashMap.put("{{originStation}}", str10);
        hashMap.put("{{originStationShort}}", str9);
        hashMap.put("{{originZone}}", str11);
        hashMap.put("{{destinationStation}}", str7);
        hashMap.put("{{destinationStationShort}}", str6);
        hashMap.put("{{destinationZone}}", str8);
        hashMap.put("{{viaStation}}", str12);
        hashMap.put("{{viaStationShort}}", str5);
        StringBuilder sb = new StringBuilder(str17);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str22 = (String) entry.getKey();
            String str23 = (String) entry.getValue();
            for (int indexOf = sb.indexOf(str22, 0); indexOf > -1; indexOf = sb.indexOf(str22, str23.length() + indexOf)) {
                sb.replace(indexOf, str22.length() + indexOf, str23);
            }
        }
        ((C19297d) this.f45943a).f49060A.loadDataWithBaseURL(str16, sb.toString(), "text/html", (String) null, (String) null);
        C19297d dVar = (C19297d) this.f45943a;
        C20362q qVar3 = this.f49133x;
        dVar.f49074f.setVisibility(8);
        dVar.f49077i.setVisibility(8);
        dVar.f49080l.setVisibility(0);
        try {
            ((C19305j) dVar.f45311c).mo51725e().getClass();
            dVar.f49061B.setVisibility(8);
            dVar.mo51718N1();
        } catch (TicketSummaryBuilderException unused) {
            Toast.makeText(dVar.getActivity(), C18066t.com_masabi_justride_sdk_get_ticket_face_error, 1).show();
        }
        C19295b bVar2 = dVar.f49072M;
        if (bVar2 != null) {
            bVar2.mo44434y0(qVar3.f51612r);
        }
        TicketState ticketState = qVar3.f51582D;
        int[] iArr = C19297d.C19298a.f49095a;
        int i = iArr[ticketState.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            dVar.f49081m.setBackgroundColor(-1);
            dVar.f49082n.setTextColor(-16777216);
            dVar.f49083o.setTextColor(-16777216);
        } else {
            dVar.f49081m.setBackgroundColor(-16777216);
            dVar.f49082n.setTextColor(-1);
            dVar.f49083o.setTextColor(-1);
        }
        int i2 = iArr[qVar3.f51582D.ordinal()];
        if (i2 == 1) {
            Long l3 = qVar3.f51606l.f51514a;
            str13 = dVar.getString(C18066t.com_masabi_justride_sdk_ticket_status_before_valid_header);
            str14 = dVar.mo51719O1(l3, C18066t.com_masabi_justride_sdk_ticket_status_before_valid_sub_header);
        } else if (i2 == 2) {
            str13 = dVar.getString(C18066t.com_masabi_justride_sdk_ticket_status_live_header);
            str14 = dVar.getString(C18066t.com_masabi_justride_sdk_ticket_status_live_sub_header);
        } else if (i2 == 4) {
            Long l4 = qVar3.f51618x;
            str13 = dVar.getString(C18066t.com_masabi_justride_sdk_ticket_status_used_header);
            str14 = dVar.mo51719O1(l4, C18066t.com_masabi_justride_sdk_ticket_status_used_sub_header);
        } else if (i2 == 5) {
            Long l5 = qVar3.f51618x;
            str13 = dVar.getString(C18066t.com_masabi_justride_sdk_ticket_status_expired_header);
            str14 = dVar.mo51719O1(l5, C18066t.com_masabi_justride_sdk_ticket_status_expired_sub_header);
        } else if (i2 == 6) {
            Long l6 = qVar3.f51618x;
            str13 = dVar.getString(C18066t.com_masabi_justride_sdk_ticket_status_cancelled_header);
            str14 = dVar.mo51719O1(l6, C18066t.com_masabi_justride_sdk_ticket_status_cancelled_sub_header);
        } else if (i2 != 7) {
            str14 = str19;
            str13 = str14;
        } else {
            Long l7 = qVar3.f51618x;
            str13 = dVar.getString(C18066t.com_masabi_justride_sdk_ticket_status_refunded_header);
            str14 = dVar.mo51719O1(l7, C18066t.com_masabi_justride_sdk_ticket_status_refunded_sub_header);
        }
        dVar.f49082n.setText(str13);
        dVar.f49083o.setText(str14);
        dVar.f49094z.setText(C21100e.m49325T(qVar3.f51613s, qVar3.f51612r));
        if (C21100e.m49352m0(qVar3.f51587I)) {
            dVar.f49070K.setVisibility(8);
        } else {
            dVar.f49071L.setText(qVar3.f51587I);
            dVar.f49070K.setVisibility(0);
        }
        TicketState ticketState2 = qVar3.f51582D;
        C19151i f = ((C19305j) dVar.f45311c).mo51726f();
        if (f == null || !f.f48739f) {
            z = false;
        } else {
            z = true;
        }
        if (!z || ticketState2 != TicketState.LIVE) {
            dVar.f49067H.setVisibility(8);
        } else {
            TextView textView = dVar.f49068I;
            C19305j jVar = (C19305j) dVar.f45311c;
            C19151i f2 = jVar.mo51726f();
            if (f2 == null || !f2.f48739f) {
                str15 = str19;
            } else {
                str15 = jVar.mo51727g(f2);
            }
            textView.setText(str15);
            dVar.f49067H.setVisibility(0);
        }
        if (ticketState2.isLive()) {
            dVar.f49081m.setVisibility(0);
            dVar.f49084p.setVisibility(8);
            dVar.f49092x.setVisibility(0);
            dVar.f49092x.setEnabled(true);
            ((C19305j) dVar.f45311c).mo51725e().getClass();
            dVar.mo51715K1("#61D86C");
            dVar.mo51717M1(dVar.f49092x, ((C19305j) dVar.f45311c).mo51725e().f46936b);
            dVar.f49093y.setVisibility(8);
            dVar.f49065F.setVisibility(8);
        } else if (ticketState2.isActive()) {
            dVar.f49081m.setVisibility(8);
            dVar.f49084p.setVisibility(0);
            dVar.f49092x.setVisibility(8);
            dVar.f49065F.setVisibility(8);
            if (((C19305j) dVar.f45311c).mo51729i()) {
                dVar.f49093y.setVisibility(0);
                Long l8 = qVar3.f51608n.f51509d;
                if (l8 != null) {
                    String format = ((C19305j) dVar.f45311c).f49126q.format(new Date(l8.longValue()));
                    str19 = dVar.getString(C18066t.com_masabi_justride_sdk_ticket_activated_at, format);
                }
                dVar.f49093y.setText(str19);
            } else {
                dVar.f49093y.setVisibility(8);
            }
            int heightPixels = ((C19305j) dVar.f45311c).f49135z.getHeightPixels(dVar.getResources());
            ViewGroup.LayoutParams layoutParams = dVar.f49085q.getLayoutParams();
            layoutParams.height = heightPixels;
            dVar.f49085q.setLayoutParams(layoutParams);
            dVar.mo51720P1();
        } else if (ticketState2.isLiveUnusable()) {
            dVar.f49084p.setVisibility(8);
            dVar.f49092x.setVisibility(0);
            dVar.f49092x.setEnabled(false);
            dVar.f49092x.setTextColor(Color.parseColor("#767676"));
            dVar.mo51715K1("#D3D3D3");
            dVar.f49093y.setVisibility(8);
            dVar.f49081m.setVisibility(8);
            dVar.f49065F.setVisibility(0);
        } else {
            dVar.f49081m.setVisibility(0);
            dVar.f49084p.setVisibility(8);
            dVar.f49092x.setVisibility(8);
            dVar.f49093y.setVisibility(8);
            dVar.f49065F.setVisibility(8);
            dVar.f49065F.setVisibility(8);
        }
        if (this.f49106D) {
            mo51732l();
        }
    }

    /* renamed from: l */
    public final void mo51732l() {
        if (!this.f49109G) {
            this.f49109G = true;
            this.f49128s.sendEmptyMessageDelayed(2, 1000);
        }
        if (!this.f49133x.f51582D.isActive()) {
            return;
        }
        if (this.f49135z == ValidationMode.BARCODE) {
            if (!this.f49107E) {
                this.f49107E = true;
                this.f49128s.sendEmptyMessageDelayed(1, this.f49110H);
            }
            this.f49108F = false;
            VisualValidationView visualValidationView = ((C19297d) this.f45943a).f49087s;
            ObjectAnimator objectAnimator = visualValidationView.f37202e;
            if (objectAnimator != null) {
                objectAnimator.pause();
            }
            ObjectAnimator objectAnimator2 = visualValidationView.f37203f;
            if (objectAnimator2 != null) {
                objectAnimator2.pause();
            }
            this.f49128s.removeMessages(0);
            return;
        }
        this.f49107E = false;
        this.f49128s.removeMessages(1);
        if (!this.f49108F) {
            this.f49108F = true;
            VisualValidationView visualValidationView2 = ((C19297d) this.f45943a).f49087s;
            visualValidationView2.getClass();
            visualValidationView2.post(new C7082o(visualValidationView2, 11));
            this.f49128s.sendEmptyMessageDelayed(0, 1000);
        }
    }

    /* renamed from: m */
    public final void mo51733m() {
        C19139e.C19140a aVar = this.f49121l;
        this.f49114e.mo40390a(new C19304i(new C19139e(aVar.f48664a, aVar.f48665b, this.f49133x, mo51725e().f46944j, ValidationMode.BARCODE.getHeightPixels(((C19297d) this.f45943a).getResources()))), CallBackOn.MAIN_THREAD, this.f49131v);
    }

    /* renamed from: n */
    public final void mo51734n() {
        List list;
        float f;
        float f2;
        float f3;
        float f4;
        mo51725e().getClass();
        Integer num = 5;
        int intValue = num.intValue();
        Date date = new Date(this.f49120k.mo49402a());
        if (this.f49104B == null) {
            this.f49104B = new SimpleDateFormat(mo51725e().f46930A.getPattern());
        }
        SimpleDateFormat simpleDateFormat = this.f49104B;
        if (this.f49105C == null) {
            this.f49105C = new SimpleDateFormat(mo51725e().f46931B.getPattern());
        }
        SimpleDateFormat simpleDateFormat2 = this.f49105C;
        String format = simpleDateFormat.format(date);
        String format2 = simpleDateFormat2.format(date);
        if (format.isEmpty()) {
            format = format2;
        } else if (!format2.isEmpty()) {
            format = String.format("%s\n%s", new Object[]{format, format2});
        }
        C17043c cVar = this.f49134y;
        if (cVar == null) {
            list = Arrays.asList(new Integer[]{-16777216, -16777216, -16777216});
        } else {
            list = cVar.mo49647a();
        }
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C18110b bVar = this.f49113d;
            int intValue2 = ((Integer) list.get(i)).intValue();
            if (i == 0) {
                f = (float) intValue;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if (i == 2) {
                f2 = (float) intValue;
            } else {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            if (i == 2) {
                f3 = (float) intValue;
            } else {
                f3 = BitmapDescriptorFactory.HUE_RED;
            }
            if (i == 0) {
                f4 = (float) intValue;
            } else {
                f4 = BitmapDescriptorFactory.HUE_RED;
            }
            bVar.getClass();
            drawableArr[i] = C18110b.m44777c(bVar, intValue2, f, f2, f3, f4, 64);
        }
        ((C19297d) this.f45943a).f49087s.setDateTimeText(format);
        ((C19297d) this.f45943a).f49087s.setCellDrawables(drawableArr);
    }
}
