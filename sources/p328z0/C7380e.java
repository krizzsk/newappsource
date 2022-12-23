package p328z0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;
import p002a1.C0042d;

/* renamed from: z0.e */
public final class C7380e extends C7379d {

    /* renamed from: e */
    public int f22611e = -1;

    /* renamed from: f */
    public float f22612f = Float.NaN;

    /* renamed from: g */
    public float f22613g = Float.NaN;

    /* renamed from: h */
    public float f22614h = Float.NaN;

    /* renamed from: i */
    public float f22615i = Float.NaN;

    /* renamed from: j */
    public float f22616j = Float.NaN;

    /* renamed from: k */
    public float f22617k = Float.NaN;

    /* renamed from: l */
    public float f22618l = Float.NaN;

    /* renamed from: m */
    public float f22619m = Float.NaN;

    /* renamed from: n */
    public float f22620n = Float.NaN;

    /* renamed from: o */
    public float f22621o = Float.NaN;

    /* renamed from: p */
    public float f22622p = Float.NaN;

    /* renamed from: q */
    public float f22623q = Float.NaN;

    /* renamed from: r */
    public float f22624r = Float.NaN;

    /* renamed from: s */
    public float f22625s = Float.NaN;

    /* renamed from: z0.e$a */
    public static class C7381a {

