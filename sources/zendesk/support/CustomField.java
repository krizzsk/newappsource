package zendesk.support;

import com.zendesk.logger.Logger;
import ge0.C23408a;
import java.util.ArrayList;
import java.util.List;

public class CustomField {
    private static final String LOG_TAG = "CustomField";

    /* renamed from: id */
    private Long f63718id;
    private Object value;

    public CustomField(Long l, Object obj) {
        this.f63718id = l;
        this.value = obj;
    }

    public Long getId() {
        return this.f63718id;
    }

    @Deprecated
    public String getValue() {
        Object obj = this.value;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        Logger.m57306e("Custom Field Value is of a type other than String or Boolean. Is this a multi-select field?", new Object[0]);
        return null;
    }

    public Boolean getValueBoolean() {
        Object obj = this.value;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        Logger.m57306e("Custom field value is not a boolean", new Object[0]);
        return null;
    }

    public List<String> getValueList() {
        Object obj = this.value;
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List<Object> list = (List) obj;
            if (C23408a.m57530e(list)) {
                ArrayList arrayList = new ArrayList(list.size());
                for (Object valueOf : list) {
                    arrayList.add(String.valueOf(valueOf));
                }
                return arrayList;
            }
        }
        Logger.m57306e("Custom field value is not a list.", new Object[0]);
        return null;
    }

    public Object getValueObject() {
        return this.value;
    }

    public String getValueString() {
        Object obj = this.value;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        Logger.m57306e("Custom field value is not a string", new Object[0]);
        return null;
    }
}
