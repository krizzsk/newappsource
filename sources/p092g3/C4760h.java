package p092g3;

import android.content.Context;
import android.text.TextUtils;
import p269u2.C6679c;
import p281v2.C6848b;

/* renamed from: g3.h */
public final class C4760h implements C6679c.C6682c {

    /* renamed from: a */
    public final /* synthetic */ Context f16065a;

    public C4760h(Context context) {
        this.f16065a = context;
    }

    /* renamed from: a */
    public final C6679c mo20274a(C6679c.C6681b bVar) {
        Context context = this.f16065a;
        String str = bVar.f20762b;
        C6679c.C6680a aVar = bVar.f20763c;
        if (aVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        } else if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        } else if (!TextUtils.isEmpty(str)) {
            return new C6848b(context, str, aVar, true);
        } else {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
    }
}
