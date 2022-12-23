package p913xi;

import com.masabi.justride.sdk.exception.JustRideSdkException;
import org.json.JSONException;

/* renamed from: xi.d */
public final class C20531d {

    /* renamed from: a */
    public final C20532e f51922a;

    public C20531d(C20532e eVar) {
        this.f51922a = eVar;
    }

    /* renamed from: a */
    public final Object mo52732a(Class cls, String str) throws JSONException {
        if (str == null) {
            return null;
        }
        return mo52734c(cls).mo50643a(str);
    }

    /* renamed from: b */
    public final <T> String mo52733b(T t) throws JSONException {
        if (t == null) {
            return null;
        }
        return mo52734c(t.getClass()).mo50644b(t);
    }

    /* renamed from: c */
    public final <T> C20528a<T> mo52734c(Class<?> cls) {
        C20532e eVar = this.f51922a;
        if (eVar.f51923a.containsKey(cls)) {
            return (C20528a) eVar.f51923a.get(cls);
        }
        throw new JustRideSdkException(C25541a.m63880j("There is no registered JSON converter for ", cls));
    }
}
