package p911xg;

import com.google.protobuf.C14610k;
import java.nio.charset.Charset;

/* renamed from: xg.i */
public final class C20499i {

    /* renamed from: b */
    public static final C20500a f51890b = new C20500a();

    /* renamed from: a */
    public final C20504l f51891a;

    /* renamed from: xg.i$a */
    public static class C20500a implements C20504l {
        /* renamed from: a */
        public final C20503k mo52685a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public final boolean mo52686b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: xg.i$b */
    public static class C20501b implements C20504l {

        /* renamed from: a */
        public C20504l[] f51892a;

        public C20501b(C20504l... lVarArr) {
            this.f51892a = lVarArr;
        }

        /* renamed from: a */
        public final C20503k mo52685a(Class<?> cls) {
            for (C20504l lVar : this.f51892a) {
                if (lVar.mo52686b(cls)) {
                    return lVar.mo52685a(cls);
                }
            }
            throw new UnsupportedOperationException(C25541a.m63876f(cls, C13555b.m33972k("No factory is available for message type: ")));
        }

        /* renamed from: b */
        public final boolean mo52686b(Class<?> cls) {
            for (C20504l b : this.f51892a) {
                if (b.mo52686b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C20499i() {
        C20504l lVar;
        C20504l[] lVarArr = new C20504l[2];
        lVarArr[0] = C20496f.f51889a;
        try {
            lVar = (C20504l) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            lVar = f51890b;
        }
        lVarArr[1] = lVar;
        C20501b bVar = new C20501b(lVarArr);
        Charset charset = C14610k.f36861a;
        this.f51891a = bVar;
    }
}
