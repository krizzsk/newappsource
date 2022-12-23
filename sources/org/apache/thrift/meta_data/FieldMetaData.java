package org.apache.thrift.meta_data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.TBase;
import ui0.C25085c;

public class FieldMetaData implements Serializable {

    /* renamed from: b */
    public static HashMap f62336b = new HashMap();
    public final String fieldName;
    public final byte requirementType;
    public final FieldValueMetaData valueMetaData;

    public FieldMetaData(String str, byte b, FieldValueMetaData fieldValueMetaData) {
        this.fieldName = str;
        this.requirementType = b;
        this.valueMetaData = fieldValueMetaData;
    }

    /* renamed from: a */
    public static void m61947a(Class<? extends TBase> cls, Map<? extends C25085c, FieldMetaData> map) {
        f62336b.put(cls, map);
    }
}
