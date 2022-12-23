package p450dt;

import com.moovit.app.home.HomeActivity;
import com.moovit.network.model.ServerId;
import com.moovit.request.MetroRevisionMismatchException;
import g30.C4787o;
import g30.C4788p;
import p011aa.C0141e;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: dt.c */
public final class C16702c extends C0141e {

    /* renamed from: b */
    public final /* synthetic */ long f43495b;

    /* renamed from: c */
    public final /* synthetic */ ServerId f43496c;

    /* renamed from: d */
    public final /* synthetic */ HomeActivity f43497d;

    public C16702c(HomeActivity homeActivity, long j, ServerId serverId) {
        this.f43497d = homeActivity;
        this.f43495b = j;
        this.f43496c = serverId;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C4787o oVar = (C4787o) cVar;
        long j = ((C4788p) gVar).f16167m;
        if (this.f43495b < j) {
            HomeActivity homeActivity = this.f43497d;
            MetroRevisionMismatchException metroRevisionMismatchException = new MetroRevisionMismatchException(this.f43496c, j);
            int i = HomeActivity.f38149o0;
            homeActivity.mo44505H1(metroRevisionMismatchException);
        }
    }
}
