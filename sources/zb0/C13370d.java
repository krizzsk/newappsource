package zb0;

import ac0.C7557a;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.umo.ads.p342c.zzb;
import com.umo.ads.p342c.zzd;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.text.C24179b;
import mc0.C12909a;
import mc0.C12911c;
import mc0.C12913e;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p583jk.C17875h;
import uh0.C25080g;
import uh0.C25081h;
import wb0.C13233c;
import yb0.C13304h;

/* renamed from: zb0.d */
public final class C13370d {

    /* renamed from: a */
    public final String f33185a;

    /* renamed from: b */
    public final C13371a f33186b;

    /* renamed from: c */
    public final List<String> f33187c = C17875h.m44281E("2.0", "2.0.1", "2.6", "3.0", "4.0");

    /* renamed from: d */
    public final Map<String, C13372b> f33188d;

    /* renamed from: e */
    public String f33189e;

    /* renamed from: f */
    public boolean f33190f;

    /* renamed from: g */
    public C12909a f33191g;

    /* renamed from: h */
    public String f33192h;

    /* renamed from: i */
    public Map<Integer, C12913e> f33193i;

    /* renamed from: j */
    public ArrayList<Integer> f33194j;

    /* renamed from: k */
    public int f33195k;

    /* renamed from: l */
    public int f33196l;

    /* renamed from: m */
    public int f33197m;

    /* renamed from: n */
    public int f33198n;

    /* renamed from: o */
    public int f33199o;

    /* renamed from: p */
    public Timer f33200p;

    /* renamed from: zb0.d$a */
    public interface C13371a {
    }

    /* renamed from: zb0.d$b */
    public static final class C13372b {

        /* renamed from: a */
        public boolean f33201a = false;

        /* renamed from: b */
        public zzd f33202b;

        public C13372b(zzd zzd) {
            C24362h.m61211f(zzd, "akVastError");
            this.f33202b = zzd;
        }
    }

    public C13370d(String str, C13304h hVar) {
        C24362h.m61211f(str, "spotId");
        this.f33185a = str;
        this.f33186b = hVar;
        zzd zzd = zzd.XML_FEED_UNSUPPORTED_PLAYLIST;
        zzd zzd2 = zzd.XML_FEED_NO_CREATIVE;
        zzd zzd3 = zzd.NONLINEAR_AD_IN_LINEAR_PLACEMENT;
        this.f33188d = C23826d.m58533X(new Pair("</VAST>", new C13372b(zzd)), new Pair("</Ad>", new C13372b(zzd.XML_FEED_NO_AD_NODE)), new Pair("</InLine>", new C13372b(zzd)), new Pair("</Wrapper>", new C13372b(zzd)), new Pair("</Creatives>", new C13372b(zzd2)), new Pair("</Creative>", new C13372b(zzd2)), new Pair("</MediaFile>", new C13372b(zzd2)), new Pair("</Linear>", new C13372b(zzd3)), new Pair("</NonLinearAds>", new C13372b(zzd3)), new Pair("</NonLinear>", new C13372b(zzd3)));
        this.f33189e = "";
        this.f33195k = 15;
        this.f33196l = 5;
        this.f33197m = 1;
    }

