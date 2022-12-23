package p175n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import p114i.C5223i;

/* renamed from: n.c */
public class C5768c extends ContextWrapper {

    /* renamed from: g */
    public static Configuration f18656g;

    /* renamed from: b */
    public int f18657b;

    /* renamed from: c */
    public Resources.Theme f18658c;

    /* renamed from: d */
    public LayoutInflater f18659d;

    /* renamed from: e */
    public Configuration f18660e;

    /* renamed from: f */
    public Resources f18661f;

    /* renamed from: n.c$a */
    public static class C5769a {
        /* renamed from: a */
        public static Context m14190a(C5768c cVar, Configuration configuration) {
            return cVar.createConfigurationContext(configuration);
        }
    }

    public C5768c() {
        super((Context) null);
    }

    /* renamed from: a */
    public final void mo21615a(Configuration configuration) {
        if (this.f18661f != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f18660e == null) {
            this.f18660e = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public final void mo21617c() {
        boolean z;
        if (this.f18658c == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f18658c = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f18658c.setTo(theme);
            }
        }
        this.f18658c.applyStyle(this.f18657b, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.equals(f18656g) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f18661f
            if (r0 != 0) goto L_0x0038
            android.content.res.Configuration r0 = r3.f18660e
            if (r0 == 0) goto L_0x0032
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0025
            android.content.res.Configuration r1 = f18656g
            if (r1 != 0) goto L_0x001c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            f18656g = r1
        L_0x001c:
            android.content.res.Configuration r1 = f18656g
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0032
        L_0x0025:
            android.content.res.Configuration r0 = r3.f18660e
            android.content.Context r0 = p175n.C5768c.C5769a.m14190a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f18661f = r0
            goto L_0x0038
        L_0x0032:
            android.content.res.Resources r0 = super.getResources()
            r3.f18661f = r0
        L_0x0038:
            android.content.res.Resources r0 = r3.f18661f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p175n.C5768c.getResources():android.content.res.Resources");
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f18659d == null) {
            this.f18659d = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f18659d;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f18658c;
        if (theme != null) {
            return theme;
        }
        if (this.f18657b == 0) {
            this.f18657b = C5223i.Theme_AppCompat_Light;
        }
        mo21617c();
        return this.f18658c;
    }

    public final void setTheme(int i) {
        if (this.f18657b != i) {
            this.f18657b = i;
            mo21617c();
        }
    }

    public C5768c(Context context, int i) {
        super(context);
        this.f18657b = i;
    }

    public C5768c(Context context, Resources.Theme theme) {
        super(context);
        this.f18658c = theme;
    }
}
