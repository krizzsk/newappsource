package yf0;

import cf0.C21140n;
import cf0.C21151y;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C23979b;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25067d;

/* renamed from: yf0.g */
public final class C25300g {

    /* renamed from: a */
    public static final LinkedHashSet f63598a = C21151y.m49444g0(C23979b.m59203d("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* renamed from: b */
    public static final LinkedHashSet f63599b;

    /* renamed from: c */
    public static final LinkedHashSet f63600c = C21151y.m49445h0(C21151y.m49445h0(C21151y.m49445h0(C21151y.m49445h0(C21151y.m49445h0(C21151y.m49445h0(C23979b.m59202c("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), C23979b.m59203d("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), C23979b.m59202c("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), C23979b.m59202c("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), C23979b.m59203d("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), C23979b.m59203d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), C23979b.m59203d("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));

    /* renamed from: d */
    public static final LinkedHashSet f63601d = C21151y.m49445h0(C21151y.m49445h0(C23979b.m59203d("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), C23979b.m59203d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), C23979b.m59203d("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));

    /* renamed from: e */
    public static final LinkedHashSet f63602e;

    /* renamed from: f */
    public static final LinkedHashSet f63603f;

    static {
        List<JvmPrimitiveType> E = C17875h.m44281E(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : E) {
            String f = jvmPrimitiveType.getWrapperFqName().mo61585f().mo61604f();
            C24362h.m61210e(f, "it.wrapperFqName.shortName().asString()");
            C21140n.m49439a0(C23979b.m59202c(f, jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()), linkedHashSet);
        }
        f63599b = C21151y.m49445h0(C21151y.m49445h0(C21151y.m49445h0(C21151y.m49445h0(C21151y.m49445h0(C21151y.m49445h0(linkedHashSet, C23979b.m59203d("List", "sort(Ljava/util/Comparator;)V")), C23979b.m59202c("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), C23979b.m59202c("Double", "isInfinite()Z", "isNaN()Z")), C23979b.m59202c("Float", "isInfinite()Z", "isNaN()Z")), C23979b.m59202c("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), C23979b.m59202c("CharSequence", "isEmpty()Z"));
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BYTE;
        List<JvmPrimitiveType> E2 = C17875h.m44281E(JvmPrimitiveType.BOOLEAN, jvmPrimitiveType2, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType2, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (JvmPrimitiveType wrapperFqName : E2) {
            String f2 = wrapperFqName.getWrapperFqName().mo61585f().mo61604f();
            C24362h.m61210e(f2, "it.wrapperFqName.shortName().asString()");
            String[] a = C23979b.m59200a("Ljava/lang/String;");
            C21140n.m49439a0(C23979b.m59202c(f2, (String[]) Arrays.copyOf(a, a.length)), linkedHashSet2);
        }
        String[] a2 = C23979b.m59200a("D");
        LinkedHashSet h0 = C21151y.m49445h0(linkedHashSet2, C23979b.m59202c("Float", (String[]) Arrays.copyOf(a2, a2.length)));
        String[] a3 = C23979b.m59200a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f63602e = C21151y.m49445h0(h0, C23979b.m59202c("String", (String[]) Arrays.copyOf(a3, a3.length)));
        String[] a4 = C23979b.m59200a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f63603f = C23979b.m59202c("Throwable", (String[]) Arrays.copyOf(a4, a4.length));
    }

    /* renamed from: a */
    public static boolean m63529a(C25067d dVar) {
        boolean z;
        if (C24362h.m61206a(dVar, C23872e.C23873a.f60369g)) {
            return true;
        }
        if (C23872e.C23873a.f60364b0.get(dVar) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }
}
