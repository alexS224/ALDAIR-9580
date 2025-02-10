public class Tele {
    private String color;
    private String marca;
    private String modelo;
    private int precio;
    private boolean estado;

    public Tele (String marca, String modelo){

    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color.equals("")?"Negro":color;

    }
    public String getMarca(){
        this.marca = marca.equals("")?"LG":marca;
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }


    


}
