package p718pc;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.assetpacks.C14256d1;
import p329z1.C7401a;
import p329z1.C7418c;
import p329z1.C7419d;
import p329z1.C7420e;
import p718pc.C18893c;

/* renamed from: pc.h */
public final class C18900h<S extends C18893c> extends C18904k {

    /* renamed from: r */
    public static final C18901a f48107r = new C18901a();

    /* renamed from: m */
    public C18906l<S> f48108m;

    /* renamed from: n */
    public final C7420e f48109n;

    /* renamed from: o */
    public final C7419d f48110o;

    /* renamed from: p */
    public float f48111p;

    /* renamed from: q */
    public boolean f48112q = false;

    /* renamed from: pc.h$a */
    public class C18901a extends C7418c {
        public C18901a() {
            super("indicatorLevel");
        }

        /* renamed from: a */
        public final float mo23637a(Object obj) {
            return ((C18900h) obj).f48111p * 10000.0f;
        }

        /* renamed from: b */
        public final void mo23638b(Object obj, float f) {
            C18900h hVar = (C18900h) obj;
            hVar.f48111p = f / 10000.0f;
            hVar.invalidateSelf();
        }
    }

    public C18900h(Context context, C18893c cVar, C18906l<S> lVar) {
        super(context, cVar);
        this.f48108m = lVar;
        lVar.f48127b = this;
        C7420e eVar = new C7420e();
        this.f48109n = eVar;
        eVar.f22806b = (double) 1.0f;
        eVar.f22807c = false;
        eVar.f22805a = Math.sqrt((double) 50.0f);
        eVar.f22807c = false;
        C7419d dVar = new C7419d(this);
        this.f48110o = dVar;
        dVar.f22802r = eVar;
        if (this.f48123i != 1.0f) {
            this.f48123i = 1.0f;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            C18906l<S> lVar = this.f48108m;
            float b = mo51402b();
            lVar.f48126a.mo42099a();
            lVar.mo51382a(canvas, b);
            this.f48108m.mo51384c(canvas, this.f48124j);
            Canvas canvas2 = canvas;
            this.f48108m.mo51383b(canvas2, this.f48124j, BitmapDescriptorFactory.HUE_RED, this.f48111p, C14256d1.m35483a(this.f48117c.f48084c[0], this.f48125k));
            canvas.restore();
        }
    }

    /* renamed from: f */
    public final boolean mo51395f(boolean z, boolean z2, boolean z3) {
        boolean f = super.mo51395f(z, z2, z3);
        C18887a aVar = this.f48118d;
        ContentResolver contentResolver = this.f48116b.getContentResolver();
        aVar.getClass();
        float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            this.f48112q = true;
        } else {
            this.f48112q = false;
            C7420e eVar = this.f48109n;
            float f3 = 50.0f / f2;
            eVar.getClass();
            if (f3 > BitmapDescriptorFactory.HUE_RED) {
                eVar.f22805a = Math.sqrt((double) f3);
                eVar.f22807c = false;
            } else {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
        }
        return f;
    }

    public final int getIntrinsicHeight() {
        return this.f48108m.mo51385d();
    }

    public final int getIntrinsicWidth() {
        return this.f48108m.mo51386e();
    }

    public final void jumpToCurrentState() {
        this.f48110o.mo23641c();
        this.f48111p = ((float) getLevel()) / 10000.0f;
        invalidateSelf();
    }

    public final boolean onLevelChange(int i) {
        if (this.f48112q) {
            this.f48110o.mo23641c();
            this.f48111p = ((float) i) / 10000.0f;
            invalidateSelf();
        } else {
            C7419d dVar = this.f48110o;
            dVar.f22789b = this.f48111p * 10000.0f;
            dVar.f22790c = true;
            float f = (float) i;
            if (dVar.f22793f) {
                dVar.f22803s = f;
            } else {
                if (dVar.f22802r == null) {
                    dVar.f22802r = new C7420e(f);
                }
                C7420e eVar = dVar.f22802r;
                double d = (double) f;
                eVar.f22813i = d;
                double d2 = (double) ((float) d);
                if (d2 > ((double) Float.MAX_VALUE)) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                } else if (d2 >= ((double) dVar.f22794g)) {
                    double abs = Math.abs((double) (dVar.f22796i * 0.75f));
                    eVar.f22808d = abs;
                    eVar.f22809e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z = dVar.f22793f;
                        if (!z && !z) {
                            dVar.f22793f = true;
                            if (!dVar.f22790c) {
                                dVar.f22789b = dVar.f22792e.mo23637a(dVar.f22791d);
                            }
                            float f2 = dVar.f22789b;
                            if (f2 > Float.MAX_VALUE || f2 < dVar.f22794g) {
                                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                            }
                            ThreadLocal<C7401a> threadLocal = C7401a.f22770g;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new C7401a());
                            }
                            C7401a aVar = threadLocal.get();
                            if (aVar.f22772b.size() == 0) {
                                if (aVar.f22774d == null) {
                                    aVar.f22774d = new C7401a.C7405d(aVar.f22773c);
                                }
                                C7401a.C7405d dVar2 = aVar.f22774d;
                                dVar2.f22779b.postFrameCallback(dVar2.f22780c);
                            }
                            if (!aVar.f22772b.contains(dVar)) {
                                aVar.f22772b.add(dVar);
                            }
                        }
                    } else {
                        throw new AndroidRuntimeException("Animations may only be started on the main thread");
                    }
                } else {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
            }
        }
        return true;
    }
}
