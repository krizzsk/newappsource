package com.moovit.metroentities;

import ce0.C21100e;
import j30.C5374a;
import j30.C5375b;
import j30.C5376c;
import j30.C5377d;
import j30.C5378e;
import j30.C5379f;
import j30.C5380g;
import j30.C5381h;
import k30.C5466a;
import k30.C5467b;
import k30.C5468c;
import k30.C5469d;
import k30.C5470e;
import k30.C5471f;
import k30.C5472g;
import k30.C5473h;
import k30.C5474i;

public enum MetroEntityType {
    TRANSIT_LINE_GROUP(new C5472g(), new C5379f()),
    TRANSIT_LINE(new C5471f(), new C5379f()),
    TRANSIT_STOP(new C5474i(), new C5381h()),
    TRANSIT_PATTERN(new C5473h(), new C5380g()),
    BICYCLE_STOP(new C5467b(), new C5375b()),
    SHAPE(new C5469d(), new C5377d()),
    SHAPE_SEGMENT(new C5468c(), new C5376c()),
    TRANSIT_FREQUENCIES(new C5470e(), new C5378e());
    
    private final C5374a learner;
    private final C5466a resolver;

    private MetroEntityType(C5466a aVar, C5374a aVar2) {
        C21100e.m49373x(aVar, "resolver");
        this.resolver = aVar;
        C21100e.m49373x(aVar2, "learner");
        this.learner = aVar2;
    }

    public C5374a getLearner() {
        return this.learner;
    }

    public C5466a getResolver() {
        return this.resolver;
    }
}
