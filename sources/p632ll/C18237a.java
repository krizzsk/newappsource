package p632ll;

import p364al.C13483d;
import p364al.C13487h;
import p443dm.C16683h;
import p583jk.C17867b;
import p608kl.C18092b;
import p610kn.C18107a;
import p610kn.C18108b;
import p655ml.C18398a;
import p678nk.C18571a;
import p678nk.C18572b;
import p725pj.C18926a;
import p727pl.C18930a;
import p794sj.C19467d;
import p819tk.C19692i;
import p870vn.C20162b;
import p890wj.C20343a;

/* renamed from: ll.a */
public final class C18237a implements C13483d<Void> {

    /* renamed from: a */
    public final C18398a f46524a;

    /* renamed from: b */
    public final C18239c f46525b;

    public C18237a(C18398a aVar, C18239c cVar) {
        this.f46524a = aVar;
        this.f46525b = cVar;
    }

    /* renamed from: C */
    public final C13487h<Void> mo40394C() {
        C13487h hVar;
        boolean z;
        String str;
        C13487h hVar2;
        C13487h a;
        byte b;
        byte b2;
        char c;
        C13487h<Boolean> b3 = this.f46524a.mo50856b();
        if (b3.mo40399a()) {
            return new C13487h<>(null, b3.f33366b);
        }
        if (Boolean.TRUE.equals((Boolean) b3.f33365a)) {
            return new C13487h<>(null, (C18926a) null);
        }
        C18239c cVar = this.f46525b;
        C13487h<C18108b> C = cVar.f46528c.mo40394C();
        if (C.mo40399a()) {
            hVar = C18239c.m44971a(C.f33366b);
        } else {
            C18108b bVar = (C18108b) C.f33365a;
            C18571a aVar = new C18571a();
            if (bVar == null || bVar.f46302a == null || bVar.f46303b == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                aVar.f47271c = bVar.f46302a;
                aVar.f47270b = bVar.f46303b;
                hVar2 = cVar.f46527b.mo50642a(aVar).mo40394C();
                str = null;
            } else {
                C16683h hVar3 = cVar.f46531f;
                C17867b.C17869b bVar2 = hVar3.f43456a;
                byte[] a2 = hVar3.f43457b.mo52261a(30);
                bVar2.getClass();
                int length = ((a2.length * 4) + 2) / 3;
                char[] cArr = new char[(((a2.length + 2) / 3) * 4)];
                int length2 = a2.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i + 1;
                    byte b4 = a2[i] & 255;
                    if (i3 < length2) {
                        b = a2[i3] & 255;
                        i3++;
                    } else {
                        b = 0;
                    }
                    if (i3 < length2) {
                        b2 = a2[i3] & 255;
                        i3++;
                    } else {
                        b2 = 0;
                    }
                    int i4 = b4 >>> 2;
                    int i5 = ((b4 & 3) << 4) | (b >>> 4);
                    int i6 = ((b & 15) << 2) | (b2 >>> 6);
                    byte b5 = b2 & 63;
                    int i7 = i2 + 1;
                    char[] cArr2 = C17867b.f45854a;
                    cArr[i2] = cArr2[i4];
                    int i8 = i7 + 1;
                    cArr[i7] = cArr2[i5];
                    char c2 = '=';
                    if (i8 < length) {
                        c = cArr2[i6];
                    } else {
                        c = '=';
                    }
                    cArr[i8] = c;
                    int i9 = i8 + 1;
                    if (i9 < length) {
                        c2 = cArr2[b5];
                    }
                    cArr[i9] = c2;
                    i2 = i9 + 1;
                    i = i3;
                }
                String str2 = new String(cArr);
                aVar.f47271c = null;
                aVar.f47270b = str2;
                C13487h C2 = cVar.f46526a.mo50642a(aVar).mo40394C();
                str = str2;
                hVar2 = C2;
            }
            if (hVar2.mo40399a()) {
                C18926a aVar2 = hVar2.f33366b;
                if (aVar2.mo51438a(C20343a.f51504a.intValue(), "UserServiceError")) {
                    C19467d dVar = new C19467d(aVar2, C19467d.f49496e, "Device Blocked");
                    cVar.f46532g.mo52410a(new C20162b(dVar));
                    hVar = new C13487h(null, dVar);
                } else {
                    hVar = new C13487h(null, aVar2);
                }
            } else {
                C18572b bVar3 = (C18572b) hVar2.f33365a;
                C19692i iVar = bVar3.f49976a;
                C18107a aVar3 = new C18107a(iVar.f49998b, iVar.f49999c);
                C18092b bVar4 = cVar.f46530e;
                synchronized (bVar4.f46253e) {
                    a = bVar4.f46250b.mo51446a(aVar3);
                    if (!a.mo40399a()) {
                        bVar4.f46254f = aVar3;
                    }
                }
                if (a.mo40399a()) {
                    hVar = C18239c.m44971a(a.f33366b);
                } else {
                    String str3 = bVar3.f47272d;
                    if (str != null) {
                        C13487h<Void> C3 = new C18930a(cVar.f46529d.f48213a, str3, str).mo40394C();
                        if (C3.mo40399a()) {
                            hVar = C18239c.m44971a(C3.f33366b);
                        }
                    }
                    hVar = new C13487h(null, (C18926a) null);
                }
            }
        }
        if (hVar.mo40399a()) {
            return new C13487h<>(null, hVar.f33366b);
        }
        return new C13487h<>(null, (C18926a) null);
    }
}
