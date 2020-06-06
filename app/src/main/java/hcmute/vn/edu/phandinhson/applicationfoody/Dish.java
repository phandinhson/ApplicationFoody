package hcmute.vn.edu.phandinhson.applicationfoody;

public class Dish {
    private String Name;
    private String Category;
    private String Description;
    private String Address;
    private String Range;
    private int Thumbnail;
    public Dish(){

    }

    public Dish(String name, String category, String description, String address, String range, int thumbnail) {
        Name = name;
        Category = category;
        Description = description;
        Address = address;
        Range = range;
        Thumbnail = thumbnail;
    }
    public Dish(String name, String category, String address, String range, int thumbnail) {
        Name = name;
        Category = category;
        Address = address;
        Range = range;
        Thumbnail = thumbnail;
    }
    public Dish(String name, String category, String description,int thumbnail) {
        Name = name;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getRange() {
        return Range;
    }

    public void setRange(String range) {
        Range = range;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
