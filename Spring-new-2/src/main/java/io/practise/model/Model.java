package io.practise.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Details")
public class Model {

    @Id
    private String orderId;
    private String itemNo;
    private String name;


    public Model() {}

    public Model(String orderId,String itemNo,String name) {
        this.orderId=orderId;
        this.itemNo=itemNo;
        this.name=name;
    }

    public String  getorderId() {
        return orderId;
    }
    public void setorderId(String orderId) {
        this.orderId=orderId;
    }
    public String  getitemNo() {
        return itemNo;
    }
    public void setitemNo(String itemNo) {
        this.itemNo=itemNo;
    }
    public String  getname() {
        return name;
    }
    public void setname(String name) {
        this.name=name;
    }



}