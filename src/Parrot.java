public class Parrot {
    private   String nameParrot;
    private int ageParrot;
    private String colorParrot;
    public Parrot (){

    }
public Parrot (String nameParrot,int ageParrot,String colorParrot){
        this.nameParrot=nameParrot;
        this.ageParrot=ageParrot;
        this.colorParrot=colorParrot;
}
    public String getNameParrot() {
        return nameParrot;
    }

    public void setNameParrot(String nameParrot) {
        this.nameParrot = nameParrot;
    }

    public int getAgeParrot() {
        return ageParrot;
    }

    public void setAgeParrot(int ageParrot) {
        this.ageParrot = ageParrot;
    }

    public String getColorParrot() {
        return colorParrot;
    }

    public void setColorParrot(String colorParrot) {
        this.colorParrot = colorParrot;
    }
}
