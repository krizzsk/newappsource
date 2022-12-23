package aa0;

import android.content.Context;
import java.io.File;
import p693nz.C18653e;
import p810sz.C19589j;
import p810sz.C19600l;

/* renamed from: aa0.n */
public final class C7543n<V> extends C18653e<String, V> {
    public C7543n(File file, C19589j<? extends V> jVar, C19600l<? super V> lVar) {
        super(file, 2147483647L, true, jVar, lVar);
    }

    /* renamed from: q */
    public static C7543n m17285q(Context context, C19589j jVar, C19600l lVar, String str) {
        return new C7543n(new File(new File(context.getFilesDir(), "stores"), str), jVar, lVar);
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ long mo23807k(Object obj, Object obj2) {
        String str = (String) obj;
        return Long.MAX_VALUE;
    }
}
