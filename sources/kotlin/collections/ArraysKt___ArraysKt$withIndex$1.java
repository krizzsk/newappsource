package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p583jk.C17884p;

@Metadata(mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, mo59060d2 = {"<anonymous>", "", "T", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class ArraysKt___ArraysKt$withIndex$1 extends Lambda implements C24225a<Iterator<Object>> {
    public final /* synthetic */ Object[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$1(Object[] objArr) {
        super(0);
        this.$this_withIndex = objArr;
    }

    public final Object invoke() {
        return C17884p.m44341L(this.$this_withIndex);
    }
}
