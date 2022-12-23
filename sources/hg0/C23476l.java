package hg0;

import bf0.C21048b;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import ug0.C25066c;

/* renamed from: hg0.l */
public final class C23476l {

    /* renamed from: a */
    public static final C25066c f59258a;

    /* renamed from: b */
    public static final NullabilityAnnotationStatesImpl f59259b;

    /* renamed from: c */
    public static final C23477m f59260c;

    static {
        C25066c cVar = new C25066c("org.jspecify.nullness");
        f59258a = cVar;
        C25066c cVar2 = new C25066c("org.checkerframework.checker.nullness.compatqual");
        C25066c cVar3 = new C25066c("org.jetbrains.annotations");
        C23477m mVar = C23477m.f59261d;
        C25066c cVar4 = new C25066c("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        C21048b bVar = new C21048b(7, 0);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f59259b = new NullabilityAnnotationStatesImpl(C23826d.m58533X(new Pair(cVar3, mVar), new Pair(new C25066c("androidx.annotation"), mVar), new Pair(new C25066c("android.support.annotation"), mVar), new Pair(new C25066c("android.annotation"), mVar), new Pair(new C25066c("com.android.annotations"), mVar), new Pair(new C25066c("org.eclipse.jdt.annotation"), mVar), new Pair(new C25066c("org.checkerframework.checker.nullness.qual"), mVar), new Pair(cVar2, mVar), new Pair(new C25066c("javax.annotation"), mVar), new Pair(new C25066c("edu.umd.cs.findbugs.annotations"), mVar), new Pair(new C25066c("io.reactivex.annotations"), mVar), new Pair(cVar4, new C23477m(reportLevel, 4)), new Pair(new C25066c("androidx.annotation.RecentlyNonNull"), new C23477m(reportLevel, 4)), new Pair(new C25066c("lombok"), mVar), new Pair(cVar, new C23477m(reportLevel, bVar, reportLevel2)), new Pair(new C25066c("io.reactivex.rxjava3.annotations"), new C23477m(reportLevel, new C21048b(7, 0), reportLevel2))));
        f59260c = new C23477m(reportLevel, 4);
    }
}
