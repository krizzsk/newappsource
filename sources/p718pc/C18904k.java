package p718pc;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import p380bc.C13577a;
import p718pc.C18888b;

/* renamed from: pc.k */
public abstract class C18904k extends Drawable implements Animatable {

    /* renamed from: l */
    public static final C18905a f48115l = new C18905a();

    /* renamed from: b */
    public final Context f48116b;

    /* renamed from: c */
    public final C18893c f48117c;

    /* renamed from: d */
    public C18887a f48118d;

    /* renamed from: e */
    public ValueAnimator f48119e;

    /* renamed from: f */
    public ValueAnimator f48120f;

    /* renamed from: g */
    public ArrayList f48121g;

    /* renamed from: h */
    public boolean f48122h;

    /* renamed from: i */
    public float f48123i;

    /* renamed from: j */
    public final Paint f48124j = new Paint();

    /* renamed from: k */
    public int f48125k;

    /* renamed from: pc.k$a */
    public class C18905a extends Property<C18904k, Float> {
        public C18905a() {
            super(Float.class, "growFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((C18904k) obj).mo51402b());
        }

        public final void set(Object obj, Object obj2) {
            C18904k kVar = (C18904k) obj;
            float floatValue = ((Float) obj2).floatValue();
            if (kVar.f48123i != floatValue) {
                kVar.f48123i = floatValue;
                kVar.invalidateSelf();
            }
        }
    }

    public C18904k(Context context, C18893c cVar) {
        this.f48116b = context;
        this.f48117c = cVar;
        this.f48118d = new C18887a();
        setAlpha(ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* renamed from: b */
    public final float mo51402b() {
        boolean z;
        C18893c cVar = this.f48117c;
        boolean z2 = true;
        if (cVar.f48086e != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (cVar.f48087f == 0) {
                z2 = false;
            }
            if (!z2) {
                return 1.0f;
            }
        }
        return this.f48123i;
    }

    /* renamed from: c */
    public final boolean mo51403c() {
        ValueAnimator valueAnimator = this.f48120f;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* renamed from: d */
    public final boolean mo51404d() {
        ValueAnimator valueAnimator = this.f48119e;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* renamed from: e */
    public final boolean mo51405e(boolean z, boolean z2, boolean z3) {
        boolean z4;
        C18887a aVar = this.f48118d;
        ContentResolver contentResolver = this.f48116b.getContentResolver();
        aVar.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (!z3 || f <= BitmapDescriptorFactory.HUE_RED) {
            z4 = false;
        } else {
            z4 = true;
        }
        return mo51395f(z, z2, z4);
    }

    /* renamed from: f */
    public boolean mo51395f(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        boolean z4;
        boolean z5;
        if (this.f48119e == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f48115l, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
            this.f48119e = ofFloat;
            ofFloat.setDuration(500);
            this.f48119e.setInterpolator(C13577a.f33538b);
            ValueAnimator valueAnimator2 = this.f48119e;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                this.f48119e = valueAnimator2;
                valueAnimator2.addListener(new C18902i(this));
            } else {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
        }
        if (this.f48120f == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f48115l, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED});
            this.f48120f = ofFloat2;
            ofFloat2.setDuration(500);
            this.f48120f.setInterpolator(C13577a.f33538b);
            ValueAnimator valueAnimator3 = this.f48120f;
            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                this.f48120f = valueAnimator3;
                valueAnimator3.addListener(new C18903j(this));
            } else {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
        }
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.f48119e;
        } else {
            valueAnimator = this.f48120f;
        }
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                ValueAnimator[] valueAnimatorArr = {valueAnimator};
                boolean z6 = this.f48122h;
                this.f48122h = true;
                for (int i = 0; i < 1; i++) {
                    valueAnimatorArr[i].end();
                }
                this.f48122h = z6;
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (!z || super.setVisible(z, false)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z ? this.f48117c.f48087f == 0 : this.f48117c.f48086e == 0) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                ValueAnimator[] valueAnimatorArr2 = {valueAnimator};
                boolean z7 = this.f48122h;
                this.f48122h = true;
                for (int i2 = 0; i2 < 1; i2++) {
                    valueAnimatorArr2[i2].end();
                }
                this.f48122h = z7;
                return z4;
            }
            if (z2 || !valueAnimator.isPaused()) {
                valueAnimator.start();
            } else {
                valueAnimator.resume();
            }
            return z4;
        }
    }

    /* renamed from: g */
    public final void mo51406g(C18888b.C18892d dVar) {
        ArrayList arrayList = this.f48121g;
        if (arrayList != null && arrayList.contains(dVar)) {
            this.f48121g.remove(dVar);
            if (this.f48121g.isEmpty()) {
                this.f48121g = null;
            }
        }
    }

    public final int getAlpha() {
        return this.f48125k;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return mo51404d() || mo51403c();
    }

    public final void setAlpha(int i) {
        this.f48125k = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f48124j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return mo51405e(z, z2, true);
    }

    public final void start() {
        mo51395f(true, true, false);
    }

    public final void stop() {
        mo51395f(false, true, false);
    }
}
