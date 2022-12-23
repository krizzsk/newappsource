package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p359ag.C13446c;
import p359ag.C13450g;
import p359ag.C13451h;
import p359ag.C13457n;
import p359ag.C13458o;
import p359ag.C13459p;
import p406cg.C13810b;
import p406cg.C13817g;
import p406cg.C13822k;
import p437dg.C16598a;
import p437dg.C16600b;
import p437dg.C16602c;
import p437dg.C16604d;
import p437dg.C16605e;
import p437dg.C16607f;
import p437dg.C16609g;
import p437dg.C16611h;
import p437dg.C16615j;
import p437dg.C16618k;
import p437dg.C16620l;
import p437dg.C16626o;
import p437dg.C16661q;
import p437dg.C16662r;
import p509gg.C17189a;
import p583jk.C17884p;
import p988j$.util.concurrent.ConcurrentHashMap;

public final class Gson {
    public static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    public static final boolean DEFAULT_ESCAPE_HTML = true;
    public static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    public static final boolean DEFAULT_LENIENT = false;
    public static final boolean DEFAULT_PRETTY_PRINT = false;
    public static final boolean DEFAULT_SERIALIZE_NULLS = false;
    public static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    private static final C17189a<?> NULL_KEY_SURROGATE = new C17189a<>(Object.class);
    public final List<C13459p> builderFactories;
    public final List<C13459p> builderHierarchyFactories;
    private final ThreadLocal<Map<C17189a<?>, C14550f<?>>> calls;
    public final boolean complexMapKeySerialization;
    private final C13810b constructorConstructor;
    public final String datePattern;
    public final int dateStyle;
    public final C13817g excluder;
    public final List<C13459p> factories;
    public final FieldNamingStrategy fieldNamingStrategy;
    public final boolean generateNonExecutableJson;
    public final boolean htmlSafe;
    public final Map<Type, C13446c<?>> instanceCreators;
    private final C16604d jsonAdapterFactory;
    public final boolean lenient;
    public final LongSerializationPolicy longSerializationPolicy;
    public final boolean prettyPrinting;
    public final boolean serializeNulls;
    public final boolean serializeSpecialFloatingPointValues;
    public final int timeStyle;
    private final Map<C17189a<?>, C13458o<?>> typeTokenCache;

    /* renamed from: com.google.gson.Gson$a */
    public class C14545a extends C13458o<Number> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            Number number = (Number) obj;
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            Gson.checkValidFloatingPoint(number.doubleValue());
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.Gson$b */
    public class C14546b extends C13458o<Number> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            Number number = (Number) obj;
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            Gson.checkValidFloatingPoint((double) number.floatValue());
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.Gson$c */
    public class C14547c extends C13458o<Number> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Long.valueOf(jsonReader.nextLong());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            Number number = (Number) obj;
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    /* renamed from: com.google.gson.Gson$d */
    public class C14548d extends C13458o<AtomicLong> {

        /* renamed from: a */
        public final /* synthetic */ C13458o f36705a;

