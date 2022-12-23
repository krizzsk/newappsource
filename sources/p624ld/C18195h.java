package p624ld;

import com.google.common.base.AbstractIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p624ld.C18180a;

/* renamed from: ld.h */
public final class C18195h {

    /* renamed from: a */
    public final C18180a f46439a;

    /* renamed from: b */
    public final C18197b f46440b;

    /* renamed from: c */
    public final int f46441c = Integer.MAX_VALUE;

    /* renamed from: ld.h$a */
    public static abstract class C18196a extends AbstractIterator<String> {

        /* renamed from: d */
        public final CharSequence f46442d;

        /* renamed from: e */
        public final C18180a f46443e;

        /* renamed from: f */
        public final boolean f46444f;

        /* renamed from: g */
        public int f46445g = 0;

        /* renamed from: h */
        public int f46446h;

        public C18196a(C18195h hVar, CharSequence charSequence) {
            this.f46443e = hVar.f46439a;
            this.f46444f = false;
            this.f46446h = hVar.f46441c;
            this.f46442d = charSequence;
        }
    }

    /* renamed from: ld.h$b */
    public interface C18197b {
    }

    public C18195h(C18194g gVar) {
        C18180a.C18186f fVar = C18180a.C18186f.f46426b;
        this.f46440b = gVar;
        this.f46439a = fVar;
    }

    /* renamed from: a */
    public final List<String> mo50608a(CharSequence charSequence) {
        charSequence.getClass();
        C18194g gVar = (C18194g) this.f46440b;
        gVar.getClass();
        C18193f fVar = new C18193f(gVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (fVar.hasNext()) {
            arrayList.add((String) fVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
