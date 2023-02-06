public class Shark {
     private String nameShark;
    private int ageShark;
    private  String colorShark;
    public Shark(){

    }
    public Shark (String nameShark,int ageShark,String colorShark ){
        this.nameShark=nameShark;
        this.ageShark=ageShark;
        this.colorShark=colorShark;
    }


    public String getNameShark() {
        return nameShark;
    }

    public void setNameShark(String nameShark) {
        this.nameShark = nameShark;
    }

    public int getAgeShark() {
        return ageShark;
    }

    public void setAgeShark(int ageShark) {
        this.ageShark = ageShark;
    }

    public String getColorShark() {
        return colorShark;
    }

    public void setColorShark(String colorShark) {
        this.colorShark = colorShark;
    }
}
