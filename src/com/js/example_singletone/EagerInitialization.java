package com.js.example_singletone;

public class EagerInitialization {

    //싱글톤 객체를 미리 만들어 놓는다.
    private static EagerInitialization eagerInitialization = new EagerInitialization();

    //다른 곳에서 객체를 생성할 수 없도록 접근제어자를 'private'로 한다.
    private EagerInitialization() {

    }

    //싱글톤 객체를 리턴 받는 함수
    public static EagerInitialization getEagerInitialization() {
        return eagerInitialization;
    }
}
