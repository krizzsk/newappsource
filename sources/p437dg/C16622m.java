package p437dg;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p172m9.C5720b;
import p359ag.C13448e;
import p359ag.C13449f;
import p359ag.C13450g;
import p359ag.C13451h;
import p359ag.C13455l;
import p359ag.C13456m;
import p359ag.C13458o;
import p359ag.C13459p;
import p406cg.C13822k;
import p509gg.C17189a;

/* renamed from: dg.m */
public final class C16622m<T> extends C13458o<T> {

    /* renamed from: a */
    public final C13456m<T> f43299a;

    /* renamed from: b */
    public final C13449f<T> f43300b;

    /* renamed from: c */
    public final Gson f43301c;

    /* renamed from: d */
    public final C17189a<T> f43302d;

    /* renamed from: e */
    public final C13459p f43303e;

    /* renamed from: f */
    public final C16622m<T>.C25541a f43304f = new C16623a();

    /* renamed from: g */
    public C13458o<T> f43305g;

    /* renamed from: dg.m$a */
    public final class C16623a implements C13455l, C13448e {
    }

    /* renamed from: dg.m$b */
    public static final class C16624b implements C13459p {

        /* renamed from: b */
        public final C17189a<?> f43306b;

        /* renamed from: c */
        public final boolean f43307c;

        /* renamed from: d */
        public final Class<?> f43308d;

        /* renamed from: e */
        public final C13456m<?> f43309e;

        /* renamed from: f */
        public final C13449f<?> f43310f;

        public C16624b(Object obj, C17189a<?> aVar, boolean z, Class<?> cls) {
            C13456m<?> mVar;
            boolean z2;
            C13449f<?> fVar = null;
            if (obj instanceof C13456m) {
                mVar = (C13456m) obj;
            } else {
                mVar = null;
            }
            this.f43309e = mVar;
            fVar = obj instanceof C13449f ? (C13449f) obj : fVar;
            this.f43310f = fVar;
            if (mVar == null && fVar == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C5720b.m14050a(z2);
            this.f43306b = aVar;
            this.f43307c = z;
            this.f43308d = cls;
        }

        /* renamed from: a */
        public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
            boolean z;
            C17189a<?> aVar2 = this.f43306b;
            if (aVar2 == null) {
                z = this.f43308d.isAssignableFrom(aVar.f44431a);
            } else if (aVar2.equals(aVar) || (this.f43307c && this.f43306b.f44432b == aVar.f44431a)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C16622m(this.f43309e, this.f43310f, gson, aVar, this);
            }
            return null;
        }
    }

    public C16622m(C13456m<T> mVar, C13449f<T> fVar, Gson gson, C17189a<T> aVar, C13459p pVar) {
        this.f43299a = mVar;
        this.f43300b = fVar;
        this.f43301c = gson;
        this.f43302d = aVar;
        this.f43303e = pVar;
    }

    /* renamed from: a */
    public final T mo40320a(JsonReader jsonReader) throws IOException {
        if (this.f43300b == null) {
            C13458o<T> oVar = this.f43305g;
            if (oVar == null) {
                oVar = this.f43301c.getDelegateAdapter(this.f43303e, this.f43302d);
                this.f43305g = oVar;
            }
            return oVar.mo40320a(jsonReader);
        }
        C13450g a = C13822k.m34498a(jsonReader);
        a.getClass();
        if (a instanceof C13451h) {
            return null;
        }
        return this.f43300b.deserialize(a, this.f43302d.f44432b, this.f43304f);
    }

    /* renamed from: b */
    public final void mo40321b(JsonWriter jsonWriter, T t) throws IOException {
        C13456m<T> mVar = this.f43299a;
        if (mVar == null) {
            C13458o<T> oVar = this.f43305g;
            if (oVar == null) {
                oVar = this.f43301c.getDelegateAdapter(this.f43303e, this.f43302d);
                this.f43305g = oVar;
            }
            oVar.mo40321b(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            C16626o.f43316C.mo40321b(jsonWriter, mVar.serialize(t, this.f43302d.f44432b, this.f43304f));
        }
    }
}
