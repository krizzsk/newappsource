package p843uk;

import p752qn.C19148f;

/* renamed from: uk.x */
public final class C19954x {

    /* renamed from: a */
    public final C19148f f50719a;

    /* renamed from: b */
    public final String f50720b;

    /* renamed from: c */
    public final C19944n f50721c;

    /* renamed from: d */
    public final String f50722d;

    /* renamed from: e */
    public final String f50723e;

    /* renamed from: f */
    public final C19938j0 f50724f;

    /* renamed from: g */
    public final String f50725g;

    public C19954x(C19148f fVar, String str, C19944n nVar, String str2, String str3, C19938j0 j0Var, String str4) {
        this.f50719a = fVar;
        this.f50720b = str;
        this.f50721c = nVar;
        this.f50722d = str2;
        this.f50723e = str3;
        this.f50724f = j0Var;
        this.f50725g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19954x.class != obj.getClass()) {
            return false;
        }
        C19954x xVar = (C19954x) obj;
        C19148f fVar = this.f50719a;
        if (fVar == null ? xVar.f50719a != null : !fVar.equals(xVar.f50719a)) {
            return false;
        }
        String str = this.f50720b;
        if (str == null ? xVar.f50720b != null : !str.equals(xVar.f50720b)) {
            return false;
        }
        C19944n nVar = this.f50721c;
        if (nVar == null ? xVar.f50721c != null : !nVar.equals(xVar.f50721c)) {
            return false;
        }
        String str2 = this.f50722d;
        if (str2 == null ? xVar.f50722d != null : !str2.equals(xVar.f50722d)) {
            return false;
        }
        String str3 = this.f50723e;
        if (str3 == null ? xVar.f50723e != null : !str3.equals(xVar.f50723e)) {
            return false;
        }
        C19938j0 j0Var = this.f50724f;
        if (j0Var == null ? xVar.f50724f != null : !j0Var.equals(xVar.f50724f)) {
            return false;
        }
        String str4 = this.f50725g;
        String str5 = xVar.f50725g;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 == null) {
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
        int i6;
        C19148f fVar = this.f50719a;
        int i7 = 0;
        if (fVar != null) {
            i = fVar.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        String str = this.f50720b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        C19944n nVar = this.f50721c;
        if (nVar != null) {
            i3 = nVar.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i9 + i3) * 31;
        String str2 = this.f50722d;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        String str3 = this.f50723e;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        C19938j0 j0Var = this.f50724f;
        if (j0Var != null) {
            i6 = j0Var.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        String str4 = this.f50725g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i14 + i7;
    }
}
