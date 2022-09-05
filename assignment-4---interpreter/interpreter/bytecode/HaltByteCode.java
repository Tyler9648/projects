package interpreter.bytecode;

import interpreter.VirtualMachine;

public class HaltByteCode extends ByteCode {
    private String byteCode;

    @Override
    public void init(String[] args){
        this.byteCode = args[0];
    }

    @Override
    public String getString(){
        return byteCode ;
    }

    @Override
    public String getByteCode(){
        return byteCode;
    }



    @Override
    public void execute(VirtualMachine vm){
        vm.haltProgram();
    }


}