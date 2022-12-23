package mj0;

import java.lang.reflect.Array;

/* renamed from: mj0.b */
public final class C24396b implements C24415u {

    /* renamed from: a */
    public final C24414t f61755a = new C24414t();

    /* renamed from: b */
    public final C24415u f61756b;

    /* renamed from: c */
    public final Class f61757c;

    public C24396b(C24415u uVar, Class cls) {
        this.f61756b = uVar;
        this.f61757c = cls;
    }

    /* renamed from: a */
    public final Object mo60538a(String str) throws Exception {
        String[] split = this.f61755a.f61774a.split(str);
        for (int i = 0; i < split.length; i++) {
            String str2 = split[i];
            if (str2 != null) {
                split[i] = str2.trim();
            }
        }
        int length = split.length;
        Object newInstance = Array.newInstance(this.f61757c, length);
        for (int i2 = 0; i2 < length; i2++) {
            Object a = this.f61756b.mo60538a(split[i2]);
            if (a != null) {
                Array.set(newInstance, i2, a);
            }
        }
        return newInstance;
    }
}
