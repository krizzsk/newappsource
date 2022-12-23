package androidx.activity.result;

import p065e.C4410a;

/* renamed from: androidx.activity.result.c */
public final class C0208c extends C0207b<Object> {

    /* renamed from: a */
    public final /* synthetic */ String f538a;

    /* renamed from: b */
    public final /* synthetic */ C4410a f539b;

    /* renamed from: c */
    public final /* synthetic */ C0210e f540c;

    public C0208c(C0210e eVar, String str, C4410a aVar) {
        this.f540c = eVar;
        this.f538a = str;
        this.f539b = aVar;
    }

    /* renamed from: a */
    public final void mo772a(Object obj) {
        Integer num = (Integer) this.f540c.f546c.get(this.f538a);
        if (num != null) {
            this.f540c.f548e.add(this.f538a);
            try {
                this.f540c.mo742b(num.intValue(), this.f539b, obj);
            } catch (Exception e) {
                this.f540c.f548e.remove(this.f538a);
                throw e;
            }
        } else {
            StringBuilder k = C13555b.m33972k("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            k.append(this.f539b);
            k.append(" and input ");
            k.append(obj);
            k.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: b */
    public final void mo773b() {
        this.f540c.mo778f(this.f538a);
    }
}
