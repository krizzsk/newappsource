package p462eh;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import p935yg.C20720c;

/* renamed from: eh.e */
public class C16824e {

    /* renamed from: i */
    public static C16824e[] f43796i = {new C16824e(false, 3, 5, 8, 8, 1), new C16824e(false, 5, 7, 10, 10, 1), new C16824e(true, 5, 7, 16, 6, 1), new C16824e(false, 8, 10, 12, 12, 1), new C16824e(true, 10, 11, 14, 6, 2), new C16824e(false, 12, 12, 14, 14, 1), new C16824e(true, 16, 14, 24, 10, 1), new C16824e(false, 18, 14, 16, 16, 1), new C16824e(false, 22, 18, 18, 18, 1), new C16824e(true, 22, 18, 16, 10, 2), new C16824e(false, 30, 20, 20, 20, 1), new C16824e(true, 32, 24, 16, 14, 2), new C16824e(false, 36, 24, 22, 22, 1), new C16824e(false, 44, 28, 24, 24, 1), new C16824e(true, 49, 28, 22, 14, 2), new C16824e(false, 62, 36, 14, 14, 4), new C16824e(false, 86, 42, 16, 16, 4), new C16824e(false, 114, 48, 18, 18, 4), new C16824e(false, 144, 56, 20, 20, 4), new C16824e(false, 174, 68, 22, 22, 4), new C16824e(204, 84, 24, 24, 4, 102, 42, false), new C16824e(280, 112, 14, 14, 16, 140, 56, false), new C16824e(368, 144, 16, 16, 16, 92, 36, false), new C16824e(456, 192, 18, 18, 16, 114, 48, false), new C16824e(576, 224, 20, 20, 16, 144, 56, false), new C16824e(696, 272, 22, 22, 16, 174, 68, false), new C16824e(816, 336, 24, 24, 16, 136, 56, false), new C16824e(1050, 408, 18, 18, 36, 175, 68, false), new C16824e(1304, 496, 20, 20, 36, 163, 62, false), new C16820a()};

    /* renamed from: a */
    public final boolean f43797a;

    /* renamed from: b */
    public final int f43798b;

    /* renamed from: c */
    public final int f43799c;

    /* renamed from: d */
    public final int f43800d;

    /* renamed from: e */
    public final int f43801e;

    /* renamed from: f */
    public final int f43802f;

    /* renamed from: g */
    public final int f43803g;

    /* renamed from: h */
    public final int f43804h;

    public C16824e(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, i, i2, z);
    }

    /* renamed from: f */
    public static C16824e m42609f(int i, SymbolShapeHint symbolShapeHint, C20720c cVar, C20720c cVar2) {
        C16824e[] eVarArr = f43796i;
        for (int i2 = 0; i2 < 30; i2++) {
            C16824e eVar = eVarArr[i2];
            if ((symbolShapeHint != SymbolShapeHint.FORCE_SQUARE || !eVar.f43797a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || eVar.f43797a) && ((cVar == null || (eVar.mo49498d() >= 0 && (eVar.mo49499e() * eVar.f43801e) + (eVar.mo49499e() << 1) >= 0)) && ((cVar2 == null || (eVar.mo49498d() <= 0 && (eVar.mo49499e() * eVar.f43801e) + (eVar.mo49499e() << 1) <= 0)) && i <= eVar.f43798b)))) {
                return eVar;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    public int mo49490a(int i) {
        return this.f43803g;
    }

    /* renamed from: b */
    public final int mo49497b() {
        int i = this.f43802f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 4)) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: c */
    public int mo49491c() {
        return this.f43798b / this.f43803g;
    }

    /* renamed from: d */
    public final int mo49498d() {
        return (mo49497b() * this.f43800d) + (mo49497b() << 1);
    }

    /* renamed from: e */
    public final int mo49499e() {
        int i = this.f43802f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f43797a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb.append(str);
        sb.append(" data region ");
        sb.append(this.f43800d);
        sb.append('x');
        sb.append(this.f43801e);
        sb.append(", symbol size ");
        sb.append(mo49498d());
        sb.append('x');
        sb.append((mo49499e() * this.f43801e) + (mo49499e() << 1));
        sb.append(", symbol data size ");
        sb.append(mo49497b() * this.f43800d);
        sb.append('x');
        sb.append(mo49499e() * this.f43801e);
        sb.append(", codewords ");
        sb.append(this.f43798b);
        sb.append('+');
        sb.append(this.f43799c);
        return sb.toString();
    }

    public C16824e(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.f43797a = z;
        this.f43798b = i;
        this.f43799c = i2;
        this.f43800d = i3;
        this.f43801e = i4;
        this.f43802f = i5;
        this.f43803g = i6;
        this.f43804h = i7;
    }
}
