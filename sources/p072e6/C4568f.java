package p072e6;

/* renamed from: e6.f */
public final class C4568f implements C4563a<byte[]> {
    /* renamed from: a */
    public final int mo20068a() {
        return 1;
    }

    /* renamed from: b */
    public final int mo20069b(Object obj) {
        return ((byte[]) obj).length;
    }

    public final String getTag() {
        return "ByteArrayPool";
    }

    public final Object newArray(int i) {
        return new byte[i];
    }
}
