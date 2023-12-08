package com.jason;

import org.springframework.beans.factory.annotation.Autowired;

public class Main {
//    public static void main(String[] args) {
//
//        AtomicBooleanInitializer initializer = new AtomicBooleanInitializer();
//        System.out.println("Before: " + initializer.isInitialized);
//        initializer.initialize();
//        System.out.println("After First: " + initializer.isInitialized);
//        System.out.println("Count One: " + initializer.callCount);
//        initializer.initialize();
//        System.out.println("After Second: " + initializer.isInitialized);
//        System.out.println("Count Two: " + initializer.callCount);
//    }

//    public static void main(String[] args) {
//
//        SynchronizedInitializer synchronizedInitializer = new SynchronizedInitializer();
//
//        System.out.println("Before Initialize Count: " + synchronizedInitializer.callCount);
//        synchronizedInitializer.initialize();
//        System.out.println("After First Initialize Count: " + synchronizedInitializer.callCount);
//        synchronizedInitializer.initialize();
//        System.out.println("After Second Initialize Count: " + synchronizedInitializer.callCount);
//        synchronizedInitializer.initialize();
//        System.out.println("After Third Initialize Count: " + synchronizedInitializer.callCount);
//    }

//    public static void main(String[] args) {
//
//        System.out.println("First Initialize Count: " + StaticInitializer.CALL_COUNT);
//        System.out.println("Second Initialize Count: " + StaticInitializer.CALL_COUNT);
//    }

        public static void main(String[] args) {

        SynchronizedInitializer synchronizedInitializer = new SynchronizedInitializer();

        System.out.println("Before Initialize Count: " + synchronizedInitializer.callCount);
        synchronizedInitializer.initialize();
        System.out.println("After First Initialize Count: " + synchronizedInitializer.callCount);
        synchronizedInitializer.initialize();
        System.out.println("After Second Initialize Count: " + synchronizedInitializer.callCount);
        synchronizedInitializer.initialize();
        System.out.println("After Third Initialize Count: " + synchronizedInitializer.callCount);
    }

}