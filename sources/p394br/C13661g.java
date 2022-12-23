package p394br;

import android.view.View;
import c00.C13722f;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.commons.utils.Color;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.transit.TransitLine;
import java.util.ArrayList;
import p853uu.C19991a;
import p927xw.C20647n;
import p977zz.C20975x0;

/* renamed from: br.g */
public final /* synthetic */ class C13661g implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f33693b;

    /* renamed from: c */
    public final /* synthetic */ Object f33694c;

    public /* synthetic */ C13661g(Object obj, int i) {
        this.f33693b = i;
        this.f33694c = obj;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f33693b) {
            case 0:
                return ((ArrayList) this.f33694c).contains(((SearchLocationItem) obj).f39457b);
            case 1:
                return ((TransitLine) this.f33694c).equals(((MotQrCodeTrip) obj).f39073c);
            case 2:
                return ((C19991a) this.f33694c).f50827b.equals(((MotActivation) obj).f38985b);
            case 3:
                String str = C20647n.f52214k;
                return C20975x0.m49118e((Color) this.f33694c, (Color) ((View) obj).getTag());
            default:
                return ((ServerId) this.f33694c).equals(((Ticket) obj).f23473b.f23511b);
        }
    }
}
