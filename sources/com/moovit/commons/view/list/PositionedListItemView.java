package com.moovit.commons.view.list;

public interface PositionedListItemView {

    public enum ListItemPositionType {
        FIRST(16842916),
        MIDDLE(16842917),
        LAST(16842918),
        SINGLE(16842915);
        
        private final int attribute;

        private ListItemPositionType(int i) {
            this.attribute = i;
        }

        public int getAttribute() {
            return this.attribute;
        }
    }

    void setPositionType(ListItemPositionType listItemPositionType);
}
