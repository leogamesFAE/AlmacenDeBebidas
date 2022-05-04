package almdebeb.bor.aya.tsi.ama;

public class BebidaAzucarada extends Bebida{
    private float porcentajeAzucar;
    private boolean promocion;

    public BebidaAzucarada(String id, float cantLitros, float precio, String marcas, float porcentajeAzucar, boolean promocion) {
        super(id, cantLitros, precio, marcas);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
    }

    public float getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPorcentajeAzucar(float porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }
    
    @Override
    public float getPrecio(){
        if(isPromocion()){
            return(float) ((float) (super.getPrecio())*0.9);
        }
        else{
            return(float) (super.getPrecio());
        }
    }
    @Override
    public String toString() {
        return super.toString() + " Porcentaje de Azucar: " + porcentajeAzucar + " Promocion: " + promocion;
    }
}
