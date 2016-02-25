package entities;

/**
 * Created by Kirill on 22.02.2016.
 */
public enum  Status {

 AVAILABLE ("you can buy it now"),
 ABSENT ("sorry, but now you can't by this item"),
 EXPECTED("we wait for delivery, please look for this item soon");

    public String getDesc() {
        return desc;
    }

    private  final String desc;
    Status(String description) {
        desc = description;
    }


}