        public C14548d(C13458o oVar) {
            this.f36705a = oVar;
        }

        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            return new AtomicLong(((Number) this.f36705a.mo40320a(jsonReader)).longValue());
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            this.f36705a.mo40321b(jsonWriter, Long.valueOf(((AtomicLong) obj).get()));
        }
    }

    /* renamed from: com.google.gson.Gson$e */
    public class C14549e extends C13458o<AtomicLongArray> {

        /* renamed from: a */
        public final /* synthetic */ C13458o f36706a;

        public C14549e(C13458o oVar) {
            this.f36706a = oVar;
        }

        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f36706a.mo40320a(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f36706a.mo40321b(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: com.google.gson.Gson$f */
    public static class C14550f<T> extends C13458o<T> {

        /* renamed from: a */
        public C13458o<T> f36707a;

        /* renamed from: a */
        public final T mo40320a(JsonReader jsonReader) throws IOException {
            C13458o<T> oVar = this.f36707a;
            if (oVar != null) {
                return oVar.mo40320a(jsonReader);
            }
            throw new IllegalStateException();
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, T t) throws IOException {
            C13458o<T> oVar = this.f36707a;
            if (oVar != null) {
                oVar.mo40321b(jsonWriter, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public Gson() {
        this(C13817g.f34003h, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Exception) e);
            } catch (IOException e2) {
                throw new JsonIOException((Exception) e2);
            }
        }
    }

    private static C13458o<AtomicLong> atomicLongAdapter(C13458o<Number> oVar) {
        return new C13457n(new C14548d(oVar));
    }

    private static C13458o<AtomicLongArray> atomicLongArrayAdapter(C13458o<Number> oVar) {
        return new C13457n(new C14549e(oVar));
    }

    public static void checkValidFloatingPoint(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private C13458o<Number> doubleAdapter(boolean z) {
        if (z) {
            return C16626o.f43331m;
        }
        return new C14545a();
    }

    private C13458o<Number> floatAdapter(boolean z) {
        if (z) {
            return C16626o.f43330l;
        }
        return new C14546b();
    }

    private static C13458o<Number> longAdapter(LongSerializationPolicy longSerializationPolicy2) {
        if (longSerializationPolicy2 == LongSerializationPolicy.DEFAULT) {
            return C16626o.f43329k;
        }
        return new C14547c();
    }

    public C13817g excluder() {
        return this.excluder;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
        return C17884p.m44355Z(cls).cast(fromJson(str, (Type) cls));
    }

    public <T> C13458o<T> getAdapter(Class<T> cls) {
        return getAdapter(new C17189a(cls));
    }

    public <T> C13458o<T> getDelegateAdapter(C13459p pVar, C17189a<T> aVar) {
        if (!this.factories.contains(pVar)) {
            pVar = this.jsonAdapterFactory;
        }
        boolean z = false;
        for (C13459p next : this.factories) {
            if (z) {
                C13458o<T> a = next.mo40360a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (next == pVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public boolean htmlSafe() {
        return this.htmlSafe;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.lenient);
        return jsonReader;
    }

    public JsonWriter newJsonWriter(Writer writer) throws IOException {
        if (this.generateNonExecutableJson) {
            writer.write(JSON_NON_EXECUTABLE_PREFIX);
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.prettyPrinting) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.serializeNulls);
        return jsonWriter;
    }

    public boolean serializeNulls() {
        return this.serializeNulls;
    }

    public void toJson(C13450g gVar, Appendable appendable) throws JsonIOException {
        try {
            toJson(gVar, newJsonWriter(appendable instanceof Writer ? (Writer) appendable : new C13822k.C13823a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Exception) e);
        }
    }

    public C13450g toJsonTree(Object obj) {
        if (obj == null) {
            return C13451h.f33305b;
        }
        return toJsonTree(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
    }

    public <T> T fromJson(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return fromJson((Reader) new StringReader(str), type);
    }

    public <T> C13458o<T> getAdapter(C17189a<T> aVar) {
        C13458o<T> oVar = this.typeTokenCache.get(aVar == null ? NULL_KEY_SURROGATE : aVar);
        if (oVar != null) {
            return oVar;
        }
        Map map = this.calls.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.calls.set(map);
            z = true;
        }
        C14550f fVar = (C14550f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            C14550f fVar2 = new C14550f();
            map.put(aVar, fVar2);
            for (C13459p a : this.factories) {
                C13458o<T> a2 = a.mo40360a(this, aVar);
                if (a2 != null) {
                    if (fVar2.f36707a == null) {
                        fVar2.f36707a = a2;
                        this.typeTokenCache.put(aVar, a2);
                        return a2;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.calls.remove();
            }
        }
    }

    public C13450g toJsonTree(Object obj, Type type) {
        C16607f fVar = new C16607f();
        toJson(obj, type, (JsonWriter) fVar);
        return fVar.mo49372e();
    }

    public <T> T fromJson(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        JsonReader newJsonReader = newJsonReader(reader);
        T fromJson = fromJson(newJsonReader, (Type) cls);
        assertFullConsumption(fromJson, newJsonReader);
        return C17884p.m44355Z(cls).cast(fromJson);
    }

    public void toJson(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            toJson(obj, type, newJsonWriter(appendable instanceof Writer ? (Writer) appendable : new C13822k.C13823a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Exception) e);
        }
    }

    public Gson(C13817g gVar, FieldNamingStrategy fieldNamingStrategy2, Map<Type, C13446c<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy2, String str, int i, int i2, List<C13459p> list, List<C13459p> list2, List<C13459p> list3) {
        boolean z8 = z2;
        boolean z9 = z7;
        this.calls = new ThreadLocal<>();
        this.typeTokenCache = new ConcurrentHashMap();
        this.excluder = gVar;
        this.fieldNamingStrategy = fieldNamingStrategy2;
        this.instanceCreators = map;
        C13810b bVar = new C13810b(map);
        this.constructorConstructor = bVar;
        this.serializeNulls = z;
        this.complexMapKeySerialization = z8;
        this.generateNonExecutableJson = z3;
        this.htmlSafe = z4;
        this.prettyPrinting = z5;
        this.lenient = z6;
        this.serializeSpecialFloatingPointValues = z9;
        this.longSerializationPolicy = longSerializationPolicy2;
        this.datePattern = str;
        this.dateStyle = i;
        this.timeStyle = i2;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C16626o.f43317D);
        arrayList.add(C16611h.f43276b);
        arrayList.add(gVar);
        arrayList.addAll(list3);
        arrayList.add(C16626o.f43336r);
        arrayList.add(C16626o.f43325g);
        arrayList.add(C16626o.f43322d);
        arrayList.add(C16626o.f43323e);
        arrayList.add(C16626o.f43324f);
        C13458o<Number> longAdapter = longAdapter(longSerializationPolicy2);
        arrayList.add(new C16662r(Long.TYPE, Long.class, longAdapter));
        arrayList.add(new C16662r(Double.TYPE, Double.class, doubleAdapter(z9)));
        arrayList.add(new C16662r(Float.TYPE, Float.class, floatAdapter(z9)));
        arrayList.add(C16626o.f43332n);
        arrayList.add(C16626o.f43326h);
        arrayList.add(C16626o.f43327i);
        arrayList.add(new C16661q(AtomicLong.class, atomicLongAdapter(longAdapter)));
        arrayList.add(new C16661q(AtomicLongArray.class, atomicLongArrayAdapter(longAdapter)));
        arrayList.add(C16626o.f43328j);
        arrayList.add(C16626o.f43333o);
        arrayList.add(C16626o.f43337s);
        arrayList.add(C16626o.f43338t);
        arrayList.add(new C16661q(BigDecimal.class, C16626o.f43334p));
        arrayList.add(new C16661q(BigInteger.class, C16626o.f43335q));
        arrayList.add(C16626o.f43339u);
        arrayList.add(C16626o.f43340v);
        arrayList.add(C16626o.f43342x);
        arrayList.add(C16626o.f43343y);
        arrayList.add(C16626o.f43315B);
        arrayList.add(C16626o.f43341w);
        arrayList.add(C16626o.f43320b);
        arrayList.add(C16602c.f43256b);
        arrayList.add(C16626o.f43314A);
        arrayList.add(C16620l.f43297b);
        arrayList.add(C16618k.f43295b);
        arrayList.add(C16626o.f43344z);
        arrayList.add(C16598a.f43250c);
        arrayList.add(C16626o.f43319a);
        arrayList.add(new C16600b(bVar));
        arrayList.add(new C16609g(bVar, z8));
        C16604d dVar = new C16604d(bVar);
        this.jsonAdapterFactory = dVar;
        arrayList.add(dVar);
        arrayList.add(C16626o.f43318E);
        arrayList.add(new C16615j(bVar, fieldNamingStrategy2, gVar, dVar));
        this.factories = Collections.unmodifiableList(arrayList);
    }

    public <T> T fromJson(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        JsonReader newJsonReader = newJsonReader(reader);
        T fromJson = fromJson(newJsonReader, type);
        assertFullConsumption(fromJson, newJsonReader);
        return fromJson;
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        C13458o adapter = getAdapter(new C17189a(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls2 = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            adapter.mo40321b(jsonWriter, obj);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls2);
        } catch (IOException e) {
            throw new JsonIOException((Exception) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls2);
            throw th;
        }
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) throws JsonIOException, JsonSyntaxException {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            jsonReader.peek();
            T a = getAdapter(new C17189a(type)).mo40320a(jsonReader);
            jsonReader.setLenient(isLenient);
            return a;
        } catch (EOFException e) {
            if (1 != 0) {
                jsonReader.setLenient(isLenient);
                return null;
            }
            throw new JsonSyntaxException((Exception) e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException((Exception) e2);
        } catch (IOException e3) {
            throw new JsonSyntaxException((Exception) e3);
        } catch (AssertionError e4) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e4.getMessage());
            assertionError.initCause(e4);
            throw assertionError;
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    public <T> T fromJson(C13450g gVar, Class<T> cls) throws JsonSyntaxException {
        return C17884p.m44355Z(cls).cast(fromJson(gVar, (Type) cls));
    }

    public String toJson(Object obj) {
        if (obj == null) {
            return toJson((C13450g) C13451h.f33305b);
        }
        return toJson(obj, (Type) obj.getClass());
    }

    public <T> T fromJson(C13450g gVar, Type type) throws JsonSyntaxException {
        if (gVar == null) {
            return null;
        }
        return fromJson((JsonReader) new C16605e(gVar), type);
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public void toJson(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            toJson(obj, (Type) obj.getClass(), appendable);
        } else {
            toJson((C13450g) C13451h.f33305b, appendable);
        }
    }

    public String toJson(C13450g gVar) {
        StringWriter stringWriter = new StringWriter();
        toJson(gVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public void toJson(C13450g gVar, JsonWriter jsonWriter) throws JsonIOException {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls2 = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            C16626o.f43316C.mo40321b(jsonWriter, gVar);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls2);
        } catch (IOException e) {
            throw new JsonIOException((Exception) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls2);
            throw th;
        }
    }
}
