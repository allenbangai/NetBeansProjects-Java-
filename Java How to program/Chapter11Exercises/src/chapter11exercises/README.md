# Exception Handling: A Deeper Look
As you know from Chapter 7, an exception is an indication of a problem that occurs during a program’s execution. Exception handling enables you to create applications that can resolve (or handle) exceptions. In many cases, handling an exception allows a program to continute executing as if no problem had been encountered. The features presented in this chapter help you write robust and fault-tolerant programs that can deal with problems and continue executing or terminate gracefully. Java exception handling is based in part on the work of Andrew Koenig and Bjarne Stroustrup.
First, we demonstrate basic exception-handling techniques by handling an exception that occurs when a method attempts to divide an integer by zero. Next, we introduce several classes at the top of Java’s exception-handling class hierarchy. As you’ll see, only classes that extend Throwable (package java.lang) directly or indirectly can be used with exception handling. We then show how to use chained exceptions—when you invoke a method that indicates an exception, you can throw another exception and chain the original one to the new one. This enables you to add application-specific information to the orginal exception. Next, we introduce preconditions and postconditions, which must be true when your methods are called and when they return, respectively. We then present assertions, which you can use at development time to help debug your code. We also discuss two exception-handling features that were introduced in Java SE 7—catching multiple exceptions with one catch handler and the new try-with-resources statement that automatically releases a resource after it’s used in the try block.
This chapter focuses on the exception-handling concepts and presents several mechanical examples that demonstrate various features. As you’ll see in later chapters, many Java APIs methods throw exceptions that we handle in our code. Figure 11.1 shows some of the exception types you’ve already seen and others you’ll learn about.

## Objective
■ Learn what exceptions are and how they’re handled. 
■ Learn when to use exception handling.
■ Use try blocks to delimit code in which exceptions might occur.
■ Use throw to indicate a problem.
■ Use catch blocks to specify exception handlers.
■ Use the finally block to release resources.
■ Understand the exception class hierarchy.
■ Create user-defined exceptions

## Outline
11.1 Introduction 
11.2 Example: Divide by Zero without Exception Handling 
11.3 Example: Handling ArithmeticExceptions and InputMismatchExceptions 
11.4 When to Use Exception Handling 
11.5 Java Exception Hierarchy 
11.6 finally Block 
11.7 Stack Unwinding and Obtaining Information from an Exception Object
11.8 Chained Exceptions 
11.9 Declaring New Exception Types 
11.10 Preconditions and Postconditions 
11.11 Assertions 
11.12 try-with-Resources: Automatic Resource Deallocation 
11.13 Wrap-Up
