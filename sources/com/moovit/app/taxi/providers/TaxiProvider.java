package com.moovit.app.taxi.providers;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.taxi.providers.TaxiAppInfo;
import com.moovit.app.taxi.providers.TaxiTripPlanConfig;
import com.moovit.commons.utils.Color;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19616q;
import p810sz.C19619s;

public class TaxiProvider implements C5384a, Parcelable {
    public static final Parcelable.Creator<TaxiProvider> CREATOR = new C15439a();

    /* renamed from: s */
    public static final C15440b f39966s = new C15440b(TaxiProvider.class);

    /* renamed from: b */
    public final ServerId f39967b;

    /* renamed from: c */
    public final String f39968c;

    /* renamed from: d */
    public final String f39969d;

    /* renamed from: e */
    public final Color f39970e;

    /* renamed from: f */
    public final Image f39971f;

    /* renamed from: g */
    public final Image f39972g;

    /* renamed from: h */
    public final Image f39973h;

    /* renamed from: i */
    public final String f39974i;

    /* renamed from: j */
    public final Set<TaxiPolygon> f39975j;

    /* renamed from: k */
    public final TaxiAppInfo f39976k;

    /* renamed from: l */
    public final TaxiTripPlanConfig f39977l;

    /* renamed from: m */
    public final TaxiDashboardConfig f39978m;

    /* renamed from: n */
    public final TaxiFabConfig f39979n;

    /* renamed from: o */
    public final TaxiPopupConfig f39980o;

    /* renamed from: p */
    public final TaxiAnimationConfig f39981p;

    /* renamed from: q */
    public final TaxiOrderConfig f39982q;

    /* renamed from: r */
    public final TaxiPolygonsVisibilityAffect f39983r;

