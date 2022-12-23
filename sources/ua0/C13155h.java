package ua0;

import android.util.SparseArray;
import java.util.ArrayList;
import ua0.C13153g;

/* renamed from: ua0.h */
public final class C13155h<T extends C13153g> {

    /* renamed from: a */
    public final ArrayList f32696a;

    /* renamed from: ua0.h$a */
    public class C13156a {

        /* renamed from: a */
        public final int f32697a;

        /* renamed from: b */
        public final T f32698b;

        public C13156a(int i, C13153g gVar) {
            this.f32697a = i;
            this.f32698b = gVar;
        }
    }

    public C13155h() {
        ArrayList arrayList = new ArrayList();
        this.f32696a = arrayList;
        arrayList.add(new C13156a(0, (C13153g) null));
    }

    /* renamed from: a */
    public final T mo40047a(int i) {
        int size = this.f32696a.size();
        for (int i2 = 0; i2 < size - 1; i2++) {
            C13156a aVar = (C13156a) this.f32696a.get(i2);
            if (i >= aVar.f32697a && i < ((C13156a) this.f32696a.get(i2 + 1)).f32697a) {
                return aVar.f32698b;
            }
        }
        ArrayList arrayList = this.f32696a;
        C13156a aVar2 = (C13156a) arrayList.get(arrayList.size() - 1);
        if (i >= aVar2.f32697a) {
            return aVar2.f32698b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && C13155h.class == obj.getClass()) {
            return this.f32696a.equals(((C13155h) obj).f32696a);
        }
        return false;
    }

    public C13155h(T t) {
        ArrayList arrayList = new ArrayList();
        this.f32696a = arrayList;
        arrayList.add(new C13156a(0, t));
    }

    public C13155h(SparseArray<T> sparseArray) {
        this.f32696a = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            this.f32696a.add(new C13156a(sparseArray.keyAt(i), (C13153g) sparseArray.valueAt(i)));
        }
    }
}
