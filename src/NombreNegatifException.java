public class NombreNegatifException extends Exception{
    private int valNegatif ;
    NombreNegatifException(String message,int val){
        super(message);
        valNegatif = val;
    }

    public int getVal() {
        return valNegatif;
    }
}
