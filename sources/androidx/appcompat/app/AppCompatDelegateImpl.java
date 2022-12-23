package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.p014os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.C0238b;
import androidx.appcompat.app.C0265t;
import androidx.appcompat.view.menu.C0288d;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0300j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0407g;
import androidx.appcompat.widget.C0412h0;
import androidx.appcompat.widget.C0453r1;
import androidx.appcompat.widget.C0478x0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.WeakHashMap;
import p067e1.C4506m;
import p114i.C5215a;
import p114i.C5220f;
import p114i.C5221g;
import p114i.C5224j;
import p127j.C5344a;
import p139k.C5442d;
import p175n.C5765a;
import p175n.C5768c;
import p175n.C5771e;
import p175n.C5773f;
import p175n.C5778h;
import p241s0.C6305e;
import p241s0.C6313h;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6386q0;

public final class AppCompatDelegateImpl extends C0252j implements C0291f.C0292a, LayoutInflater.Factory2 {

    /* renamed from: o0 */
    public static final C6313h<String, Integer> f619o0 = new C6313h<>();

    /* renamed from: p0 */
    public static final int[] f620p0 = {16842836};

    /* renamed from: q0 */
    public static final boolean f621q0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: r0 */
    public static final boolean f622r0 = true;

    /* renamed from: A */
    public boolean f623A;

    /* renamed from: B */
    public boolean f624B;

    /* renamed from: C */
    public boolean f625C;

    /* renamed from: D */
    public boolean f626D;

    /* renamed from: E */
    public boolean f627E;

    /* renamed from: F */
    public boolean f628F;

    /* renamed from: G */
    public boolean f629G;

    /* renamed from: H */
    public PanelFeatureState[] f630H;

    /* renamed from: I */
    public PanelFeatureState f631I;

    /* renamed from: J */
    public boolean f632J;

    /* renamed from: K */
    public boolean f633K;

    /* renamed from: L */
    public boolean f634L;

    /* renamed from: M */
    public boolean f635M;

    /* renamed from: N */
    public Configuration f636N;

    /* renamed from: O */
    public int f637O = -100;

    /* renamed from: P */
    public int f638P;

    /* renamed from: Q */
    public boolean f639Q;

    /* renamed from: R */
    public boolean f640R;

    /* renamed from: S */
    public C0234k f641S;

    /* renamed from: T */
    public C0231i f642T;

    /* renamed from: U */
    public boolean f643U;

    /* renamed from: X */
    public int f644X;

    /* renamed from: Y */
    public final C0222a f645Y = new C0222a();

    /* renamed from: Z */
    public boolean f646Z;

    /* renamed from: e */
    public final Object f647e;

    /* renamed from: f */
    public final Context f648f;

    /* renamed from: g */
    public Window f649g;

    /* renamed from: h */
    public C0230h f650h;

    /* renamed from: i */
    public final C0251i f651i;

    /* renamed from: j */
    public ActionBar f652j;

    /* renamed from: k */
    public C5773f f653k;

    /* renamed from: l */
    public CharSequence f654l;

    /* renamed from: l0 */
    public Rect f655l0;

    /* renamed from: m */
    public C0412h0 f656m;

    /* renamed from: m0 */
    public Rect f657m0;

    /* renamed from: n */
    public C0225d f658n;

    /* renamed from: n0 */
    public C0260q f659n0;

    /* renamed from: o */
    public C0236m f660o;

    /* renamed from: p */
    public C5765a f661p;

    /* renamed from: q */
    public ActionBarContextView f662q;

    /* renamed from: r */
    public PopupWindow f663r;

    /* renamed from: s */
    public C0255m f664s;

    /* renamed from: t */
    public C6382p0 f665t = null;

    /* renamed from: u */
    public boolean f666u = true;

    /* renamed from: v */
    public boolean f667v;

    /* renamed from: w */
    public ViewGroup f668w;

    /* renamed from: x */
    public TextView f669x;

    /* renamed from: y */
    public View f670y;

    /* renamed from: z */
    public boolean f671z;

    public static final class PanelFeatureState {

        /* renamed from: a */
        public int f672a;

        /* renamed from: b */
        public int f673b;

        /* renamed from: c */
        public int f674c;

        /* renamed from: d */
        public int f675d;

        /* renamed from: e */
        public C0235l f676e;

        /* renamed from: f */
        public View f677f;

        /* renamed from: g */
        public View f678g;

        /* renamed from: h */
        public C0291f f679h;

        /* renamed from: i */
        public C0288d f680i;

        /* renamed from: j */
        public C5768c f681j;

        /* renamed from: k */
        public boolean f682k;

        /* renamed from: l */
        public boolean f683l;

        /* renamed from: m */
        public boolean f684m;

        /* renamed from: n */
        public boolean f685n = false;

        /* renamed from: o */
        public boolean f686o;

        /* renamed from: p */
        public Bundle f687p;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C0221a();

            /* renamed from: b */
            public int f688b;

            /* renamed from: c */
            public boolean f689c;

            /* renamed from: d */
            public Bundle f690d;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            public class C0221a implements Parcelable.ClassLoaderCreator<SavedState> {
                public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m433b(parcel, classLoader);
                }

                public final Object[] newArray(int i) {
                    return new SavedState[i];
                }

                public final Object createFromParcel(Parcel parcel) {
                    return SavedState.m433b(parcel, (ClassLoader) null);
                }
            }

