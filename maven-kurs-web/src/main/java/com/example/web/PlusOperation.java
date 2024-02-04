package com.example.web;

import java.io.*;

public class PlusOperation implements Serializable {

    private int left;

    private int right;

    public PlusOperation() {
        // empty
    }

    public PlusOperation(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

}
