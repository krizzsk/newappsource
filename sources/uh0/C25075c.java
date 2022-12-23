package uh0;

import cf0.C21123a;
import java.util.List;
import java.util.regex.Matcher;
import mf0.C24362h;

/* renamed from: uh0.c */
public final class C25075c {

    /* renamed from: a */
    public final Matcher f63284a;

    /* renamed from: b */
    public C25076a f63285b;

    /* renamed from: uh0.c$a */
    public static final class C25076a extends C21123a<String> {

        /* renamed from: b */
        public final /* synthetic */ C25075c f63286b;

        public C25076a(C25075c cVar) {
            this.f63286b = cVar;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains((String) obj);
        }

        /* renamed from: e */
        public final int mo53351e() {
            return this.f63286b.f63284a.groupCount() + 1;
        }

        public final Object get(int i) {
            String group = this.f63286b.f63284a.group(i);
            if (group == null) {
                return "";
            }
            return group;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf((String) obj);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf((String) obj);
        }
    }

    public C25075c(Matcher matcher, String str) {
        this.f63284a = matcher;
    }

    /* renamed from: a */
    public final List<String> mo61610a() {
        if (this.f63285b == null) {
            this.f63285b = new C25076a(this);
        }
        C25076a aVar = this.f63285b;
        C24362h.m61208c(aVar);
        return aVar;
    }
}
