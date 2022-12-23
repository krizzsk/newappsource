package p389bl;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import androidx.fragment.app.Fragment;
import ce0.C21100e;
import com.appboy.support.StringUtils;
import com.moovit.commons.utils.ApplicationBugException;
import com.usebutton.sdk.internal.models.Configuration;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import mf0.C24362h;
import p001a0.C0016g;
import p001a0.C0017h;
import p019b0.C1426c;
import p054d0.C4289j0;
import p070e4.C4547b;
import p070e4.C4552g;
import p219q4.C6169a;
import p219q4.C6170b;
import p219q4.C6171c;
import p219q4.C6172d;
import p219q4.C6173e;
import p219q4.C6174f;
import p219q4.C6175g;
import p257t3.C6558b;
import p270u3.C6686a;
import p277ub.C6803r;
import p359ag.C13450g;
import p359ag.C13451h;
import p359ag.C13452i;
import p404ce.C13791f;
import p404ce.C13806s;
import p579jg.C17845a;
import p584jl.C17885a;
import p627lg.C18208g;
import p752qn.C19143a;
import p752qn.C19146d;
import p752qn.C19150h;
import p786rz.C19387a;
import p798sn.C19493a;
import p810sz.C19578d;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19610m;
import p821tm.C19713q;
import ug0.C25066c;
import ug0.C25067d;
import ug0.C25069e;
import wd0.C25127a;

/* renamed from: bl.g */
public final class C13641g implements C13791f, C25127a {

    /* renamed from: b */
    public static final C13641g f33661b = new C13641g();

    /* renamed from: c */
    public static final /* synthetic */ C13641g f33662c = new C13641g();

    /* renamed from: A */
    public static int m34109A(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(C16759e.m42349e("Unsupported surface rotation: ", i));
    }

    /* renamed from: B */
    public static byte[] m34110B(Object obj, C19600l lVar) {
        return m34111C(obj, lVar, new ByteArrayOutputStream(256));
    }

    /* renamed from: C */
    public static byte[] m34111C(Object obj, C19600l lVar, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        try {
            lVar.write(obj, new C19610m(byteArrayOutputStream));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new ApplicationBugException("ByteArrayOutputStreams do not throw IOException", e);
        }
    }

