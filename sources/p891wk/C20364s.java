package p891wk;

import com.google.android.play.core.assetpacks.C14333w2;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import com.masabi.justride.sdk.jobs.barcode.C14654a;
import java.util.Objects;
import p269u2.C6677a;
import p492fn.C17043c;
import p752qn.C19150h;
import p893wm.C20376c;

/* renamed from: wk.s */
public final class C20364s {

    /* renamed from: a */
    public final C19150h f51623a;

    /* renamed from: b */
    public final TicketState f51624b;

    /* renamed from: c */
    public final C14654a f51625c;

    /* renamed from: d */
    public final C17043c f51626d;

    /* renamed from: e */
    public final C14333w2 f51627e;

    /* renamed from: f */
    public final C6677a f51628f;

    /* renamed from: g */
    public final String f51629g;

    /* renamed from: h */
    public final String f51630h;

    /* renamed from: i */
    public final TicketDisplayConfiguration f51631i;

    /* renamed from: j */
    public final C20376c f51632j;

    /* renamed from: k */
    public final String f51633k;

    /* renamed from: l */
    public final String f51634l;

    /* renamed from: m */
    public final boolean f51635m;

    public C20364s(C19150h hVar, TicketState ticketState, C14654a aVar, C17043c cVar, C14333w2 w2Var, C6677a aVar2, String str, String str2, TicketDisplayConfiguration ticketDisplayConfiguration, C20376c cVar2, String str3, String str4, boolean z) {
        this.f51623a = hVar;
        this.f51624b = ticketState;
        this.f51625c = aVar;
        this.f51626d = cVar;
        this.f51627e = w2Var;
        this.f51628f = aVar2;
        this.f51629g = str;
        this.f51630h = str2;
        this.f51631i = ticketDisplayConfiguration;
        this.f51632j = cVar2;
        this.f51633k = str3;
        this.f51634l = str4;
        this.f51635m = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20364s.class != obj.getClass()) {
            return false;
        }
        C20364s sVar = (C20364s) obj;
        if (this.f51635m != sVar.f51635m || !this.f51623a.equals(sVar.f51623a) || this.f51624b != sVar.f51624b || !Objects.equals(this.f51625c, sVar.f51625c) || !Objects.equals(this.f51626d, sVar.f51626d) || !this.f51627e.equals(sVar.f51627e) || !this.f51628f.equals(sVar.f51628f) || !this.f51629g.equals(sVar.f51629g) || !this.f51630h.equals(sVar.f51630h) || !this.f51631i.equals(sVar.f51631i) || !this.f51632j.equals(sVar.f51632j) || !this.f51633k.equals(sVar.f51633k) || !this.f51634l.equals(sVar.f51634l)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51623a, this.f51624b, this.f51625c, this.f51626d, this.f51627e, this.f51628f, this.f51629g, this.f51630h, this.f51631i, this.f51632j, this.f51633k, this.f51634l, Boolean.valueOf(this.f51635m)});
    }
}
