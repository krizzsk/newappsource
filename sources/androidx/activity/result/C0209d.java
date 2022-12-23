package androidx.activity.result;

import p065e.C4410a;

/* renamed from: androidx.activity.result.d */
public final class C0209d extends C0207b<Object> {

    /* renamed from: a */
    public final /* synthetic */ String f541a;

    /* renamed from: b */
    public final /* synthetic */ C4410a f542b;

    /* renamed from: c */
    public final /* synthetic */ C0210e f543c;

    public C0209d(C0210e eVar, String str, C4410a aVar) {
        this.f543c = eVar;
        this.f541a = str;
        this.f542b = aVar;
    }

    /* renamed from: a */
    public final void mo772a(Object obj) {
        Integer num = (Integer) this.f543c.f546c.get(this.f541a);
        if (num != null) {
            this.f543c.f548e.add(this.f541a);
            try {
                this.f543c.mo742b(num.intValue(), this.f542b, obj);
            } catch (Exception e) {
                this.f543c.f548e.remove(this.f541a);
                throw e;
            }
        } else {
            StringBuilder k = C13555b.m33972k("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            k.append(this.f542b);
            k.append(" and input ");
            k.append(obj);
            k.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: b */
    public final void mo773b() {
        this.f543c.mo778f(this.f541a);
    }
}
