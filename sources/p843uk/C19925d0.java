package p843uk;

import java.util.ArrayList;
import java.util.List;
import p705on.C18804k;
import p705on.C18810p;
import p752qn.C19148f;

/* renamed from: uk.d0 */
public final class C19925d0 {

    /* renamed from: a */
    public final C19148f f50600a;

    /* renamed from: b */
    public final String f50601b;

    /* renamed from: c */
    public final List<C19947q> f50602c;

    /* renamed from: d */
    public final C18804k f50603d;

    /* renamed from: e */
    public final String f50604e;

    /* renamed from: f */
    public final C18810p f50605f;

    public C19925d0(C19148f fVar, String str, ArrayList arrayList, C18804k kVar, String str2, C18810p pVar) {
        this.f50605f = pVar;
        this.f50604e = str2;
        this.f50600a = fVar;
        this.f50601b = str;
        this.f50602c = arrayList;
        this.f50603d = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19925d0.class != obj.getClass()) {
            return false;
        }
        C19925d0 d0Var = (C19925d0) obj;
        C18810p pVar = this.f50605f;
        if (pVar == null ? d0Var.f50605f != null : !pVar.equals(d0Var.f50605f)) {
            return false;
        }
        String str = this.f50604e;
        if (str == null ? d0Var.f50604e != null : !str.equals(d0Var.f50604e)) {
            return false;
        }
        C19148f fVar = this.f50600a;
        if (fVar == null ? d0Var.f50600a != null : !fVar.equals(d0Var.f50600a)) {
            return false;
        }
        String str2 = this.f50601b;
        if (str2 == null ? d0Var.f50601b != null : !str2.equals(d0Var.f50601b)) {
            return false;
        }
        List<C19947q> list = this.f50602c;
        if (list == null ? d0Var.f50602c != null : !list.equals(d0Var.f50602c)) {
            return false;
        }
        C18804k kVar = this.f50603d;
        C18804k kVar2 = d0Var.f50603d;
        if (kVar != null) {
            return kVar.equals(kVar2);
        }
        if (kVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C18810p pVar = this.f50605f;
        int i6 = 0;
        if (pVar != null) {
            i = pVar.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        String str = this.f50604e;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        C19148f fVar = this.f50600a;
        if (fVar != null) {
            i3 = fVar.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str2 = this.f50601b;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i9 + i4) * 31;
        List<C19947q> list = this.f50602c;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        C18804k kVar = this.f50603d;
        if (kVar != null) {
            i6 = kVar.hashCode();
        }
        return i12 + i6;
    }
}
