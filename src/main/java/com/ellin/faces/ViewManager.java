package com.ellin.faces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.springframework.stereotype.Component;



@Component("viewManager")
@ViewScoped
public class ViewManager   implements Serializable{
 
    ArrayList<Property>   cacheList = new ArrayList ();
    private Property item = new Property();
    public ViewManager() {
    }
     
    private boolean edit;
 
    public void add() {
        cacheList.add(item);
        item = new Property();
 
    }
 
    public void edit(Property item) {
        this.item = item;
        edit = true;
    }
 
    public void save() {
        item = new Property();  
        edit = false;
    }
 
    public void delete(Property item) {
        cacheList.remove(item);
    }
 
    public List getCacheList() {
        return cacheList;
    }
    public Property getItem() {
        return item;
    }
 
    public boolean isEdit() {
        return edit;
    }
}