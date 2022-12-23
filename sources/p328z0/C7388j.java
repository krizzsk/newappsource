package p328z0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.HashSet;
import p002a1.C0042d;
import p317y0.C7253d;

/* renamed from: z0.j */
public final class C7388j extends C7379d {

    /* renamed from: e */
    public int f22661e = -1;

    /* renamed from: f */
    public float f22662f = Float.NaN;

    /* renamed from: g */
    public float f22663g = Float.NaN;

    /* renamed from: h */
    public float f22664h = Float.NaN;

    /* renamed from: i */
    public float f22665i = Float.NaN;

    /* renamed from: j */
    public float f22666j = Float.NaN;

    /* renamed from: k */
    public float f22667k = Float.NaN;

    /* renamed from: l */
    public float f22668l = Float.NaN;

    /* renamed from: m */
    public float f22669m = Float.NaN;

    /* renamed from: n */
    public float f22670n = Float.NaN;

    /* renamed from: o */
    public float f22671o = Float.NaN;

    /* renamed from: p */
    public float f22672p = Float.NaN;

    /* renamed from: q */
    public float f22673q = Float.NaN;

    /* renamed from: r */
    public int f22674r = 0;

    /* renamed from: s */
    public float f22675s = Float.NaN;

    /* renamed from: t */
    public float f22676t = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: z0.j$a */
    public static class C7389a {

