package p566ip;

import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.jobs.barcode.C14654a;
import java.util.List;
import p752qn.C19145c;
import p893wm.C20376c;
import p916xl.C20536b;

/* renamed from: ip.d */
public final class C17633d {

    /* renamed from: a */
    public int f45323a;

    /* renamed from: b */
    public final C14654a f45324b;

    /* renamed from: c */
    public final TicketDisplayConfiguration f45325c;

    /* renamed from: d */
    public final List<C19145c> f45326d;

    /* renamed from: e */
    public final C20376c f45327e;

    /* renamed from: f */
    public final String f45328f;

    /* renamed from: g */
    public final C20536b f45329g;

    public C17633d(C14654a aVar, TicketDisplayConfiguration ticketDisplayConfiguration, List list, C20376c cVar, String str, C20536b bVar) {
        this.f45324b = aVar;
        this.f45325c = ticketDisplayConfiguration;
        this.f45326d = list;
        this.f45327e = cVar;
        this.f45328f = str;
        this.f45329g = bVar;
    }

    /* renamed from: a */
    public final String mo50093a() {
        String str = "Secondary";
        if (this.f45326d.size() < 2) {
            String str2 = this.f45325c.f37091h.get("default");
            if (str2 != null) {
                return str2;
            }
            return str;
        }
        String str3 = this.f45326d.get(1).f48685a;
        if (str3 != null) {
            TicketDisplayConfiguration ticketDisplayConfiguration = this.f45325c;
            String str4 = ticketDisplayConfiguration.f37091h.get(str3);
            if (str4 != null) {
                return str4;
            }
            String str5 = ticketDisplayConfiguration.f37091h.get("default");
            if (str5 != null) {
                str = str5;
            }
            return str;
        }
        String str6 = this.f45325c.f37091h.get("default");
        if (str6 != null) {
            return str6;
        }
        return str;
    }
}
