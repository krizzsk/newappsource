package p078f0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

/* renamed from: f0.d */
public final class C4637d {

    /* renamed from: f0.d$a */
    public static class C4638a {
        /* renamed from: a */
        public static Context m11954a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        /* renamed from: b */
        public static String m11955b(Context context) {
            return context.getAttributionTag();
        }
    }

    /* renamed from: a */
    public static Context m11952a(Context context) {
        String b;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT < 30 || (b = C4638a.m11955b(context)) == null) {
            return applicationContext;
        }
        return C4638a.m11954a(applicationContext, b);
    }

    /* renamed from: b */
    public static Application m11953b(Context context) {
        String b;
        Context a = m11952a(context);
        while (a instanceof ContextWrapper) {
            if (a instanceof Application) {
                return (Application) a;
            }
            ContextWrapper contextWrapper = (ContextWrapper) a;
            Context baseContext = contextWrapper.getBaseContext();
            if (Build.VERSION.SDK_INT < 30 || (b = C4638a.m11955b(contextWrapper)) == null) {
                a = baseContext;
            } else {
                a = C4638a.m11954a(baseContext, b);
            }
        }
        return null;
    }
}
