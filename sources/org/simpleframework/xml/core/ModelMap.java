package org.simpleframework.xml.core;

import ij0.C23675u;
import java.util.Iterator;
import java.util.LinkedHashMap;

class ModelMap extends LinkedHashMap<String, ModelList> implements Iterable<ModelList> {
    private final C23675u detail;

    public ModelMap(C23675u uVar) {
        this.detail = uVar;
    }

    /* renamed from: V1 */
    public final ModelMap mo61005V1() throws Exception {
        ModelMap modelMap = new ModelMap(this.detail);
        for (String str : keySet()) {
            ModelList modelList = (ModelList) get(str);
            if (modelList != null) {
                ModelList modelList2 = new ModelList();
                Iterator it = modelList.iterator();
                while (it.hasNext()) {
                    C24652j jVar = (C24652j) it.next();
                    int index = jVar.getIndex();
                    int size = modelList2.size();
                    for (int i = 0; i < index; i++) {
                        if (i >= size) {
                            modelList2.add((Object) null);
                        }
                        int i2 = index - 1;
                        if (i == i2) {
                            modelList2.set(i2, jVar);
                        }
                    }
                }
                modelList = modelList2;
            }
            if (!modelMap.containsKey(str)) {
                modelMap.put(str, modelList);
            } else {
                throw new PathException("Path with name '%s' is a duplicate in %s ", str, this.detail);
            }
        }
        return modelMap;
    }

    public final Iterator<ModelList> iterator() {
        return values().iterator();
    }
}