        /* renamed from: a */
        public static SparseIntArray f22626a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22626a = sparseIntArray;
            sparseIntArray.append(C0042d.KeyAttribute_android_alpha, 1);
            f22626a.append(C0042d.KeyAttribute_android_elevation, 2);
            f22626a.append(C0042d.KeyAttribute_android_rotation, 4);
            f22626a.append(C0042d.KeyAttribute_android_rotationX, 5);
            f22626a.append(C0042d.KeyAttribute_android_rotationY, 6);
            f22626a.append(C0042d.KeyAttribute_android_transformPivotX, 19);
            f22626a.append(C0042d.KeyAttribute_android_transformPivotY, 20);
            f22626a.append(C0042d.KeyAttribute_android_scaleX, 7);
            f22626a.append(C0042d.KeyAttribute_transitionPathRotate, 8);
            f22626a.append(C0042d.KeyAttribute_transitionEasing, 9);
            f22626a.append(C0042d.KeyAttribute_motionTarget, 10);
            f22626a.append(C0042d.KeyAttribute_framePosition, 12);
            f22626a.append(C0042d.KeyAttribute_curveFit, 13);
            f22626a.append(C0042d.KeyAttribute_android_scaleY, 14);
            f22626a.append(C0042d.KeyAttribute_android_translationX, 15);
            f22626a.append(C0042d.KeyAttribute_android_translationY, 16);
            f22626a.append(C0042d.KeyAttribute_android_translationZ, 17);
            f22626a.append(C0042d.KeyAttribute_motionProgress, 18);
        }
    }

    public C7380e() {
        this.f22610d = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        if (r1.equals("scaleY") == false) goto L_0x00f7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23600a(java.util.HashMap<java.lang.String, p317y0.C7253d> r6) {
        /*
            r5 = this;
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01eb
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.get(r1)
            v0.j r2 = (p279v0.C6831j) r2
            if (r2 != 0) goto L_0x001d
            goto L_0x0008
        L_0x001d:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x003e
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r5.f22610d
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            if (r1 == 0) goto L_0x0008
            y0.d$b r2 = (p317y0.C7253d.C7255b) r2
            int r3 = r5.f22607a
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.f22395f
            r2.append(r3, r1)
            goto L_0x0008
        L_0x003e:
            int r3 = r1.hashCode()
            switch(r3) {
                case -1249320806: goto L_0x00ec;
                case -1249320805: goto L_0x00e1;
                case -1225497657: goto L_0x00d5;
                case -1225497656: goto L_0x00c9;
                case -1225497655: goto L_0x00bd;
                case -1001078227: goto L_0x00b2;
                case -908189618: goto L_0x00a7;
                case -908189617: goto L_0x009e;
                case -760884510: goto L_0x008f;
                case -760884509: goto L_0x0080;
                case -40300674: goto L_0x0072;
                case -4379043: goto L_0x0064;
                case 37232917: goto L_0x0055;
                case 92909918: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x00f7
        L_0x0047:
            java.lang.String r3 = "alpha"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0051
            goto L_0x00f7
        L_0x0051:
            r4 = 13
            goto L_0x00f8
        L_0x0055:
            java.lang.String r3 = "transitionPathRotate"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0060
            goto L_0x00f7
        L_0x0060:
            r4 = 12
            goto L_0x00f8
        L_0x0064:
            java.lang.String r3 = "elevation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x006e
            goto L_0x00f7
        L_0x006e:
            r4 = 11
            goto L_0x00f8
        L_0x0072:
            java.lang.String r3 = "rotation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x007c
            goto L_0x00f7
        L_0x007c:
            r4 = 10
            goto L_0x00f8
        L_0x0080:
            java.lang.String r3 = "transformPivotY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x008b
            goto L_0x00f7
        L_0x008b:
            r4 = 9
            goto L_0x00f8
        L_0x008f:
            java.lang.String r3 = "transformPivotX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x009a
            goto L_0x00f7
        L_0x009a:
            r4 = 8
            goto L_0x00f8
        L_0x009e:
            java.lang.String r3 = "scaleY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00f8
            goto L_0x00f7
        L_0x00a7:
            java.lang.String r3 = "scaleX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00b0
            goto L_0x00f7
        L_0x00b0:
            r4 = 6
            goto L_0x00f8
        L_0x00b2:
            java.lang.String r3 = "progress"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00bb
            goto L_0x00f7
        L_0x00bb:
            r4 = 5
            goto L_0x00f8
        L_0x00bd:
            java.lang.String r3 = "translationZ"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00c7
            goto L_0x00f7
        L_0x00c7:
            r4 = 4
            goto L_0x00f8
        L_0x00c9:
            java.lang.String r3 = "translationY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00d3
            goto L_0x00f7
        L_0x00d3:
            r4 = 3
            goto L_0x00f8
        L_0x00d5:
            java.lang.String r3 = "translationX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00df
            goto L_0x00f7
        L_0x00df:
            r4 = 2
            goto L_0x00f8
        L_0x00e1:
            java.lang.String r3 = "rotationY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00ea
            goto L_0x00f7
        L_0x00ea:
            r4 = 1
            goto L_0x00f8
        L_0x00ec:
            java.lang.String r3 = "rotationX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r4 = 0
            goto L_0x00f8
        L_0x00f7:
            r4 = -1
        L_0x00f8:
            switch(r4) {
                case 0: goto L_0x01da;
                case 1: goto L_0x01c9;
                case 2: goto L_0x01b8;
                case 3: goto L_0x01a7;
                case 4: goto L_0x0196;
                case 5: goto L_0x0185;
                case 6: goto L_0x0174;
                case 7: goto L_0x0163;
                case 8: goto L_0x0152;
                case 9: goto L_0x0141;
                case 10: goto L_0x0130;
                case 11: goto L_0x011f;
                case 12: goto L_0x010e;
                case 13: goto L_0x00fd;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            goto L_0x0008
        L_0x00fd:
            float r1 = r5.f22612f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22612f
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x010e:
            float r1 = r5.f22619m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22619m
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x011f:
            float r1 = r5.f22613g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22613g
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x0130:
            float r1 = r5.f22614h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22614h
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x0141:
            float r1 = r5.f22616j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22618l
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x0152:
            float r1 = r5.f22615i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22617k
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x0163:
            float r1 = r5.f22621o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22621o
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x0174:
            float r1 = r5.f22620n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22620n
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x0185:
            float r1 = r5.f22625s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22625s
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x0196:
            float r1 = r5.f22624r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22624r
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x01a7:
            float r1 = r5.f22623q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22623q
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x01b8:
            float r1 = r5.f22622p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22622p
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x01c9:
            float r1 = r5.f22616j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22616j
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x01da:
            float r1 = r5.f22615i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f22607a
            float r3 = r5.f22615i
            r2.mo23065b(r3, r1)
            goto L_0x0008
        L_0x01eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p328z0.C7380e.mo23600a(java.util.HashMap):void");
    }

    /* renamed from: b */
    public final C7379d clone() {
        C7380e eVar = new C7380e();
        super.mo23602c(this);
        eVar.f22611e = this.f22611e;
        eVar.f22612f = this.f22612f;
        eVar.f22613g = this.f22613g;
        eVar.f22614h = this.f22614h;
        eVar.f22615i = this.f22615i;
        eVar.f22616j = this.f22616j;
        eVar.f22617k = this.f22617k;
        eVar.f22618l = this.f22618l;
        eVar.f22619m = this.f22619m;
        eVar.f22620n = this.f22620n;
        eVar.f22621o = this.f22621o;
        eVar.f22622p = this.f22622p;
        eVar.f22623q = this.f22623q;
        eVar.f22624r = this.f22624r;
        eVar.f22625s = this.f22625s;
        return eVar;
    }

    /* renamed from: d */
    public final void mo23604d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f22612f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f22613g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f22614h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f22615i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f22616j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f22617k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f22618l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f22622p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f22623q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f22624r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f22619m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f22620n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f22621o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f22625s)) {
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.KeyAttribute);
        SparseIntArray sparseIntArray = C7381a.f22626a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C7381a.f22626a.get(index)) {
                case 1:
                    this.f22612f = obtainStyledAttributes.getFloat(index, this.f22612f);
                    break;
                case 2:
                    this.f22613g = obtainStyledAttributes.getDimension(index, this.f22613g);
                    break;
                case 4:
                    this.f22614h = obtainStyledAttributes.getFloat(index, this.f22614h);
                    break;
                case 5:
                    this.f22615i = obtainStyledAttributes.getFloat(index, this.f22615i);
                    break;
                case 6:
                    this.f22616j = obtainStyledAttributes.getFloat(index, this.f22616j);
                    break;
                case 7:
                    this.f22620n = obtainStyledAttributes.getFloat(index, this.f22620n);
                    break;
                case 8:
                    this.f22619m = obtainStyledAttributes.getFloat(index, this.f22619m);
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
                    this.f22611e = obtainStyledAttributes.getInteger(index, this.f22611e);
                    break;
                case 14:
                    this.f22621o = obtainStyledAttributes.getFloat(index, this.f22621o);
                    break;
                case 15:
                    this.f22622p = obtainStyledAttributes.getDimension(index, this.f22622p);
                    break;
                case 16:
                    this.f22623q = obtainStyledAttributes.getDimension(index, this.f22623q);
                    break;
                case 17:
                    this.f22624r = obtainStyledAttributes.getDimension(index, this.f22624r);
                    break;
                case 18:
                    this.f22625s = obtainStyledAttributes.getFloat(index, this.f22625s);
                    break;
                case 19:
                    this.f22617k = obtainStyledAttributes.getDimension(index, this.f22617k);
                    break;
                case 20:
                    this.f22618l = obtainStyledAttributes.getDimension(index, this.f22618l);
                    break;
                default:
                    Integer.toHexString(index);
                    C7381a.f22626a.get(index);
                    break;
            }
        }
    }

    /* renamed from: f */
    public final void mo23606f(HashMap<String, Integer> hashMap) {
        if (this.f22611e != -1) {
            if (!Float.isNaN(this.f22612f)) {
                hashMap.put("alpha", Integer.valueOf(this.f22611e));
            }
            if (!Float.isNaN(this.f22613g)) {
                hashMap.put("elevation", Integer.valueOf(this.f22611e));
            }
            if (!Float.isNaN(this.f22614h)) {
                hashMap.put("rotation", Integer.valueOf(this.f22611e));
            }
            if (!Float.isNaN(this.f22615i)) {
                hashMap.put("rotationX", Integer.valueOf(this.f22611e));
            }
            if (!Float.isNaN(this.f22616j)) {
                hashMap.put("rotationY", Integer.valueOf(this.f22611e));
            }
            if (!Float.isNaN(this.f22617k)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.f22611e));
            }
            if (!Float.isNaN(this.f22618l)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.f22611e));
            }
            if (!Float.isNaN(this.f22622p)) {
                hashMap.put("translationX", Integer.valueOf(this.f22611e));
            }
            if (!Float.isNaN(this.f22623q)) {
                hashMap.put("translationY", Integer.valueOf(this.f22611e));
            }
            if (!Float.isNaN(this.f22624r)) {
                hashMap.put("translationZ", Integer.valueOf(this.f22611e));
            }
            if (!Float.isNaN(this.f22619m)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f22611e));
            }
            if (!Float.isNaN(this.f22620n)) {
                hashMap.put("scaleX", Integer.valueOf(this.f22611e));
            }
            if (!Float.isNaN(this.f22621o)) {
                hashMap.put("scaleY", Integer.valueOf(this.f22611e));
            }
            if (!Float.isNaN(this.f22625s)) {
                hashMap.put("progress", Integer.valueOf(this.f22611e));
            }
            if (this.f22610d.size() > 0) {
                for (String k : this.f22610d.keySet()) {
                    hashMap.put(C25541a.m63881k("CUSTOM,", k), Integer.valueOf(this.f22611e));
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo23607h(Object obj, String str) {
        int i;
        char c = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    c = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 8;
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c = 9;
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c = 10;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 12;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 13;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 15;
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f22625s = C7379d.m16992g((Number) obj);
                return;
            case 1:
                obj.toString();
                return;
            case 2:
                this.f22615i = C7379d.m16992g((Number) obj);
                return;
            case 3:
                this.f22616j = C7379d.m16992g((Number) obj);
                return;
            case 4:
                this.f22622p = C7379d.m16992g((Number) obj);
                return;
            case 5:
                this.f22623q = C7379d.m16992g((Number) obj);
                return;
            case 6:
                this.f22624r = C7379d.m16992g((Number) obj);
                return;
            case 7:
                this.f22620n = C7379d.m16992g((Number) obj);
                return;
            case 8:
                this.f22621o = C7379d.m16992g((Number) obj);
                return;
            case 9:
                this.f22617k = C7379d.m16992g((Number) obj);
                return;
            case 10:
                this.f22618l = C7379d.m16992g((Number) obj);
                return;
            case 11:
                this.f22614h = C7379d.m16992g((Number) obj);
                return;
            case 12:
                this.f22613g = C7379d.m16992g((Number) obj);
                return;
            case 13:
                this.f22619m = C7379d.m16992g((Number) obj);
                return;
            case 14:
                this.f22612f = C7379d.m16992g((Number) obj);
                return;
            case 15:
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    i = ((Integer) number).intValue();
                } else {
                    i = Integer.parseInt(number.toString());
                }
                this.f22611e = i;
                return;
            case 16:
                if (obj instanceof Boolean) {
                    ((Boolean) obj).booleanValue();
                    return;
                } else {
                    Boolean.parseBoolean(obj.toString());
                    return;
                }
            default:
                return;
        }
    }
}
