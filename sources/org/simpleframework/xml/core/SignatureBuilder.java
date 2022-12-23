package org.simpleframework.xml.core;

import ij0.C23619c1;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

public final class SignatureBuilder {

    /* renamed from: a */
    public final ParameterTable f62347a = new ParameterTable();

    /* renamed from: b */
    public final Constructor f62348b;

    public static class ParameterList extends ArrayList<C23619c1> {
        public ParameterList() {
        }

        public ParameterList(ParameterList parameterList) {
            super(parameterList);
        }
    }

    public static class ParameterTable extends ArrayList<ParameterList> {

        /* renamed from: b */
        public static final /* synthetic */ int f62349b = 0;

        /* renamed from: d */
        public final ParameterList get(int i) {
            for (int size = size(); size <= i; size++) {
                add(new ParameterList());
            }
            return (ParameterList) super.get(i);
        }
    }

    public SignatureBuilder(Constructor constructor) {
        this.f62348b = constructor;
    }

    /* renamed from: a */
    public final void mo61009a(ParameterTable parameterTable, ParameterList parameterList, int i) {
        ParameterList d = this.f62347a.get(i);
        int size = d.size();
        if (this.f62347a.size() - 1 > i) {
            for (int i2 = 0; i2 < size; i2++) {
                ParameterList parameterList2 = new ParameterList(parameterList);
                parameterList2.add((C23619c1) d.get(i2));
                mo61009a(parameterTable, parameterList2, i + 1);
            }
            return;
        }
        ParameterList d2 = this.f62347a.get(i);
        int size2 = parameterList.size();
        int size3 = d2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            for (int i4 = 0; i4 < size2; i4++) {
                parameterTable.get(i4).add((C23619c1) parameterList.get(i4));
            }
            parameterTable.get(i).add((C23619c1) d2.get(i3));
        }
    }
}
