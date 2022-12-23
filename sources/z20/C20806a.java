package z20;

import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j40.C5384a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p241s0.C6302b;
import p583jk.C17884p;
import p977zz.C20936e0;
import x20.C20449c;

/* renamed from: z20.a */
public final class C20806a {

    /* renamed from: a */
    public final String f52518a;

    /* renamed from: b */
    public final C20808b f52519b;

    /* renamed from: c */
    public final List<C20808b> f52520c;

    /* renamed from: d */
    public final int f52521d;

    /* renamed from: z20.a$a */
    public static class C20807a {

        /* renamed from: e */
        public static final SimpleDateFormat f52522e = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.ENGLISH);

        /* renamed from: a */
        public final String f52523a;

        /* renamed from: b */
        public final C6302b f52524b = new C6302b();

        /* renamed from: c */
        public final ArrayList f52525c = new ArrayList(2);

        /* renamed from: d */
        public int f52526d = -1;

        public C20807a(String str) {
            C21100e.m49373x(str, "eventKey");
            this.f52523a = str;
        }

        /* renamed from: a */
        public final C20806a mo52933a() {
            return new C20806a(this.f52523a, new C20808b(this.f52524b), this.f52525c, this.f52526d);
        }

        /* renamed from: b */
        public final void mo52934b(Object obj, String str) {
            if (obj != null) {
                this.f52524b.put(str, obj);
            } else {
                this.f52524b.remove(str);
            }
        }

        /* renamed from: c */
        public final void mo52935c() {
            C20449c cVar = C20449c.f51792c;
            if (cVar != null) {
                cVar.mo52639b(mo52933a());
                return;
            }
            throw new IllegalStateException("you must call initialize first");
        }

        /* renamed from: d */
        public final void mo52936d(String str, C5384a aVar) {
            String str2;
            if (aVar != null) {
                str2 = aVar.getServerId().mo19751c();
            } else {
                str2 = null;
            }
            mo52934b(str2, str);
        }

        /* renamed from: e */
        public final void mo52937e(String str, CurrencyAmount currencyAmount) {
            Double d;
            if (currencyAmount != null) {
                d = Double.valueOf(currencyAmount.f23845c.doubleValue());
            } else {
                d = null;
            }
            mo52934b(d, str);
        }

        /* renamed from: f */
        public final void mo52938f(CurrencyAmount currencyAmount) {
            String str;
            if (currencyAmount != null) {
                str = currencyAmount.f23844b;
            } else {
                str = null;
            }
            mo52934b(str, InAppPurchaseMetaData.KEY_CURRENCY);
        }
    }

    public C20806a() {
        throw null;
    }

    public C20806a(String str) {
        this(str, new C20808b(Collections.emptyMap()), Collections.emptyList(), -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20806a)) {
            return false;
        }
        C20806a aVar = (C20806a) obj;
        if (!this.f52518a.equals(aVar.f52518a) || !this.f52519b.equals(aVar.f52519b) || !this.f52520c.equals(aVar.f52520c) || this.f52521d != aVar.f52521d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f52518a), C17884p.m44335F(this.f52519b), C17884p.m44335F(this.f52520c), this.f52521d);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MarketingEvent{name='");
        C25541a.m63890u(k, this.f52518a, '\'', ", attributes=");
        k.append(this.f52519b);
        k.append(", items=");
        k.append(this.f52520c);
        k.append(", maxUserAge=");
        return C16530d.m42014g(k, this.f52521d, '}');
    }

    public C20806a(String str, C20808b bVar, List<C20808b> list, int i) {
        C21100e.m49373x(str, "name");
        this.f52518a = str;
        this.f52519b = bVar;
        C21100e.m49373x(list, "items");
        this.f52520c = Collections.unmodifiableList(list);
        this.f52521d = C20936e0.m49036b(-1, Integer.MAX_VALUE, i);
    }
}
