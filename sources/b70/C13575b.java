package b70;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: b70.b */
public final /* synthetic */ class C13575b implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C13576c f33529b;

    /* renamed from: c */
    public final /* synthetic */ String f33530c;

    /* renamed from: d */
    public final /* synthetic */ int f33531d;

    /* renamed from: e */
    public final /* synthetic */ int f33532e;

    /* renamed from: f */
    public final /* synthetic */ Map f33533f;

    public /* synthetic */ C13575b(C13576c cVar, String str, int i, int i2, EnumMap enumMap) {
        this.f33529b = cVar;
        this.f33530c = str;
        this.f33531d = i;
        this.f33532e = i2;
        this.f33533f = enumMap;
    }

    public final Object call() {
        return this.f33529b.mo40456a(this.f33530c, this.f33531d, this.f33532e, this.f33533f);
    }
}
