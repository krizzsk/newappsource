package g20;

import android.content.Context;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.ArrayList;
import p977zz.C20964s0;

/* renamed from: g20.c */
public final class C17141c<O> extends C17142d<O, CharSequence> {

    /* renamed from: b */
    public final ArrayList f44375b;

    /* renamed from: c */
    public final C17163k f44376c;

    public C17141c(C17163k kVar, ArrayList arrayList) {
        this.f44375b = new ArrayList(arrayList);
        C21100e.m49373x(kVar, "delimiter");
        this.f44376c = kVar;
    }

    /* renamed from: a */
    public final Object mo49725a(Context context, Object obj) {
        int size = this.f44375b.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        for (int i = 0; i < size; i++) {
            CharSequence charSequence = (CharSequence) ((C17142d) this.f44375b.get(i)).mo49725a(context, obj);
            charSequenceArr[i] = charSequence;
            if (charSequence == null) {
                charSequenceArr[i] = "";
            }
        }
        return this.f44376c.mo49745a(charSequenceArr);
    }

    /* renamed from: b */
    public final Object mo49727b(Context context, Object obj) {
        int size = this.f44375b.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        for (int i = 0; i < size; i++) {
            CharSequence charSequence = (CharSequence) ((C17142d) this.f44375b.get(i)).mo49727b(context, obj);
            charSequenceArr[i] = charSequence;
            if (charSequence == null) {
                charSequenceArr[i] = "";
            }
        }
        return this.f44376c.mo49745a(charSequenceArr);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Cat(");
        k.append(C20964s0.m49100r(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, this.f44375b));
        k.append(")");
        return k.toString();
    }
}
