package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24225a;

public final class ScopesHolderForClass$scopeForOwnerModule$2 extends Lambda implements C24225a<T> {
    public final /* synthetic */ ScopesHolderForClass<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScopesHolderForClass$scopeForOwnerModule$2(ScopesHolderForClass<T> scopesHolderForClass) {
        super(0);
        this.this$0 = scopesHolderForClass;
    }

    public final Object invoke() {
        ScopesHolderForClass<T> scopesHolderForClass = this.this$0;
        return (MemberScope) scopesHolderForClass.f60433b.invoke(scopesHolderForClass.f60434c);
    }
}
