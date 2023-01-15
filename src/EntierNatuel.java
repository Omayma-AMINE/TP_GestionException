public class EntierNatuel {
    private int val;
    public EntierNatuel(int nbre) {
        try{
            if(nbre<0) throw new NombreNegatifException(" ce n'est pas un nombre entier",nbre);
            this.val = nbre ;
        }catch(NombreNegatifException e){
            System.out.print(e.getMessage());
            System.out.println(" \t\tsa valeur :"+e.getVal());

        }


    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        try{
            if(val<0) throw new NombreNegatifException(" ce n'est pas un nombre entier ",val);
            this.val = val ;
        }catch(NombreNegatifException e){
            System.out.print(e.getMessage());
            System.out.println(" \t\tsa valeur :"+e.getVal());
        }
    }

    public void decrementer(){
        try{

            if(val<=0) throw new NombreNegatifException(" Vous ne pouvez pas décrémenter",val-1);
            val--;
        }catch(NombreNegatifException e){
            System.out.print(e.getMessage());
            System.out.println(" \t\tsa valeur : "+e.getVal());
        }
    }


}
