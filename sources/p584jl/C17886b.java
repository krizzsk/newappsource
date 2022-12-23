package p584jl;

import ac0.C7557a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.location.Location;
import android.util.Base64;
import bi0.C21079q;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.types.AKHostedConfig;
import com.cubic.umo.p045ad.types.AKHostedConfigJsonAdapter;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.moovit.ads.AdTargeting;
import com.moovit.commons.geo.LatLonE6;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonDataException;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.directsales.MVAdTargeting;
import com.umo.ads.p351v.zza;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import kotlin.collections.C23825c;
import lf0.C24236l;
import lh0.C24307v;
import mf0.C24362h;
import nc0.C12954d;
import p026b7.C1502g;
import p043ch.C13830a;
import p043ch.C13831b;
import p043ch.qos.logback.classic.Logger;
import p389bl.C13637c;
import p404ce.C13791f;
import p404ce.C13806s;
import p406cg.C13821j;
import p434dd.C16571p;
import p434dd.C16590z;
import p438dh.C16666a;
import p583jk.C17884p;
import p720pe.C18919c;
import qg0.C24767p;
import w10.C20268a;
import wb0.C13233c;
import yb0.C13301f;
import zf0.C25432c;

/* renamed from: jl.b */
public final class C17886b implements C13791f, C13821j, C16571p, C18919c, C24767p {

    /* renamed from: b */
    public static final /* synthetic */ C17886b f45888b = new C17886b();

    /* renamed from: c */
    public static final C21079q f45889c = new C21079q("NO_DECISION");

    /* renamed from: d */
    public static final C17886b f45890d = new C17886b();

    /* renamed from: e */
    public static boolean f45891e;

