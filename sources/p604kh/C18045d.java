package p604kh;

import android.content.res.Resources;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.p415ui.features.universalticket.details.trip.Trip;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import dj0.C23275a;
import mf0.C24362h;
import p605ki.C18066t;

/* renamed from: kh.d */
public final class C18045d {

    /* renamed from: a */
    public final /* synthetic */ int f46167a = 1;

    /* renamed from: b */
    public Object f46168b;

    /* renamed from: c */
    public Object f46169c;

    /* renamed from: d */
    public Object f46170d;

    public C18045d() {
    }

    /* renamed from: a */
    public final String mo50519a() {
        if (((String) this.f46168b) == null) {
            throw new RuntimeException("hostname cannot be null");
        } else if (((String) this.f46169c) == null) {
            throw new RuntimeException("brandId cannot be null");
        } else if (((String) this.f46170d) != null) {
            StringBuilder k = C13555b.m33972k(UrlPrivacyValidator.HTTPS_SCHEME);
            k.append((String) this.f46168b);
            k.append("/edge/brandconfig/v/1/");
            k.append((String) this.f46169c);
            if (!((String) this.f46170d).startsWith("/")) {
                k.append("/");
            }
            k.append((String) this.f46170d);
            return k.toString();
        } else {
            throw new RuntimeException("path cannot be null");
        }
    }

    /* renamed from: b */
    public final String mo50520b() {
        boolean z;
        String str = ((Trip) this.f46168b).f37248i;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return ((Trip) this.f46168b).f37246g;
        }
        int i = C18066t.f46217x321e232f;
        Object obj = this.f46168b;
        String string = ((Resources) this.f46169c).getString(i, new Object[]{((Trip) obj).f37246g, ((Trip) obj).f37248i});
        C24362h.m61210e(string, "resources.getString(\n   …layName\n                )");
        return string;
    }

    /* renamed from: c */
    public final boolean mo50521c() {
        boolean z;
        boolean z2;
        String str = ((Trip) this.f46168b).f37244e;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = ((Trip) this.f46168b).f37241b;
            if (str2 == null || str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        switch (this.f46167a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                C23275a aVar = (C23275a) this.f46168b;
                while (true) {
                    C23275a aVar2 = (C23275a) this.f46169c;
                    if (aVar != aVar2) {
                        sb.append(aVar.f59032d.mo53239a());
                        sb.append("->");
                        aVar = aVar.f59029a;
                    } else {
                        sb.append(aVar2.f59032d.mo53239a());
                        return sb.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    public C18045d(Trip trip, Resources resources, TicketDisplayConfiguration ticketDisplayConfiguration) {
        this.f46168b = trip;
        this.f46169c = resources;
        this.f46170d = ticketDisplayConfiguration;
    }

    public /* synthetic */ C18045d(Trip trip, Resources resources) {
        this(trip, resources, (TicketDisplayConfiguration) null);
    }

    public C18045d(C23275a aVar, C23275a aVar2) {
        this.f46168b = aVar;
        this.f46169c = aVar2;
        this.f46170d = aVar;
    }
}
