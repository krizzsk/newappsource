package p072e6;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p311x6.C7176l;

/* renamed from: e6.m */
public final class C4579m implements C4577k {

    /* renamed from: d */
    public static final Bitmap.Config[] f15751d;

    /* renamed from: e */
    public static final Bitmap.Config[] f15752e;

    /* renamed from: f */
    public static final Bitmap.Config[] f15753f = {Bitmap.Config.RGB_565};

    /* renamed from: g */
    public static final Bitmap.Config[] f15754g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h */
    public static final Bitmap.Config[] f15755h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    public final C4582c f15756a = new C4582c();

    /* renamed from: b */
    public final C4569g<C4581b, Bitmap> f15757b = new C4569g<>();

    /* renamed from: c */
    public final HashMap f15758c = new HashMap();

    /* renamed from: e6.m$a */
    public static /* synthetic */ class C4580a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15759a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15759a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15759a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15759a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15759a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p072e6.C4579m.C4580a.<clinit>():void");
        }
    }

    /* renamed from: e6.m$b */
    public static final class C4581b implements C4578l {

        /* renamed from: a */
        public final C4582c f15760a;

        /* renamed from: b */
        public int f15761b;

        /* renamed from: c */
        public Bitmap.Config f15762c;

        public C4581b(C4582c cVar) {
            this.f15760a = cVar;
        }

        /* renamed from: a */
        public final void mo20097a() {
            this.f15760a.mo20082f(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C4581b)) {
                return false;
            }
            C4581b bVar = (C4581b) obj;
            if (this.f15761b != bVar.f15761b || !C7176l.m16782b(this.f15762c, bVar.f15762c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i;
            int i2 = this.f15761b * 31;
            Bitmap.Config config = this.f15762c;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public final String toString() {
            return C4579m.m11891c(this.f15761b, this.f15762c);
        }
    }

    /* renamed from: e6.m$c */
    public static class C4582c extends C4565c {
        public C4582c() {
            super(0);
        }

        /* renamed from: a */
        public final C4578l mo20077a() {
            return new C4581b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f15751d = configArr;
        f15752e = configArr;
    }

    /* renamed from: c */
    public static String m11891c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: a */
    public final void mo20103a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d = mo20105d(bitmap.getConfig());
        Integer num2 = d.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo20106e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            d.remove(num);
        } else {
            d.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: b */
    public final Bitmap mo20104b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int d = C7176l.m16784d(config) * i * i2;
        C4581b bVar = (C4581b) this.f15756a.mo20079c();
        bVar.f15761b = d;
        bVar.f15762c = config;
        int i3 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i4 = C4580a.f15759a[config.ordinal()];
            if (i4 == 1) {
                configArr = f15751d;
            } else if (i4 == 2) {
                configArr = f15753f;
            } else if (i4 != 3) {
                configArr = i4 != 4 ? new Bitmap.Config[]{config} : f15755h;
            } else {
                configArr = f15754g;
            }
        } else {
            configArr = f15752e;
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i3];
            Integer ceilingKey = mo20105d(config2).ceilingKey(Integer.valueOf(d));
            if (ceilingKey == null || ceilingKey.intValue() > d * 8) {
                i3++;
            } else if (ceilingKey.intValue() != d || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f15756a.mo20082f(bVar);
                C4582c cVar = this.f15756a;
                int intValue = ceilingKey.intValue();
                bVar = (C4581b) cVar.mo20079c();
                bVar.f15761b = intValue;
                bVar.f15762c = config2;
            }
        }
        Bitmap a = this.f15757b.mo20088a(bVar);
        if (a != null) {
            mo20103a(Integer.valueOf(bVar.f15761b), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }

    /* renamed from: d */
    public final NavigableMap<Integer, Integer> mo20105d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f15758c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f15758c.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: e */
    public final String mo20106e(Bitmap bitmap) {
        return m11891c(C7176l.m16783c(bitmap), bitmap.getConfig());
    }

    /* renamed from: f */
    public final void mo20107f(Bitmap bitmap) {
        int c = C7176l.m16783c(bitmap);
        C4582c cVar = this.f15756a;
        Bitmap.Config config = bitmap.getConfig();
        C4581b bVar = (C4581b) cVar.mo20079c();
        bVar.f15761b = c;
        bVar.f15762c = config;
        this.f15757b.mo20089b(bVar, bitmap);
        NavigableMap<Integer, Integer> d = mo20105d(bitmap.getConfig());
        Integer num = d.get(Integer.valueOf(bVar.f15761b));
        Integer valueOf = Integer.valueOf(bVar.f15761b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        d.put(valueOf, Integer.valueOf(i));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("SizeConfigStrategy{groupedMap=");
        k.append(this.f15757b);
        k.append(", sortedSizes=(");
        for (Map.Entry entry : this.f15758c.entrySet()) {
            k.append(entry.getKey());
            k.append('[');
            k.append(entry.getValue());
            k.append("], ");
        }
        if (!this.f15758c.isEmpty()) {
            k.replace(k.length() - 2, k.length(), "");
        }
        k.append(")}");
        return k.toString();
    }
}
