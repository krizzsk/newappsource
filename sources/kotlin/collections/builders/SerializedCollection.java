package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.ObjectOutput;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo59060d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "", "readResolve", "", "collection", "Ljava/util/Collection;", "", "tag", "I", "<init>", "()V", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class SerializedCollection implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection<?> collection;
    private final int tag;

    public SerializedCollection() {
        this(0, EmptyList.f60173b);
    }

    private final Object readResolve() {
        return this.collection;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlin.collections.builders.ListBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.collections.builders.SetBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlin.collections.builders.ListBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlin.collections.builders.ListBuilder} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void readExternal(java.io.ObjectInput r6) {
        /*
            r5 = this;
            java.lang.String r0 = "input"
            mf0.C24362h.m61211f(r6, r0)
            byte r0 = r6.readByte()
            r1 = r0 & 1
            r2 = r0 & -2
            r3 = 46
            if (r2 != 0) goto L_0x0082
            int r0 = r6.readInt()
            if (r0 < 0) goto L_0x0068
            r2 = 0
            if (r1 == 0) goto L_0x0051
            r4 = 1
            if (r1 != r4) goto L_0x0037
            kotlin.collections.builders.SetBuilder r1 = new kotlin.collections.builders.SetBuilder
            kotlin.collections.builders.MapBuilder r3 = new kotlin.collections.builders.MapBuilder
            r3.<init>(r0)
            r1.<init>(r3)
        L_0x0027:
            if (r2 >= r0) goto L_0x0033
            java.lang.Object r3 = r6.readObject()
            r1.add(r3)
            int r2 = r2 + 1
            goto L_0x0027
        L_0x0033:
            r1.mo59249i()
            goto L_0x0065
        L_0x0037:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unsupported collection type tag: "
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0051:
            kotlin.collections.builders.ListBuilder r1 = new kotlin.collections.builders.ListBuilder
            r1.<init>(r0)
        L_0x0056:
            if (r2 >= r0) goto L_0x0062
            java.lang.Object r3 = r6.readObject()
            r1.add(r3)
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0062:
            r1.mo59192z()
        L_0x0065:
            r5.collection = r1
            return
        L_0x0068:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal size value: "
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        L_0x0082:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported flags value: "
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.SerializedCollection.readExternal(java.io.ObjectInput):void");
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        C24362h.m61211f(objectOutput, "output");
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        for (Object writeObject : this.collection) {
            objectOutput.writeObject(writeObject);
        }
    }

    public SerializedCollection(int i, Collection collection2) {
        C24362h.m61211f(collection2, "collection");
        this.collection = collection2;
        this.tag = i;
    }
}