        /* renamed from: a */
        public static SparseIntArray f22677a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22677a = sparseIntArray;
            sparseIntArray.append(C0042d.KeyTimeCycle_android_alpha, 1);
            f22677a.append(C0042d.KeyTimeCycle_android_elevation, 2);
            f22677a.append(C0042d.KeyTimeCycle_android_rotation, 4);
            f22677a.append(C0042d.KeyTimeCycle_android_rotationX, 5);
            f22677a.append(C0042d.KeyTimeCycle_android_rotationY, 6);
            f22677a.append(C0042d.KeyTimeCycle_android_scaleX, 7);
            f22677a.append(C0042d.KeyTimeCycle_transitionPathRotate, 8);
            f22677a.append(C0042d.KeyTimeCycle_transitionEasing, 9);
            f22677a.append(C0042d.KeyTimeCycle_motionTarget, 10);
            f22677a.append(C0042d.KeyTimeCycle_framePosition, 12);
            f22677a.append(C0042d.KeyTimeCycle_curveFit, 13);
            f22677a.append(C0042d.KeyTimeCycle_android_scaleY, 14);
            f22677a.append(C0042d.KeyTimeCycle_android_translationX, 15);
            f22677a.append(C0042d.KeyTimeCycle_android_translationY, 16);
            f22677a.append(C0042d.KeyTimeCycle_android_translationZ, 17);
            f22677a.append(C0042d.KeyTimeCycle_motionProgress, 18);
            f22677a.append(C0042d.KeyTimeCycle_wavePeriod, 20);
            f22677a.append(C0042d.KeyTimeCycle_waveOffset, 21);
            f22677a.append(C0042d.KeyTimeCycle_waveShape, 19);
        }
    }

    public C7388j() {
        this.f22610d = new HashMap<>();
    }

    /* renamed from: a */
    public final void mo23600a(HashMap<String, C7253d> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* renamed from: b */
    public final C7379d clone() {
        C7388j jVar = new C7388j();
        super.mo23602c(this);
        jVar.f22661e = this.f22661e;
        jVar.f22674r = this.f22674r;
        jVar.f22675s = this.f22675s;
        jVar.f22676t = this.f22676t;
        jVar.f22673q = this.f22673q;
        jVar.f22662f = this.f22662f;
        jVar.f22663g = this.f22663g;
        jVar.f22664h = this.f22664h;
        jVar.f22667k = this.f22667k;
        jVar.f22665i = this.f22665i;
        jVar.f22666j = this.f22666j;
        jVar.f22668l = this.f22668l;
        jVar.f22669m = this.f22669m;
        jVar.f22670n = this.f22670n;
        jVar.f22671o = this.f22671o;
        jVar.f22672p = this.f22672p;
        return jVar;
    }

    /* renamed from: d */
    public final void mo23604d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f22662f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f22663g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f22664h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f22665i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f22666j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f22670n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f22671o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f22672p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f22667k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f22668l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f22669m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f22673q)) {
            hashSet.add("progress");
        }
        if (this.f22610d.size() > 0) {
            for (String str : this.f22610d.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: e */
    public final void mo23605e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.KeyTimeCycle);
        SparseIntArray sparseIntArray = C7389a.f22677a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C7389a.f22677a.get(index)) {
                case 1:
                    this.f22662f = obtainStyledAttributes.getFloat(index, this.f22662f);
                    break;
                case 2:
                    this.f22663g = obtainStyledAttributes.getDimension(index, this.f22663g);
                    break;
                case 4:
                    this.f22664h = obtainStyledAttributes.getFloat(index, this.f22664h);
                    break;
                case 5:
                    this.f22665i = obtainStyledAttributes.getFloat(index, this.f22665i);
                    break;
                case 6:
                    this.f22666j = obtainStyledAttributes.getFloat(index, this.f22666j);
                    break;
                case 7:
                    this.f22668l = obtainStyledAttributes.getFloat(index, this.f22668l);
                    break;
                case 8:
                    this.f22667k = obtainStyledAttributes.getFloat(index, this.f22667k);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (!MotionLayout.f2657J0) {
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f22608b = obtainStyledAttributes.getResourceId(index, this.f22608b);
                            break;
                        } else {
                            this.f22609c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    } else {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f22608b);
                        this.f22608b = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f22609c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    }
                case 12:
                    this.f22607a = obtainStyledAttributes.getInt(index, this.f22607a);
                    break;
                case 13:
                    this.f22661e = obtainStyledAttributes.getInteger(index, this.f22661e);
                    break;
                case 14:
                    this.f22669m = obtainStyledAttributes.getFloat(index, this.f22669m);
                    break;
                case 15:
                    this.f22670n = obtainStyledAttributes.getDimension(index, this.f22670n);
                    break;
                case 16:
                    this.f22671o = obtainStyledAttributes.getDimension(index, this.f22671o);
                    break;
                case 17:
                    this.f22672p = obtainStyledAttributes.getDimension(index, this.f22672p);
                    break;
                case 18:
                    this.f22673q = obtainStyledAttributes.getFloat(index, this.f22673q);
                    break;
                case 19:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.f22674r = obtainStyledAttributes.getInt(index, this.f22674r);
                        break;
                    } else {
                        obtainStyledAttributes.getString(index);
                        this.f22674r = 7;
                        break;
                    }
                case 20:
                    this.f22675s = obtainStyledAttributes.getFloat(index, this.f22675s);
                    break;
                case 21:
                    if (obtainStyledAttributes.peekValue(index).type != 5) {
                        this.f22676t = obtainStyledAttributes.getFloat(index, this.f22676t);
                        break;
                    } else {
                        this.f22676t = obtainStyledAttributes.getDimension(index, this.f22676t);
                        break;
                    }
                default:
                    Integer.toHexString(index);
                    C7389a.f22677a.get(index);
                    break;
            }
        }
    }

    /* renamed from: f */
    public final void mo23606f(HashMap<String, Integer> hashMap) {
        if (this.f22661e != -1) {
            if (!Float.isNaN(this.f22662f)) {
                hashMap.put("alpha", Integer.valueOf(this.f22661e));
            }
            if (!Float.isNaN(this.f22663g)) {
                hashMap.put("elevation", Integer.valueOf(this.f22661e));
            }
            if (!Float.isNaN(this.f22664h)) {
                hashMap.put("rotation", Integer.valueOf(this.f22661e));
            }
            if (!Float.isNaN(this.f22665i)) {
                hashMap.put("rotationX", Integer.valueOf(this.f22661e));
            }
            if (!Float.isNaN(this.f22666j)) {
                hashMap.put("rotationY", Integer.valueOf(this.f22661e));
            }
            if (!Float.isNaN(this.f22670n)) {
                hashMap.put("translationX", Integer.valueOf(this.f22661e));
            }
            if (!Float.isNaN(this.f22671o)) {
                hashMap.put("translationY", Integer.valueOf(this.f22661e));
            }
            if (!Float.isNaN(this.f22672p)) {
                hashMap.put("translationZ", Integer.valueOf(this.f22661e));
            }
            if (!Float.isNaN(this.f22667k)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f22661e));
            }
            if (!Float.isNaN(this.f22668l)) {
                hashMap.put("scaleX", Integer.valueOf(this.f22661e));
            }
            if (!Float.isNaN(this.f22668l)) {
                hashMap.put("scaleY", Integer.valueOf(this.f22661e));
            }
            if (!Float.isNaN(this.f22673q)) {
                hashMap.put("progress", Integer.valueOf(this.f22661e));
            }
            if (this.f22610d.size() > 0) {
                for (String k : this.f22610d.keySet()) {
                    hashMap.put(C25541a.m63881k("CUSTOM,", k), Integer.valueOf(this.f22661e));
                }
            }
        }
    }
}
