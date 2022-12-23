package mf0;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import bi0.C21079q;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzef;
import com.google.android.play.core.internal.zzbt;
import com.google.android.play.core.internal.zzbx;
import com.moovit.image.C16019d;
import com.moovit.image.glide.data.ImageData;
import com.moovit.image.glide.utils.GlideDataHelper;
import com.moovit.image.model.Image;
import com.umo.ads.p347l.zzb;
import com.umo.ads.p350u.zzf;
import com.umo.ads.p350u.zzk;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p025b6.C1486a;
import p025b6.C1492e;
import p060d6.C4397l;
import p172m9.C5720b;
import p208p6.C6095c;
import p221q6.C6181b;
import p221q6.C6188h;
import p363ak.C13479e;
import p434dd.C16553g;
import p434dd.C16566m0;
import p434dd.C16568n0;
import p434dd.C16570o0;
import p434dd.C16571p;
import p434dd.C16577s;
import p434dd.C16579t;
import p434dd.C16583v;
import p530hd.C17382g;
import p583jk.C17875h;
import p626lf.C18201b;
import p819tk.C19685b;
import r10.C19218b;
import vb0.C13197a;
import vb0.C13199c;
import vb0.C13200d;
import vb0.C13201e;
import w10.C20268a;
import w10.C20269b;
import wb0.C13233c;
import wh0.C25199n0;
import wh0.C25217t0;
import wh0.C25220u0;

/* renamed from: mf0.m */
public final class C24368m implements C6188h, C16571p, C16577s, zzef, C1486a, C6095c, C16553g {

    /* renamed from: b */
    public static final /* synthetic */ C24368m f61690b = new C24368m();

    /* renamed from: c */
    public static C13197a f61691c;

    /* renamed from: d */
    public static C13199c f61692d;

    /* renamed from: e */
    public static C13200d f61693e;

    /* renamed from: f */
    public static C13201e f61694f;

    /* renamed from: g */
    public static WeakReference f61695g;

    /* renamed from: h */
    public static final C21079q f61696h = new C21079q("COMPLETING_ALREADY");

    /* renamed from: i */
    public static final C21079q f61697i = new C21079q("COMPLETING_WAITING_CHILDREN");

    /* renamed from: j */
    public static final C21079q f61698j = new C21079q("COMPLETING_RETRY");

    /* renamed from: k */
    public static final C21079q f61699k = new C21079q("TOO_LATE_TO_CANCEL");

    /* renamed from: l */
    public static final C21079q f61700l = new C21079q("SEALED");

    /* renamed from: m */
    public static final C25199n0 f61701m = new C25199n0(false);

    /* renamed from: n */
    public static final C25199n0 f61702n = new C25199n0(true);

    /* renamed from: o */
    public static final C21079q f61703o = new C21079q("NONE");

    /* renamed from: p */
    public static final C21079q f61704p = new C21079q("PENDING");

