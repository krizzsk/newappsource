package w10;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import ce0.C21100e;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.umo.ads.p342c.zzd;
import java.util.ArrayList;
import java.util.List;
import mc0.C12909a;
import mf0.C24362h;
import org.json.JSONException;
import p229r1.C6233c;
import p364al.C13487h;
import p413co.C13867m;
import p413co.C13872r;
import p438dh.C16666a;
import p438dh.C16667b;
import p465ek.C16835c;
import p561ik.C17618a;
import p610kn.C18107a;
import p703ol.C18783c;
import p725pj.C18926a;
import p727pl.C18932b;
import p794sj.C19464a;
import p891wk.C20344a;
import p891wk.C20348c;
import p913xi.C20531d;
import vb0.C13198b;
import wb0.C13233c;
import yb0.C13302g;
import yb0.C13304h;

/* renamed from: w10.a */
public final class C20268a implements C13304h.C13305a {

    /* renamed from: a */
    public final /* synthetic */ int f51396a;

    /* renamed from: b */
    public Object f51397b;

    /* renamed from: c */
    public Object f51398c;

    public /* synthetic */ C20268a(int i, Object obj, Object obj2) {
        this.f51396a = i;
        this.f51397b = obj;
        this.f51398c = obj2;
    }

    /* renamed from: a */
    public final void mo40214a(String str, C12909a aVar) {
        C13198b bVar = (C13198b) this.f51397b;
        if (bVar != null) {
            bVar.mo40079e(str, aVar);
        }
    }

    /* renamed from: b */
    public final void mo52442b(int i, int[] iArr) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                if (i >= ((List) this.f51398c).size()) {
                    List list = (List) this.f51398c;
                    C16667b bVar = (C16667b) list.get(list.size() - 1);
                    for (int size = ((List) this.f51398c).size(); size <= i; size++) {
                        C16666a aVar = (C16666a) this.f51397b;
                        bVar = bVar.mo49395f(new C16667b(aVar, new int[]{1, aVar.f43369a[(size - 1) + aVar.f43375g]}));
                        ((List) this.f51398c).add(bVar);
                    }
                }
                C16667b bVar2 = (C16667b) ((List) this.f51398c).get(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                C16667b g = new C16667b((C16666a) this.f51397b, iArr2).mo49396g(i, 1);
                if (!g.f43376a.equals(bVar2.f43376a)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                } else if (!bVar2.mo49393d()) {
                    C16667b bVar3 = g.f43376a.f43371c;
                    int b = g.f43376a.mo49387b(bVar2.mo49392c(bVar2.f43377b.length - 1));
                    C16667b bVar4 = g;
                    while (bVar4.f43377b.length - 1 >= bVar2.f43377b.length - 1 && !bVar4.mo49393d()) {
                        int[] iArr3 = bVar4.f43377b;
                        int length2 = (iArr3.length - 1) - (bVar2.f43377b.length - 1);
                        int c = g.f43376a.mo49388c(bVar4.mo49392c(iArr3.length - 1), b);
                        C16667b g2 = bVar2.mo49396g(length2, c);
                        bVar3 = bVar3.mo49390a(g.f43376a.mo49386a(length2, c));
                        bVar4 = bVar4.mo49390a(g2);
                    }
                    int[] iArr4 = bVar4.f43377b;
                    int length3 = i - iArr4.length;
                    for (int i2 = 0; i2 < length3; i2++) {
                        iArr[length + i2] = 0;
                    }
                    System.arraycopy(iArr4, 0, iArr, length + length3, iArr4.length);
                } else {
                    throw new IllegalArgumentException("Divide by 0");
                }
            } else {
                throw new IllegalArgumentException("No data bytes provided");
            }
        } else {
            throw new IllegalArgumentException("No error correction bytes");
        }
    }

    /* renamed from: c */
    public final void mo40215c(String str, UMOAdKitError uMOAdKitError, zzd zzd) {
        C24362h.m61211f(uMOAdKitError, "akError");
        C24362h.m61211f(zzd, "vastError");
        C13198b bVar = (C13198b) this.f51397b;
        if (bVar != null) {
            bVar.mo40076C(str, uMOAdKitError);
        }
    }

    /* renamed from: d */
    public final C13487h mo52443d(String str, C20344a aVar) {
        try {
            String b = ((C20531d) this.f51398c).mo52733b(new C20348c(aVar.f51510e, aVar.f51509d, aVar.f51511f));
            C13872r<Void> b2 = ((C13867m) this.f51397b).mo40782b(C25541a.m63881k("t-", str), b);
            if (b2.mo40817a()) {
                return new C13487h(null, new C16835c(b2.f34120b, C16835c.f43817j, "Failed saving backup data"));
            }
            return new C13487h(null, (C18926a) null);
        } catch (JSONException e) {
            return new C13487h(null, new C16835c(new C17618a(e.getMessage()), C16835c.f43817j, "Failed saving backup data"));
        }
    }

    /* renamed from: e */
    public final C13487h mo52444e(C18107a aVar) {
        C13487h a = ((C18783c) this.f51397b).mo51265a();
        if (a.mo40399a()) {
            return new C13487h(null, new C19464a(a.f33366b, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
        }
        C18107a aVar2 = (C18107a) a.f33365a;
        if (aVar2 == null || aVar2.f46300a.equals(aVar.f46300a)) {
            return ((C18932b) this.f51398c).mo51446a(aVar);
        }
        return new C13487h(null, new C19464a());
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        switch (this.f51396a) {
            case 1:
                if (obj instanceof C6233c) {
                    C6233c cVar = (C6233c) obj;
                    F f = cVar.f19679a;
                    F f2 = this.f51397b;
                    if (f == f2 || (f != null && f.equals(f2))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        S s = cVar.f19680b;
                        S s2 = this.f51398c;
                        if (s == s2 || (s != null && s.equals(s2))) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    public final int hashCode() {
        switch (this.f51396a) {
            case 1:
                Object obj = this.f51397b;
                int i = 0;
                int hashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.f51398c;
                if (obj2 != null) {
                    i = obj2.hashCode();
                }
                return hashCode ^ i;
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        switch (this.f51396a) {
            case 1:
                StringBuilder k = C13555b.m33972k("Pair{");
                k.append(this.f51397b);
                k.append(" ");
                return C16530d.m42015h(k, this.f51398c, "}");
            default:
                return super.toString();
        }
    }

    public C20268a(C13302g gVar) {
        this.f51396a = 5;
        this.f51397b = gVar;
        this.f51398c = new C13304h(this, C13233c.m33349r(), C13233c.m33347p());
    }

    public C20268a() {
        this.f51396a = 1;
    }

    public C20268a(C16666a aVar) {
        this.f51396a = 2;
        this.f51397b = aVar;
        ArrayList arrayList = new ArrayList();
        this.f51398c = arrayList;
        arrayList.add(new C16667b(aVar, new int[]{1}));
    }

    public C20268a(Drawable drawable, PointF pointF) {
        this.f51396a = 0;
        C21100e.m49373x(drawable, "drawable");
        this.f51397b = drawable;
        this.f51398c = pointF;
    }
}
