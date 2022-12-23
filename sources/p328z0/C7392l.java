package p328z0;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.widget.C0738a;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import p279v0.C6821c;
import p317y0.C7253d;

/* renamed from: z0.l */
public final class C7392l implements Comparable<C7392l> {

    /* renamed from: b */
    public float f22699b = 1.0f;

    /* renamed from: c */
    public int f22700c = 0;

    /* renamed from: d */
    public int f22701d;

    /* renamed from: e */
    public float f22702e = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: f */
    public float f22703f = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: g */
    public float f22704g = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: h */
    public float f22705h = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: i */
    public float f22706i = 1.0f;

    /* renamed from: j */
    public float f22707j = 1.0f;

    /* renamed from: k */
    public float f22708k = Float.NaN;

    /* renamed from: l */
    public float f22709l = Float.NaN;

    /* renamed from: m */
    public float f22710m = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: n */
    public float f22711n = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: o */
    public float f22712o = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: p */
    public float f22713p = Float.NaN;

    /* renamed from: q */
    public float f22714q = Float.NaN;

    /* renamed from: r */
    public LinkedHashMap<String, ConstraintAttribute> f22715r = new LinkedHashMap<>();

    /* renamed from: c */
    public static boolean m17029c(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) != Float.isNaN(f2)) {
                return true;
            }
            return false;
        } else if (Math.abs(f - f2) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo23614a(HashMap<String, C7253d> hashMap, int i) {
        for (String next : hashMap.keySet()) {
            C7253d dVar = hashMap.get(next);
            next.getClass();
            char c = 65535;
            switch (next.hashCode()) {
                case -1249320806:
                    if (next.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (next.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (next.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (next.equals("transformPivotX")) {
                        c = 8;
                        break;
                    }
                    break;
                case -760884509:
                    if (next.equals("transformPivotY")) {
                        c = 9;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals("rotation")) {
                        c = 10;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals("transitionPathRotate")) {
                        c = 12;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c = 13;
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f22704g)) {
                        f2 = this.f22704g;
                    }
                    dVar.mo23065b(f2, i);
                    break;
                case 1:
                    if (!Float.isNaN(this.f22705h)) {
                        f2 = this.f22705h;
                    }
                    dVar.mo23065b(f2, i);
                    break;
                case 2:
                    if (!Float.isNaN(this.f22710m)) {
                        f2 = this.f22710m;
                    }
                    dVar.mo23065b(f2, i);
                    break;
                case 3:
                    if (!Float.isNaN(this.f22711n)) {
                        f2 = this.f22711n;
                    }
                    dVar.mo23065b(f2, i);
                    break;
                case 4:
                    if (!Float.isNaN(this.f22712o)) {
                        f2 = this.f22712o;
                    }
                    dVar.mo23065b(f2, i);
                    break;
                case 5:
                    if (!Float.isNaN(this.f22714q)) {
                        f2 = this.f22714q;
                    }
                    dVar.mo23065b(f2, i);
                    break;
                case 6:
                    if (!Float.isNaN(this.f22706i)) {
                        f = this.f22706i;
                    }
                    dVar.mo23065b(f, i);
                    break;
                case 7:
                    if (!Float.isNaN(this.f22707j)) {
                        f = this.f22707j;
                    }
                    dVar.mo23065b(f, i);
                    break;
                case 8:
                    if (!Float.isNaN(this.f22708k)) {
                        f2 = this.f22708k;
                    }
                    dVar.mo23065b(f2, i);
                    break;
                case 9:
                    if (!Float.isNaN(this.f22709l)) {
                        f2 = this.f22709l;
                    }
                    dVar.mo23065b(f2, i);
                    break;
                case 10:
                    if (!Float.isNaN(this.f22703f)) {
                        f2 = this.f22703f;
                    }
                    dVar.mo23065b(f2, i);
                    break;
                case 11:
                    if (!Float.isNaN(this.f22702e)) {
                        f2 = this.f22702e;
                    }
                    dVar.mo23065b(f2, i);
                    break;
                case 12:
                    if (!Float.isNaN(this.f22713p)) {
                        f2 = this.f22713p;
                    }
                    dVar.mo23065b(f2, i);
                    break;
                case 13:
                    if (!Float.isNaN(this.f22699b)) {
                        f = this.f22699b;
                    }
                    dVar.mo23065b(f, i);
                    break;
                default:
                    if (!next.startsWith("CUSTOM")) {
                        break;
                    } else {
                        String str = next.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR)[1];
                        if (!this.f22715r.containsKey(str)) {
                            break;
                        } else {
                            ConstraintAttribute constraintAttribute = this.f22715r.get(str);
                            if (!(dVar instanceof C7253d.C7255b)) {
                                constraintAttribute.mo3150a();
                                Objects.toString(dVar);
                                break;
                            } else {
                                ((C7253d.C7255b) dVar).f22395f.append(i, constraintAttribute);
                                break;
                            }
                        }
                    }
            }
        }
    }

    /* renamed from: b */
    public final void mo23615b(View view) {
        float f;
        this.f22701d = view.getVisibility();
        if (view.getVisibility() != 0) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = view.getAlpha();
        }
        this.f22699b = f;
        this.f22702e = view.getElevation();
        this.f22703f = view.getRotation();
        this.f22704g = view.getRotationX();
        this.f22705h = view.getRotationY();
        this.f22706i = view.getScaleX();
        this.f22707j = view.getScaleY();
        this.f22708k = view.getPivotX();
        this.f22709l = view.getPivotY();
        this.f22710m = view.getTranslationX();
        this.f22711n = view.getTranslationY();
        this.f22712o = view.getTranslationZ();
    }

    public final int compareTo(Object obj) {
        ((C7392l) obj).getClass();
        return Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: d */
    public final void mo23617d(Rect rect, C0738a aVar, int i, int i2) {
        float f;
        rect.width();
        rect.height();
        C0738a.C0739a i3 = aVar.mo3240i(i2);
        C0738a.C0743d dVar = i3.f3119c;
        int i4 = dVar.f3222c;
        this.f22700c = i4;
        int i5 = dVar.f3221b;
        this.f22701d = i5;
        if (i5 == 0 || i4 != 0) {
            f = dVar.f3223d;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        this.f22699b = f;
        C0738a.C0744e eVar = i3.f3122f;
        boolean z = eVar.f3238m;
        this.f22702e = eVar.f3239n;
        this.f22703f = eVar.f3227b;
        this.f22704g = eVar.f3228c;
        this.f22705h = eVar.f3229d;
        this.f22706i = eVar.f3230e;
        this.f22707j = eVar.f3231f;
        this.f22708k = eVar.f3232g;
        this.f22709l = eVar.f3233h;
        this.f22710m = eVar.f3235j;
        this.f22711n = eVar.f3236k;
        this.f22712o = eVar.f3237l;
        C6821c.m16106c(i3.f3120d.f3210d);
        this.f22713p = i3.f3120d.f3214h;
        this.f22714q = i3.f3119c.f3224e;
        Iterator<String> it = i3.f3123g.keySet().iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            ConstraintAttribute constraintAttribute = i3.f3123g.get(next);
            constraintAttribute.getClass();
            int i6 = ConstraintAttribute.C0734a.f2996a[constraintAttribute.f2990c.ordinal()];
            if (i6 == 1 || i6 == 2 || i6 == 3) {
                z2 = false;
            }
            if (z2) {
                this.f22715r.put(next, constraintAttribute);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f2 = this.f22703f + 90.0f;
            this.f22703f = f2;
            if (f2 > 180.0f) {
                this.f22703f = f2 - 360.0f;
                return;
            }
            return;
        }
        this.f22703f -= 90.0f;
    }
}
