package Model;

public class ListItem {

    // this class represents each item of our that we are going to show in our recycler view

    private String name;
    private String description;

    public ListItem(String name, String description)
    {
        this.name = name;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




}
