package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;

@Metadata(mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class AbstractCollection$toString$1 extends Lambda implements C24236l<E, CharSequence> {
    public final /* synthetic */ AbstractCollection<E> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractCollection$toString$1(AbstractCollection<? extends E> abstractCollection) {
        super(1);
        this.this$0 = abstractCollection;
    }

    public final Object invoke(Object obj) {
        return obj == this.this$0 ? "(this Collection)" : String.valueOf(obj);
    }
}
