package s40;

import java.io.File;
import java.io.RandomAccessFile;
import l40.C5605d;
import r40.C6250a;
import r40.C6251b;

/* renamed from: s40.h */
public final class C6471h extends C6466e {
    /* renamed from: a */
    public final void mo22585a(C6465d dVar) throws Exception {
        int i = dVar.f20192i.f19712f[dVar.f20192i.f19710d.get(dVar.f20191h.f15142b)];
        if (i > 0) {
            C5605d dVar2 = dVar.f20184a;
            C6251b bVar = new C6251b(dVar.f20193j, dVar.f20194k, dVar.f20195l, dVar.f20196m);
            C6250a aVar = dVar.f20192i;
            int[] iArr = aVar.f19707a;
            int[] iArr2 = aVar.f19709c;
            int[] iArr3 = aVar.f19708b;
            dVar2.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(dVar2.f18351a, "trips.dat"), "r");
            randomAccessFile.seek((long) i);
            C5605d.m13824f(bVar, randomAccessFile, iArr, iArr2, iArr3);
            randomAccessFile.close();
            dVar.f20197n = bVar;
        }
    }
}