    /* renamed from: D */
    public static String m34112D(File file) {
        if (file.getName().endsWith(".apk")) {
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
            if (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) {
                return "";
            }
            if (replaceFirst.startsWith("base-")) {
                return replaceFirst.replace("base-", "config.");
            }
            return replaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    /* renamed from: a */
    public static final C25066c m34113a(C25067d dVar, String str) {
        C25066c i = dVar.mo61592c(C25069e.m62820i(str)).mo61600i();
        C24362h.m61210e(i, "child(Name.identifier(name)).toSafe()");
        return i;
    }

    /* renamed from: b */
    public static void m34114b(C1426c cVar) {
        Class<C6686a> cls = C6686a.class;
        Class<C4552g> cls2 = C4552g.class;
        Class<C6558b> cls3 = C6558b.class;
        Class<C4547b> cls4 = C4547b.class;
        cVar.mo5764a(cls4, "layout", cls3);
        cVar.mo5764a(cls2, "layout", cls3);
        cVar.mo5764a(cls4, "encoder", cls);
        cVar.mo5764a(cls2, "encoder", cls);
        Class<C6170b> cls5 = C6170b.class;
        Class<C6172d> cls6 = C6172d.class;
        cVar.mo5764a(C6171c.class, "ssl", cls6);
        cVar.mo5764a(cls6, Configuration.KEY_PARAMETERS, C6173e.class);
        cVar.mo5764a(cls6, "keyStore", cls5);
        cVar.mo5764a(cls6, "trustStore", cls5);
        cVar.mo5764a(cls6, "keyManagerFactory", C6169a.class);
        cVar.mo5764a(cls6, "trustManagerFactory", C6175g.class);
        cVar.mo5764a(cls6, "secureRandom", C6174f.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r3.getClass().getName();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m34115c(java.lang.StringBuilder r2, java.lang.Object r3) {
        /*
            if (r3 != 0) goto L_0x0008
            java.lang.String r3 = "null"
            r2.append(r3)
            goto L_0x003f
        L_0x0008:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002c
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002c
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002c:
            r2.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r2.append(r0)
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p389bl.C13641g.m34115c(java.lang.StringBuilder, java.lang.Object):void");
    }

    /* renamed from: d */
    public static void m34116d(Class cls, Object obj) {
        if (obj == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: e */
    public static void m34117e(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: f */
    public static void m34118f(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: g */
    public static final C19493a m34119g(C19150h hVar) {
        Long l;
        Date date;
        Date date2;
        Long l2;
        Date date3;
        Long l3;
        Date date4;
        C19713q qVar = new C19713q();
        qVar.f50097a = hVar.f48708a;
        Date k0 = C17885a.m44446k0(hVar.f48709b);
        String str = null;
        if (k0 != null) {
            l = Long.valueOf(k0.getTime());
        } else {
            l = null;
        }
        if (l != null) {
            date = new Date(l.longValue());
        } else {
            date = null;
        }
        qVar.f50098b = date;
        Long valueOf = Long.valueOf(C17885a.m44394D(hVar.f48710c).getTime());
        if (valueOf != null) {
            date2 = new Date(valueOf.longValue());
        } else {
            date2 = null;
        }
        qVar.f50099c = date2;
        qVar.f50100d = hVar.f48711d;
        qVar.f50101e = hVar.f48712e;
        qVar.f50102f = hVar.f48713f;
        qVar.f50103g = new Date(Long.valueOf(C17885a.m44394D(hVar.f48718k).getTime()).longValue());
        qVar.f50104h = new Date(Long.valueOf(C17885a.m44394D(hVar.f48719l).getTime()).longValue());
        qVar.f50105i = new Date(Long.valueOf(C17885a.m44394D(hVar.f48721n).getTime()).longValue());
        C19143a aVar = hVar.f48722o;
        C24362h.m61210e(aVar, "activationSummary");
        Date date5 = aVar.f48674e;
        if (date5 != null) {
            l2 = Long.valueOf(date5.getTime());
        } else {
            l2 = null;
        }
        if (l2 != null) {
            date3 = new Date(l2.longValue());
        } else {
            date3 = null;
        }
        qVar.f50106j = date3;
        C19143a aVar2 = hVar.f48722o;
        C24362h.m61210e(aVar2, "activationSummary");
        Date date6 = aVar2.f48675f;
        if (date6 != null) {
            l3 = Long.valueOf(date6.getTime());
        } else {
            l3 = null;
        }
        if (l3 != null) {
            date4 = new Date(l3.longValue());
        } else {
            date4 = null;
        }
        qVar.f50107k = date4;
        qVar.f50108l = hVar.f48723p;
        qVar.f50110n = C21100e.m49362r0(hVar.f48724q);
        qVar.f50109m = hVar.f48725r;
        C19146d dVar = hVar.f48726s;
        if (dVar != null) {
            str = dVar.f48688a;
        }
        qVar.f50111o = str;
        qVar.f50112p = hVar.f48727t;
        C19143a aVar3 = hVar.f48722o;
        C24362h.m61210e(aVar3, "activationSummary");
        qVar.f50114r = aVar3.f48671b;
        C19143a aVar4 = hVar.f48722o;
        C24362h.m61210e(aVar4, "activationSummary");
        qVar.f50115s = aVar4.f48670a;
        qVar.f50116t = hVar.f48714g;
        qVar.f50117u = C21100e.m49362r0(hVar.f48715h);
        qVar.f50118v = hVar.f48733z;
        qVar.f50119w = hVar.f48705H;
        qVar.f50120x = hVar.f48706I;
        Boolean bool = hVar.f48730w;
        C24362h.m61210e(bool, "isSelfServiceRefundEnabled");
        qVar.f50121y = bool.booleanValue();
        C19143a aVar5 = hVar.f48722o;
        C24362h.m61210e(aVar5, "activationSummary");
        qVar.f50122z = aVar5.f48677h;
        return qVar.mo52063a();
    }

    /* renamed from: h */
    public static Object m34120h(byte[] bArr, C19589j jVar) {
        try {
            return jVar.read(new C19578d(new ByteArrayInputStream(bArr)));
        } catch (IOException e) {
            throw new ApplicationBugException("ByteArrayInputStreams do not throw IOException", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x019b  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p066e0.C4436j0 m34121i(p316y.C7225s r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r10.mo23532a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L_0x001a
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 == 0) goto L_0x0025
            a0.a r1 = new a0.a
            r1.<init>(r10)
            r0.add(r1)
        L_0x0025:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r10.mo23532a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x003d
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x003d
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r1 != r5) goto L_0x003d
            r1 = 1
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            if (r1 == 0) goto L_0x0048
            a0.c r1 = new a0.c
            r1.<init>()
            r0.add(r1)
        L_0x0048:
            java.util.HashSet r1 = p001a0.C0031u.f18a
            java.lang.String r5 = android.os.Build.DEVICE
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r6)
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L_0x0060
            a0.u r1 = new a0.u
            r1.<init>()
            r0.add(r1)
        L_0x0060:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r10.mo23532a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0072
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0072
            r1 = 1
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            if (r1 == 0) goto L_0x007d
            a0.e r1 = new a0.e
            r1.<init>(r10)
            r0.add(r1)
        L_0x007d:
            java.util.List<java.lang.String> r1 = p001a0.C0030t.f17a
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r5 = r1.toUpperCase(r6)
            java.lang.String r7 = "SAMSUNG"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x00ab
            java.util.List<java.lang.String> r5 = p001a0.C0030t.f17a
            java.lang.String r8 = android.os.Build.MODEL
            java.lang.String r8 = r8.toUpperCase(r6)
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L_0x00ab
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r5 = r10.mo23532a(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != r3) goto L_0x00ab
            r5 = 1
            goto L_0x00ac
        L_0x00ab:
            r5 = 0
        L_0x00ac:
            if (r5 == 0) goto L_0x00b6
            a0.t r5 = new a0.t
            r5.<init>()
            r0.add(r5)
        L_0x00b6:
            java.util.List<java.lang.String> r5 = p001a0.C0015f.f6a
            java.lang.String r5 = r1.toUpperCase(r6)
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x00e0
            java.util.List<java.lang.String> r5 = p001a0.C0015f.f6a
            java.lang.String r8 = android.os.Build.MODEL
            java.lang.String r8 = r8.toUpperCase(r6)
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L_0x00e0
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r5 = r10.mo23532a(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != r3) goto L_0x00e0
            r5 = 1
            goto L_0x00e1
        L_0x00e0:
            r5 = 0
        L_0x00e1:
            if (r5 == 0) goto L_0x00eb
            a0.f r5 = new a0.f
            r5.<init>()
            r0.add(r5)
        L_0x00eb:
            java.lang.String r5 = "motorola"
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L_0x00ff
            java.lang.String r5 = android.os.Build.MODEL
            java.lang.String r8 = "MotoG3"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00ff
            r5 = 1
            goto L_0x0100
        L_0x00ff:
            r5 = 0
        L_0x0100:
            if (r5 != 0) goto L_0x0131
            java.lang.String r5 = "samsung"
            boolean r8 = r5.equalsIgnoreCase(r1)
            if (r8 == 0) goto L_0x0116
            java.lang.String r8 = android.os.Build.MODEL
            java.lang.String r9 = "SM-G532F"
            boolean r8 = r9.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x0116
            r8 = 1
            goto L_0x0117
        L_0x0116:
            r8 = 0
        L_0x0117:
            if (r8 != 0) goto L_0x0131
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L_0x012b
            java.lang.String r5 = android.os.Build.MODEL
            java.lang.String r8 = "SM-J700F"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x012b
            r5 = 1
            goto L_0x012c
        L_0x012b:
            r5 = 0
        L_0x012c:
            if (r5 == 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r5 = 0
            goto L_0x0132
        L_0x0131:
            r5 = 1
        L_0x0132:
            if (r5 == 0) goto L_0x013c
            a0.c0 r5 = new a0.c0
            r5.<init>()
            r0.add(r5)
        L_0x013c:
            java.util.List<java.lang.String> r5 = p001a0.C0028r.f15a
            java.lang.String r8 = android.os.Build.MODEL
            java.lang.String r6 = r8.toUpperCase(r6)
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x015a
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r5 = r10.mo23532a(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != r3) goto L_0x015a
            r5 = 1
            goto L_0x015b
        L_0x015a:
            r5 = 0
        L_0x015b:
            if (r5 == 0) goto L_0x0165
            a0.r r5 = new a0.r
            r5.<init>()
            r0.add(r5)
        L_0x0165:
            boolean r1 = r1.equalsIgnoreCase(r7)
            if (r1 == 0) goto L_0x017b
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r1 = r10.mo23532a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x017b
            r1 = 1
            goto L_0x017c
        L_0x017b:
            r1 = 0
        L_0x017c:
            if (r1 == 0) goto L_0x0186
            a0.b r1 = new a0.b
            r1.<init>()
            r0.add(r1)
        L_0x0186:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r10.mo23532a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0198
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0198
            r1 = 1
            goto L_0x0199
        L_0x0198:
            r1 = 0
        L_0x0199:
            if (r1 == 0) goto L_0x01a3
            a0.k r1 = new a0.k
            r1.<init>()
            r0.add(r1)
        L_0x01a3:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r10.mo23532a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x01b5
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x01b5
            r1 = 1
            goto L_0x01b6
        L_0x01b5:
            r1 = 0
        L_0x01b6:
            if (r1 == 0) goto L_0x01c0
            a0.w r1 = new a0.w
            r1.<init>()
            r0.add(r1)
        L_0x01c0:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r10 = r10.mo23532a(r1)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x01d1
            int r10 = r10.intValue()
            if (r10 != r4) goto L_0x01d1
            r2 = 1
        L_0x01d1:
            if (r2 == 0) goto L_0x01db
            a0.j r10 = new a0.j
            r10.<init>()
            r0.add(r10)
        L_0x01db:
            e0.j0 r10 = new e0.j0
            r10.<init>((java.util.ArrayList) r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p389bl.C13641g.m34121i(y.s):e0.j0");
    }

    /* renamed from: j */
    public static boolean m34122j(C13452i iVar, String str, boolean z) {
        if (m34129r(iVar, str)) {
            return iVar.mo40342u().mo40351I(str).mo40333i();
        }
        return z;
    }

    /* renamed from: k */
    public static String m34123k(C13450g gVar, String str, String str2) {
        if (m34129r(gVar, str)) {
            return gVar.mo40342u().mo40351I(str).mo40326B();
        }
        return str2;
    }

    /* renamed from: l */
    public static final DisplayMetrics m34124l(Fragment fragment) {
        C24362h.m61211f(fragment, "$this$displayMetrics");
        Resources resources = fragment.getResources();
        C24362h.m61210e(resources, "resources");
        return resources.getDisplayMetrics();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: sf0.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final sf0.C24855b m34125n(sf0.C24856c r6) {
        /*
            boolean r0 = r6 instanceof sf0.C24855b
            if (r0 == 0) goto L_0x0007
            sf0.b r6 = (sf0.C24855b) r6
            goto L_0x006e
        L_0x0007:
            boolean r0 = r6 instanceof sf0.C24868l
            java.lang.String r1 = "Cannot calculate JVM erasure for type: "
            if (r0 == 0) goto L_0x0079
            sf0.l r6 = (sf0.C24868l) r6
            java.util.List r6 = r6.getUpperBounds()
            java.util.Iterator r0 = r6.iterator()
        L_0x0017:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r0.next()
            r4 = r2
            sf0.k r4 = (sf0.C24867k) r4
            kotlin.reflect.jvm.internal.KTypeImpl r4 = (kotlin.reflect.jvm.internal.KTypeImpl) r4
            lh0.v r4 = r4.f60270a
            lh0.i0 r4 = r4.mo60411O0()
            zf0.e r4 = r4.mo53460o()
            boolean r5 = r4 instanceof zf0.C25432c
            if (r5 == 0) goto L_0x0038
            r3 = r4
            zf0.c r3 = (zf0.C25432c) r3
        L_0x0038:
            if (r3 == 0) goto L_0x004c
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = r3.mo53513p()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r5 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            if (r4 == r5) goto L_0x004c
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = r3.mo53513p()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
            if (r3 == r4) goto L_0x004c
            r3 = 1
            goto L_0x004d
        L_0x004c:
            r3 = 0
        L_0x004d:
            if (r3 == 0) goto L_0x0017
            r3 = r2
        L_0x0050:
            sf0.k r3 = (sf0.C24867k) r3
            if (r3 != 0) goto L_0x005b
            java.lang.Object r6 = kotlin.collections.C23825c.m58515l0(r6)
            r3 = r6
            sf0.k r3 = (sf0.C24867k) r3
        L_0x005b:
            if (r3 != 0) goto L_0x0064
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sf0.b r6 = mf0.C24365j.m61219a(r6)
            goto L_0x006e
        L_0x0064:
            sf0.c r6 = r3.mo59347a()
            if (r6 == 0) goto L_0x006f
            sf0.b r6 = m34125n(r6)
        L_0x006e:
            return r6
        L_0x006f:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r6 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.String r0 = mf0.C24362h.m61216k(r3, r1)
            r6.<init>(r0)
            throw r6
        L_0x0079:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.String r6 = mf0.C24362h.m61216k(r6, r1)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p389bl.C13641g.m34125n(sf0.c):sf0.b");
    }

    /* renamed from: o */
    public static int m34126o(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            boolean z = false;
            if (i4 == 0 || (i4 == 1 ? (i2 & 1) != 0 : !(i4 != 2 || (i2 & 2) == 0))) {
                z = true;
            }
            if (z) {
                return i4;
            }
        }
        return i;
    }

    /* renamed from: p */
    public static int m34127p(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = ((i2 - i) + 360) % 360;
        } else {
            i3 = (i2 + i) % 360;
        }
        if (C4289j0.m11434a("CameraOrientationUtil")) {
            String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3)});
            C4289j0.m11435b("CameraOrientationUtil");
        }
        return i3;
    }

    /* renamed from: q */
    public static String m34128q() {
        return C21100e.m49304E(new byte[]{86, 101, 114, 115, 105, 111, 110});
    }

    /* renamed from: r */
    public static boolean m34129r(C13450g gVar, String str) {
        if (gVar == null || (gVar instanceof C13451h) || !(gVar instanceof C13452i)) {
            return false;
        }
        C13452i u = gVar.mo40342u();
        if (!u.mo40354L(str) || u.mo40351I(str) == null) {
            return false;
        }
        C13450g I = u.mo40351I(str);
        I.getClass();
        if (!(I instanceof C13451h)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x019c, code lost:
        if (r0.equals("video/mp2t") == false) goto L_0x01b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b5 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01bb A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01bd A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01bf A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c2 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c5 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01c7 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c9 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01cc A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01cf A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01d2 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d4 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01d6 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d9 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01dc A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x019f  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m34130s(java.util.Map r17) {
        /*
            java.lang.String r0 = "Content-Type"
            r1 = r17
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x001b
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0014
            goto L_0x001b
        L_0x0014:
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r6 = 7
            r7 = 8
            r8 = 9
            r9 = 10
            r10 = 11
            r11 = 12
            r12 = 13
            r13 = 14
            r14 = -1
            r15 = 1
            if (r0 != 0) goto L_0x0032
        L_0x002f:
            r1 = -1
            goto L_0x01dd
        L_0x0032:
            java.util.ArrayList<ub.n$a> r16 = p277ub.C6792n.f21003a
            int r1 = r0.hashCode()
            r2 = -1007807498(0xffffffffc3ee13f6, float:-476.15594)
            r3 = 2
            if (r1 == r2) goto L_0x005f
            r2 = -586683234(0xffffffffdd07ec9e, float:-6.1214856E17)
            if (r1 == r2) goto L_0x0054
            r2 = 187090231(0xb26c537, float:3.2118805E-32)
            if (r1 == r2) goto L_0x0049
            goto L_0x0067
        L_0x0049:
            java.lang.String r1 = "audio/mp3"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0052
            goto L_0x0067
        L_0x0052:
            r1 = 2
            goto L_0x006a
        L_0x0054:
            java.lang.String r1 = "audio/x-wav"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x005d
            goto L_0x0067
        L_0x005d:
            r1 = 1
            goto L_0x006a
        L_0x005f:
            java.lang.String r1 = "audio/x-flac"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0069
        L_0x0067:
            r1 = -1
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            java.lang.String r2 = "audio/mpeg"
            java.lang.String r4 = "audio/wav"
            java.lang.String r5 = "audio/flac"
            if (r1 == 0) goto L_0x007b
            if (r1 == r15) goto L_0x0079
            if (r1 == r3) goto L_0x0077
            goto L_0x007c
        L_0x0077:
            r0 = r2
            goto L_0x007c
        L_0x0079:
            r0 = r4
            goto L_0x007c
        L_0x007b:
            r0 = r5
        L_0x007c:
            int r1 = r0.hashCode()
            switch(r1) {
                case -2123537834: goto L_0x01aa;
                case -1662384011: goto L_0x019f;
                case -1662384007: goto L_0x0196;
                case -1662095187: goto L_0x018b;
                case -1606874997: goto L_0x0180;
                case -1487394660: goto L_0x0175;
                case -1248337486: goto L_0x016a;
                case -1004728940: goto L_0x015f;
                case -387023398: goto L_0x0151;
                case -43467528: goto L_0x0143;
                case 13915911: goto L_0x0135;
                case 187078296: goto L_0x0127;
                case 187078297: goto L_0x0119;
                case 187078669: goto L_0x010b;
                case 187090232: goto L_0x00fd;
                case 187091926: goto L_0x00ef;
                case 187099443: goto L_0x00e3;
                case 1331848029: goto L_0x00d5;
                case 1503095341: goto L_0x00c7;
                case 1504578661: goto L_0x00b9;
                case 1504619009: goto L_0x00ad;
                case 1504831518: goto L_0x00a1;
                case 1505118770: goto L_0x0093;
                case 2039520277: goto L_0x0085;
                default: goto L_0x0083;
            }
        L_0x0083:
            goto L_0x01b5
        L_0x0085:
            java.lang.String r1 = "video/x-matroska"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x008f
            goto L_0x01b5
        L_0x008f:
            r3 = 23
            goto L_0x01b6
        L_0x0093:
            java.lang.String r1 = "audio/webm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009d
            goto L_0x01b5
        L_0x009d:
            r3 = 22
            goto L_0x01b6
        L_0x00a1:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00a9
            goto L_0x01b5
        L_0x00a9:
            r3 = 21
            goto L_0x01b6
        L_0x00ad:
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00b5
            goto L_0x01b5
        L_0x00b5:
            r3 = 20
            goto L_0x01b6
        L_0x00b9:
            java.lang.String r1 = "audio/eac3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c3
            goto L_0x01b5
        L_0x00c3:
            r3 = 19
            goto L_0x01b6
        L_0x00c7:
            java.lang.String r1 = "audio/3gpp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d1
            goto L_0x01b5
        L_0x00d1:
            r3 = 18
            goto L_0x01b6
        L_0x00d5:
            java.lang.String r1 = "video/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00df
            goto L_0x01b5
        L_0x00df:
            r3 = 17
            goto L_0x01b6
        L_0x00e3:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00eb
            goto L_0x01b5
        L_0x00eb:
            r3 = 16
            goto L_0x01b6
        L_0x00ef:
            java.lang.String r1 = "audio/ogg"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f9
            goto L_0x01b5
        L_0x00f9:
            r3 = 15
            goto L_0x01b6
        L_0x00fd:
            java.lang.String r1 = "audio/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0107
            goto L_0x01b5
        L_0x0107:
            r3 = 14
            goto L_0x01b6
        L_0x010b:
            java.lang.String r1 = "audio/amr"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0115
            goto L_0x01b5
        L_0x0115:
            r3 = 13
            goto L_0x01b6
        L_0x0119:
            java.lang.String r1 = "audio/ac4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0123
            goto L_0x01b5
        L_0x0123:
            r3 = 12
            goto L_0x01b6
        L_0x0127:
            java.lang.String r1 = "audio/ac3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0131
            goto L_0x01b5
        L_0x0131:
            r3 = 11
            goto L_0x01b6
        L_0x0135:
            java.lang.String r1 = "video/x-flv"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x013f
            goto L_0x01b5
        L_0x013f:
            r3 = 10
            goto L_0x01b6
        L_0x0143:
            java.lang.String r1 = "application/webm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x014d
            goto L_0x01b5
        L_0x014d:
            r3 = 9
            goto L_0x01b6
        L_0x0151:
            java.lang.String r1 = "audio/x-matroska"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x015b
            goto L_0x01b5
        L_0x015b:
            r3 = 8
            goto L_0x01b6
        L_0x015f:
            java.lang.String r1 = "text/vtt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0168
            goto L_0x01b5
        L_0x0168:
            r3 = 7
            goto L_0x01b6
        L_0x016a:
            java.lang.String r1 = "application/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0173
            goto L_0x01b5
        L_0x0173:
            r3 = 6
            goto L_0x01b6
        L_0x0175:
            java.lang.String r1 = "image/jpeg"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x017e
            goto L_0x01b5
        L_0x017e:
            r3 = 5
            goto L_0x01b6
        L_0x0180:
            java.lang.String r1 = "audio/amr-wb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0189
            goto L_0x01b5
        L_0x0189:
            r3 = 4
            goto L_0x01b6
        L_0x018b:
            java.lang.String r1 = "video/webm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0194
            goto L_0x01b5
        L_0x0194:
            r3 = 3
            goto L_0x01b6
        L_0x0196:
            java.lang.String r1 = "video/mp2t"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x019f:
            java.lang.String r1 = "video/mp2p"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a8
            goto L_0x01b5
        L_0x01a8:
            r3 = 1
            goto L_0x01b6
        L_0x01aa:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r3 = 0
            goto L_0x01b6
        L_0x01b5:
            r3 = -1
        L_0x01b6:
            switch(r3) {
                case 0: goto L_0x01dc;
                case 1: goto L_0x01d9;
                case 2: goto L_0x01d6;
                case 3: goto L_0x01d4;
                case 4: goto L_0x01d2;
                case 5: goto L_0x01cf;
                case 6: goto L_0x01cc;
                case 7: goto L_0x01c9;
                case 8: goto L_0x01d4;
                case 9: goto L_0x01d4;
                case 10: goto L_0x01c7;
                case 11: goto L_0x01dc;
                case 12: goto L_0x01c5;
                case 13: goto L_0x01d2;
                case 14: goto L_0x01cc;
                case 15: goto L_0x01c2;
                case 16: goto L_0x01bf;
                case 17: goto L_0x01cc;
                case 18: goto L_0x01d2;
                case 19: goto L_0x01dc;
                case 20: goto L_0x01bd;
                case 21: goto L_0x01bb;
                case 22: goto L_0x01d4;
                case 23: goto L_0x01d4;
                default: goto L_0x01b9;
            }
        L_0x01b9:
            goto L_0x002f
        L_0x01bb:
            r1 = 7
            goto L_0x01dd
        L_0x01bd:
            r1 = 4
            goto L_0x01dd
        L_0x01bf:
            r1 = 12
            goto L_0x01dd
        L_0x01c2:
            r1 = 9
            goto L_0x01dd
        L_0x01c5:
            r1 = 1
            goto L_0x01dd
        L_0x01c7:
            r1 = 5
            goto L_0x01dd
        L_0x01c9:
            r1 = 13
            goto L_0x01dd
        L_0x01cc:
            r1 = 8
            goto L_0x01dd
        L_0x01cf:
            r1 = 14
            goto L_0x01dd
        L_0x01d2:
            r1 = 3
            goto L_0x01dd
        L_0x01d4:
            r1 = 6
            goto L_0x01dd
        L_0x01d6:
            r1 = 11
            goto L_0x01dd
        L_0x01d9:
            r1 = 10
            goto L_0x01dd
        L_0x01dc:
            r1 = 0
        L_0x01dd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p389bl.C13641g.m34130s(java.util.Map):int");
    }

    /* renamed from: t */
    public static int m34131t(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return -1;
    }

    /* renamed from: u */
    public static String m34132u(String str, Object... objArr) {
        int indexOf;
        String str2;
        String str3;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(C0016g.m25h(hexString, name.length() + 1));
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb2);
                    if (valueOf.length() != 0) {
                        str3 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str3 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str3, e);
                    String name2 = e.getClass().getName();
                    StringBuilder O = C0017h.m58O(name2.length() + C0016g.m25h(sb2, 9), "<", sb2, " threw ", name2);
                    O.append(">");
                    str2 = O.toString();
                }
            }
            objArr[i2] = str2;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb3.append(str, i3, indexOf);
            sb3.append(objArr[i]);
            int i4 = i + 1;
            i3 = indexOf + 2;
            i = i4;
        }
        sb3.append(str, i3, str.length());
        if (i < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i5 = i + 1; i5 < objArr.length; i5++) {
                sb3.append(", ");
                sb3.append(objArr[i5]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    /* renamed from: v */
    public static Object m34133v(Context context, String str, C19589j jVar) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        if (!context.getFileStreamPath(str).exists()) {
            return null;
        }
        try {
            bufferedInputStream = new BufferedInputStream(context.openFileInput(str));
            try {
                Object read = jVar.read(new C19578d(bufferedInputStream));
                C19387a.m46677i(bufferedInputStream);
                return read;
            } catch (IOException unused) {
                C19387a.m46677i(bufferedInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream2 = bufferedInputStream;
                C19387a.m46677i(bufferedInputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedInputStream = null;
            C19387a.m46677i(bufferedInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C19387a.m46677i(bufferedInputStream2);
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        p786rz.C19387a.m46677i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0022 */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m34134w(java.io.File r3, p810sz.C19589j r4) {
        /*
            boolean r0 = r3.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0021, all -> 0x001f }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0021, all -> 0x001f }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0021, all -> 0x001f }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0021, all -> 0x001f }
            sz.d r2 = new sz.d     // Catch:{ IOException -> 0x0022 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0022 }
            java.lang.Object r3 = r4.read(r2)     // Catch:{ IOException -> 0x0022 }
            p786rz.C19387a.m46677i(r0)
            return r3
        L_0x001f:
            r3 = move-exception
            goto L_0x002b
        L_0x0021:
            r0 = r1
        L_0x0022:
            r3.getName()     // Catch:{ all -> 0x0029 }
            p786rz.C19387a.m46677i(r0)
            return r1
        L_0x0029:
            r3 = move-exception
            r1 = r0
        L_0x002b:
            p786rz.C19387a.m46677i(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p389bl.C13641g.m34134w(java.io.File, sz.j):java.lang.Object");
    }

    /* renamed from: x */
    public static long m34135x(C6803r rVar, int i, int i2) {
        boolean z;
        boolean z2;
        rVar.mo23007z(i);
        if (rVar.f21040c - rVar.f21039b < 5) {
            return -9223372036854775807L;
        }
        int c = rVar.mo22984c();
        if ((8388608 & c) != 0 || ((2096896 & c) >> 8) != i2) {
            return -9223372036854775807L;
        }
        if ((c & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && rVar.mo22997p() >= 7 && rVar.f21040c - rVar.f21039b >= 7) {
            if ((rVar.mo22997p() & 16) == 16) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                byte[] bArr = new byte[6];
                rVar.mo22983b(0, 6, bArr);
                return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: y */
    public static boolean m34136y(Context context, String str, Object obj, C19600l lVar) {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(context.openFileOutput(str, 0));
            try {
                lVar.write(obj, new C19610m(bufferedOutputStream2));
                C19387a.m46677i(bufferedOutputStream2);
                return true;
            } catch (IOException unused) {
                bufferedOutputStream = bufferedOutputStream2;
                C19387a.m46677i(bufferedOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                C19387a.m46677i(bufferedOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            C19387a.m46677i(bufferedOutputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            C19387a.m46677i(bufferedOutputStream);
            throw th;
        }
    }

    /* renamed from: z */
    public static boolean m34137z(File file, Object obj, C19600l lVar) {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                lVar.write(obj, new C19610m(bufferedOutputStream2));
                C19387a.m46677i(bufferedOutputStream2);
                return true;
            } catch (IOException unused) {
                bufferedOutputStream = bufferedOutputStream2;
                C19387a.m46677i(bufferedOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                C19387a.m46677i(bufferedOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            C19387a.m46677i(bufferedOutputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            C19387a.m46677i(bufferedOutputStream);
            throw th;
        }
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        C18208g gVar = (C18208g) sVar.mo314b(C18208g.class);
        return new C17845a();
    }
}