    /* renamed from: f */
    public static final int[] f45892f = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: h */
    public static void m44482h(C13831b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                bVar.mo40765c(i5, i4);
                bVar.mo40765c(i5, i6);
                bVar.mo40765c(i4, i5);
                bVar.mo40765c(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        bVar.mo40765c(i7, i7);
        int i8 = i7 + 1;
        bVar.mo40765c(i8, i7);
        bVar.mo40765c(i7, i8);
        int i9 = i + i2;
        bVar.mo40765c(i9, i7);
        bVar.mo40765c(i9, i8);
        bVar.mo40765c(i9, i9 - 1);
    }

    /* renamed from: i */
    public static MVAdTargeting m44483i(AdTargeting adTargeting) {
        MVGpsLocation mVGpsLocation;
        C24362h.m61211f(adTargeting, "adTargeting");
        MVAdTargeting mVAdTargeting = new MVAdTargeting();
        Location location = adTargeting.f37359b;
        if (location != null) {
            LatLonE6 j = LatLonE6.m40177j(location);
            if (j == null) {
                mVGpsLocation = null;
            } else {
                MVGpsLocation mVGpsLocation2 = new MVGpsLocation(new MVLatLon(j.f40980b, j.f40981c));
                mVGpsLocation2.timestamp = location.getTime();
                mVGpsLocation2.mo26192q();
                if (location.hasAccuracy()) {
                    mVGpsLocation2.accuracy = (double) location.getAccuracy();
                    mVGpsLocation2.mo26188l();
                }
                if (location.hasBearing()) {
                    mVGpsLocation2.bearing = (double) location.getBearing();
                    mVGpsLocation2.mo26190o();
                }
                if (location.hasSpeed()) {
                    mVGpsLocation2.speed = (double) location.getSpeed();
                    mVGpsLocation2.mo26191p();
                }
                if (location.hasAltitude()) {
                    mVGpsLocation2.altitude = location.getAltitude();
                    mVGpsLocation2.mo26189m();
                }
                mVGpsLocation = mVGpsLocation2;
            }
            mVAdTargeting.userLocation = mVGpsLocation;
        }
        LatLonE6 latLonE6 = adTargeting.f37360c;
        if (latLonE6 != null) {
            mVAdTargeting.targetLocation = new MVLatLon(latLonE6.f40980b, latLonE6.f40981c);
        }
        return mVAdTargeting;
    }

    /* renamed from: j */
    public static C13830a m44484j(C13830a aVar, int i, int i2) {
        C16666a aVar2;
        int i3;
        int i4 = aVar.f34026c / i2;
        if (i2 == 4) {
            aVar2 = C16666a.f43366k;
        } else if (i2 == 6) {
            aVar2 = C16666a.f43365j;
        } else if (i2 == 8) {
            aVar2 = C16666a.f43368m;
        } else if (i2 == 10) {
            aVar2 = C16666a.f43364i;
        } else if (i2 == 12) {
            aVar2 = C16666a.f43363h;
        } else {
            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
        }
        C20268a aVar3 = new C20268a(aVar2);
        int i5 = i / i2;
        int[] iArr = new int[i5];
        int i6 = aVar.f34026c / i2;
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                if (aVar.mo40759d((i7 * i2) + i9)) {
                    i3 = 1 << ((i2 - i9) - 1);
                } else {
                    i3 = 0;
                }
                i8 |= i3;
            }
            iArr[i7] = i8;
        }
        aVar3.mo52442b(i5 - i4, iArr);
        C13830a aVar4 = new C13830a();
        aVar4.mo40756b(0, i % i2);
        for (int i11 = 0; i11 < i5; i11++) {
            aVar4.mo40756b(iArr[i11], i2);
        }
        return aVar4;
    }

    /* renamed from: k */
    public static final String m44485k(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb = new StringBuilder();
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            C24362h.m61210e(signatureArr, "signatures");
            int length = signatureArr.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Signature signature = signatureArr[i];
                i++;
                instance.update(signature.toByteArray());
                sb.append(Base64.encodeToString(instance.digest(), 0));
                sb.append(":");
            }
            if (sb.length() > 0) {
                z = true;
            }
            if (z) {
                sb.setLength(sb.length() - 1);
            }
            String sb2 = sb.toString();
            C24362h.m61210e(sb2, "sb.toString()");
            return sb2;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: l */
    public static C13830a m44486l(int i, C13830a aVar) {
        C13830a aVar2 = new C13830a();
        int i2 = aVar.f34026c;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || aVar.mo40759d(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                aVar2.mo40756b(i8, i);
            } else if (i8 == 0) {
                aVar2.mo40756b(i5 | 1, i);
            } else {
                aVar2.mo40756b(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m44487n(java.lang.String r21, long r22, long r24, long r26) {
        /*
            r0 = r21
            r1 = r24
            r3 = r26
            int r5 = bi0.C21080r.f52895a
            java.lang.String r6 = java.lang.System.getProperty(r21)     // Catch:{ SecurityException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r6 = 0
        L_0x000e:
            if (r6 != 0) goto L_0x0014
            r5 = r22
            goto L_0x00a7
        L_0x0014:
            r7 = 10
            mf0.C24361g.m61189u(r7)
            int r8 = r6.length()
            r9 = 1
            r10 = 0
            if (r8 != 0) goto L_0x0022
            goto L_0x0078
        L_0x0022:
            char r11 = r6.charAt(r10)
            r12 = 48
            int r12 = mf0.C24362h.m61213h(r11, r12)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r12 >= 0) goto L_0x0045
            if (r8 != r9) goto L_0x0036
            goto L_0x0078
        L_0x0036:
            r12 = 45
            if (r11 != r12) goto L_0x003e
            r13 = -9223372036854775808
            r11 = 1
            goto L_0x0043
        L_0x003e:
            r12 = 43
            if (r11 != r12) goto L_0x0078
            r11 = 0
        L_0x0043:
            r12 = 1
            goto L_0x0047
        L_0x0045:
            r11 = 0
            r12 = 0
        L_0x0047:
            r15 = 0
            r17 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r9 = r15
            r15 = r17
        L_0x0051:
            if (r12 >= r8) goto L_0x0080
            char r5 = r6.charAt(r12)
            int r5 = java.lang.Character.digit(r5, r7)
            if (r5 >= 0) goto L_0x005e
            goto L_0x0078
        L_0x005e:
            int r19 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r19 >= 0) goto L_0x006e
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 != 0) goto L_0x0078
            long r3 = (long) r7
            long r15 = r13 / r3
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x006e
            goto L_0x0078
        L_0x006e:
            long r3 = (long) r7
            long r9 = r9 * r3
            long r3 = (long) r5
            long r19 = r13 + r3
            int r5 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r5 >= 0) goto L_0x007a
        L_0x0078:
            r5 = 0
            goto L_0x008c
        L_0x007a:
            long r9 = r9 - r3
            int r12 = r12 + 1
            r3 = r26
            goto L_0x0051
        L_0x0080:
            if (r11 == 0) goto L_0x0087
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            goto L_0x008c
        L_0x0087:
            long r3 = -r9
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
        L_0x008c:
            r3 = 39
            java.lang.String r4 = "System property '"
            if (r5 == 0) goto L_0x00dc
            long r5 = r5.longValue()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x00a2
            r7 = r26
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x00a4
            r9 = 1
            goto L_0x00a5
        L_0x00a2:
            r7 = r26
        L_0x00a4:
            r9 = 0
        L_0x00a5:
            if (r9 == 0) goto L_0x00a8
        L_0x00a7:
            return r5
        L_0x00a8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            r10.append(r0)
            java.lang.String r0 = "' should be in range "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ".."
            r10.append(r0)
            r10.append(r7)
            java.lang.String r0 = ", but is '"
            r10.append(r0)
            r10.append(r5)
            r10.append(r3)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x00dc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r2.append(r0)
            r2.append(r6)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p584jl.C17886b.m44487n(java.lang.String, long, long, long):long");
    }

    /* renamed from: o */
    public static int m44488o(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) m44487n(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: p */
    public static int m44489p(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: q */
    public static AKHostedConfig m44490q(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "LOCAL";
        } else {
            str2 = "REMOTE";
        }
        try {
            if (C12954d.m32800c(str)) {
                return (AKHostedConfig) new AKHostedConfigJsonAdapter(new C8017o(new C8017o.C8018a())).mo25049b(str);
            }
            return null;
        } catch (IOException e) {
            Logger logger = C7557a.f23040a;
            StringBuilder d0 = C17884p.m44363d0("AK_INIT: IOException while processing ", str2, " Hosted Config Data (Exception: ");
            d0.append(e.getLocalizedMessage());
            d0.append(')');
            logger.mo6667d(d0.toString());
            return null;
        } catch (JsonDataException e2) {
            Logger logger2 = C7557a.f23040a;
            StringBuilder d02 = C17884p.m44363d0("AK_INIT: JsonDataException while processing ", str2, " Hosted Config Data (Exception: ");
            d02.append(e2.getLocalizedMessage());
            d02.append(')');
            logger2.mo6667d(d02.toString());
            return null;
        }
    }

    /* renamed from: r */
    public static void m44491r(UMOAdKitError uMOAdKitError) {
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("AK_INIT: ");
        J0.append(C13233c.m33333b().getString(C1502g.umoak_hosted_configuration_fetch_failed));
        J0.append(" (");
        J0.append(uMOAdKitError.getDesc());
        J0.append(')');
        logger.mo6667d(J0.toString());
        f45891e = false;
        C13301f fVar = C13301f.f33010a;
        C13301f.f33011b = uMOAdKitError;
        fVar.mo40205d(false);
    }

    /* renamed from: s */
    public static final void m44492s(String str, String str2) {
        Logger logger = C7557a.f23040a;
        logger.mo6672i("AK_INIT: Saving REMOTE Hosted Config Data in Local Cache, Key: " + str + '.');
        zza.m32115b(str, str2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a0  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m44493t(com.cubic.umo.p045ad.types.AKHostedConfig r10, boolean r11) {
        /*
            com.cubic.umo.ad.types.AKBannerParams r0 = r10.getBannerParams()
            r1 = 0
            if (r0 != 0) goto L_0x0015
            com.cubic.umo.ad.types.AKRollParams r0 = r10.getRollParams()
            if (r0 != 0) goto L_0x0015
            if (r11 != 0) goto L_0x0014
            com.cubic.umo.ad.ext.types.UMOAdKitError r10 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.EXTERNAL_CONFIG_MISSING_BANNER_AND_ROLL_PARAMS
            m44491r(r10)
        L_0x0014:
            return r1
        L_0x0015:
            com.cubic.umo.ad.ext.types.UMOAdKitError r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.NONE
            com.cubic.umo.ad.types.AKBannerParams r2 = r10.getBannerParams()
            r3 = 1
            if (r2 != 0) goto L_0x0020
            r2 = r0
            goto L_0x0056
        L_0x0020:
            java.lang.String r4 = r2.getBannerPlaylist()
            boolean r4 = nc0.C12954d.m32800c(r4)
            if (r4 != 0) goto L_0x002d
            com.cubic.umo.ad.ext.types.UMOAdKitError r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.INVALID_EXTERNAL_CONFIG_BANNER_PLAYLIST
            goto L_0x004e
        L_0x002d:
            java.lang.String r2 = r2.getServerUrl()
            boolean r4 = nc0.C12954d.m32800c(r2)
            if (r4 != 0) goto L_0x0038
            goto L_0x0045
        L_0x0038:
            boolean r4 = android.webkit.URLUtil.isHttpUrl(r2)
            if (r4 != 0) goto L_0x0047
            boolean r2 = android.webkit.URLUtil.isHttpsUrl(r2)
            if (r2 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r2 = 0
            goto L_0x0048
        L_0x0047:
            r2 = 1
        L_0x0048:
            if (r2 != 0) goto L_0x004d
            com.cubic.umo.ad.ext.types.UMOAdKitError r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.INVALID_EXTERNAL_CONFIG_BANNER_SERVER_URL
            goto L_0x004e
        L_0x004d:
            r2 = r0
        L_0x004e:
            if (r11 != 0) goto L_0x0056
            if (r2 == r0) goto L_0x0056
            m44491r(r2)
            return r1
        L_0x0056:
            com.cubic.umo.ad.types.AKRollParams r4 = r10.getRollParams()
            if (r4 != 0) goto L_0x005d
            goto L_0x0091
        L_0x005d:
            java.lang.String r5 = r4.getRollPlaylist()
            boolean r5 = nc0.C12954d.m32800c(r5)
            if (r5 != 0) goto L_0x006a
            com.cubic.umo.ad.ext.types.UMOAdKitError r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.INVALID_EXTERNAL_CONFIG_ROLL_PLAYLIST
            goto L_0x0089
        L_0x006a:
            java.lang.String r4 = r4.getServerUrl()
            boolean r5 = nc0.C12954d.m32800c(r4)
            if (r5 != 0) goto L_0x0075
            goto L_0x0082
        L_0x0075:
            boolean r5 = android.webkit.URLUtil.isHttpUrl(r4)
            if (r5 != 0) goto L_0x0084
            boolean r4 = android.webkit.URLUtil.isHttpsUrl(r4)
            if (r4 == 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r4 = 0
            goto L_0x0085
        L_0x0084:
            r4 = 1
        L_0x0085:
            if (r4 != 0) goto L_0x0089
            com.cubic.umo.ad.ext.types.UMOAdKitError r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.INVALID_EXTERNAL_CONFIG_ROLL_SERVER_URL
        L_0x0089:
            if (r11 != 0) goto L_0x0091
            if (r2 == r0) goto L_0x0091
            m44491r(r2)
            return r1
        L_0x0091:
            wb0.C13233c.f32845d = r10
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            com.cubic.umo.ad.types.AKLogLevel r2 = r10.getLogLevel()
            java.lang.String r2 = r2.getAdKitLogLevel()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r5 = "ROOT"
            mf0.C24362h.m61210e(r4, r5)
            java.lang.String r2 = r2.toLowerCase(r4)
            java.lang.String r4 = "this as java.lang.String).toLowerCase(locale)"
            mf0.C24362h.m61210e(r2, r4)
            int r4 = r2.hashCode()
            switch(r4) {
                case 3237038: goto L_0x00e5;
                case 95458899: goto L_0x00d9;
                case 96784904: goto L_0x00cd;
                case 351107458: goto L_0x00c1;
                case 1124446108: goto L_0x00b5;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            goto L_0x00f1
        L_0x00b5:
            java.lang.String r4 = "warning"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00be
            goto L_0x00f1
        L_0x00be:
            com.cubic.umo.ad.ext.types.UMOAdKitLogLevel r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitLogLevel.WARNING
            goto L_0x00f3
        L_0x00c1:
            java.lang.String r4 = "verbose"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00ca
            goto L_0x00f1
        L_0x00ca:
            com.cubic.umo.ad.ext.types.UMOAdKitLogLevel r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitLogLevel.VERBOSE
            goto L_0x00f3
        L_0x00cd:
            java.lang.String r4 = "error"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00d6
            goto L_0x00f1
        L_0x00d6:
            com.cubic.umo.ad.ext.types.UMOAdKitLogLevel r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitLogLevel.ERROR
            goto L_0x00f3
        L_0x00d9:
            java.lang.String r4 = "debug"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00e2
            goto L_0x00f1
        L_0x00e2:
            com.cubic.umo.ad.ext.types.UMOAdKitLogLevel r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitLogLevel.DEBUG
            goto L_0x00f3
        L_0x00e5:
            java.lang.String r4 = "info"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00ee
            goto L_0x00f1
        L_0x00ee:
            com.cubic.umo.ad.ext.types.UMOAdKitLogLevel r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitLogLevel.INFO
            goto L_0x00f3
        L_0x00f1:
            com.cubic.umo.ad.ext.types.UMOAdKitLogLevel r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitLogLevel.NONE
        L_0x00f3:
            ac0.C7557a.m17297a(r2)
            if (r11 == 0) goto L_0x00fb
            java.lang.String r2 = "LOCAL"
            goto L_0x00fd
        L_0x00fb:
            java.lang.String r2 = "REMOTE"
        L_0x00fd:
            ch.qos.logback.classic.Logger r4 = ac0.C7557a.f23040a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "AK_INIT: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = " Hosted Config READY to be utilized."
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.mo6672i(r2)
            if (r11 != 0) goto L_0x0126
            f45891e = r1
            yb0.f r11 = yb0.C13301f.f33010a
            java.lang.String r2 = "akError"
            mf0.C24362h.m61211f(r0, r2)
            r11.mo40205d(r3)
        L_0x0126:
            com.cubic.umo.ad.types.AKPlaceholders r10 = r10.getPlaceholders()
            r11 = 0
            if (r10 != 0) goto L_0x0130
            r10 = r11
            goto L_0x02ea
        L_0x0130:
            com.umo.ads.g.zzl r0 = new com.umo.ads.g.zzl
            r0.<init>(r10)
            wb0.C13233c.f32847f = r0
            java.lang.String r2 = r0.f30792b
            boolean r4 = nc0.C12954d.m32800c(r2)
            if (r4 != 0) goto L_0x0140
            goto L_0x014d
        L_0x0140:
            boolean r4 = android.webkit.URLUtil.isHttpUrl(r2)
            if (r4 != 0) goto L_0x014f
            boolean r2 = android.webkit.URLUtil.isHttpsUrl(r2)
            if (r2 == 0) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            r2 = 0
            goto L_0x0150
        L_0x014f:
            r2 = 1
        L_0x0150:
            r4 = 41
            if (r2 != 0) goto L_0x016d
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r1 = "PLACEHOLDER: Invalid Package Url ("
            java.lang.StringBuilder r1 = ce0.C21100e.m49315J0(r1)
            java.lang.String r0 = r0.f30792b
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r10.mo6667d(r0)
            goto L_0x02e8
        L_0x016d:
            java.lang.String r2 = r0.f30792b
            mf0.C24362h.m61208c(r2)
            r5 = 6
            java.lang.String r6 = "/"
            int r5 = kotlin.text.C24179b.m60568P(r2, r6, r5)
            r6 = -1
            if (r5 != r6) goto L_0x017d
            goto L_0x018b
        L_0x017d:
            int r5 = r5 + r3
            int r6 = r2.length()
            java.lang.String r2 = r2.substring(r5, r6)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            mf0.C24362h.m61210e(r2, r5)
        L_0x018b:
            r0.f30795e = r2
            java.lang.String r2 = kotlin.text.C24179b.m60584f0(r2, r2)
            r0.f30796f = r2
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r5 = "PLACEHOLDER: Checking if the Package is already downloaded ("
            java.lang.StringBuilder r5 = ce0.C21100e.m49315J0(r5)
            java.lang.String r6 = r0.f30792b
            r5.append(r6)
            java.lang.String r6 = ")..."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r2.mo6672i(r5)
            java.lang.String r2 = r10.getVersion()
            boolean r2 = nc0.C12954d.m32800c(r2)
            if (r2 == 0) goto L_0x020f
            bf0.c r2 = com.umo.ads.p351v.zza.f30891a
            java.lang.String r2 = r0.f30802l
            java.lang.String r2 = com.umo.ads.p351v.zza.m32114a(r2)
            if (r2 != 0) goto L_0x01c2
            r10 = r11
            goto L_0x0206
        L_0x01c2:
            ch.qos.logback.classic.Logger r5 = ac0.C7557a.f23040a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "PLACEHOLDER: Placeholder Package Version retrieved from Local Cache: "
            r7.append(r8)
            r7.append(r2)
            r8 = 46
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r5.mo6672i(r7)
            java.lang.String r5 = r10.getVersion()
            boolean r5 = mf0.C24362h.m61206a(r2, r5)
            if (r5 != 0) goto L_0x0204
            ch.qos.logback.classic.Logger r5 = ac0.C7557a.f23040a
            java.lang.String r7 = "PLACEHOLDER: Mismatch in Package Version: Local Version: "
            java.lang.String r9 = ", Remote Version: "
            java.lang.StringBuilder r2 = p583jk.C17884p.m44363d0(r7, r2, r9)
            java.lang.String r10 = r10.getVersion()
            r2.append(r10)
            r2.append(r8)
            java.lang.String r10 = r2.toString()
            r5.mo6672i(r10)
            goto L_0x0286
        L_0x0204:
            bf0.d r10 = bf0.C21050d.f52856a
        L_0x0206:
            if (r10 != 0) goto L_0x020f
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r2 = "PLACEHOLDER: No Placeholder Package Version retrieved from Local Cache."
            r10.mo6672i(r2)
        L_0x020f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = r0.mo35778a()
            r10.append(r2)
            java.lang.String r2 = java.io.File.separator
            r10.append(r2)
            java.lang.String r5 = r0.f30795e
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            boolean r10 = com.umo.ads.p344g.zzl.m32041g(r10)
            if (r10 != 0) goto L_0x0237
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r2 = "PLACEHOLDER: Local Package doesn't exist."
            r10.mo6667d(r2)
            goto L_0x0286
        L_0x0237:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = r0.mo35778a()
            r10.append(r1)
            r10.append(r2)
            java.lang.String r1 = r0.f30796f
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            boolean r10 = com.umo.ads.p344g.zzl.m32041g(r10)
            if (r10 == 0) goto L_0x025e
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r1 = "PLACEHOLDER: Local Package exists and already extracted."
            r10.mo6672i(r1)
            r1 = 1
            goto L_0x0286
        L_0x025e:
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r1 = "PLACEHOLDER: Local Package exists but not extracted. Attempting to extract..."
            r10.mo6672i(r1)
            java.io.File r10 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = r0.mo35778a()
            r1.append(r5)
            r1.append(r2)
            java.lang.String r2 = r0.f30795e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r10.<init>(r1)
            boolean r1 = r0.mo35782l(r10)
        L_0x0286:
            if (r1 == 0) goto L_0x02a0
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r1 = "PLACEHOLDER: Package already downloaded ("
            java.lang.StringBuilder r1 = ce0.C21100e.m49315J0(r1)
            java.lang.String r0 = r0.f30792b
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r10.mo6672i(r0)
            goto L_0x02e8
        L_0x02a0:
            java.io.File r10 = new java.io.File
            java.lang.String r1 = r0.mo35778a()
            r10.<init>(r1)
            boolean r1 = r10.exists()
            if (r1 == 0) goto L_0x02b9
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r2 = "PLACEHOLDER: Clearing previously downloaded Package from Local Cache..."
            r1.mo6672i(r2)
            com.umo.ads.p344g.zzl.m32040f(r10)
        L_0x02b9:
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r1 = "PLACEHOLDER: Downloading externally hosted Package ("
            java.lang.StringBuilder r1 = ce0.C21100e.m49315J0(r1)
            java.lang.String r2 = r0.f30792b
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r10.mo6672i(r1)
            cc0.a r10 = new cc0.a
            int r1 = r0.f30800j
            int r2 = r0.f30799i
            r10.<init>(r1, r2)
            java.lang.String r1 = r0.f30792b
            mf0.C24362h.m61208c(r1)
            b0.c r2 = new b0.c
            r4 = 10
            r2.<init>(r0, r4)
            r10.mo23844a(r1, r2)
        L_0x02e8:
            bf0.d r10 = bf0.C21050d.f52856a
        L_0x02ea:
            if (r10 != 0) goto L_0x031e
            d7.a r10 = wb0.C13233c.f32844c
            if (r10 != 0) goto L_0x02f1
            goto L_0x0315
        L_0x02f1:
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f15462h
            if (r10 != 0) goto L_0x02f6
            goto L_0x0315
        L_0x02f6:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "AK_INIT: Dynamic Placeholder info not received in Hosted Config Json"
            r0.mo6672i(r1)
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r3
            if (r10 == 0) goto L_0x030c
            com.umo.ads.g.zzl r10 = new com.umo.ads.g.zzl
            r10.<init>(r11)
            wb0.C13233c.f32847f = r10
            goto L_0x0313
        L_0x030c:
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r11 = "AK_INIT: Invalid Static Placeholder info received from Application"
            r10.mo6667d(r11)
        L_0x0313:
            bf0.d r11 = bf0.C21050d.f52856a
        L_0x0315:
            if (r11 != 0) goto L_0x031e
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r11 = "AK_INIT: Neither Dynamic Placeholder info received in Hosted Config Json nor Static Placeholder info received from Application"
            r10.mo6672i(r11)
        L_0x031e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p584jl.C17886b.m44493t(com.cubic.umo.ad.types.AKHostedConfig, boolean):boolean");
    }

    /* renamed from: a */
    public void mo50436a(C25432c cVar) {
        C24362h.m61211f(cVar, "classDescriptor");
    }

    /* renamed from: b */
    public void mo50437b(C25432c cVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement[] mo50438c(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 1
        L_0x000d:
            int r7 = r15.length
            if (r4 >= r7) goto L_0x0066
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L_0x0054
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L_0x0026
            goto L_0x0037
        L_0x0026:
            r11 = 0
        L_0x0027:
            if (r11 >= r10) goto L_0x003c
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0039
        L_0x0037:
            r9 = 0
            goto L_0x003d
        L_0x0039:
            int r11 = r11 + 1
            goto L_0x0027
        L_0x003c:
            r9 = 1
        L_0x003d:
            if (r9 != 0) goto L_0x0040
            goto L_0x0054
        L_0x0040:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L_0x0050
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L_0x0050:
            int r8 = r8 + -1
            int r8 = r8 + r4
            goto L_0x005c
        L_0x0054:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r8 = r4
            r6 = 1
        L_0x005c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto L_0x000d
        L_0x0066:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L_0x006f
            return r0
        L_0x006f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p584jl.C17886b.mo50438c(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    /* renamed from: d */
    public C24307v mo50439d(LinkedHashSet linkedHashSet) {
        C24362h.m61211f(linkedHashSet, "types");
        throw new AssertionError(C24362h.m61216k(C23825c.m58520q0(linkedHashSet, (String) null, (String) null, (String) null, (C24236l) null, 63), "There should be no intersection type in existing descriptors, but found: "));
    }

    /* renamed from: e */
    public boolean mo22170e(ClassLoader classLoader, File file, File file2, boolean z) {
        return C13637c.m34063T(classLoader, file, file2, z);
    }

    /* renamed from: f */
    public void mo22171f(ClassLoader classLoader, HashSet hashSet) {
        C13637c.m34062S(classLoader, hashSet, new C16590z());
    }

    /* renamed from: g */
    public Object mo40737g() {
        return new ArrayDeque();
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0(sVar);
    }
}
