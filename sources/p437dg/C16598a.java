package p437dg;

import com.google.gson.Gson;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p359ag.C13458o;
import p359ag.C13459p;
import p509gg.C17189a;

/* renamed from: dg.a */
public final class C16598a<E> extends C13458o<Object> {

    /* renamed from: c */
    public static final C16599a f43250c = new C16599a();

    /* renamed from: a */
    public final Class<E> f43251a;

    /* renamed from: b */
    public final C16625n f43252b;

    /* renamed from: dg.a$a */
    public class C16599a implements C13459p {
        /* renamed from: a */
        public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
            Type type;
            Type type2 = aVar.f44432b;
            boolean z = type2 instanceof GenericArrayType;
            if (!z && (!(type2 instanceof Class) || !((Class) type2).isArray())) {
                return null;
            }
            if (z) {
                type = ((GenericArrayType) type2).getGenericComponentType();
            } else {
                type = ((Class) type2).getComponentType();
            }
            return new C16598a(gson, gson.getAdapter(new C17189a(type)), C$Gson$Types.m36266e(type));
        }
    }

    public C16598a(Gson gson, C13458o<E> oVar, Class<E> cls) {
        this.f43252b = new C16625n(gson, oVar, cls);
        this.f43251a = cls;
    }

    /* renamed from: a */
    public final Object mo40320a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f43252b.mo40320a(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f43251a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: b */
    public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f43252b.mo40321b(jsonWriter, Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
