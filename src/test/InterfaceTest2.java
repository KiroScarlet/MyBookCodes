package test;

/**
 * @author KiroScarlet
 * @date 2019-08-31  -20:10
 * @title InterfaceTest1
 * @project MyBookCodes
 * @desc TODO
 */
public interface InterfaceTest2 extends InterfaceTest1{
    default void fly(){
        System.out.println("fly2");
    };
}