    /* renamed from: a */
    public static int m33649a(String str) {
        String[] strArr;
        boolean z;
        int i;
        int i2;
        int i3 = 0;
        if (!C12954d.m32800c(str)) {
            return 0;
        }
        if (str == null) {
            strArr = null;
        } else {
            Object[] array = C24179b.m60577Y(str, new String[]{":"}, 0, 6).toArray(new String[0]);
            if (array != null) {
                strArr = (String[]) array;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        if (strArr != null && strArr.length == 3) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return 0;
        }
        String str2 = strArr[0];
        C24362h.m61211f(str2, "<this>");
        Integer y = C25080g.m62829y(str2);
        if (y == null) {
            Float x = C25080g.m62828x(str2);
            if (x == null) {
                i = 0;
            } else {
                i = (int) x.floatValue();
            }
        } else {
            i = y.intValue();
        }
        String str3 = strArr[1];
        C24362h.m61211f(str3, "<this>");
        Integer y2 = C25080g.m62829y(str3);
        if (y2 == null) {
            Float x2 = C25080g.m62828x(str3);
            if (x2 == null) {
                i2 = 0;
            } else {
                i2 = (int) x2.floatValue();
            }
        } else {
            i2 = y2.intValue();
        }
        String str4 = strArr[2];
        C24362h.m61211f(str4, "<this>");
        Integer y3 = C25080g.m62829y(str4);
        if (y3 == null) {
            Float x3 = C25080g.m62828x(str4);
            if (x3 != null) {
                i3 = (int) x3.floatValue();
            }
        } else {
            i3 = y3.intValue();
        }
        return C16530d.m42021o(i2, 60, i * 60 * 60, i3);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.Map<java.lang.String, com.umo.ads.c.zzb>, java.util.HashMap] */
    /* renamed from: b */
    public static void m33650b(C12913e eVar, String str, String str2) {
        ArrayList arrayList;
        if (C12954d.m32800c(str) && C12954d.m32800c(str2)) {
            if (eVar.f31953h == null) {
                eVar.f31953h = new LinkedHashMap();
            }
            zzb zzb = (zzb) zzb.zzc.get(str);
            if (zzb == null) {
                zzb = zzb.UNKNOWN;
            }
            LinkedHashMap linkedHashMap = eVar.f31953h;
            C24362h.m61208c(linkedHashMap);
            if (linkedHashMap.containsKey(zzb)) {
                LinkedHashMap linkedHashMap2 = eVar.f31953h;
                C24362h.m61208c(linkedHashMap2);
                C12911c cVar = (C12911c) linkedHashMap2.get(zzb);
                if (cVar != null && (arrayList = cVar.f31963b) != null) {
                    C24362h.m61208c(str2);
                    arrayList.add(str2);
                    return;
                }
                return;
            }
            C12911c cVar2 = new C12911c();
            C24362h.m61211f(zzb, "<set-?>");
            cVar2.f31962a = zzb;
            cVar2.f31964c = false;
            ArrayList arrayList2 = new ArrayList();
            cVar2.f31963b = arrayList2;
            C24362h.m61208c(str2);
            arrayList2.add(str2);
            LinkedHashMap linkedHashMap3 = eVar.f31953h;
            if (linkedHashMap3 != null) {
                C12911c cVar3 = (C12911c) linkedHashMap3.put(zzb, cVar2);
            }
        }
    }

    /* renamed from: c */
    public static void m33651c(C13370d dVar, zzd zzd) {
        UMOAdKitError uMOAdKitError = UMOAdKitError.AD_RESPONSE_PROCESSING_ERROR;
        C13371a aVar = dVar.f33186b;
        if (aVar != null) {
            ((C13304h) aVar).mo40209a(dVar.f33185a, uMOAdKitError, zzd);
        }
    }

    /* renamed from: i */
    public static boolean m33652i(String str) {
        Boolean bool;
        List v = C13233c.m33353v();
        boolean z = true;
        if (v == null || !(!v.isEmpty())) {
            z = false;
        }
        if (!z || !C12954d.m32800c(str)) {
            return false;
        }
        if (v == null) {
            bool = null;
        } else {
            C24362h.m61208c(str);
            bool = Boolean.valueOf(v.contains(str));
        }
        C24362h.m61208c(bool);
        return bool.booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:199:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40252d(boolean r11, com.cubic.umo.p045ad.types.AKVASTCreative r12, com.cubic.umo.p045ad.types.AKVASTAd r13) {
        /*
            r10 = this;
            mc0.e r0 = new mc0.e
            r0.<init>()
            java.lang.String r1 = r12.getCreativeAdId()
            java.lang.String r2 = "<set-?>"
            mf0.C24362h.m61211f(r1, r2)
            java.lang.String r1 = r13.getVastAdId()
            mf0.C24362h.m61211f(r1, r2)
            r0.f31948c = r1
            com.cubic.umo.ad.types.AKVASTLinear r1 = r12.getLinear()
            r3 = 0
            if (r1 != 0) goto L_0x0020
            r1 = r3
            goto L_0x0024
        L_0x0020:
            java.lang.String r1 = r1.getDuration()
        L_0x0024:
            m33649a(r1)
            com.cubic.umo.ad.types.AKVASTLinear r1 = r12.getLinear()
            if (r1 != 0) goto L_0x002f
            r1 = r3
            goto L_0x0033
        L_0x002f:
            java.lang.String r1 = r1.getSkipOffset()
        L_0x0033:
            m33649a(r1)
            com.cubic.umo.ad.types.AKVASTLinear r1 = r12.getLinear()
            if (r1 != 0) goto L_0x003d
            goto L_0x0073
        L_0x003d:
            com.cubic.umo.ad.types.AKVASTTrackingEvents r1 = r1.getTrackingEvents()
            if (r1 != 0) goto L_0x0044
            goto L_0x0073
        L_0x0044:
            java.util.List r1 = r1.getTrackersList()
            if (r1 != 0) goto L_0x004b
            goto L_0x0073
        L_0x004b:
            java.util.Iterator r1 = r1.iterator()
        L_0x004f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0073
            java.lang.Object r4 = r1.next()
            com.cubic.umo.ad.types.AKVASTTracking r4 = (com.cubic.umo.p045ad.types.AKVASTTracking) r4
            java.lang.String r5 = r4.getEventName()
            java.lang.String r4 = r4.getTrackerUrl()
            if (r4 != 0) goto L_0x0067
            r4 = r3
            goto L_0x006f
        L_0x0067:
            java.lang.CharSequence r4 = kotlin.text.C24179b.m60585g0(r4)
            java.lang.String r4 = r4.toString()
        L_0x006f:
            m33650b(r0, r5, r4)
            goto L_0x004f
        L_0x0073:
            com.cubic.umo.ad.types.AKVASTInline r1 = r13.getInline()
            if (r1 != 0) goto L_0x007b
            r1 = r3
            goto L_0x007f
        L_0x007b:
            java.util.List r1 = r1.getImpressionTrackers()
        L_0x007f:
            if (r1 != 0) goto L_0x008d
            com.cubic.umo.ad.types.AKVASTWrapper r1 = r13.getWrapper()
            if (r1 != 0) goto L_0x0089
            r1 = r3
            goto L_0x008d
        L_0x0089:
            java.util.List r1 = r1.getImpressionTrackers()
        L_0x008d:
            if (r1 != 0) goto L_0x0090
            goto L_0x00c3
        L_0x0090:
            java.util.Iterator r1 = r1.iterator()
        L_0x0094:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00c3
            java.lang.Object r4 = r1.next()
            com.cubic.umo.ad.types.AKVASTImpression r4 = (com.cubic.umo.p045ad.types.AKVASTImpression) r4
            java.lang.String r5 = r4.getTrackerUrl()
            boolean r5 = nc0.C12954d.m32800c(r5)
            if (r5 != 0) goto L_0x00ab
            goto L_0x0094
        L_0x00ab:
            com.umo.ads.c.zzb$a r5 = com.umo.ads.p342c.zzb.zzb
            java.lang.String r4 = r4.getTrackerUrl()
            if (r4 != 0) goto L_0x00b5
            r4 = r3
            goto L_0x00bd
        L_0x00b5:
            java.lang.CharSequence r4 = kotlin.text.C24179b.m60585g0(r4)
            java.lang.String r4 = r4.toString()
        L_0x00bd:
            java.lang.String r5 = "Impression"
            m33650b(r0, r5, r4)
            goto L_0x0094
        L_0x00c3:
            boolean r1 = r10.f33190f
            if (r1 != 0) goto L_0x0104
            com.cubic.umo.ad.types.AKVASTInline r1 = r13.getInline()
            if (r1 != 0) goto L_0x00ce
            goto L_0x00d4
        L_0x00ce:
            java.lang.String r1 = r1.getErrorTrackerUrl()
            if (r1 != 0) goto L_0x00d6
        L_0x00d4:
            r1 = r3
            goto L_0x00de
        L_0x00d6:
            java.lang.CharSequence r1 = kotlin.text.C24179b.m60585g0(r1)
            java.lang.String r1 = r1.toString()
        L_0x00de:
            if (r1 != 0) goto L_0x00f7
            com.cubic.umo.ad.types.AKVASTWrapper r1 = r13.getWrapper()
            if (r1 != 0) goto L_0x00e7
            goto L_0x00ed
        L_0x00e7:
            java.lang.String r1 = r1.getErrorTrackerUrl()
            if (r1 != 0) goto L_0x00ef
        L_0x00ed:
            r1 = r3
            goto L_0x00f7
        L_0x00ef:
            java.lang.CharSequence r1 = kotlin.text.C24179b.m60585g0(r1)
            java.lang.String r1 = r1.toString()
        L_0x00f7:
            boolean r4 = nc0.C12954d.m32800c(r1)
            if (r4 == 0) goto L_0x0104
            com.umo.ads.c.zzb$a r4 = com.umo.ads.p342c.zzb.zzb
            java.lang.String r4 = "Error"
            m33650b(r0, r4, r1)
        L_0x0104:
            com.cubic.umo.ad.types.AKVASTLinear r1 = r12.getLinear()
            if (r1 != 0) goto L_0x010b
            goto L_0x011f
        L_0x010b:
            com.cubic.umo.ad.types.AKVASTVideoClicks r1 = r1.getVideoClicks()
            if (r1 != 0) goto L_0x0112
            goto L_0x011f
        L_0x0112:
            com.cubic.umo.ad.types.AKVASTClickThrough r1 = r1.getClickThrough()
            if (r1 != 0) goto L_0x0119
            goto L_0x011f
        L_0x0119:
            java.lang.String r1 = r1.getClickUrl()
            if (r1 != 0) goto L_0x0121
        L_0x011f:
            r1 = r3
            goto L_0x0129
        L_0x0121:
            java.lang.CharSequence r1 = kotlin.text.C24179b.m60585g0(r1)
            java.lang.String r1 = r1.toString()
        L_0x0129:
            r0.f31954i = r1
            com.cubic.umo.ad.types.AKVASTLinear r1 = r12.getLinear()
            if (r1 != 0) goto L_0x0132
            goto L_0x0138
        L_0x0132:
            com.cubic.umo.ad.types.AKVASTVideoClicks r1 = r1.getVideoClicks()
            if (r1 != 0) goto L_0x013a
        L_0x0138:
            r1 = r3
            goto L_0x013e
        L_0x013a:
            java.util.List r1 = r1.getClickTrackers()
        L_0x013e:
            if (r1 != 0) goto L_0x0141
            goto L_0x0174
        L_0x0141:
            java.util.Iterator r1 = r1.iterator()
        L_0x0145:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0174
            java.lang.Object r4 = r1.next()
            com.cubic.umo.ad.types.AKVASTClickTracking r4 = (com.cubic.umo.p045ad.types.AKVASTClickTracking) r4
            java.lang.String r5 = r4.getTrackerUrl()
            boolean r5 = nc0.C12954d.m32800c(r5)
            if (r5 != 0) goto L_0x015c
            goto L_0x0145
        L_0x015c:
            com.umo.ads.c.zzb$a r5 = com.umo.ads.p342c.zzb.zzb
            java.lang.String r4 = r4.getTrackerUrl()
            if (r4 != 0) goto L_0x0166
            r4 = r3
            goto L_0x016e
        L_0x0166:
            java.lang.CharSequence r4 = kotlin.text.C24179b.m60585g0(r4)
            java.lang.String r4 = r4.toString()
        L_0x016e:
            java.lang.String r5 = "Click"
            m33650b(r0, r5, r4)
            goto L_0x0145
        L_0x0174:
            r1 = 0
            if (r11 == 0) goto L_0x0303
            com.cubic.umo.ad.types.AKVASTLinear r11 = r12.getLinear()
            if (r11 != 0) goto L_0x017f
            goto L_0x02f0
        L_0x017f:
            com.cubic.umo.ad.types.AKVASTMediaFiles r11 = r11.getMediaFiles()
            if (r11 != 0) goto L_0x0187
            goto L_0x02f0
        L_0x0187:
            java.util.List r4 = r11.getMediaFiles()
            if (r4 != 0) goto L_0x018f
            goto L_0x02d7
        L_0x018f:
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 0
        L_0x0195:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0271
            java.lang.Object r7 = r4.next()
            com.cubic.umo.ad.types.AKVASTMediaFile r7 = (com.cubic.umo.p045ad.types.AKVASTMediaFile) r7
            java.lang.String r8 = r7.getType()
            boolean r8 = nc0.C12954d.m32800c(r8)
            if (r8 == 0) goto L_0x01cc
            java.lang.String r5 = r7.getType()
            boolean r5 = m33652i(r5)
            java.util.List<java.lang.String> r6 = zb0.C13374f.f33205a
            java.lang.String r8 = r7.getType()
            boolean r6 = r6.contains(r8)
            if (r5 != 0) goto L_0x01c1
            if (r6 == 0) goto L_0x0195
        L_0x01c1:
            java.lang.String r8 = r7.getMediaUrl()
            boolean r8 = nc0.C12954d.m32800c(r8)
            if (r8 != 0) goto L_0x01cc
            goto L_0x0195
        L_0x01cc:
            mc0.b r8 = new mc0.b
            r8.<init>()
            java.lang.String r9 = r7.getDelivery()
            mf0.C24362h.m61211f(r9, r2)
            java.lang.String r9 = r7.getType()
            mf0.C24362h.m61211f(r9, r2)
            r8.f31957a = r9
            java.lang.String r9 = r7.getBitrate()
            int r9 = nc0.C12954d.m32801d(r9)
            r8.f31958b = r9
            java.lang.String r9 = r7.getId()
            mf0.C24362h.m61211f(r9, r2)
            java.lang.String r9 = r7.getWidth()
            nc0.C12954d.m32801d(r9)
            java.lang.String r9 = r7.getHeight()
            nc0.C12954d.m32801d(r9)
            java.lang.String r9 = r7.getScalable()
            java.lang.Boolean.parseBoolean(r9)
            java.lang.String r9 = r7.getMaintainAspectRatio()
            java.lang.Boolean.parseBoolean(r9)
            java.lang.String r9 = r7.getApiFramework()
            mf0.C24362h.m61211f(r9, r2)
            r8.f31959c = r9
            java.lang.String r9 = r7.getMinBitrate()
            nc0.C12954d.m32801d(r9)
            java.lang.String r9 = r7.getMaxBitrate()
            nc0.C12954d.m32801d(r9)
            java.lang.String r9 = r7.getCodec()
            mf0.C24362h.m61211f(r9, r2)
            java.lang.String r7 = r7.getMediaUrl()
            if (r7 != 0) goto L_0x0234
            r7 = r3
            goto L_0x023c
        L_0x0234:
            java.lang.CharSequence r7 = kotlin.text.C24179b.m60585g0(r7)
            java.lang.String r7 = r7.toString()
        L_0x023c:
            r8.f31960d = r7
            if (r5 == 0) goto L_0x0247
            com.umo.ads.u.zzl r7 = com.umo.ads.p350u.zzl.VIDEO
            mf0.C24362h.m61211f(r7, r2)
            r8.f31961e = r7
        L_0x0247:
            if (r6 == 0) goto L_0x0250
            com.umo.ads.u.zzl r7 = com.umo.ads.p350u.zzl.JS
            mf0.C24362h.m61211f(r7, r2)
            r8.f31961e = r7
        L_0x0250:
            if (r5 != 0) goto L_0x025b
            if (r6 != 0) goto L_0x025b
            com.umo.ads.u.zzl r7 = com.umo.ads.p350u.zzl.VIDEO
            mf0.C24362h.m61211f(r7, r2)
            r8.f31961e = r7
        L_0x025b:
            java.util.List<mc0.b> r7 = r0.f31949d
            if (r7 != 0) goto L_0x0266
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.f31949d = r7
        L_0x0266:
            java.util.List<mc0.b> r7 = r0.f31949d
            if (r7 != 0) goto L_0x026c
            goto L_0x0195
        L_0x026c:
            r7.add(r8)
            goto L_0x0195
        L_0x0271:
            java.util.List r11 = r11.getInteractiveCreativeFiles()
            if (r11 != 0) goto L_0x0278
            goto L_0x02d7
        L_0x0278:
            java.util.Iterator r11 = r11.iterator()
        L_0x027c:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x02d7
            java.lang.Object r4 = r11.next()
            com.cubic.umo.ad.types.AKVASInteractiveCreativeFile r4 = (com.cubic.umo.p045ad.types.AKVASInteractiveCreativeFile) r4
            java.lang.String r5 = r4.getCreativeFileUrl()
            boolean r5 = nc0.C12954d.m32800c(r5)
            if (r5 != 0) goto L_0x0293
            goto L_0x027c
        L_0x0293:
            mc0.b r5 = new mc0.b
            r5.<init>()
            java.lang.String r6 = r4.getType()
            mf0.C24362h.m61211f(r6, r2)
            r5.f31957a = r6
            java.lang.String r6 = r4.getApiFramework()
            mf0.C24362h.m61211f(r6, r2)
            r5.f31959c = r6
            java.lang.String r4 = r4.getCreativeFileUrl()
            if (r4 != 0) goto L_0x02b2
            r4 = r3
            goto L_0x02ba
        L_0x02b2:
            java.lang.CharSequence r4 = kotlin.text.C24179b.m60585g0(r4)
            java.lang.String r4 = r4.toString()
        L_0x02ba:
            r5.f31960d = r4
            com.umo.ads.u.zzl r4 = com.umo.ads.p350u.zzl.JS
            mf0.C24362h.m61211f(r4, r2)
            r5.f31961e = r4
            java.util.List<mc0.b> r4 = r0.f31949d
            if (r4 != 0) goto L_0x02ce
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.f31949d = r4
        L_0x02ce:
            java.util.List<mc0.b> r4 = r0.f31949d
            if (r4 != 0) goto L_0x02d3
            goto L_0x027c
        L_0x02d3:
            r4.add(r5)
            goto L_0x027c
        L_0x02d7:
            com.cubic.umo.ad.types.AKVASTLinear r11 = r12.getLinear()
            if (r11 != 0) goto L_0x02de
            goto L_0x02e4
        L_0x02de:
            java.lang.String r11 = r11.getAdParameters()
            if (r11 != 0) goto L_0x02e6
        L_0x02e4:
            r11 = r3
            goto L_0x02ee
        L_0x02e6:
            java.lang.CharSequence r11 = kotlin.text.C24179b.m60585g0(r11)
            java.lang.String r11 = r11.toString()
        L_0x02ee:
            r0.f31952g = r11
        L_0x02f0:
            java.util.List<mc0.b> r11 = r0.f31949d
            r2 = 1
            if (r11 == 0) goto L_0x02fd
            boolean r11 = r11.isEmpty()
            r11 = r11 ^ r2
            if (r11 == 0) goto L_0x02fd
            goto L_0x02fe
        L_0x02fd:
            r2 = 0
        L_0x02fe:
            if (r2 != 0) goto L_0x0303
            r0 = r3
            goto L_0x03da
        L_0x0303:
            com.cubic.umo.ad.types.AKVASTInline r11 = r13.getInline()
            if (r11 != 0) goto L_0x030b
            r11 = r3
            goto L_0x030f
        L_0x030b:
            com.cubic.umo.ad.types.AKVASTExtensions r11 = r11.getExtensions()
        L_0x030f:
            if (r11 != 0) goto L_0x031d
            com.cubic.umo.ad.types.AKVASTWrapper r11 = r13.getWrapper()
            if (r11 != 0) goto L_0x0319
            r11 = r3
            goto L_0x031d
        L_0x0319:
            com.cubic.umo.ad.types.AKVASTExtensions r11 = r11.getExtensions()
        L_0x031d:
            if (r11 != 0) goto L_0x0321
            goto L_0x03da
        L_0x0321:
            java.util.List r11 = r11.getExtensionsList()
            if (r11 != 0) goto L_0x0329
            goto L_0x03da
        L_0x0329:
            java.util.Iterator r11 = r11.iterator()
        L_0x032d:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x03da
            java.lang.Object r13 = r11.next()
            com.cubic.umo.ad.types.AKVASTExtension r13 = (com.cubic.umo.p045ad.types.AKVASTExtension) r13
            boolean r2 = r10.f33190f
            if (r2 == 0) goto L_0x032d
            java.lang.String r2 = r13.getType()
            java.lang.String r4 = "UMO"
            boolean r2 = mf0.C24362h.m61206a(r2, r4)
            if (r2 == 0) goto L_0x0395
            int r2 = r0.f31955j
            if (r2 != 0) goto L_0x0353
            int r2 = r13.getAdExpiryTimeMinutes()
            r0.f31955j = r2
        L_0x0353:
            com.cubic.umo.ad.types.AKVASTExtensionViewabilityTrackers r2 = r13.getViewabilityTrackers()
            if (r2 != 0) goto L_0x035b
            r2 = r3
            goto L_0x035f
        L_0x035b:
            java.util.List r2 = r2.getViewabilityTrackers()
        L_0x035f:
            if (r2 != 0) goto L_0x0362
            goto L_0x0395
        L_0x0362:
            java.util.Iterator r2 = r2.iterator()
        L_0x0366:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0395
            java.lang.Object r4 = r2.next()
            com.cubic.umo.ad.types.AKViewabilityTracker r4 = (com.cubic.umo.p045ad.types.AKViewabilityTracker) r4
            java.lang.String r5 = r4.getTrackerUrl()
            boolean r5 = nc0.C12954d.m32800c(r5)
            if (r5 != 0) goto L_0x037d
            goto L_0x0366
        L_0x037d:
            com.umo.ads.c.zzb$a r5 = com.umo.ads.p342c.zzb.zzb
            java.lang.String r4 = r4.getTrackerUrl()
            if (r4 != 0) goto L_0x0387
            r4 = r3
            goto L_0x038f
        L_0x0387:
            java.lang.CharSequence r4 = kotlin.text.C24179b.m60585g0(r4)
            java.lang.String r4 = r4.toString()
        L_0x038f:
            java.lang.String r5 = "Viewability"
            m33650b(r0, r5, r4)
            goto L_0x0366
        L_0x0395:
            java.lang.String r2 = r13.getType()
            java.lang.String r4 = "UMOVideoAd"
            boolean r2 = mf0.C24362h.m61206a(r2, r4)
            if (r2 == 0) goto L_0x032d
            com.umo.ads.u.zzq r2 = new com.umo.ads.u.zzq
            r2.<init>(r1)
            java.lang.String r4 = r13.getThumbnailUrl()
            if (r4 != 0) goto L_0x03ae
            r4 = r3
            goto L_0x03b6
        L_0x03ae:
            java.lang.CharSequence r4 = kotlin.text.C24179b.m60585g0(r4)
            java.lang.String r4 = r4.toString()
        L_0x03b6:
            r2.f30873b = r4
            java.lang.String r4 = r13.getAdTitle()
            r2.f30874c = r4
            java.lang.String r4 = r13.getAdDescription()
            r2.f30875d = r4
            java.lang.String r4 = r13.getAdCTA()
            r2.f30876e = r4
            java.lang.String r4 = r13.getDisplayUrl()
            r2.f30877f = r4
            java.lang.String r13 = r13.getDestinationUrl()
            r2.f30878g = r13
            r0.f31956k = r2
            goto L_0x032d
        L_0x03da:
            if (r0 == 0) goto L_0x0455
            r11 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r13 = r12.getSequence()
            boolean r13 = nc0.C12954d.m32800c(r13)
            if (r13 == 0) goto L_0x040a
            java.lang.String r11 = r12.getSequence()
            java.lang.String r12 = "<this>"
            mf0.C24362h.m61211f(r11, r12)
            java.lang.Integer r12 = uh0.C25080g.m62829y(r11)
            if (r12 != 0) goto L_0x0406
            java.lang.Float r11 = uh0.C25080g.m62828x(r11)
            if (r11 != 0) goto L_0x0400
            r11 = -1
            goto L_0x040a
        L_0x0400:
            float r11 = r11.floatValue()
            int r11 = (int) r11
            goto L_0x040a
        L_0x0406:
            int r11 = r12.intValue()
        L_0x040a:
            java.util.Map<java.lang.Integer, mc0.e> r12 = r10.f33193i
            if (r12 != 0) goto L_0x0415
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            r10.f33193i = r12
        L_0x0415:
            java.util.Map<java.lang.Integer, mc0.e> r12 = r10.f33193i
            if (r12 != 0) goto L_0x041a
            goto L_0x0426
        L_0x041a:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            boolean r12 = r12.containsKey(r13)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r12)
        L_0x0426:
            mf0.C24362h.m61208c(r3)
            boolean r12 = r3.booleanValue()
            if (r12 != 0) goto L_0x0455
            java.util.Map<java.lang.Integer, mc0.e> r12 = r10.f33193i
            if (r12 != 0) goto L_0x0434
            goto L_0x043e
        L_0x0434:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            java.lang.Object r12 = r12.put(r13, r0)
            mc0.e r12 = (mc0.C12913e) r12
        L_0x043e:
            java.util.ArrayList<java.lang.Integer> r12 = r10.f33194j
            if (r12 != 0) goto L_0x0449
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r10.f33194j = r12
        L_0x0449:
            java.util.ArrayList<java.lang.Integer> r12 = r10.f33194j
            if (r12 != 0) goto L_0x044e
            goto L_0x0455
        L_0x044e:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12.add(r11)
        L_0x0455:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zb0.C13370d.mo40252d(boolean, com.cubic.umo.ad.types.AKVASTCreative, com.cubic.umo.ad.types.AKVASTAd):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0312 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0122 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f9  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo40253e() {
        /*
            r15 = this;
            mc0.a r0 = r15.f33191g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r15.f33185a
            boolean r3 = nc0.C12954d.m32800c(r2)
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x001a
            java.lang.String r2 = p584jl.C17885a.m44403H0(r2)
            goto L_0x001b
        L_0x001a:
            r2 = r4
        L_0x001b:
            r0.append(r2)
            java.lang.String r2 = "(VASTAdId: "
            r0.append(r2)
            mc0.a r3 = r15.f33191g
            if (r3 != 0) goto L_0x0029
            r3 = 0
            goto L_0x002b
        L_0x0029:
            java.lang.String r3 = r3.f31948c
        L_0x002b:
            r5 = 41
            java.lang.String r0 = p001a0.C0016g.m30n(r0, r3, r5)
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "AD_PICKER: Checking if VPAID Ad is Present"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = "..."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.mo6672i(r5)
            io.github.g00fy2.versioncompare.a r3 = new io.github.g00fy2.versioncompare.a
            java.lang.String r5 = r15.f33189e
            r3.<init>(r5)
            io.github.g00fy2.versioncompare.a r5 = new io.github.g00fy2.versioncompare.a
            java.lang.String r7 = "4.0"
            r5.<init>(r7)
            int r3 = r3.compareTo(r5)
            r5 = 1
            if (r3 >= 0) goto L_0x0063
            r3 = 1
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            mc0.a r7 = r15.f33191g
            java.lang.String r8 = "): "
            java.lang.String r9 = "<set-?>"
            if (r7 != 0) goto L_0x006e
            goto L_0x00f6
        L_0x006e:
            java.util.List<mc0.b> r7 = r7.f31949d
            if (r7 != 0) goto L_0x0074
            goto L_0x00f6
        L_0x0074:
            java.util.Iterator r7 = r7.iterator()
        L_0x0078:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00f6
            java.lang.Object r10 = r7.next()
            mc0.b r10 = (mc0.C12910b) r10
            if (r3 == 0) goto L_0x0091
            java.lang.String r11 = r10.f31959c
            java.lang.String r12 = "vpaid"
            boolean r11 = uh0.C25081h.m62830A(r11, r12, r5)
            if (r11 != 0) goto L_0x0091
            goto L_0x0078
        L_0x0091:
            com.umo.ads.u.zzl r11 = r10.f31961e
            com.umo.ads.u.zzl r12 = com.umo.ads.p350u.zzl.JS
            if (r11 != r12) goto L_0x0078
            java.lang.String r11 = r10.f31960d
            boolean r11 = nc0.C12954d.m32800c(r11)
            if (r11 == 0) goto L_0x0078
            mc0.a r3 = r15.f33191g
            if (r3 != 0) goto L_0x00a4
            goto L_0x00a8
        L_0x00a4:
            java.lang.String r7 = r10.f31960d
            r3.f31950e = r7
        L_0x00a8:
            if (r3 != 0) goto L_0x00ab
            goto L_0x00b2
        L_0x00ab:
            com.umo.ads.u.zzf r7 = com.umo.ads.p350u.zzf.VPAID
            mf0.C24362h.m61211f(r7, r9)
            r3.f31947b = r7
        L_0x00b2:
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.String r7 = "AD_PICKER: VPAID Ad picked for Playing"
            java.lang.StringBuilder r7 = ce0.C21100e.m49315J0(r7)
            mc0.a r10 = r15.f33191g
            if (r10 != 0) goto L_0x00c0
            r10 = 0
            goto L_0x00c2
        L_0x00c0:
            java.lang.String r10 = r10.f31946a
        L_0x00c2:
            boolean r11 = nc0.C12954d.m32800c(r10)
            if (r11 == 0) goto L_0x00cd
            java.lang.String r10 = p584jl.C17885a.m44403H0(r10)
            goto L_0x00ce
        L_0x00cd:
            r10 = r4
        L_0x00ce:
            r7.append(r10)
            r7.append(r2)
            mc0.a r10 = r15.f33191g
            if (r10 != 0) goto L_0x00da
            r10 = 0
            goto L_0x00dc
        L_0x00da:
            java.lang.String r10 = r10.f31948c
        L_0x00dc:
            r7.append(r10)
            r7.append(r8)
            mc0.a r10 = r15.f33191g
            if (r10 != 0) goto L_0x00e8
            r10 = 0
            goto L_0x00ea
        L_0x00e8:
            java.lang.String r10 = r10.f31950e
        L_0x00ea:
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r3.mo6672i(r7)
            r3 = 1
            goto L_0x00f7
        L_0x00f6:
            r3 = 0
        L_0x00f7:
            if (r3 != 0) goto L_0x0382
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "AD_PICKER: VPAID Ad not available. Checking if Video Ad is Present"
            r7.append(r10)
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r3.mo6667d(r6)
            mc0.a r3 = r15.f33191g
            if (r3 != 0) goto L_0x0118
            goto L_0x0381
        L_0x0118:
            java.util.List<mc0.b> r3 = r3.f31949d
            if (r3 != 0) goto L_0x011e
            goto L_0x0381
        L_0x011e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0122:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0381
            java.lang.Object r6 = r3.next()
            mc0.b r6 = (mc0.C12910b) r6
            java.lang.String r7 = r6.f31957a
            boolean r7 = m33652i(r7)
            if (r7 == 0) goto L_0x0122
            java.lang.String r6 = r6.f31960d
            boolean r6 = nc0.C12954d.m32800c(r6)
            if (r6 == 0) goto L_0x0122
            java.util.List r6 = wb0.C13233c.m33353v()
            if (r6 != 0) goto L_0x0146
            goto L_0x030d
        L_0x0146:
            java.util.Iterator r6 = r6.iterator()
        L_0x014a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x030d
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            mc0.a r10 = r15.f33191g
            if (r10 != 0) goto L_0x015b
            goto L_0x015f
        L_0x015b:
            java.util.List<mc0.b> r10 = r10.f31949d
            if (r10 != 0) goto L_0x0161
        L_0x015f:
            r7 = 0
            goto L_0x0194
        L_0x0161:
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
        L_0x0166:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0193
            java.lang.Object r12 = r10.next()
            mc0.b r12 = (mc0.C12910b) r12
            com.umo.ads.u.zzl r13 = r12.f31961e
            com.umo.ads.u.zzl r14 = com.umo.ads.p350u.zzl.VIDEO
            if (r13 != r14) goto L_0x0166
            java.lang.String r13 = r12.f31957a
            boolean r13 = uh0.C25081h.m62830A(r13, r7, r5)
            if (r13 == 0) goto L_0x0166
            java.lang.String r13 = r12.f31960d
            boolean r13 = nc0.C12954d.m32800c(r13)
            if (r13 == 0) goto L_0x0166
            if (r11 != 0) goto L_0x018f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x018f:
            r11.add(r12)
            goto L_0x0166
        L_0x0193:
            r7 = r11
        L_0x0194:
            if (r7 == 0) goto L_0x019f
            boolean r10 = r7.isEmpty()
            r10 = r10 ^ r5
            if (r10 == 0) goto L_0x019f
            r10 = 1
            goto L_0x01a0
        L_0x019f:
            r10 = 0
        L_0x01a0:
            if (r10 == 0) goto L_0x014a
            yb0.g r6 = yb0.C13302g.f33013b
            com.cubic.umo.ad.types.AKHostedConfig r6 = wb0.C13233c.f32845d
            if (r6 != 0) goto L_0x01a9
            goto L_0x01af
        L_0x01a9:
            com.cubic.umo.ad.types.AKRollParams r6 = r6.getRollParams()
            if (r6 != 0) goto L_0x01b1
        L_0x01af:
            r6 = 0
            goto L_0x01b5
        L_0x01b1:
            boolean r6 = r6.getPickHighBitrateCreative()
        L_0x01b5:
            com.cubic.umo.ad.types.AKHostedConfig r10 = wb0.C13233c.f32845d
            if (r10 != 0) goto L_0x01ba
            goto L_0x01c0
        L_0x01ba:
            com.cubic.umo.ad.types.AKRollParams r10 = r10.getRollParams()
            if (r10 != 0) goto L_0x01c2
        L_0x01c0:
            r10 = 0
            goto L_0x01c6
        L_0x01c2:
            boolean r10 = r10.getPickCreativeByNetwork()
        L_0x01c6:
            if (r10 == 0) goto L_0x0275
            android.content.Context r6 = wb0.C13233c.m33333b()
            java.lang.String r10 = "connectivity"
            java.lang.Object r10 = r6.getSystemService(r10)
            if (r10 == 0) goto L_0x026d
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()
            if (r10 == 0) goto L_0x026b
            boolean r11 = r10.isConnected()
            if (r11 == 0) goto L_0x026b
            int r11 = r10.getType()
            int r10 = r10.getSubtype()
            if (r11 == 0) goto L_0x0260
            if (r11 == r5) goto L_0x01f0
            goto L_0x0266
        L_0x01f0:
            android.content.Context r6 = r6.getApplicationContext()
            java.lang.String r10 = "wifi"
            java.lang.Object r6 = r6.getSystemService(r10)
            if (r6 == 0) goto L_0x0258
            android.net.wifi.WifiManager r6 = (android.net.wifi.WifiManager) r6
            android.net.wifi.WifiInfo r6 = r6.getConnectionInfo()
            int r10 = r6.getRssi()
            r11 = 5
            android.net.wifi.WifiManager.calculateSignalLevel(r10, r11)
            int r6 = r6.getRssi()
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "WIFi_SIGNAL_STRENGTH: numberOfLevels: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = ", Rssi: "
            r12.append(r11)
            r12.append(r6)
            java.lang.String r11 = r12.toString()
            r10.mo6672i(r11)
            r10 = -50
            if (r6 > 0) goto L_0x0233
            if (r6 < r10) goto L_0x0233
            goto L_0x0239
        L_0x0233:
            if (r6 >= r10) goto L_0x023b
            r10 = -70
            if (r6 < r10) goto L_0x023b
        L_0x0239:
            r6 = 1
            goto L_0x023c
        L_0x023b:
            r6 = 0
        L_0x023c:
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "*************** Is WIFI Signal Strength Good?: "
            r11.append(r12)
            r11.append(r6)
            java.lang.String r12 = " ***************"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.mo6672i(r11)
            goto L_0x0267
        L_0x0258:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.net.wifi.WifiManager"
            r0.<init>(r1)
            throw r0
        L_0x0260:
            switch(r10) {
                case 3: goto L_0x0264;
                case 4: goto L_0x0263;
                case 5: goto L_0x0264;
                case 6: goto L_0x0264;
                case 7: goto L_0x0263;
                case 8: goto L_0x0264;
                case 9: goto L_0x0264;
                case 10: goto L_0x0264;
                case 11: goto L_0x0263;
                case 12: goto L_0x0264;
                case 13: goto L_0x0264;
                case 14: goto L_0x0264;
                case 15: goto L_0x0264;
                case 16: goto L_0x0263;
                case 17: goto L_0x0264;
                case 18: goto L_0x0264;
                case 19: goto L_0x0264;
                case 20: goto L_0x0264;
                default: goto L_0x0263;
            }
        L_0x0263:
            goto L_0x0266
        L_0x0264:
            r6 = 1
            goto L_0x0267
        L_0x0266:
            r6 = 0
        L_0x0267:
            if (r6 == 0) goto L_0x026b
            r6 = 1
            goto L_0x0275
        L_0x026b:
            r6 = 0
            goto L_0x0275
        L_0x026d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            r0.<init>(r1)
            throw r0
        L_0x0275:
            if (r7 != 0) goto L_0x0279
            r10 = 0
            goto L_0x0282
        L_0x0279:
            f20.c r10 = new f20.c
            r10.<init>(r5)
            java.util.List r10 = kotlin.collections.C23825c.m58496H0(r7, r10)
        L_0x0282:
            if (r6 == 0) goto L_0x02ae
            kotlin.Pair r6 = new kotlin.Pair
            if (r10 != 0) goto L_0x0289
            goto L_0x0296
        L_0x0289:
            java.lang.Object r11 = kotlin.collections.C23825c.m58513j0(r10)
            mc0.b r11 = (mc0.C12910b) r11
            if (r11 != 0) goto L_0x0292
            goto L_0x0296
        L_0x0292:
            java.lang.String r11 = r11.f31960d
            if (r11 != 0) goto L_0x0297
        L_0x0296:
            r11 = r4
        L_0x0297:
            if (r10 != 0) goto L_0x029a
            goto L_0x02a2
        L_0x029a:
            java.lang.Object r10 = kotlin.collections.C23825c.m58513j0(r10)
            mc0.b r10 = (mc0.C12910b) r10
            if (r10 != 0) goto L_0x02a4
        L_0x02a2:
            r10 = 0
            goto L_0x02a6
        L_0x02a4:
            int r10 = r10.f31958b
        L_0x02a6:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.<init>(r11, r10)
            goto L_0x02d7
        L_0x02ae:
            kotlin.Pair r6 = new kotlin.Pair
            if (r10 != 0) goto L_0x02b3
            goto L_0x02c0
        L_0x02b3:
            java.lang.Object r11 = kotlin.collections.C23825c.m58522s0(r10)
            mc0.b r11 = (mc0.C12910b) r11
            if (r11 != 0) goto L_0x02bc
            goto L_0x02c0
        L_0x02bc:
            java.lang.String r11 = r11.f31960d
            if (r11 != 0) goto L_0x02c1
        L_0x02c0:
            r11 = r4
        L_0x02c1:
            if (r10 != 0) goto L_0x02c4
            goto L_0x02cc
        L_0x02c4:
            java.lang.Object r10 = kotlin.collections.C23825c.m58522s0(r10)
            mc0.b r10 = (mc0.C12910b) r10
            if (r10 != 0) goto L_0x02ce
        L_0x02cc:
            r10 = 0
            goto L_0x02d0
        L_0x02ce:
            int r10 = r10.f31958b
        L_0x02d0:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.<init>(r11, r10)
        L_0x02d7:
            java.lang.Object r10 = r6.mo59068c()
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = nc0.C12954d.m32800c(r10)
            if (r10 != 0) goto L_0x030e
            kotlin.Pair r6 = new kotlin.Pair
            if (r7 != 0) goto L_0x02e8
            goto L_0x02f5
        L_0x02e8:
            java.lang.Object r10 = kotlin.collections.C23825c.m58513j0(r7)
            mc0.b r10 = (mc0.C12910b) r10
            if (r10 != 0) goto L_0x02f1
            goto L_0x02f5
        L_0x02f1:
            java.lang.String r10 = r10.f31960d
            if (r10 != 0) goto L_0x02f6
        L_0x02f5:
            r10 = r4
        L_0x02f6:
            if (r7 != 0) goto L_0x02f9
            goto L_0x0301
        L_0x02f9:
            java.lang.Object r7 = kotlin.collections.C23825c.m58513j0(r7)
            mc0.b r7 = (mc0.C12910b) r7
            if (r7 != 0) goto L_0x0303
        L_0x0301:
            r7 = 0
            goto L_0x0305
        L_0x0303:
            int r7 = r7.f31958b
        L_0x0305:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.<init>(r10, r7)
            goto L_0x030e
        L_0x030d:
            r6 = 0
        L_0x030e:
            if (r6 != 0) goto L_0x0312
            goto L_0x0122
        L_0x0312:
            mc0.a r3 = r15.f33191g
            if (r3 != 0) goto L_0x0317
            goto L_0x031f
        L_0x0317:
            java.lang.Object r5 = r6.mo59068c()
            java.lang.String r5 = (java.lang.String) r5
            r3.f31950e = r5
        L_0x031f:
            mc0.a r3 = r15.f33191g
            if (r3 != 0) goto L_0x0324
            goto L_0x032b
        L_0x0324:
            com.umo.ads.u.zzf r5 = com.umo.ads.p350u.zzf.VIDEO
            mf0.C24362h.m61211f(r5, r9)
            r3.f31947b = r5
        L_0x032b:
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.String r5 = "AD_PICKER: VIDEO Ad picked for Playing "
            java.lang.StringBuilder r5 = ce0.C21100e.m49315J0(r5)
            mc0.a r7 = r15.f33191g
            if (r7 != 0) goto L_0x0339
            r7 = 0
            goto L_0x033b
        L_0x0339:
            java.lang.String r7 = r7.f31946a
        L_0x033b:
            boolean r10 = nc0.C12954d.m32800c(r7)
            if (r10 == 0) goto L_0x0346
            java.lang.String r7 = p584jl.C17885a.m44403H0(r7)
            goto L_0x0347
        L_0x0346:
            r7 = r4
        L_0x0347:
            r5.append(r7)
            r5.append(r2)
            mc0.a r7 = r15.f33191g
            if (r7 != 0) goto L_0x0353
            r7 = 0
            goto L_0x0355
        L_0x0353:
            java.lang.String r7 = r7.f31948c
        L_0x0355:
            r5.append(r7)
            java.lang.String r7 = ", Bitrate: "
            r5.append(r7)
            java.lang.Object r6 = r6.mo59069d()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5.append(r6)
            r5.append(r8)
            mc0.a r6 = r15.f33191g
            if (r6 != 0) goto L_0x0373
            r6 = 0
            goto L_0x0375
        L_0x0373:
            java.lang.String r6 = r6.f31950e
        L_0x0375:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.mo6672i(r5)
            r3 = 1
            goto L_0x0382
        L_0x0381:
            r3 = 0
        L_0x0382:
            if (r3 != 0) goto L_0x03f1
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.String r5 = "AD_PICKER: Video Ad not available. Attempting to pick the first Ad, if received"
            java.lang.String r5 = mf0.C24362h.m61216k(r0, r5)
            r3.mo6667d(r5)
            mc0.a r3 = r15.f33191g
            if (r3 != 0) goto L_0x0394
            goto L_0x03f2
        L_0x0394:
            java.util.List<mc0.b> r5 = r3.f31949d
            if (r5 != 0) goto L_0x0399
            goto L_0x03f2
        L_0x0399:
            java.lang.Object r1 = r5.get(r1)
            mc0.b r1 = (mc0.C12910b) r1
            java.lang.String r1 = r1.f31960d
            r3.f31950e = r1
            mc0.a r1 = r15.f33191g
            if (r1 != 0) goto L_0x03a8
            goto L_0x03af
        L_0x03a8:
            com.umo.ads.u.zzf r3 = com.umo.ads.p350u.zzf.VIDEO
            mf0.C24362h.m61211f(r3, r9)
            r1.f31947b = r3
        L_0x03af:
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r3 = "AD_PICKER: FIRST Ad picked for Playing "
            java.lang.StringBuilder r3 = ce0.C21100e.m49315J0(r3)
            mc0.a r5 = r15.f33191g
            if (r5 != 0) goto L_0x03bd
            r5 = 0
            goto L_0x03bf
        L_0x03bd:
            java.lang.String r5 = r5.f31946a
        L_0x03bf:
            boolean r6 = nc0.C12954d.m32800c(r5)
            if (r6 == 0) goto L_0x03c9
            java.lang.String r4 = p584jl.C17885a.m44403H0(r5)
        L_0x03c9:
            r3.append(r4)
            r3.append(r2)
            mc0.a r2 = r15.f33191g
            if (r2 != 0) goto L_0x03d5
            r2 = 0
            goto L_0x03d7
        L_0x03d5:
            java.lang.String r2 = r2.f31948c
        L_0x03d7:
            r3.append(r2)
            r3.append(r8)
            mc0.a r2 = r15.f33191g
            if (r2 != 0) goto L_0x03e3
            r2 = 0
            goto L_0x03e5
        L_0x03e3:
            java.lang.String r2 = r2.f31950e
        L_0x03e5:
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.mo6672i(r2)
            r1 = 1
            goto L_0x03f2
        L_0x03f1:
            r1 = r3
        L_0x03f2:
            if (r1 != 0) goto L_0x03ff
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = "AD_PICKER: No Ad Picked up for playing"
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r3)
            r2.mo6667d(r0)
        L_0x03ff:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zb0.C13370d.mo40253e():boolean");
    }

    /* renamed from: f */
    public final void mo40254f() {
        if (this.f33200p != null) {
            C7557a.f23040a.mo6672i("WRAPPER_RETRY: Stopping Wrapper Retry Timer.");
            Timer timer = this.f33200p;
            if (timer != null) {
                timer.cancel();
            }
            this.f33200p = null;
        }
    }

    /* renamed from: g */
    public final void mo40255g(String str) {
        zzd zzd;
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("VAST_PARSER: ");
        J0.append(C25081h.m62833D(str, "/", "", false));
        J0.append(" node not found.");
        logger.mo6667d(J0.toString());
        C13372b bVar = this.f33188d.get(str);
        if (bVar == null) {
            zzd = null;
        } else {
            zzd = bVar.f33202b;
        }
        C24362h.m61208c(zzd);
        m33651c(this, zzd);
    }

    /* renamed from: h */
    public final boolean mo40256h(String str) {
        C13372b bVar;
        if (!this.f33188d.containsKey(str) || (bVar = this.f33188d.get(str)) == null) {
            return false;
        }
        return bVar.f33201a;
    }
}
