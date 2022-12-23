package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21420av;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.veriff.sdk.internal.at */
abstract class C21415at<C extends Collection<T>, T> extends C21420av<C> {

    /* renamed from: a */
    public static final C21420av.C21424a f53878a = new C21420av.C21424a() {
        /* renamed from: a */
        public C21420av<?> mo54207a(Type type, Set<? extends Annotation> set, C21450bi biVar) {
            Class<?> d = C21468bk.m51268d(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (d == List.class || d == Collection.class) {
                return C21415at.m51018a(type, biVar).mo54227d();
            }
            if (d == Set.class) {
                return C21415at.m51019b(type, biVar).mo54227d();
            }
            return null;
        }
    };

    /* renamed from: b */
    private final C21420av<T> f53879b;

    /* renamed from: a */
    public static <T> C21420av<Collection<T>> m51018a(Type type, C21450bi biVar) {
        return new C21415at<Collection<T>, T>(biVar.mo54335a(C21468bk.m51262a(type, (Class<?>) Collection.class))) {
            /* renamed from: a */
            public /* synthetic */ Object mo54204a(C21430ba baVar) throws IOException {
                return C21415at.super.mo54218b(baVar);
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo54205a(C21437bf bfVar, Object obj) throws IOException {
                C21415at.super.mo54217a(bfVar, (Collection) obj);
            }

            /* renamed from: a */
            public Collection<T> mo54216a() {
                return new ArrayList();
            }
        };
    }

    /* renamed from: b */
    public static <T> C21420av<Set<T>> m51019b(Type type, C21450bi biVar) {
        return new C21415at<Set<T>, T>(biVar.mo54335a(C21468bk.m51262a(type, (Class<?>) Collection.class))) {
            /* renamed from: a */
            public /* synthetic */ Object mo54204a(C21430ba baVar) throws IOException {
                return C21415at.super.mo54218b(baVar);
            }

            /* renamed from: b */
            public Set<T> mo54216a() {
                return new LinkedHashSet();
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo54205a(C21437bf bfVar, Object obj) throws IOException {
                C21415at.super.mo54217a(bfVar, (Set) obj);
            }
        };
    }

    /* renamed from: a */
    public abstract C mo54216a();

    public String toString() {
        return this.f53879b + ".collection()";
    }

    private C21415at(C21420av<T> avVar) {
        this.f53879b = avVar;
    }

    /* renamed from: a */
    public void mo54217a(C21437bf bfVar, C c) throws IOException {
        bfVar.mo54264a();
        for (Object a : c) {
            this.f53879b.mo54205a(bfVar, a);
        }
        bfVar.mo54271b();
    }

    /* renamed from: b */
    public C mo54218b(C21430ba baVar) throws IOException {
        C a = mo54216a();
        baVar.mo54244c();
        while (baVar.mo54248g()) {
            a.add(this.f53879b.mo54204a(baVar));
        }
        baVar.mo54245d();
        return a;
    }
}
