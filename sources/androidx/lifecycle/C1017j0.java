package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j0 */
public final class C1017j0 implements C1044w<Object> {

    /* renamed from: a */
    public boolean f3949a = true;

    /* renamed from: b */
    public final /* synthetic */ C1040t f3950b;

    public C1017j0(C1040t tVar) {
        this.f3950b = tVar;
    }

    public final void onChanged(Object obj) {
        Object value = this.f3950b.getValue();
        if (this.f3949a || ((value == null && obj != null) || (value != null && !value.equals(obj)))) {
            this.f3949a = false;
            this.f3950b.setValue(obj);
        }
    }
}
