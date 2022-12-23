package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p114i.C5220f;
import p114i.C5221g;
import p114i.C5223i;

/* renamed from: androidx.appcompat.widget.p1 */
public final class C0447p1 {

    /* renamed from: a */
    public final Context f1602a;

    /* renamed from: b */
    public final View f1603b;

    /* renamed from: c */
    public final TextView f1604c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f1605d;

    /* renamed from: e */
    public final Rect f1606e = new Rect();

    /* renamed from: f */
    public final int[] f1607f = new int[2];

    /* renamed from: g */
    public final int[] f1608g = new int[2];

    public C0447p1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1605d = layoutParams;
        this.f1602a = context;
        View inflate = LayoutInflater.from(context).inflate(C5221g.abc_tooltip, (ViewGroup) null);
        this.f1603b = inflate;
        this.f1604c = (TextView) inflate.findViewById(C5220f.message);
        layoutParams.setTitle(C0447p1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C5223i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
