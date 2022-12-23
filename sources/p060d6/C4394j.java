package p060d6;

import com.bumptech.glide.load.data.C2144e;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p025b6.C1492e;
import p229r1.C6234d;
import p322y6.C7333a;
import p358af.C13437d;
import p584jl.C17885a;

/* renamed from: d6.j */
public final class C4394j<Data, ResourceType, Transcode> {

    /* renamed from: a */
    public final C6234d<List<Throwable>> f15434a;

    /* renamed from: b */
    public final List<? extends C4384e<Data, ResourceType, Transcode>> f15435b;

    /* renamed from: c */
    public final String f15436c;

    public C4394j(Class cls, Class cls2, Class cls3, List list, C7333a.C7336c cVar) {
        this.f15434a = cVar;
        if (!list.isEmpty()) {
            this.f15435b = list;
            StringBuilder k = C13555b.m33972k("Failed LoadPath{");
            k.append(cls.getSimpleName());
            k.append("->");
            k.append(cls2.getSimpleName());
            k.append("->");
            this.f15436c = C13437d.m33705j(cls3, k, "}");
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: a */
    public final C4397l mo19908a(int i, int i2, C1492e eVar, C2144e eVar2, DecodeJob.C2161c cVar) throws GlideException {
        C4397l lVar;
        List<Throwable> b = this.f15434a.mo22237b();
        C17885a.m44458r(b);
        List list = b;
        try {
            int size = this.f15435b.size();
            lVar = null;
            for (int i3 = 0; i3 < size; i3++) {
                lVar = ((C4384e) this.f15435b.get(i3)).mo19899a(i, i2, eVar, eVar2, cVar);
                if (lVar != null) {
                    break;
                }
            }
        } catch (GlideException e) {
            list.add(e);
        } catch (Throwable th) {
            this.f15434a.mo22236a(list);
            throw th;
        }
        if (lVar != null) {
            this.f15434a.mo22236a(list);
            return lVar;
        }
        throw new GlideException(this.f15436c, (List<Throwable>) new ArrayList(list));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("LoadPath{decodePaths=");
        k.append(Arrays.toString(this.f15435b.toArray()));
        k.append('}');
        return k.toString();
    }
}
