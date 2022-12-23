package j20;

import android.content.Context;
import ce0.C21100e;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.Polygon;
import com.moovit.transit.LocationDescriptor;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.EnumSet;
import java.util.concurrent.Callable;
import p824tp.C19728f;

/* renamed from: j20.e */
public final class C17708e implements Callable<C17707d> {

    /* renamed from: g */
    public static final EnumSet f45455g = EnumSet.of(LocationDescriptor.LocationType.COORDINATE, LocationDescriptor.LocationType.STREET, LocationDescriptor.LocationType.POI);

    /* renamed from: h */
    public static final EnumSet f45456h = EnumSet.of(LocationDescriptor.SourceType.LOCATION_SEARCH, LocationDescriptor.SourceType.TAP_ON_MAP, LocationDescriptor.SourceType.USER_LOCATION, LocationDescriptor.SourceType.EXTERNAL);

    /* renamed from: b */
    public final Context f45457b;

    /* renamed from: c */
    public final Polygon f45458c;

    /* renamed from: d */
    public final BoxE6 f45459d;

    /* renamed from: e */
    public final LocationDescriptor f45460e;

    /* renamed from: f */
    public final boolean f45461f;

    public C17708e(Context context, C19728f fVar, LocationDescriptor locationDescriptor, boolean z) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f45457b = context;
        Polygon polygon = fVar.f50165a.f16132g;
        this.f45458c = polygon;
        this.f45459d = polygon.getBounds();
        C21100e.m49373x(locationDescriptor, "descriptor");
        this.f45460e = locationDescriptor;
        Boolean valueOf = Boolean.valueOf(z);
        C21100e.m49373x(valueOf, "performFallback");
        this.f45461f = valueOf.booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.moovit.request.RequestOptions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.moovit.request.RequestOptions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.moovit.request.RequestOptions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: com.moovit.request.RequestOptions} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            r19 = this;
            r0 = r19
            com.moovit.transit.LocationDescriptor r1 = r0.f45460e
            com.moovit.transit.LocationDescriptor$LocationType r2 = r1.f23647b
            com.moovit.transit.LocationDescriptor$SourceType r3 = r1.f23648c
            java.lang.String r1 = r1.mo24313f()
            com.moovit.transit.LocationDescriptor r4 = r0.f45460e
            com.moovit.commons.geo.LatLonE6 r4 = r4.f23653h
            java.util.EnumSet r5 = f45455g
            boolean r2 = r5.contains(r2)
            r13 = 1
            if (r3 == 0) goto L_0x0024
            java.util.EnumSet r5 = f45456h
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r3 = 0
            goto L_0x0025
        L_0x0024:
            r3 = 1
        L_0x0025:
            java.lang.String r16 = "android"
            r14 = 0
            if (r2 == 0) goto L_0x019b
            if (r3 == 0) goto L_0x019b
            java.lang.String r2 = "polygon"
            if (r4 == 0) goto L_0x00a3
            boolean r3 = p977zz.C20964s0.m49090h(r1)
            if (r3 == 0) goto L_0x00a3
            boolean r1 = android.location.Geocoder.isPresent()
            if (r1 != 0) goto L_0x003d
            goto L_0x009c
        L_0x003d:
            android.location.Geocoder r5 = new android.location.Geocoder
            android.content.Context r1 = r0.f45457b
            java.util.Locale r3 = p977zz.C20930c.m49020b(r1)
            r5.<init>(r1, r3)
            double r6 = r4.mo46922k()
            double r8 = r4.mo46926o()
            r10 = 5
            java.util.List r1 = r5.getFromLocation(r6, r8, r10)
            boolean r3 = c00.C13717b.m34258e(r1)
            if (r3 == 0) goto L_0x005c
            goto L_0x009c
        L_0x005c:
            aa0.f$c r3 = new aa0.f$c
            r3.<init>()
            java.util.ArrayList r1 = c00.C13723g.m34282c(r1, r3)
            vs.e r3 = new vs.e
            r4 = 15
            r3.<init>(r4)
            java.util.ArrayList r1 = c00.C13720d.m34273c(r1, r14, r3)
            com.moovit.commons.geo.Polygon r3 = r0.f45458c
            ce0.C21100e.m49373x(r3, r2)
            java.util.Iterator r2 = r1.iterator()
        L_0x0079:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x009b
            java.lang.Object r4 = r2.next()
            com.moovit.transit.LocationDescriptor r4 = (com.moovit.transit.LocationDescriptor) r4
            if (r4 == 0) goto L_0x0093
            com.moovit.commons.geo.LatLonE6 r4 = r4.mo24310d()
            boolean r4 = r3.mo46935h(r4)
            if (r4 == 0) goto L_0x0093
            r4 = 1
            goto L_0x0094
        L_0x0093:
            r4 = 0
        L_0x0094:
            r4 = r4 ^ r13
            if (r4 == 0) goto L_0x0079
            r2.remove()
            goto L_0x0079
        L_0x009b:
            r14 = r1
        L_0x009c:
            r15 = 2
            r7 = r14
            r5 = r16
            r6 = 2
            goto L_0x01a3
        L_0x00a3:
            if (r4 != 0) goto L_0x019b
            boolean r3 = p977zz.C20964s0.m49090h(r1)
            if (r3 != 0) goto L_0x019b
            boolean r3 = android.location.Geocoder.isPresent()
            if (r3 != 0) goto L_0x00b5
            r15 = r14
            r3 = 1
            goto L_0x0132
        L_0x00b5:
            android.location.Geocoder r4 = new android.location.Geocoder
            android.content.Context r3 = r0.f45457b
            java.util.Locale r5 = p977zz.C20930c.m49020b(r3)
            r4.<init>(r3, r5)
            r6 = 5
            com.moovit.commons.geo.BoxE6 r3 = r0.f45459d
            int r3 = r3.f40964b
            double r7 = com.moovit.commons.geo.LatLonE6.m40179s(r3)
            com.moovit.commons.geo.BoxE6 r3 = r0.f45459d
            int r3 = r3.f40966d
            double r9 = com.moovit.commons.geo.LatLonE6.m40179s(r3)
            com.moovit.commons.geo.BoxE6 r3 = r0.f45459d
            int r3 = r3.f40965c
            double r11 = com.moovit.commons.geo.LatLonE6.m40179s(r3)
            com.moovit.commons.geo.BoxE6 r3 = r0.f45459d
            int r3 = r3.f40967e
            double r17 = com.moovit.commons.geo.LatLonE6.m40179s(r3)
            r5 = r1
            r15 = r14
            r3 = 1
            r13 = r17
            java.util.List r4 = r4.getFromLocationName(r5, r6, r7, r9, r11, r13)
            boolean r5 = c00.C13717b.m34258e(r4)
            if (r5 == 0) goto L_0x00f2
            r14 = r15
            goto L_0x0132
        L_0x00f2:
            aa0.f$c r5 = new aa0.f$c
            r5.<init>()
            java.util.ArrayList r4 = c00.C13723g.m34282c(r4, r5)
            a8.l r5 = new a8.l
            r6 = 11
            r5.<init>(r6)
            java.util.ArrayList r14 = c00.C13720d.m34273c(r4, r15, r5)
            com.moovit.commons.geo.Polygon r4 = r0.f45458c
            ce0.C21100e.m49373x(r4, r2)
            java.util.Iterator r2 = r14.iterator()
        L_0x010f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0132
            java.lang.Object r5 = r2.next()
            com.moovit.transit.LocationDescriptor r5 = (com.moovit.transit.LocationDescriptor) r5
            if (r5 == 0) goto L_0x0129
            com.moovit.commons.geo.LatLonE6 r5 = r5.mo24310d()
            boolean r5 = r4.mo46935h(r5)
            if (r5 == 0) goto L_0x0129
            r13 = 1
            goto L_0x012a
        L_0x0129:
            r13 = 0
        L_0x012a:
            r5 = r13 ^ 1
            if (r5 == 0) goto L_0x010f
            r2.remove()
            goto L_0x010f
        L_0x0132:
            boolean r2 = r0.f45461f
            if (r2 == 0) goto L_0x0196
            if (r14 != 0) goto L_0x0196
            android.content.Context r2 = r0.f45457b
            android.content.Context r2 = r2.getApplicationContext()
            c70.i r2 = c70.C13756i.m34349a(r2)
            j20.a r4 = new j20.a
            c70.e r5 = r2.mo40679b()
            r4.<init>(r5, r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ForwardGeocodingRequest_"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.util.LinkedList r1 = r2.mo40681d(r1, r4, r15)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x018e
            int r2 = r1.size()
            if (r2 > r3) goto L_0x0186
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            wz.g r1 = (p906wz.C20436g) r1
            j20.b r1 = (j20.C17705b) r1
            com.moovit.transit.LocationDescriptor r1 = r1.f45449m
            if (r1 != 0) goto L_0x017b
            r14 = r15
            goto L_0x017f
        L_0x017b:
            java.util.List r14 = java.util.Collections.singletonList(r1)
        L_0x017f:
            if (r14 == 0) goto L_0x0196
            java.lang.String r1 = "moovit"
            r16 = r1
            goto L_0x0196
        L_0x0186:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "For multi-response requests use getResponses() instead"
            r1.<init>(r2)
            throw r1
        L_0x018e:
            com.moovit.commons.request.BadResponseException r1 = new com.moovit.commons.request.BadResponseException
            java.lang.String r2 = "Received empty response"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0196:
            r7 = r14
            r5 = r16
            r6 = 1
            goto L_0x01a3
        L_0x019b:
            r15 = r14
            r2 = 0
            java.lang.String r16 = "none"
            r7 = r15
            r5 = r16
            r6 = 0
        L_0x01a3:
            j20.d r1 = new j20.d
            com.moovit.transit.LocationDescriptor r4 = r0.f45460e
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j20.C17708e.call():java.lang.Object");
    }
}
