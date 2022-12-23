package p072e6;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p311x6.C7176l;

/* renamed from: e6.j */
public final class C4575j implements C4566d {

    /* renamed from: f */
    public static final Bitmap.Config f15745f = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final C4577k f15746a;

    /* renamed from: b */
    public final Set<Bitmap.Config> f15747b;

    /* renamed from: c */
    public final C4576a f15748c;

    /* renamed from: d */
    public long f15749d;

    /* renamed from: e */
    public long f15750e;

    /* renamed from: e6.j$a */
    public static final class C4576a {
    }

    public C4575j(long j) {
        C4579m mVar = new C4579m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f15749d = j;
        this.f15746a = mVar;
        this.f15747b = unmodifiableSet;
        this.f15748c = new C4576a();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public final void mo20083a(int i) {
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            mo20084b();
        } else if (i >= 20 || i == 15) {
            mo20102g(this.f15749d / 2);
        }
    }

    /* renamed from: b */
    public final void mo20084b() {
        mo20102g(0);
    }

    /* renamed from: c */
    public final Bitmap mo20085c(int i, int i2, Bitmap.Config config) {
        Bitmap f = mo20101f(i, i2, config);
        if (f != null) {
            return f;
        }
        if (config == null) {
            config = f15745f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: d */
    public final synchronized void mo20086d(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((C4579m) this.f15746a).getClass();
                        if (((long) C7176l.m16783c(bitmap)) <= this.f15749d) {
                            if (this.f15747b.contains(bitmap.getConfig())) {
                                ((C4579m) this.f15746a).getClass();
                                int c = C7176l.m16783c(bitmap);
                                ((C4579m) this.f15746a).mo20107f(bitmap);
                                this.f15748c.getClass();
                                this.f15750e += (long) c;
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    ((C4579m) this.f15746a).mo20106e(bitmap);
                                }
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    Objects.toString(this.f15746a);
                                }
                                mo20102g(this.f15749d);
                                return;
                            }
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        ((C4579m) this.f15746a).mo20106e(bitmap);
                        bitmap.isMutable();
                        this.f15747b.contains(bitmap.getConfig());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: e */
    public final Bitmap mo20087e(int i, int i2, Bitmap.Config config) {
        Bitmap f = mo20101f(i, i2, config);
        if (f != null) {
            f.eraseColor(0);
            return f;
        }
        if (config == null) {
            config = f15745f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: f */
    public final synchronized Bitmap mo20101f(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap b;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                if (config == Bitmap.Config.HARDWARE) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            C4577k kVar = this.f15746a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = f15745f;
            }
            b = ((C4579m) kVar).mo20104b(i, i2, config2);
            if (b != null) {
                long j = this.f15750e;
                ((C4579m) this.f15746a).getClass();
                this.f15750e = j - ((long) C7176l.m16783c(b));
                this.f15748c.getClass();
                b.setHasAlpha(true);
                b.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                ((C4579m) this.f15746a).getClass();
                C4579m.m11891c(C7176l.m16784d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                ((C4579m) this.f15746a).getClass();
                C4579m.m11891c(C7176l.m16784d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f15746a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    /* renamed from: g */
    public final synchronized void mo20102g(long j) {
        while (this.f15750e > j) {
            C4579m mVar = (C4579m) this.f15746a;
            Bitmap c = mVar.f15757b.mo20090c();
            if (c != null) {
                mVar.mo20103a(Integer.valueOf(C7176l.m16783c(c)), c);
            }
            if (c == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.f15746a);
                }
                this.f15750e = 0;
                return;
            }
            this.f15748c.getClass();
            long j2 = this.f15750e;
            ((C4579m) this.f15746a).getClass();
            this.f15750e = j2 - ((long) C7176l.m16783c(c));
            if (Log.isLoggable("LruBitmapPool", 3)) {
                ((C4579m) this.f15746a).mo20106e(c);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f15746a);
            }
            c.recycle();
        }
    }
}
