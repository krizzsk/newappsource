package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3473a;
import com.fyber.inneractive.sdk.protobuf.C3473a.C3474a;
import com.fyber.inneractive.sdk.protobuf.C3508i;
import com.fyber.inneractive.sdk.protobuf.C3540l;
import com.fyber.inneractive.sdk.protobuf.C3564q0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.a */
public abstract class C3473a<MessageType extends C3473a<MessageType, BuilderType>, BuilderType extends C3474a<MessageType, BuilderType>> implements C3564q0 {
    public int memoizedHashCode = 0;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        C3474a.m8726a(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(C3508i iVar) throws IllegalArgumentException {
        if (!iVar.mo14934e()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        StringBuilder k = C13555b.m33972k("Serializing ");
        k.append(getClass().getName());
        k.append(" to a ");
        k.append(str);
        k.append(" threw an IOException (should never happen).");
        return k.toString();
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(C3498f1 f1Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int b = f1Var.mo14896b(this);
        setMemoizedSerializedSize(b);
        return b;
    }

    public C3547l1 newUninitializedMessageException() {
        return new C3547l1();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = C3540l.f12507b;
            C3540l.C3543c cVar = new C3540l.C3543c(bArr, 0, serializedSize);
            writeTo(cVar);
            if (cVar.mo15057a() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    public C3508i toByteString() {
        try {
            int serializedSize = getSerializedSize();
            C3508i iVar = C3508i.f12443b;
            byte[] bArr = new byte[serializedSize];
            C3540l a = C3540l.m9236a(bArr);
            writeTo(a);
            if (a.mo15057a() == 0) {
                return new C3508i.C3516h(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int c = C3540l.m9241c(serializedSize) + serializedSize;
        if (c > 4096) {
            c = 4096;
        }
        C3540l.C3545e eVar = new C3540l.C3545e(outputStream, c);
        eVar.mo15071g(serializedSize);
        writeTo(eVar);
        if (eVar.f12512f > 0) {
            eVar.mo15085b();
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = C3540l.f12507b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C3540l.C3545e eVar = new C3540l.C3545e(outputStream, serializedSize);
        writeTo(eVar);
        if (eVar.f12512f > 0) {
            eVar.mo15085b();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.a$a */
    public static abstract class C3474a<MessageType extends C3473a<MessageType, BuilderType>, BuilderType extends C3474a<MessageType, BuilderType>> implements C3564q0.C3565a {
        /* renamed from: a */
        public static <T> void m8726a(Iterable<T> iterable, List<? super T> list) {
            Charset charset = C3609z.f12640a;
            iterable.getClass();
            if (iterable instanceof C3497f0) {
                List<?> c = ((C3497f0) iterable).mo14823c();
                C3497f0 f0Var = (C3497f0) list;
                int size = list.size();
                for (Object next : c) {
                    if (next == null) {
                        StringBuilder k = C13555b.m33972k("Element at index ");
                        k.append(f0Var.size() - size);
                        k.append(" is null.");
                        String sb = k.toString();
                        int size2 = f0Var.size();
                        while (true) {
                            size2--;
                            if (size2 >= size) {
                                f0Var.remove(size2);
                            } else {
                                throw new NullPointerException(sb);
                            }
                        }
                    } else if (next instanceof C3508i) {
                        f0Var.mo14821a((C3508i) next);
                    } else {
                        f0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof C3621z0) {
                list.addAll((Collection) iterable);
            } else {
                if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                    ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
                }
                int size3 = list.size();
                for (T next2 : iterable) {
                    if (next2 == null) {
                        StringBuilder k2 = C13555b.m33972k("Element at index ");
                        k2.append(list.size() - size3);
                        k2.append(" is null.");
                        String sb2 = k2.toString();
                        int size4 = list.size();
                        while (true) {
                            size4--;
                            if (size4 >= size3) {
                                list.remove(size4);
                            } else {
                                throw new NullPointerException(sb2);
                            }
                        }
                    } else {
                        list.add(next2);
                    }
                }
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.protobuf.a$a$a */
        public static final class C3475a extends FilterInputStream {

            /* renamed from: a */
            public int f12385a;

            public C3475a(InputStream inputStream, int i) {
                super(inputStream);
                this.f12385a = i;
            }

            public int available() throws IOException {
                return Math.min(super.available(), this.f12385a);
            }

            public int read() throws IOException {
                if (this.f12385a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f12385a--;
                }
                return read;
            }

            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, (long) this.f12385a));
                if (skip >= 0) {
                    this.f12385a = (int) (((long) this.f12385a) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f12385a;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f12385a -= read;
                }
                return read;
            }
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        C3474a.m8726a(iterable, list);
    }
}
