package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;
import oh0.C24619h;
import oh0.C24620i;

public final class ArgumentList extends ArrayList<C24620i> implements C24619h {
    public ArgumentList(int i) {
        super(i);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C24620i)) {
            return false;
        }
        return super.contains((C24620i) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C24620i)) {
            return -1;
        }
        return super.indexOf((C24620i) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C24620i)) {
            return -1;
        }
        return super.lastIndexOf((C24620i) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof C24620i)) {
            return false;
        }
        return super.remove((C24620i) obj);
    }

    public final /* bridge */ int size() {
        return super.size();
    }
}
