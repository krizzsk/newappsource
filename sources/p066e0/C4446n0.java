package p066e0;

import androidx.camera.core.impl.C0573b;
import java.util.ArrayList;

/* renamed from: e0.n0 */
public final class C4446n0 {

    /* renamed from: a */
    public final ArrayList f15507a = new ArrayList();

    /* renamed from: b */
    public static void m11648b(ArrayList arrayList, int i, int[] iArr, int i2) {
        boolean z;
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = false;
                    break;
                } else if (i3 == iArr[i4]) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (!z) {
                iArr[i2] = i3;
                m11648b(arrayList, i, iArr, i2 + 1);
            }
        }
    }

    /* renamed from: a */
    public final void mo19985a(C0573b bVar) {
        this.f15507a.add(bVar);
    }
}
