package p824tp;

import android.annotation.SuppressLint;
import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.database.DbEntityRef;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.l10n.TemplateProtocol;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitType;
import com.moovit.util.ServerIdMap;
import g20.C17138a;
import g20.C17139b;
import g20.C17141c;
import g20.C17142d;
import g20.C17145e;
import g20.C17146f;
import g20.C17148g;
import g20.C17160h;
import g20.C17161i;
import g20.C17162j;
import g30.C4776h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p435de.C16596f;

/* renamed from: tp.f */
public final class C19728f {

    /* renamed from: e */
    public static final HashSet f50164e = new HashSet(Arrays.asList(new Integer[]{22, 567, 882, 475}));

    /* renamed from: a */
    public final C4776h f50165a;

    /* renamed from: b */
    public final ServerIdMap<TransitType> f50166b;

    /* renamed from: c */
    public final ServerIdMap<TransitAgency> f50167c;

    /* renamed from: d */
    public final HashMap f50168d;

    public C19728f(C4776h hVar) {
        this.f50165a = hVar;
        this.f50166b = ServerIdMap.m17949a(hVar.mo20299a());
        this.f50167c = ServerIdMap.m17949a(Collections.unmodifiableCollection(hVar.f16134i));
        Collection<C17146f> collection = hVar.f16135j;
        Collection<TemplateProtocol.C16179g> collection2 = hVar.f16136k;
        HashMap hashMap = new HashMap();
        ServerIdMap<T> a = ServerIdMap.m17949a(collection2);
        for (C17146f next : collection) {
            LinePresentationType linePresentationType = next.f44383a;
            Iterator<C17139b> it = next.f44384b.iterator();
            while (true) {
                if (it.hasNext()) {
                    C17139b next2 = it.next();
                    TemplateProtocol.C16179g gVar = (TemplateProtocol.C16179g) a.get(next2.f44374c);
                    if (gVar != null) {
                        ServerId serverId = next2.f44372a;
                        byte b = next2.f44373b;
                        C17145e b2 = TemplateProtocol.m41222b(gVar.f42169c);
                        TemplateProtocol.C16175e eVar = gVar.f42170d;
                        C17145e b3 = TemplateProtocol.m41222b(gVar.f42171e);
                        int i = eVar.f42162b;
                        C17142d<TransitLine, String> c = TemplateProtocol.m41223c(eVar.f42161a);
                        C17142d.C17143a aVar = C17142d.f44377a;
                        C17148g.C17151c cVar = C17148g.f44385a;
                        C17145e eVar2 = new C17145e(c, i, aVar, new C17160h(b, b3));
                        C17141c cVar2 = new C17141c(gVar.f42173g, C13720d.m34273c(gVar.f42172f, (C13722f) null, TemplateProtocol.f42155c));
                        TemplateProtocol.C16175e eVar3 = gVar.f42170d;
                        TemplateProtocol.C16177f fVar = gVar.f42171e;
                        C16181a aVar2 = new C16181a(eVar2, b2, cVar2, new C17138a(new C17145e(TemplateProtocol.m41223c(eVar3.f42161a), eVar3.f42162b, aVar, TemplateProtocol.m41222b(fVar)), b2, cVar2));
                        ServerIdMap serverIdMap = (ServerIdMap) hashMap.get(linePresentationType);
                        if (serverIdMap == null) {
                            serverIdMap = new ServerIdMap();
                            hashMap.put(linePresentationType, serverIdMap);
                        }
                        serverIdMap.put(serverId, aVar2);
                    } else {
                        StringBuilder k = C13555b.m33972k("Unknown template with id ");
                        k.append(next2.f44374c);
                        throw new IllegalStateException(k.toString());
                    }
                }
            }
        }
        HashMap hashMap2 = new HashMap(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            hashMap2.put((LinePresentationType) entry.getKey(), new C17162j((ServerIdMap) entry.getValue()));
        }
        this.f50168d = hashMap2;
        for (T t : Collections.unmodifiableCollection(this.f50165a.f16134i)) {
            DbEntityRef<TransitType> dbEntityRef = t.f23674d;
            if (!dbEntityRef.isResolved()) {
                TransitType transitType = (TransitType) this.f50166b.get(dbEntityRef.getServerId());
                if (transitType != null) {
                    dbEntityRef.resolveTo(transitType);
                } else {
                    C16596f a2 = C16596f.m42113a();
                    StringBuilder k2 = C13555b.m33972k("Metro Id: ");
                    k2.append(this.f50165a.f16126a);
                    a2.mo49363b(k2.toString());
                    a2.mo49363b("Metro Revision: " + this.f50165a.f16127b);
                    a2.mo49363b("Agency Id: " + t.f23672b);
                    a2.mo49363b("Transit Type Id: " + dbEntityRef.getServerId());
                    throw new ApplicationBugException("Agency's transit type is missing.");
                }
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public static C19728f m47195a(Context context) {
        return (C19728f) context.getSystemService("metro_context");
    }

    /* renamed from: b */
    public final C17161i<C16181a.C16184c, TransitLine> mo52082b(LinePresentationType linePresentationType) {
        return (C17161i) this.f50168d.get(linePresentationType);
    }
}
