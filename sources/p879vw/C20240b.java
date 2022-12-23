package p879vw;

import android.content.Context;

/* renamed from: vw.b */
public final class C20240b implements C20241c {
    /* renamed from: a */
    public final /* synthetic */ void mo52437a(Context context) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0155  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52438b(com.moovit.MoovitActivity r10, com.moovit.app.taxi.providers.TaxiProvider r11, com.moovit.app.taxi.TaxiOrder r12, java.lang.String r13) {
        /*
            r9 = this;
            com.moovit.app.taxi.providers.TaxiAppInfo r13 = r11.f39976k
            com.moovit.app.taxi.TaxiOrder$Source r0 = com.moovit.app.taxi.TaxiOrder.Source.DASHBOARD
            com.moovit.app.taxi.TaxiOrder$Source r1 = r12.f39912a
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            goto L_0x0052
        L_0x000e:
            com.moovit.transit.LocationDescriptor r0 = r12.f39913b
            com.moovit.transit.LocationDescriptor$LocationType r2 = com.moovit.transit.LocationDescriptor.LocationType.CURRENT
            com.moovit.transit.LocationDescriptor$LocationType r3 = r0.f23647b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x002b
            com.moovit.location.a r0 = com.moovit.location.C16202a.get(r10)
            uz.g r0 = r0.getPermissionAwareHighAccuracyFrequentUpdates()
            android.location.Location r0 = r0.mo50014i()
            com.moovit.commons.geo.LatLonE6 r0 = com.moovit.commons.geo.LatLonE6.m40177j(r0)
            goto L_0x002f
        L_0x002b:
            com.moovit.commons.geo.LatLonE6 r0 = r0.mo24310d()
        L_0x002f:
            if (r0 != 0) goto L_0x0032
            goto L_0x0047
        L_0x0032:
            vw.a r2 = new vw.a
            r3 = 0
            r2.<init>(r3, r0)
            java.util.Set<com.moovit.app.taxi.providers.TaxiPolygon> r0 = r11.f39975j
            java.lang.Object r0 = c00.C13723g.m34286g(r0, r2)
            com.moovit.app.taxi.providers.TaxiPolygon r0 = (com.moovit.app.taxi.providers.TaxiPolygon) r0
            if (r0 == 0) goto L_0x0047
            com.moovit.app.taxi.providers.TaxiPolygonSettings r0 = r0.f39957c
            java.lang.String r0 = r0.f39959b
            goto L_0x0048
        L_0x0047:
            r0 = r1
        L_0x0048:
            if (r0 == 0) goto L_0x004b
            goto L_0x0053
        L_0x004b:
            com.moovit.app.taxi.providers.TaxiDashboardConfig r0 = r11.f39978m
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = r0.f39937g
            goto L_0x0053
        L_0x0052:
            r0 = r1
        L_0x0053:
            if (r0 == 0) goto L_0x0056
            goto L_0x0070
        L_0x0056:
            com.moovit.app.taxi.providers.TaxiAppInfo r0 = r11.f39976k
            com.moovit.transit.LocationDescriptor r2 = r12.f39913b
            com.moovit.transit.LocationDescriptor$LocationType r3 = com.moovit.transit.LocationDescriptor.LocationType.CURRENT
            com.moovit.transit.LocationDescriptor$LocationType r4 = r2.f23647b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x006e
            com.moovit.commons.geo.LatLonE6 r2 = r2.mo24310d()
            if (r2 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            java.lang.String r0 = r0.f39924c
            goto L_0x0070
        L_0x006e:
            java.lang.String r0 = r0.f39925d
        L_0x0070:
            com.moovit.transit.LocationDescriptor r2 = r12.f39913b
            com.moovit.commons.geo.LatLonE6 r2 = r2.mo24310d()
            java.lang.String r3 = "from_lon"
            java.lang.String r4 = "from_lat"
            java.lang.String r5 = ""
            if (r2 == 0) goto L_0x008f
            java.lang.String r6 = r2.mo46925n()
            java.lang.String r0 = r0.replace(r4, r6)
            java.lang.String r2 = r2.mo46927q()
            java.lang.String r0 = r0.replace(r3, r2)
            goto L_0x0097
        L_0x008f:
            java.lang.String r0 = r0.replace(r4, r5)
            java.lang.String r0 = r0.replace(r3, r5)
        L_0x0097:
            com.moovit.transit.LocationDescriptor r2 = r12.f39913b
            java.lang.String r2 = r2.mo24313f()
            java.lang.String r3 = "from_name"
            if (r2 == 0) goto L_0x00b2
            com.moovit.transit.LocationDescriptor r4 = r12.f39913b
            com.moovit.transit.LocationDescriptor$LocationType r4 = r4.f23647b
            com.moovit.transit.LocationDescriptor$LocationType r6 = com.moovit.transit.LocationDescriptor.LocationType.CURRENT
            if (r4 == r6) goto L_0x00b2
            java.lang.String r2 = android.net.Uri.encode(r2)
            java.lang.String r0 = r0.replace(r3, r2)
            goto L_0x00b6
        L_0x00b2:
            java.lang.String r0 = r0.replace(r3, r5)
        L_0x00b6:
            com.moovit.transit.LocationDescriptor r2 = r12.f39914c
            java.lang.String r3 = "to_lon"
            java.lang.String r4 = "to_lat"
            java.lang.String r6 = "to_name"
            if (r2 == 0) goto L_0x00f4
            com.moovit.commons.geo.LatLonE6 r7 = r2.mo24310d()
            if (r7 == 0) goto L_0x00f4
            com.moovit.commons.geo.LatLonE6 r7 = r2.mo24310d()
            java.lang.String r8 = r7.mo46925n()
            java.lang.String r0 = r0.replace(r4, r8)
            java.lang.String r4 = r7.mo46927q()
            java.lang.String r0 = r0.replace(r3, r4)
            java.lang.String r3 = r2.mo24313f()
            if (r3 == 0) goto L_0x00ef
            com.moovit.transit.LocationDescriptor$LocationType r2 = r2.f23647b
            com.moovit.transit.LocationDescriptor$LocationType r4 = com.moovit.transit.LocationDescriptor.LocationType.CURRENT
            if (r2 == r4) goto L_0x00ef
            java.lang.String r2 = android.net.Uri.encode(r3)
            java.lang.String r0 = r0.replace(r6, r2)
            goto L_0x0100
        L_0x00ef:
            java.lang.String r0 = r0.replace(r6, r5)
            goto L_0x0100
        L_0x00f4:
            java.lang.String r0 = r0.replace(r4, r5)
            java.lang.String r0 = r0.replace(r3, r5)
            java.lang.String r0 = r0.replace(r6, r5)
        L_0x0100:
            java.util.Map<java.lang.String, java.lang.String> r2 = r12.f39915d
            boolean r2 = c00.C13717b.m34259f(r2)
            if (r2 == 0) goto L_0x0109
            goto L_0x0134
        L_0x0109:
            java.util.Map<java.lang.String, java.lang.String> r2 = r12.f39915d
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0113:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0134
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = android.net.Uri.encode(r3)
            java.lang.String r0 = r0.replace(r4, r3)
            goto L_0x0113
        L_0x0134:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r0 = p977zz.C20927a0.m49014i(r0)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r2)
            android.content.pm.PackageManager r2 = r10.getPackageManager()
            android.content.ComponentName r2 = r0.resolveActivity(r2)
            if (r2 == 0) goto L_0x014c
            r1 = r0
        L_0x014c:
            if (r1 == 0) goto L_0x0155
            r1.getData()
            r10.startActivity(r1)
            return
        L_0x0155:
            com.moovit.app.taxi.providers.TaxiPopupConfig r0 = r11.f39980o
            if (r0 == 0) goto L_0x0183
            com.moovit.app.taxi.TaxiOrder$Source r0 = com.moovit.app.taxi.TaxiOrder.Source.TRIP_PLAN
            com.moovit.app.taxi.TaxiOrder$Source r12 = r12.f39912a
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x0183
            com.moovit.network.model.ServerId r11 = r11.f39967b
            int r12 = p807sw.C19564a.f49735h
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            java.lang.String r13 = "providerId"
            r12.putParcelable(r13, r11)
            sw.a r11 = new sw.a
            r11.<init>()
            r11.setArguments(r12)
            androidx.fragment.app.FragmentManager r10 = r10.getSupportFragmentManager()
            java.lang.String r12 = "taxi_promo_popup_tag"
            r11.show((androidx.fragment.app.FragmentManager) r10, (java.lang.String) r12)
            return
        L_0x0183:
            java.lang.String r11 = r13.f39926e
            android.net.Uri r11 = android.net.Uri.parse(r11)
            android.content.Intent r11 = p977zz.C20927a0.m49014i(r11)
            p977zz.C20927a0.m49017l(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p879vw.C20240b.mo52438b(com.moovit.MoovitActivity, com.moovit.app.taxi.providers.TaxiProvider, com.moovit.app.taxi.TaxiOrder, java.lang.String):void");
    }
}
