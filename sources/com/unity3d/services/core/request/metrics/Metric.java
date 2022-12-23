package com.unity3d.services.core.request.metrics;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Metric {
    private static final String METRIC_NAME = "n";
    private static final String METRIC_TAGS = "t";
    private static final String METRIC_VALUE = "v";
    private final String name;
    private final Map<String, String> tags;
    private final Object value;

    public Metric(String str, Object obj, Map<String, String> map) {
        this.name = str;
        this.value = obj;
        this.tags = map;
    }

    public Map<String, Object> asMap() {
        HashMap hashMap = new HashMap();
        String str = this.name;
        if (str != null) {
            hashMap.put("n", str);
        }
        Object obj = this.value;
        if (obj != null) {
            hashMap.put(METRIC_VALUE, obj);
        }
        Map<String, String> map = this.tags;
        if (map != null) {
            hashMap.put("t", map);
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metric metric = (Metric) obj;
        if (!this.name.equals(metric.name) || !this.value.equals(metric.value) || !this.tags.equals(metric.tags)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.value, this.tags});
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Metric{name='");
        C25541a.m63890u(k, this.name, '\'', ", value='");
        k.append(this.value);
        k.append('\'');
        k.append(", tags=");
        k.append(this.tags);
        k.append('}');
        return k.toString();
    }
}
