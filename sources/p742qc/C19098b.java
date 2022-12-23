package p742qc;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: qc.b */
public final class C19098b {
    /* renamed from: a */
    public static TypedValue m46245a(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static int m46246b(Context context, int i, String str) {
        TypedValue a = m46245a(i, context);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }
}
