package zb0;

import ac0.C7557a;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.appboy.Constants;
import com.umo.ads.p345h.zzd;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import mf0.C24362h;
import p026b7.C1497b;
import p043ch.qos.logback.classic.Logger;
import p077f.C4622a;
import p077f.C4626e;
import p077f.C4628f;
import p077f.C4630g;
import p389bl.C13637c;
import p695od.C18725a;
import p695od.C18726b;
import wb0.C13233c;

/* renamed from: zb0.a */
public final class C13364a {

    /* renamed from: a */
    public static final Context f33155a = C13233c.m33333b();

    /* renamed from: b */
    public static String f33156b = "";

    /* renamed from: c */
    public static String f33157c = "";

    /* renamed from: d */
    public static String f33158d = "";

    /* renamed from: e */
    public static String f33159e = "";

    /* renamed from: f */
    public static String f33160f = "";

    /* renamed from: g */
    public static int f33161g = -1;

    /* renamed from: h */
    public static boolean f33162h;

    /* renamed from: i */
    public static String f33163i = "";

    /* renamed from: j */
    public static int f33164j = 1;

    /* renamed from: k */
    public static String f33165k = "";

    /* renamed from: l */
    public static String f33166l = "";

    /* renamed from: m */
    public static String f33167m = "";

    /* renamed from: n */
    public static String f33168n = "";

    /* renamed from: o */
    public static String f33169o = "";

    /* renamed from: p */
    public static int f33170p;

    /* renamed from: q */
    public static int f33171q;

    /* renamed from: r */
    public static int f33172r = -1;

    /* renamed from: s */
    public static int f33173s = 1;

    /* renamed from: t */
    public static int f33174t = -1;

    /* renamed from: u */
    public static String f33175u = "";

    /* renamed from: v */
    public static String f33176v = "";

    /* renamed from: w */
    public static String f33177w = "";

    /* renamed from: x */
    public static String f33178x = "";

    /* renamed from: y */
    public static int f33179y = 1;

    /* renamed from: zb0.a$a */
    public static final class C13365a implements C18725a<C4628f> {
        /* renamed from: a */
        public final void mo40246a(Throwable th) {
            C24362h.m61211f(th, Constants.APPBOY_PUSH_TITLE_KEY);
            C7557a.f23040a.mo6667d("Failed to connect to Advertising ID Provider.");
            Context context = C13364a.f33155a;
            C13637c.m34055J(zzd.f30808f);
        }
    }

    /* renamed from: a */
    public static Pair m33638a(Context context) {
        DisplayMetrics displayMetrics;
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            displayMetrics = null;
        } else {
            displayMetrics = resources.getDisplayMetrics();
        }
        if (displayMetrics == null) {
            displayMetrics = Resources.getSystem().getDisplayMetrics();
            C24362h.m61210e(displayMetrics, "getSystem().displayMetrics");
        }
        return new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }

    /* renamed from: b */
    public static void m33639b() {
        Context context = f33155a;
        ExecutorService executorService = C4626e.f15845a;
        if (!C4630g.m11942a(context.getPackageManager()).isEmpty()) {
            CallbackToFutureAdapter.C0675c a = CallbackToFutureAdapter.m1884a(new C4622a(context.getApplicationContext()));
            C13365a aVar = new C13365a();
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            a.f2322c.addListener(new C18726b.C18727a(a, aVar), newSingleThreadExecutor);
            return;
        }
        C7557a.f23040a.mo6667d("The Advertising ID Provider is unavailable. Use a different library to perform any required ads use cases.");
        C13637c.m34055J(zzd.f30808f);
    }

    /* renamed from: c */
    public static int m33640c() {
        boolean z;
        int i;
        String str;
        int i2 = f33179y;
        if (Resources.getSystem().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = f33155a.getResources().getBoolean(C1497b.umoak_is_orientation_landscape);
        Logger logger = C7557a.f23040a;
        logger.mo6672i("********** AK_DEVICE_ORIENTATION: isOrientationLandscape1 (" + z + "), isOrientationLandscape2 (" + z2 + ')');
        if (z2) {
            i = 3;
        } else {
            i = 2;
        }
        f33179y = i;
        if (i != i2) {
            Logger logger2 = C7557a.f23040a;
            int i3 = f33179y;
            if (i3 == 1) {
                str = "none";
            } else if (i3 == 2) {
                str = "portrait";
            } else if (i3 == 3) {
                str = "landscape";
            } else {
                throw null;
            }
            logger2.mo6672i(C24362h.m61216k(str, "Current Display Orientation: "));
        }
        return f33179y;
    }
}
