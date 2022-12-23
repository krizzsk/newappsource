package p883wc;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p175n.C5768c;
import p355ac.C13401b;

/* renamed from: wc.a */
public final class C20289a {

    /* renamed from: a */
    public static final int[] f51454a = {16842752, C13401b.theme};

    /* renamed from: b */
    public static final int[] f51455b = {C13401b.materialThemeOverlay};

    /* renamed from: a */
    public static Context m47861a(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f51455b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (!(context instanceof C5768c) || ((C5768c) context).f18657b != resourceId) {
            z = false;
        } else {
            z = true;
        }
        if (resourceId == 0 || z) {
            return context;
        }
        C5768c cVar = new C5768c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f51454a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            cVar.getTheme().applyStyle(resourceId2, true);
        }
        return cVar;
    }
}
