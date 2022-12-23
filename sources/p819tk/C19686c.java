package p819tk;

/* renamed from: tk.c */
public abstract class C19686c {

    /* renamed from: a */
    public C19691h f49975a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C19691h hVar = this.f49975a;
        C19691h hVar2 = ((C19686c) obj).f49975a;
        if (hVar != null) {
            return hVar.equals(hVar2);
        }
        if (hVar2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        C19691h hVar = this.f49975a;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }
}
