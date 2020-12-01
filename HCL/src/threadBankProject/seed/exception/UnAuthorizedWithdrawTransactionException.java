package threadBankProject.seed.exception;

public class UnAuthorizedWithdrawTransactionException extends
Exception {
/**
* <h3>Description:<h3> This the no-arg constructor for the
* UnAuthorizedWithdrawTransactionException class.
*/
public UnAuthorizedWithdrawTransactionException() {
//calling the super class constructor
super("The user is unauthorized for the withdrawal");
}
}

