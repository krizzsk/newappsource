package p437dg;

import com.appboy.support.StringUtils;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import p359ag.C13447d;
import p359ag.C13450g;
import p359ag.C13451h;
import p359ag.C13452i;
import p359ag.C13454k;
import p359ag.C13458o;
import p359ag.C13459p;
import p406cg.C13810b;
import p406cg.C13820i;
import p406cg.C13821j;
import p509gg.C17189a;

/* renamed from: dg.g */
public final class C16609g implements C13459p {

    /* renamed from: b */
    public final C13810b f43270b;

    /* renamed from: c */
    public final boolean f43271c;

    /* renamed from: dg.g$a */
    public final class C16610a<K, V> extends C13458o<Map<K, V>> {

        /* renamed from: a */
        public final C16625n f43272a;

        /* renamed from: b */
        public final C16625n f43273b;

        /* renamed from: c */
        public final C13821j<? extends Map<K, V>> f43274c;

        public C16610a(Gson gson, Type type, C13458o<K> oVar, Type type2, C13458o<V> oVar2, C13821j<? extends Map<K, V>> jVar) {
            this.f43272a = new C16625n(gson, oVar, type);
            this.f43273b = new C16625n(gson, oVar2, type2);
            this.f43274c = jVar;
        }

        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map map = (Map) this.f43274c.mo40737g();
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    Object a = this.f43272a.mo40320a(jsonReader);
                    if (map.put(a, this.f43273b.mo40320a(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + a);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    C13820i.INSTANCE.promoteNameToValue(jsonReader);
                    Object a2 = this.f43272a.mo40320a(jsonReader);
                    if (map.put(a2, this.f43273b.mo40320a(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + a2);
                    }
                }
                jsonReader.endObject();
            }
            return map;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            boolean z;
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.nullValue();
            } else if (!C16609g.this.f43271c) {
                jsonWriter.beginObject();
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.f43273b.mo40321b(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z2 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    C16625n nVar = this.f43272a;
                    Object key = entry2.getKey();
                    nVar.getClass();
                    try {
                        C16607f fVar = new C16607f();
                        nVar.mo40321b(fVar, key);
                        C13450g e = fVar.mo49372e();
                        arrayList.add(e);
                        arrayList2.add(entry2.getValue());
                        e.getClass();
                        if ((e instanceof C13447d) || (e instanceof C13452i)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 |= z;
                    } catch (IOException e2) {
                        throw new JsonIOException((Exception) e2);
                    }
                }
                if (z2) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    while (i < size) {
                        jsonWriter.beginArray();
                        C16626o.f43316C.mo40321b(jsonWriter, (C13450g) arrayList.get(i));
                        this.f43273b.mo40321b(jsonWriter, arrayList2.get(i));
                        jsonWriter.endArray();
                        i++;
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                while (i < size2) {
                    C13450g gVar = (C13450g) arrayList.get(i);
                    gVar.getClass();
                    if (gVar instanceof C13454k) {
                        C13454k x = gVar.mo40343x();
                        Serializable serializable = x.f33307b;
                        if (serializable instanceof Number) {
                            str = String.valueOf(x.mo40357C());
                        } else if (serializable instanceof Boolean) {
                            str = Boolean.toString(x.mo40333i());
                        } else if (serializable instanceof String) {
                            str = x.mo40326B();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (gVar instanceof C13451h) {
                        str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
                    } else {
                        throw new AssertionError();
                    }
                    jsonWriter.name(str);
                    this.f43273b.mo40321b(jsonWriter, arrayList2.get(i));
                    i++;
                }
                jsonWriter.endObject();
            }
        }
    }

    public C16609g(C13810b bVar, boolean z) {
        this.f43270b = bVar;
        this.f43271c = z;
    }

    /* renamed from: a */
    public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
        Type[] typeArr;
        C13458o oVar;
        Type type = aVar.f44432b;
        if (!Map.class.isAssignableFrom(aVar.f44431a)) {
            return null;
        }
        Class<?> e = C$Gson$Types.m36266e(type);
        Class<Object> cls = Object.class;
        Class<String> cls2 = String.class;
        if (type == Properties.class) {
            typeArr = new Type[]{cls2, cls2};
        } else {
            Type f = C$Gson$Types.m36267f(type, e, Map.class);
            typeArr = f instanceof ParameterizedType ? ((ParameterizedType) f).getActualTypeArguments() : new Type[]{cls, cls};
        }
        Type type2 = typeArr[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            oVar = C16626o.f43321c;
        } else {
            oVar = gson.getAdapter(new C17189a(type2));
        }
        return new C16610a(gson, typeArr[0], oVar, typeArr[1], gson.getAdapter(new C17189a(typeArr[1])), this.f43270b.mo40738a(aVar));
    }
}
