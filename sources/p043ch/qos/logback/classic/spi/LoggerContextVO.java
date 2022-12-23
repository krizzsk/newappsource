package p043ch.qos.logback.classic.spi;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import p257t3.C6557a;

/* renamed from: ch.qos.logback.classic.spi.LoggerContextVO */
public class LoggerContextVO implements Serializable {
    private static final long serialVersionUID = 5488023392483144387L;
    public final long birthTime;
    public final String name;
    public final Map<String, String> propertyMap;

    public LoggerContextVO(C6557a aVar) {
        this.name = aVar.f15675c;
        this.propertyMap = new HashMap(aVar.f15677e);
        this.birthTime = aVar.f15674b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoggerContextVO)) {
            return false;
        }
        LoggerContextVO loggerContextVO = (LoggerContextVO) obj;
        if (this.birthTime != loggerContextVO.birthTime) {
            return false;
        }
        String str = this.name;
        if (str == null ? loggerContextVO.name != null : !str.equals(loggerContextVO.name)) {
            return false;
        }
        Map<String, String> map = this.propertyMap;
        Map<String, String> map2 = loggerContextVO.propertyMap;
        return map == null ? map2 == null : map.equals(map2);
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, String> map = this.propertyMap;
        if (map != null) {
            i = map.hashCode();
        }
        long j = this.birthTime;
        return ((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("LoggerContextVO{name='");
        C25541a.m63890u(k, this.name, '\'', ", propertyMap=");
        k.append(this.propertyMap);
        k.append(", birthTime=");
        k.append(this.birthTime);
        k.append('}');
        return k.toString();
    }
}
