package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import p002a1.C0042d;

public final class ConstraintAttribute {

    /* renamed from: a */
    public boolean f2988a;

    /* renamed from: b */
    public String f2989b;

    /* renamed from: c */
    public AttributeType f2990c;

    /* renamed from: d */
    public int f2991d;

    /* renamed from: e */
    public float f2992e;

    /* renamed from: f */
    public String f2993f;

    /* renamed from: g */
    public boolean f2994g;

    /* renamed from: h */
    public int f2995h;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintAttribute$a */
    public static /* synthetic */ class C0734a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2996a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2996a = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.REFERENCE_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2996a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2996a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2996a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2996a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2996a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2996a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f2996a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintAttribute.C0734a.<clinit>():void");
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.f2989b = str;
        this.f2990c = attributeType;
        this.f2988a = z;
        mo3153f(obj);
    }

    /* renamed from: d */
    public static void m2206d(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        Object obj;
        AttributeType attributeType;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0042d.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj2 = null;
        AttributeType attributeType2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0042d.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == C0042d.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == C0042d.CustomAttribute_customBoolean) {
                obj2 = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == C0042d.CustomAttribute_customColorValue) {
                    attributeType = AttributeType.COLOR_TYPE;
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C0042d.CustomAttribute_customColorDrawableValue) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C0042d.CustomAttribute_customPixelDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED), context.getResources().getDisplayMetrics()));
                } else if (index == C0042d.CustomAttribute_customDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    obj = Float.valueOf(obtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == C0042d.CustomAttribute_customFloatValue) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == C0042d.CustomAttribute_customIntegerValue) {
                    attributeType = AttributeType.INT_TYPE;
                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == C0042d.CustomAttribute_customStringValue) {
                    attributeType = AttributeType.STRING_TYPE;
                    obj = obtainStyledAttributes.getString(index);
                } else if (index == C0042d.CustomAttribute_customReference) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    obj = Integer.valueOf(resourceId);
                }
                Object obj3 = obj;
                attributeType2 = attributeType;
                obj2 = obj3;
            }
        }
        if (!(str == null || obj2 == null)) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType2, obj2, z));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: e */
    public static void m2207e(View view, HashMap<String, ConstraintAttribute> hashMap) {
        Class<?> cls = view.getClass();
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ConstraintAttribute constraintAttribute = hashMap.get(next);
            if (!constraintAttribute.f2988a) {
                next = C25541a.m63881k("set", next);
            }
            try {
                switch (C0734a.f2996a[constraintAttribute.f2990c.ordinal()]) {
                    case 1:
                        cls.getMethod(next, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.f2991d)});
                        break;
                    case 2:
                        cls.getMethod(next, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(constraintAttribute.f2994g)});
                        break;
                    case 3:
                        cls.getMethod(next, new Class[]{CharSequence.class}).invoke(view, new Object[]{constraintAttribute.f2993f});
                        break;
                    case 4:
                        cls.getMethod(next, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.f2995h)});
                        break;
                    case 5:
                        Method method = cls.getMethod(next, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f2995h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 6:
                        cls.getMethod(next, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.f2991d)});
                        break;
                    case 7:
                        cls.getMethod(next, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.f2992e)});
                        break;
                    case 8:
                        cls.getMethod(next, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.f2992e)});
                        break;
                }
            } catch (NoSuchMethodException e) {
                e.getMessage();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final float mo3150a() {
        switch (C0734a.f2996a[this.f2990c.ordinal()]) {
            case 2:
                if (this.f2994g) {
                    return 1.0f;
                }
                return BitmapDescriptorFactory.HUE_RED;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return (float) this.f2991d;
            case 7:
                return this.f2992e;
            case 8:
                return this.f2992e;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: b */
    public final void mo3151b(float[] fArr) {
        float f;
        switch (C0734a.f2996a[this.f2990c.ordinal()]) {
            case 2:
                if (this.f2994g) {
                    f = 1.0f;
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                fArr[0] = f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i = this.f2995h;
                int i2 = (i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                int i3 = (i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                int i4 = (i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                int i5 = i & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                float pow = (float) Math.pow((double) (((float) i3) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) i4) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) i5) / 255.0f), 2.2d);
                fArr[3] = ((float) i2) / 255.0f;
                return;
            case 6:
                fArr[0] = (float) this.f2991d;
                return;
            case 7:
                fArr[0] = this.f2992e;
                return;
            case 8:
                fArr[0] = this.f2992e;
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public final int mo3152c() {
        int i = C0734a.f2996a[this.f2990c.ordinal()];
        return (i == 4 || i == 5) ? 4 : 1;
    }

    /* renamed from: f */
    public final void mo3153f(Object obj) {
        switch (C0734a.f2996a[this.f2990c.ordinal()]) {
            case 1:
            case 6:
                this.f2991d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f2994g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f2993f = (String) obj;
                return;
            case 4:
            case 5:
                this.f2995h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f2992e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f2992e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f2988a = false;
        this.f2989b = constraintAttribute.f2989b;
        this.f2990c = constraintAttribute.f2990c;
        mo3153f(obj);
    }
}
