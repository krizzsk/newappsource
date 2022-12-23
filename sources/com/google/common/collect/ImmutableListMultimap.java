package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p584jl.C17885a;

public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements C14387c0<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.collect.ImmutableListMultimap$a */
    public static final class C14368a<K, V> extends ImmutableMultimap.C14373a<K, V> {
        /* renamed from: a */
        public final ImmutableListMultimap<K, V> mo43131a() {
            ImmutableMap<Object, Object> immutableMap;
            Set<Map.Entry> entrySet = this.f36219a.entrySet();
            if (entrySet.isEmpty()) {
                return EmptyImmutableListMultimap.f36191g;
            }
            Map.Entry[] entryArr = new Map.Entry[entrySet.size()];
            int i = 0;
            int i2 = 0;
            for (Map.Entry entry : entrySet) {
                Object key = entry.getKey();
                ImmutableList z = ImmutableList.m35691z((Collection) entry.getValue());
                if (!z.isEmpty()) {
                    int i3 = i + 1;
                    if (i3 > entryArr.length) {
                        entryArr = (Map.Entry[]) Arrays.copyOf(entryArr, ImmutableCollection.C14366a.m35679a(entryArr.length, i3));
                    }
                    C17885a.m44454p(key, z);
                    entryArr[i] = new AbstractMap.SimpleImmutableEntry(key, z);
                    i2 += z.size();
                    i = i3;
                }
            }
            if (i == 0) {
                immutableMap = RegularImmutableMap.f36246i;
            } else if (i != 1) {
                immutableMap = RegularImmutableMap.m35824l(i, entryArr);
            } else {
                Map.Entry entry2 = entryArr[0];
                Objects.requireNonNull(entry2);
                immutableMap = new SingletonImmutableBiMap<>(entry2.getKey(), entry2.getValue());
            }
            return new ImmutableListMultimap<>(immutableMap, i2);
        }

        /* renamed from: b */
        public final void mo43132b(String str, Object... objArr) {
            List asList = Arrays.asList(objArr);
            Collection collection = (Collection) this.f36219a.get(str);
            if (collection != null) {
                for (Object next : asList) {
                    C17885a.m44454p(str, next);
                    collection.add(next);
                }
                return;
            }
            Iterator it = asList.iterator();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    C17885a.m44454p(str, next2);
                    arrayList.add(next2);
                }
                this.f36219a.put(str, arrayList);
            }
        }
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    /* renamed from: i */
    public static <K, V> C14368a<K, V> m35701i() {
        return new C14368a<>();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        ImmutableMap<Object, Object> immutableMap;
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            Map.Entry[] entryArr = new Map.Entry[4];
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    int i4 = ImmutableList.f36196c;
                    ImmutableList.C14367a aVar = new ImmutableList.C14367a();
                    for (int i5 = 0; i5 < readInt2; i5++) {
                        aVar.mo43128b(objectInputStream.readObject());
                    }
                    ImmutableList c = aVar.mo43129c();
                    int i6 = i3 + 1;
                    if (i6 > entryArr.length) {
                        entryArr = (Map.Entry[]) Arrays.copyOf(entryArr, ImmutableCollection.C14366a.m35679a(entryArr.length, i6));
                    }
                    C17885a.m44454p(readObject, c);
                    entryArr[i3] = new AbstractMap.SimpleImmutableEntry(readObject, c);
                    i2 += readInt2;
                    i++;
                    i3++;
                } else {
                    throw new InvalidObjectException(C13715c.m34241g(31, "Invalid value count ", readInt2));
                }
            }
            if (i3 == 0) {
                immutableMap = RegularImmutableMap.f36246i;
            } else if (i3 != 1) {
                try {
                    immutableMap = RegularImmutableMap.m35824l(i3, entryArr);
                } catch (IllegalArgumentException e) {
                    throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
                }
            } else {
                Map.Entry entry = entryArr[0];
                Objects.requireNonNull(entry);
                immutableMap = new SingletonImmutableBiMap<>(entry.getKey(), entry.getValue());
            }
            C14425q0<ImmutableMultimap> q0Var = ImmutableMultimap.C14374b.f36220a;
            q0Var.getClass();
            try {
                q0Var.f36316a.set(this, immutableMap);
                C14425q0<ImmutableMultimap> q0Var2 = ImmutableMultimap.C14374b.f36221b;
                q0Var2.getClass();
                try {
                    q0Var2.f36316a.set(this, Integer.valueOf(i2));
                } catch (IllegalAccessException e2) {
                    throw new AssertionError(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        } else {
            throw new InvalidObjectException(C13715c.m34241g(29, "Invalid key count ", readInt));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(mo42964b().size());
        for (Map.Entry entry : mo42964b().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    /* renamed from: j */
    public final ImmutableList mo43130j(String str) {
        ImmutableList immutableList = (ImmutableList) this.f36216e.get(str);
        if (immutableList != null) {
            return immutableList;
        }
        int i = ImmutableList.f36196c;
        return RegularImmutableList.f36244e;
    }
}
