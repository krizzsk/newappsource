package p494fp;

import android.content.res.Resources;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import com.masabi.justride.sdk.p415ui.features.universalticket.main.UsagePeriodInfoException;
import java.text.DateFormat;
import java.util.Date;
import mf0.C24362h;
import p258t4.C6587a;
import p269u2.C6677a;
import p364al.C13487h;
import p445do.C16690b;
import p541ho.C17465b;
import p584jl.C17885a;
import p605ki.C18065s;
import p605ki.C18066t;
import p626lf.C18201b;
import p658mo.C18410d;
import p725pj.C18926a;
import p752qn.C19143a;
import p752qn.C19150h;
import p752qn.C19151i;
import p891wk.C20362q;
import p891wk.C20364s;
import p893wm.C20375b;
import p940ym.C20745a;

/* renamed from: fp.e */
public final class C17053e {

    /* renamed from: a */
    public final C6587a f44208a = new C6587a();

    /* renamed from: b */
    public final DateFormat f44209b = DateFormat.getDateTimeInstance(2, 3);

    /* renamed from: c */
    public final DateFormat f44210c = DateFormat.getTimeInstance(3);

    /* renamed from: d */
    public final C20375b f44211d;

    /* renamed from: e */
    public final C16690b f44212e;

    /* renamed from: f */
    public final C20364s f44213f;

    /* renamed from: g */
    public final Resources f44214g;

    /* renamed from: fp.e$a */
    public static final class C17054a implements C17465b {

        /* renamed from: a */
        public final C20375b f44215a;

        /* renamed from: b */
        public final C16690b f44216b;

        public C17054a(C20375b bVar, C16690b bVar2) {
            C24362h.m61211f(bVar, "isTicketRecentlyActivatedPredicate");
            C24362h.m61211f(bVar2, "currentTimeProvider");
            this.f44215a = bVar;
            this.f44216b = bVar2;
        }
    }

    public C17053e(C20375b bVar, C16690b bVar2, C20364s sVar, C18410d dVar, Resources resources) {
        C24362h.m61211f(bVar, "isTicketRecentlyActivatedPredicate");
        C24362h.m61211f(bVar2, "currentTimeProvider");
        C24362h.m61211f(sVar, "ticketDisplayBundle");
        this.f44211d = bVar;
        this.f44212e = bVar2;
        this.f44213f = sVar;
        this.f44214g = resources;
    }

    /* renamed from: a */
    public final C19151i mo49660a() throws UsagePeriodInfoException {
        C6677a aVar = this.f44213f.f51628f;
        C13487h<C19151i> a = ((C20745a) aVar.f20758b).mo52890a((C20362q) aVar.f20759c);
        if (!a.mo40399a()) {
            S s = a.f33365a;
            C24362h.m61208c(s);
            return (C19151i) s;
        }
        C18926a aVar2 = a.f33366b;
        C24362h.m61208c(aVar2);
        String b = aVar2.mo51439b();
        C24362h.m61210e(b, "usagePeriodInfoResult.fa…recursiveErrorDescription");
        throw new UsagePeriodInfoException(b);
    }

    /* renamed from: b */
    public final String mo49661b() {
        TicketState ticketState = this.f44213f.f51624b;
        C24362h.m61210e(ticketState, "ticketDisplayBundle.ticketState");
        if (ticketState.isLive()) {
            String string = this.f44214g.getString(C18066t.com_masabi_justride_sdk_ticket_warning_activate_before_boarding);
            C24362h.m61210e(string, "resources.getString(R.st…activate_before_boarding)");
            return string;
        }
        TicketState ticketState2 = this.f44213f.f51624b;
        C24362h.m61210e(ticketState2, "ticketDisplayBundle.ticketState");
        if (ticketState2.isBeforeValidityPeriod()) {
            String string2 = this.f44214g.getString(C18066t.com_masabi_justride_sdk_ticket_warning_valid_from_n, new Object[]{this.f44209b.format(C17885a.m44394D(mo49664e().f48718k))});
            C24362h.m61210e(string2, "resources.getString(\n   ….validFrom)\n            )");
            return string2;
        }
        String string3 = this.f44214g.getString(C18066t.com_masabi_justride_sdk_ticket_warning_unavailable_header_short);
        C24362h.m61210e(string3, "resources.getString(R.st…unavailable_header_short)");
        return string3;
    }

