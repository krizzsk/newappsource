package p394br;

import android.content.Context;
import android.content.SharedPreferences;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13752e;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import g30.C4776h;
import i30.C5268d;
import i30.C5269e;
import i30.C5274h;
import i30.C5275i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import p009a8.C0111k;
import p435de.C16596f;
import p646lz.C18299a;
import p824tp.C19728f;
import p878vv.C20236c;
import p929xy.C20663f;
import p977zz.C20964s0;

/* renamed from: br.h */
public final class C13662h extends C20663f<Boolean> {
    /* renamed from: o */
    public final Object mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        Context context = eVar.f33852a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("SearchHistoryCleanerLoader", 0);
        String c = serverId.mo19751c();
        Long l = -1L;
        C21100e.m49373x(c, "name");
        C21100e.m49373x(sharedPreferences, "prefs");
        if (Long.valueOf(sharedPreferences.getLong(c, l.longValue())).longValue() == j) {
            return Boolean.TRUE;
        }
        C20236c f = C20236c.m47804f(context);
        f.mo51499b();
        ArrayList<T> c2 = C13723g.m34282c(f.f48438c.mo40647e(), new C13659e(0));
        if (c2.isEmpty()) {
            return Boolean.TRUE;
        }
        ArrayList<O> c3 = C13720d.m34273c(c2, (C13722f) null, new C13660f(0));
        C4776h hVar = C19728f.m47195a(eVar.f33852a).f50165a;
        C5269e d = C16759e.m42348d(hVar, "metroInfo");
        d.f17412b.mo47002b(MetroEntityType.TRANSIT_STOP, c3);
        ArrayList I = new C5274h(eVar, "SearchHistoryCleanerLoader", hVar, d).mo52625I();
        CollectionHashMap.HashSetHashMap hashSetHashMap = new CollectionHashMap.HashSetHashMap();
        Iterator it = I.iterator();
        while (it.hasNext()) {
            C5275i iVar = (C5275i) it.next();
            hashSetHashMap.mo47001a(iVar.f17401m, iVar.f17402n);
        }
        c3.removeAll(new C5268d(hashSetHashMap).f17404a.keySet());
        ArrayList<T> c4 = C13723g.m34282c(c2, new C13661g(c3, 0));
        if (!c4.isEmpty()) {
            f.mo51499b();
            f.f48438c.mo40648f(c4);
            f.mo51500c();
        } else {
            C16596f a = C16596f.m42113a();
            StringBuilder k = C13555b.m33972k("Cleaning recent stops from history location search: ");
            k.append(C20964s0.m49096n(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, C13720d.m34273c(c4, (C13722f) null, new C0111k(0))));
            a.mo49363b(k.toString());
        }
        Long valueOf = Long.valueOf(j);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(c, valueOf.longValue());
        edit.apply();
        return Boolean.TRUE;
    }
}
