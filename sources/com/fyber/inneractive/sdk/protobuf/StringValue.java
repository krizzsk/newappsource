package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class StringValue extends GeneratedMessageLite implements C3568r0 {
    /* access modifiers changed from: private */
    public static final StringValue DEFAULT_INSTANCE;
    private static volatile C3608y0<StringValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* renamed from: com.fyber.inneractive.sdk.protobuf.StringValue$a */
    public static final class C3470a extends GeneratedMessageLite.C3465a implements C3568r0 {
        public C3470a() {
            super(StringValue.DEFAULT_INSTANCE);
        }
    }

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        GeneratedMessageLite.registerDefaultInstance(StringValue.class, stringValue);
    }

    private StringValue() {
    }

    /* access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C3470a newBuilder() {
        return (C3470a) DEFAULT_INSTANCE.createBuilder();
    }

    /* renamed from: of */
    public static StringValue m8723of(String str) {
        C3470a newBuilder = newBuilder();
        newBuilder.mo14761c();
        ((StringValue) newBuilder.f12365b).setValue(str);
        return (StringValue) newBuilder.mo14758a();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StringValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) throws C3476a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C3608y0<StringValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* access modifiers changed from: private */
    public void setValueBytes(C3508i iVar) {
        iVar.getClass();
        C3473a.checkByteStringIsUtf8(iVar);
        this.value_ = iVar.mo14940i();
    }

    public final Object dynamicMethod(GeneratedMessageLite.C3469e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 3:
                return new StringValue();
            case 4:
                return new C3470a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3608y0<StringValue> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (StringValue.class) {
                        y0Var = PARSER;
                        if (y0Var == null) {
                            y0Var = new GeneratedMessageLite.C3466b<>(DEFAULT_INSTANCE);
                            PARSER = y0Var;
                        }
                    }
                }
                return y0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getValue() {
        return this.value_;
    }

    public C3508i getValueBytes() {
        return C3508i.m8970a(this.value_);
    }

    public static C3470a newBuilder(StringValue stringValue) {
        return (C3470a) DEFAULT_INSTANCE.createBuilder(stringValue);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, C3562q qVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, C3562q qVar) throws C3476a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    public static StringValue parseFrom(C3508i iVar) throws C3476a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    public static StringValue parseFrom(C3508i iVar, C3562q qVar) throws C3476a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
    }

    public static StringValue parseFrom(byte[] bArr) throws C3476a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StringValue parseFrom(byte[] bArr, C3562q qVar) throws C3476a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static StringValue parseFrom(InputStream inputStream) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, C3562q qVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static StringValue parseFrom(C3529j jVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static StringValue parseFrom(C3529j jVar, C3562q qVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }
}
