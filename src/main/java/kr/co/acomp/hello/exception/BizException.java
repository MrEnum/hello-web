package kr.co.acomp.hello.exception;

public class BizException extends RuntimeException{
    public BizException(){
        super();
    }
    public BizException(Throwable t){
        super(t);
    }
    public BizException(String msg){
        super(msg);
    }
}
