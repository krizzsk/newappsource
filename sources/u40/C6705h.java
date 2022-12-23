package u40;

import android.content.Context;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLineGroup;
import java.util.Collections;
import java.util.Set;
import p824tp.C19731i;
import u00.C19848o;

/* renamed from: u40.h */
public final class C6705h extends C6703f {
    /* renamed from: a */
    public final void mo22871a(C6702e eVar) throws Exception {
        TransitLineGroup transitLineGroup;
        Context context = eVar.f20782c.f33852a;
        C19848o e = C19731i.m47197a(context).mo52086d(eVar.f20783d).mo51803e();
        ServerId serverId = eVar.f20786g;
        e.getClass();
        Set h = e.mo52149h(context, Collections.singleton(serverId));
        if (h.isEmpty()) {
            transitLineGroup = null;
        } else {
            transitLineGroup = (TransitLineGroup) h.iterator().next();
        }
        eVar.f20787h = transitLineGroup;
        if (transitLineGroup == null) {
            StringBuilder k = C13555b.m33972k("Missing line group: ");
            k.append(eVar.f20786g);
            throw new ApplicationBugException(k.toString());
        }
    }
}
