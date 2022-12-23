package com.google.common.collect;

import ce0.C21100e;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMapEntry;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import p583jk.C17884p;
import p584jl.C17885a;

public abstract class ImmutableBiMap<K, V> extends ImmutableBiMapFauxverideShim<K, V> {

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        public SerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        /* renamed from: a */
        public final ImmutableMap.C14370b mo43093a(int i) {
            return new C14365a(i);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableBiMap$a */
    public static final class C14365a<K, V> extends ImmutableMap.C14370b<K, V> {
        public C14365a(int i) {
            super(i);
        }

        /* renamed from: a */
        public final ImmutableMap mo43094a() {
            return mo43095b();
        }

        /* renamed from: c */
        public final void mo43096c(Object obj, Object obj2) {
            super.mo43096c(obj, obj2);
        }

        /* renamed from: d */
        public final ImmutableBiMap<K, V> mo43095b() {
            ImmutableMapEntry[] immutableMapEntryArr;
            ImmutableMapEntry immutableMapEntry;
            int i = this.f36208b;
            if (i == 0) {
                return RegularImmutableBiMap.f36237l;
            }
            if (i != 1) {
                Map.Entry<K, V>[] entryArr = this.f36207a;
                RegularImmutableBiMap<Object, Object> regularImmutableBiMap = RegularImmutableBiMap.f36237l;
                C17884p.m44374n(i, entryArr.length);
                int max = Math.max(i, 2);
                int highestOneBit = Integer.highestOneBit(max);
                if (max > ((int) (((double) highestOneBit) * 1.2d))) {
                    int i2 = highestOneBit << 1;
                    if (i2 > 0) {
                        highestOneBit = i2;
                    } else {
                        highestOneBit = 1073741824;
                    }
                }
                int i3 = highestOneBit - 1;
                ImmutableMapEntry[] immutableMapEntryArr2 = new ImmutableMapEntry[highestOneBit];
                ImmutableMapEntry[] immutableMapEntryArr3 = new ImmutableMapEntry[highestOneBit];
                if (i == entryArr.length) {
                    immutableMapEntryArr = entryArr;
                } else {
                    immutableMapEntryArr = new ImmutableMapEntry[i];
                }
                int i4 = 0;
                int i5 = 0;
                while (i4 < i) {
                    Map.Entry<K, V> entry = entryArr[i4];
                    Objects.requireNonNull(entry);
                    K key = entry.getKey();
                    V value = entry.getValue();
                    C17885a.m44454p(key, value);
                    int hashCode = key.hashCode();
                    int hashCode2 = value.hashCode();
                    int C0 = C21100e.m49301C0(hashCode) & i3;
                    int C02 = C21100e.m49301C0(hashCode2) & i3;
                    ImmutableMapEntry immutableMapEntry2 = immutableMapEntryArr2[C0];
                    ImmutableMap<Object, Object> immutableMap = RegularImmutableMap.f36246i;
                    ImmutableMapEntry immutableMapEntry3 = immutableMapEntry2;
                    int i6 = 0;
                    while (immutableMapEntry3 != null) {
                        int i7 = i3;
                        if (!key.equals(immutableMapEntry3.getKey())) {
                            i6++;
                            immutableMapEntry3 = immutableMapEntry3.mo43152a();
                            i3 = i7;
                        } else {
                            throw ImmutableMap.m35705a(entry, LinksConfiguration.KEY_KEY, immutableMapEntry3);
                        }
                    }
                    int i8 = i3;
                    ImmutableMapEntry immutableMapEntry4 = immutableMapEntryArr3[C02];
                    int i9 = i;
                    ImmutableMapEntry immutableMapEntry5 = immutableMapEntry4;
                    int i11 = 0;
                    while (immutableMapEntry5 != null) {
                        Map.Entry<K, V>[] entryArr2 = entryArr;
                        if (!value.equals(immutableMapEntry5.getValue())) {
                            i11++;
                            immutableMapEntry5 = immutableMapEntry5.mo43153b();
                            entryArr = entryArr2;
                        } else {
                            throw ImmutableMap.m35705a(entry, "value", immutableMapEntry5);
                        }
                    }
                    Map.Entry<K, V>[] entryArr3 = entryArr;
                    if (i6 > 8 || i11 > 8) {
                        return JdkBackedImmutableBiMap.m35783n(i9, entryArr3);
                    }
                    if (immutableMapEntry4 == null && immutableMapEntry2 == null) {
                        immutableMapEntry = RegularImmutableMap.m35827p(entry, key, value);
                    } else {
                        immutableMapEntry = new ImmutableMapEntry.NonTerminalImmutableBiMapEntry(key, value, immutableMapEntry2, immutableMapEntry4);
                    }
                    immutableMapEntryArr2[C0] = immutableMapEntry;
                    immutableMapEntryArr3[C02] = immutableMapEntry;
                    immutableMapEntryArr[i4] = immutableMapEntry;
                    i5 += hashCode ^ hashCode2;
                    i4++;
                    i3 = i8;
                    i = i9;
                    entryArr = entryArr3;
                }
                int i12 = i3;
                return new RegularImmutableBiMap(immutableMapEntryArr2, immutableMapEntryArr3, immutableMapEntryArr, i3, i5);
            }
            Map.Entry<K, V> entry2 = this.f36207a[0];
            Objects.requireNonNull(entry2);
            return new SingletonImmutableBiMap(entry2.getKey(), entry2.getValue());
        }
    }

    /* renamed from: e */
    public final ImmutableCollection mo43089e() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: k */
    public final ImmutableCollection mo43090k() {
        ImmutableBiMap l = mo43091l();
        ImmutableSet<K> immutableSet = l.f36204c;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> d = l.mo43138d();
        l.f36204c = d;
        return d;
    }

    /* renamed from: l */
    public abstract ImmutableBiMap<V, K> mo43091l();

    public final Collection values() {
        ImmutableBiMap l = mo43091l();
        ImmutableSet<K> immutableSet = l.f36204c;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> d = l.mo43138d();
        l.f36204c = d;
        return d;
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
