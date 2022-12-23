package p847uo;

import android.os.Bundle;
import android.widget.Toast;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob;
import com.masabi.justride.sdk.platform.jobs.CallBackOn;
import p364al.C13480a;
import p565io.C17626c;
import p587jo.C17903b;
import p605ki.C18066t;
import p611ko.C18111c;
import p704om.C18791g;
import p847uo.C19967b;

/* renamed from: uo.f */
public final class C19974f extends C17903b<C19964a> {

    /* renamed from: b */
    public final C18791g f50789b;

    /* renamed from: c */
    public final C13480a f50790c;

    /* renamed from: d */
    public final GetTicketJob f50791d;

    /* renamed from: e */
    public final C18111c f50792e;

    /* renamed from: f */
    public final C19967b.C19968a f50793f;

    /* renamed from: g */
    public final C19973e f50794g = new C19973e(this);

    /* renamed from: h */
    public C19967b f50795h;

    /* renamed from: i */
    public String f50796i;

    /* renamed from: j */
    public boolean f50797j;

    /* renamed from: uo.f$a */
    public static class C19975a extends C17903b.C17904a<C19964a, C19974f> {

        /* renamed from: a */
        public final C18791g f50798a;

        /* renamed from: b */
        public final C13480a f50799b;

        /* renamed from: c */
        public final GetTicketJob f50800c;

        /* renamed from: d */
        public final C18111c f50801d;

        /* renamed from: e */
        public final C19967b.C19968a f50802e;

        public C19975a(C18791g gVar, C13480a aVar, GetTicketJob getTicketJob, C18111c cVar, C19967b.C19968a aVar2) {
            this.f50798a = gVar;
            this.f50799b = aVar;
            this.f50800c = getTicketJob;
            this.f50801d = cVar;
            this.f50802e = aVar2;
        }

        /* renamed from: a */
        public final C17903b mo50459a(C17626c cVar) {
            return new C19974f((C19964a) cVar, this.f50798a, this.f50799b, this.f50800c, this.f50801d, this.f50802e);
        }
    }

    public C19974f(C19964a aVar, C18791g gVar, C13480a aVar2, GetTicketJob getTicketJob, C18111c cVar, C19967b.C19968a aVar3) {
        super(aVar);
        this.f50789b = gVar;
        this.f50790c = aVar2;
        this.f50791d = getTicketJob;
        this.f50792e = cVar;
        this.f50793f = aVar3;
    }

    /* renamed from: a */
    public final void mo50455a(Bundle bundle) {
        if (bundle == null) {
            bundle = ((C19964a) this.f45943a).getArguments();
        }
        if (bundle == null) {
            throw new JustRideSdkException("Cannot load TicketInfo screen with null bundle.");
        } else if (bundle.containsKey("KEY_TICKET_ID")) {
            this.f50796i = bundle.getString("KEY_TICKET_ID");
            if (bundle.containsKey("KEY_TICKET_INFO_TAB_ACTIVE")) {
                this.f50797j = bundle.getBoolean("KEY_TICKET_INFO_TAB_ACTIVE");
                C19967b.C19968a aVar = this.f50793f;
                this.f50795h = new C19967b(aVar.f50771c, aVar.f50769a, aVar.f50770b);
                return;
            }
            throw new JustRideSdkException("Cannot load TicketInfo screen without \"info tab active\" value.");
        } else {
            throw new JustRideSdkException("Cannot load TicketInfo screen without \"ticket ID\" value.");
        }
    }

    /* renamed from: b */
    public final void mo50456b() {
        this.f50790c.mo40392c(this.f50794g);
    }

    /* renamed from: c */
    public final void mo50457c() {
        if (this.f50796i == null) {
            Toast.makeText(((C19964a) this.f45943a).getContext(), C18066t.com_masabi_justride_sdk_ticket_info_loading_error, 1).show();
        } else {
            this.f50790c.mo40390a(new C19972d(this), CallBackOn.MAIN_THREAD, this.f50794g);
        }
    }

    /* renamed from: d */
    public final void mo50458d(Bundle bundle) {
        bundle.putString("KEY_TICKET_ID", this.f50796i);
        bundle.putBoolean("KEY_TICKET_INFO_TAB_ACTIVE", this.f50797j);
    }
}
