package p328z0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import p002a1.C0042d;
import p279v0.C6821c;
import p317y0.C7253d;

/* renamed from: z0.h */
public final class C7385h extends C7387i {

    /* renamed from: f */
    public String f22649f = null;

    /* renamed from: g */
    public int f22650g = -1;

    /* renamed from: h */
    public int f22651h = 0;

    /* renamed from: i */
    public float f22652i = Float.NaN;

    /* renamed from: j */
    public float f22653j = Float.NaN;

    /* renamed from: k */
    public float f22654k = Float.NaN;

    /* renamed from: l */
    public float f22655l = Float.NaN;

    /* renamed from: m */
    public float f22656m = Float.NaN;

    /* renamed from: n */
    public float f22657n = Float.NaN;

    /* renamed from: o */
    public int f22658o = 0;

    /* renamed from: z0.h$a */
    public static class C7386a {

        /* renamed from: a */
        public static SparseIntArray f22659a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22659a = sparseIntArray;
            sparseIntArray.append(C0042d.KeyPosition_motionTarget, 1);
            f22659a.append(C0042d.KeyPosition_framePosition, 2);
            f22659a.append(C0042d.KeyPosition_transitionEasing, 3);
            f22659a.append(C0042d.KeyPosition_curveFit, 4);
            f22659a.append(C0042d.KeyPosition_drawPath, 5);
            f22659a.append(C0042d.KeyPosition_percentX, 6);
            f22659a.append(C0042d.KeyPosition_percentY, 7);
            f22659a.append(C0042d.KeyPosition_keyPositionType, 9);
            f22659a.append(C0042d.KeyPosition_sizePercent, 8);
            f22659a.append(C0042d.KeyPosition_percentWidth, 11);
            f22659a.append(C0042d.KeyPosition_percentHeight, 12);
            f22659a.append(C0042d.KeyPosition_pathMotionArc, 10);
        }
    }

    /* renamed from: a */
    public final void mo23600a(HashMap<String, C7253d> hashMap) {
    }

    /* renamed from: b */
    public final C7379d mo23601b() {
        C7385h hVar = new C7385h();
        super.mo23602c(this);
        hVar.f22649f = this.f22649f;
        hVar.f22650g = this.f22650g;
        hVar.f22651h = this.f22651h;
        hVar.f22652i = this.f22652i;
        hVar.f22653j = Float.NaN;
        hVar.f22654k = this.f22654k;
        hVar.f22655l = this.f22655l;
        hVar.f22656m = this.f22656m;
        hVar.f22657n = this.f22657n;
        return hVar;
    }

    /* renamed from: e */
    public final void mo23605e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.KeyPosition);
        SparseIntArray sparseIntArray = C7386a.f22659a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C7386a.f22659a.get(index)) {
                case 1:
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
                case 2:
                    this.f22607a = obtainStyledAttributes.getInt(index, this.f22607a);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.f22649f = C6821c.f21097c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    } else {
                        this.f22649f = obtainStyledAttributes.getString(index);
                        break;
                    }
                case 4:
                    this.f22660e = obtainStyledAttributes.getInteger(index, this.f22660e);
                    break;
                case 5:
                    this.f22651h = obtainStyledAttributes.getInt(index, this.f22651h);
                    break;
                case 6:
                    this.f22654k = obtainStyledAttributes.getFloat(index, this.f22654k);
                    break;
                case 7:
                    this.f22655l = obtainStyledAttributes.getFloat(index, this.f22655l);
                    break;
                case 8:
                    float f = obtainStyledAttributes.getFloat(index, this.f22653j);
                    this.f22652i = f;
                    this.f22653j = f;
                    break;
                case 9:
                    this.f22658o = obtainStyledAttributes.getInt(index, this.f22658o);
                    break;
                case 10:
                    this.f22650g = obtainStyledAttributes.getInt(index, this.f22650g);
                    break;
                case 11:
                    this.f22652i = obtainStyledAttributes.getFloat(index, this.f22652i);
                    break;
                case 12:
                    this.f22653j = obtainStyledAttributes.getFloat(index, this.f22653j);
                    break;
                default:
                    Integer.toHexString(index);
                    C7386a.f22659a.get(index);
                    break;
            }
        }
    }

    /* renamed from: h */
    public final void mo23611h(Object obj, String str) {
        int i;
        char c = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f22649f = obj.toString();
                return;
            case 1:
                this.f22652i = C7379d.m16992g((Number) obj);
                return;
            case 2:
                this.f22653j = C7379d.m16992g((Number) obj);
                return;
            case 3:
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    i = ((Integer) number).intValue();
                } else {
                    i = Integer.parseInt(number.toString());
                }
                this.f22651h = i;
                return;
            case 4:
                float g = C7379d.m16992g((Number) obj);
                this.f22652i = g;
                this.f22653j = g;
                return;
            case 5:
                this.f22654k = C7379d.m16992g((Number) obj);
                return;
            case 6:
                this.f22655l = C7379d.m16992g((Number) obj);
                return;
            default:
                return;
        }
    }
}
