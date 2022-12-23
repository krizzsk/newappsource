package com.google.common.collect;

class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {

    /* renamed from: g */
    public static final EmptyImmutableListMultimap f36191g = new EmptyImmutableListMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableListMultimap() {
        super(RegularImmutableMap.f36246i, 0);
    }

    private Object readResolve() {
        return f36191g;
    }
}
