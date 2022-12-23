package kotlin.reflect.jvm.internal.impl.descriptors;

import com.appboy.models.InAppMessageBase;
import mf0.C24362h;

public final class InvalidModuleException extends IllegalStateException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(String str) {
        super(str);
        C24362h.m61211f(str, InAppMessageBase.MESSAGE);
    }
}
