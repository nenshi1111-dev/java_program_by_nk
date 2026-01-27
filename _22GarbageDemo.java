class _22GarbageDemo {

    // Override finalize method
    protected void finalize() {
        System.out.println("finalize() method called: Object is being destroyed");
    }

    public static void main(String[] args) {

        // Create objects
        _22GarbageDemo obj1 = new _22GarbageDemo();
        _22GarbageDemo obj2 = new _22GarbageDemo();

        // Make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Request garbage collection
        System.gc();

        System.out.println("End of main method");
    }
}
