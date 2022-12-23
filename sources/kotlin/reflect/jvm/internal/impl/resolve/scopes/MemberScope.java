package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import eh0.C23311g;
import eh0.C23312h;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import lf0.C24236l;
import ug0.C25069e;

public interface MemberScope extends C23312h {

    /* renamed from: a */
    public static final Companion f61214a = Companion.f61215a;

    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f61215a = new Companion();

        /* renamed from: b */
        public static final C24236l<C25069e, Boolean> f61216b = MemberScope$Companion$ALL_NAME_FILTER$1.f61218f;
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope$a */
    public static final class C24119a extends C23311g {

        /* renamed from: b */
        public static final C24119a f61217b = new C24119a();

        /* renamed from: a */
        public final Set<C25069e> mo53530a() {
            return EmptySet.f60175b;
        }

        /* renamed from: d */
        public final Set<C25069e> mo53533d() {
            return EmptySet.f60175b;
        }

        /* renamed from: f */
        public final Set<C25069e> mo53493f() {
            return EmptySet.f60175b;
        }
    }

    /* renamed from: a */
    Set<C25069e> mo53530a();

    /* renamed from: b */
    Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation);

    /* renamed from: c */
    Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation);

    /* renamed from: d */
    Set<C25069e> mo53533d();

    /* renamed from: f */
    Set<C25069e> mo53493f();
}
