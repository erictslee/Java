package week04;

public class OurClass {
    private final boolean just=true; //상수

    public void thisMethodIsDangerous()throws OurBadException{

        if(just){
            throw new OurBadException();
        }
    }
}