    /* renamed from: c */
    public final String mo49662c() throws UsagePeriodInfoException {
        C19151i a = mo49660a();
        if (a.f48738e) {
            return C18201b.m44920q(a, this.f44214g);
        }
        if (!a.f48739f) {
            return null;
        }
        String string = this.f44214g.getString(C18066t.f46200x9502077b, new Object[]{this.f44209b.format(a.f48737d)});
        C24362h.m61210e(string, "resources.getString(\n   …nfo.expiryDate)\n        )");
        return string;
    }

    /* renamed from: d */
    public final String mo49663d() {
        TicketDisplayConfiguration ticketDisplayConfiguration = this.f44213f.f51631i;
        C24362h.m61210e(ticketDisplayConfiguration, "ticketDisplayBundle.ticketDisplayConfiguration");
        String str = ticketDisplayConfiguration.f37092i;
        C24362h.m61210e(str, "ticketDisplayBundle.tick…onfiguration.layoutPreset");
        return str;
    }

    /* renamed from: e */
    public final C19150h mo49664e() {
        C19150h hVar = this.f44213f.f51623a;
        C24362h.m61210e(hVar, "ticketDisplayBundle.ticketDetails");
        return hVar;
    }

    /* renamed from: f */
    public final String mo49665f() throws UsagePeriodInfoException {
        C19151i a = mo49660a();
        if (!a.f48739f) {
            return null;
        }
        Date date = a.f48737d;
        C24362h.m61210e(date, "usagePeriodInfo.expiryDate");
        long time = date.getTime() - this.f44212e.mo49402a();
        this.f44208a.getClass();
        int i = (int) (time / 86400000);
        this.f44208a.getClass();
        int i2 = (int) ((time / 3600000) % 24);
        if (i > 0) {
            String quantityString = this.f44214g.getQuantityString(C18065s.com_masabi_justride_sdk_days, i, new Object[]{Integer.valueOf(i)});
            C24362h.m61210e(quantityString, "resources.getQuantityStr…aysLeft\n                )");
            String string = this.f44214g.getString(C18066t.com_masabi_justride_sdk_ticket_expires_in_n_days_or_hours, new Object[]{quantityString});
            C24362h.m61210e(string, "resources.getString(\n   …eftText\n                )");
            return string;
        } else if (i2 > 0) {
            String quantityString2 = this.f44214g.getQuantityString(C18065s.com_masabi_justride_sdk_hours, i2, new Object[]{Integer.valueOf(i2)});
            C24362h.m61210e(quantityString2, "resources.getQuantityStr…ursLeft\n                )");
            String string2 = this.f44214g.getString(C18066t.com_masabi_justride_sdk_ticket_expires_in_n_days_or_hours, new Object[]{quantityString2});
            C24362h.m61210e(string2, "resources.getString(\n   …eftText\n                )");
            return string2;
        } else {
            String string3 = this.f44214g.getString(C18066t.com_masabi_justride_sdk_ticket_expires_in_less_than_an_hour);
            C24362h.m61210e(string3, "resources.getString(R.st…res_in_less_than_an_hour)");
            return string3;
        }
    }

    /* renamed from: g */
    public final boolean mo49666g() {
        C19143a aVar = mo49664e().f48722o;
        C24362h.m61210e(aVar, "ticketDetails.activationSummary");
        TicketDisplayConfiguration ticketDisplayConfiguration = this.f44213f.f51631i;
        C24362h.m61210e(ticketDisplayConfiguration, "ticketDisplayBundle.ticketDisplayConfiguration");
        long j = ticketDisplayConfiguration.f37090g * ((long) 1000);
        C20375b bVar = this.f44211d;
        bVar.getClass();
        Date date = aVar.f48674e;
        if (date == null || aVar.f48673d == null) {
            return false;
        }
        return bVar.mo52604a(j, Long.valueOf(date.getTime()), aVar.f48677h, Long.valueOf(aVar.f48673d.getTime()));
    }
}
