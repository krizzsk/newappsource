package f00;

import android.content.SharedPreferences;
import f00.C16919g;
import p358af.C13437d;
import p977zz.C20964s0;

/* renamed from: f00.a */
public abstract class C16913a<T> extends C16919g<T> {

    /* renamed from: c */
    public final C16919g.C16920a f43929c;

    public C16913a(String str, T t) {
        super(str, t);
        this.f43929c = new C16919g.C16920a(m42705e(str, "isSet"), false);
    }

    /* renamed from: e */
    public static String m42705e(String str, String str2) {
        if (C20964s0.m49090h(str)) {
            return str2;
        }
        return C13437d.m33706k(str, ".", str2);
    }

    /* renamed from: a */
    public final T mo19759a(SharedPreferences sharedPreferences) {
        if (!mo49540g(sharedPreferences)) {
            return this.f43936b;
        }
        return mo24471f(sharedPreferences);
    }

    /* renamed from: b */
    public final void mo49539b(SharedPreferences.Editor editor) {
        mo24472h(editor);
        editor.remove(this.f43929c.f43935a);
    }

    /* renamed from: c */
    public final void mo19760c(SharedPreferences.Editor editor, T t) {
        mo24473i(editor, t);
        this.f43929c.mo19760c(editor, Boolean.TRUE);
    }

    /* renamed from: f */
    public abstract T mo24471f(SharedPreferences sharedPreferences);

    /* renamed from: g */
    public final boolean mo49540g(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.f43929c.f43935a);
    }

    /* renamed from: h */
    public abstract void mo24472h(SharedPreferences.Editor editor);

    /* renamed from: i */
    public abstract void mo24473i(SharedPreferences.Editor editor, T t);
}