            /* renamed from: b */
            public static SavedState m433b(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f688b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f689c = z;
                if (z) {
                    savedState.f690d = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public final int describeContents() {
                return 0;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f688b);
                parcel.writeInt(this.f689c ? 1 : 0);
                if (this.f689c) {
                    parcel.writeBundle(this.f690d);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.f672a = i;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    public class C0222a implements Runnable {
        public C0222a() {
        }

        public final void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f644X & 1) != 0) {
                appCompatDelegateImpl.mo852J(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f644X & 4096) != 0) {
                appCompatDelegateImpl2.mo852J(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f643U = false;
            appCompatDelegateImpl3.f644X = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    public class C0223b implements C0238b.C0239a {
        public C0223b() {
        }

        /* renamed from: a */
        public final Context mo898a() {
            return AppCompatDelegateImpl.this.mo855M();
        }

        /* renamed from: b */
        public final boolean mo899b() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.mo859Q();
            ActionBar actionBar = appCompatDelegateImpl.f652j;
            if (actionBar == null || (actionBar.mo782d() & 4) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final void mo900c(C5442d dVar, int i) {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.mo859Q();
            ActionBar actionBar = appCompatDelegateImpl.f652j;
            if (actionBar != null) {
                actionBar.mo796r(dVar);
                actionBar.mo794p(i);
            }
        }

        /* renamed from: d */
        public final Drawable mo901d() {
            Drawable drawable;
            int resourceId;
            Context a = mo898a();
            TypedArray obtainStyledAttributes = a.obtainStyledAttributes((AttributeSet) null, new int[]{C5215a.homeAsUpIndicator});
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                drawable = obtainStyledAttributes.getDrawable(0);
            } else {
                drawable = C5344a.m13397a(a, resourceId);
            }
            obtainStyledAttributes.recycle();
            return drawable;
        }

        /* renamed from: e */
        public final void mo902e(int i) {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.mo859Q();
            ActionBar actionBar = appCompatDelegateImpl.f652j;
            if (actionBar != null) {
                actionBar.mo794p(i);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    public interface C0224c {
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    public final class C0225d implements C0300j.C0301a {
        public C0225d() {
        }

        /* renamed from: b */
        public final void mo903b(C0291f fVar, boolean z) {
            AppCompatDelegateImpl.this.mo849F(fVar);
        }

        /* renamed from: c */
        public final boolean mo904c(C0291f fVar) {
            Window.Callback P = AppCompatDelegateImpl.this.mo858P();
            if (P == null) {
                return true;
            }
            P.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    public class C0226e implements C5765a.C5766a {

        /* renamed from: a */
        public C5765a.C5766a f694a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e$a */
        public class C0227a extends C21100e {
            public C0227a() {
            }

            /* renamed from: b */
            public final void mo909b(View view) {
                AppCompatDelegateImpl.this.f662q.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f663r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f662q.getParent() instanceof View) {
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6341h.m15083c((View) AppCompatDelegateImpl.this.f662q.getParent());
                }
                AppCompatDelegateImpl.this.f662q.mo1251h();
                AppCompatDelegateImpl.this.f665t.mo22497g((C6386q0) null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f665t = null;
                ViewGroup viewGroup = appCompatDelegateImpl2.f668w;
                WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                C6333d0.C6341h.m15083c(viewGroup);
            }
        }

        public C0226e(C5771e.C5772a aVar) {
            this.f694a = aVar;
        }

        /* renamed from: a */
        public final boolean mo905a(C5765a aVar, MenuItem menuItem) {
            return this.f694a.mo905a(aVar, menuItem);
        }

        /* renamed from: b */
        public final boolean mo906b(C5765a aVar, C0291f fVar) {
            ViewGroup viewGroup = AppCompatDelegateImpl.this.f668w;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6341h.m15083c(viewGroup);
            return this.f694a.mo906b(aVar, fVar);
        }

        /* renamed from: c */
        public final boolean mo907c(C5765a aVar, C0291f fVar) {
            return this.f694a.mo907c(aVar, fVar);
        }

        /* renamed from: d */
        public final void mo908d(C5765a aVar) {
            this.f694a.mo908d(aVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f663r != null) {
                appCompatDelegateImpl.f649g.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f664s);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f662q != null) {
                C6382p0 p0Var = appCompatDelegateImpl2.f665t;
                if (p0Var != null) {
                    p0Var.mo22492b();
                }
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                C6382p0 a = C6333d0.m15013a(appCompatDelegateImpl3.f662q);
                a.mo22491a(BitmapDescriptorFactory.HUE_RED);
                appCompatDelegateImpl3.f665t = a;
                AppCompatDelegateImpl.this.f665t.mo22497g(new C0227a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            C0251i iVar = appCompatDelegateImpl4.f651i;
            if (iVar != null) {
                iVar.onSupportActionModeFinished(appCompatDelegateImpl4.f661p);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f661p = null;
            ViewGroup viewGroup = appCompatDelegateImpl5.f668w;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6341h.m15083c(viewGroup);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    public static class C0228f {
        /* renamed from: a */
        public static void m446a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    public static class C0229g {
        /* renamed from: a */
        public static void m447a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode & 3;
            if (i != i2) {
                configuration3.colorMode |= i2;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode & 12;
            if (i3 != i4) {
                configuration3.colorMode |= i4;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    public class C0231i extends C0232j {

        /* renamed from: c */
        public final PowerManager f702c;

        public C0231i(Context context) {
            super();
            this.f702c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* renamed from: b */
        public final IntentFilter mo923b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public final int mo924c() {
            if (this.f702c.isPowerSaveMode()) {
                return 2;
            }
            return 1;
        }

        /* renamed from: d */
        public final void mo925d() {
            AppCompatDelegateImpl.this.mo868d();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    public abstract class C0232j {

        /* renamed from: a */
        public C0233a f704a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j$a */
        public class C0233a extends BroadcastReceiver {
            public C0233a() {
            }

            public final void onReceive(Context context, Intent intent) {
                C0232j.this.mo925d();
            }
        }

        public C0232j() {
        }

        /* renamed from: a */
        public final void mo926a() {
            C0233a aVar = this.f704a;
            if (aVar != null) {
                try {
                    AppCompatDelegateImpl.this.f648f.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f704a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo923b();

        /* renamed from: c */
        public abstract int mo924c();

        /* renamed from: d */
        public abstract void mo925d();

        /* renamed from: e */
        public final void mo927e() {
            mo926a();
            IntentFilter b = mo923b();
            if (b != null && b.countActions() != 0) {
                if (this.f704a == null) {
                    this.f704a = new C0233a();
                }
                AppCompatDelegateImpl.this.f648f.registerReceiver(this.f704a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    public class C0234k extends C0232j {

        /* renamed from: c */
        public final C0272v f707c;

        public C0234k(C0272v vVar) {
            super();
            this.f707c = vVar;
        }

        /* renamed from: b */
        public final IntentFilter mo923b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00e8  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo924c() {
            /*
                r22 = this;
                r0 = r22
                androidx.appcompat.app.v r1 = r0.f707c
                androidx.appcompat.app.v$a r2 = r1.f791c
                long r3 = r2.f793b
                long r5 = java.lang.System.currentTimeMillis()
                r7 = 0
                r8 = 1
                int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r9 <= 0) goto L_0x0014
                r3 = 1
                goto L_0x0015
            L_0x0014:
                r3 = 0
            L_0x0015:
                if (r3 == 0) goto L_0x001b
                boolean r1 = r2.f792a
                goto L_0x00fb
            L_0x001b:
                android.content.Context r3 = r1.f789a
                java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
                int r3 = mf0.C24361g.m61191v(r3, r4)
                r4 = 0
                if (r3 != 0) goto L_0x0038
                java.lang.String r3 = "network"
                android.location.LocationManager r5 = r1.f790b     // Catch:{ Exception -> 0x0037 }
                boolean r5 = r5.isProviderEnabled(r3)     // Catch:{ Exception -> 0x0037 }
                if (r5 == 0) goto L_0x0038
                android.location.LocationManager r5 = r1.f790b     // Catch:{ Exception -> 0x0037 }
                android.location.Location r3 = r5.getLastKnownLocation(r3)     // Catch:{ Exception -> 0x0037 }
                goto L_0x0039
            L_0x0037:
            L_0x0038:
                r3 = r4
            L_0x0039:
                android.content.Context r5 = r1.f789a
                java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
                int r5 = mf0.C24361g.m61191v(r5, r6)
                if (r5 != 0) goto L_0x0055
                java.lang.String r5 = "gps"
                android.location.LocationManager r6 = r1.f790b     // Catch:{ Exception -> 0x0054 }
                boolean r6 = r6.isProviderEnabled(r5)     // Catch:{ Exception -> 0x0054 }
                if (r6 == 0) goto L_0x0055
                android.location.LocationManager r6 = r1.f790b     // Catch:{ Exception -> 0x0054 }
                android.location.Location r4 = r6.getLastKnownLocation(r5)     // Catch:{ Exception -> 0x0054 }
                goto L_0x0055
            L_0x0054:
            L_0x0055:
                if (r4 == 0) goto L_0x0066
                if (r3 == 0) goto L_0x0066
                long r5 = r4.getTime()
                long r9 = r3.getTime()
                int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r11 <= 0) goto L_0x0069
                goto L_0x0068
            L_0x0066:
                if (r4 == 0) goto L_0x0069
            L_0x0068:
                r3 = r4
            L_0x0069:
                if (r3 == 0) goto L_0x00e8
                androidx.appcompat.app.v$a r1 = r1.f791c
                long r4 = java.lang.System.currentTimeMillis()
                androidx.appcompat.app.u r6 = androidx.appcompat.app.C0271u.f784d
                if (r6 != 0) goto L_0x007c
                androidx.appcompat.app.u r6 = new androidx.appcompat.app.u
                r6.<init>()
                androidx.appcompat.app.C0271u.f784d = r6
            L_0x007c:
                androidx.appcompat.app.u r6 = androidx.appcompat.app.C0271u.f784d
                r16 = 86400000(0x5265c00, double:4.2687272E-316)
                long r14 = r4 - r16
                double r10 = r3.getLatitude()
                double r12 = r3.getLongitude()
                r9 = r6
                r9.mo987a(r10, r12, r14)
                double r10 = r3.getLatitude()
                double r12 = r3.getLongitude()
                r14 = r4
                r9.mo987a(r10, r12, r14)
                int r9 = r6.f787c
                if (r9 != r8) goto L_0x00a0
                r7 = 1
            L_0x00a0:
                long r14 = r6.f786b
                long r12 = r6.f785a
                long r16 = r4 + r16
                double r10 = r3.getLatitude()
                double r18 = r3.getLongitude()
                r9 = r6
                r20 = r12
                r12 = r18
                r18 = r14
                r14 = r16
                r9.mo987a(r10, r12, r14)
                long r9 = r6.f786b
                r11 = 0
                r13 = -1
                int r3 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
                if (r3 == 0) goto L_0x00dd
                int r3 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
                if (r3 != 0) goto L_0x00c9
                goto L_0x00dd
            L_0x00c9:
                int r3 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
                if (r3 <= 0) goto L_0x00cf
                long r9 = r9 + r11
                goto L_0x00d8
            L_0x00cf:
                int r3 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
                if (r3 <= 0) goto L_0x00d6
                long r9 = r20 + r11
                goto L_0x00d8
            L_0x00d6:
                long r9 = r18 + r11
            L_0x00d8:
                r3 = 60000(0xea60, double:2.9644E-319)
                long r9 = r9 + r3
                goto L_0x00e1
            L_0x00dd:
                r9 = 43200000(0x2932e00, double:2.1343636E-316)
                long r9 = r9 + r4
            L_0x00e1:
                r1.f792a = r7
                r1.f793b = r9
                boolean r1 = r2.f792a
                goto L_0x00fb
            L_0x00e8:
                java.util.Calendar r1 = java.util.Calendar.getInstance()
                r2 = 11
                int r1 = r1.get(r2)
                r2 = 6
                if (r1 < r2) goto L_0x00f9
                r2 = 22
                if (r1 < r2) goto L_0x00fa
            L_0x00f9:
                r7 = 1
            L_0x00fa:
                r1 = r7
            L_0x00fb:
                if (r1 == 0) goto L_0x00fe
                r8 = 2
            L_0x00fe:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.C0234k.mo924c():int");
        }

        /* renamed from: d */
        public final void mo925d() {
            AppCompatDelegateImpl.this.mo868d();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    public class C0235l extends ContentFrameLayout {
        public C0235l(C5768c cVar) {
            super(cVar, (AttributeSet) null);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (AppCompatDelegateImpl.this.mo851I(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z;
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.mo850G(appCompatDelegateImpl.mo857O(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(C5344a.m13397a(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    public final class C0236m implements C0300j.C0301a {
        public C0236m() {
        }

        /* renamed from: b */
        public final void mo903b(C0291f fVar, boolean z) {
            boolean z2;
            int i;
            PanelFeatureState panelFeatureState;
            C0291f k = fVar.mo1117k();
            int i2 = 0;
            if (k != fVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                fVar = k;
            }
            PanelFeatureState[] panelFeatureStateArr = appCompatDelegateImpl.f630H;
            if (panelFeatureStateArr != null) {
                i = panelFeatureStateArr.length;
            } else {
                i = 0;
            }
            while (true) {
                if (i2 < i) {
                    panelFeatureState = panelFeatureStateArr[i2];
                    if (panelFeatureState != null && panelFeatureState.f679h == fVar) {
                        break;
                    }
                    i2++;
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.mo848E(panelFeatureState.f672a, panelFeatureState, k);
                AppCompatDelegateImpl.this.mo850G(panelFeatureState, true);
                return;
            }
            AppCompatDelegateImpl.this.mo850G(panelFeatureState, z);
        }

        /* renamed from: c */
        public final boolean mo904c(C0291f fVar) {
            Window.Callback P;
            if (fVar != fVar.mo1117k()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f624B || (P = appCompatDelegateImpl.mo858P()) == null || AppCompatDelegateImpl.this.f635M) {
                return true;
            }
            P.onMenuOpened(108, fVar);
            return true;
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, C0251i iVar, Object obj) {
        C6313h<String, Integer> hVar;
        Integer orDefault;
        AppCompatActivity appCompatActivity;
        this.f648f = context;
        this.f651i = iVar;
        this.f647e = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            appCompatActivity = null;
            if (appCompatActivity != null) {
                this.f637O = appCompatActivity.getDelegate().mo872h();
            }
        }
        if (this.f637O == -100 && (orDefault = hVar.getOrDefault(this.f647e.getClass().getName(), null)) != null) {
            this.f637O = orDefault.intValue();
            (hVar = f619o0).remove(this.f647e.getClass().getName());
        }
        if (window != null) {
            mo847D(window);
        }
        C0407g.m1027d();
    }

    /* renamed from: H */
    public static Configuration m386H(Context context, int i, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i == 2) {
            i2 = 32;
        } else if (z) {
            i2 = 0;
        } else {
            i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = BitmapDescriptorFactory.HUE_RED;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: A */
    public final void mo844A(int i) {
        this.f638P = i;
    }

    /* renamed from: B */
    public final void mo845B(CharSequence charSequence) {
        this.f654l = charSequence;
        C0412h0 h0Var = this.f656m;
        if (h0Var != null) {
            h0Var.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.f652j;
        if (actionBar != null) {
            actionBar.mo802x(charSequence);
            return;
        }
        TextView textView = this.f669x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ac  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo846C(boolean r13) {
        /*
            r12 = this;
            boolean r0 = r12.f635M
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r12.f637O
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            int r0 = androidx.appcompat.app.C0252j.f737b
        L_0x000f:
            android.content.Context r2 = r12.f648f
            int r2 = r12.mo860R(r0, r2)
            android.content.Context r3 = r12.f648f
            r4 = 0
            android.content.res.Configuration r3 = m386H(r3, r2, r4, r1)
            android.content.Context r5 = r12.f648f
            boolean r6 = r12.f640R
            r7 = 24
            r8 = 1
            if (r6 != 0) goto L_0x0061
            java.lang.Object r6 = r12.f647e
            boolean r6 = r6 instanceof android.app.Activity
            if (r6 == 0) goto L_0x0061
            android.content.pm.PackageManager r6 = r5.getPackageManager()
            if (r6 != 0) goto L_0x0033
            r5 = 0
            goto L_0x0065
        L_0x0033:
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x005f }
            r10 = 29
            if (r9 < r10) goto L_0x003c
            r9 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0042
        L_0x003c:
            if (r9 < r7) goto L_0x0041
            r9 = 786432(0xc0000, float:1.102026E-39)
            goto L_0x0042
        L_0x0041:
            r9 = 0
        L_0x0042:
            android.content.ComponentName r10 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x005f }
            java.lang.Object r11 = r12.f647e     // Catch:{ NameNotFoundException -> 0x005f }
            java.lang.Class r11 = r11.getClass()     // Catch:{ NameNotFoundException -> 0x005f }
            r10.<init>(r5, r11)     // Catch:{ NameNotFoundException -> 0x005f }
            android.content.pm.ActivityInfo r5 = r6.getActivityInfo(r10, r9)     // Catch:{ NameNotFoundException -> 0x005f }
            if (r5 == 0) goto L_0x005b
            int r5 = r5.configChanges     // Catch:{ NameNotFoundException -> 0x005f }
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x005b
            r5 = 1
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            r12.f639Q = r5     // Catch:{ NameNotFoundException -> 0x005f }
            goto L_0x0061
        L_0x005f:
            r12.f639Q = r1
        L_0x0061:
            r12.f640R = r8
            boolean r5 = r12.f639Q
        L_0x0065:
            android.content.res.Configuration r6 = r12.f636N
            if (r6 != 0) goto L_0x0073
            android.content.Context r6 = r12.f648f
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
        L_0x0073:
            int r6 = r6.uiMode
            r6 = r6 & 48
            int r3 = r3.uiMode
            r3 = r3 & 48
            r9 = 28
            r10 = 3
            if (r6 == r3) goto L_0x00be
            if (r13 == 0) goto L_0x00be
            if (r5 != 0) goto L_0x00be
            boolean r13 = r12.f633K
            if (r13 == 0) goto L_0x00be
            boolean r13 = f621q0
            if (r13 != 0) goto L_0x0090
            boolean r13 = r12.f634L
            if (r13 == 0) goto L_0x00be
        L_0x0090:
            java.lang.Object r13 = r12.f647e
            boolean r11 = r13 instanceof android.app.Activity
            if (r11 == 0) goto L_0x00be
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r13 = r13.isChild()
            if (r13 != 0) goto L_0x00be
            java.lang.Object r13 = r12.f647e
            android.app.Activity r13 = (android.app.Activity) r13
            int r1 = p067e1.C4464a.f15531a
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r9) goto L_0x00ac
            r13.recreate()
            goto L_0x00bd
        L_0x00ac:
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r11 = r13.getMainLooper()
            r1.<init>(r11)
            androidx.appcompat.widget.i1 r11 = new androidx.appcompat.widget.i1
            r11.<init>(r13, r10)
            r1.post(r11)
        L_0x00bd:
            r1 = 1
        L_0x00be:
            if (r1 != 0) goto L_0x01c6
            if (r6 == r3) goto L_0x01c6
            android.content.Context r13 = r12.f648f
            android.content.res.Resources r13 = r13.getResources()
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.res.Configuration r6 = r13.getConfiguration()
            r1.<init>(r6)
            android.content.res.Configuration r6 = r13.getConfiguration()
            int r6 = r6.uiMode
            r6 = r6 & -49
            r3 = r3 | r6
            r1.uiMode = r3
            r13.updateConfiguration(r1, r4)
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            r11 = 23
            if (r3 >= r6) goto L_0x017d
            if (r3 < r9) goto L_0x00eb
            goto L_0x017d
        L_0x00eb:
            java.lang.String r6 = "mDrawableCache"
            if (r3 < r7) goto L_0x0136
            boolean r3 = androidx.appcompat.app.C0263s.f769h
            if (r3 != 0) goto L_0x0102
            java.lang.Class<android.content.res.Resources> r3 = android.content.res.Resources.class
            java.lang.String r7 = "mResourcesImpl"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x0100 }
            androidx.appcompat.app.C0263s.f768g = r3     // Catch:{ NoSuchFieldException -> 0x0100 }
            r3.setAccessible(r8)     // Catch:{ NoSuchFieldException -> 0x0100 }
        L_0x0100:
            androidx.appcompat.app.C0263s.f769h = r8
        L_0x0102:
            java.lang.reflect.Field r3 = androidx.appcompat.app.C0263s.f768g
            if (r3 != 0) goto L_0x0108
            goto L_0x017d
        L_0x0108:
            java.lang.Object r13 = r3.get(r13)     // Catch:{ IllegalAccessException -> 0x010d }
            goto L_0x010f
        L_0x010d:
            r13 = r4
        L_0x010f:
            if (r13 != 0) goto L_0x0113
            goto L_0x017d
        L_0x0113:
            boolean r3 = androidx.appcompat.app.C0263s.f763b
            if (r3 != 0) goto L_0x0126
            java.lang.Class r3 = r13.getClass()     // Catch:{ NoSuchFieldException -> 0x0124 }
            java.lang.reflect.Field r3 = r3.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x0124 }
            androidx.appcompat.app.C0263s.f762a = r3     // Catch:{ NoSuchFieldException -> 0x0124 }
            r3.setAccessible(r8)     // Catch:{ NoSuchFieldException -> 0x0124 }
        L_0x0124:
            androidx.appcompat.app.C0263s.f763b = r8
        L_0x0126:
            java.lang.reflect.Field r3 = androidx.appcompat.app.C0263s.f762a
            if (r3 == 0) goto L_0x0130
            java.lang.Object r4 = r3.get(r13)     // Catch:{ IllegalAccessException -> 0x012f }
            goto L_0x0130
        L_0x012f:
        L_0x0130:
            if (r4 == 0) goto L_0x017d
            androidx.appcompat.app.C0263s.m535a(r4)
            goto L_0x017d
        L_0x0136:
            if (r3 < r11) goto L_0x015a
            boolean r3 = androidx.appcompat.app.C0263s.f763b
            if (r3 != 0) goto L_0x0149
            java.lang.Class<android.content.res.Resources> r3 = android.content.res.Resources.class
            java.lang.reflect.Field r3 = r3.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x0147 }
            androidx.appcompat.app.C0263s.f762a = r3     // Catch:{ NoSuchFieldException -> 0x0147 }
            r3.setAccessible(r8)     // Catch:{ NoSuchFieldException -> 0x0147 }
        L_0x0147:
            androidx.appcompat.app.C0263s.f763b = r8
        L_0x0149:
            java.lang.reflect.Field r3 = androidx.appcompat.app.C0263s.f762a
            if (r3 == 0) goto L_0x0153
            java.lang.Object r4 = r3.get(r13)     // Catch:{ IllegalAccessException -> 0x0152 }
            goto L_0x0153
        L_0x0152:
        L_0x0153:
            if (r4 != 0) goto L_0x0156
            goto L_0x017d
        L_0x0156:
            androidx.appcompat.app.C0263s.m535a(r4)
            goto L_0x017d
        L_0x015a:
            boolean r3 = androidx.appcompat.app.C0263s.f763b
            if (r3 != 0) goto L_0x016b
            java.lang.Class<android.content.res.Resources> r3 = android.content.res.Resources.class
            java.lang.reflect.Field r3 = r3.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x0169 }
            androidx.appcompat.app.C0263s.f762a = r3     // Catch:{ NoSuchFieldException -> 0x0169 }
            r3.setAccessible(r8)     // Catch:{ NoSuchFieldException -> 0x0169 }
        L_0x0169:
            androidx.appcompat.app.C0263s.f763b = r8
        L_0x016b:
            java.lang.reflect.Field r3 = androidx.appcompat.app.C0263s.f762a
            if (r3 == 0) goto L_0x017d
            java.lang.Object r13 = r3.get(r13)     // Catch:{ IllegalAccessException -> 0x0177 }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ IllegalAccessException -> 0x0177 }
            r4 = r13
            goto L_0x0178
        L_0x0177:
        L_0x0178:
            if (r4 == 0) goto L_0x017d
            r4.clear()
        L_0x017d:
            int r13 = r12.f638P
            if (r13 == 0) goto L_0x0195
            android.content.Context r3 = r12.f648f
            r3.setTheme(r13)
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r11) goto L_0x0195
            android.content.Context r13 = r12.f648f
            android.content.res.Resources$Theme r13 = r13.getTheme()
            int r3 = r12.f638P
            r13.applyStyle(r3, r8)
        L_0x0195:
            if (r5 == 0) goto L_0x01c7
            java.lang.Object r13 = r12.f647e
            boolean r3 = r13 instanceof android.app.Activity
            if (r3 == 0) goto L_0x01c7
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r3 = r13 instanceof androidx.lifecycle.C1033p
            if (r3 == 0) goto L_0x01ba
            r3 = r13
            androidx.lifecycle.p r3 = (androidx.lifecycle.C1033p) r3
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r3 = r3.mo4225b()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r3 = r3.isAtLeast(r4)
            if (r3 == 0) goto L_0x01c7
            r13.onConfigurationChanged(r1)
            goto L_0x01c7
        L_0x01ba:
            boolean r3 = r12.f634L
            if (r3 == 0) goto L_0x01c7
            boolean r3 = r12.f635M
            if (r3 != 0) goto L_0x01c7
            r13.onConfigurationChanged(r1)
            goto L_0x01c7
        L_0x01c6:
            r8 = r1
        L_0x01c7:
            if (r8 == 0) goto L_0x01d4
            java.lang.Object r13 = r12.f647e
            boolean r1 = r13 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L_0x01d4
            androidx.appcompat.app.AppCompatActivity r13 = (androidx.appcompat.app.AppCompatActivity) r13
            r13.onNightModeChanged(r2)
        L_0x01d4:
            if (r0 != 0) goto L_0x01e0
            android.content.Context r13 = r12.f648f
            androidx.appcompat.app.AppCompatDelegateImpl$j r13 = r12.mo856N(r13)
            r13.mo927e()
            goto L_0x01e7
        L_0x01e0:
            androidx.appcompat.app.AppCompatDelegateImpl$k r13 = r12.f641S
            if (r13 == 0) goto L_0x01e7
            r13.mo926a()
        L_0x01e7:
            if (r0 != r10) goto L_0x01fc
            android.content.Context r13 = r12.f648f
            androidx.appcompat.app.AppCompatDelegateImpl$i r0 = r12.f642T
            if (r0 != 0) goto L_0x01f6
            androidx.appcompat.app.AppCompatDelegateImpl$i r0 = new androidx.appcompat.app.AppCompatDelegateImpl$i
            r0.<init>(r13)
            r12.f642T = r0
        L_0x01f6:
            androidx.appcompat.app.AppCompatDelegateImpl$i r13 = r12.f642T
            r13.mo927e()
            goto L_0x0203
        L_0x01fc:
            androidx.appcompat.app.AppCompatDelegateImpl$i r13 = r12.f642T
            if (r13 == 0) goto L_0x0203
            r13.mo926a()
        L_0x0203:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo846C(boolean):boolean");
    }

    /* renamed from: D */
    public final void mo847D(Window window) {
        int resourceId;
        Drawable g;
        if (this.f649g == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0230h)) {
                C0230h hVar = new C0230h(callback);
                this.f650h = hVar;
                window.setCallback(hVar);
                Context context = this.f648f;
                Drawable drawable = null;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f620p0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    C0407g a = C0407g.m1025a();
                    synchronized (a) {
                        g = a.f1505a.mo2208g(context, resourceId, true);
                    }
                    drawable = g;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f649g = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: E */
    public final void mo848E(int i, PanelFeatureState panelFeatureState, C0291f fVar) {
        if (fVar == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f630H;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                fVar = panelFeatureState.f679h;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f684m) && !this.f635M) {
            C0230h hVar = this.f650h;
            Window.Callback callback = this.f649g.getCallback();
            hVar.getClass();
            try {
                hVar.f700f = true;
                callback.onPanelClosed(i, fVar);
                hVar.f700f = false;
            } catch (Throwable th) {
                hVar.f700f = false;
                throw th;
            }
        }
    }

    /* renamed from: F */
    public final void mo849F(C0291f fVar) {
        if (!this.f629G) {
            this.f629G = true;
            this.f656m.mo1283l();
            Window.Callback P = mo858P();
            if (P != null && !this.f635M) {
                P.onPanelClosed(108, fVar);
            }
            this.f629G = false;
        }
    }

    /* renamed from: G */
    public final void mo850G(PanelFeatureState panelFeatureState, boolean z) {
        C0235l lVar;
        C0412h0 h0Var;
        if (!z || panelFeatureState.f672a != 0 || (h0Var = this.f656m) == null || !h0Var.mo1269e()) {
            WindowManager windowManager = (WindowManager) this.f648f.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f684m || (lVar = panelFeatureState.f676e) == null)) {
                windowManager.removeView(lVar);
                if (z) {
                    mo848E(panelFeatureState.f672a, panelFeatureState, (C0291f) null);
                }
            }
            panelFeatureState.f682k = false;
            panelFeatureState.f683l = false;
            panelFeatureState.f684m = false;
            panelFeatureState.f677f = null;
            panelFeatureState.f685n = true;
            if (this.f631I == panelFeatureState) {
                this.f631I = null;
                return;
            }
            return;
        }
        mo849F(panelFeatureState.f679h);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo851I(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f647e
            boolean r1 = r0 instanceof p242s1.C6359g.C6360a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof androidx.appcompat.app.C0259p
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f649g
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = p242s1.C6359g.m15162a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            r3 = 0
            if (r0 != r1) goto L_0x003d
            androidx.appcompat.app.AppCompatDelegateImpl$h r0 = r6.f650h
            android.view.Window r4 = r6.f649g
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.f699e = r2     // Catch:{ all -> 0x0039 }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x0039 }
            r0.f699e = r3
            if (r4 == 0) goto L_0x003d
            return r2
        L_0x0039:
            r7 = move-exception
            r0.f699e = r3
            throw r7
        L_0x003d:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            if (r4 != 0) goto L_0x0049
            r4 = 1
            goto L_0x004a
        L_0x0049:
            r4 = 0
        L_0x004a:
            r5 = 4
            if (r4 == 0) goto L_0x0074
            if (r0 == r5) goto L_0x0066
            if (r0 == r1) goto L_0x0053
            goto L_0x0123
        L_0x0053:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0124
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.mo857O(r3)
            boolean r1 = r0.f684m
            if (r1 != 0) goto L_0x0124
            r6.mo863U(r0, r7)
            goto L_0x0124
        L_0x0066:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            r6.f632J = r2
            goto L_0x0123
        L_0x0074:
            if (r0 == r5) goto L_0x00f6
            if (r0 == r1) goto L_0x007a
            goto L_0x0123
        L_0x007a:
            n.a r0 = r6.f661p
            if (r0 == 0) goto L_0x0080
            goto L_0x0124
        L_0x0080:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.mo857O(r3)
            androidx.appcompat.widget.h0 r1 = r6.f656m
            if (r1 == 0) goto L_0x00ba
            boolean r1 = r1.mo1263a()
            if (r1 == 0) goto L_0x00ba
            android.content.Context r1 = r6.f648f
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00ba
            androidx.appcompat.widget.h0 r1 = r6.f656m
            boolean r1 = r1.mo1269e()
            if (r1 != 0) goto L_0x00b3
            boolean r1 = r6.f635M
            if (r1 != 0) goto L_0x00da
            boolean r7 = r6.mo863U(r0, r7)
            if (r7 == 0) goto L_0x00da
            androidx.appcompat.widget.h0 r7 = r6.f656m
            boolean r7 = r7.mo1267d()
            goto L_0x00e0
        L_0x00b3:
            androidx.appcompat.widget.h0 r7 = r6.f656m
            boolean r7 = r7.mo1265c()
            goto L_0x00e0
        L_0x00ba:
            boolean r1 = r0.f684m
            if (r1 != 0) goto L_0x00dc
            boolean r4 = r0.f683l
            if (r4 == 0) goto L_0x00c3
            goto L_0x00dc
        L_0x00c3:
            boolean r1 = r0.f682k
            if (r1 == 0) goto L_0x00da
            boolean r1 = r0.f686o
            if (r1 == 0) goto L_0x00d2
            r0.f682k = r3
            boolean r1 = r6.mo863U(r0, r7)
            goto L_0x00d3
        L_0x00d2:
            r1 = 1
        L_0x00d3:
            if (r1 == 0) goto L_0x00da
            r6.mo861S(r0, r7)
            r7 = 1
            goto L_0x00e0
        L_0x00da:
            r7 = 0
            goto L_0x00e0
        L_0x00dc:
            r6.mo850G(r0, r2)
            r7 = r1
        L_0x00e0:
            if (r7 == 0) goto L_0x0124
            android.content.Context r7 = r6.f648f
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x0124
            r7.playSoundEffect(r3)
            goto L_0x0124
        L_0x00f6:
            boolean r7 = r6.f632J
            r6.f632J = r3
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.mo857O(r3)
            boolean r1 = r0.f684m
            if (r1 == 0) goto L_0x0108
            if (r7 != 0) goto L_0x0124
            r6.mo850G(r0, r2)
            goto L_0x0124
        L_0x0108:
            n.a r7 = r6.f661p
            if (r7 == 0) goto L_0x0110
            r7.mo993c()
            goto L_0x011d
        L_0x0110:
            r6.mo859Q()
            androidx.appcompat.app.ActionBar r7 = r6.f652j
            if (r7 == 0) goto L_0x011f
            boolean r7 = r7.mo780b()
            if (r7 == 0) goto L_0x011f
        L_0x011d:
            r7 = 1
            goto L_0x0120
        L_0x011f:
            r7 = 0
        L_0x0120:
            if (r7 == 0) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            r2 = 0
        L_0x0124:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo851I(android.view.KeyEvent):boolean");
    }

    /* renamed from: J */
    public final void mo852J(int i) {
        PanelFeatureState O = mo857O(i);
        if (O.f679h != null) {
            Bundle bundle = new Bundle();
            O.f679h.mo1137u(bundle);
            if (bundle.size() > 0) {
                O.f687p = bundle;
            }
            O.f679h.mo1142z();
            O.f679h.clear();
        }
        O.f686o = true;
        O.f685n = true;
        if ((i == 108 || i == 0) && this.f656m != null) {
            PanelFeatureState O2 = mo857O(0);
            O2.f682k = false;
            mo863U(O2, (KeyEvent) null);
        }
    }

    /* renamed from: K */
    public final void mo853K() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f667v) {
            TypedArray obtainStyledAttributes = this.f648f.obtainStyledAttributes(C5224j.AppCompatTheme);
            int i = C5224j.AppCompatTheme_windowActionBar;
            if (obtainStyledAttributes.hasValue(i)) {
                if (obtainStyledAttributes.getBoolean(C5224j.AppCompatTheme_windowNoTitle, false)) {
                    mo887v(1);
                } else if (obtainStyledAttributes.getBoolean(i, false)) {
                    mo887v(108);
                }
                if (obtainStyledAttributes.getBoolean(C5224j.AppCompatTheme_windowActionBarOverlay, false)) {
                    mo887v(109);
                }
                if (obtainStyledAttributes.getBoolean(C5224j.AppCompatTheme_windowActionModeOverlay, false)) {
                    mo887v(10);
                }
                this.f627E = obtainStyledAttributes.getBoolean(C5224j.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                mo854L();
                this.f649g.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f648f);
                if (this.f628F) {
                    viewGroup = this.f626D ? (ViewGroup) from.inflate(C5221g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C5221g.abc_screen_simple, (ViewGroup) null);
                } else if (this.f627E) {
                    viewGroup = (ViewGroup) from.inflate(C5221g.abc_dialog_title_material, (ViewGroup) null);
                    this.f625C = false;
                    this.f624B = false;
                } else if (this.f624B) {
                    TypedValue typedValue = new TypedValue();
                    this.f648f.getTheme().resolveAttribute(C5215a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C5768c(this.f648f, typedValue.resourceId);
                    } else {
                        context = this.f648f;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C5221g.abc_screen_toolbar, (ViewGroup) null);
                    C0412h0 h0Var = (C0412h0) viewGroup.findViewById(C5220f.decor_content_parent);
                    this.f656m = h0Var;
                    h0Var.setWindowCallback(mo858P());
                    if (this.f625C) {
                        this.f656m.mo1279h(109);
                    }
                    if (this.f671z) {
                        this.f656m.mo1279h(2);
                    }
                    if (this.f623A) {
                        this.f656m.mo1279h(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    C0253k kVar = new C0253k(this);
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6342i.m15104u(viewGroup, kVar);
                    if (this.f656m == null) {
                        this.f669x = (TextView) viewGroup.findViewById(C5220f.title);
                    }
                    Method method = C0453r1.f1613a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C5220f.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f649g.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f649g.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new C0254l(this));
                    this.f668w = viewGroup;
                    Object obj = this.f647e;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f654l;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        C0412h0 h0Var2 = this.f656m;
                        if (h0Var2 != null) {
                            h0Var2.setWindowTitle(charSequence);
                        } else {
                            ActionBar actionBar = this.f652j;
                            if (actionBar != null) {
                                actionBar.mo802x(charSequence);
                            } else {
                                TextView textView = this.f669x;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f668w.findViewById(16908290);
                    View decorView = this.f649g.getDecorView();
                    contentFrameLayout2.f1207h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                    if (C6333d0.C6340g.m15076c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f648f.obtainStyledAttributes(C5224j.AppCompatTheme);
                    obtainStyledAttributes2.getValue(C5224j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(C5224j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    int i2 = C5224j.AppCompatTheme_windowFixedWidthMajor;
                    if (obtainStyledAttributes2.hasValue(i2)) {
                        obtainStyledAttributes2.getValue(i2, contentFrameLayout2.getFixedWidthMajor());
                    }
                    int i3 = C5224j.AppCompatTheme_windowFixedWidthMinor;
                    if (obtainStyledAttributes2.hasValue(i3)) {
                        obtainStyledAttributes2.getValue(i3, contentFrameLayout2.getFixedWidthMinor());
                    }
                    int i4 = C5224j.AppCompatTheme_windowFixedHeightMajor;
                    if (obtainStyledAttributes2.hasValue(i4)) {
                        obtainStyledAttributes2.getValue(i4, contentFrameLayout2.getFixedHeightMajor());
                    }
                    int i5 = C5224j.AppCompatTheme_windowFixedHeightMinor;
                    if (obtainStyledAttributes2.hasValue(i5)) {
                        obtainStyledAttributes2.getValue(i5, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f667v = true;
                    PanelFeatureState O = mo857O(0);
                    if (!this.f635M && O.f679h == null) {
                        this.f644X |= 4096;
                        if (!this.f643U) {
                            C6333d0.C6337d.m15053m(this.f649g.getDecorView(), this.f645Y);
                            this.f643U = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                StringBuilder k = C13555b.m33972k("AppCompat does not support the current theme features: { windowActionBar: ");
                k.append(this.f624B);
                k.append(", windowActionBarOverlay: ");
                k.append(this.f625C);
                k.append(", android:windowIsFloating: ");
                k.append(this.f627E);
                k.append(", windowActionModeOverlay: ");
                k.append(this.f626D);
                k.append(", windowNoTitle: ");
                throw new IllegalArgumentException(C25541a.m63885p(k, this.f628F, " }"));
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    /* renamed from: L */
    public final void mo854L() {
        if (this.f649g == null) {
            Object obj = this.f647e;
            if (obj instanceof Activity) {
                mo847D(((Activity) obj).getWindow());
            }
        }
        if (this.f649g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: M */
    public final Context mo855M() {
        Context context;
        mo859Q();
        ActionBar actionBar = this.f652j;
        if (actionBar != null) {
            context = actionBar.mo783e();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f648f;
        }
        return context;
    }

    /* renamed from: N */
    public final C0232j mo856N(Context context) {
        if (this.f641S == null) {
            if (C0272v.f788d == null) {
                Context applicationContext = context.getApplicationContext();
                C0272v.f788d = new C0272v(applicationContext, (LocationManager) applicationContext.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY));
            }
            this.f641S = new C0234k(C0272v.f788d);
        }
        return this.f641S;
    }

    /* renamed from: O */
    public final PanelFeatureState mo857O(int i) {
        PanelFeatureState[] panelFeatureStateArr = this.f630H;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f630H = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: P */
    public final Window.Callback mo858P() {
        return this.f649g.getCallback();
    }

    /* renamed from: Q */
    public final void mo859Q() {
        mo853K();
        if (this.f624B && this.f652j == null) {
            Object obj = this.f647e;
            if (obj instanceof Activity) {
                this.f652j = new C0274w((Activity) this.f647e, this.f625C);
            } else if (obj instanceof Dialog) {
                this.f652j = new C0274w((Dialog) this.f647e);
            }
            ActionBar actionBar = this.f652j;
            if (actionBar != null) {
                actionBar.mo790l(this.f646Z);
            }
        }
    }

    /* renamed from: R */
    public final int mo860R(int i, Context context) {
        if (i == -100) {
            return -1;
        }
        if (i == -1) {
            return i;
        }
        if (i != 0) {
            if (i == 1 || i == 2) {
                return i;
            }
            if (i == 3) {
                if (this.f642T == null) {
                    this.f642T = new C0231i(context);
                }
                return this.f642T.mo924c();
            }
            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
        } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
            return mo856N(context).mo924c();
        } else {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0148, code lost:
        if (r14 != null) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016c, code lost:
        if (r14.f912h.getCount() > 0) goto L_0x016e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0174  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo861S(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r13, android.view.KeyEvent r14) {
        /*
            r12 = this;
            boolean r0 = r13.f684m
            if (r0 != 0) goto L_0x01d0
            boolean r0 = r12.f635M
            if (r0 == 0) goto L_0x000a
            goto L_0x01d0
        L_0x000a:
            int r0 = r13.f672a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r12.f648f
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r12.mo858P()
            if (r0 == 0) goto L_0x003b
            int r3 = r13.f672a
            androidx.appcompat.view.menu.f r4 = r13.f679h
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r12.mo850G(r13, r1)
            return
        L_0x003b:
            android.content.Context r0 = r12.f648f
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0049
            return
        L_0x0049:
            boolean r14 = r12.mo863U(r13, r14)
            if (r14 != 0) goto L_0x0050
            return
        L_0x0050:
            androidx.appcompat.app.AppCompatDelegateImpl$l r14 = r13.f676e
            r3 = -2
            r4 = -1
            if (r14 == 0) goto L_0x006c
            boolean r5 = r13.f685n
            if (r5 == 0) goto L_0x005b
            goto L_0x006c
        L_0x005b:
            android.view.View r14 = r13.f678g
            if (r14 == 0) goto L_0x01ad
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 == 0) goto L_0x01ad
            int r14 = r14.width
            if (r14 != r4) goto L_0x01ad
            r5 = -1
            goto L_0x01ae
        L_0x006c:
            if (r14 != 0) goto L_0x00d9
            android.content.Context r14 = r12.mo855M()
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources r5 = r14.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r14.getTheme()
            r5.setTo(r6)
            int r6 = p114i.C5215a.actionBarPopupTheme
            r5.resolveAttribute(r6, r4, r1)
            int r6 = r4.resourceId
            if (r6 == 0) goto L_0x0092
            r5.applyStyle(r6, r1)
        L_0x0092:
            int r6 = p114i.C5215a.panelMenuListTheme
            r5.resolveAttribute(r6, r4, r1)
            int r4 = r4.resourceId
            if (r4 == 0) goto L_0x009f
            r5.applyStyle(r4, r1)
            goto L_0x00a4
        L_0x009f:
            int r4 = p114i.C5223i.Theme_AppCompat_CompactMenu
            r5.applyStyle(r4, r1)
        L_0x00a4:
            n.c r4 = new n.c
            r4.<init>((android.content.Context) r14, (int) r2)
            android.content.res.Resources$Theme r14 = r4.getTheme()
            r14.setTo(r5)
            r13.f681j = r4
            int[] r14 = p114i.C5224j.AppCompatTheme
            android.content.res.TypedArray r14 = r4.obtainStyledAttributes(r14)
            int r4 = p114i.C5224j.AppCompatTheme_panelBackground
            int r4 = r14.getResourceId(r4, r2)
            r13.f673b = r4
            int r4 = p114i.C5224j.AppCompatTheme_android_windowAnimationStyle
            int r4 = r14.getResourceId(r4, r2)
            r13.f675d = r4
            r14.recycle()
            androidx.appcompat.app.AppCompatDelegateImpl$l r14 = new androidx.appcompat.app.AppCompatDelegateImpl$l
            n.c r4 = r13.f681j
            r14.<init>(r4)
            r13.f676e = r14
            r14 = 81
            r13.f674c = r14
            goto L_0x00e8
        L_0x00d9:
            boolean r4 = r13.f685n
            if (r4 == 0) goto L_0x00e8
            int r14 = r14.getChildCount()
            if (r14 <= 0) goto L_0x00e8
            androidx.appcompat.app.AppCompatDelegateImpl$l r14 = r13.f676e
            r14.removeAllViews()
        L_0x00e8:
            android.view.View r14 = r13.f678g
            if (r14 == 0) goto L_0x00ef
            r13.f677f = r14
            goto L_0x014a
        L_0x00ef:
            androidx.appcompat.view.menu.f r14 = r13.f679h
            if (r14 != 0) goto L_0x00f4
            goto L_0x014c
        L_0x00f4:
            androidx.appcompat.app.AppCompatDelegateImpl$m r14 = r12.f660o
            if (r14 != 0) goto L_0x00ff
            androidx.appcompat.app.AppCompatDelegateImpl$m r14 = new androidx.appcompat.app.AppCompatDelegateImpl$m
            r14.<init>()
            r12.f660o = r14
        L_0x00ff:
            androidx.appcompat.app.AppCompatDelegateImpl$m r14 = r12.f660o
            androidx.appcompat.view.menu.d r4 = r13.f680i
            if (r4 != 0) goto L_0x0119
            androidx.appcompat.view.menu.d r4 = new androidx.appcompat.view.menu.d
            n.c r5 = r13.f681j
            int r6 = p114i.C5221g.abc_list_menu_item_layout
            r4.<init>(r5, r6)
            r13.f680i = r4
            r4.f911g = r14
            androidx.appcompat.view.menu.f r14 = r13.f679h
            android.content.Context r5 = r14.f922a
            r14.mo1101b(r4, r5)
        L_0x0119:
            androidx.appcompat.view.menu.d r14 = r13.f680i
            androidx.appcompat.app.AppCompatDelegateImpl$l r4 = r13.f676e
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r14.f909e
            if (r5 != 0) goto L_0x0144
            android.view.LayoutInflater r5 = r14.f907c
            int r6 = p114i.C5221g.abc_expanded_menu_layout
            android.view.View r4 = r5.inflate(r6, r4, r2)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = (androidx.appcompat.view.menu.ExpandedMenuView) r4
            r14.f909e = r4
            androidx.appcompat.view.menu.d$a r4 = r14.f912h
            if (r4 != 0) goto L_0x0138
            androidx.appcompat.view.menu.d$a r4 = new androidx.appcompat.view.menu.d$a
            r4.<init>()
            r14.f912h = r4
        L_0x0138:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f909e
            androidx.appcompat.view.menu.d$a r5 = r14.f912h
            r4.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f909e
            r4.setOnItemClickListener(r14)
        L_0x0144:
            androidx.appcompat.view.menu.ExpandedMenuView r14 = r14.f909e
            r13.f677f = r14
            if (r14 == 0) goto L_0x014c
        L_0x014a:
            r14 = 1
            goto L_0x014d
        L_0x014c:
            r14 = 0
        L_0x014d:
            if (r14 == 0) goto L_0x01ce
            android.view.View r14 = r13.f677f
            if (r14 != 0) goto L_0x0154
            goto L_0x0170
        L_0x0154:
            android.view.View r14 = r13.f678g
            if (r14 == 0) goto L_0x0159
            goto L_0x016e
        L_0x0159:
            androidx.appcompat.view.menu.d r14 = r13.f680i
            androidx.appcompat.view.menu.d$a r4 = r14.f912h
            if (r4 != 0) goto L_0x0166
            androidx.appcompat.view.menu.d$a r4 = new androidx.appcompat.view.menu.d$a
            r4.<init>()
            r14.f912h = r4
        L_0x0166:
            androidx.appcompat.view.menu.d$a r14 = r14.f912h
            int r14 = r14.getCount()
            if (r14 <= 0) goto L_0x0170
        L_0x016e:
            r14 = 1
            goto L_0x0171
        L_0x0170:
            r14 = 0
        L_0x0171:
            if (r14 != 0) goto L_0x0174
            goto L_0x01ce
        L_0x0174:
            android.view.View r14 = r13.f677f
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 != 0) goto L_0x0181
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r14.<init>(r3, r3)
        L_0x0181:
            int r4 = r13.f673b
            androidx.appcompat.app.AppCompatDelegateImpl$l r5 = r13.f676e
            r5.setBackgroundResource(r4)
            android.view.View r4 = r13.f677f
            android.view.ViewParent r4 = r4.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0199
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r5 = r13.f677f
            r4.removeView(r5)
        L_0x0199:
            androidx.appcompat.app.AppCompatDelegateImpl$l r4 = r13.f676e
            android.view.View r5 = r13.f677f
            r4.addView(r5, r14)
            android.view.View r14 = r13.f677f
            boolean r14 = r14.hasFocus()
            if (r14 != 0) goto L_0x01ad
            android.view.View r14 = r13.f677f
            r14.requestFocus()
        L_0x01ad:
            r5 = -2
        L_0x01ae:
            r13.f683l = r2
            android.view.WindowManager$LayoutParams r14 = new android.view.WindowManager$LayoutParams
            r6 = -2
            r7 = 0
            r8 = 0
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 8519680(0x820000, float:1.1938615E-38)
            r11 = -3
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r2 = r13.f674c
            r14.gravity = r2
            int r2 = r13.f675d
            r14.windowAnimations = r2
            androidx.appcompat.app.AppCompatDelegateImpl$l r2 = r13.f676e
            r0.addView(r2, r14)
            r13.f684m = r1
            return
        L_0x01ce:
            r13.f685n = r1
        L_0x01d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo861S(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    /* renamed from: T */
    public final boolean mo862T(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent) {
        C0291f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f682k || mo863U(panelFeatureState, keyEvent)) && (fVar = panelFeatureState.f679h) != null) {
            return fVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: U */
    public final boolean mo863U(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        int i;
        boolean z2;
        C0412h0 h0Var;
        C0412h0 h0Var2;
        C0412h0 h0Var3;
        Resources.Theme theme;
        C0412h0 h0Var4;
        if (this.f635M) {
            return false;
        }
        if (panelFeatureState.f682k) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f631I;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            mo850G(panelFeatureState2, false);
        }
        Window.Callback P = mo858P();
        if (P != null) {
            panelFeatureState.f678g = P.onCreatePanelView(panelFeatureState.f672a);
        }
        int i2 = panelFeatureState.f672a;
        if (i2 == 0 || i2 == 108) {
            z = true;
        } else {
            z = false;
        }
        if (z && (h0Var4 = this.f656m) != null) {
            h0Var4.mo1270f();
        }
        if (panelFeatureState.f678g == null && (!z || !(this.f652j instanceof C0265t))) {
            C0291f fVar = panelFeatureState.f679h;
            if (fVar == null || panelFeatureState.f686o) {
                if (fVar == null) {
                    Context context = this.f648f;
                    int i3 = panelFeatureState.f672a;
                    if ((i3 == 0 || i3 == 108) && this.f656m != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(C5215a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(C5215a.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(C5215a.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C5768c cVar = new C5768c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    C0291f fVar2 = new C0291f(context);
                    fVar2.f926e = this;
                    C0291f fVar3 = panelFeatureState.f679h;
                    if (fVar2 != fVar3) {
                        if (fVar3 != null) {
                            fVar3.mo1126r(panelFeatureState.f680i);
                        }
                        panelFeatureState.f679h = fVar2;
                        C0288d dVar = panelFeatureState.f680i;
                        if (dVar != null) {
                            fVar2.mo1101b(dVar, fVar2.f922a);
                        }
                    }
                    if (panelFeatureState.f679h == null) {
                        return false;
                    }
                }
                if (z && (h0Var3 = this.f656m) != null) {
                    if (this.f658n == null) {
                        this.f658n = new C0225d();
                    }
                    h0Var3.mo1264b(panelFeatureState.f679h, this.f658n);
                }
                panelFeatureState.f679h.mo1142z();
                if (!P.onCreatePanelMenu(panelFeatureState.f672a, panelFeatureState.f679h)) {
                    C0291f fVar4 = panelFeatureState.f679h;
                    if (fVar4 != null) {
                        if (fVar4 != null) {
                            fVar4.mo1126r(panelFeatureState.f680i);
                        }
                        panelFeatureState.f679h = null;
                    }
                    if (z && (h0Var2 = this.f656m) != null) {
                        h0Var2.mo1264b((C0291f) null, this.f658n);
                    }
                    return false;
                }
                panelFeatureState.f686o = false;
            }
            panelFeatureState.f679h.mo1142z();
            Bundle bundle = panelFeatureState.f687p;
            if (bundle != null) {
                panelFeatureState.f679h.mo1129s(bundle);
                panelFeatureState.f687p = null;
            }
            if (!P.onPreparePanel(0, panelFeatureState.f678g, panelFeatureState.f679h)) {
                if (z && (h0Var = this.f656m) != null) {
                    h0Var.mo1264b((C0291f) null, this.f658n);
                }
                panelFeatureState.f679h.mo1141y();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            panelFeatureState.f679h.setQwertyMode(z2);
            panelFeatureState.f679h.mo1141y();
        }
        panelFeatureState.f682k = true;
        panelFeatureState.f683l = false;
        this.f631I = panelFeatureState;
        return true;
    }

    /* renamed from: V */
    public final void mo864V() {
        if (this.f667v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: a */
    public final boolean mo865a(C0291f fVar, MenuItem menuItem) {
        int i;
        PanelFeatureState panelFeatureState;
        Window.Callback P = mo858P();
        if (P != null && !this.f635M) {
            C0291f k = fVar.mo1117k();
            PanelFeatureState[] panelFeatureStateArr = this.f630H;
            if (panelFeatureStateArr != null) {
                i = panelFeatureStateArr.length;
            } else {
                i = 0;
            }
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    panelFeatureState = panelFeatureStateArr[i2];
                    if (panelFeatureState != null && panelFeatureState.f679h == k) {
                        break;
                    }
                    i2++;
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                return P.onMenuItemSelected(panelFeatureState.f672a, menuItem);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo866b(C0291f fVar) {
        C0412h0 h0Var = this.f656m;
        if (h0Var == null || !h0Var.mo1263a() || (ViewConfiguration.get(this.f648f).hasPermanentMenuKey() && !this.f656m.mo1272g())) {
            PanelFeatureState O = mo857O(0);
            O.f685n = true;
            mo850G(O, false);
            mo861S(O, (KeyEvent) null);
            return;
        }
        Window.Callback P = mo858P();
        if (this.f656m.mo1269e()) {
            this.f656m.mo1265c();
            if (!this.f635M) {
                P.onPanelClosed(108, mo857O(0).f679h);
            }
        } else if (P != null && !this.f635M) {
            if (this.f643U && (1 & this.f644X) != 0) {
                this.f649g.getDecorView().removeCallbacks(this.f645Y);
                this.f645Y.run();
            }
            PanelFeatureState O2 = mo857O(0);
            C0291f fVar2 = O2.f679h;
            if (fVar2 != null && !O2.f686o && P.onPreparePanel(0, O2.f678g, fVar2)) {
                P.onMenuOpened(108, O2.f679h);
                this.f656m.mo1267d();
            }
        }
    }

    /* renamed from: c */
    public final void mo867c(View view, ViewGroup.LayoutParams layoutParams) {
        mo853K();
        ((ViewGroup) this.f668w.findViewById(16908290)).addView(view, layoutParams);
        this.f650h.mo910a(this.f649g.getCallback());
    }

    /* renamed from: d */
    public final boolean mo868d() {
        return mo846C(true);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x019a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x01a6 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0172  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Context mo869e(android.content.Context r11) {
        /*
            r10 = this;
            r0 = 1
            r10.f633K = r0
            int r1 = r10.f637O
            r2 = -100
            if (r1 == r2) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            int r1 = androidx.appcompat.app.C0252j.f737b
        L_0x000c:
            int r1 = r10.mo860R(r1, r11)
            boolean r2 = f622r0
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0026
            boolean r2 = r11 instanceof android.view.ContextThemeWrapper
            if (r2 == 0) goto L_0x0026
            android.content.res.Configuration r2 = m386H(r11, r1, r3, r4)
            r5 = r11
            android.view.ContextThemeWrapper r5 = (android.view.ContextThemeWrapper) r5     // Catch:{ IllegalStateException -> 0x0025 }
            r5.applyOverrideConfiguration(r2)     // Catch:{ IllegalStateException -> 0x0025 }
            return r11
        L_0x0025:
        L_0x0026:
            boolean r2 = r11 instanceof p175n.C5768c
            if (r2 == 0) goto L_0x0036
            android.content.res.Configuration r2 = m386H(r11, r1, r3, r4)
            r5 = r11
            n.c r5 = (p175n.C5768c) r5     // Catch:{ IllegalStateException -> 0x0035 }
            r5.mo21615a(r2)     // Catch:{ IllegalStateException -> 0x0035 }
            return r11
        L_0x0035:
        L_0x0036:
            boolean r2 = f621q0
            if (r2 != 0) goto L_0x003b
            return r11
        L_0x003b:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.content.res.Configuration r5 = new android.content.res.Configuration
            r5.<init>()
            r6 = -1
            r5.uiMode = r6
            r6 = 0
            r5.fontScale = r6
            android.content.Context r5 = r11.createConfigurationContext(r5)
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            android.content.res.Resources r7 = r11.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r8 = r7.uiMode
            r5.uiMode = r8
            boolean r8 = r5.equals(r7)
            if (r8 != 0) goto L_0x0157
            android.content.res.Configuration r8 = new android.content.res.Configuration
            r8.<init>()
            r8.fontScale = r6
            int r6 = r5.diff(r7)
            if (r6 != 0) goto L_0x0075
            goto L_0x0158
        L_0x0075:
            float r6 = r5.fontScale
            float r9 = r7.fontScale
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x007f
            r8.fontScale = r9
        L_0x007f:
            int r6 = r5.mcc
            int r9 = r7.mcc
            if (r6 == r9) goto L_0x0087
            r8.mcc = r9
        L_0x0087:
            int r6 = r5.mnc
            int r9 = r7.mnc
            if (r6 == r9) goto L_0x008f
            r8.mnc = r9
        L_0x008f:
            r6 = 24
            if (r2 < r6) goto L_0x0097
            androidx.appcompat.app.AppCompatDelegateImpl.C0228f.m446a(r5, r7, r8)
            goto L_0x00a5
        L_0x0097:
            java.util.Locale r6 = r5.locale
            java.util.Locale r9 = r7.locale
            boolean r6 = p229r1.C6232b.m14816a(r6, r9)
            if (r6 != 0) goto L_0x00a5
            java.util.Locale r6 = r7.locale
            r8.locale = r6
        L_0x00a5:
            int r6 = r5.touchscreen
            int r9 = r7.touchscreen
            if (r6 == r9) goto L_0x00ad
            r8.touchscreen = r9
        L_0x00ad:
            int r6 = r5.keyboard
            int r9 = r7.keyboard
            if (r6 == r9) goto L_0x00b5
            r8.keyboard = r9
        L_0x00b5:
            int r6 = r5.keyboardHidden
            int r9 = r7.keyboardHidden
            if (r6 == r9) goto L_0x00bd
            r8.keyboardHidden = r9
        L_0x00bd:
            int r6 = r5.navigation
            int r9 = r7.navigation
            if (r6 == r9) goto L_0x00c5
            r8.navigation = r9
        L_0x00c5:
            int r6 = r5.navigationHidden
            int r9 = r7.navigationHidden
            if (r6 == r9) goto L_0x00cd
            r8.navigationHidden = r9
        L_0x00cd:
            int r6 = r5.orientation
            int r9 = r7.orientation
            if (r6 == r9) goto L_0x00d5
            r8.orientation = r9
        L_0x00d5:
            int r6 = r5.screenLayout
            r6 = r6 & 15
            int r9 = r7.screenLayout
            r9 = r9 & 15
            if (r6 == r9) goto L_0x00e4
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x00e4:
            int r6 = r5.screenLayout
            r6 = r6 & 192(0xc0, float:2.69E-43)
            int r9 = r7.screenLayout
            r9 = r9 & 192(0xc0, float:2.69E-43)
            if (r6 == r9) goto L_0x00f3
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x00f3:
            int r6 = r5.screenLayout
            r6 = r6 & 48
            int r9 = r7.screenLayout
            r9 = r9 & 48
            if (r6 == r9) goto L_0x0102
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x0102:
            int r6 = r5.screenLayout
            r6 = r6 & 768(0x300, float:1.076E-42)
            int r9 = r7.screenLayout
            r9 = r9 & 768(0x300, float:1.076E-42)
            if (r6 == r9) goto L_0x0111
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x0111:
            r6 = 26
            if (r2 < r6) goto L_0x0118
            androidx.appcompat.app.AppCompatDelegateImpl.C0229g.m447a(r5, r7, r8)
        L_0x0118:
            int r2 = r5.uiMode
            r2 = r2 & 15
            int r6 = r7.uiMode
            r6 = r6 & 15
            if (r2 == r6) goto L_0x0127
            int r2 = r8.uiMode
            r2 = r2 | r6
            r8.uiMode = r2
        L_0x0127:
            int r2 = r5.uiMode
            r2 = r2 & 48
            int r6 = r7.uiMode
            r6 = r6 & 48
            if (r2 == r6) goto L_0x0136
            int r2 = r8.uiMode
            r2 = r2 | r6
            r8.uiMode = r2
        L_0x0136:
            int r2 = r5.screenWidthDp
            int r6 = r7.screenWidthDp
            if (r2 == r6) goto L_0x013e
            r8.screenWidthDp = r6
        L_0x013e:
            int r2 = r5.screenHeightDp
            int r6 = r7.screenHeightDp
            if (r2 == r6) goto L_0x0146
            r8.screenHeightDp = r6
        L_0x0146:
            int r2 = r5.smallestScreenWidthDp
            int r6 = r7.smallestScreenWidthDp
            if (r2 == r6) goto L_0x014e
            r8.smallestScreenWidthDp = r6
        L_0x014e:
            int r2 = r5.densityDpi
            int r5 = r7.densityDpi
            if (r2 == r5) goto L_0x0158
            r8.densityDpi = r5
            goto L_0x0158
        L_0x0157:
            r8 = r3
        L_0x0158:
            android.content.res.Configuration r1 = m386H(r11, r1, r8, r0)
            n.c r2 = new n.c
            int r5 = p114i.C5223i.Theme_AppCompat_Empty
            r2.<init>((android.content.Context) r11, (int) r5)
            r2.mo21615a(r1)
            android.content.res.Resources$Theme r11 = r11.getTheme()     // Catch:{ NullPointerException -> 0x016e }
            if (r11 == 0) goto L_0x016f
            r11 = 1
            goto L_0x0170
        L_0x016e:
        L_0x016f:
            r11 = 0
        L_0x0170:
            if (r11 == 0) goto L_0x01ad
            android.content.res.Resources$Theme r11 = r2.getTheme()
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r1 < r5) goto L_0x0180
            p116i1.C5255i.m13272a(r11)
            goto L_0x01ad
        L_0x0180:
            r5 = 23
            if (r1 < r5) goto L_0x01ad
            java.lang.Object r1 = p116i1.C5254h.f17376a
            monitor-enter(r1)
            boolean r5 = p116i1.C5254h.f17378c     // Catch:{ all -> 0x01aa }
            if (r5 != 0) goto L_0x019c
            java.lang.Class<android.content.res.Resources$Theme> r5 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x019a }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x019a }
            p116i1.C5254h.f17377b = r5     // Catch:{ NoSuchMethodException -> 0x019a }
            r5.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x019a }
        L_0x019a:
            p116i1.C5254h.f17378c = r0     // Catch:{ all -> 0x01aa }
        L_0x019c:
            java.lang.reflect.Method r0 = p116i1.C5254h.f17377b     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x01a8
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x01a6 }
            r0.invoke(r11, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x01a6 }
            goto L_0x01a8
        L_0x01a6:
            p116i1.C5254h.f17377b = r3     // Catch:{ all -> 0x01aa }
        L_0x01a8:
            monitor-exit(r1)     // Catch:{ all -> 0x01aa }
            goto L_0x01ad
        L_0x01aa:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01aa }
            throw r11
        L_0x01ad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo869e(android.content.Context):android.content.Context");
    }

    /* renamed from: f */
    public final <T extends View> T mo870f(int i) {
        mo853K();
        return this.f649g.findViewById(i);
    }

    /* renamed from: g */
    public final C0223b mo871g() {
        return new C0223b();
    }

    /* renamed from: h */
    public final int mo872h() {
        return this.f637O;
    }

    /* renamed from: i */
    public final MenuInflater mo873i() {
        Context context;
        if (this.f653k == null) {
            mo859Q();
            ActionBar actionBar = this.f652j;
            if (actionBar != null) {
                context = actionBar.mo783e();
            } else {
                context = this.f648f;
            }
            this.f653k = new C5773f(context);
        }
        return this.f653k;
    }

    /* renamed from: j */
    public final ActionBar mo874j() {
        mo859Q();
        return this.f652j;
    }

    /* renamed from: k */
    public final void mo875k() {
        LayoutInflater from = LayoutInflater.from(this.f648f);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            boolean z = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    /* renamed from: l */
    public final void mo876l() {
        if (this.f652j != null) {
            mo859Q();
            if (!this.f652j.mo784f()) {
                this.f644X |= 1;
                if (!this.f643U) {
                    View decorView = this.f649g.getDecorView();
                    C0222a aVar = this.f645Y;
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6337d.m15053m(decorView, aVar);
                    this.f643U = true;
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo877m(Configuration configuration) {
        if (this.f624B && this.f667v) {
            mo859Q();
            ActionBar actionBar = this.f652j;
            if (actionBar != null) {
                actionBar.mo785g();
            }
        }
        C0407g a = C0407g.m1025a();
        Context context = this.f648f;
        synchronized (a) {
            C0478x0 x0Var = a.f1505a;
            synchronized (x0Var) {
                C6305e eVar = x0Var.f1663d.get(context);
                if (eVar != null) {
                    eVar.mo22326f();
                }
            }
        }
        this.f636N = new Configuration(this.f648f.getResources().getConfiguration());
        mo846C(false);
        configuration.updateFrom(this.f648f.getResources().getConfiguration());
    }

    /* renamed from: n */
    public final void mo878n() {
        this.f633K = true;
        mo846C(false);
        mo854L();
        Object obj = this.f647e;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = C4506m.m11740c(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar actionBar = this.f652j;
                if (actionBar == null) {
                    this.f646Z = true;
                } else {
                    actionBar.mo790l(true);
                }
            }
            synchronized (C0252j.f739d) {
                C0252j.m489u(this);
                C0252j.f738c.add(new WeakReference(this));
            }
        }
        this.f636N = new Configuration(this.f648f.getResources().getConfiguration());
        this.f634L = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo879o() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f647e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = androidx.appcompat.app.C0252j.f739d
            monitor-enter(r0)
            androidx.appcompat.app.C0252j.m489u(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f643U
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f649g
            android.view.View r0 = r0.getDecorView()
            androidx.appcompat.app.AppCompatDelegateImpl$a r1 = r3.f645Y
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.f635M = r0
            int r0 = r3.f637O
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f647e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            s0.h<java.lang.String, java.lang.Integer> r0 = f619o0
            java.lang.Object r1 = r3.f647e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f637O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            s0.h<java.lang.String, java.lang.Integer> r0 = f619o0
            java.lang.Object r1 = r3.f647e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            androidx.appcompat.app.ActionBar r0 = r3.f652j
            if (r0 == 0) goto L_0x0063
            r0.mo786h()
        L_0x0063:
            androidx.appcompat.app.AppCompatDelegateImpl$k r0 = r3.f641S
            if (r0 == 0) goto L_0x006a
            r0.mo926a()
        L_0x006a:
            androidx.appcompat.app.AppCompatDelegateImpl$i r0 = r3.f642T
            if (r0 == 0) goto L_0x0071
            r0.mo926a()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo879o():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: androidx.appcompat.widget.AppCompatRatingBar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v69, resolved type: androidx.appcompat.widget.AppCompatCheckedTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: androidx.appcompat.widget.AppCompatTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: androidx.appcompat.widget.AppCompatImageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: androidx.appcompat.widget.AppCompatSeekBar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: androidx.appcompat.widget.AppCompatSpinner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: androidx.appcompat.widget.AppCompatRadioButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: androidx.appcompat.widget.AppCompatToggleButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: androidx.appcompat.widget.AppCompatImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: androidx.appcompat.widget.AppCompatAutoCompleteTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: androidx.appcompat.widget.AppCompatCheckBox} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: androidx.appcompat.widget.AppCompatEditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v81, resolved type: androidx.appcompat.widget.AppCompatButton} */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r9v16, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r7 = this;
            androidx.appcompat.app.q r8 = r7.f659n0
            r0 = 0
            if (r8 != 0) goto L_0x003f
            android.content.Context r8 = r7.f648f
            int[] r1 = p114i.C5224j.AppCompatTheme
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r1)
            int r1 = p114i.C5224j.AppCompatTheme_viewInflaterClass
            java.lang.String r8 = r8.getString(r1)
            if (r8 != 0) goto L_0x001d
            androidx.appcompat.app.q r8 = new androidx.appcompat.app.q
            r8.<init>()
            r7.f659n0 = r8
            goto L_0x003f
        L_0x001d:
            android.content.Context r1 = r7.f648f     // Catch:{ all -> 0x0038 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ all -> 0x0038 }
            java.lang.Class r8 = r1.loadClass(r8)     // Catch:{ all -> 0x0038 }
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ all -> 0x0038 }
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r1)     // Catch:{ all -> 0x0038 }
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0038 }
            java.lang.Object r8 = r8.newInstance(r1)     // Catch:{ all -> 0x0038 }
            androidx.appcompat.app.q r8 = (androidx.appcompat.app.C0260q) r8     // Catch:{ all -> 0x0038 }
            r7.f659n0 = r8     // Catch:{ all -> 0x0038 }
            goto L_0x003f
        L_0x0038:
            androidx.appcompat.app.q r8 = new androidx.appcompat.app.q
            r8.<init>()
            r7.f659n0 = r8
        L_0x003f:
            androidx.appcompat.app.q r8 = r7.f659n0
            int r1 = androidx.appcompat.widget.C0450q1.f1612a
            r8.getClass()
            int[] r1 = p114i.C5224j.View
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r1, r0, r0)
            int r2 = p114i.C5224j.View_theme
            int r2 = r1.getResourceId(r2, r0)
            r1.recycle()
            if (r2 == 0) goto L_0x0068
            boolean r1 = r10 instanceof p175n.C5768c
            if (r1 == 0) goto L_0x0062
            r1 = r10
            n.c r1 = (p175n.C5768c) r1
            int r1 = r1.f18657b
            if (r1 == r2) goto L_0x0068
        L_0x0062:
            n.c r1 = new n.c
            r1.<init>((android.content.Context) r10, (int) r2)
            goto L_0x0069
        L_0x0068:
            r1 = r10
        L_0x0069:
            r9.getClass()
            int r2 = r9.hashCode()
            r3 = -1
            r4 = 3
            r5 = 1
            switch(r2) {
                case -1946472170: goto L_0x0119;
                case -1455429095: goto L_0x010e;
                case -1346021293: goto L_0x0103;
                case -938935918: goto L_0x00f8;
                case -937446323: goto L_0x00ed;
                case -658531749: goto L_0x00e2;
                case -339785223: goto L_0x00d7;
                case 776382189: goto L_0x00cc;
                case 799298502: goto L_0x00be;
                case 1125864064: goto L_0x00b0;
                case 1413872058: goto L_0x00a2;
                case 1601505219: goto L_0x0094;
                case 1666676343: goto L_0x0086;
                case 2001146706: goto L_0x0078;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x0124
        L_0x0078:
            java.lang.String r2 = "Button"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0082
            goto L_0x0124
        L_0x0082:
            r2 = 13
            goto L_0x0125
        L_0x0086:
            java.lang.String r2 = "EditText"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0090
            goto L_0x0124
        L_0x0090:
            r2 = 12
            goto L_0x0125
        L_0x0094:
            java.lang.String r2 = "CheckBox"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x009e
            goto L_0x0124
        L_0x009e:
            r2 = 11
            goto L_0x0125
        L_0x00a2:
            java.lang.String r2 = "AutoCompleteTextView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00ac
            goto L_0x0124
        L_0x00ac:
            r2 = 10
            goto L_0x0125
        L_0x00b0:
            java.lang.String r2 = "ImageView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00ba
            goto L_0x0124
        L_0x00ba:
            r2 = 9
            goto L_0x0125
        L_0x00be:
            java.lang.String r2 = "ToggleButton"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00c8
            goto L_0x0124
        L_0x00c8:
            r2 = 8
            goto L_0x0125
        L_0x00cc:
            java.lang.String r2 = "RadioButton"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00d5
            goto L_0x0124
        L_0x00d5:
            r2 = 7
            goto L_0x0125
        L_0x00d7:
            java.lang.String r2 = "Spinner"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00e0
            goto L_0x0124
        L_0x00e0:
            r2 = 6
            goto L_0x0125
        L_0x00e2:
            java.lang.String r2 = "SeekBar"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00eb
            goto L_0x0124
        L_0x00eb:
            r2 = 5
            goto L_0x0125
        L_0x00ed:
            java.lang.String r2 = "ImageButton"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00f6
            goto L_0x0124
        L_0x00f6:
            r2 = 4
            goto L_0x0125
        L_0x00f8:
            java.lang.String r2 = "TextView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0101
            goto L_0x0124
        L_0x0101:
            r2 = 3
            goto L_0x0125
        L_0x0103:
            java.lang.String r2 = "MultiAutoCompleteTextView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x010c
            goto L_0x0124
        L_0x010c:
            r2 = 2
            goto L_0x0125
        L_0x010e:
            java.lang.String r2 = "CheckedTextView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0117
            goto L_0x0124
        L_0x0117:
            r2 = 1
            goto L_0x0125
        L_0x0119:
            java.lang.String r2 = "RatingBar"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r2 = 0
            goto L_0x0125
        L_0x0124:
            r2 = -1
        L_0x0125:
            r6 = 0
            switch(r2) {
                case 0: goto L_0x0183;
                case 1: goto L_0x017d;
                case 2: goto L_0x0177;
                case 3: goto L_0x016f;
                case 4: goto L_0x0169;
                case 5: goto L_0x0163;
                case 6: goto L_0x015d;
                case 7: goto L_0x0155;
                case 8: goto L_0x014f;
                case 9: goto L_0x0149;
                case 10: goto L_0x0141;
                case 11: goto L_0x0139;
                case 12: goto L_0x0133;
                case 13: goto L_0x012b;
                default: goto L_0x0129;
            }
        L_0x0129:
            r2 = r6
            goto L_0x0188
        L_0x012b:
            androidx.appcompat.widget.AppCompatButton r2 = r8.mo967b(r1, r11)
            r8.mo972g(r2, r9)
            goto L_0x0188
        L_0x0133:
            androidx.appcompat.widget.AppCompatEditText r2 = new androidx.appcompat.widget.AppCompatEditText
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x0139:
            androidx.appcompat.widget.AppCompatCheckBox r2 = r8.mo968c(r1, r11)
            r8.mo972g(r2, r9)
            goto L_0x0188
        L_0x0141:
            androidx.appcompat.widget.AppCompatAutoCompleteTextView r2 = r8.mo966a(r1, r11)
            r8.mo972g(r2, r9)
            goto L_0x0188
        L_0x0149:
            androidx.appcompat.widget.AppCompatImageView r2 = new androidx.appcompat.widget.AppCompatImageView
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x014f:
            androidx.appcompat.widget.AppCompatToggleButton r2 = new androidx.appcompat.widget.AppCompatToggleButton
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x0155:
            androidx.appcompat.widget.AppCompatRadioButton r2 = r8.mo969d(r1, r11)
            r8.mo972g(r2, r9)
            goto L_0x0188
        L_0x015d:
            androidx.appcompat.widget.AppCompatSpinner r2 = new androidx.appcompat.widget.AppCompatSpinner
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x0163:
            androidx.appcompat.widget.AppCompatSeekBar r2 = new androidx.appcompat.widget.AppCompatSeekBar
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x0169:
            androidx.appcompat.widget.AppCompatImageButton r2 = new androidx.appcompat.widget.AppCompatImageButton
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x016f:
            androidx.appcompat.widget.AppCompatTextView r2 = r8.mo970e(r1, r11)
            r8.mo972g(r2, r9)
            goto L_0x0188
        L_0x0177:
            androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r2 = new androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x017d:
            androidx.appcompat.widget.AppCompatCheckedTextView r2 = new androidx.appcompat.widget.AppCompatCheckedTextView
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x0183:
            androidx.appcompat.widget.AppCompatRatingBar r2 = new androidx.appcompat.widget.AppCompatRatingBar
            r2.<init>(r1, r11)
        L_0x0188:
            if (r2 != 0) goto L_0x01e3
            if (r10 == r1) goto L_0x01e3
            java.lang.String r10 = "view"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x019b
            java.lang.String r9 = "class"
            java.lang.String r9 = r11.getAttributeValue(r6, r9)
        L_0x019b:
            java.lang.Object[] r10 = r8.f755a     // Catch:{ Exception -> 0x01dc, all -> 0x01d4 }
            r10[r0] = r1     // Catch:{ Exception -> 0x01dc, all -> 0x01d4 }
            r10[r5] = r11     // Catch:{ Exception -> 0x01dc, all -> 0x01d4 }
            r10 = 46
            int r10 = r9.indexOf(r10)     // Catch:{ Exception -> 0x01dc, all -> 0x01d4 }
            if (r3 != r10) goto L_0x01c8
            r10 = 0
        L_0x01aa:
            java.lang.String[] r2 = androidx.appcompat.app.C0260q.f753g     // Catch:{ Exception -> 0x01dc, all -> 0x01d4 }
            if (r10 >= r4) goto L_0x01c1
            r2 = r2[r10]     // Catch:{ Exception -> 0x01dc, all -> 0x01d4 }
            android.view.View r2 = r8.mo971f(r1, r9, r2)     // Catch:{ Exception -> 0x01dc, all -> 0x01d4 }
            if (r2 == 0) goto L_0x01be
            java.lang.Object[] r8 = r8.f755a
            r8[r0] = r6
            r8[r5] = r6
            r6 = r2
            goto L_0x01e2
        L_0x01be:
            int r10 = r10 + 1
            goto L_0x01aa
        L_0x01c1:
            java.lang.Object[] r8 = r8.f755a
            r8[r0] = r6
            r8[r5] = r6
            goto L_0x01e2
        L_0x01c8:
            android.view.View r9 = r8.mo971f(r1, r9, r6)     // Catch:{ Exception -> 0x01dc, all -> 0x01d4 }
            java.lang.Object[] r8 = r8.f755a
            r8[r0] = r6
            r8[r5] = r6
            r6 = r9
            goto L_0x01e2
        L_0x01d4:
            r9 = move-exception
            java.lang.Object[] r8 = r8.f755a
            r8[r0] = r6
            r8[r5] = r6
            throw r9
        L_0x01dc:
            java.lang.Object[] r8 = r8.f755a
            r8[r0] = r6
            r8[r5] = r6
        L_0x01e2:
            r2 = r6
        L_0x01e3:
            if (r2 == 0) goto L_0x0263
            android.content.Context r8 = r2.getContext()
            boolean r9 = r8 instanceof android.content.ContextWrapper
            if (r9 == 0) goto L_0x020d
            java.util.WeakHashMap<android.view.View, s1.p0> r9 = p242s1.C6333d0.f19990a
            boolean r9 = p242s1.C6333d0.C6336c.m15040a(r2)
            if (r9 != 0) goto L_0x01f6
            goto L_0x020d
        L_0x01f6:
            int[] r9 = androidx.appcompat.app.C0260q.f749c
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r11, r9)
            java.lang.String r9 = r8.getString(r0)
            if (r9 == 0) goto L_0x020a
            androidx.appcompat.app.q$a r10 = new androidx.appcompat.app.q$a
            r10.<init>(r2, r9)
            r2.setOnClickListener(r10)
        L_0x020a:
            r8.recycle()
        L_0x020d:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r8 <= r9) goto L_0x0214
            goto L_0x0263
        L_0x0214:
            int[] r8 = androidx.appcompat.app.C0260q.f750d
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r11, r8)
            boolean r9 = r8.hasValue(r0)
            if (r9 == 0) goto L_0x0227
            boolean r9 = r8.getBoolean(r0, r0)
            p242s1.C6333d0.m15030r(r2, r9)
        L_0x0227:
            r8.recycle()
            int[] r8 = androidx.appcompat.app.C0260q.f751e
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r11, r8)
            boolean r9 = r8.hasValue(r0)
            if (r9 == 0) goto L_0x023d
            java.lang.String r9 = r8.getString(r0)
            p242s1.C6333d0.m15031s(r2, r9)
        L_0x023d:
            r8.recycle()
            int[] r8 = androidx.appcompat.app.C0260q.f752f
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r11, r8)
            boolean r9 = r8.hasValue(r0)
            if (r9 == 0) goto L_0x0260
            boolean r9 = r8.getBoolean(r0, r0)
            java.util.WeakHashMap<android.view.View, s1.p0> r10 = p242s1.C6333d0.f19990a
            s1.z r10 = new s1.z
            int r11 = p055d1.C4329e.tag_screen_reader_focusable
            r10.<init>(r11)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r10.mo22469e(r2, r9)
        L_0x0260:
            r8.recycle()
        L_0x0263:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: p */
    public final void mo882p() {
        mo853K();
    }

    /* renamed from: q */
    public final void mo883q() {
        mo859Q();
        ActionBar actionBar = this.f652j;
        if (actionBar != null) {
            actionBar.mo798t(true);
        }
    }

    /* renamed from: r */
    public final void mo884r() {
    }

    /* renamed from: s */
    public final void mo885s() {
        mo868d();
    }

    /* renamed from: t */
    public final void mo886t() {
        mo859Q();
        ActionBar actionBar = this.f652j;
        if (actionBar != null) {
            actionBar.mo798t(false);
        }
    }

    /* renamed from: v */
    public final boolean mo887v(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f628F && i == 108) {
            return false;
        }
        if (this.f624B && i == 1) {
            this.f624B = false;
        }
        if (i == 1) {
            mo864V();
            this.f628F = true;
            return true;
        } else if (i == 2) {
            mo864V();
            this.f671z = true;
            return true;
        } else if (i == 5) {
            mo864V();
            this.f623A = true;
            return true;
        } else if (i == 10) {
            mo864V();
            this.f626D = true;
            return true;
        } else if (i == 108) {
            mo864V();
            this.f624B = true;
            return true;
        } else if (i != 109) {
            return this.f649g.requestFeature(i);
        } else {
            mo864V();
            this.f625C = true;
            return true;
        }
    }

    /* renamed from: w */
    public final void mo888w(int i) {
        mo853K();
        ViewGroup viewGroup = (ViewGroup) this.f668w.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f648f).inflate(i, viewGroup);
        this.f650h.mo910a(this.f649g.getCallback());
    }

    /* renamed from: x */
    public final void mo889x(View view) {
        mo853K();
        ViewGroup viewGroup = (ViewGroup) this.f668w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f650h.mo910a(this.f649g.getCallback());
    }

    /* renamed from: y */
    public final void mo890y(View view, ViewGroup.LayoutParams layoutParams) {
        mo853K();
        ViewGroup viewGroup = (ViewGroup) this.f668w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f650h.mo910a(this.f649g.getCallback());
    }

    /* renamed from: z */
    public final void mo891z(Toolbar toolbar) {
        CharSequence charSequence;
        if (this.f647e instanceof Activity) {
            mo859Q();
            ActionBar actionBar = this.f652j;
            if (!(actionBar instanceof C0274w)) {
                this.f653k = null;
                if (actionBar != null) {
                    actionBar.mo786h();
                }
                this.f652j = null;
                if (toolbar != null) {
                    Object obj = this.f647e;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f654l;
                    }
                    C0265t tVar = new C0265t(toolbar, charSequence, this.f650h);
                    this.f652j = tVar;
                    this.f650h.f697c = tVar.f772c;
                } else {
                    this.f650h.f697c = null;
                }
                mo876l();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    public class C0230h extends C5778h {

        /* renamed from: c */
        public C0224c f697c;

        /* renamed from: d */
        public boolean f698d;

        /* renamed from: e */
        public boolean f699e;

        /* renamed from: f */
        public boolean f700f;

        public C0230h(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public final void mo910a(Window.Callback callback) {
            try {
                this.f698d = true;
                callback.onContentChanged();
                this.f698d = false;
            } catch (Throwable th) {
                this.f698d = false;
                throw th;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:0x013d, code lost:
            if (p242s1.C6333d0.C6340g.m15076c(r1) != false) goto L_0x0141;
         */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0055  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p175n.C5771e mo911b(android.view.ActionMode.Callback r10) {
            /*
                r9 = this;
                n.e$a r0 = new n.e$a
                androidx.appcompat.app.AppCompatDelegateImpl r1 = androidx.appcompat.app.AppCompatDelegateImpl.this
                android.content.Context r1 = r1.f648f
                r0.<init>(r1, r10)
                androidx.appcompat.app.AppCompatDelegateImpl r10 = androidx.appcompat.app.AppCompatDelegateImpl.this
                n.a r1 = r10.f661p
                if (r1 == 0) goto L_0x0012
                r1.mo993c()
            L_0x0012:
                androidx.appcompat.app.AppCompatDelegateImpl$e r1 = new androidx.appcompat.app.AppCompatDelegateImpl$e
                r1.<init>(r0)
                r10.mo859Q()
                androidx.appcompat.app.ActionBar r2 = r10.f652j
                if (r2 == 0) goto L_0x002d
                n.a r2 = r2.mo803y(r1)
                r10.f661p = r2
                if (r2 == 0) goto L_0x002d
                androidx.appcompat.app.i r3 = r10.f651i
                if (r3 == 0) goto L_0x002d
                r3.onSupportActionModeStarted(r2)
            L_0x002d:
                n.a r2 = r10.f661p
                r3 = 0
                if (r2 != 0) goto L_0x01a1
                s1.p0 r2 = r10.f665t
                if (r2 == 0) goto L_0x0039
                r2.mo22492b()
            L_0x0039:
                n.a r2 = r10.f661p
                if (r2 == 0) goto L_0x0040
                r2.mo993c()
            L_0x0040:
                androidx.appcompat.app.i r2 = r10.f651i
                if (r2 == 0) goto L_0x004e
                boolean r4 = r10.f635M
                if (r4 != 0) goto L_0x004e
                n.a r2 = r2.onWindowStartingSupportActionMode(r1)     // Catch:{ AbstractMethodError -> 0x004d }
                goto L_0x004f
            L_0x004d:
            L_0x004e:
                r2 = r3
            L_0x004f:
                if (r2 == 0) goto L_0x0055
                r10.f661p = r2
                goto L_0x0192
            L_0x0055:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f662q
                r4 = 0
                r5 = 1
                if (r2 != 0) goto L_0x0100
                boolean r2 = r10.f627E
                if (r2 == 0) goto L_0x00e1
                android.util.TypedValue r2 = new android.util.TypedValue
                r2.<init>()
                android.content.Context r6 = r10.f648f
                android.content.res.Resources$Theme r6 = r6.getTheme()
                int r7 = p114i.C5215a.actionBarTheme
                r6.resolveAttribute(r7, r2, r5)
                int r7 = r2.resourceId
                if (r7 == 0) goto L_0x0094
                android.content.Context r7 = r10.f648f
                android.content.res.Resources r7 = r7.getResources()
                android.content.res.Resources$Theme r7 = r7.newTheme()
                r7.setTo(r6)
                int r6 = r2.resourceId
                r7.applyStyle(r6, r5)
                n.c r6 = new n.c
                android.content.Context r8 = r10.f648f
                r6.<init>((android.content.Context) r8, (int) r4)
                android.content.res.Resources$Theme r8 = r6.getTheme()
                r8.setTo(r7)
                goto L_0x0096
            L_0x0094:
                android.content.Context r6 = r10.f648f
            L_0x0096:
                androidx.appcompat.widget.ActionBarContextView r7 = new androidx.appcompat.widget.ActionBarContextView
                r7.<init>(r6, r3)
                r10.f662q = r7
                android.widget.PopupWindow r7 = new android.widget.PopupWindow
                int r8 = p114i.C5215a.actionModePopupWindowStyle
                r7.<init>(r6, r3, r8)
                r10.f663r = r7
                r8 = 2
                androidx.core.widget.C0798j.m2413b(r7, r8)
                android.widget.PopupWindow r7 = r10.f663r
                androidx.appcompat.widget.ActionBarContextView r8 = r10.f662q
                r7.setContentView(r8)
                android.widget.PopupWindow r7 = r10.f663r
                r8 = -1
                r7.setWidth(r8)
                android.content.res.Resources$Theme r7 = r6.getTheme()
                int r8 = p114i.C5215a.actionBarSize
                r7.resolveAttribute(r8, r2, r5)
                int r2 = r2.data
                android.content.res.Resources r6 = r6.getResources()
                android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
                int r2 = android.util.TypedValue.complexToDimensionPixelSize(r2, r6)
                androidx.appcompat.widget.ActionBarContextView r6 = r10.f662q
                r6.setContentHeight(r2)
                android.widget.PopupWindow r2 = r10.f663r
                r6 = -2
                r2.setHeight(r6)
                androidx.appcompat.app.m r2 = new androidx.appcompat.app.m
                r2.<init>(r10)
                r10.f664s = r2
                goto L_0x0100
            L_0x00e1:
                android.view.ViewGroup r2 = r10.f668w
                int r6 = p114i.C5220f.action_mode_bar_stub
                android.view.View r2 = r2.findViewById(r6)
                androidx.appcompat.widget.ViewStubCompat r2 = (androidx.appcompat.widget.ViewStubCompat) r2
                if (r2 == 0) goto L_0x0100
                android.content.Context r6 = r10.mo855M()
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                r2.setLayoutInflater(r6)
                android.view.View r2 = r2.mo2005a()
                androidx.appcompat.widget.ActionBarContextView r2 = (androidx.appcompat.widget.ActionBarContextView) r2
                r10.f662q = r2
            L_0x0100:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f662q
                if (r2 == 0) goto L_0x0192
                s1.p0 r2 = r10.f665t
                if (r2 == 0) goto L_0x010b
                r2.mo22492b()
            L_0x010b:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f662q
                r2.mo1251h()
                n.d r2 = new n.d
                androidx.appcompat.widget.ActionBarContextView r6 = r10.f662q
                android.content.Context r6 = r6.getContext()
                androidx.appcompat.widget.ActionBarContextView r7 = r10.f662q
                r2.<init>(r6, r7, r1)
                androidx.appcompat.view.menu.f r6 = r2.f18667i
                boolean r1 = r1.mo907c(r2, r6)
                if (r1 == 0) goto L_0x0190
                r2.mo999i()
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f662q
                r1.mo1243f(r2)
                r10.f661p = r2
                boolean r1 = r10.f667v
                if (r1 == 0) goto L_0x0140
                android.view.ViewGroup r1 = r10.f668w
                if (r1 == 0) goto L_0x0140
                java.util.WeakHashMap<android.view.View, s1.p0> r2 = p242s1.C6333d0.f19990a
                boolean r1 = p242s1.C6333d0.C6340g.m15076c(r1)
                if (r1 == 0) goto L_0x0140
                goto L_0x0141
            L_0x0140:
                r5 = 0
            L_0x0141:
                r1 = 1065353216(0x3f800000, float:1.0)
                if (r5 == 0) goto L_0x015f
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f662q
                r4 = 0
                r2.setAlpha(r4)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f662q
                s1.p0 r2 = p242s1.C6333d0.m15013a(r2)
                r2.mo22491a(r1)
                r10.f665t = r2
                androidx.appcompat.app.n r1 = new androidx.appcompat.app.n
                r1.<init>(r10)
                r2.mo22497g(r1)
                goto L_0x0180
            L_0x015f:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f662q
                r2.setAlpha(r1)
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f662q
                r1.setVisibility(r4)
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f662q
                android.view.ViewParent r1 = r1.getParent()
                boolean r1 = r1 instanceof android.view.View
                if (r1 == 0) goto L_0x0180
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f662q
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                java.util.WeakHashMap<android.view.View, s1.p0> r2 = p242s1.C6333d0.f19990a
                p242s1.C6333d0.C6341h.m15083c(r1)
            L_0x0180:
                android.widget.PopupWindow r1 = r10.f663r
                if (r1 == 0) goto L_0x0192
                android.view.Window r1 = r10.f649g
                android.view.View r1 = r1.getDecorView()
                androidx.appcompat.app.m r2 = r10.f664s
                r1.post(r2)
                goto L_0x0192
            L_0x0190:
                r10.f661p = r3
            L_0x0192:
                n.a r1 = r10.f661p
                if (r1 == 0) goto L_0x019d
                androidx.appcompat.app.i r2 = r10.f651i
                if (r2 == 0) goto L_0x019d
                r2.onSupportActionModeStarted(r1)
            L_0x019d:
                n.a r1 = r10.f661p
                r10.f661p = r1
            L_0x01a1:
                n.a r10 = r10.f661p
                if (r10 == 0) goto L_0x01aa
                n.e r10 = r0.mo21640e(r10)
                return r10
            L_0x01aa:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.C0230h.mo911b(android.view.ActionMode$Callback):n.e");
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f699e) {
                return this.f18723b.dispatchKeyEvent(keyEvent);
            }
            if (AppCompatDelegateImpl.this.mo851I(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
            if (r6 != false) goto L_0x0048;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x004d
                androidx.appcompat.app.AppCompatDelegateImpl r0 = androidx.appcompat.app.AppCompatDelegateImpl.this
                int r3 = r6.getKeyCode()
                r0.mo859Q()
                androidx.appcompat.app.ActionBar r4 = r0.f652j
                if (r4 == 0) goto L_0x001c
                boolean r3 = r4.mo787i(r3, r6)
                if (r3 == 0) goto L_0x001c
                goto L_0x0048
            L_0x001c:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.f631I
                if (r3 == 0) goto L_0x0031
                int r4 = r6.getKeyCode()
                boolean r3 = r0.mo862T(r3, r4, r6)
                if (r3 == 0) goto L_0x0031
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r6 = r0.f631I
                if (r6 == 0) goto L_0x0048
                r6.f683l = r2
                goto L_0x0048
            L_0x0031:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.f631I
                if (r3 != 0) goto L_0x004a
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.mo857O(r1)
                r0.mo863U(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.mo862T(r3, r4, r6)
                r3.f682k = r1
                if (r6 == 0) goto L_0x004a
            L_0x0048:
                r6 = 1
                goto L_0x004b
            L_0x004a:
                r6 = 0
            L_0x004b:
                if (r6 == 0) goto L_0x004e
            L_0x004d:
                r1 = 1
            L_0x004e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.C0230h.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public final void onContentChanged() {
            if (this.f698d) {
                this.f18723b.onContentChanged();
            }
        }

        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0291f)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public final View onCreatePanelView(int i) {
            View view;
            C0224c cVar = this.f697c;
            if (cVar != null) {
                C0265t.C0270e eVar = (C0265t.C0270e) cVar;
                if (i == 0) {
                    view = new View(C0265t.this.f770a.getContext());
                } else {
                    view = null;
                }
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i);
        }

        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                appCompatDelegateImpl.mo859Q();
                ActionBar actionBar = appCompatDelegateImpl.f652j;
                if (actionBar != null) {
                    actionBar.mo781c(true);
                }
            } else {
                appCompatDelegateImpl.getClass();
            }
            return true;
        }

        public final void onPanelClosed(int i, Menu menu) {
            if (this.f700f) {
                this.f18723b.onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                appCompatDelegateImpl.mo859Q();
                ActionBar actionBar = appCompatDelegateImpl.f652j;
                if (actionBar != null) {
                    actionBar.mo781c(false);
                }
            } else if (i == 0) {
                PanelFeatureState O = appCompatDelegateImpl.mo857O(i);
                if (O.f684m) {
                    appCompatDelegateImpl.mo850G(O, false);
                }
            } else {
                appCompatDelegateImpl.getClass();
            }
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            C0291f fVar;
            if (menu instanceof C0291f) {
                fVar = (C0291f) menu;
            } else {
                fVar = null;
            }
            if (i == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f945x = true;
            }
            C0224c cVar = this.f697c;
            if (cVar != null) {
                C0265t.C0270e eVar = (C0265t.C0270e) cVar;
                if (i == 0) {
                    C0265t tVar = C0265t.this;
                    if (!tVar.f773d) {
                        tVar.f770a.f1548m = true;
                        tVar.f773d = true;
                    }
                }
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (fVar != null) {
                fVar.f945x = false;
            }
            return onPreparePanel;
        }

        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0291f fVar = AppCompatDelegateImpl.this.mo857O(0).f679h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.f666u) {
                return mo911b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.f666u || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo911b(callback);
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
