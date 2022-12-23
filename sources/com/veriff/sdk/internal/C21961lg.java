package com.veriff.sdk.internal;

import cf0.C21134h;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C24177b;
import kotlin.sequences.SequencesKt__SequencesKt;
import lf0.C24236l;
import lf0.C24240p;
import mf0.C24362h;
import th0.C24996d;
import th0.C24999f;
import th0.C25003h;
import th0.C25012n;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068@X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo59060d2 = {"checkDigit", "", "getCheckDigit", "(Ljava/lang/String;)Ljava/lang/String;", "checkNum", "", "", "getCheckNum", "(C)I", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.lg */
public final class C21961lg {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "it", "", "invoke", "(C)I", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.lg$a */
    public static final class C21962a extends Lambda implements C24236l<Character, Integer> {

        /* renamed from: a */
        public static final C21962a f55476a = new C21962a();

        public C21962a() {
            super(1);
        }

        /* renamed from: a */
        public final int mo55787a(char c) {
            return C21961lg.m53585a(c);
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(mo55787a(((Character) obj).charValue()));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lth0/h;", "", "it", "invoke", "(Lth0/h;)Lth0/h;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.lg$b */
    public static final class C21963b extends Lambda implements C24236l<C25003h<? extends Integer>, C25003h<? extends Integer>> {

        /* renamed from: a */
        public static final C21963b f55477a = new C21963b();

        public C21963b() {
            super(1);
        }

        /* renamed from: a */
        public final C25003h<Integer> invoke(C25003h<Integer> hVar) {
            C24362h.m61211f(hVar, "it");
            return hVar;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "a", "b", "invoke", "(II)I", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.lg$c */
    public static final class C21964c extends Lambda implements C24240p<Integer, Integer, Integer> {

        /* renamed from: a */
        public static final C21964c f55478a = new C21964c();

        public C21964c() {
            super(2);
        }

        /* renamed from: a */
        public final int mo55789a(int i, int i2) {
            return i * i2;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(mo55789a(((Number) obj).intValue(), ((Number) obj2).intValue()));
        }
    }

    /* renamed from: a */
    public static final String m53586a(String str) {
        C25003h hVar;
        C24362h.m61211f(str, "$this$checkDigit");
        char[] charArray = str.toCharArray();
        C24362h.m61210e(charArray, "(this as java.lang.String).toCharArray()");
        if (charArray.length == 0) {
            hVar = C24996d.f63140a;
        } else {
            hVar = new C21134h(charArray);
        }
        C25012n j0 = C24177b.m60549j0(hVar, C21962a.f55476a);
        C24999f Y = SequencesKt__SequencesKt.m60538Y(SequencesKt__SequencesKt.m60539Z(SequencesKt__SequencesKt.m60541b0(7, 3, 1), C21963b.f55477a));
        C21964c cVar = C21964c.f55478a;
        C24362h.m61211f(cVar, "transform");
        Iterator it = j0.iterator();
        Iterator it2 = Y.iterator();
        int i = 0;
        while (true) {
            if (!(it.hasNext() && it2.hasNext())) {
                return String.valueOf(i % 10);
            }
            i += ((Number) cVar.invoke(it.next(), it2.next())).intValue();
        }
    }

    /* renamed from: a */
    public static final int m53585a(char c) {
        char upperCase = Character.toUpperCase(c);
        if ('0' <= upperCase && '9' >= upperCase) {
            return upperCase - '0';
        }
        if ('A' <= upperCase && 'Z' >= upperCase) {
            return (upperCase - 'A') + 10;
        }
        return 0;
    }
}
