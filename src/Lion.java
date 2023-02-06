public class Lion {
    private  String nameLion;
    private  int ageLion;
    private   String colorLion;

    public Lion (){

    }

    public Lion (String nameLion ,int ageLion,String colorLion){
        this.nameLion=nameLion;
        this.ageLion=ageLion;
        this.colorLion=colorLion;

    }

    public String getNameLion() {
        return nameLion;
    }

    public void setNameLion(String nameLion) {
        this.nameLion = nameLion;
    }

    public int getAgeLion() {
        return ageLion;
    }

    public void setAgeLion(int ageLion) {
        this.ageLion = ageLion;
    }

    public String getColorLion() {
        return colorLion;
    }

    public void setColorLion(String colorLion) {
        this.colorLion = colorLion;
    }
}
