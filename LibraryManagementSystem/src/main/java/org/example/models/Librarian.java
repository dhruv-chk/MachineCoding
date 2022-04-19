package org.example.models;

public class Librarian {
    boolean addBookItem;
    boolean blockMember;
    boolean unblockMember;

    public boolean isAddBookItem() {
        return addBookItem;
    }

    public void setAddBookItem(boolean addBookItem) {
        this.addBookItem = addBookItem;
    }

    public boolean isBlockMember() {
        return blockMember;
    }

    public void setBlockMember(boolean blockMember) {
        this.blockMember = blockMember;
    }

    public boolean isUnblockMember() {
        return unblockMember;
    }

    public void setUnblockMember(boolean unblockMember) {
        this.unblockMember = unblockMember;
    }
}
