package p021b2;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.C0859o;

/* renamed from: b2.b */
public final class C1447b extends Editable.Factory {

    /* renamed from: a */
    public static final Object f5303a = new Object();

    /* renamed from: b */
    public static volatile C1447b f5304b;

    /* renamed from: c */
    public static Class<?> f5305c;

    @SuppressLint({"PrivateApi"})
    public C1447b() {
        try {
            f5305c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C1447b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f5305c;
        if (cls != null) {
            return new C0859o(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
