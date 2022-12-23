package mj0;

/* renamed from: mj0.a */
public final class C24395a implements C24411q {

    /* renamed from: a */
    public final C24411q f61754a;

    public C24395a(C24411q qVar) {
        this.f61754a = qVar;
    }

    /* renamed from: a */
    public final C24415u mo58820a(Class cls) throws Exception {
        Class<?> componentType = cls.getComponentType();
        if (componentType == Character.TYPE) {
            return new C24403i(0, componentType);
        }
        if (componentType == Character.class) {
            return new C24403i(0, componentType);
        }
        if (componentType == String.class) {
            return new C24414t();
        }
        C24415u a = this.f61754a.mo58820a(componentType);
        if (a == null) {
            return null;
        }
        return new C24396b(a, componentType);
    }
}
