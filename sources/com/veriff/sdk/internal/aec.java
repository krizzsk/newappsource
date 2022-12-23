package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J*\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003*\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007J\u0014\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0007J\u001d\u0010\u000b\u001a\u00020\b*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0015\u001a\u00020\t*\u00020\u0014H\u0007J\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0014H\u0007J\f\u0010\u0019\u001a\u00020\u0018*\u00020\u0014H\u0007J$\u0010\u001e\u001a\u00020\u001b*\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0003J\f\u0010 \u001a\u00020\u001f*\u00020\u0014H\u0007J\u0014\u0010\"\u001a\u00020\b*\u00020\b2\u0006\u0010!\u001a\u00020\u0016H\u0007J\u001d\u0010\"\u001a\u00020\b*\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\"\u0010#R$\u0010*\u001a\b\u0012\u0004\u0012\u00020$0%*\u00020$8FX\u0004¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'¨\u0006-"}, mo59060d2 = {"Lse/ansman/kotshi/KotshiUtils;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "propertyName", "jsonName", "appendNullableError", "Lnb0/k;", "", "byte", "byteValue", "(Lnb0/k;Ljava/lang/Byte;)Lnb0/k;", "", "T", "Ljava/lang/Class;", "", "annotationArguments", "createJsonQualifierImplementation", "(Ljava/lang/Class;Ljava/util/Map;)Ljava/lang/annotation/Annotation;", "Lcom/squareup/moshi/JsonReader;", "nextByte", "", "nextChar", "", "nextFloat", "typeMessage", "", "min", "max", "nextIntInRange", "", "nextShort", "char", "value", "(Lnb0/k;Ljava/lang/Character;)Lnb0/k;", "Ljava/lang/reflect/Type;", "", "getTypeArgumentsOrFail", "(Ljava/lang/reflect/Type;)[Ljava/lang/reflect/Type;", "getTypeArgumentsOrFail$annotations", "(Ljava/lang/reflect/Type;)V", "typeArgumentsOrFail", "<init>", "()V", "api"}, mo59061k = 1, mo59062mv = {1, 4, 0})
public final class aec {
    static {
        new aec();
    }

    private aec() {
    }

    /* renamed from: a */
    public static /* synthetic */ StringBuilder m50903a(StringBuilder sb, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m50902a(sb, str, str2);
    }

    /* renamed from: a */
    public static final StringBuilder m50902a(StringBuilder sb, String str, String str2) {
        C24362h.m61211f(str, "propertyName");
        C24362h.m61211f(str2, "jsonName");
        if (sb == null) {
            sb = new StringBuilder("The following properties were null: ");
        } else {
            sb.append(", ");
        }
        sb.append(str);
        if (!C24362h.m61206a(str2, str)) {
            sb.append(" (JSON name ");
            sb.append(str2);
            sb.append(')');
        }
        return sb;
    }

    /* renamed from: a */
    public static final float m50901a(C21430ba baVar) {
        C24362h.m61211f(baVar, "$this$nextFloat");
        float m = (float) baVar.mo54254m();
        if (baVar.mo54240a() || !Float.isInfinite(m)) {
            return m;
        }
        throw new C21426ax("JSON forbids NaN and infinities: " + m + " at path " + baVar.mo54259r());
    }
}
