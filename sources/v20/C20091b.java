package v20;

import c00.C13717b;
import ce0.C21100e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o20.C18696b;
import o20.C18706l;
import oa0.C12974i;
import pa0.C12998a;
import qa0.C13043a;
import v20.C20082a;
import za0.C13361f;

/* renamed from: v20.b */
public abstract class C20091b<T extends C12974i, L extends C13361f<? super T>, MIS extends C18706l<?, ?>> implements C18696b<MIS> {

    /* renamed from: a */
    public final Object f50956a;

    /* renamed from: b */
    public final C20082a f50957b;

    /* renamed from: c */
    public final Class<T> f50958c;

    public C20091b(Class cls, C13043a aVar, C20082a aVar2) {
        this.f50956a = mo52338i(aVar);
        C21100e.m49373x(aVar2, "elementBuilder");
        this.f50957b = aVar2;
        this.f50958c = cls;
    }

    /* renamed from: a */
    public final <SO> void mo51062a(Class<? extends SO> cls, Collection<? super SO> collection) {
        ArrayList arrayList = ((C13361f) this.f50956a).f33149f;
        if (!C13717b.m34258e(arrayList)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C12974i) {
                    this.f50957b.getClass();
                    Object obj = ((C20082a.C20088f) ((C12974i) next).f32126f).f50952a;
                    if (cls.isInstance(obj)) {
                        collection.add(cls.cast(obj));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo51063b(List list) {
        ((C13361f) this.f50956a).mo40239g(list);
    }

    /* renamed from: c */
    public final void mo51064c(Object obj) {
        C12974i j = mo52339j(obj);
        if (j.f32122b) {
            j.f32122b = false;
            j.mo39856f();
        }
    }

    public final void clear() {
        ((C13361f) this.f50956a).mo40237d();
    }

    /* renamed from: d */
    public final Object mo51066d(MIS mis) {
        C12974i h = mo52337h(this.f50957b, mis);
        C13361f fVar = (C13361f) this.f50956a;
        fVar.getClass();
        fVar.mo40235b(Collections.singletonList(h));
        return h;
    }

    /* renamed from: f */
    public final ArrayList mo51067f(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo52337h(this.f50957b, (C18706l) it.next()));
        }
        ((C13361f) this.f50956a).mo40235b(arrayList);
        return null;
    }

    /* renamed from: h */
    public abstract T mo52337h(C20082a aVar, MIS mis);

    /* renamed from: i */
    public abstract C12998a mo52338i(C13043a aVar);

    /* JADX WARNING: type inference failed for: r0v0, types: [pa0.a, java.lang.Object] */
    public final boolean isVisible() {
        return this.f50956a.f32171b;
    }

    /* renamed from: j */
    public final T mo52339j(Object obj) {
        if (this.f50958c.isInstance(obj)) {
            return (C12974i) this.f50958c.cast(obj);
        }
        throw new IllegalArgumentException("Invalid removal token: " + obj);
    }

    public final void remove(Object obj) {
        C13361f fVar = (C13361f) this.f50956a;
        C12974i j = mo52339j(obj);
        fVar.getClass();
        fVar.mo40239g(Collections.singletonList(j));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [pa0.a, java.lang.Object] */
    public final void setVisible(boolean z) {
        this.f50956a.mo39883a(z);
    }
}
