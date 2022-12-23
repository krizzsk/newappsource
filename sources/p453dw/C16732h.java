package p453dw;

import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import i30.C5265a;
import i30.C5267c;
import i30.C5268d;
import i30.C5271f;
import i30.C5272g;
import java.util.ArrayList;
import o00.C18671h;
import p977zz.C20975x0;

/* renamed from: dw.h */
public final class C16732h extends C5272g<C5267c, C5271f> {

    /* renamed from: d */
    public final /* synthetic */ ServerId f43579d;

    /* renamed from: e */
    public final /* synthetic */ StopDetailActivity f43580e;

    public C16732h(StopDetailActivity stopDetailActivity, ServerId serverId) {
        this.f43580e = stopDetailActivity;
        this.f43579d = serverId;
    }

    /* renamed from: e */
    public final void mo21078e(C5265a aVar, C5268d dVar, ArrayList arrayList) {
        C5267c cVar = (C5267c) aVar;
        if (C20975x0.m49118e(this.f43580e.f39657Z, this.f43579d)) {
            if (arrayList.isEmpty()) {
                this.f43580e.mo45902E2(dVar.mo21064c(this.f43579d));
                return;
            }
            this.f43580e.f39667u0.setAdapter(new C18671h(R.layout.stop_detail_error));
        }
    }
}
