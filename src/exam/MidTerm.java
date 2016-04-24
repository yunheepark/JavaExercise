package exam;

/**
 * Created by jyheo on 2016-04-18.
 */

interface clickHandler {
    void onClick(BaseClass evt);
}

abstract class BaseClass {
    int state;
    BaseClass() {
        state = 0;
    }
    BaseClass(int arg) {
        this();
        state = arg;
    }
    public void method_A(int arg1) {
        state += arg1;
    }
    public int get_state() {
        return state;
    }
}

class WhatMethod extends BaseClass {
    WhatMethod(int arg) {
        super(arg);
        state += 1;
    }
    public void method_A(int arg1) {
        state += (arg1 * 2);
    }

    public void method_A(int arg1, int arg2) {
        state += (arg1 + arg2);
    }

    public void method_A(String str) {
        state += str.length(); // str의 길이
    }
}

class InheritedClass extends WhatMethod implements clickHandler {
    InheritedClass(int arg) {
        super(arg);
        state += 2;
    }
    public void method_A(int arg1) {
        state += (arg1 * 3);
    }

    public void onClick(BaseClass evt) {
        System.out.println("onClick() invoked! " + evt.get_state());
    }

}

public class MidTerm {
    static int mix_state(BaseClass A, BaseClass B) {
        return A.get_state() * 2 + B.get_state();
    }
    static void setOnClick(clickHandler handler) {
        handler.onClick(new WhatMethod(3));
    }

    static int sum(int[][] d2array) {
        // 인자로 받은 2차원 배열 d2array의 모든 원소 합을 구하는 함수임.
        int sum = 0;
        for (int i = 0; i < d2array.length; i++) {  // 빈칸에 들어갈 d2array의 필드(속성)는?
            for (int j = 0; j < d2array[i].length; j++) { // 빈칸에 들어갈 변수는?
                sum += d2array[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // BaseClass bc_err = new BaseClass();  왜 컴파일 에러가 나는가?
        BaseClass bc = new WhatMethod(2);
        WhatMethod wm = new InheritedClass(3);


        System.out.println(mix_state(bc, wm)); // 출력 결과와 이유?

        setOnClick((InheritedClass)wm); // 출력 결과?

        // bc.method_A(2, 3); 왜 컴파일 에러가 나는가?
        wm.method_A("23");
        wm.method_A(1, 2);
        bc.method_A(3);
        System.out.println(mix_state(bc, wm));        // 출력 결과와 이유?

        int s = sum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8}});
        System.out.println(s); // 출력: 36
    }
}