    /* renamed from: c */
    public static C13479e m61231c(C19685b bVar) {
        int i;
        String str = bVar.f49972a;
        String str2 = bVar.f49973b;
        String str3 = bVar.f49974c;
        if (str == null || str.isEmpty()) {
            str = "unknown";
        }
        try {
            i = Integer.valueOf(str2).intValue();
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (str3 == null) {
            str3 = "";
        }
        return new C13479e(str, Integer.valueOf(i), str3);
    }

    /* renamed from: d */
    public static final void m61232d(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }

    /* renamed from: g */
    public static final void m61233g(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    /* renamed from: j */
    public static final Object m61234j(Object obj) {
        C25217t0 t0Var;
        C25220u0 u0Var = obj instanceof C25220u0 ? (C25220u0) obj : null;
        return (u0Var == null || (t0Var = u0Var.f63494a) == null) ? obj : t0Var;
    }

    /* renamed from: k */
    public static void m61235k(String str, zzf zzf) {
        List list;
        if (zzf == zzf.VIDEO) {
            list = C17875h.m44281E(zzk.BROADCAST_ACTION_AD_PLAYBACK_STARTED, zzk.BROADCAST_ACTION_AD_PLAYBACK_COMPLETED, zzk.BROADCAST_ACTION_AD_PLAYBACK_TIMED_OUT, zzk.BROADCAST_ACTION_AD_PLAYBACK_FAILED, zzk.BROADCAST_ACTION_AD_PLAYBACK_STOPPED, zzk.BROADCAST_ACTION_AD_PLAYBACK_PERCENT_UPDATE, zzk.BROADCAST_ACTION_AD_PLAYBACK_CURRPOS_UPDATE, zzk.BROADCAST_ACTION_AD_CLICKED, zzk.BROADCAST_ACTION_BROWSER_OPEN, zzk.BROADCAST_ACTION_BROWSER_DISMISS);
        } else {
            list = C17875h.m44281E(zzk.BROADCAST_ACTION_AD_IMPRESSION, zzk.BROADCAST_ACTION_AD_START, zzk.BROADCAST_ACTION_AD_FIRST_QUARTILE, zzk.BROADCAST_ACTION_AD_MIDPOINT, zzk.BROADCAST_ACTION_AD_THIRD_QUARTILE, zzk.BROADCAST_ACTION_AD_COMPLETED, zzk.BROADCAST_ACTION_AD_PAUSED, zzk.BROADCAST_ACTION_AD_RESUMED, zzk.BROADCAST_ACTION_AD_TIMED_OUT, zzk.BROADCAST_ACTION_AD_ERROR, zzk.BROADCAST_ACTION_AD_USER_ACCEPT_INVITATION, zzk.BROADCAST_ACTION_AD_SKIPPED, zzk.BROADCAST_ACTION_AD_STOPPED, zzk.BROADCAST_ACTION_AD_VOLUME_CHANGED, zzk.BROADCAST_ACTION_AD_USER_CLOSE, zzk.BROADCAST_ACTION_AD_CLICKTHRU, zzk.BROADCAST_ACTION_AD_EXPANDED, zzk.BROADCAST_ACTION_AD_COLLAPSED, zzk.BROADCAST_ACTION_AD_PLAYBACK_STOPPED, zzk.BROADCAST_ACTION_BROWSER_OPEN, zzk.BROADCAST_ACTION_BROWSER_DISMISS);
        }
        zzb zzb = new zzb(C13233c.m33333b(), str, list);
        zzb.f30821f = false;
        zzb.f30823h = f61691c;
        zzb.f30824i = f61692d;
        zzb.f30822g = f61693e;
        if (zzf == zzf.VPAID) {
            zzb.f30825j = f61694f;
        }
        f61695g = new WeakReference(zzb);
    }

    /* renamed from: l */
    public static Object m61236l(ClassLoader classLoader) {
        Class<Object> cls = Object.class;
        Field P = C5720b.m14048P(classLoader, "pathList");
        try {
            return cls.cast(P.get(classLoader));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to get value of field %s of type %s on object of type %s", new Object[]{P.getName(), classLoader.getClass().getName(), cls.getName()}), e);
        }
    }

    /* renamed from: m */
    public static void m61237m(ClassLoader classLoader, HashSet hashSet) {
        if (!hashSet.isEmpty()) {
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
                if (valueOf.length() != 0) {
                    "Adding native library parent directory: ".concat(valueOf);
                }
                hashSet2.add(file.getParentFile());
            }
            Object l = m61236l(classLoader);
            C16583v vVar = new C16583v(l, C5720b.m14048P(l, "nativeLibraryDirectories"), File.class);
            hashSet2.removeAll(Arrays.asList((File[]) vVar.mo21086c()));
            synchronized (C17382g.class) {
                hashSet2.size();
                vVar.mo49359f(hashSet2);
            }
        }
    }

    /* renamed from: o */
    public static boolean m61238o(ClassLoader classLoader, File file, File file2, boolean z, C16579t tVar, String str, C16577s sVar) {
        int i;
        File file3 = file;
        File file4 = file2;
        ArrayList arrayList = new ArrayList();
        Object l = m61236l(classLoader);
        C16583v vVar = new C16583v(l, C5720b.m14048P(l, "dexElements"), Object.class);
        List asList = Arrays.asList((Object[]) vVar.mo21086c());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = asList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Class<File> cls = File.class;
            Field P = C5720b.m14048P(next, str);
            try {
                arrayList2.add(cls.cast(P.get(next)));
            } catch (Exception e) {
                throw new zzbx(String.format("Failed to get value of field %s of type %s on object of type %s", new Object[]{P.getName(), next.getClass().getName(), cls.getName()}), e);
            }
        }
        if (arrayList2.contains(file4)) {
            return true;
        }
        if (z || sVar.mo22169b(l, file4, file)) {
            vVar.mo49358e(Arrays.asList(tVar.mo49356d(l, new ArrayList(Collections.singleton(file2)), file, arrayList)));
            if (arrayList.isEmpty()) {
                return true;
            }
            zzbt zzbt = new zzbt("DexPathList.makeDexElement failed");
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                IOException iOException = (IOException) arrayList.get(i);
            }
            new C16583v(l, C5720b.m14048P(l, "dexElementsSuppressedExceptions"), IOException.class).mo49358e(arrayList);
            throw zzbt;
        }
        String valueOf = String.valueOf(file2.getPath());
        if (valueOf.length() != 0) {
            "Should be optimized ".concat(valueOf);
        }
        return false;
    }

    /* renamed from: a */
    public void mo22178a() {
    }

    /* renamed from: b */
    public boolean mo22169b(Object obj, File file, File file2) {
        return true;
    }

    /* renamed from: e */
    public boolean mo22170e(ClassLoader classLoader, File file, File file2, boolean z) {
        return m61238o(classLoader, file, file2, z, new C18201b(), "zip", new C6181b());
    }

    /* renamed from: f */
    public void mo22171f(ClassLoader classLoader, HashSet hashSet) {
        m61237m(classLoader, hashSet);
    }

    /* renamed from: h */
    public C4397l mo20049h(C4397l lVar, C1492e eVar) {
        boolean z;
        Image image = (Image) eVar.mo5848c(C19218b.f48818b);
        if (image == null || !"DrawableResourceImage".equals(image.f41803b)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        PointF pointF = C16019d.m40803a().f41716b.get(((Integer) image.f41804c).intValue());
        Drawable drawable = (Drawable) lVar.get();
        if (drawable == null) {
            return null;
        }
        return new C20269b(new C20268a(drawable, pointF));
    }

    /* renamed from: n */
    public boolean mo979n(Object obj, File file, C1492e eVar) {
        return GlideDataHelper.m40842e(file, (ImageData) obj);
    }

    public Object zza(IBinder iBinder) {
        int i = C16568n0.f43227b;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        if (queryLocalInterface instanceof C16570o0) {
            return (C16570o0) queryLocalInterface;
        }
        return new C16566m0(iBinder);
    }
}
