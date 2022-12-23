package com.google.gson;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p172m9.C5720b;
import p359ag.C13444a;
import p359ag.C13445b;
import p359ag.C13446c;
import p359ag.C13449f;
import p359ag.C13456m;
import p359ag.C13458o;
import p359ag.C13459p;
import p406cg.C13817g;
import p437dg.C16622m;
import p437dg.C16626o;
import p437dg.C16660p;
import p437dg.C16661q;
import p437dg.C16664t;
import p509gg.C17189a;

public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private C13817g excluder;
    private final List<C13459p> factories;
    private FieldNamingStrategy fieldNamingPolicy;
    private boolean generateNonExecutableJson;
    private final List<C13459p> hierarchyFactories;
    private final Map<Type, C13446c<?>> instanceCreators;
    private boolean lenient;
    private LongSerializationPolicy longSerializationPolicy;
    private boolean prettyPrinting;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private int timeStyle;

    public GsonBuilder() {
        this.excluder = C13817g.f34003h;
        this.longSerializationPolicy = LongSerializationPolicy.DEFAULT;
        this.fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
        this.instanceCreators = new HashMap();
        this.factories = new ArrayList();
        this.hierarchyFactories = new ArrayList();
        this.serializeNulls = false;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
    }

    private void addTypeAdaptersForDate(String str, int i, int i2, List<C13459p> list) {
        C13444a aVar;
        C13444a aVar2;
        C13444a aVar3;
        if (str != null && !"".equals(str.trim())) {
            aVar2 = new C13444a(Date.class, str);
            aVar = new C13444a(Timestamp.class, str);
            aVar3 = new C13444a(java.sql.Date.class, str);
        } else if (i != 2 && i2 != 2) {
            C13444a aVar4 = new C13444a(i, i2, Date.class);
            C13444a aVar5 = new C13444a(i, i2, Timestamp.class);
            C13444a aVar6 = new C13444a(i, i2, java.sql.Date.class);
            aVar2 = aVar4;
            aVar = aVar5;
            aVar3 = aVar6;
        } else {
            return;
        }
        C16661q qVar = C16626o.f43319a;
        list.add(new C16661q(Date.class, aVar2));
        list.add(new C16661q(Timestamp.class, aVar));
        list.add(new C16661q(java.sql.Date.class, aVar3));
    }

    public GsonBuilder addDeserializationExclusionStrategy(C13445b bVar) {
        this.excluder = this.excluder.mo40745j(bVar, false, true);
        return this;
    }

    public GsonBuilder addSerializationExclusionStrategy(C13445b bVar) {
        this.excluder = this.excluder.mo40745j(bVar, true, false);
        return this;
    }

    public Gson create() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.hierarchyFactories.size() + this.factories.size() + 3);
        arrayList2.addAll(this.factories);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.hierarchyFactories);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList2);
        return new Gson(this.excluder, this.fieldNamingPolicy, this.instanceCreators, this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.lenient, this.serializeSpecialFloatingPointValues, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, this.factories, this.hierarchyFactories, arrayList);
    }

    public GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public GsonBuilder disableInnerClassSerialization() {
        C13817g f = this.excluder.clone();
        f.f34006d = false;
        this.excluder = f;
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }

    public GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        C13817g f = this.excluder.clone();
        f.f34005c = 0;
        for (int i : iArr) {
            f.f34005c = i | f.f34005c;
        }
        this.excluder = f;
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        C13817g f = this.excluder.clone();
        f.f34007e = true;
        this.excluder = f;
        return this;
    }

    public GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public GsonBuilder registerTypeAdapter(Type type, Object obj) {
        boolean z;
        boolean z2 = obj instanceof C13456m;
        boolean z3 = false;
        if (z2 || (obj instanceof C13449f) || (obj instanceof C13446c) || (obj instanceof C13458o)) {
            z = true;
        } else {
            z = false;
        }
        C5720b.m14050a(z);
        if (obj instanceof C13446c) {
            this.instanceCreators.put(type, (C13446c) obj);
        }
        if (z2 || (obj instanceof C13449f)) {
            C17189a aVar = new C17189a(type);
            List<C13459p> list = this.factories;
            if (aVar.f44432b == aVar.f44431a) {
                z3 = true;
            }
            list.add(new C16622m.C16624b(obj, aVar, z3, (Class<?>) null));
        }
        if (obj instanceof C13458o) {
            List<C13459p> list2 = this.factories;
            C16661q qVar = C16626o.f43319a;
            list2.add(new C16660p(new C17189a(type), (C13458o) obj));
        }
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(C13459p pVar) {
        this.factories.add(pVar);
        return this;
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
        boolean z;
        boolean z2 = obj instanceof C13456m;
        if (z2 || (obj instanceof C13449f) || (obj instanceof C13458o)) {
            z = true;
        } else {
            z = false;
        }
        C5720b.m14050a(z);
        if ((obj instanceof C13449f) || z2) {
            this.hierarchyFactories.add(new C16622m.C16624b(obj, (C17189a<?>) null, false, cls));
        }
        if (obj instanceof C13458o) {
            List<C13459p> list = this.factories;
            C16661q qVar = C16626o.f43319a;
            list.add(new C16664t(cls, (C13458o) obj));
        }
        return this;
    }

    public GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public GsonBuilder setDateFormat(String str) {
        this.datePattern = str;
        return this;
    }

    public GsonBuilder setExclusionStrategies(C13445b... bVarArr) {
        for (C13445b j : bVarArr) {
            this.excluder = this.excluder.mo40745j(j, true, true);
        }
        return this;
    }

    public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldNamingPolicy2) {
        this.fieldNamingPolicy = fieldNamingPolicy2;
        return this;
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
        this.fieldNamingPolicy = fieldNamingStrategy;
        return this;
    }

    public GsonBuilder setLenient() {
        this.lenient = true;
        return this;
    }

    public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longSerializationPolicy2) {
        this.longSerializationPolicy = longSerializationPolicy2;
        return this;
    }

    public GsonBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    public GsonBuilder setVersion(double d) {
        C13817g f = this.excluder.clone();
        f.f34004b = d;
        this.excluder = f;
        return this;
    }

    public GsonBuilder setDateFormat(int i) {
        this.dateStyle = i;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder setDateFormat(int i, int i2) {
        this.dateStyle = i;
        this.timeStyle = i2;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder(Gson gson) {
        this.excluder = C13817g.f34003h;
        this.longSerializationPolicy = LongSerializationPolicy.DEFAULT;
        this.fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
        HashMap hashMap = new HashMap();
        this.instanceCreators = hashMap;
        ArrayList arrayList = new ArrayList();
        this.factories = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.hierarchyFactories = arrayList2;
        this.serializeNulls = false;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.excluder = gson.excluder;
        this.fieldNamingPolicy = gson.fieldNamingStrategy;
        hashMap.putAll(gson.instanceCreators);
        this.serializeNulls = gson.serializeNulls;
        this.complexMapKeySerialization = gson.complexMapKeySerialization;
        this.generateNonExecutableJson = gson.generateNonExecutableJson;
        this.escapeHtmlChars = gson.htmlSafe;
        this.prettyPrinting = gson.prettyPrinting;
        this.lenient = gson.lenient;
        this.serializeSpecialFloatingPointValues = gson.serializeSpecialFloatingPointValues;
        this.longSerializationPolicy = gson.longSerializationPolicy;
        this.datePattern = gson.datePattern;
        this.dateStyle = gson.dateStyle;
        this.timeStyle = gson.timeStyle;
        arrayList.addAll(gson.builderFactories);
        arrayList2.addAll(gson.builderHierarchyFactories);
    }
}
