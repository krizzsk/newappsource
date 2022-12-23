package p232r4;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: r4.i */
public final class C6249i<E> extends C6241a<E> {
    public final void start() {
        String str;
        List<String> list = this.f19697f;
        if (list == null) {
            str = "at least two options are expected whereas you have declared none";
        } else {
            int size = list.size();
            if (size < 2) {
                str = "at least two options are expected whereas you have declared only " + size + "as [" + list + "]";
            } else {
                Pattern.compile(list.get(0));
                String str2 = list.get(1);
                this.f19698g = true;
                return;
            }
        }
        mo21722a(str);
    }
}
