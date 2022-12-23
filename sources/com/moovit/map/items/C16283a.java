package com.moovit.map.items;

import android.content.Context;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.graphics.Point;
import c70.C13746a;
import c70.C13752e;
import ce0.C21100e;
import com.braze.models.BrazeGeofence;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.items.MapItem;
import com.moovit.request.RequestOptions;
import g30.C4776h;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import p435de.C16596f;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19746x;
import p977zz.C20936e0;
import u00.C19819f;

/* renamed from: com.moovit.map.items.a */
public final class C16283a extends C13746a<C16283a, C16284b> implements Callable<C16284b> {

    /* renamed from: y */
    public static final RequestOptions f42553y;

    /* renamed from: v */
    public final MapItem.Type f42554v;

    /* renamed from: w */
    public final Point f42555w;

    /* renamed from: x */
    public final C19819f f42556x;

    static {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42905b = 400;
        f42553y = requestOptions;
    }

    public C16283a(C13752e eVar, MapItem.Type type, Point point) {
        super(eVar, C19746x.server_path_cdn_server_url, type.getServiceNameResourceId(), false, C16284b.class);
        this.f42554v = type;
        C21100e.m49373x(point, "tile");
        this.f42555w = new Point(point);
        Context context = eVar.f33852a;
        C4776h hVar = C19728f.m47195a(context).f50165a;
        this.f42556x = (C19819f) C19731i.m47197a(context).mo52085c(hVar).mo51794a(C19819f.class);
        mo52627p(point.x, "x");
        mo52627p(point.y, "y");
        mo52627p(hVar.f16126a.f15142b, "metroAreaId");
        mo52628q(hVar.f16127b);
    }

    /* renamed from: P */
    public static HashSet m41526P(BoxE6 boxE6) {
        int a = C20936e0.m49035a(boxE6.f40967e, 10000) / 10000;
        int c = C20936e0.m49037c(boxE6.f40964b, 10000) / 10000;
        int a2 = C20936e0.m49035a(boxE6.f40965c, 10000) / 10000;
        HashSet hashSet = new HashSet();
        for (int c2 = C20936e0.m49037c(boxE6.f40966d, 10000) / 10000; c2 < a; c2++) {
            for (int i = c; i < a2; i++) {
                hashSet.add(new Point(c2, i));
            }
        }
        return hashSet;
    }

    /* renamed from: Q */
    public static HashSet m41527Q(int i, LatLonE6 latLonE6) {
        C21100e.m49373x(latLonE6, "center");
        C21100e.m49359q(i, BrazeGeofence.RADIUS_METERS);
        int i2 = latLonE6.f40980b;
        int i3 = latLonE6.f40981c;
        double d = (double) i;
        int i4 = (int) (9.013305360099787d * d);
        int a = C20936e0.m49035a(i2 + i4, 10000) / 10000;
        double cos = 8.983204953368922d / Math.cos(latLonE6.mo46924m());
        HashSet hashSet = new HashSet();
        for (int c = C20936e0.m49037c(i2 - i4, 10000) / 10000; c < a; c++) {
            int i5 = (int) (d * cos);
            int a2 = C20936e0.m49035a(i5 + i3, 10000) / 10000;
            for (int c2 = C20936e0.m49037c(i3 - i5, 10000) / 10000; c2 < a2; c2++) {
                hashSet.add(new Point(c2, c));
            }
        }
        return hashSet;
    }

    /* renamed from: E */
    public final List<C16284b> mo21059E() {
        Collection<MapItem> collection;
        try {
            collection = this.f42556x.mo52127h(this.f51759b, this.f42554v, this.f42555w);
        } catch (SQLiteDatabaseCorruptException e) {
            C16596f.m42113a().mo49364c(e);
            collection = null;
        }
        if (collection == null) {
            return Collections.emptyList();
        }
        this.f51765h = true;
        return Collections.singletonList(new C16284b(collection));
    }

    /* renamed from: O */
    public final String mo48776O() {
        StringBuilder k = C13555b.m33972k("MapItems_");
        k.append(this.f42554v.name());
        k.append("_");
        k.append(this.f42555w.x);
        k.append("_");
        k.append(this.f42555w.y);
        return k.toString();
    }

    public final Object call() throws Exception {
        return (C16284b) mo52626J();
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        httpURLConnection.setUseCaches(false);
    }
}
