package HomeWork.HW_6;

public class notebook {
    private String name;
    private  Integer RAM;
    private  Integer HD;
    private  String OS;
    private  String color;

    public notebook (String name, Integer RAM, Integer HD, String OS, String color){
        this.name = name;
        this.RAM = RAM;
        this.HD = HD;
        this.OS = OS;
        this.color = color;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public Integer getRAM(){
        return RAM;
    }
    public Integer getHD(){
        return HD;
    }
    public String getOS(){
        return OS;
    }
    public String getColor(){
        return color;
    }

    private String getInfo(){
        return String.format("\n"+ name+ " - OS: " +OS +" \n RAM: %d GB \n HD: %d GB \n color: " + color, RAM, HD);
    }
@Override
    public String toString(){

        return getInfo();
}


}



