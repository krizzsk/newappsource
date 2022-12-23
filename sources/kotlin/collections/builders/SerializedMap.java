package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C23826d;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo59060d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "", "readResolve", "", "map", "Ljava/util/Map;", "<init>", "()V", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
final class SerializedMap implements Externalizable {
    private static final long serialVersionUID = 0;
    private Map<?, ?> map;

    public SerializedMap(Map<?, ?> map2) {
        C24362h.m61211f(map2, "map");
        this.map = map2;
    }

    private final Object readResolve() {
        return this.map;
    }

    public final void readExternal(ObjectInput objectInput) {
        C24362h.m61211f(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                MapBuilder mapBuilder = new MapBuilder(readInt);
                for (int i = 0; i < readInt; i++) {
                    mapBuilder.put(objectInput.readObject(), objectInput.readObject());
                }
                mapBuilder.mo59208h();
                this.map = mapBuilder;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException(C16759e.m42349e("Unsupported flags value: ", readByte));
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        C24362h.m61211f(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        for (Map.Entry next : this.map.entrySet()) {
            objectOutput.writeObject(next.getKey());
            objectOutput.writeObject(next.getValue());
        }
    }

    public SerializedMap() {
        this(C23826d.m58530U());
    }
}
