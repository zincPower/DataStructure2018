package com.zinc.datastructure2018;

import com.zinc.datastructure2018.test.ZincAnnotation;

/**
 * 子类
 *
 * @author syh
 */

public class Son extends Parent {

    private void A() {

    }

    @ZincAnnotation
    public void B() {

    }

    public void publicMethod() {
        System.out.println("publicMethod...");
    }

    void defaultMethod() {
        System.out.println("defaultMethod...");
    }

}  