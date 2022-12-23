package org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Iterator;

class ModelList extends ArrayList<C24652j> {
    public final boolean isEmpty() {
        Iterator it = iterator();
        while (it.hasNext()) {
            C24652j jVar = (C24652j) it.next();
            if (jVar != null && !jVar.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
