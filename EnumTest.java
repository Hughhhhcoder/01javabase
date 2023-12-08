class Enum{
    enum EnumSize{s,m,l}
    EnumSize size;
}

public class EnumTest {
    public static void main(String[] args){
        Enum jucie = new Enum();
        jucie.size = Enum.EnumSize.s;
    }


}
