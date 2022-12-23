package p220q5;

import com.appboy.models.cards.Card;
import com.appboy.p044ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.facebook.internal.instrument.InstrumentData;
import com.google.android.exoplayer2.p052ui.C4047p;
import com.veriff.sdk.camera.core.impl.Config;
import e90.C12618b;
import java.util.Comparator;
import mf0.C24362h;
import o00.C18676l;
import p427cu.C16497a;
import p977zz.C20964s0;
import p977zz.C20975x0;

/* renamed from: q5.a */
public final /* synthetic */ class C6179a implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f19572b;

    public /* synthetic */ C6179a(int i) {
        this.f19572b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f19572b) {
            case 0:
                return DefaultContentCardsUpdateHandler.lambda$handleCardUpdate$0((Card) obj, (Card) obj2);
            case 1:
                InstrumentData instrumentData = (InstrumentData) obj2;
                C24362h.m61210e(instrumentData, "o2");
                return ((InstrumentData) obj).mo12557a(instrumentData);
            case 2:
                C4047p.C4049b bVar = (C4047p.C4049b) obj;
                C4047p.C4049b bVar2 = (C4047p.C4049b) obj2;
                int compare = Integer.compare(bVar2.f14494a, bVar.f14494a);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = bVar2.f14496c.compareTo(bVar.f14496c);
                if (compareTo != 0) {
                    return compareTo;
                }
                return bVar2.f14497d.compareTo(bVar.f14497d);
            case 3:
                int i = C16497a.f43085j;
                return C20975x0.m49116c(((C16497a.C16498a) obj).f43095b, ((C16497a.C16498a) obj2).f43095b);
            case 4:
                int i2 = C12618b.f31181w;
                return C20975x0.m49116c(C20964s0.m49082C(((C18676l.C18678b) obj).f47556c), C20964s0.m49082C(((C18676l.C18678b) obj2).f47556c));
            case 5:
                return ((Config.Option) obj).getId().compareTo(((Config.Option) obj2).getId());
            default:
                return ((String) obj).compareTo((String) obj2);
        }
    }
}
