package p437dg;

import com.google.gson.Gson;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import p359ag.C13458o;
import p359ag.C13459p;
import p406cg.C13810b;
import p406cg.C13821j;
import p509gg.C17189a;

/* renamed from: dg.b */
public final class C16600b implements C13459p {

    /* renamed from: b */
    public final C13810b f43253b;

    /* renamed from: dg.b$a */
    public static final class C16601a<E> extends C13458o<Collection<E>> {

        /* renamed from: a */
        public final C16625n f43254a;

        /* renamed from: b */
        public final C13821j<? extends Collection<E>> f43255b;

        public C16601a(Gson gson, Type type, C13458o<E> oVar, C13821j<? extends Collection<E>> jVar) {
            this.f43254a = new C16625n(gson, oVar, type);
            this.f43255b = jVar;
        }

        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection collection = (Collection) this.f43255b.mo40737g();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collection.add(this.f43254a.mo40320a(jsonReader));
            }
            jsonReader.endArray();
            return collection;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (Object b : collection) {
                this.f43254a.mo40321b(jsonWriter, b);
            }
            jsonWriter.endArray();
        }
    }

    public C16600b(C13810b bVar) {
        this.f43253b = bVar;
    }

    /* renamed from: a */
    public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
        Type type;
        Type type2 = aVar.f44432b;
        Class<? super T> cls = aVar.f44431a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type f = C$Gson$Types.m36267f(type2, cls, Collection.class);
        if (f instanceof WildcardType) {
            f = ((WildcardType) f).getUpperBounds()[0];
        }
        if (f instanceof ParameterizedType) {
            type = ((ParameterizedType) f).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new C16601a(gson, type, gson.getAdapter(new C17189a(type)), this.f43253b.mo40738a(aVar));
    }
}
