package Models;

public class BeauticianM {
    private String area;
    private String typeOfService;

    public BeauticianM(String area, String typeOfService) {
        this.area = area;
        this.typeOfService = typeOfService;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }
}
