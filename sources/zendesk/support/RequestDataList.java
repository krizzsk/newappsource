package zendesk.support;

import ge0.C23408a;
import java.util.ArrayList;
import java.util.List;

final class RequestDataList {
    public final List<RequestData> requestDataList;

    public RequestDataList(List<RequestData> list) {
        ArrayList arrayList = new ArrayList(0);
        this.requestDataList = arrayList;
        if (C23408a.m57530e(list)) {
            arrayList.addAll(list);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RequestDataList.class != obj.getClass()) {
            return false;
        }
        return this.requestDataList.equals(((RequestDataList) obj).requestDataList);
    }

    public int hashCode() {
        return this.requestDataList.hashCode();
    }
}
