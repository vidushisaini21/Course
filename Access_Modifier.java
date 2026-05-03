public class Access_Modifier {
    public static void main(String[] args) {
        // Access modifiers in Java are used to set the accessibility of classes, methods, and other members.
        // The four access modifiers are:
        // 1. public: Accessible from anywhere
        // 2. protected: Accessible within the same package and subclasses
        // 3. default (no modifier): Accessible within the same package
        // 4. private: Accessible only within the same class

        // Example usage:
        MyClass obj = new MyClass();
        obj.publicMethod(); // Accessible
        obj.protectedMethod(); // Accessible
        obj.defaultMethod(); // Accessible
        // obj.privateMethod(); // Not accessible, will cause a compile-time error
    }
}
