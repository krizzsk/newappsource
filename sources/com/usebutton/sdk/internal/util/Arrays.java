package com.usebutton.sdk.internal.util;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    public interface Emitter<In, Out> {
        void emit(In in, Sink<Out> sink);
    }

    public interface Sink<Out> {
        /* renamed from: on */
        void mo37733on(Out out);
    }

    public static <T> void addIfNotNull(List<T> list, T t) {
        if (t != null) {
            list.add(t);
        }
    }

    public static <In, Out> List<Out> flatten(List<In> list, Emitter<In, Out> emitter) {
        final ArrayList arrayList = new ArrayList();
        C123511 r1 = new Sink<Out>() {
            /* renamed from: on */
            public void mo37733on(Out out) {
                arrayList.add(out);
            }
        };
        for (In emit : list) {
            emitter.emit(emit, r1);
        }
        return arrayList;
    }

    public static boolean isEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static boolean isNotEmpty(Object[] objArr) {
        return !isEmpty(objArr);
    }

    public static String toString(Object[] objArr) {
        if (isEmpty(objArr)) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (Object obj : objArr) {
            sb.append(obj.toString());
            sb.append(", ");
        }
        sb.append(']');
        return sb.toString();
    }
}
