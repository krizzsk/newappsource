package p232r4;

import java.util.Arrays;
import java.util.List;
import p037c5.C1792m;
import p120i5.C5280a;

/* renamed from: r4.b */
public abstract class C6242b implements C1792m {

    /* renamed from: b */
    public final /* synthetic */ int f19693b;

    /* renamed from: c */
    public Object f19694c;

    public /* synthetic */ C6242b(int i) {
        this.f19693b = i;
    }

    /* renamed from: e */
    public final boolean mo6603e() {
        return ((List) this.f19694c).isEmpty() || (((List) this.f19694c).size() == 1 && ((C5280a) ((List) this.f19694c).get(0)).mo21082c());
    }

    /* renamed from: j */
    public final List mo6604j() {
        return (List) this.f19694c;
    }

    public String toString() {
        switch (this.f19693b) {
            case 1:
                StringBuilder sb = new StringBuilder();
                if (!((List) this.f19694c).isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(((List) this.f19694c).toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C6242b(Object obj, int i) {
        this.f19693b = i;
        this.f19694c = obj;
    }
}
