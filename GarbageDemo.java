class GarbageDemo {

    // Override finalize method
    protected void finalize() {
        System.out.println("finalize() method called: Object is being destroyed");
    }

    public static void main(String[] args) {

        // Create objects
        GarbageDemo obj1 = new GarbageDemo();
        GarbageDemo obj2 = new GarbageDemo();

        // Make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Request garbage collection
        System.gc();

        System.out.println("End of main method");
    }
}