    /* renamed from: com.moovit.app.taxi.providers.TaxiProvider$a */
    public class C15439a implements Parcelable.Creator<TaxiProvider> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiProvider) C19612n.m46981v(parcel, TaxiProvider.f39966s);
        }

        public final Object[] newArray(int i) {
            return new TaxiProvider[i];
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiProvider$b */
    public class C15440b extends C19619s<TaxiProvider> {
        public C15440b(Class cls) {
            super(6, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 6;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00f5  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x010a  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0115  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo178b(p810sz.C19615p r22, int r23) throws java.io.IOException {
            /*
                r21 = this;
                r0 = r22
                r1 = r23
                r22.getClass()
                int r2 = r22.mo51924l()
                com.moovit.network.model.ServerId r4 = new com.moovit.network.model.ServerId
                r4.<init>(r2)
                java.lang.String r5 = r22.mo51947p()
                zz.g r2 = com.moovit.commons.utils.Color.f41006j
                java.lang.Object r2 = r2.read(r0)
                r7 = r2
                com.moovit.commons.utils.Color r7 = (com.moovit.commons.utils.Color) r7
                com.moovit.image.d r2 = com.moovit.image.C16019d.m40803a()
                sz.r r2 = r2.f41718d
                java.lang.Object r2 = r2.read(r0)
                r8 = r2
                com.moovit.image.model.Image r8 = (com.moovit.image.model.Image) r8
                com.moovit.image.d r2 = com.moovit.image.C16019d.m40803a()
                sz.r r2 = r2.f41718d
                java.lang.Object r2 = r2.read(r0)
                r9 = r2
                com.moovit.image.model.Image r9 = (com.moovit.image.model.Image) r9
                com.moovit.app.taxi.providers.TaxiAppInfo$b r2 = com.moovit.app.taxi.providers.TaxiAppInfo.f39922f
                java.lang.Object r2 = r2.read(r0)
                r13 = r2
                com.moovit.app.taxi.providers.TaxiAppInfo r13 = (com.moovit.app.taxi.providers.TaxiAppInfo) r13
                com.moovit.app.taxi.providers.TaxiTripPlanConfig$b r2 = com.moovit.app.taxi.providers.TaxiTripPlanConfig.f39987h
                java.lang.Object r2 = r2.read(r0)
                r14 = r2
                com.moovit.app.taxi.providers.TaxiTripPlanConfig r14 = (com.moovit.app.taxi.providers.TaxiTripPlanConfig) r14
                com.moovit.app.taxi.providers.TaxiDashboardConfig$b r2 = com.moovit.app.taxi.providers.TaxiDashboardConfig.f39931h
                java.lang.Object r2 = r0.mo51962q(r2)
                r15 = r2
                com.moovit.app.taxi.providers.TaxiDashboardConfig r15 = (com.moovit.app.taxi.providers.TaxiDashboardConfig) r15
                com.moovit.app.taxi.providers.TaxiFabConfig$b r2 = com.moovit.app.taxi.providers.TaxiFabConfig.f39938f
                java.lang.Object r2 = r0.mo51962q(r2)
                r16 = r2
                com.moovit.app.taxi.providers.TaxiFabConfig r16 = (com.moovit.app.taxi.providers.TaxiFabConfig) r16
                com.moovit.app.taxi.providers.TaxiPopupConfig$b r2 = com.moovit.app.taxi.providers.TaxiPopupConfig.f39960g
                java.lang.Object r2 = r0.mo51962q(r2)
                r17 = r2
                com.moovit.app.taxi.providers.TaxiPopupConfig r17 = (com.moovit.app.taxi.providers.TaxiPopupConfig) r17
                r2 = 1
                if (r1 < r2) goto L_0x006e
                java.lang.String r3 = r22.mo51947p()
                goto L_0x0070
            L_0x006e:
                java.lang.String r3 = ""
            L_0x0070:
                r6 = r3
                if (r1 < r2) goto L_0x0078
                java.lang.String r3 = r22.mo51948t()
                goto L_0x0079
            L_0x0078:
                r3 = 0
            L_0x0079:
                r11 = r3
                r3 = -1
                r10 = 4
                if (r1 < 0) goto L_0x00b1
                if (r1 > r10) goto L_0x00b1
                if (r1 < r2) goto L_0x00a1
                com.moovit.commons.geo.Polylon$c r2 = com.moovit.commons.geo.Polylon.f40985h
                int r10 = r22.mo51924l()
                if (r10 != r3) goto L_0x008b
                goto L_0x00a1
            L_0x008b:
                java.util.HashSet r3 = new java.util.HashSet
                r3.<init>(r10)
                r12 = 0
            L_0x0091:
                if (r12 >= r10) goto L_0x00a2
                r18 = r10
                java.lang.Object r10 = r0.mo51962q(r2)
                r3.add(r10)
                int r12 = r12 + 1
                r10 = r18
                goto L_0x0091
            L_0x00a1:
                r3 = 0
            L_0x00a2:
                if (r3 == 0) goto L_0x00d4
                lr.i r2 = new lr.i
                r10 = 9
                r2.<init>(r10)
                r10 = 0
                java.util.HashSet r2 = c00.C13720d.m34277g(r3, r10, r2)
                goto L_0x00d5
            L_0x00b1:
                r2 = 0
                r10 = 5
                if (r1 < r10) goto L_0x00d4
                com.moovit.app.taxi.providers.TaxiPolygon$b r10 = com.moovit.app.taxi.providers.TaxiPolygon.f39955d
                int r12 = r22.mo51924l()
                if (r12 != r3) goto L_0x00be
                goto L_0x00d5
            L_0x00be:
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>(r12)
                r3 = 0
            L_0x00c4:
                if (r3 >= r12) goto L_0x00d5
                r18 = r12
                java.lang.Object r12 = r0.mo51962q(r10)
                r2.add(r12)
                int r3 = r3 + 1
                r12 = r18
                goto L_0x00c4
            L_0x00d4:
                r2 = 0
            L_0x00d5:
                r12 = r2
                r2 = 2
                if (r1 < r2) goto L_0x00e6
                com.moovit.image.d r2 = com.moovit.image.C16019d.m40803a()
                sz.r r2 = r2.f41718d
                java.lang.Object r2 = r0.mo51962q(r2)
                com.moovit.image.model.Image r2 = (com.moovit.image.model.Image) r2
                goto L_0x00e7
            L_0x00e6:
                r2 = 0
            L_0x00e7:
                r10 = r2
                r2 = 3
                if (r1 < r2) goto L_0x00f5
                com.moovit.app.taxi.providers.TaxiAnimationConfig$b r2 = com.moovit.app.taxi.providers.TaxiAnimationConfig.f39918e
                java.lang.Object r2 = r0.mo51962q(r2)
                com.moovit.app.taxi.providers.TaxiAnimationConfig r2 = (com.moovit.app.taxi.providers.TaxiAnimationConfig) r2
                r3 = 4
                goto L_0x00f7
            L_0x00f5:
                r3 = 4
                r2 = 0
            L_0x00f7:
                r18 = r2
                if (r1 < r3) goto L_0x0104
                com.moovit.app.taxi.providers.TaxiOrderConfig$b r2 = com.moovit.app.taxi.providers.TaxiOrderConfig.f39947d
                java.lang.Object r2 = r0.mo51962q(r2)
                com.moovit.app.taxi.providers.TaxiOrderConfig r2 = (com.moovit.app.taxi.providers.TaxiOrderConfig) r2
                goto L_0x0105
            L_0x0104:
                r2 = 0
            L_0x0105:
                r19 = r2
                r2 = 6
                if (r1 < r2) goto L_0x0115
                sz.c r1 = com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect.getCODER()
                java.lang.Enum r0 = p379.C13555b.m33968g(r1, r0)
                com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect r0 = (com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect) r0
                goto L_0x0117
            L_0x0115:
                com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect r0 = com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect.VISIBLE_INSIDE
            L_0x0117:
                r20 = r0
                com.moovit.app.taxi.providers.TaxiProvider r0 = new com.moovit.app.taxi.providers.TaxiProvider
                r3 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.taxi.providers.TaxiProvider.C15440b.mo178b(sz.p, int):java.lang.Object");
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TaxiProvider taxiProvider = (TaxiProvider) obj;
            ServerId serverId = taxiProvider.f39967b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(taxiProvider.f39968c);
            Color.f41005i.write(taxiProvider.f39970e, qVar);
            C16019d.m40803a().f41718d.write(taxiProvider.f39971f, qVar);
            C16019d.m40803a().f41718d.write(taxiProvider.f39972g, qVar);
            TaxiAppInfo taxiAppInfo = taxiProvider.f39976k;
            TaxiAppInfo.C15418b bVar = TaxiAppInfo.f39922f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(taxiAppInfo, qVar);
            TaxiTripPlanConfig taxiTripPlanConfig = taxiProvider.f39977l;
            TaxiTripPlanConfig.C15444b bVar2 = TaxiTripPlanConfig.f39987h;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(taxiTripPlanConfig, qVar);
            qVar.mo51967q(taxiProvider.f39978m, TaxiDashboardConfig.f39931h);
            qVar.mo51967q(taxiProvider.f39979n, TaxiFabConfig.f39938f);
            qVar.mo51967q(taxiProvider.f39980o, TaxiPopupConfig.f39960g);
            qVar.mo51954p(taxiProvider.f39969d);
            qVar.mo51955t(taxiProvider.f39974i);
            qVar.mo51964g(taxiProvider.f39975j, TaxiPolygon.f39955d);
            qVar.mo51967q(taxiProvider.f39973h, C16019d.m40803a().f41718d);
            qVar.mo51967q(taxiProvider.f39981p, TaxiAnimationConfig.f39918e);
            qVar.mo51967q(taxiProvider.f39982q, TaxiOrderConfig.f39947d);
            TaxiPolygonsVisibilityAffect.getCODER().write(taxiProvider.f39983r, qVar);
        }
    }

    public TaxiProvider(ServerId serverId, String str, String str2, Color color, Image image, Image image2, Image image3, String str3, HashSet hashSet, TaxiAppInfo taxiAppInfo, TaxiTripPlanConfig taxiTripPlanConfig, TaxiDashboardConfig taxiDashboardConfig, TaxiFabConfig taxiFabConfig, TaxiPopupConfig taxiPopupConfig, TaxiAnimationConfig taxiAnimationConfig, TaxiOrderConfig taxiOrderConfig, TaxiPolygonsVisibilityAffect taxiPolygonsVisibilityAffect) {
        TaxiAppInfo taxiAppInfo2 = taxiAppInfo;
        TaxiTripPlanConfig taxiTripPlanConfig2 = taxiTripPlanConfig;
        TaxiPolygonsVisibilityAffect taxiPolygonsVisibilityAffect2 = taxiPolygonsVisibilityAffect;
        this.f39967b = serverId;
        C21100e.m49373x(str, "analyticKey");
        this.f39968c = str;
        C21100e.m49373x(str2, "name");
        this.f39969d = str2;
        this.f39970e = color;
        C21100e.m49373x(image, "smallImage");
        this.f39971f = image;
        C21100e.m49373x(image2, "image");
        this.f39972g = image2;
        this.f39973h = image3;
        this.f39974i = str3;
        this.f39975j = hashSet != null ? Collections.unmodifiableSet(hashSet) : null;
        C21100e.m49373x(taxiAppInfo2, "appInfo");
        this.f39976k = taxiAppInfo2;
        C21100e.m49373x(taxiTripPlanConfig2, "tripPlanConfig");
        this.f39977l = taxiTripPlanConfig2;
        this.f39978m = taxiDashboardConfig;
        this.f39979n = taxiFabConfig;
        this.f39980o = taxiPopupConfig;
        this.f39981p = taxiAnimationConfig;
        this.f39982q = taxiOrderConfig;
        C21100e.m49373x(taxiPolygonsVisibilityAffect2, "polygonsVisibilityAffect");
        this.f39983r = taxiPolygonsVisibilityAffect2;
    }

    public final int describeContents() {
        return 0;
    }

    public final ServerId getServerId() {
        return this.f39967b;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TaxiProvider{id=");
        k.append(this.f39967b);
        k.append(", analyticKey='");
        C25541a.m63890u(k, this.f39968c, '\'', ", name='");
        C25541a.m63890u(k, this.f39969d, '\'', ", color=");
        k.append(this.f39970e);
        k.append(", smallImage=");
        k.append(this.f39971f);
        k.append(", image=");
        k.append(this.f39972g);
        k.append(", vehicleImage=");
        k.append(this.f39973h);
        k.append(", paymentContext='");
        C25541a.m63890u(k, this.f39974i, '\'', ", supportedRegions=");
        k.append(this.f39975j);
        k.append(", appInfo=");
        k.append(this.f39976k);
        k.append(", tripPlanConfig=");
        k.append(this.f39977l);
        k.append(", dashboardConfig=");
        k.append(this.f39978m);
        k.append(", fabConfig=");
        k.append(this.f39979n);
        k.append(", popupConfig=");
        k.append(this.f39980o);
        k.append(", animationConfig=");
        k.append(this.f39981p);
        k.append(", orderConfig=");
        k.append(this.f39982q);
        k.append(", polygonsVisibilityAffect=");
        k.append(this.f39983r);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39966s);
    }
}
