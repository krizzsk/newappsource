package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.impl.Config;

final class AutoValue_Config_Option<T> extends Config.Option<T> {

    /* renamed from: id */
    private final String f31058id;
    private final Object token;
    private final Class<T> valueClass;

    public AutoValue_Config_Option(String str, Class<T> cls, Object obj) {
        if (str != null) {
            this.f31058id = str;
            if (cls != null) {
                this.valueClass = cls;
                this.token = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Config.Option)) {
            return false;
        }
        Config.Option option = (Config.Option) obj;
        if (this.f31058id.equals(option.getId()) && this.valueClass.equals(option.getValueClass())) {
            Object obj2 = this.token;
            if (obj2 == null) {
                if (option.getToken() == null) {
                    return true;
                }
            } else if (obj2.equals(option.getToken())) {
                return true;
            }
        }
        return false;
    }

    public String getId() {
        return this.f31058id;
    }

    public Object getToken() {
        return this.token;
    }

    public Class<T> getValueClass() {
        return this.valueClass;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f31058id.hashCode() ^ 1000003) * 1000003) ^ this.valueClass.hashCode()) * 1000003;
        Object obj = this.token;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Option{id=");
        k.append(this.f31058id);
        k.append(", valueClass=");
        k.append(this.valueClass);
        k.append(", token=");
        return C16530d.m42015h(k, this.token, "}");
    }
}
