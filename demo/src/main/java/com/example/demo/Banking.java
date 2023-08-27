
package com.example.demo;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
public class Banking {

    private String Id;
    private String name;
    private String savings;

    public Banking(String id, String name, String savings) {
        Id = id;
        this.name = name;
        this.savings = savings;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSavings() {
        return savings;
    }

    public void setSavings(String savings) {
        this.savings = savings;
    }
}







