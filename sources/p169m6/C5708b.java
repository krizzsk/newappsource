package p169m6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import p090g1.C4732a;
import p116i1.C5247f;
import p127j.C5344a;
import p175n.C5768c;

/* renamed from: m6.b */
public final class C5708b {

    /* renamed from: a */
    public static volatile boolean f18514a = true;

    /* renamed from: a */
    public static Drawable m14020a(Context context, Context context2, int i, Resources.Theme theme) {
        Context context3;
        try {
            if (f18514a) {
                if (theme != null) {
                    context3 = new C5768c(context2, theme);
                } else {
                    context3 = context2;
                }
                return C5344a.m13397a(context3, i);
            }
        } catch (NoClassDefFoundError unused) {
            f18514a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C4732a.getDrawable(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
        return C5247f.C5248a.m13264a(resources, i, theme);
    }
}
