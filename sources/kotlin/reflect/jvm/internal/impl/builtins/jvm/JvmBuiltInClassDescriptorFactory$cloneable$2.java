package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import cg0.C21177j;
import cg0.C21181l;
import kh0.C23792h;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import lf0.C24225a;
import p583jk.C17875h;
import yf0.C25293a;

final class JvmBuiltInClassDescriptorFactory$cloneable$2 extends Lambda implements C24225a<C21181l> {
    public final /* synthetic */ C23792h $storageManager;
    public final /* synthetic */ C23882a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInClassDescriptorFactory$cloneable$2(C23882a aVar, C23792h hVar) {
        super(0);
        this.this$0 = aVar;
        this.$storageManager = hVar;
    }

    public final Object invoke() {
        C23882a aVar = this.this$0;
        C21181l lVar = new C21181l(aVar.f60413b.invoke(aVar.f60412a), C23882a.f60410g, Modality.ABSTRACT, ClassKind.INTERFACE, C17875h.m44280D(this.this$0.f60412a.mo59460m().mo59383f()), this.$storageManager);
        lVar.mo53508N0(new C25293a(this.$storageManager, lVar), EmptySet.f60175b, (C21177j) null);
        return lVar;
    }
}
