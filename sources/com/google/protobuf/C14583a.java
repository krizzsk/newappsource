package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.C14583a;
import com.google.protobuf.C14583a.C14584a;
import com.google.protobuf.C14610k;
import com.google.protobuf.C14629t;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p911xg.C20498h;
import p911xg.C20509q;

/* renamed from: com.google.protobuf.a */
public abstract class C14583a<MessageType extends C14583a<MessageType, BuilderType>, BuilderType extends C14584a<MessageType, BuilderType>> implements C14629t {
    public int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a */
    public static abstract class C14584a<MessageType extends C14583a<MessageType, BuilderType>, BuilderType extends C14584a<MessageType, BuilderType>> implements C14629t.C14630a {
    }

    /* renamed from: b */
    public static void m36539b(List list, C14610k.C14615e eVar) {
        Charset charset = C14610k.f36861a;
        list.getClass();
        if (list instanceof C20498h) {
            List<?> w = ((C20498h) list).mo44112w();
            C20498h hVar = (C20498h) eVar;
            int size = eVar.size();
            for (Object next : w) {
                if (next == null) {
                    StringBuilder k = C13555b.m33972k("Element at index ");
                    k.append(hVar.size() - size);
                    k.append(" is null.");
                    String sb = k.toString();
                    int size2 = hVar.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            hVar.remove(size2);
                        } else {
                            throw new NullPointerException(sb);
                        }
                    }
                } else if (next instanceof ByteString) {
                    hVar.mo44109k((ByteString) next);
                } else {
                    hVar.add((String) next);
                }
            }
        } else if (list instanceof C20509q) {
            eVar.addAll(list);
        } else {
            if (eVar instanceof ArrayList) {
                ((ArrayList) eVar).ensureCapacity(list.size() + eVar.size());
            }
            int size3 = eVar.size();
            for (Object next2 : list) {
                if (next2 == null) {
                    StringBuilder k2 = C13555b.m33972k("Element at index ");
                    k2.append(eVar.size() - size3);
                    k2.append(" is null.");
                    String sb2 = k2.toString();
                    int size4 = eVar.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            eVar.remove(size4);
                        } else {
                            throw new NullPointerException(sb2);
                        }
                    }
                } else {
                    eVar.add(next2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo43943c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final String mo43985d(String str) {
        StringBuilder k = C13555b.m33972k("Serializing ");
        k.append(getClass().getName());
        k.append(" to a ");
        k.append(str);
        k.append(" threw an IOException (should never happen).");
        return k.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo43944e(int i) {
        throw new UnsupportedOperationException();
    }

    public final ByteString toByteString() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int serializedSize = generatedMessageLite.getSerializedSize();
            ByteString byteString = ByteString.f36798b;
            byte[] bArr = new byte[serializedSize];
            Logger logger = CodedOutputStream.f36799b;
            CodedOutputStream.C14570a aVar = new CodedOutputStream.C14570a(bArr, serializedSize);
            generatedMessageLite.mo43942a(aVar);
            if (aVar.mo43930U() == 0) {
                return new ByteString.LiteralByteString(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(mo43985d("ByteString"), e);
        }
    }
}
